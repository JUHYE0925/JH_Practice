-- 1. 부서코드가 노옹철 사원과 같은 소속의 직원 명단 조회하세요.
SELECT
       EMP_NAME
  FROM employee A
  JOIN (SELECT 
               DEPT_ID
		  FROM department
		 WHERE DEPT_ID = "D9") B ON (A.DEPT_CODE = B.DEPT_ID);

-- 2. 전 직원의 평균 급여보다 많은 급여를 받고 있는 직원의 사번, 이름, 직급코드, 급여를 조회하세요.
SELECT
       EMP_ID,
       EMP_NAME,
       JOB_CODE,
       SALARY
  FROM employee 
 WHERE SALARY > (SELECT
                          AVG(SALARY)
				     FROM employee);

-- 3. 노옹철 사원의 급여보다 많이 받는 직원의 사번, 이름, 부서코드, 직급코드, 급여를 조회하세요.
SELECT
        EMP_ID,
        EMP_NAME,
        DEPT_CODE,
        JOB_CODE,
        SALARY
   FROM employee A
  WHERE A.SALARY > (SELECT
                         SALARY
 				   FROM employee 
 				  WHERE EMP_ID = '202');

-- 4. 가장 적은 급여를 받는 직원의 사번, 이름, 부서코드, 직급코드, 급여, 입사일을 조회하세요.
SELECT
       EMP_ID,
       EMP_NAME,
       DEPT_CODE,
       JOB_CODE,
       SALARY,
       HIRE_DATE
  FROM employee A
 WHERE SALARY = (SELECT
                        MIN(SALARY)
				   FROM employee);

-- *** 서브쿼리는 SELECT, FROM, WHERE, HAVING, ORDER BY절에도 사용할 수 있다.
-- 5. 부서별 최고 급여를 받는 직원의 이름, 직급코드, 부서코드, 급여 조회하세요.
SELECT
        A.EMP_NAME,
        A.JOB_CODE,
        A.DEPT_CODE,
        A.SALARY
   FROM employee A
  WHERE A.SALARY = (SELECT
                         MAX(SALARY)
 				   FROM employee
 				  WHERE DEPT_CODE = A.DEPT_CODE) OR
		A.SALARY = (SELECT
                         MAX(SALARY)
 				   FROM employee
 				  WHERE DEPT_CODE IS NULL);


-- *** 여기서부터 난이도 극상

-- 6. 관리자에 해당하는 직원에 대한 정보와 관리자가 아닌 직원의 정보를 추출하여 조회하세요.
-- 사번, 이름, 부서명, 직급, '관리자' AS 구분 / '직원' AS 구분
-- HINT!! is not null, union(혹은 then, else), distinct
START TRANSACTION;
SELECT
       A.EMP_ID AS 사번,
       A.EMP_NAME AS 이름,
       B.DEPT_TITLE AS 부서명,
       C.JOB_NAME AS 직급,
       A.MANAGER_ID AS 구분
  FROM employee A
LEFT JOIN department B ON A.DEPT_CODE = B.DEPT_ID
LEFT JOIN job C ON A.JOB_CODE = C.JOB_CODE
WHERE A.MANAGER_ID IS NULL
UNION
SELECT
       A.EMP_ID AS 사번,
       A.EMP_NAME AS 이름,
       B.DEPT_TITLE AS 부서명,
       C.JOB_NAME AS 직급,
       A.MANAGER_ID AS 구분
  FROM employee A
LEFT JOIN department B ON A.DEPT_CODE = B.DEPT_ID
LEFT JOIN job C ON A.JOB_CODE = C.JOB_CODE
WHERE A.MANAGER_ID IS NOT NULL
ORDER BY 구분 ASC;

UPDATE employee
SET MANAGER_ID = '직원'
WHERE MANAGER_ID IS NOT NULL;

UPDATE employee
SET MANAGER_ID = '관리자'
WHERE MANAGER_ID IS NULL;

ROLLBACK;


-- 7. 자기 직급의 평균 급여를 받고 있는 직원의 사번, 이름, 직급코드, 급여를 조회하세요.
-- 단, 급여와 급여 평균은 만원단위로 계산하세요.
-- HINT!! round(컬럼명, -5)

