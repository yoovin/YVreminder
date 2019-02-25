package com.yoovin.yvreminder;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //리스트뷰 아이템
    ArrayList<String> listMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AlertDialog.Builder addList = new AlertDialog.Builder(MainActivity.this); //알림창 인스턴트 만들기
        final EditText editItem = new EditText(MainActivity.this); //알림창에 들어갈 텍스트에딧 만들기
        ImageButton addButton = (ImageButton) findViewById(R.id.addButton); //아이템을 추가하기위한 버튼


        addList.setTitle("Title"); //알림창 타이틀 추가
        addList.setView(editItem); //텍스트에딧 추가

        listMenu = new ArrayList<String>();

        //리스트뷰를 띄우기 위한 어뎁터 코드
        final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listMenu);
        final ListView listView = (ListView) findViewById(R.id.list_reminder);
        listView.setAdapter(adapter);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {addList.show();}
        });
        addList.setPositiveButton("추가", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.v("추가버튼", "추가버튼클릭");
                String value = editItem.getText().toString();
                Log.v("추가버튼", value);
                if (!value.isEmpty()) {
                    listMenu.add(value);
                    adapter.notifyDataSetChanged();
                    }
                dialog.dismiss();
            }
        });
        addList.setNegativeButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.v("추가버튼", "취소버튼클릭");
                dialog.dismiss();
            }
        });
        }



    }
