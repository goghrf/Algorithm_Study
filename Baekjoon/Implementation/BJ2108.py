# 숫자의 개수 입력
n = int(input())
# 입력값들이 저장될 배열 선언
arr = []

# 배열 요소의 합을 저장할 변수
sum = 0
# 최빈값
freqMax = 0

# 입력값을 배열에 삽입
for _ in range(n):
  k = int(input())
  arr.append(k)
  sum += k

# 입력받는 수가 1개 일때
if n == 1 :
  print(arr[0])
  print(arr[0])
  print(arr[0])
  print(0)
# 입력받는 수가 1개 이상일 때
else :
  # 배열 정렬
  arr.sort()

  myMax = arr[n - 1]
  myMin = arr[0]

  # 최솟값이 0보다 클 때
  if myMin >= 0:
    frequence = [0] * (myMax+1)
    field = myMax+1
  # 최솟값이 0보다 작을 때
  else:
    frequence = [0] * (myMax+(abs(myMin)+1))
    field = myMax+(abs(myMin)+1)

  for i in arr:
    if i < 0 :
      frequence[myMax - i] += 1
      freqMax = max(freqMax, frequence[myMax - i])
    else :
      frequence[i] += 1
      freqMax = max(freqMax, frequence[i])

  # 최빈값(들)이 담길 배열
  arr2 = []

  for i in range(field):
    if freqMax == frequence[i]:
      if myMax >= i :
        arr2.append(i)
      else:
        arr2.append(-(i - myMax))

  arr2.sort()

  # 산술평균 출력
  print(round(sum / n))
  # 중앙값 출력
  print(arr[n//2])
  # 최빈값 출력
  if len(arr2) == 1:
    print(arr2[0])
  else:
    print(arr2[1])
  # 범위 출력
  print(myMax-myMin)