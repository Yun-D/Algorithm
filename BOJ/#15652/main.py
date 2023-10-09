def backTracking (start) :
    if len(s) == m : #m개가 쌓이면 출력
        print(' '.join(map(str, s)))
        return

    for i in range(start, n+1) :
        s.append(i)
        backTracking(i)
        s.pop()


n, m = map(int, input().split())
s = []
visited = [False] * (n+1)

backTracking(1)