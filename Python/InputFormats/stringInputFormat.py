#  CASE 1 : ['A','B','C','D','e'] or {'A','B','C','D','E'}

arr = list(input().strip('[]{}').split())
print(arr)


#CASE 2: A B C D
 
arr = list(input().split())
print(arr)

#CASE 3 :
#4
#A
#B
#D
#C

n = int(input())
arr =[]
for i in range(0,n):
    m = input()
    arr.append(m)
print(arr)


# CASE 4: 
#Do not Know What Input Was Given in Line By Line
# (This Solution Not perfcet for Coding Rounds While Using Once Check with your Problem Statement)
#A
#B
#C
#D
arr= []
while True:
    try:
        m = input()
        arr.append(m)
    except:
        break
print(arr)
