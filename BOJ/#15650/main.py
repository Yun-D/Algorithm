def backTracking (start) :
    if len(s) == m : #m개가 쌓이면 출력
        print(' '.join(map(str, s)))
        return

    for i in range(start, n+1) :
        if visited[i] :
            continue
        visited[i] = True
        s.append(i)
        backTracking(i) #자기 이전의 숫자는 이미 앞에서 나왔으므로 start를 i로 !
        s.pop()
        visited[i] = False


n, m = map(int, input().split())
s = []
visited = [False] * (n+1)

backTracking(1)