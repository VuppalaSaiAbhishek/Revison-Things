
#CASE 1: 
    # M X N (Where M and N is Given)
    #Inputs : 3 2
    # 1 
    # 2 
    # 2
    #.. (Up to limit)  
arr =[]
m = int(input())
n = int(input())
for i in range(0,m):
    row = []
    for j in range(0,n):
        row.append(int(input()))
    arr.append(row)
print(arr)





#CASE 2: 
    # M X N 
    # M Number of Lines Strings
    # Example : 3 X 3
    # 1 2 3
    # 4 5 6
    # 7 8 9    
arr = []
for i in range (0,3):
    arr1 = list(map(int,input().split()))
    arr.append(arr1)
print(arr)


#CASE 3: 
    # M X N 
    # M Number of Lines Strings
    # Example : 3 X 3
    # [1, 2, 3]
    # {4, 5, 6}
    # [7, 8 ,9]
arr = []
for i in range (0,3):
    arr1 = list(map(int,input().strip("[]{}").split()))
    arr.append(arr1)
print(arr)