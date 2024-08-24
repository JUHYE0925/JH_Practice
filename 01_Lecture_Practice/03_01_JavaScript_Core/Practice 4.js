function greet() {
    return "Hello";
};

console.log(greet());

greet = ( ) => {
    return "Hello";
}
console.log(greet());





function getInfo(name, age) {
    return `name : ${name}, age : ${age}`;
};
console.log(getInfo('김주혜', 27));

getInfo = (name, age) => {
    return `name : ${name}, age : ${age}.`;
}
console.log(getInfo('김주혜2',27 ))