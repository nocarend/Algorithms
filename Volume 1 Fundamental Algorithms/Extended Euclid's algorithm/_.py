m, n = map(int, input().split())


def extendedEuclidAlgo(m: int, n: int):
	if n == 0:
		return m, 1, 0
	gcd, _a, _b = extendedEuclidAlgo(n, m % n)
	return gcd, _b, _a - m // n * _b


print(extendedEuclidAlgo(m, n))
