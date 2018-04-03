package com.example.laurentiudragunoi.invataprinjoc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View decorView = getWindow().getDecorView();
// Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }
    // Opens FB page of Invata prin joc.

    public void openFb(View view) {
        Uri webpage = Uri.parse("https://www.facebook.com/Invataprinjoc/?ref=aymt_homepage_panel");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    //Opens Google plus page of Invata prin joc.

    public void openGoogle(View view) {
        Uri webpage = Uri.parse("https://plus.google.com/u/0/107178750760836408949");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    //Opens Twitter page of Invata prin joc.

    public void openTwitter(View view) {
        Uri webpage = Uri.parse("https://twitter.com/InvataJ");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
