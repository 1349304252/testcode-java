package day01;

class Demo {
    public static void main(String[] args) {
        //数据类型
        byte b = 4;
        long c = 111111111111111112L;
        int r = 10;
        float e = 1.6f;
        double da = 2.22;
        char d = '1';
        String f = "1";
        boolean g = true;
        b = (byte) (r + b);//强制转换
        da = (int) (e + da);//强制转换
        byte b1 = 127;
        b1 = 127;
        byte b2 = 3;
        byte b3 = 3;
        b3 = (byte) (b1 + b2);
        int x1 = 2147483647;
        int x2 = 2147483647;
        int x3 = Integer.MAX_VALUE;
        System.out.println(x3);
        x3 = x1 + x2;
        System.out.println(x3);
        System.out.println(b3);
        System.out.println('a' + 1);
        System.out.println('a' + 3);
        System.out.println(b);
        System.out.println(da);
        int xx = 7712;
        xx = xx / 100;
        System.out.println(xx);
        int xx1 = 8812;
        xx1 = xx1 % 100;
        System.out.println(xx1);
        System.out.println(5 + 5 + "2" + "5+5" + (5 + 5));
        System.out.println("a=" + 3);
        int aa = 5;
        System.out.println(7 > aa || aa > 2);
        System.out.println(!true);
        System.out.println(6 | 3);//6的二进制与3的二进制进行 或运算
        System.out.println(6 & 3);//6的二进制与3的二进制进行 与运算
        System.out.println(3 << 3);//左移运算，3的二进制最右边补3个零，转成十进制数
        System.out.println(3 >>> 1);//右移运算，3的二进制移除右边3个数，左边补零，转成十进制数
        int xxxx = 1, yyyy = 2, zzz = 3;
        xxxx = (yyyy > zzz) ? xxxx : zzz;
        System.out.println(xxxx);
//        Scanner ouy = new Scanner(System.in);
//        int x = ouy.nextInt(), y = ouy.nextInt(), z = ouy.nextInt();
//        int t;
//        if (x > y) {
//            t = x;
//            x = y;
//            z = t;
//        }
//        if (x > z) {
//            t = x;
//            x = z;
//            z = t;
//        }
//        if (y > z) {
//            t = y;
//            y = z;
//            z = t;
//        }
//        System.out.println(x + "," + y + "," + z);
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int a;
        switch (5) {
            case 1:
                System.out.println("a");
                break;
            case 2:
                break;
            default:
                System.out.println("d");
        }
        int w = 0;
        while (true) {
            w++;
            System.out.println(w);
            if (w == 2) {
                System.out.println("结束");
                break;
            }
        }
        int ew = 0;
        do {
            ew++;
            System.out.println("www");
        } while (ew < 0);
        StringBuffer bb = new StringBuffer("123");
        StringBuilder dd = new StringBuilder("abc");
        System.out.println(dd.append(1));
        bb.append("456");
        String vc = "a";
        System.out.println(bb);
        Demo demo=new Demo();
        demo.setq1(2);
        System.out.println(demo.getq1());
    }

    int q1, q2;

    public int getq1() {
        return q1;
    }
    public void setq1(int qq1){
        q1=qq1;
    }
}

