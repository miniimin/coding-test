let emptyVar = null;
console.log(emptyVar);
// js는 null을 독립된 자료형으로 구분
// C, Java는 변수를 생성하고 아무 값도 할당하지 않으면 null, js, ts는 undefined

let x;
console.log(x); // undefined

let str = "2025 화이팅";
let num = parseInt(str);
console.log(num); // 2025

let varA;
let varB = null;
let varC = true;

let strA = String(varA);
let strB = String(varB);
let strC = String(varC);

console.log(varA, typeof varA); // undefined undefined
console.log(varB, typeof varB); // null object  // js의 역사적 오류
console.log(varC, typeof varC); // true boolean

console.log(strA, typeof strA); // undefined string
console.log(strB, typeof strB); // null string
console.log(strC, typeof strC); // true string

let a = 1;
console.log(--a);
console.log(a--);

// null 병합 연산자: 값이 확정된 변수를 찾을 때 사용
let name;
let nickname = "winterlood";

let user = name ?? nickname;
console.log(user);


let name2 = "이정환";
let nickname2 = "winterlood";

let user2 = name2 ?? nickname2;
console.log(user2);

// 변수는 값을 저장할 때마다 자료형이 동적으로 변함: 동적 타이핑
// typeof 연산자를 활용하여 변수의 자료형을 확인 가능
let varD = 123;
console.log(varD, typeof varD); // 123 number

varD = "문자열";
console.log(varD, typeof varD); // 문자열 string

// 삼항 조건 연산자
// 조건식에 따라 다른 명령을 수행할 때 사용
// 혹은 조건식에 따라 다른 값을 반환할 때 사용
let age = 25;
let isAdult = age >= 20 ? "성인" : "미성년자";
console.log(isAdult); // 성인

// 조건문: if, switch
// 반복문: for(break, continue)
