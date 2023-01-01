console.log(` we are learning For, Which, Do which loops in JS!`);
// genaral loops : FOR, WHILE, DO-WHILE
let a = 5;
a += 2;
a++;
console.log(a);

for (let i = 1; i < 5; i++) {
  console.log(i);
}

let b = 1;
while (b < 10) {
  console.log(b + 1);
  b += 1;
  //console.log(b+1);
}

// let c=0;
// do {
//     if (c===3
//         {
//         c+=1;
//         continue;
//     }
//     console.log(c+1);
//     c+=1;
// }
// while (c<10);

let arr = [2, 12, 13, 4, 5];
for (let i = 0; i < arr.length; i++) {
  const element = arr[i];
  console.log(element);
}

arr.forEach(function (element, index, array) {
  console.log(element, index, array);
});
let obj = {
  name: "Yook",
  age: 25,
  type: "Data scientist",
};
for (let key in obj) {
  console.log(`The ${key} of object is ${obj[key]}`);
}
console.log(`done`);
