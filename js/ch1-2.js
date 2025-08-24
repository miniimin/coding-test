function greeting() {
    console.log("안녕하세요!");
}

console.log("함수 시작 전");
greeting();
console.log("함수 종료");


function getArea(width, height) {
    let area = width * height;
    return area;
    // return 뒤에 코드는 실행되지 않음
    console.log("이 코드는 실행되지 않음");
}

let result = getArea(5, 10);
console.log(result); // 50

// 중첩함수
function greeting2() {

    let name = "이정환";
    greetingWithName(name);
    function greetingWithName(name) {
        console.log(`hello! ${name}`);
    }
    // 호이스팅 현상: 함수 선언문은 함수가 호출되기 전에 선언된 것처럼 동작
    // greetingWithName(name); // 함수 선언문은 호이스팅 현상으로 인해 호출 가능
}
greeting2();


// 함수 표현식
// 함수를 형성하고 변수에 값으로 저장
// 함수 표현식은 호이스팅 현상이 발생하지 않음

// hello(); // TypeError: hello is not a function
let hello = function() {
    console.log("hello");
}
hello(); // hello


// 콜백 함수
// 함수를 다른 함수의인수로 전달하는 것
function repeat(count) {
    for(let idx = 0; idx < count; idx++) {
        console.log(idx + 1);
    }
}
repeat(5);

function repeatDouble(count) {
    for(let idx = 0; idx < count; idx++) {
        console.log((idx + 1) * 2);
    }
}
repeatDouble(5);

// 동일한 기능을 가져도 특정 부분이 달라 중복 코드 발생
// 콜백함수 적용
function repeat2(count, callBack) {
    for (let idx = 0; idx < count; idx++) {
        callBack(idx + 1);
    }
}

function origin(num) {
    console.log(num);
}

function double(num) {
    console.log(num * 2);
}

repeat2(5, origin);
repeat2(5, double);

const triple = function(num) {
    console.log(num * 3);
}

repeat2(5, triple);

// 화살표 함수
// let funcA = (매개변수) => 반환값;
// let funcA = function(매개변수) { return 반환값; }; 동일

let greeting3 = (name) => {
    let greetingText = `hello ${name}`;
    return greetingText;
}
console.log(greeting3("이정환"));

let isConfirm = true;
function confirm(onYes, onNo) {
    if(isConfirm) onYes();
    else onNo();
}

confirm(
    () => console.log("승인"),
    () => console.log("거부")
);

// 함수 자체를 전달하고, 실행은 콜백을 실행하는 위치에서 ()로 실행
