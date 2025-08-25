// falsy 값: undefined, null, 0n, 0, -0, NaN, ""
let varA;
if (varA) {
    console.log("값이 있음")
} else {
    console.log("값이 없음")
    console.log(typeof varA);
}

const num = -0;
if (num) {
    console.log("양수이거나 음수입니다.");
} else {
    console.log("0이거나 -0이거나 NaN입니다.");
}

const str = "";
if (str) {
    console.log("공백 아님");
} else {
    console.log("공백임");
}


// 단락 평가
console.log("hello" && "world"); 
// 결과: "world"

console.log("" && "world");
// 결과: ""   (빈 문자열은 falsy니까 왼쪽값 반환)

console.log(123 && "abc");
// 결과: "abc"  (123은 truthy → 오른쪽 반환)

console.log(0 && "abc");
// 결과: 0   (0은 falsy → 왼쪽 반환)

// 불리언 컨텍스트 → 무조건 true/false로 변환돼서 조건식 평가에 쓰임.
// 값 반환 컨텍스트 → && 연산 결과로 **실제 값(왼쪽 or 오른쪽)**이 나옴.

// OR 단락평가: truthy, falsy
// null 병합 연산자: null 이나 undefined가 아닌 확정된 피연산자를 찾음

// 단락 평가 -> 무조건 모든 피연산자의 값을 계산하는 것이 아님. 조건이 맞으면 앞의 것만

const varB = 0;
const varC = "이정환";

const resultA = varB || varC;
const resultB = varB ?? varC;

console.log(resultA);
console.log(resultB);

