package me.jordancarlson.shortcuts;


// Remove unused imports (optimize imports)

// Control + Option + O
// Ctrl + Alt + O

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


// Refactor
// Rename

// Shift + F6 --- maybe -- Shift + fn + F6
// Same on Windows

public class MyReallyLongNameActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_really_long_name);

        // Duplicate Line
        // Command + D
        // Ctrl + D

        // Delete Line
        // Control + Delete
        // Ctrl + Y

        // Copy Line

        // Cut Line



        // Show Method Parameters
        // Command + P
        // Ctrl + P

//        startActivityForResult();



        //--- Live Templates ---

        // Logging

        // logt, logd, logm, loge, logval


        List<String> myList = new ArrayList<>();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");

        String[] myArray = new String[2];
        myArray[0] = "zero";
        myArray[1] = "one";
        myArray[2] = "two";


        // Loops

        // fori, foreach

        // myList.for, myArray.fori






    }
}
