console.log("we are doing arrays today!! yeahhhhhhh!!");

const marks = [88, 32, 67, 89, 92, 36];
const drama = ["Nevertheless", "Hometown chachacha~", "True Beauty"];
const mixed = ["hxh", 82, [99, 88]];

const arr = new Array("hxh", 82, 99, 88);
console.log(arr);

console.log(drama[1]); // index

// arr has property and method

console.log(arr.length);
console.log(Array.isArray(drama)); // checks wheather there is any arr as the same name.

console.log(drama);

// we can change arrays value.
drama[0] = "cheesy in the trap";
console.log(drama);

// to save the new index value
let arrElement = drama[0];
console.log("new element added: " + arrElement);

// to find the location of index in array
let value = marks.indexOf(92);
console.log(value);

// mutating or modifying
marks.push(34); 
//push means it will add things at end
console.log(marks);

marks.unshift(21);
 // unshift will add things at the front part
console.log(marks);

marks.pop();
 // pop removes elements from last position
console.log(marks);

marks.shift(); // shift removes element from index 0
console.log(marks);