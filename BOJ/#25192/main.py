import sys

n = int(sys.stdin.readline())
set_word = set()
result = 0

for i in range(n) :
    word = sys.stdin.readline()

    if word == "ENTER\n" : # 새로운 사람이 들어왔을 때
        set_word = set()
    elif word not in set_word :  # 해당 단어가 세트에 없으면
        set_word.add(word)
        result += 1

print(result)