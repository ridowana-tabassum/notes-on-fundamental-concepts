console.log(" we are doing tut6!");

const myName = `Taba`;
const greeting = ` good night`;
console.log(greeting + " " + myName + `!`);

// here . means is equal to.
let html;
html =
  "<h1> Attaching HTML in JS code</h1> " +
  " <p> This is my JS coding practice </p> ";
html = html.concat(" this", " str2");
console.log(html);

console.log(html.length);

console.log(html.toLowerCase());

console.log(html.toUpperCase());

console.log(html);

console.log(html[1]);

console.log(html.indexOf("<")); // indicates in which placement that  char in!
console.log(html.lastIndexOf("<")); // indicates the whole area of the < from start to begin.
console.log(html.charAt(6));

console.log(html.endsWith("str22")); // false

console.log(html.includes("str2")); // it checks the condition

console.log(html.substring(0,10)); // it show the selected index 

console.log(html.slice(0,10)); // does the same work as substring

console.log(html.split('>')); // shows all the indexes part by part

console.log(html.replace('JS','ES6'));

let aniName='killua';
let family='Zoldyck';
let broName= 'Illumi';

let myHtml= `<h4> Hello this is ${aniName}.</h4>
            He wants to beats the shit out of ${broName}.<br>Both of 'em belong from ${family} family.
            `;
document.body.innerHTML=myHtml;            


