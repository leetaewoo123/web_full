s1 = set({1,2,3,4,5})
s2 = set({4,5,6,7,8})
print(s1,type(s1))
print(s2, type(s2))
print(s1 | s2, s1.union(s2))
print(s1 & s2, s1.intersection(s2))
print(s1 - s2, s1.difference(s2))

import copy

a = [10,20,30,40]
# a = [10,20,[31, 32, [331, 332, 333]], 40, 50] #다차원 리스트
print('a : ', a, id(a))
#b = a                   #1번
#b = a[:]                #2번
# b = a.copy()            #3번
# b = copy.copy(a)        #4번
# b = copy.deepcopy(a)    #5번

a[0] = 11
print('a : ', a, id(a), id(a[0]), id(a[1]), id(a[2]), id(a[3]))
print('b : ', b, id(b), id(b[0]), id(b[1]), id(b[2]), id(b[3]))