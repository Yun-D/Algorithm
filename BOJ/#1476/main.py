E, S, M = map(int, input().split())
te_E, te_S, te_M = 1, 1, 1
result = 1

while True :
    if E == te_E and S == te_S and M == te_M :
        break
    else:
        if te_E > 15:
            te_E = 1
        elif te_S > 28:
            te_S = 1
        elif te_M > 19:
            te_M = 1
        else:
            te_E += 1
            te_S += 1
            te_M += 1

            result += 1

print(result)