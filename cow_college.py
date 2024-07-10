N = int(input()) # N = 4
cows = list(map(int, input().split())) # [1, 6, 4, 6]

# Sorting the array
cows.sort() # [1, 4, 6, 6]
ans = 0
tuition = 0
for i in range(N - 1, -1, -1):
	if ans <= (N - i) * cows[i]:
		ans = (N - i) * cows[i]
		tuition = cows[i]

print(ans, tuition)
