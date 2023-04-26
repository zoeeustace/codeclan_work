const Park = function(name, ticketPrice) {
    this.name = name;
    this.ticketPrice = ticketPrice;
    this.collectionOfDinosaurs = [];
}

Park.prototype.addDinosaur = function (dinosaur) {
    this.collectionOfDinosaurs.push(dinosaur)
}

Park.prototype.removeDinosaur = function (dinosaur) {
    const indexOfDinosaurs = this.collectionOfDinosaurs.indexOf(dinosaur);
    this.collectionOfDinosaurs.splice(indexOfDinosaurs, 1);
}

Park.prototype.calculateVisitorsPerDay = function () {
    let total = 0;
    for (const dinosaur of this.collectionOfDinosaurs) {
        total += dinosaur.guestsAttractedPerDay;
    };

    return total;
};

module.exports = Park;