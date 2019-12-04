package String;

import java.io.UnsupportedEncodingException;

public class StringMethods {
    private static byte[] transform(byte[] b, String fromCharset, String toCharset) throws UnsupportedEncodingException {
        String s = new String(b, fromCharset);
        return s.getBytes(toCharset);
    }

    private static boolean isNumber(String s) {
        for (char c : s.toCharArray()) {
            /*
            //判断是否为数字
            if (!Character.isDigit(c)) {
                return false;
            }
            */
            if (c < '0' || c > '9') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        //利用String转化为byte   实现字符集编码的转化
        byte[] s = "中国人".getBytes("GB18030");
        for (byte b : s) {
            System.out.printf("\\x%x", b);
        }
        System.out.println();
        byte[] p = transform(s, "GB18030", "UTF-8");
        for (byte b : p) {
            System.out.printf("\\x%x", b);
        }
        System.out.println();

        //比较两个字符串大小关系
        System.out.println("abc".compareTo("bbc")); // < 0
        System.out.println("abc".compareTo("abcd"));    // < 0
        //a < b 导致整个字符串都小了
        System.out.println("abc".compareTo("bbcd"));    // < 0

    }
}

