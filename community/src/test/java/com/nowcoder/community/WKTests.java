package com.nowcoder.community;

import java.io.IOException;

public class WKTests {

    public static void main(String[] args) {
        String cmd = "d:/work/wkhtmltopdf/bin/wkhtmltoimage --quality 75  https://www.bilibili.com/ d:/work/data/wk-images/4.png";
        try {
            Runtime.getRuntime().exec(cmd);
            System.out.println("ok.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
