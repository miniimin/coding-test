// 스코프
// 코드 어디에서나 접근 가능한 변수: 전역 스코프를 갖는 전역 변수
let a = 1;
function foo() {
    console.log(a);
}
console.log(a);


// 지역 스코프
function bar() {
    let b = 2;
}
// console.log(b); b에 접근 불가능

// 변수 뿐만 아니라 함수도 스코프를 가짐


// let, const: 블록 스코프
// var: 함수 스코프

if(true) {
    var c = 3;
}
console.log(c);

function foo2() {
    var d = 4;
}
// console.log(d); 접근 불가능
// 함수 스코프: 함수 내부에서 선언한 변수만 지역 스코프를 갖는다는 의미
// 대다수 프로그래밍에서 쓰이지 않으므로 var은 권장하지 않음


// 객체
let person = {
    name: "이정환", // 프로퍼티: key, value 쌍으로 이루어진 것
    age: 25,
    age: 30, // key가 중복이면 마지막 프로퍼티만 남음
    "like cat" : true // 복수의 단어로 이루어진 key를 쓰려면 따옴표로 묶어야 함
}

// 프로퍼티 접근
console.log(person.name);
console.log(person["name"]);

// 프로퍼티 추가
person.gender = "male";
person["nickname"] = "winterlood";

console.log(person);


// 프로퍼티가 유동적인 경우, 괄호표기법을 사용해서 작성
function addProperty(obj, key, value) {
    obj[key] = value; // obj.key = value (x)
}
let obj = {}
addProperty(obj, "a", 1);
addProperty(obj, "b", 2)
console.log(obj);

// 프로퍼티 수정 및 삭제 (점 표기법, 괄호 표기법 둘 다 가능)
obj.a = 3;
console.log(obj);
delete obj.a;
console.log(obj)

// const로 선언한 객체도 프로퍼티 수정, 삭제 가능
const constObj = {
    a: 1,
    b: "text"
};
constObj.a = "number";
console.log(constObj);

// in 연산자
let obj2 = {
    a: 1
};
let isPropertyExist = obj2.b !== undefined;
console.log(isPropertyExist);
// b는 존재하지 않으므로 undefined 반환. 그러므로 false
// 객체에서 해당 프로퍼티 존재여부 확인할 때 in 연산자 이용
console.log("a" in obj2);
console.log("b" in obj2);

// 메소드: 객체에서 값이 함수인 프로퍼티
obj2.sayHi = function() {
    console.log("안녕");
}
obj2.sayHi(); // "안녕" 출력



// 배열
// 순서가 있는 요소의 집합
// 배열의 값으로 어떤 자료형도 사용 가능
// 자바스크립트는 배열의 길이가 고정되어 있지 않음
// 객체는 특정 데이터에 접근할 때 key를 이용, 배열은 인덱스를 이용
let food = ["짜장면", "피자", "치킨"];
food.splice(2, 1);
console.log(food);
food.splice(1, 1, "스파게티");
console.log(food);
food[2] = "밥";
console.log(food);
food[2] = "빵";
console.log(food);