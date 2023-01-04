// type conversion and coercion
console.log("starting tut5");
let myVar;
//myVar=22;
//console.log(myVar);
//console.log(myVar,(typeof myVar));
myVar = String(44);
console.log(myVar, typeof myVar);

let boolVar = String(true);
console.log(typeof boolVar, boolVar);

// let date= new Date();
// console.log(date,(typeof date));
let date = String(new Date());
console.log(date, typeof date);

let arr = String([1, 2, 3, 4, 5]);
console.table(arr, typeof arr);
console.log(arr.length);

// shortcut of making variables into strings!
let i=10;
console.log(i.toString());
// string is a function

// now we are converting variables to numbers
let stri=`1234`;
console.log(stri, (typeof stri));

let striTwo= Number("2321");
striTwo= Number(false);
console.log(striTwo,(typeof striTwo));

let num= parseInt('123.222');
num=parseFloat(`123.2145`);

console.log(num.toFixed(2),(typeof num));

let num1="123";
let num2= 123;
console.log(num1+num2);
//output will be 123123

let numA=Number("111");
let numB= 111;
console.log(numA+numB);
// now output will be 222

