import random as rd
# 첫번째

lotto = []
while len(lotto) < 7:
    ln = rd.randint(1, 45)
    if ln not in lotto:
        lotto.append(ln)
        
print("당첨 번호는 : ",lotto[:-1],"+",lotto[-1])

# 두번째

lotto = set()
while len(lotto) < 7:
    ln = rd.randint(1, 45)
    lotto.add(ln)

print("당첨 번호는 : ",list(lotto)[:-1],"+",list(lotto)[-1])

# 세번째
lotto = list(range(1,46))
rd.shuffle(lotto)
print("당첨 번호는 : ",list(lotto)[:6],"+",list(lotto)[6])
# ---------------------------------------------------

# 가위 0 바위 1 보 2
me = input(str())
you = (str(rd.randint(0,2)))
dic_s = {"01":"컴퓨터 승","02":"사람 승","12":"컴퓨터 승","10":"사람 승", "20":"컴퓨터 승","21":"사람 승"}

if me+you in ['11','22','33'] :
    print('무승부')
else:
    print(dic_s[me+you])
    
# 두번째
game = {0:'가위', 1:'바위', 2:'보'}
human = int(input('가위(0), 바위(1), 보(2)를 입력하시오.'))
com = rd.randint(0, 2)
print('human ; ',game.get(human))
print('com : ', game.get(com))
result = human - com
if result ==0:
    print('무승부')
elif result in [1, -2]:
    print('사람승')
else :
    print('컴퓨터승')
    
# 세번째
game = {0:'가위', 1:'바위', 2:'보'}
human = int(input('가위(0), 바위(1), 보(2)를 입력하시오.'))
com = rd.randint(0, 2)
print('human ; ',game.get(human))
print('com : ', game.get(com))

result = [
    ['비김','컴승','사람승']
    ,['사람승','비김','컴승']
    ,['컴승','사람승','비김']
]
print (result[human][com])