package com.example.now;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.now.Adapter.DiaDiem_Adapter;
import com.example.now.Adapter.Menu_Adapter;
import com.example.now.DTO.DiaDiem;
import com.example.now.DTO.Menu;
import com.example.now.TruyVan.DiaDiem_TV;
import com.example.now.TruyVan.Menu_TV;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap gm;
    Spinner spinnerdanhsach;
    TextView IMAGE_BACK;

    GridView gv;
    ArrayList<DiaDiem> arrayList;
    DiaDiem_Adapter adapter;
    DiaDiem_TV diadiemTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        //Đổ dữ liệu ra map
        diadiemTV = new DiaDiem_TV(MapsActivity.this);
        arrayList = diadiemTV.getAll();
        gv = findViewById(R.id.GV_01);
        adapter = new DiaDiem_Adapter(MapsActivity.this, arrayList);
        gv.setAdapter(adapter);



        IMAGE_BACK = findViewById(R.id.back);
        IMAGE_BACK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });


        spinnerdanhsach = findViewById ( R.id.spinner );
        final ArrayList<String> arrayListdanhsach = new ArrayList<String> ();
        arrayListdanhsach.add("Đà Nẵng");
        arrayListdanhsach.add("Cần Thơ");
        arrayListdanhsach.add("Thanh Hóa");
        arrayListdanhsach.add("Đồng Nai");
        arrayListdanhsach.add("Bình Dương");
        arrayListdanhsach.add("Hồ Chí Minh");
        arrayListdanhsach.add("Bà Rịa Vũng Tàu");
        arrayListdanhsach.add("Đak Lak");
        arrayListdanhsach.add("Nghệ An");
        arrayListdanhsach.add("Hà Nội");
        arrayListdanhsach.add("Hải Phòng");

        ArrayAdapter arrayAdapter = new ArrayAdapter (MapsActivity.this, android.R.layout.simple_spinner_item,arrayListdanhsach );
        arrayAdapter.setDropDownViewResource ( android.R.layout.simple_spinner_dropdown_item );
        spinnerdanhsach.setAdapter ( arrayAdapter );

        //Bắt sự kiện cho Spinner, khi chọn phần tử nào thì hiển thị lên Toast
        spinnerdanhsach.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                //đối số postion là vị trí phần tử trong list Data
                Toast.makeText(MapsActivity.this,arrayListdanhsach.get ( position ), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                Toast.makeText(MapsActivity.this, "onNothingSelected", Toast.LENGTH_SHORT).show();
            }
        });


    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng hcm = new LatLng(16.0672657,108.2139959);
        gm = googleMap;
        gm.addMarker(new MarkerOptions().position(hcm).title("ĐH Sư Phạm Kỹ Thuật - ĐHĐN"));
        CameraPosition cp = new CameraPosition.Builder().target(hcm).zoom(16).build();
        gm.animateCamera(CameraUpdateFactory.newCameraPosition(cp));
    }
}