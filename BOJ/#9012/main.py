t = int(input())

for i in range(t):
    stack = []
    data = input()

    for j in data :
        if j == "(" : #여는 괄호 발견하면
            stack.append("(") #추가
        elif j == ")": #닫는 괄호 발견하면
            if stack :
                stack.pop() #삭제
            else:
                print("NO") #만일 스택에 여는 괄호가 존재하지 않으면 괄호를 닫을 수 없으므로 NO
                break
    else: #for-else 문법으로 위 반복문이 마무리 되었으나 break로 끝난 게 아닐 경우
        if not stack : #스택에 아무것도 존재하지 않으면 VPS이므로 YES
            print("YES")
        else:
            print("NO")