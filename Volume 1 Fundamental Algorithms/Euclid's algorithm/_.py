# m, n = map(int, input().split())
# if m < n:
# 	m, n = n, m


def euclidAlgoGCD(m: int, n: int):
	return m if n == 0 else euclidAlgoGCD(n, m % n)

# print(eulerAlgoGCD(m, n))
