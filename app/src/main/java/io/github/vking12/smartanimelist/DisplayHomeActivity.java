package io.github.vking12.smartanimelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DisplayHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_home);

        // here you can place any information that might've been transferred between activities
        // right now we don't have any data transferred to this activity

        // this is your home page, have it so that all pages come back here if something else is pressed

    }
}
