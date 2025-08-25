let date = new Date();
console.log(date);

// 협정 세계시: 시간의 시작을 1970년 1월 1일 0시 0분 0초를 기준으로 함. UTC+0시로 표현
let Jan01_1970 = new Date(1); // UTC+0시를 기준으로 1밀리초 후의 시간을 Date 객체로 생성해 반환
console.log(Jan01_1970);

// UDT+0시에서 하루 뒤
let Jan02_1970 = new Date(24 * 3600 * 1000);
console.log(Jan02_1970);
console.log(Jan01_1970.getTime());
console.log(Jan02_1970.getTime());

// 원하는 날짜로 Date 객체 생성하기
let date1 = new Date("2010/10/10/00:00:00");
let date2 = new Date("2010-10-10/00:00:00"); // 등등 가능
console.log("1: ", date1);
console.log("2: ", date2);

// 숫자로 특정 날짜 전달하기
// new Date(year, month, date, hours, minutes, seconds, milliseconds)
let date3 = new Date(2000, 10, 11, 23, 13, 3, 10);
console.log("3: ", date3); // 2000-11-11T14:13:03.010Z < date 객체는 월의 시작을 0으로 하기 때문에 11월 출력

let date4 = new Date(2100, 9, 11);
let timeStamp = date4.getTime();
console.log(timeStamp);
let dateClone = new Date(timeStamp);
console.log(dateClone);
console.log(dateClone.toString());

// getFullYear, setFullYear 등등..


// n월씩 이동하기
function moveMonth(date, moveMonth) {
    const curTimeStamp = date.getTime();
    const curMonth = date.getMonth();

    const resDate = new Date(curTimeStamp);
    resDate.setMonth(curMonth + moveMonth);
    return resDate;
}

const dateA = new Date("2000-12-10");
const dateB = moveMonth(dateA, 1);
console.log("A: ", dateA);
console.log("B: ", dateB);

function filterThisMonth(pivotDate, dateArray) {
    console.log("pivotDate: ", pivotDate)
    const year = pivotDate.getFullYear();
    const month = pivotDate.getMonth();

    const startDate = new Date(year, month, 1, 0, 0, 0);
    const endDate = new Date(year, month + 1, 0, 23, 59, 59);

    const resArr = dateArray.filter((it) => 
        startDate.getTime() <= it.getTime()
        && endDate.getTime() >= it.getTime()
    ).toString();
    return resArr;
}

const dateArray = [
    new Date("2000-10-1"),
    new Date("2000-10-31"),
    new Date("2000-11-1"),
    new Date("2000-9-30"),
    new Date("1900-10-1"),
]

const today = new Date("2000-10-10");
const filteredArray = filterThisMonth(today, dateArray);

console.log(filteredArray);
