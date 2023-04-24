// var name = "Steve" 
// // name variable is global scoped

// var secretsFunction = function() {
//     var pinCode = [0, 0, 0, 0];
//     console.log('pinCode inside secretsFunction: ', pinCode);
// }

// secretsFunction();

// console.log('pinCode outside secretsFunction: ', pinCode); - doesn't work as pinCode is function scoped

var filterNamesByFirstLetter = function (names, letter) {
    var filteredNames = [];
    for (let name of names) {
        if ( name[0] === letter ) {
            filteredNames.push(name)
        }
    }
    return filteredNames;
}

var students = ["Alice", "Bob", "Alyssia", "Artem", "Babs"]
console.log(filterNamesByFirstLetter(students, "A"));

// Const

// E=mc2

// const calculateEnergy = function (mass) {
//     const speedOfLight = 299792458;
//     return mass * speedOfLight ** 2
// }

// const energyOfMe = calculateEnergy(75);
// console.log("energyOfMe (if I had a mass of 75kg", energyOfMe);

const song = {
    title: 'Super Mario Bros Theme Tune',
    artist: 'Koji Kondo'
}

console.log('Song before mutation', song);
song.title = 'Donkey Kong Theme Tune'
console.log('Song after mutation', song);

const helloWorld = function () {
    result = "Hello World!"
}
helloWorld()
console.log(result);