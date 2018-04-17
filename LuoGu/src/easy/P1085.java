package easy; /**
 * @PackageName: PACKAGE_NAME
 * @ClassName: easy.P1085
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/11 19:08
 **/


import java.util.Scanner;

/**
 * 津津上初中了。妈妈认为津津应该更加用功学习，所以津津除了上学之外
 * ，还要参加妈妈为她报名的各科复习班。另外每周妈妈还会送她去学习朗诵
 * 、舞蹈和钢琴。但是津津如果一天上课超过八个小时就会不高兴，而且上得越久就会越不高兴
 * 。假设津津不会因为其它事不高兴，并且她的不高兴不会持续到第二天。
 * 请你帮忙检查一下津津下周的日程安排，看看下周她会不会不高兴；如果会的话，哪天最不高兴。
 */
public class P1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 获取输入
        int[] t = new int[7];
        int day = 0;
        int max = 0;
        // 标志数组/,默认为false
        boolean[] unHappy = new boolean[7];

        for (int i = 0; i < t.length; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            t[i] = a+b;
            if(t[i] > t[max] && t[i] > 8 ){
                day = i+1;
            }
        }
        System.out.println(day);
    }

}
