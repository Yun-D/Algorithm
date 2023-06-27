while True :
    num = input()
    isPelin = False

    if num == '0' :
        exit()
    elif len(num) == 1 :
        print("yes")
    else:
        num_list = list(num)

        for i in range(int(len(num_list) ** 0.5)+1) :
            if num_list[i] == num_list[len(num_list)-i-1] :
                isPelin = True
                continue
            else:
                isPelin = False
                print("no")
                break

        if isPelin : print("yes")