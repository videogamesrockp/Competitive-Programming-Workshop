import sys

sys.stdin = open("file.in", "r")
sys.stdout = open("file.out", "w")
string = input()
nums = list(map(int, input().split()))
print(nums[0] + nums[1])
print(string)
