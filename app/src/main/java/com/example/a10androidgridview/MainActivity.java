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
    HinhAnhAdapter adapter;
    ArrayList<HinhAnh> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView1 = findViewById(R.id.gridView1);
        arrayList = new ArrayList<>();
        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
        arrayList.add(new HinhAnh("Dừa", R.mipmap.aaa));
        arrayList.add(new HinhAnh("Sầu Riêng", R.mipmap.saurieng));
        arrayList.add(new HinhAnh("Đào", R.mipmap.dao));
        adapter = new HinhAnhAdapter(MainActivity.this, R.layout.dong_hinh_anh, arrayList);
        gridView1.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
