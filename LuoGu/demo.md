# Java 提交格式
````
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws Exception {
    // code
    }
}
````
### easy.P1422 [小玉家的电费](https://www.luogu.org/problemnew/show/P1422) [![Build Status](https://travis-ci.org/phodal/mest.svg?branch=master)](https://travis-ci.org/phodal/mest)

````
import java.io.*;

import java.util.*;

public class Main {

    public static void main(String args[]) throws Exception {

    Scanner sc = new Scanner(System.in);
    int mount = sc.nextInt();
    double cost;
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
````
### easy.P1085 [不高兴的津津](https://www.luogu.org/problemnew/show/P1085)
````



````