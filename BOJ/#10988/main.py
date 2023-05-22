word = list(input())

for i in range(int(len(word)/2)) :
    if word[i] != word[len(word)-1-i] :
        print(0)
        exit()
    else:
        continue
print(1)
