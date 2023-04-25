lst1 = ['kim','kim','park','lee','kim','choi','hong','lee','kang',
        'jang','jang','kim','lee','hong','kim','you','park','you']
dic1 = dict()

for i in lst1:
    dic1[i] = dic1.get(i,0) + 1


print(dic1)