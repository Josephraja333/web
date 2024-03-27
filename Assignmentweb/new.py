from itertools import permutations
print("Enter three values of the list comma seperated: ")
x = [int(i) for i in input().strip().split(",")]
c = list(permutations(x))
cn = []
for i in c:
  print(list(map(str, i)))
#   val=int(int(''.join()))
#   cn.append(val)
print(cn)