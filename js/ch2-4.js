// 배열
// push: 길이를 반환하는 메서드

let food = ["짜장면", "피자", "치킨"]
const newLength = food.push("탕수육", "라자냐");
console.log(food);
console.log(newLength);

const removedItem = food.pop();
console.log(food);
console.log(removedItem);
// 빈 배열일 경우 제거할 요소가 없어서 undefined 반환

const removedItem2 = food.shift();
console.log(food);
console.log(removedItem2);

const newLength2 = food.unshift("갈비찜");
console.log(food);
console.log(newLength2);


// 참고사항: shift와 unshift는 기존 요소의 인덱스가 모두 바뀌므로 느리다


const arr = [1, 2, 3, 4]
const sliced = arr.slice(0, 3);
console.log(arr); // 기존 arr은 수정되지 않음
console.log(sliced);
console.log(arr.slice(2));
console.log(arr.slice(-2)); // 배열의 맨 끝부터 음수의 절댓값만큼 잘라낸 배열 반환

let arrA = [1, 2];
let arrB = [3, 4];
let arrC = arrA.concat(arrB);
console.log(arrC);
let arrD = {
    a: 1,
    b: 2
}
console.log(arrC.concat(arrD));
console.log(arrC); // 기존 arr은 수정되지 않음

// forEach 배열의 모든 요소에 순서대로 접근해 특정 동작을 수행하는 메서드
// 인수로 함수를 요구
// 함수 호출 과정에서 인수로 전달되는 함수
// 이 콜백 함수에는 3개의 매개변수가 요구
function cb(item, index, arr) {
    console.log(`${index}번째 요소 ${item} + arr: ${arr}`);
}
arr.forEach(cb);

// indexOf: 탐색 메서드
// arr.indexOf(item, fromIndex)
// item: 찾으려는 요솟값, fromIndex: 탐색을 시작할 인덱스 번호

console.log(arr.indexOf("3", 0)); // 없으면 -1 반환, 두번째 인수는 생략 가능
console.log(arr.indexOf(3));

let arr1 = [1, 3, 5, 7, 1];
console.log(arr1.indexOf(1));
console.log(arr1.indexOf(1, -1)); 
console.log(arr1.indexOf(7, -1)); 

let arr2 = [{name: "이정환"}, 1, 2, 3];
console.log(arr2.indexOf({name: "이정환"})); // "==="로 값을 비교하므로, 객체 간에는 참좃값을 비교하기 때문에 탐색 실패


// includes: 배열에 특정 요소가 있는지 판별
console.log(arr1.includes(9)); // false

// findIndex
//arr.findIndex(callback(item, index, arr));
function determine(item, i, arr){
    if (item % 2 === 0) {
        return true;
    } else {
        return false;
    }
}
let arr3 = [1, 3, 5, 6, 8];
let index = arr3.findIndex(determine);
console.log(index); // 3 (true를 반환하면 탐색에 성공한 것이므로 탐색을 멈춘 index를 반환)
let index2 = arr3.findIndex((item) => item % 2 === 0 ? true : false);
let index3 = arr2.findIndex((item) => item.name === "이정환");
console.log(index2);
console.log(index3);


// find 메서드
let arr4 = [
    {name: "이종원", age: 35},
    {name: "이정환", age: 15},
    {name: "신다민", age: 24},
    {name: "김효빈", age: 15}
]
let element = arr4.find((item) => item.name === "이정환");
console.log(element);


// filter 메서드
// 배열에서 조건을 만족하는 요소만 모아 새 배열로 반환
let filterArr = arr4.filter((item) => item.age === 15);
console.log(filterArr);


// 변형 메서드: 배열을 변형하거나 요소를 재정렬하는 메서드. map, sort, join, reduce
// map
let arr5 = [1, 2, 3]
let newArr = arr5.map((item) => item * 3);
console.log(newArr);
let newArr2 = arr4.map((item) => item.name);
console.log(newArr2);

// sort
// 사전순, 오름차순으로 정렬
let arr6 = [10, 5, 3];
arr6.sort();
console.log(arr6);

function compare(a, b) {
    if (a > b) {
        return 1;
    } else if (a < b) {
        return -1;
    } else {
        return 0;
    }
}
arr6.sort(compare);
console.log(arr6);

// join
// 배열 요소를 모두 연결해 하나의 문자열로 반환
console.log(arr.join()); // 1,2,3,4
console.log(arr.join("-")); // 1-2-3-4

// reduce
// map과 유사하지만 하나의 결과만을 반환
// arr.reduce((acc, item, index, array) => { (...) }, initial);
// 첫번째 인수로 콜백 함수를 전달, 두 번째 인수로는 initial(acc의 초깃값) 전달
let arr7 = [1, 2, 3, 4, 5]
let result = arr7.reduce((acc, item) => acc + item, 2);
console.log(result);