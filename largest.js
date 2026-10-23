const numbers = [12, 5, 27, 9, 18];
let largest = numbers[0];
for (let i = 0; i < numbers.length; i++) {
    if (numbers[i] > largest) {
        largest = numbers[i];
    }

}
console.log(largest)