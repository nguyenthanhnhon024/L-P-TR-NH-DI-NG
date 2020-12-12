package com.example.coffee_house.Bottom_Navigation_View_Order.Tab_Layout_Common;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.fragment.app.Fragment ;

import com.example.coffee_house.R;

import java.util.ArrayList ;


public class Order_Fragment_One extends Fragment
{
    ArrayList<Order_Fragment_One_Items> ARRAY_LIST_OFOI_333;
    Context CONTEXT_333;
    GridView ORDER_FRAGMENT_ONE_GV_333;
    Order_Fragment_One_Adapter ORDER_FRAGMENT_ONE_ADAPTER_333;
    Order_Fragment_One_Items ORDER_FRAGMENT_ONE_ITEMS_333;
    RelativeLayout RELATETIVE_LAYOUT_333;
    
    @SuppressLint("WrongViewCast")
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState);
        CONTEXT_333 = getActivity();
        View root = inflater.inflate(R.layout.order_fragment_one, container, false);
        
        ORDER_FRAGMENT_ONE_GV_333 = root.findViewById(R.id.ORDER_FRAGMENT_ONE_GV);
        RELATETIVE_LAYOUT_333 = root.findViewById(R.id.ORDER_FRAGMENT_ONE_ITEMS_RL);
        
        ARRAY_LIST_OFOI_333 = new ArrayList<>();
        //add Countries Data
        muahang();
        populateProductData();
        ORDER_FRAGMENT_ONE_ADAPTER_333 = new Order_Fragment_One_Adapter(CONTEXT_333,ARRAY_LIST_OFOI_333);
        ORDER_FRAGMENT_ONE_GV_333.setAdapter(ORDER_FRAGMENT_ONE_ADAPTER_333);
        registerForContextMenu(ORDER_FRAGMENT_ONE_GV_333);
        ORDER_FRAGMENT_ONE_GV_333.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(CONTEXT_333,ARRAY_LIST_OFOI_333.get(position).getNamesp(), Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }
    private void populateProductData() {
        //product1
        ORDER_FRAGMENT_ONE_ITEMS_333 = new Order_Fragment_One_Items();
        ORDER_FRAGMENT_ONE_ITEMS_333.setId(1);
        ORDER_FRAGMENT_ONE_ITEMS_333.setNamesp("Cà phê Lúa Mạch đá");
        ORDER_FRAGMENT_ONE_ITEMS_333.setImagesp(R.drawable.image_common_01);
        ORDER_FRAGMENT_ONE_ITEMS_333.setGiasp("69.000 đ");
        ARRAY_LIST_OFOI_333.add(ORDER_FRAGMENT_ONE_ITEMS_333);

        //product2
        ORDER_FRAGMENT_ONE_ITEMS_333 = new Order_Fragment_One_Items();
        ORDER_FRAGMENT_ONE_ITEMS_333.setId(2);
        ORDER_FRAGMENT_ONE_ITEMS_333.setNamesp("Cà phê Lúa Mạch nóng");
        ORDER_FRAGMENT_ONE_ITEMS_333.setImagesp(R.drawable.image_common_02);
        ORDER_FRAGMENT_ONE_ITEMS_333.setGiasp("69.000 đ");
        ARRAY_LIST_OFOI_333.add(ORDER_FRAGMENT_ONE_ITEMS_333);

        //product3
        ORDER_FRAGMENT_ONE_ITEMS_333 = new Order_Fragment_One_Items();
        ORDER_FRAGMENT_ONE_ITEMS_333.setId(3);
        ORDER_FRAGMENT_ONE_ITEMS_333.setNamesp("Socola Lúa Mạch đá xay");
        ORDER_FRAGMENT_ONE_ITEMS_333.setImagesp(R.drawable.image_common_03);
        ORDER_FRAGMENT_ONE_ITEMS_333.setGiasp("69.000 đ");
        ARRAY_LIST_OFOI_333.add(ORDER_FRAGMENT_ONE_ITEMS_333);

        //product4
        ORDER_FRAGMENT_ONE_ITEMS_333 = new Order_Fragment_One_Items();
        ORDER_FRAGMENT_ONE_ITEMS_333.setId(4);
        ORDER_FRAGMENT_ONE_ITEMS_333.setNamesp("Socola Lúa Mạch nóng");
        ORDER_FRAGMENT_ONE_ITEMS_333.setImagesp(R.drawable.image_common_04);
        ORDER_FRAGMENT_ONE_ITEMS_333.setGiasp("69.000 đ");
        ARRAY_LIST_OFOI_333.add(ORDER_FRAGMENT_ONE_ITEMS_333);

        //product5
        ORDER_FRAGMENT_ONE_ITEMS_333 = new Order_Fragment_One_Items();
        ORDER_FRAGMENT_ONE_ITEMS_333.setId(5);
        ORDER_FRAGMENT_ONE_ITEMS_333.setNamesp("Macca Phủ Socola");
        ORDER_FRAGMENT_ONE_ITEMS_333.setImagesp(R.drawable.image_common_05);
        ORDER_FRAGMENT_ONE_ITEMS_333.setGiasp("45.000 đ");
        ARRAY_LIST_OFOI_333.add(ORDER_FRAGMENT_ONE_ITEMS_333);

        //product6
        ORDER_FRAGMENT_ONE_ITEMS_333 = new Order_Fragment_One_Items();
        ORDER_FRAGMENT_ONE_ITEMS_333.setId(6);
        ORDER_FRAGMENT_ONE_ITEMS_333.setNamesp("Cà Phê Sữa Đá");
        ORDER_FRAGMENT_ONE_ITEMS_333.setImagesp(R.drawable.image_common_06);
        ORDER_FRAGMENT_ONE_ITEMS_333.setGiasp("32.000 đ");
        ARRAY_LIST_OFOI_333.add(ORDER_FRAGMENT_ONE_ITEMS_333);

        //product7
        ORDER_FRAGMENT_ONE_ITEMS_333 = new Order_Fragment_One_Items();
        ORDER_FRAGMENT_ONE_ITEMS_333.setId(7);
        ORDER_FRAGMENT_ONE_ITEMS_333.setNamesp("Trà sữa Mắc Ca Trân Châu Trắng");
        ORDER_FRAGMENT_ONE_ITEMS_333.setImagesp(R.drawable.image_common_07);
        ORDER_FRAGMENT_ONE_ITEMS_333.setGiasp("45.000 đ");
        ARRAY_LIST_OFOI_333.add(ORDER_FRAGMENT_ONE_ITEMS_333);

        //product8
        ORDER_FRAGMENT_ONE_ITEMS_333 = new Order_Fragment_One_Items();
        ORDER_FRAGMENT_ONE_ITEMS_333.setId(8);
        ORDER_FRAGMENT_ONE_ITEMS_333.setNamesp("Trà Đào Cam Sả - Đá");
        ORDER_FRAGMENT_ONE_ITEMS_333.setImagesp(R.drawable.image_common_08);
        ORDER_FRAGMENT_ONE_ITEMS_333.setGiasp("45.000 đ");
        ARRAY_LIST_OFOI_333.add(ORDER_FRAGMENT_ONE_ITEMS_333);

        //product9
        ORDER_FRAGMENT_ONE_ITEMS_333 = new Order_Fragment_One_Items();
        ORDER_FRAGMENT_ONE_ITEMS_333.setId(9);
        ORDER_FRAGMENT_ONE_ITEMS_333.setNamesp("Oolong Hạt Sen - Đá");
        ORDER_FRAGMENT_ONE_ITEMS_333.setImagesp(R.drawable.image_common_09);
        ORDER_FRAGMENT_ONE_ITEMS_333.setGiasp("45.000 đ");
        ARRAY_LIST_OFOI_333.add(ORDER_FRAGMENT_ONE_ITEMS_333);
    }

    private void muahang()
    {
        ORDER_FRAGMENT_ONE_GV_333.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Dialog dialog = new Dialog(Order_Fragment_One.this.getActivity());
                dialog.setContentView(R.layout.order_fragment_one_items_detail);
                dialog.show();

            }
        });

        ORDER_FRAGMENT_ONE_GV_333.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog = new Dialog(Order_Fragment_One.this.getActivity());
                dialog.setContentView(R.layout.order_fragment_one_items_detail);
                dialog.show();
                return true;
            }
        });
    }

}

