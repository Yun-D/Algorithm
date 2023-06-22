while True :
    n = int(input())
    templist = []
    tempsum = 0

    if n == -1 :
        break
        exit()

    for i in range(1, int(n ** (1/2))+1) :
        if n % i == 0 :
            templist.append(i)
            tempsum += i

            if i < n // i and n // i != n: # 숫자 본인은 추가하지 않는다!!
                templist.append(n // i)
                tempsum += n // i

    templist.sort()
    if tempsum == n :
        print(n, "= 1", end="")
        for i in range(1, len(templist)) :
            print(f' + {templist[i]}', end="")
        print("")
    else:
        print(n, "is NOT perfect.")