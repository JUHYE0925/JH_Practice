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
                  
-- 위의 쿼리문을 GROUP BY랑 LEFT JOIN을 사용해서 할 수 있는지 공부해보기
                  
SELECT
        A.EMP_NAME,
        A.JOB_CODE,
        A.DEPT_CODE,
        A.SALARY
   FROM employee A
   LEFT JOIN (SELECT
					 SALARY,
					 DEPT_CODE,
                     EMP_NAME
				FROM employee
                GROUP BY DEPT_CODE, SALARY) B ON (A.EMP_NAME = B.EMP_NAME);
               
               
                  
                  
SELECT
        A.EMP_NAME,
        A.JOB_CODE,
        A.DEPT_CODE,
        A.SALARY
   FROM employee A
  WHERE A.SALARY = (SELECT
                           MAX(SALARY)
 				      FROM employee
					 GROUP BY SALARY);

                  
SELECT
       A.CATEGORY_NAME,
       B.CATEGORY_NAME
  FROM TBL_CATEGORY A
  JOIN TBL_CATEGORY B ON A.REF_CATEGORY_CODE = B.CATEGORY_CODE  -- 같은 테이블 안에서 다른 컬럼으로도 JOIN가능
 WHERE A.REF_CATEGORY_CODE IS NOT NULL;

-- *** 여기서부터 난이도 극상

-- 6. 관리자에 해당하는 직원에 대한 정보와 관리자가 아닌 직원의 정보를 추출하여 조회하세요.
-- 사번, 이름, 부서명, 직급, '관리자' AS 구분 / '직원' AS 구분
-- HINT!! is not null, union(혹은 then, else), distinct

-- !!!!!!!!!!!오류!!!!!!!!!!! 라고 풀지 말라고 했는데 다른 팀이 푸는 거 보니 나도 풀어야할 듯;;;

-- 7. 자기 직급의 평균 급여를 받고 있는 직원의 사번, 이름, 직급코드, 급여를 조회하세요.
-- 단, 급여와 급여 평균은 만원단위로 계산하세요.
-- HINT!! round(컬럼명, -5)

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
-- SELECT
--        DEPT_CODE,
--        DEPT_TITLE,
--        AVG(SALARY) avgSalary
--   FROM employee

 

-- 10. 부서별 급여 합계가 전체 급여의 총 합의 20%보다 많은 부서의 부서명과, 부서별 급여 합계를 조회하세요.