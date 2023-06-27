import sys
board = []
result = []

n, m = map(int, sys.stdin.readline().split())
for i in range(n) :
    board.append(sys.stdin.readline())

for i in range(n-7) : # 8x8 범위 안에서 돌면서 계산
    for j in range(m-7) :
        w_start = 0 # w로 시작하는 경우
        b_start = 0 # b로 시작하는 경우

        for k in range(i, i+8) : # 시작점부터 8칸 동안
            for l in range(j, j+8) :
                if (k + l) % 2 == 0: # 행과 열을 더한 부분이 짝수일 경우
                # (인덱스는 계속 짝, 홀, 짝, 홀을 반복한다. 해당 인덱스가 w인지, b인지 확인하여 변수에 값을 더해준다!)
                # 모든 항목을 돌아가며 틀린 부분을 잡는다.
                    if board[k][l] != "W":
                        b_start += 1
                    else:
                        w_start += 1
                else:
                    if board[k][l] != "B" :
                        b_start += 1
                    else:
                        w_start += 1

        result.append(min(w_start, b_start))

print(min(result))