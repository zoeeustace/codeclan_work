const Dinosaur = function (species, diet, guestsAttractedPerDay) {
  this.species = species;
  this.diet = diet;
  this.guestsAttractedPerDay = guestsAttractedPerDay;
}

// Dinosaur.prototype.mostVisitors = function (){
//   this.guestsAttractedPerDay.sort();
//   this.guestsAttractedPerDay.length(-1)
// }
Dinosaur.prototype.mostVisitors = function() {
  let indexOfVisitors = []
  for (let guest of this.guestsAttractedPerDay){
    indexOfVisitors.push(guest);
  }
  indexOfVisitors.sort();
  largest_number = indexOfVisitors[size-1]
  return largest_number

}


module.exports = Dinosaur;
