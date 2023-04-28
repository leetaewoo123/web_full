class Family:
    lastname = '김'
    
a = Family() #인스턴스 생성
b = Family() #인스턴스 생성
print("Family.lastname : ",Family.lastname) 
print('a.lastname : ' ,a.lastname)
print('b.lastname : ' ,b.lastname)
# Family.lastname = 'lee' #인스턴스변수 생성
# a.lastname = "park"     #인스턴스변수 생성
b.lastname = "hong"

print("Family.lastname : ",Family.lastname)
print('a.lastname : ' ,a.lastname)
print('b.lastname : ' ,b.lastname)