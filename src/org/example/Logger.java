package org.example;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger logger;
    private Logger() {}


    protected int num = 1;

    public void log(String msg) {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss\t");
        Date date = new Date();
        System.out.println("[" +df.format(date) + num++ + "] " + msg);

    }
    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}
