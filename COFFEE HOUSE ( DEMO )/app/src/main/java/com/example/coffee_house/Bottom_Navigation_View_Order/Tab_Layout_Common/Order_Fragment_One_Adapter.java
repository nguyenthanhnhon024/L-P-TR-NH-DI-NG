package com.example.coffee_house.Bottom_Navigation_View_Order.Tab_Layout_Common;

import android.content.Context ;
import android.view.LayoutInflater ;
import android.view.View ;
import android.view.ViewGroup ;
import android.widget.BaseAdapter;
import android.widget.ImageView ;
import android.widget.TextView ;

import com.example.coffee_house.R;

import java.util.ArrayList;

/*
public class Order_Fragment_One_Adapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();

    public Order_Fragment_One_Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }

    public void addFragment(Fragment fragment, String title)    {
        fragmentList.add(fragment);
        titleList.add(title);
    }

}
*/

public class Order_Fragment_One_Adapter extends BaseAdapter
{
    ArrayList<Order_Fragment_One_Items> ARRAY_LIST_OFOI_333;
    Context CONTEXT_333;
    LayoutInflater LAYOUT_INFLATER_333;
    Order_Fragment_One_Items ORDER_FRAGMENT_ONE_ITEMS_333;

    public Order_Fragment_One_Adapter(Context CONTEXT, ArrayList<Order_Fragment_One_Items> productData)
    {
        this.ARRAY_LIST_OFOI_333 = productData ;
        this.CONTEXT_333 = CONTEXT;
        LAYOUT_INFLATER_333 = (LayoutInflater) CONTEXT.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount()
    {
        return ARRAY_LIST_OFOI_333.size();
    }

    @Override
    public Object getItem(int i)
    {
        return ARRAY_LIST_OFOI_333.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return ARRAY_LIST_OFOI_333.get(i).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup)
    {
        View view1 = view;
        if (view1==null)
        {
            view1 = LAYOUT_INFLATER_333.inflate(R.layout.order_fragment_one_items,null, true);
        }

        TextView name = view1.findViewById(R.id.ORDER_FRAGMENT_ONE_ITEMS_TV_TITLE);
        ImageView image = view1.findViewById(R.id.ORDER_FRAGMENT_ONE_ITEMS_IV);
        TextView gia = view1.findViewById(R.id.ORDER_FRAGMENT_ONE_ITEMS_TV_PRICE);

        ORDER_FRAGMENT_ONE_ITEMS_333 = ARRAY_LIST_OFOI_333.get(position);
        name.setText(ORDER_FRAGMENT_ONE_ITEMS_333.getNamesp());
        image.setImageResource(ORDER_FRAGMENT_ONE_ITEMS_333.getImagesp());
        gia.setText(ORDER_FRAGMENT_ONE_ITEMS_333.getGiasp());

        return view1;
    }
}

/*
public class Order_Fragment_One_Adapter extends RecyclerView.Adapter< Order_Fragment_One_Items_View_Holder >
{
    private Context CONTEXT_333 ;
    private List< Order_Fragment_One_Items > LIST_OFOI_333 ;

    public Order_Fragment_One_Adapter( Activity CONTEXT , List< Order_Fragment_One_Items > LIST_OFOI )
    {
        this.CONTEXT_333 = CONTEXT ;
        this.LIST_OFOI_333 = LIST_OFOI ;
    }

    @NonNull
    @Override
    public Order_Fragment_One_Items_View_Holder onCreateViewHolder( @NonNull ViewGroup VIEW_GROUP , int VIEW_TYPE )
    {
        View VIEW = LayoutInflater.from( VIEW_GROUP.getContext()).inflate( R.layout.order_fragment_one_items , VIEW_GROUP , false ) ;
        return new Order_Fragment_One_Items_View_Holder( VIEW ) ;
    }

    @Override
    public void onBindViewHolder( @NonNull final Order_Fragment_One_Items_View_Holder OFOI_VIEW_HOLDER , int POSITION )
    {
        OFOI_VIEW_HOLDER.ORDER_FRAGMENT_ONE_ITEMS_IV_333.setImageResource( LIST_OFOI_333.get( POSITION ).getORDER_FRAGMENT_ONE_ITEMS_IV()) ;
        OFOI_VIEW_HOLDER.ORDER_FRAGMENT_ONE_ITEMS_TV_TITLE_333.setText( LIST_OFOI_333.get( POSITION ).getORDER_FRAGMENT_ONE_ITEMS_TV_PRICE());
        OFOI_VIEW_HOLDER.ORDER_FRAGMENT_ONE_ITEMS_TV_PRICE_333.setText( LIST_OFOI_333.get( POSITION ).getORDER_FRAGMENT_ONE_ITEMS_TV_TITLE());

    }

    @Override
    public int getItemCount()
    {
        return LIST_OFOI_333.size() ;
    }
}

class Order_Fragment_One_Items_View_Holder extends RecyclerView.ViewHolder
{
    CardView ORDER_FRAGMENT_ONE_ITEMS_CV_333 ;
    ImageView ORDER_FRAGMENT_ONE_ITEMS_IV_333 ;
    TextView ORDER_FRAGMENT_ONE_ITEMS_TV_PRICE_333 , ORDER_FRAGMENT_ONE_ITEMS_TV_TITLE_333 ;

    public Order_Fragment_One_Items_View_Holder( @NonNull View VIEW )
    {
        super( VIEW ) ;
        ORDER_FRAGMENT_ONE_ITEMS_CV_333 = VIEW.findViewById( R.id.ORDER_FRAGMENT_ONE_ITEMS_CV ) ;
        ORDER_FRAGMENT_ONE_ITEMS_IV_333 = VIEW.findViewById( R.id.ORDER_FRAGMENT_ONE_ITEMS_IV ) ;
        ORDER_FRAGMENT_ONE_ITEMS_TV_PRICE_333 =  VIEW.findViewById( R.id.ORDER_FRAGMENT_ONE_ITEMS_TV_PRICE ) ;
        ORDER_FRAGMENT_ONE_ITEMS_TV_TITLE_333 = VIEW.findViewById( R.id.ORDER_FRAGMENT_ONE_ITEMS_TV_TITLE ) ;

    }
}
*/
