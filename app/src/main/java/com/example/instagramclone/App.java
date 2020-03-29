package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("YAZtOXIeghNXTef5OFqTwkRc5MmJBO49Nqi7ip9a")
                // if defined
                .clientKey("SCg5QxmcZIsJq19GebDr6N8Vk94XokJ6NL5Q7vd9")
                .server("https://parseapi.back4app.com/")
                .build()
        );


    }

}