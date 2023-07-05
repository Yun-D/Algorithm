import sys
from collections import deque

num = int(sys.stdin.readline())

for _ in range(num) :
    n, m = map(int, sys.stdin.readline().split()) # 문서 개수, 몇번째로 인쇄됐는지 궁금한 문서
    queue = deque(list(map(int, sys.stdin.readline().split()))) # 중요도
    cnt = 0 # 순서(답)

    while queue :
        m -= 1

        if queue[0] == max(queue) : #맨 첫번째 값이 최댓값이라면 바로 인쇄!!
            cnt += 1
            queue.popleft()

            if m < 0 :
                print(cnt)
                break

        else: # 첫번째가 최댓값이 아니면
            queue.append(queue.popleft()) #첫번째 값을 삭제하고 뒤로 추가
            if m < 0 :
                m = len(queue) - 1