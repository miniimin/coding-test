// 비동기 처리
// 비동기: 특정 작업을 다른 작업과 관계 없이 독립적으로 동작하게 만들음

setTimeout(function () {
    console.log("1번!");
}, 3000);

console.log("2번!");

function orderCoffee(coffee, time) {
    setTimeout(() => {
        console.log(`${coffee} 제조 완료`)
    }, time);
}

orderCoffee("커피", 4000);
orderCoffee("레몬 티", 2000);
orderCoffee("시원한 커피", 3000);


// 콜백 함수로 비동기 처리하기
function double(num) {
    return setTimeout(() => {
        const doubleNum = num * 2;
        return doubleNum; // 비동기 함수라 콜백함수(setTimeout에서 인수로 전달한 함수) 안에서 뭘 리턴해도 그 값이 바깥으로 나갈 수가 없다
    }, 1000);
}
const res = double(10);
console.log("res: ", res) // setTimeout의 ID 값

function double2(num, callback) {
    setTimeout(() => {
        const doubleNum = num * 2;
        callback(doubleNum);
    }, 1000);
}
double2(100, (res) => {
    console.log(res);
});
console.log("마지막");


// 프로미스 객체를 이용해 비동기 처리하기
// 콜백함수를 이용한 비동기 처리보다 쉽게비동기 수행 가능
// 자바스크립트 내장 객체
// 대기상태, 성공상태, 실패상태 3가지로 나누어 관리

const promise = new Promise(
    function (resolve, reject) {
        setTimeout(() => {
            resolve("성공")
        }, 500);
    }
);

promise.then(function (res) {
    console.log("프로미스연습: ", res);
})

const promise2 = new Promise(
    function (resolve, reject) {
        setTimeout(() => {
            reject("실패")
        }, 500);
    }
);

promise2
    .then(function (res) {
        console.log("resolve: ", res)
    })
    .catch(function (err) {
        console.log("reject: ", err)
    }
); // 'reject:  실패'만 실행