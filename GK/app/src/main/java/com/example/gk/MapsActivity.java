package com.example.gk;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

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

    private GoogleMap gm_330;
    Spinner spinnerdanhsach_330;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        spinnerdanhsach_330 = findViewById ( R.id.spinner );
        final ArrayList<String> arrayListdanhsach = new ArrayList<String> ();
        arrayListdanhsach.add("Đà Nẵng");
        arrayListdanhsach.add("Cần Thơ");
        arrayListdanhsach.add("Thanh Hóa");
        arrayListdanhsach.add("Đồng Nai");
        arrayListdanhsach.add("Bình Dương");
        arrayListdanhsach.add("Hồ Chí Minh");
        arrayListdanhsach.add("Bà Rịa Vũng Tàu");
        arrayListdanhsach.add("Dak Lak");
        arrayListdanhsach.add("Nghệ An");
        arrayListdanhsach.add("Hà Nội");
        arrayListdanhsach.add("Hải Phòng");

        ArrayAdapter arrayAdapter = new ArrayAdapter (MapsActivity.this, android.R.layout.simple_spinner_item,arrayListdanhsach );
        arrayAdapter.setDropDownViewResource ( android.R.layout.simple_spinner_dropdown_item );
        spinnerdanhsach_330.setAdapter ( arrayAdapter );

        //Bắt sự kiện cho Spinner, khi chọn phần tử nào thì hiển thị lên Toast
        spinnerdanhsach_330.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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


        BottomNavigationView BottomNavigationView = findViewById(R.id.BNV);

        BottomNavigationView.setSelectedItemId(R.id.item_cuahang);

        BottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.item_tintuc:
                        Intent INTENT3_330 = new Intent(MapsActivity.this, MainActivity.class ) ;
                        startActivity( INTENT3_330 ) ;
                        overridePendingTransition(0,0);
                        return;
                    case R.id.item_dathang:
                        Intent INTENT2_330 = new Intent(MapsActivity.this, Main_Dathang.class ) ;
                        startActivity( INTENT2_330 ) ;
                        overridePendingTransition(0,0);
                        return;
                    case R.id.item_cuahang:
                        return;
                    case R.id.item_taikhoan:
                        Intent INTENT1_330 = new Intent(MapsActivity.this, Main_Login.class ) ;
                        startActivity( INTENT1_330 ) ;
                        overridePendingTransition(0,0);
                        return;
                }
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
        gm_330 = googleMap;
        gm_330.addMarker(new MarkerOptions().position(hcm).title("COFFEE HOUSE"));
        CameraPosition cp = new CameraPosition.Builder().target(hcm).zoom(16).build();
        gm_330.animateCamera(CameraUpdateFactory.newCameraPosition(cp));
    }
}