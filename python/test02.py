str1 = 'hello world 1234'
print(len(str1))
print(str1[0:5]) # 0번지 이상 5번지 미만까지 슬라이싱
print(str1[:5]) # 시작 번지 생략
print(str1[6:]) # 끝 번지 생략
print(str1[0:11:2]) # 세번째 자리는 간격
print(str1[::-1]) #반대로 뒤집기