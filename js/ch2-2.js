// 자바스크립트에서 원시 자료형을 제외한 모든 자료형은 객체 자료형
// 배열, 함수 또한 객체 자료형
// -> 프로퍼티와 메서드 존재

const arr = [1, 2, 3];
console.log(arr.length);
console.log(arr.push(4));

function myFunction() {
    console.log("hi");
}
console.log(myFunction.name);
console.log(myFunction.toString());

// 원시 자료형: 값을 크기가 일정한 공간에 저장
// 객체 자료형: 값이 동적으로 늘어나므로, 일정한 크기의 공간에 저장 불가능
//             변수는 객체를 참조할 수 있는 주솟값을 저장함

let person = {
    name: "이정환"
};

let man = {
    name: "이정환"
};

console.log(person === man); // 내부적으로 값이 같지만 각각 별개의 객체
console.log(person.name === man.name);

// 배열 순회
let arr2 = ["피자", "짜장면", "치킨"];
for (let i = 0; i < arr2.length; i++) {
    console.log(arr2[i]);
}
for (let item of arr2) {
    console.log(item);
}

// 객체와 반복문
let person2 = {
    name: "이정환",
    age: 25,
    location: "경기도"
}
const keyArr = Object.keys(person2);
const valueArr = Object.values(person2);

for (let key of keyArr) {
    let value = person2[key];
    console.log(key, value);
}

for (let value of valueArr) {
    console.log(value);
}

for (let key in person2) {
    console.log(`${key} : ${person2[key]}`);
}
// for ... in 문: 오른쪽의 객체에서 프로퍼티의 key를 하나씩 순서대로 변수 key에 저장


// 배열의 구조분해 할당
let arr3 = [1, 2, 3];
let [one, two, three] = arr3;
console.log(one, two, three);
let [aa, bb, cc, dd] = arr3;
console.log(aa, bb, cc, dd);

// 객체의 구조 분해 할당
let { nick, age, location } = person2;
console.log(nick, age, location); // 객체 프포퍼티 key를 기준으로 할당, nick: undefined

// 함수의 매개변수가 객체일 때 구조 분해 할당
function func({name, age, location}) {
    console.log(name, age, location)
}
func(person2);

function func2({name: n, age: a, location: l}) {
    console.log(n, a, l)
}
func2(person2);