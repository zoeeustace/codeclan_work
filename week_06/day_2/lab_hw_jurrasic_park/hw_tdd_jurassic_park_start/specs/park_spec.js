const assert = require('assert');
const Park = require('../models/park.js');
const Dinosaur = require('../models/dinosaur.js');

describe('Park', function() {

  let dinosaur1;
  let dinosaur2;
  let dinosaur3;
  let dinosaur4;
  let dinosaur;
  let park;


  beforeEach(function () {
    dinosaur1 = new Dinosaur("T-Rex", "Carnivore", 50);
    dinosaur2 = new Dinosaur("Velociraptor", "Carnivore", 100);
    dinosaur3 = new Dinosaur("Stegosaurus", "Herbivore", 30);
    dinosaur4 = new Dinosaur("Brachiosaurus", "Herbivore", 25);
    park = new Park("Jurassic Park", 100);
  });

  it('should have a name', function() {
    const actual = park.name;
    assert.strictEqual(actual, "Jurassic Park");
  });

  it('should have a ticket price', function(){
    const actual = park.ticketPrice;
    assert.strictEqual(actual, 100);
  });

  it('should have a collection of dinosaurs', function() {
    const actual = park.collectionOfDinosaurs;
    assert.deepStrictEqual(actual, []);
  });

  it('should be able to add a dinosaur to its collection', function(){
    park.addDinosaur(dinosaur1);
    park.addDinosaur(dinosaur2);
    const expected = [dinosaur1, dinosaur2];
    assert.deepStrictEqual(park.collectionOfDinosaurs, expected)
  });


  it('should be able to remove a dinosaur from its collection', function (){
    park.addDinosaur(dinosaur1);
    park.addDinosaur(dinosaur2);
    park.removeDinosaur(dinosaur1);
    const expected = [dinosaur2];
    assert.deepStrictEqual(park.collectionOfDinosaurs, expected);
  });

  xit('should be able to find the dinosaur that attracts the most visitors', function(){
    dinosaur.mostVisitors();
    const actual = "Velociraptor";
    assert.strictEqual(actual, "Velociraptor");
  });

  xit('should be able to find all dinosaurs of a particular species', function() {

  });

  it('should be able to calculate the total number of visitors per day', function() {
    park.addDinosaur(dinosaur1);
    park.addDinosaur(dinosaur3);
    const expected = 80;
    assert.strictEqual(park.calculateVisitorsPerDay, expected)
  });

  xit('should be able to calculate the total number of visitors per year');

  xit('should be able to calculate total revenue for one year');

});
