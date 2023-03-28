import maths.calculator
# from calculator import add, subtract
# from calculator import *
# use of * import is less desired as it can increase chance of error (* means all)
# if pulling from existing files, can be renamed (or aliased) for clarity upon import to current file
# eg import calculator as safe_calc

# from maths.calculator import add, subtract

result = maths.calculator.add(1,2)
# result = safe_calc.add(1,2)
# result = add(1,2)
# result2 = subtract(3,1)
result2 = maths.calculator.subtract(3,1)

print(result)
print(result2)