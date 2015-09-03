package com.valentine.yama;

/**
 * Created by valentine on 9/2/15.
 */
public class Myapp  extends android.app.Application{
@Override
public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "bDrxYwWkcBY0kjqk8yh333FBXspyYUJDQIkvB7uf", "9Eh1b8QHjAczgfBHNcrzyy4sBXml6bocKd2TQ1W6");
        ParseObject.registerSubclass(Task.class);
        }
        }
