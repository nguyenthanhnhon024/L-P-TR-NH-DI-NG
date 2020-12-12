package com.example.thecoffeehouse.CuaHang;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.thecoffeehouse.DatHang.Tab.DoAn.DoAnFragment;
import com.example.thecoffeehouse.DatHang.Tab.ThucUong.ListThucUong;
import com.example.thecoffeehouse.DatHang.Tab.ThucUong.ThucUongAdapter;
import com.example.thecoffeehouse.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;

import java.util.ArrayList;
import java.util.List;


public class CuaHangFragment extends Fragment implements OnMapReadyCallback {

    private static CuaHangFragment INSTANCE=null;
    Context context;
    RecyclerView gridstore;
    List<ListThucUong> liststore;
    GoogleMap map;
    MapView mapView;
    Spinner spinnerdanhsach;

    public CuaHangFragment(){
    }
    public static CuaHangFragment getINSTANCE(){
        if (INSTANCE==null)
            INSTANCE=new CuaHangFragment();
        return INSTANCE;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState);
        context=getActivity();
        View root= inflater.inflate(R.layout.fragment_cua_hang, container, false);
// List cửa hàng
        gridstore = root.findViewById(R.id.rcc_store);
        liststore = new ArrayList<>();

        liststore.add(new ListThucUong(R.drawable.pasteur,"Quận Hải Châu","80 Pasteur"));
        liststore.add(new ListThucUong(R.drawable.trieunuvuong,"Quận Hải Châu","9 Triệu Nữ Vương"));
        liststore.add(new ListThucUong(R.drawable.leduan,"Quận Thanh Khê","435 Lê Duẩn"));
        liststore.add(new ListThucUong(R.drawable.nguyenchithanh,"Quận Hải Châu","80 Nguyễn C.Thanh"));
        liststore.add(new ListThucUong(R.drawable.nguyenvanlinh,"Quận Hải Châu","A4-2 Nguyễn V.Linh"));


        GridLayoutManager manager1 = new GridLayoutManager(CuaHangFragment.this.getActivity(),1);
        manager1.setOrientation(GridLayoutManager.HORIZONTAL);
        gridstore.setLayoutManager(manager1);

        CuaHangAdapter adaptor1 = new CuaHangAdapter(CuaHangFragment.this.getActivity(),liststore);
        gridstore.setAdapter(adaptor1);

        // Bản đồ
        spinnerdanhsach = root.findViewById ( R.id.spinner );
        ArrayList<String> arrayListdanhsach = new ArrayList<String> ();
        arrayListdanhsach.add("Cần Thơ");
        arrayListdanhsach.add("Thanh Hóa");
        arrayListdanhsach.add("Đồng Nai");
        arrayListdanhsach.add("Bình Dương");
        arrayListdanhsach.add("Hồ Chí Minh");
        arrayListdanhsach.add("Bà Rịa Vũng Tàu");
        arrayListdanhsach.add("Dak Lak");
        arrayListdanhsach.add("Đà Nẵng");
        arrayListdanhsach.add("Nghệ An");
        arrayListdanhsach.add("Hà Nội");
        arrayListdanhsach.add("Hải Phòng");
        arrayListdanhsach.add("Khánh Hòa");
        arrayListdanhsach.add("Thừa Thiên Huế");
        arrayListdanhsach.add("Bắc Ninh");
        arrayListdanhsach.add("Tiền Giang");

        ArrayAdapter arrayAdapter = new ArrayAdapter (CuaHangFragment.this.getActivity(), android.R.layout.simple_spinner_item,arrayListdanhsach );
        arrayAdapter.setDropDownViewResource ( android.R.layout.simple_spinner_dropdown_item );
        spinnerdanhsach.setAdapter ( arrayAdapter );

        //Bắt sự kiện cho Spinner, khi chọn phần tử nào thì hiển thị lên Toast
        spinnerdanhsach.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                //đối số postion là vị trí phần tử trong list Data
                Toast.makeText(CuaHangFragment.this.getActivity(),arrayListdanhsach.get ( position ), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                Toast.makeText(CuaHangFragment.this.getActivity(), "onNothingSelected", Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }
// Bản đồ
    @Override
    public void onViewCreated(@Nullable View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);
        mapView=view.findViewById(R.id.mapsView);
        if(mapView!=null){
            mapView.onCreate(null);
            mapView.onResume();
            mapView.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        MapsInitializer.initialize(getContext());
        map=googleMap;
    }


}