// primitive data type

// string
var name4 = `Taba`;
console.log("My name is " + name4);
console.log(`Data type is ` + typeof name4);

//number
let marks = 193120001;
console.log("Data type is " + typeof marks);

//boolean
let isCoder = true;
console.log("Data type is " + typeof isCoder);

//null
let nullVar = null;
console.log("Data type is " + typeof nullVar);

// reference data type.

//Arrays
let myArr = [123, 345, "hi", false];
console.log(`Data type is ` + typeof myArr);

//Object Literals
let stMarks = {
  killua: 98,
  leorio: 89,
  gon: 99,
  kurapika: 100,
};
console.table(stMarks);
console.log(typeof stMarks);

function findName() {}
console.log(typeof findName);
