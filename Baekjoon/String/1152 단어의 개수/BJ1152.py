import sys
input = sys.stdin.readline

sentence = input().split()

count = 0

for i in sentence:
    count += 1

print(count)