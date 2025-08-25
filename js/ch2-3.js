// 스프레드 연산자
let arrA = [1, 2, 3];
let arrB = [...arrA, 3, 5, 6];
console.log(arrB);
let arrC = [arrA, 3, 4, 5];
console.log(arrC);

let objA = {
    a:1,
    b:2
}

let objB = {
    ...objA,
    c: 3,
    d: 4
}

console.log(objB);

function func(a, b, c) {
    console.log(a, b, c);
}

func(arrA);
func(...arrA);


// rest 매개변수
function func2(...rest) {
    console.log(rest);
}
func2(1, 2, 3, 4)
function func3(param, ...rest) { // rest 매개변수는 마지막에 작성하지 않으면 에러 발생
    console.log(param);
    console.log(rest);
}
func3(1, 2, 3, 4);
