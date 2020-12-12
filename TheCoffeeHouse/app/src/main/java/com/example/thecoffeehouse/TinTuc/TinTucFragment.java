package com.example.thecoffeehouse.TinTuc;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.TinTuc.LuaChonTinTuc.ListLuaChonTinTuc;
import com.example.thecoffeehouse.TinTuc.LuaChonTinTuc.LuaChonTinTucAdapter;
import com.example.thecoffeehouse.TinTuc.UuDaiDacBIet.ListUuDaiDacBiet;
import com.example.thecoffeehouse.TinTuc.UuDaiDacBIet.UuDaiDacBietAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class TinTucFragment extends Fragment {


    Context context;
    RecyclerView mList1,mListud,mListcntN,mListCL;
    List<ListLuaChonTinTuc> listlctt;
    List<ListUuDaiDacBiet> listud,listcntN,listCL;

    public TinTucFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_tin_tuc, container, false);

        // Lựa chọn tin tuc
        mList1 = root.findViewById(R.id.rcc_lctt);
        listlctt = new ArrayList<>();

        listlctt.add(new ListLuaChonTinTuc(R.drawable.tichdiem,"Tích điểm"));
        listlctt.add(new ListLuaChonTinTuc(R.drawable.dathang,"Đặt hàng"));
        listlctt.add(new ListLuaChonTinTuc(R.drawable.coupon,"Coupon"));
        listlctt.add(new ListLuaChonTinTuc(R.drawable.rewards,"Rewards"));

        GridLayoutManager manager1 = new GridLayoutManager(TinTucFragment.this.getActivity(),1);
        manager1.setOrientation(GridLayoutManager.HORIZONTAL);
        mList1.setLayoutManager(manager1);

        LuaChonTinTucAdapter adaptor1 = new LuaChonTinTucAdapter(TinTucFragment.this.getActivity(),listlctt);
        mList1.setAdapter(adaptor1);

        // Ưu đãi đặc biệt
        mListud = root.findViewById(R.id.rcc_uudaidacbiet);
        listud = new ArrayList<>();

        listud.add(new ListUuDaiDacBiet(R.drawable.uu20pt,"Hoàn đến 20%, thèm gì gọi Nhà mang tới liền","Hòa vào không khí siêu sale cuối năm, mời team mình nghỉ tay gọi món yêu thích"));
        listud.add(new ListUuDaiDacBiet(R.drawable.giamn20pt,"Thanh toán zalopay giảm ngày 20%","Tuần mới chỉ thật sự tươi tỉnh khi có một tách cà phê đậm đà kế bên. Nhanh tay"));
        listud.add(new ListUuDaiDacBiet(R.drawable.gn20vavoucher,"Trung thu thưởng trà - Quà bao la","Quà tặng bao la, thanh toán Zalopay giảm ngay 50%, tối đa 50k + Voucher 20k"));
        listud.add(new ListUuDaiDacBiet(R.drawable.voucher75k,"Nhận voucher 75k khi mở thẻ Timo","Tặng ngay voucher 100K khi mở thẻ Timo cùng bao la quà tặng hấp dẫn, giao dịch nhanh"));
        listud.add(new ListUuDaiDacBiet(R.drawable.laymagiamngay,"Golden Age - E-Voucher The Coffee House 45k","Chỉ cần nhập mã qua app, được nhận ngay Voucher 75k tha hồ đặt món, uống tha ga"));


        GridLayoutManager manager2 = new GridLayoutManager(TinTucFragment.this.getActivity(),1);
        manager2.setOrientation(GridLayoutManager.HORIZONTAL);
        mListud.setLayoutManager(manager2);

        UuDaiDacBietAdapter adaptor2 = new UuDaiDacBietAdapter(TinTucFragment.this.getActivity(),listud);
        mListud.setAdapter(adaptor2);

        //Cập nhật từ Nhà

        mListcntN = root.findViewById(R.id.rcc_capnhattunha);
        listcntN = new ArrayList<>();

        listcntN.add(new ListUuDaiDacBiet(R.drawable.cntn1,"Nhà Reverside Vũ Tông Phan - Hà Nội khai trương","Người ta dậy thì thành công, còn chúng mình dậy thì mang chiếc áo đủ ấm"));
        listcntN.add(new ListUuDaiDacBiet(R.drawable.cntn2,"Taste of Xmas - Chạm vị Giáng sinh","Năm nay tại Nhà, vị GIáng sinh mà bạn yêu thích, mong chờ từ trước đến nay"));
        listcntN.add(new ListUuDaiDacBiet(R.drawable.cntn3,"Trời se lạnh, thưởng thức ngay những món nóng","Chớm đầu Dông, những cươn mưa bất chợt làm trời se lạnh là thời điểm đến Nhà"));
        listcntN.add(new ListUuDaiDacBiet(R.drawable.cntn4,"Khám phá không gian Nhà Mới: Hiện đại, Sang trọng","Mô hình thiết kế mới tại Nhà mang đến không gian xinh đẹp vừa quen vừa lạ"));
        listcntN.add(new ListUuDaiDacBiet(R.drawable.cntn5,"Tất bật vì bạn - Là niềm vui của Shipper Nhà","Mỗi ngày shipper Nhà chọn niềm vui, chạy tới chạy lui mang món nước yêu thích"));


        GridLayoutManager manager3 = new GridLayoutManager(TinTucFragment.this.getActivity(),1);
        manager3.setOrientation(GridLayoutManager.HORIZONTAL);
        mListcntN.setLayoutManager(manager3);

        UuDaiDacBietAdapter adaptor3 = new UuDaiDacBietAdapter(TinTucFragment.this.getActivity(),listcntN);
        mListcntN.setAdapter(adaptor3);

        //CoffeeLover

        mListCL = root.findViewById(R.id.rcc_coffeelover);
        listCL = new ArrayList<>();

        listCL.add(new ListUuDaiDacBiet(R.drawable.cfl1,"Bản sắc nơi đất trồng, Một hành trình ","Cùng Nhà bắt đầu hành trình đầu tiên cùng Travel Blogger Nhị Đặng lên đường"));
        listCL.add(new ListUuDaiDacBiet(R.drawable.cfl2,"Hương vị Cà phê mới tại nhà Signature","Nhà Signature - nơi những hương vị nguyên bản tạo nên trải nghiệm khác biệt"));
        listCL.add(new ListUuDaiDacBiet(R.drawable.cfl3,"Costa Rica - Tách Hand Brew Mới ","Costa Rica - Tách Hand Brew đượm vị cho mùa hè của bạn thêm phần ngọt ngào"));
        listCL.add(new ListUuDaiDacBiet(R.drawable.cfl4,"Cold Brew nào phải Cà phê đá !","Cà phê pha lạnh và Cà phê đá lạnh nghe thì xêm xêm nhưng không có họ hàng gì"));
        listCL.add(new ListUuDaiDacBiet(R.drawable.cfl5,"Chuyện về chai tonic tại Nhà Signature","Với món Nitro Cold Brew Tonic, chai tonic sẽ được phục vụ riêng, để bạn thoái mái"));


        GridLayoutManager manager4 = new GridLayoutManager(TinTucFragment.this.getActivity(),1);
        manager4.setOrientation(GridLayoutManager.HORIZONTAL);
        mListCL.setLayoutManager(manager4);

        UuDaiDacBietAdapter adaptor4 = new UuDaiDacBietAdapter(TinTucFragment.this.getActivity(),listCL);
        mListCL.setAdapter(adaptor4);

        return root;
    }
}