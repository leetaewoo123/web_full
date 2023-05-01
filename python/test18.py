class Family:
    lastname = '김'
    def plus(self, a,b):
        print(a+b)
    
a = Family() #인스턴스 생성
b = Family() #인스턴스 생성
# print("Family.lastname : ",Family.lastname) 
# print('a.lastname : ' ,a.lastname)
# print('b.lastname : ' ,b.lastname)
print(type(Family()))
Family.lastname = 'lee' #인스턴스변수 생성
a.lastname = "park"     #인스턴스변수 생성
a.firstname = "hello"
a.plus(10, 20)
b.lastname = "hong"

print("Family.lastname : ",Family.lastname)
print('a.lastname : ' ,a.lastname,a.firstname)
print('b.lastname : ' ,b.lastname,b.firstname)