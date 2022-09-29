### [7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamaları:
1. root: 7'dir.
2. 5, 7'den küçük olduğu için 7'nin soluna yazılır.
3. 1, 7 ve 5'ten küçük olduğu için 5'in soluna yazılır.
4. 8, 7'den büyük olduğu için 7'nin sağına yazılır.
5. 3, 7 ve 5'ten küçük, 1'den büyük olduğu için 1'in sağına yazılır.
6. 6, 7'den küçük ve 5'ten büyük olduğu için 5'in sağına yazılır.
7. 0, 7,5 ve 1'den küçük olduğu için 1'in soluna yazılır.
8. 9, 7 ve 8'den büyük ve olduğu için 8'in sağına yazılır.
9. 4, 7 ve 5'ten küçük, 1 ve 3'ten büyük olduğu için 3'ün sağına yazılır.
10. 2, 7,5 ve 3'ten küçük, 1'den büyük olduğu için 3'ün soluna yazılır.
## Sonuç:
              7
             / \
            5   8
           / \    \
          1   6    9
         / \ 
        3   4 
