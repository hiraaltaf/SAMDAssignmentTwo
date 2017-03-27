package com.example.hira.customlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    private String[] namesArray = {"Hira Altaf","Ramsha Mustafa","Sadaf Iftikhar","Fazila Shamz",
            "Irsa Abbasi","Ayesha Waris","Shanza Khan","Shanzae Aslam","Arslan Amjad"
            ,"Bilal Ahmed","Choudry Ali","Danish Ali","Eman Fatima","Farwa Waheed"
            ,"Gulsher Ahmed","Iram Shafique","Joddat Fatime","Kiran Aleem","Laiba Zafar"
            ,"Madiha Umer","Nouman Ali","Osama Anwar","Palwasha Khattak"
            ,"Qaiser Javed","Talha Ali","Umer Ali","Vesish Sharma","Waleed Kahn"
            ,"X Men","Yasir Ali","Zeshan ALi","Aleem Ahmed","Beenish Khan","Changeez Khan"
            ,"Dawood Shah","Ebrahim Ali","Farooq Khan","Gulrez Khan","Hina Malik"
            ,"Ilyas Hussain","Jamsheed Ali","Kainat Bibi","Laila Khan","Mehwish Zafar"
            ,"Noreen Ashfaq","Omer Khayyam","Parveen Shah","Qasim ALi","Rida Anwar"
            ,"Saba Ali","Tanveer Khan","Usman Ali"};
    private String[] numbersArray = {"03111111111","03411234567","03401234567","03421234567","03101234567","03121234567"
            ,"03131234567","03141234567","03001234567","03011234567","03021234567","03031234567","03231234567","03121234567"
            ,"03041234567","03051234567","03061234567","03071234567","01211234567","03231234567","03401234567","03461234567"
            ,"03110020020","03341234567","03351234567","03221234567","03231234567","03401234567","03401234567","03001234567"
            ,"03411234567","03421234567","03431234567","03441234567","03451234567","03461234567","03061234567","03421234567"
            ,"03451234567","03421234567","03351234567","03071234567","03111111111","03411234567","03401234567","03421234567"
            ,"03101234567","03121234567","03351234567","03061234567","03071234567","01211234567"};
    private String[] namef2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        namef2=new String[namesArray.length];

        lv = (ListView) findViewById(R.id.list_view);

        Arrays.sort(namesArray);
        Log.d("onCreate: " , String.valueOf(namesArray.length) + " " + String.valueOf(numbersArray.length));
        ArrayList<ListDat> data = new ArrayList<ListDat>();
        for (int i = 0; i < namesArray.length; i++) {
            namef2[i]=getNameLetters( namesArray[i]);
            data.add(new ListDat(namesArray[i],numbersArray[i],namef2[i]));
        }


        CustomListViewAdapter adapter = new CustomListViewAdapter(getApplicationContext(), data );
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                ListDat textValue = (ListDat) adapterView.getItemAtPosition(position);
                Log.d("List value", "onItemClick: "+textValue.getName()+" "+ textValue.getNumber() +" "+ textValue.cicleText);
                Intent listViewDetailActivityIntent = new Intent(MainActivity.this, ListViewDetailActivity.class);
                String strName = textValue.getName();
                String strNumber = textValue.getNumber();
                String strCircleText = textValue.getCicleText();
                listViewDetailActivityIntent.putExtra("name", strName);
                listViewDetailActivityIntent.putExtra("number", strNumber);
                listViewDetailActivityIntent.putExtra("circleText", strCircleText);
                startActivity( listViewDetailActivityIntent);
            }
        });
    }
    public String getNameLetters(String name)
    {
        int spaceIndex = name.indexOf(' ');

        String firstName = name.substring(0,1);
        String secondName = null;
        if (spaceIndex != -1)
        {
            secondName = name.substring(spaceIndex+1,spaceIndex+2);
        }

        return  firstName+secondName;
    }

}
