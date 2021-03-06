
package com.javacourse.lessons6.lessons5;

/*
Для этого мы можем создать цикл while, если символ из 1 == 2,
то мы его заносим в 3 массив, после чего
сравним 1 и 3 массив, если они будут равны вернем true
*/

/*
Итак, у меня есть 2 массива строк, чтобы сравнить их, я буду использовать 2 цикла, for и while, q будет
увеличиваться только когда q и q2 будут равны
*/

/*
Короче, нужно задать вопрос на стэке, как сделать так чтобы цикл s2 заканчивался, когда
q становиться больше s2, просто нам по условию, нужно чтобы i увеличивался, только когда
равнялся q, но если у нас допустим 2 символ не подходит к массиву t2, то
i не может стать больше s2.length и цикл не может закончиться
*/

/*
В общем все довольно просто, меня забанили на стэке, поэтому этот код я писал сам
Для начала мы преобразовываем строку в массив строк
После создаем 2 цикла while
Если q(вторая строка) == i(первой строки), то мы продвигаем i и q на 1 элемент, sa
увеличиваем на 1 и продолжаем сравнивать 
Если q != i, то q++ продвигаеться до тех пор, пока не будут равны, а если цикл
дойдет до конца массива, то цикл заканчиваеться и нам всего лишь остаеться 
сравнить длину s2 и i, если она равна, то они одинаковы и нужно вернуть true, 
а иначе false
*/

import java.util.Objects;

public class Solution {
    public void subsequence(String s, String t) {
        String[] s2 = s.split("(?!^)");
        String[] t2 = t.split("(?!^)");
        int i = 0;
        int q = 0;
        int sa = 0;
        while (q < t2.length) {
            while (i < s2.length && q < t2.length) {
                if (Objects.equals(s2[i], t2[q])) {
                        sa++;
                        i++;
                }
                q++;
            }

        }
        System.out.println(s2.length == sa);
    }
}
