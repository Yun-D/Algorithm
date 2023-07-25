n = int(input())
left_arm = right_arm = waist = left_leg = right_leg = 0

cookie = []
for _ in range(n) :
    cookie.append(list(input()))

#심장 찾기
x = y = 0
temp = False
for i in range(n) :
    for j in range(n) :
        if cookie[i][j] == "*" :
            x = i+1
            y = j
            temp = True
            break
    if temp == True :
        print(x+1, y+1)
        break

#왼쪽 팔
for i in range(y) :
    if cookie[x][i] == "*" :
        left_arm += 1

#오른쪽 팔
for i in range(y+1, n) :
    if cookie[x][i] == "*" :
        right_arm += 1

#허리
for i in range(x+1, n) :
    if cookie[i].count("*") == 2 :
        break
    else:
        waist += 1

#왼쪽 다리, 오른쪽 다리
for i in range(x+waist+1, n) :
    if cookie[i].count("*") == 2: # 두다리 다 있을 경우
        left_leg += 1
        right_leg += 1
    elif cookie[i][y-1] == "*" :
        left_leg += 1
    elif cookie[i][y+1] == "*" :
        right_leg += 1


print(left_arm, right_arm, waist, left_leg, right_leg)