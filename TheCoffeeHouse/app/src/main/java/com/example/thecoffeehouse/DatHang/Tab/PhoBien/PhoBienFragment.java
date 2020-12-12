package com.example.thecoffeehouse.DatHang.Tab.PhoBien;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.thecoffeehouse.R;

import java.util.ArrayList;

public class PhoBienFragment extends Fragment {


    GridView gridView;
    Context context;
    RelativeLayout gridviewdata;
    ArrayList<ProductModel> productData;
    ProductAdapter productAdapter;
    ProductModel productModel;

    @SuppressLint("WrongViewCast")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState);
        context=getActivity();
        View root = inflater.inflate(R.layout.fragment_pho_bien, container, false);
        gridView = root.findViewById(R.id.gridview);
        gridviewdata = root.findViewById(R.id.gridviewdata);
        productData = new ArrayList<>();

        //add Countries Data
        muahang();
        populateProductData();
        productAdapter = new ProductAdapter(context,productData);
        gridView.setAdapter(productAdapter);
        registerForContextMenu(gridView);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context,productData.get(position).getNamesp(), Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }
    private void populateProductData() {
        //product1
        productModel = new ProductModel();
        productModel.setId(1);
        productModel.setNamesp("Cà phê lúa mạch đá");
        productModel.setImagesp(R.drawable.capheluamachda);
        productModel.setGiasp("69.000 đ");
        productData.add(productModel);

        //product2
        productModel = new ProductModel();
        productModel.setId(2);
        productModel.setNamesp("Cà phê lúa mạch nóng");
        productModel.setImagesp(R.drawable.capheluamachnong);
        productModel.setGiasp("69.000 đ");
        productData.add(productModel);

        //product3
        productModel = new ProductModel();
        productModel.setId(3);
        productModel.setNamesp("Socola lúa mạch đá xay");
        productModel.setImagesp(R.drawable.socolaluamachda);
        productModel.setGiasp("69.000 đ");
        productData.add(productModel);

        //product4
        productModel = new ProductModel();
        productModel.setId(4);
        productModel.setNamesp("Socola lúa mạch nóng");
        productModel.setImagesp(R.drawable.socolaluamachnong);
        productModel.setGiasp("69.000 đ");
        productData.add(productModel);

        //product5
        productModel = new ProductModel();
        productModel.setId(5);
        productModel.setNamesp("Macca Phủ Socola");
        productModel.setImagesp(R.drawable.maccaphusocola);
        productModel.setGiasp("45.000 đ");
        productData.add(productModel);

        //product6
        productModel = new ProductModel();
        productModel.setId(6);
        productModel.setNamesp("Cà phê sữa đá");
        productModel.setImagesp(R.drawable.caphesuada);
        productModel.setGiasp("32.000 đ");
        productData.add(productModel);

        //product7
        productModel = new ProductModel();
        productModel.setId(7);
        productModel.setNamesp("Trà sữa Mắc Ca Trân Châu Trắng");
        productModel.setImagesp(R.drawable.trasuamaccatranchautrang);
        productModel.setGiasp("45.000 đ");
        productData.add(productModel);

        //product8
        productModel = new ProductModel();
        productModel.setId(8);
        productModel.setNamesp("Trà Đào Cam Sả - Đá");
        productModel.setImagesp(R.drawable.tradaocamsada);
        productModel.setGiasp("45.000 đ");
        productData.add(productModel);

        //product9
        productModel = new ProductModel();
        productModel.setId(9);
        productModel.setNamesp("Oolong Hạt Sen - Đá");
        productModel.setImagesp(R.drawable.olonghatsenda);
        productModel.setGiasp("45.000 đ");
        productData.add(productModel);
    }

    private void muahang() {
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Dialog dialog = new Dialog(PhoBienFragment.this.getActivity());
                dialog.setContentView(R.layout.dialog_dathang);
                dialog.show();
            }
        });
        gridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog = new Dialog(PhoBienFragment.this.getActivity());
                dialog.setContentView(R.layout.dialog_dathang);
                dialog.show();

                return true;
            }
        });
    }

}