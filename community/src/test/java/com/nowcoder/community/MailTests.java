package com.nowcoder.community;


import com.nowcoder.community.util.MailCLient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MailTests {

    @Autowired
    private MailCLient mailCLient;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testTextMail(){
        mailCLient.sendMail("1192762248@qq.com", "TEST2", "shfhhfkhskfhejkhfewkhfe.");
    }

    @Test
    public void testHtmlMail(){
        Context context = new Context();
        context.setVariable("username","Sunday");
        String content = templateEngine.process("/mail/demo", context);
        System.out.println(content);

        mailCLient.sendMail("1192762248@qq.com","HTML",content);
    }

}
