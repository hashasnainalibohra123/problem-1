#!/usr/bin/python3
import sys
import string

char = ['a','b','c','d','e','f','g','h','i','j','k','l',
               'm','n','o','p','q','r','s','t','u','v','w','x','y','z']
no = input()
n = len(no)
for Len in range(1,n + 1): 
    for i in range(n - Len + 1): 
         
        j = i + Len - 1
  
        for k in range(i,j + 1): 
            rest = no[k-1:]
            start = no[:k]
            #print(start,no[k],rest,end="") 
            if int(no[k:])-1 < 26:
                print (char[int(no[k])-1],end="")
        print() 

