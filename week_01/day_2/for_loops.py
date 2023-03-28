numbers = [1,2,3,4,5]
names = ("Ben", "Jane", "Steve")
chickens = [
    {"name": "Margaret", "age": 2, "eggs": 6},
    {"name": "Mary", "age": 1, "eggs": 12},
    {"name": "Marge", "age": 4, "eggs": 7}
]

for number in numbers:
    print(number * 2)

for name in names:
    print(name)

total_eggs = 0

for chicken in chickens:
    print(f"{chicken['name']} is {chicken['age']}")
    total_eggs += chicken['eggs']

print(f"Total number of eggs is {total_eggs}")