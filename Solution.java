package com.javacourse.lessons6.lessons5;
// 7, 1, 5, 3, 6, 4
class Solution {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE; //Переменная, в которой храниться максимальное значение
        int op = 0;
        int pist = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){ // i = 1; 2;
                lsf = prices[i]; // lfs = 1;
            } // Таким методом, мы находим самое большое число в массиве
            pist = prices[i] - lsf; // pist = 0; 1; // Тут мы от самого большего числа, отнимаем самое меньшее
            if(op < pist){ // true;
                op = pist; // op = 0; 1; Приравниваем значение к op и возвращаем ее, по окончанию цикла
            }
        }
        return op;
    }
}