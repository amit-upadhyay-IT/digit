package com.amitupadhyay.digitsimplementation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.digits.sdk.android.Digits;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterCore;

import io.fabric.sdk.android.Fabric;

public class VerifiyItActivity extends AppCompatActivity {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "Th6P2CDvxTRJgPiwlto9Vd0Tz";
    private static final String TWITTER_SECRET = "AWAm1h3NiQBGDjOIzXIF2SyN5Qx4atKssU4DS6CajvphwxjOk4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new TwitterCore(authConfig), new Digits.Builder().build());
        setContentView(R.layout.activity_verifiy_it);
    }
}
