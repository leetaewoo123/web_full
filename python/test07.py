class FourCal:
    def __init__(self, first:int, second:int) -> None:
        self.first = first
        self.second = second
        print('생성자 실행')
    def __del__(self):
        print('소멸자 실행')
    def setData(self, first:int, second:int) -> None:
        self.first = first
        self.second = second
    def add(self) -> int:
        return self.first + self.second
    def sub(self) -> int:
        return self.first - self.second
    def mul(self) -> int:
        return self.first * self.second
    def div(self) -> float():
        return self.first / self.second
        
a = FourCal(10,20)
# a.setData(10,20)

print(a.first, a.second)
print('더하기 실행 결과 : ', a.add())
print('빼기 실행 결과 : ', a.sub())
print('곱하기 실행 결과 : ', a.mul())
print('나누기 실행 결과 : ', a.div())
print(type(a))

class MoreFourCal(FourCal):
    pass

b = MoreFourCal(100,20)
print('더하기 실행 결과 : ', b.add())
print('빼기 실행 결과 : ', b.sub())
print('곱하기 실행 결과 : ', b.mul())
print('나누기 실행 결과 : ', b.div())