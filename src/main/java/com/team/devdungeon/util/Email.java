package com.team.devdungeon.util;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;

import java.util.Random;

public class Email {

    private static String emailAddr = "date810@naver.com";
    private static String passwd = "!@yong8255";
    private static String hostName = "smtp.office365.com";
    private static int    port = 587;
    private static String name = "가지 커뮤니티";

    public static String att_num() {
        Random r = new Random();
        int num = r.nextInt(999999 - 100000 + 1)+ 100000;
        return Integer.toString(num);
    }

    public static void Mail(String email, String toName, String title, String msg) throws EmailException {
        HtmlEmail mail = new HtmlEmail();
        mail.setCharset("UTF-8");
        mail.setDebug(true);
        mail.setHostName(hostName);
        mail.setAuthentication(emailAddr, passwd);
        mail.setSmtpPort(port);
        mail.setStartTLSEnabled(true);
        mail.setFrom(emailAddr, name);

        mail.addTo(email);
        mail.setSubject(title);
        mail.setMsg(msg);

        mail.send();
    }

}
