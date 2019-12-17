package com.example.a10androidgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    GridView gridView1;
//    HinhAnhAdapter adapter;
//    ArrayList<HinhAnh> arrayList;




    HinhAnhAdapter1 hinhAnhAdapter1;
    ArrayList<HinhAnh1> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView1 = findViewById(R.id.gridView1);
//        arrayList = new ArrayList<>();
//        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
//        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
//        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
//        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
//        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
//        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
//        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
//        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
//        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
//        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
//        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
//        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
//        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
//        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
//        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
//        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
//        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
//        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
//        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
//        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
//        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
//        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
//        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
//        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
//        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
//        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
//        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
//        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
//        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
//        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
//        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
//        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
//        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
//        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
//        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
//        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
//        adapter = new HinhAnhAdapter(MainActivity.this, R.layout.dong_hinh_anh, arrayList);
//        gridView1.setAdapter(adapter);
//        adapter.notifyDataSetChanged();



        arrayList = new ArrayList<>();
        DataArray();
        hinhAnhAdapter1 = new HinhAnhAdapter1(arrayList, getApplicationContext());
        gridView1.setAdapter(hinhAnhAdapter1);
        hinhAnhAdapter1.notifyDataSetChanged();
    }
    public void DataArray()
    {
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/Sb4L_75T1d4/hqdefault.jpg", "GoKu SSJ"));
        arrayList.add(new HinhAnh1("https://i.ytimg.com/vi/3nF9PWO5wdE/maxresdefault.jpg", "GoKu SSJ3"));
    }
}
