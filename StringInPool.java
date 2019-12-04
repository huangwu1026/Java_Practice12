package String;


public class StringInPool {
    public static void main(String[] args) {
        //常量池  前提 : 1.string对象很常见  2.string不可变
        //入常量池的对象 : 1.""
        //引用相等即指向同一个对象
        /*
        String s = "hello";
        String p = "hello";
        String q = "hello";
        // 故意判断引用是否指向同一个对象(不要这样写)
        System.out.println(s == p);
        System.out.println(q == p);
        // 判断字符串是否相等
        System.out.println(s.equals(p));
        System.out.println(s.equals(q));
        */

        /*
        String s = "hello";
        String p = new String(s);//在堆里面复制出对象hello   不指向同一个对象
        String q = new String(s);

        System.out.println(s.equals(p));
        System.out.println(s.equals(q));

        System.out.println(s == p);//不指向同一个对象
        System.out.println(s == q);//不指向同一个对象
        System.out.println(p == q);//不指向同一个对象 每次都构建一个新的对象
        */

        /*
        String s = "hello" + " " + "world";
        String p = "hello world";
        System.out.println(s == p);
        */

        //堆里的对象入池
        //检查池中是否有equal("hello"）d的对象
        // 如果有，直接返回池中对象的引用   如果没有，往池中放一个"hello"对象，返回池中的对象
        String s = "hello";
        String p = new String(s);//此时s p不指向同一个对象
        p = p.intern();//调用intern（） p一定指向池里面对象的引用(p不指向s  而指向池中的对象)
        System.out.println(s == p);

    }
}

