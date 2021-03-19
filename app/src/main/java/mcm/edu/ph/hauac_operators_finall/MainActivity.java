package mcm.edu.ph.hauac_operators_finall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import mcm.edu.ph.hauac_operators_finall.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView display;
        display = findViewById(R.id.displayTxt);
        int birthYear = 2002;
        int birthMonth = 4;
        int birthDay = 5;

        int currentYear = 2021;
        int currentMonth = 1;
        int currentDay = 27;

        int ageInYears,ageInMonths,ageInDays;


        if(birthMonth > currentMonth){
            currentMonth += 12;
            currentYear -= 1;
        }

        if(birthDay > currentDay){
            currentDay += 30;
            currentMonth -= 1;
        }

        ageInYears = currentYear - birthYear;
        ageInMonths = currentMonth - birthMonth;
        ageInDays = currentDay - birthDay;

        display.setText(" My precise age is"+
                String.valueOf(ageInYears)+
                "Years,\n"+
                String.valueOf(ageInMonths)+
                "Months,\n"+
                String.valueOf(ageInYears)+
                "Years,\n");

    }
}