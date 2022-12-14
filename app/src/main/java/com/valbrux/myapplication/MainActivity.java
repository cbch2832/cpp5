package com.valbrux.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);
        tv.setText("System address: "+getSystem());
        TextView tv2 = findViewById(R.id.sample_text2);
        tv2.setText("ROP Gadget address: "+getROPGadget());
    }


    public native String getSystem();
    public native String getROPGadget();
}
