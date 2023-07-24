# 중복된 건 저장, 남들과 다른 부분은 ? 처리

n = int(input())
standard_word = list(input())

for i in range(n-1) :
    word = list(input())

    for j in range(len(standard_word)) :
        if standard_word[j] != word[j] :
            standard_word[j] = "?"

print("".join(standard_word))