package me.jordancarlson.shortcuts;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;


// Shortcuts!

// Command + ,
// Ctrl + Alt + S

// Settings > Keymap > Find Action by Shortcut (Top Right)




// All Hail!   Alt + Enter / Option + Enter



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Toolbar tool =  findViewById(R.id.toolbar);

        // Extract into a local Variable
        // Command + Option + V
        // Ctrl + Alt + V

        (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        // Extract into a Field (Member Variable)
        // Command + Option + F
        // Ctrl + Alt + F

        FloatingActionButton fab1 = (FloatingActionButton) findViewById(R.id.fab);

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // Expand / Shrink Selection
                // Option + Up / Option + Down
                // Ctrl + W / Ctrl + Shift + W

                // Extract String Resource
                // Option + Enter / Alt + Enter

                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    // Override a method - Useful if you can't remember the method's name exactly.
    // Command + N
    // Alt + Insert   ---> Horrible. I would change it.



    // Filter List -- onPause()





// Personal Favorite: Smart Filtering
    // Open MyReallyLongNameActivity

    // Shift + Shift

    // MRLNA

}
