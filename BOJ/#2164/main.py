from collections import deque

n = int(input())

queue = deque(range(1, n+1))
while len(queue) > 1 :
    queue.popleft() # 맨 앞 값 삭제
    queue.append(queue.popleft()) # 맨 앞 값을 삭제하고, 해당 값을 큐의 맨 뒤에 추가

print(queue[0])