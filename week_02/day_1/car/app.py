class Engine:
    def __init__(self, volume, horse_power):
        self.volume = volume
        self.horse_power = horse_power

    def start(self):
        return "Vrrooooooom"

    def stop(self):
        return "stopped"

class Car:
    def __init__(self, make, model, engine):
        self.make = make
        self.model = model
        self.engine = engine

    def drive(self):
        return self.engine.start()
    
engine1 = Engine(6, 180)
print(engine1.volume)
print(engine1.start())

car1 = Car("Opel", "Manta", engine1)
print(car1.make)
print(car1.drive())


# Classes are "tightly coupled" ie Engine is required for Car
# Can be "loosely coupled" by putting Engine into behaviours eg drive(engine.start)