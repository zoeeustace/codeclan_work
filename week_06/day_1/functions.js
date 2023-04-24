// Named Function

// function sayHello(name) {
//     return `Hello ${name}!`
// }

// console.log("sayHello message", sayHello("Aqib"));

// function sayHello(greeting,name = "Aqib") {
//     return `${greeting} ${name}!`
// }

// console.log("sayHello message", sayHello("Hi"));

// function sayHello(greeting,name = "Aqib") {
//     return `${greeting} ${name}!`
// }
// console.log("sayHello message", sayHello("Hi", "Steve"));

// Anonymous Function
// var add = function (firstNumber, secondNumber){
//     return firstNumber + secondNumber;
// }

// console.log("1 + 3 with add: ", add(1, 3));

// Task


function calculatedTotal(numbers){
    var sum = 0;
    for (var number of numbers){
        sum += number
    }
    return sum
}

var numbers = [1,2,3,4]
console.log(calculatedTotal(numbers));

keyCheck = function (object, searchString) {
    for (var key in object) {
        if (searchString === key) {
            return true
        }
    }
    return false
}

console.log(keyCheck({ name: "Wojtek", age: 30 }, "name"));

var keyCheck = function (object, key){
    if (object[key]) {
        return true
    } else {
        return false
    }
}

console.log(keyCheck({ name: "Wojtek", age: 30 }, "name"));

// Arrow Function
var multiply = (noOne, noTwo) => noOne * noTwo

console.log(multiply(2, 5));