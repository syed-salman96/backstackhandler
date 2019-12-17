package com.salman.backstackhandling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.salman.backstackhandling.fragments.FragmentFive;
import com.salman.backstackhandling.fragments.FragmentFour;
import com.salman.backstackhandling.fragments.FragmentOne;
import com.salman.backstackhandling.fragments.FragmentThree;
import com.salman.backstackhandling.fragments.FragmentTwo;
import com.salman.handlebackstack.classes.BackStack;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Button change;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        change = findViewById(R.id.change);

        Map<String, Integer> weightHashMap = new HashMap<>();
        weightHashMap.put("FragmentOne", 1);
        weightHashMap.put("FragmentTwo", 2);
        weightHashMap.put("FragmentThree", 3);
        weightHashMap.put("FragmentFour", 2);
        weightHashMap.put("FragmentFive", 3);

        BackStack backStack = new BackStack(weightHashMap);

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (count){
                    case 0:
                        BackStack.replaceFragment(MainActivity.this, R.id.container, FragmentOne.newInstance(),"FragmentOne");
                        count++;
                        break;
                    case 1:
                        BackStack.replaceFragment(MainActivity.this, R.id.container, FragmentTwo.newInstance(),"FragmentTwo");
                        count++;
                        break;
                    case 2:
                        BackStack.replaceFragment(MainActivity.this, R.id.container, FragmentThree.newInstance(),"FragmentThree");
                        count++;
                        break;
                    case 3:
                        BackStack.replaceFragment(MainActivity.this, R.id.container, FragmentFour.newInstance(),"FragmentFour");
                        count++;
                        break;
                    case 4:
                        BackStack.replaceFragment(MainActivity.this, R.id.container, FragmentFive.newInstance(),"FragmentFive");
                        count++;
                        break;
                }
            }
        });

    }
}