/*
public class Order_Fragment_One extends Fragment
{
    List< Order_Fragment_One_Items > LIST_OFOI_333 ;
    Order_Fragment_One_Items OFOI_333 ;
    RecyclerView RECYCLER_VIEW_333 ;
    ImageView IMAGE_VIEW_333;
    TextView TV_PRICE_333 , TV_TITLE_333 ;

    @Nullable
    @Override
    public View onCreateView( LayoutInflater LAYOUT_INFLATER , @Nullable ViewGroup VIEW_GROUP , Bundle savedInstanceState )
    {
        View VIEW = LAYOUT_INFLATER.inflate( R.layout.order_fragment_one , VIEW_GROUP , false ) ;

        IMAGE_VIEW_333 = VIEW.findViewById( R.id.ORDER_FRAGMENT_ONE_ITEMS_IV ) ;
        RECYCLER_VIEW_333 = ( RecyclerView ) VIEW.findViewById( R.id.ORDER_FRAGMENT_ONE_RV ) ;
        TV_PRICE_333 = VIEW.findViewById( R.id.ORDER_FRAGMENT_ONE_ITEMS_TV_TITLE ) ;
        TV_TITLE_333 = VIEW.findViewById( R.id.ORDER_FRAGMENT_ONE_ITEMS_TV_PRICE ) ;

        LIST_OFOI_333 = new ArrayList<> () ;
        OFOI_333 = new Order_Fragment_One_Items( R.drawable.icon_face , "" , "") ;
        LIST_OFOI_333.add( OFOI_333 ) ;
        OFOI_333 = new Order_Fragment_One_Items( R.drawable.icon_face , "" , "") ;
        LIST_OFOI_333.add( OFOI_333 ) ;
        OFOI_333 = new Order_Fragment_One_Items( R.drawable.icon_face , "" , "") ;
        LIST_OFOI_333.add( OFOI_333 ) ;

        Order_Fragment_One_Adapter OFOI_ADAPTER = new Order_Fragment_One_Adapter( getActivity() , LIST_OFOI_333 ) ;
        RECYCLER_VIEW_333.setAdapter( OFOI_ADAPTER ) ;

        LinearLayoutManager LINEAR_LAYOUT_MANAGEMENT = new LinearLayoutManager( getActivity() , LinearLayoutManager.HORIZONTAL , false ) ;
        RECYCLER_VIEW_333.setLayoutManager( LINEAR_LAYOUT_MANAGEMENT ) ;

        return VIEW ;
    }
}
*/