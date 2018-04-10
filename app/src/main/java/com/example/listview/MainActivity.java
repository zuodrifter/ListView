package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private final static String NAME="name";
    private final static String CLASS_NO="class_no";
    private final static String SEX="sex";
    private final static String PHONE="phone";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] names={"大当家唐玄奘","二当家悟空","三当家悟能","仆人悟净","坐骑小白"};
        String[] class_nos={"001班","002班","003班","004班","005班"};
        String[] sexs={"男","男","男","男","牲口"};
        String[] phones={"18856455298","15564892673","15936467942","18208414483","18110673468"};
        List<Map<String, Object>> items=new ArrayList<>();

        /*显式类型参数String，Object可以用<>替换
        该检查报告可以用钻石类型<>替换的所有类型参数的新表达式
        Java 1.6或更早版本的JVM不支持这种<>语法。*/

        for(int i=0;i<names.length;i++) {
            Map<String, Object> item = new HashMap<>();
            item.put(NAME, names[i]);
            item.put(CLASS_NO,class_nos[i]);
            item.put(SEX, sexs[i]);
            item.put(PHONE, phones[i]);
            items.add(item);
        }
        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.item,new String[]{NAME,CLASS_NO,SEX,PHONE},new int[]{R.id.name,R.id.class_no,R.id.sex,R.id.phone});
        ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);

    }
}