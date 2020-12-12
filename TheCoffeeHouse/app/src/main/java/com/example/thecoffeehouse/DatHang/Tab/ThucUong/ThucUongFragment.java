package com.example.thecoffeehouse.DatHang.Tab.ThucUong;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.thecoffeehouse.DatHang.Tab.PhoBien.ProductAdapter;
import com.example.thecoffeehouse.DatHang.Tab.PhoBien.ProductModel;
import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.TinTuc.LuaChonTinTuc.ListLuaChonTinTuc;
import com.example.thecoffeehouse.TinTuc.LuaChonTinTuc.LuaChonTinTucAdapter;
import com.example.thecoffeehouse.TinTuc.TinTucFragment;
import com.example.thecoffeehouse.TinTuc.UuDaiDacBIet.ListUuDaiDacBiet;

import java.util.ArrayList;
import java.util.List;


public class ThucUongFragment extends Fragment {

    Context context;
    RecyclerView gridcaphe,gridthucuongdaxay,gridtratraicay,gridmacchiato,gridchoco;
    List<ListThucUong> listcaphe,listthucuongdaxay,listtratraicay,listmacchiato,listchoco;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState);
        context=getActivity();
        View root= inflater.inflate(R.layout.fragment_thuc_uong, container, false);

        //Cà phê
        gridcaphe = root.findViewById(R.id.gridcaphe);
        listcaphe = new ArrayList<>();

        listcaphe.add(new ListThucUong(R.drawable.caphesuada,"Cà phê sữa đá","32.000đ"));
        listcaphe.add(new ListThucUong(R.drawable.bacxiu,"Bạc xỉu","32.000đ"));
        listcaphe.add(new ListThucUong(R.drawable.caphedaxaylanh,"Cà phê đá xay-lạnh","59.000đ"));
        listcaphe.add(new ListThucUong(R.drawable.latteda,"Latte đá","50.000đ"));
        listcaphe.add(new ListThucUong(R.drawable.coldbrewtt,"Cold Brew truyền thống","45.000đ"));
        listcaphe.add(new ListThucUong(R.drawable.coldbrewst,"Cold Brew sữa tươi","45.000đ"));

        GridLayoutManager manager1 = new GridLayoutManager(ThucUongFragment.this.getActivity(),2);
        manager1.setOrientation(GridLayoutManager.VERTICAL);
        gridcaphe.setLayoutManager(manager1);

        ThucUongAdapter adaptor1 = new ThucUongAdapter(ThucUongFragment.this.getActivity(),listcaphe);
        gridcaphe.setAdapter(adaptor1);
        registerForContextMenu(gridcaphe);


        //Thức uống đá xay
        gridthucuongdaxay = root.findViewById(R.id.gridthucuongdaxay);
        listthucuongdaxay = new ArrayList<>();

        listthucuongdaxay.add(new ListThucUong(R.drawable.phucbontudx,"Phúc bồn tử cam đá xay","59.000đ"));
        listthucuongdaxay.add(new ListThucUong(R.drawable.caphedaxaylanh,"Cà phê đá xay - lạnh","59.000đ"));
        listthucuongdaxay.add(new ListThucUong(R.drawable.cookiedaxay,"Cookie đá xay","59.000đ"));
        listthucuongdaxay.add(new ListThucUong(R.drawable.daovietquatdx,"Đào việt quất đá xay","59.000đ"));
        listthucuongdaxay.add(new ListThucUong(R.drawable.chocolatedx,"Chocolate đá xay","59.000đ"));
        listthucuongdaxay.add(new ListThucUong(R.drawable.matchadx,"MatCha đá xay","59.000đ"));
        listthucuongdaxay.add(new ListThucUong(R.drawable.chanhxadx,"Chanh sả đá xay","49.000đ"));

        GridLayoutManager manager2 = new GridLayoutManager(ThucUongFragment.this.getActivity(),2);
        manager2.setOrientation(GridLayoutManager.VERTICAL);
        gridthucuongdaxay.setLayoutManager(manager2);

        ThucUongAdapter adaptor2 = new ThucUongAdapter(ThucUongFragment.this.getActivity(),listthucuongdaxay);
        gridthucuongdaxay.setAdapter(adaptor2);

        // Trà  trái cây
        gridtratraicay = root.findViewById(R.id.gridtratraicay);
        listtratraicay = new ArrayList<>();

        listtratraicay.add(new ListThucUong(R.drawable.phucbontudx,"Trà phúc bồn tử","50.000đ"));
        listtratraicay.add(new ListThucUong(R.drawable.tradaocamsada,"Trà đào cam sả - đá","45.000đ"));
        listtratraicay.add(new ListThucUong(R.drawable.trasuamaccatranchautrang,"Trà bưởi mật ong","50.000đ"));
        listtratraicay.add(new ListThucUong(R.drawable.olonghatsenda,"Olong hạt sen - nóng","52.000đ"));
        listtratraicay.add(new ListThucUong(R.drawable.tradaocamsada,"Trà đào cam sả - nóng","52.000đ"));
        listtratraicay.add(new ListThucUong(R.drawable.olonghatsenda,"Olong hạt sen - đá","45.000đ"));


        GridLayoutManager manager3 = new GridLayoutManager(ThucUongFragment.this.getActivity(),2);
        manager3.setOrientation(GridLayoutManager.VERTICAL);
        gridtratraicay.setLayoutManager(manager3);

        ThucUongAdapter adaptor3 = new ThucUongAdapter(ThucUongFragment.this.getActivity(),listtratraicay);
        gridtratraicay.setAdapter(adaptor3);

        //Macchiato
        gridmacchiato = root.findViewById(R.id.gridmacchiato);
        listmacchiato = new ArrayList<>();

        listmacchiato.add(new ListThucUong(R.drawable.trasuamaccatranchautrang,"Trà sữa mắc ca trân châu trắng","45.000đ"));
        listmacchiato.add(new ListThucUong(R.drawable.tradaocamsada,"Trà đen macchiato","42.000đ"));
        listmacchiato.add(new ListThucUong(R.drawable.matchadx,"Matcha Macchiato","45.000đ"));
        listmacchiato.add(new ListThucUong(R.drawable.tradaocamsada,"Trà xoài Macchiato đá","50.000đ"));
        listmacchiato.add(new ListThucUong(R.drawable.trasuamaccatranchautrang,"Trà lài Macchiato - lạnh","42.000đ"));
        listmacchiato.add(new ListThucUong(R.drawable.bacxiu,"Trà sữa khoai môn","42.000đ"));

        GridLayoutManager manager4 = new GridLayoutManager(ThucUongFragment.this.getActivity(),2);
        manager4.setOrientation(GridLayoutManager.VERTICAL);
        gridmacchiato.setLayoutManager(manager4);

        ThucUongAdapter adaptor4 = new ThucUongAdapter(ThucUongFragment.this.getActivity(),listmacchiato);
        gridmacchiato.setAdapter(adaptor4);

        //Choco - Matcha
        gridchoco = root.findViewById(R.id.gridchocomactcha);
        listchoco = new ArrayList<>();

        listchoco.add(new ListThucUong(R.drawable.socolaluamachda,"Socola lúa mạch đá xay","69.000đ"));
        listchoco.add(new ListThucUong(R.drawable.socolaluamachnong,"Socola lúa mạch nóng","69.000đ"));
        listchoco.add(new ListThucUong(R.drawable.chanhxadx,"Trà Matcha Latte nóng","59.000đ"));
        listchoco.add(new ListThucUong(R.drawable.matchadx,"Trà Matcha Latte đá","59.000đ"));
        listchoco.add(new ListThucUong(R.drawable.socolaluamachda,"Socola đá","59.000đ"));


        GridLayoutManager manager5 = new GridLayoutManager(ThucUongFragment.this.getActivity(),2);
        manager5.setOrientation(GridLayoutManager.VERTICAL);
        gridchoco.setLayoutManager(manager5);

        ThucUongAdapter adaptor5 = new ThucUongAdapter(ThucUongFragment.this.getActivity(),listchoco);
        gridchoco.setAdapter(adaptor5);

        return root;
    }


}