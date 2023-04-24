name = 'Lee'
str1 = "MY name is %s" %name
print(str1)
age = 20
str2 = 'My name is %s, I age is %d' % (name,age)
print(str2)

str3 = '%10s' % 'hi'
print(str3)
str4 = '%-10s' % 'hello'
print(str4)
str5 = '%10.10f' % 3.141592
print(str5)

name = '홍길동'
age = 25
str6 = f'이름은 {name}이고, 나이는 {age}세 이다.'
print(str6)

print(','.join('abcde'))
print('-'.join('abcde'))
print('a','b','c','d','e',sep=",")
print('a','b','c','d','e',sep="-")
print('a','b','c','d','e',sep=" ")
print('a','b','c','d','e',sep=" / ")

a = 'Life is too short'
b = a.split()
print(b, type(b))

a = 'Life,is,too,short'
for i in a.split(','):
    print(i)
    
a = [1,2,3, ['a','b','c']]
print(a[3][1])

str1 = 'hello'
a = [1,2,3, ['a','b','c',str1],3,5,'a',str1]
print(a)
print(id(a),type(a),dir(a))
print(str1)
print(id(str1),type(str1),dir(str1))
print('------------------------------------------------')
for i in str1:
    print(id(i))
print('------------------------------------------------')
# n1 = 10
# n2 = 3.14
# print(n1)
# print(id(n1),type(n1),dir(n1))
# print(n2)
# print(id(n2),type(n2),dir(n2))

