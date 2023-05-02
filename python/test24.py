import pickle

f = open('test.txt','wb')
data = {1: 'hello', 2:'world'}
pickle.dump(data,f)
f.close()