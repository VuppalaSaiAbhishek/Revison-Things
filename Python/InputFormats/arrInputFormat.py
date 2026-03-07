## CASE 1: [1,2,3,4,5]

arr = list(map(int,input().strip('[]{}').split(",")))
print(arr)


## CASE 2: 1 2 3 4 5

arr = list(map(int,input().split()));
print(arr)

# CASE 3: 1,2,3,4,5

arr = list(map(int,input().split(',')))
print(arr)

#CASE 4: 1.5,4.6,7.8,9.0

arr = list(map(float,input().split(',')));
print(arr)

# CASE 5:
#  4
#  1
#  2
#  3
#  4
arr= []
n = int(input())
for i in range (0,n):
    m = input()
    if(m==" "):
        break
    arr.append(int(m))
print(arr)


# CASE 6:
#  1
#  2
#  3
#  4
arr=[]

while True:
    try:
        num = int(input())
        arr.append(num)
    except:
        break

print(arr)