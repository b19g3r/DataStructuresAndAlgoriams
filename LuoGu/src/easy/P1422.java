package easy; /**
 * @PackageName: PACKAGE_NAME
 * @ClassName: easy.P1422
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/11 18:13
 **/

import java.util.Scanner;

/**
 * 月用电量在150千瓦时及以下部分按每千瓦时0.4463元执行，
 * 月用电量在151~400千瓦时的部分按每千瓦时0.4663元执行，
 * 月用电量在401千瓦时及以上部分按每千瓦时0.5663元执行;
 * 小玉想自己验证一下，电费通知单上应交电费的数目到底是否正确呢。
 * 请编写一个程序，已知用电总计，根据电价规定，计算出应交的电费应该是多少。
 */

public class P1422 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mount = sc.nextInt();
        double cost;
        //int a = mount - 150;
        if ( mount >= 401 ) {
            cost = 0.5663 * (mount - 400) + 0.4663*(400-150) + 0.4463 * 150;
        } else if( mount >= 151) {
            cost = 0.4663 * (mount-150) + 0.4463 * 150;
        } else {
            cost = 0.4463 * mount;
        }

        System.out.printf("%.1f", cost);
    }


}
