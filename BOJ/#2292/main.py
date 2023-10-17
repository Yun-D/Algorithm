n = int(input())
diff = 1

i = 0
while True :
    diff += 6*i #한 층(라인)의 범위 사이 차이는 6의 배수로 늘어난다
    if n <= diff :
        answer = i + 1
        break
    i += 1

print(answer)