-- 애초에 평균이 안맞음.
SELECT
       JOB_CODE,
       ROUND(AVG(SALARY), -5)
  FROM employee
 GROUP BY JOB_CODE;

-- 선동일, 윤은해 나옴
SELECT
       EMP_ID,
       EMP_NAME,
       JOB_CODE,
	   SALARY
  FROM employee A
 WHERE SALARY = (SELECT
					    ROUND(AVG(SALARY), -5)
				   FROM employee
				  WHERE JOB_CODE = A.JOB_CODE);
                     
-- 선생님 답
SELECT 
       E.EMP_NAME
     , E.JOB_CODE
     , E.SALARY
  FROM EMPLOYEE E
 WHERE (E.JOB_CODE, E.SALARY) IN (SELECT E2.JOB_CODE
                                       , ROUND(AVG(E2.SALARY), -5)
                                    FROM EMPLOYEE E2
                                   GROUP BY E2.JOB_CODE
                                  );
 
 -- ANY 사용  ---> 선동일, 송은희, 윤은해, 전형돈 나옴
SELECT
       EMP_ID,
       EMP_NAME,
       JOB_CODE,
       SALARY
  FROM employee A
 WHERE SALARY = ANY(SELECT
						  ROUND(AVG(SALARY), -5)
				     FROM employee
                     GROUP BY JOB_CODE);

-- ANY 개념 이해를 위한 예제
WITH TMP_TB AS (
			SELECT 'J1' AS JOB_CODE, '이주형' AS NAME, 10 AS SALARY FROM DUAL
            UNION SELECT 'J1' AS JOB_CODE, '김지혜' AS NAME, 20 AS SALARY FROM DUAL
            UNION SELECT 'J1' AS JOB_CODE, '김주혜' AS NAME, 30 AS SALARY FROM DUAL
            UNION SELECT 'J2' AS JOB_CODE, '김선혜' AS NAME, 20 AS SALARY FROM DUAL
            UNION SELECT 'J2' AS JOB_CODE, '윤기남' AS NAME, 100 AS SALARY FROM DUAL
       )
SELECT *
  FROM TMP_TB A
 WHERE 1=1
    AND A.SALARY = ANY(SELECT AVG(A_2.SALARY) FROM TMP_TB A_2 GROUP BY A_2.JOB_CODE)
   -- AND A.SALARY IN (20, 60)
    AND A.SALARY = ANY(SELECT AVG(A_2.SALARY) FROM TMP_TB A_2 WHERE A.JOB_CODE = A_2.JOB_CODE)
;
 
-- 8. 퇴사한 여직원과 같은 부서, 같은 직급에 해당하는 직원의 이름, 직급코드, 부서코드, 입사일을 조회하세요.
SELECT
       EMP_NAME,
       JOB_CODE,
       DEPT_CODE,
       HIRE_DATE
  FROM employee
 WHERE DEPT_CODE = (SELECT
                           DEPT_CODE
					  FROM employee
				     WHERE EMP_NAME = '이태림') AND
	   JOB_CODE = (SELECT
                          JOB_CODE
				     FROM employee
					WHERE EMP_NAME = '이태림') AND
	  ENT_DATE IS NULL;

-- 9. 급여 평균 3위 안에 드는 부서의 부서 코드와 부서명, 평균급여를 조회하세요.
-- HINT!! limit
SELECT
       A.DEPT_CODE,
       B.DEPT_TITLE,
       AVG(A.SALARY)
  FROM employee A
  JOIN (SELECT
               DEPT_ID,
               DEPT_TITLE
		  FROM department) B ON (A.DEPT_CODE = B.DEPT_ID)
 GROUP BY DEPT_CODE LIMIT 3;
 
-- 10. 부서별 급여 합계가 전체 급여의 총 합의 20%보다 많은 부서의 부서명과, 부서별 급여 합계를 조회하세요.
-- 메인쿼리
SELECT
       DEPT_TITLE,
       SUM(SALARY)
  FROM employee A
  JOIN (SELECT
               DEPT_ID,
               DEPT_TITLE
		  FROM department) B ON (A.DEPT_CODE = B.DEPT_ID)
 GROUP BY DEPT_CODE
 HAVING SUM(SALARY) > (SELECT
                              SUM(SALARY) * 0.2
						 FROM employee);