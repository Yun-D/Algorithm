def backTracking () :
    if len(s) == m : #m개가 쌓이면 출력
        print(' '.join(map(str, s)))
        return

    for i in range(1, n+1) :
        s.append(i)
        backTracking()
        s.pop()


n, m = map(int, input().split())
s = []
visited = [False] * (n+1)

backTracking()