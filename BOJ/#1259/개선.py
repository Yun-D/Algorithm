while True :
    num = input()

    if num == '0' :
        exit()
    elif num != num[::-1] : # 원본 문자와 뒤집은 문자열이 같지 않다면 no 출력
        print("no")
    else:
        print("yes")