package com.example.coffee_house.Bottom_Navigation_View_News;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.coffee_house.Bottom_Navigation_View_Account.Account_Activity_Main;
import com.example.coffee_house.Bottom_Navigation_View_Account.Account_Login;
import com.example.coffee_house.Bottom_Navigation_View_Order.Order_Fragment_Activity_Main;
import com.example.coffee_house.Bottom_Navigation_View_Store.Store_Activity_Main;
import com.example.coffee_house.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class News_Activity_Main extends AppCompatActivity
{
    BottomNavigationView BOTTOM_NAVIGATION_VIEW_333 ;
    Button NEWS_ACTIVITY_MAIN_B_LOGIN_333 ;

    GridView NEWS_ACTIVITY_MAIN_GV_COFFEELOVER_333 , NEWS_ACTIVITY_MAIN_GV_MENU_333 , NEWS_ACTIVITY_MAIN_GV_OFFERS_333 , NEWS_ACTIVITY_MAIN_GV_UPDATE_333 ;

    private int [] NEWS_MENU_ITEMS_IV_333 = { R.drawable.image_earn_points , R.drawable.image_order , R.drawable.image_coupon } ;
    private String [] NEWS_MENU_ITEMS_TV_333 = { "Tích Điểm" , "Đặt Hàng" , "Coupon" } ;

    private int [] NEWS_OFFERS_ITEMS_IV_333 = { R.drawable.image_offers_01 , R.drawable.image_offers_02 , R.drawable.image_offers_03 ,
                                                R.drawable.image_offers_04 , R.drawable.image_offers_05 , R.drawable.image_offers_06 } ;
    private  String [] NEWS_OFFERS_ITEMS_TV_01_333 = { "Giảm 50% , thèm gì gọi nhé \nNhà mang tới liền" , "Nhà mời cà phê đậm đà, chỉ 12K" , "Nhà mời 20%, PICKUP nha" ,
                                                       "Bánh ngon Nhà mời, chỉ 19.000đ!" , "Mua 3 Tặng 1 - Mời nhóm mình chung vui" , "Team Hà Nội gọi combo trà mát, Nhà tặng ngay ly xịn sò" } ;
    private  String [] NEWS_OFFERS_ITEMS_TV_02_333 = { "Hoà vào không khí siêu sale \ncuối năm, mời team mình \nnghỉ tay gọi món yêu thích, N..." , "Tuần mới chỉ thật sự tươi tỉnh \nkhi có một tách cà phê đậm đà \nkề bên. Biết vậy nên Nhà mời..." ,
                                                       "Trải nghiệm ngay tính năng \nPICKUP của Nhà với ưu đãi \nGIẢM 20% cho đơn hàng chỉ ..." , "Cuối năm bận rộn thi cử, chạy \nsố, chiến \"deadline\" nhưng \nkhông được bỏ bữa nha ấy n..." ,
                                                       "Chỉ cần nhập mã CUNGVUI \nqua app, Nhà mời ngay ưu đãi \nMua 3 Tặng 1 - để team mình..." , "Nhận ngay ly nhựa 2 lớp \nxịn sò phiên bản Nắng Vàng \n(Quả dứa) và Biển Xanh (Con ..." } ;

    private int [] NEWS_UPDATE_ITEMS_IV_333 = { R.drawable.image_update_01 , R.drawable.image_update_02 ,
                                                R.drawable.image_update_03 , R.drawable.image_update_04 } ;
    private  String [] NEWS_UPDATE_ITEMS_TV_01_333 = { "Nhà Riverside Vũ Tông Phan \n- Hà Nội vui khai trương lin..." , "Taste of Xmas - Chạm vị Giáng sinh" ,
                                                       "Trời se lạnh, thưởng thức ngay những món nóng của ..." , "Cùng Nhà Trải Nghiệm \"PICK UP\"" } ;
    private  String [] NEWS_UPDATE_ITEMS_TV_02_333 = { "Người ta dậy thì thành công, \ncòn chúng mình dậy thì nhớ \nmang chiếc áo đủ ấm, ghé ng..." , "Năm nay tại Nhà, \"vị\" Giáng \nsinh mà bạn yêu thích, mong \nchờ từ trước đến nay vẫn sẽ ..." ,
                                                       "Chớm đầu Đông, những cơn \nmưa bất chợt làm trời se lạnh \nlà thời điểm tuyệt vời để nhâ..." , "Trải nghiệm \"PICK UP\" ngay \nChủ động đến lấy, không chờ đợi!" } ;

    private int [] NEWS_COFFEE_LOVER_ITEMS_IV_333 = { R.drawable.image_coffee_lover_01 , R.drawable.image_coffee_lover_02 , R.drawable.image_coffee_lover_03 ,
                                                      R.drawable.image_coffee_lover_04 , R.drawable.image_coffee_lover_05 , R.drawable.image_coffee_lover_06 ,
                                                      R.drawable.image_coffee_lover_07 , R.drawable.image_coffee_lover_08 , R.drawable.image_coffee_lover_09 } ;
    private  String [] NEWS_COFFEE_LOVER_ITEMS_TV_01_333 = { "Bản Sắc Nơi Đất Trồng, Một \nHành Trình Tìm Về Nguyên ..." , "Hương vị Cà phê mới tại Nhà Signature" , "Cảm ơn bạn, vì đã luôn là 1 \nbản nguyên khác biệt" ,
                                                             "Costa Rica - Tách \"Hand \nBrew\" Mới, Bạn Đã Thử Ch..." , "Hương Vị \"Handbrew\" Mới - \nBạn Đã Thử Chưa?" , "Chuyện về chai tonic tại Nhà Signature" ,
                                                             "Nhà Signature có thêm điều thú vị" , "Bạn đã thử hết 5 hương \nvị Cold Brew tại Nhà Signat..." , "Cold Brew nào phải Cà phê đá!" } ;
    private  String [] NEWS_COFFEE_LOVER_ITEMS_TV_02_333 = { "Cùng Nhà bắt đầu hành trình \nđầu tiên cùng Travel blogger \nNhị Đặng lên đường \"cà phê ..." , "Nhà Signature - nơi những \nhương vị nguyên bản tạo nên \ntrải nghiệm khác biệt. Tháng ..." ,
                                                             "Tạo khác biệt từ chất nguyên \nbản. Thước phim \"Khác biệt\" \ndưới đây là món quà được lấ..." , "Costa Rica - Tách Hand Brew \nđượm vị cho mùa hè của bạn \nthêm phần ngọt ngào. Hạt cà ..." ,
                                                             "Tiếp nối những hương vị \n\"specialty coffee\" tuyệt vời. \nTháng 2 này, The Coffee Hou..." , "Với món Nitro Cold Brew \nTonic, chai tonic sẽ được phục \nvụ riêng, để bạn thoải mái điề..." ,
                                                             "Một mẻ rang mới vừa hoàn \nthành, hãy sẵn sàng cùng The \nCoffee House Signature, bướ..." , "Cold Brew – một trong những \nkiểu pha chế giữ lại hương vị \nnguyên bản nhất của hạt cà p..." ,
                                                             "Cà phê pha lạnh và Cà phê đá \nlạnh nghe thì \"xêm xêm\" nhưng \nkhông có họ hàng gì đâu nhé!" } ;

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState ) ;
        setContentView( R.layout.news_activity_main ) ;
        FIND_VIEW_BY_ID() ;

        NEWS_ACTIVITY_MAIN_B_LOGIN_333.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View VIEW )
            {
                Intent INTENT = new Intent( News_Activity_Main.this, Account_Login.class ) ;
                startActivity( INTENT ) ;
            }
        }) ;

        News_CoffeeLover_Offers_Update_Items_Adapter NEWS_COFFEE_LOVER_ITEMS_ADAPTER = new News_CoffeeLover_Offers_Update_Items_Adapter( this , NEWS_COFFEE_LOVER_ITEMS_IV_333 , NEWS_COFFEE_LOVER_ITEMS_TV_01_333 , NEWS_COFFEE_LOVER_ITEMS_TV_02_333 ) ;
        NEWS_ACTIVITY_MAIN_GV_COFFEELOVER_333.setAdapter( NEWS_COFFEE_LOVER_ITEMS_ADAPTER ) ;

        News_Menu_Items_Adapter NEWS_MENU_ITEMS_ADAPTER = new News_Menu_Items_Adapter( this , NEWS_MENU_ITEMS_IV_333 , NEWS_MENU_ITEMS_TV_333 ) ;
        NEWS_ACTIVITY_MAIN_GV_MENU_333.setAdapter( NEWS_MENU_ITEMS_ADAPTER ) ;

        News_CoffeeLover_Offers_Update_Items_Adapter NEWS_OFFERS_ITEMS_ADAPTER = new News_CoffeeLover_Offers_Update_Items_Adapter( this , NEWS_OFFERS_ITEMS_IV_333 , NEWS_OFFERS_ITEMS_TV_01_333 , NEWS_OFFERS_ITEMS_TV_02_333 ) ;
        NEWS_ACTIVITY_MAIN_GV_OFFERS_333.setAdapter( NEWS_OFFERS_ITEMS_ADAPTER ) ;

        News_CoffeeLover_Offers_Update_Items_Adapter NEWS_UPDATE_ITEMS_ADAPTER = new News_CoffeeLover_Offers_Update_Items_Adapter( this , NEWS_UPDATE_ITEMS_IV_333 , NEWS_UPDATE_ITEMS_TV_01_333 , NEWS_UPDATE_ITEMS_TV_02_333 ) ;
        NEWS_ACTIVITY_MAIN_GV_UPDATE_333.setAdapter( NEWS_UPDATE_ITEMS_ADAPTER ) ;

        BOTTOM_NAVIGATION_VIEW_333.setSelectedItemId( R.id.BNV_ITEMS_NEWS ) ;
        BOTTOM_NAVIGATION_VIEW_333.setOnNavigationItemReselectedListener( new BottomNavigationView.OnNavigationItemReselectedListener()
        {
            @Override
            public void onNavigationItemReselected( @NonNull MenuItem MENU_ITEM )
            {
                switch ( MENU_ITEM.getItemId())
                {
                    case R.id.BNV_ITEMS_NEWS :
                        return ;
                    case R.id.BNV_ITEMS_ORDER :
                        Intent INTENT_02 = new Intent( News_Activity_Main.this , Order_Fragment_Activity_Main.class ) ;
                        startActivity( INTENT_02 ) ;
                        overridePendingTransition(0 ,0 ) ;
                        return ;
                    case R.id.BNV_ITEMS_STORE :
                        Intent INTENT_03 = new Intent( News_Activity_Main.this , Store_Activity_Main.class ) ;
                        startActivity( INTENT_03 ) ;
                        overridePendingTransition(0 ,0 ) ;
                        return ;
                    case R.id.BNV_ITEMS_ACCOUNT :
                        Intent INTENT_04 = new Intent( News_Activity_Main.this , Account_Activity_Main.class ) ;
                        startActivity( INTENT_04 ) ;
                        overridePendingTransition(0 ,0 ) ;
                        return ;
                }
            }
        }) ;
    }

    public void FIND_VIEW_BY_ID()
    {
        BOTTOM_NAVIGATION_VIEW_333 = findViewById( R.id.NEWS_ACTIVITY_MAIN_BNV ) ;
        NEWS_ACTIVITY_MAIN_B_LOGIN_333 = findViewById( R.id.NEWS_ACTIVITY_MAIN_B_LOGIN ) ;
        NEWS_ACTIVITY_MAIN_GV_COFFEELOVER_333 = findViewById( R.id.NEWS_ACTIVITY_MAIN_GV_COFFEELOVER ) ;
        NEWS_ACTIVITY_MAIN_GV_MENU_333 = findViewById( R.id.NEWS_ACTIVITY_MAIN_GV_MENU ) ;
        NEWS_ACTIVITY_MAIN_GV_OFFERS_333 = findViewById( R.id.NEWS_ACTIVITY_MAIN_GV_OFFERS ) ;
        NEWS_ACTIVITY_MAIN_GV_UPDATE_333 = findViewById( R.id.NEWS_ACTIVITY_MAIN_GV_UPDATE ) ;
    }

}
