def f01():
    print('f01함수')
class C01():
    firstname = 'hello'
    def __init__(self):
        self.firstname = 'hi'
    

print(f01, type(f01),C01, type(C01))
C01.lastname = "kim"
# print(C01.lastname)
# print(C01.firstname)
obj = [f01,C01]
print(obj, type(obj))
print(type(list), type(tuple), type(dict), type(set))
print(type(int), type(str), type(tuple), type(bool))
obj[0]()
print(obj[1]().firstname, obj[1].firstname, obj[1].lastname)