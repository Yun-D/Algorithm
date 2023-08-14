import sys
from collections import deque

n = int(input())
a = list(map(int, sys.stdin.readline().split()))
answer = [-1] * n #정답 배열. 오큰수가 없는 경우 -1를 넣기 위해 미리 초기화.
my_stack = deque() #인덱스를 넣어둘 스택
my_stack.append(0) #스택이 비어있지 않도록 0 미리 추가

for i in range(1, n) :
    while len(my_stack) > 0 and a[my_stack[-1]] < a[i] : #스택이 비어있지 않으며, a배열의 스택의 top값을 인덱스로 하는 값과 a배열의 값을 비교하여 작으면
        answer[my_stack.pop()] = a[i] #스택의 top 값을 인덱스로 하는 answer 배열 자리에 a[i] 값을 넣어준다 == 오큰수
    my_stack.append(i) # 차례를 넘기면서 인덱스 ++

for i in range(len(answer)) :
    print(answer[i], end=" ")