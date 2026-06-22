class MinStack(object):

    def __init__(self):
        self.s=[]
        self.ms=[]

    def push(self, value):
        self.s.append(value)
        if not self.ms or value<=self.ms[-1]:
            self.ms.append(value)
        else:
            self.ms.append(self.ms[-1])
    def pop(self):
        self.s.pop()
        self.ms.pop()
    def top(self):
        return self.s[-1]
    def getMin(self):
        return self.ms[-1]
        


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(value)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()