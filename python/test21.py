class Bird: # 부모 클래스
    def fly(self):
        raise NotImplementedError

class Eagle(Bird): # 자식 클래스
    def fly(self):
        print("Eagle fly")

class Owl(Bird):
    def fly(self):
        print("Owl fly")
        
class Pigeon(Bird):
    def fly(self):
        print("Pigeon fly")
        
eagle = Eagle()
eagle.fly()
owl = Owl()
owl.fly()
pigeon = Pigeon()
pigeon.fly()
bird_child = [eagle,owl,pigeon]
for bird in bird_child:
    bird.fly()