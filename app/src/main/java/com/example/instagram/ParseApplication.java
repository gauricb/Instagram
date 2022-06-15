package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //register parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("QfxfrKRA0RqYh1V1CvCKjRgFNMwACX1MQjwzdBG0")
                .clientKey("hyiejjT0oQwlwfw4poifkNrswXxxfQGh95DEaTPS")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
