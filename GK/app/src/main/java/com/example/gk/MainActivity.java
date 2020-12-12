package com.example.gk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView GV_330,GV2_330,GV3_330;
    Button btdn_330;
    TextView item1_330,item2_330,item3_330,menu1_330,menu2_330,menu3_330;

    String[] names = {"Nhà mời 20%,PICKUP nha \n Trải nghiệm ngay tính năng PICKUP của Nhà với ưu đãi GIẢM 20% cho đơn hàng chỉ từ 2 món, khi nhập mã PICKUPDI nào.",
            "Bánh ngon Nhà mời, chỉ 19.000đ \n Cuối năm bận rộn thi cử, chạy số, chiến \"deadline\" nhưng không được bỏ bữa nha ấy nhé! Nhà luôn sẵn sàng giao tận nơi bánh mì nóng giòn cùng cà phê đậm đà, trà mát lạnh cho ban nạp năng lượng.",
            "Mua 3 Tặng 1 - Mời nhóm mình chung vui \n Chỉ cần nhập mã CUNGVUI qua app, Nhà mời ngay ưu đãi Mua 3 Tặng 1 - để team mình linh đình lên tinh thần rôm rả mỗi ngày.",
            "Team Đà Nẵng gọi comba trà mát, Nhà tặng ngay ly xịn sò \n Nhận ngay ly nhựa 2 lớp xịn sò phiên bản Nắng Vàng (Quả dứa) và Biển Xanh(Con thuyền) dung tích 450ml khi mua combo 2 ly Trà sữa Mắc ca trân châu trắng hoặc 02 ly Trà đen Macchiato size L đó.",
            "Loạt Deal Xịn Sò 'Cập Bến' Nhà, Đổi Ngay Thôi \n Tin vui dành riêng cho thành viên thân thiết của Nhà. Nhà hiểu chúng ta đã trải qua một năm nhiều biến động, sẽ ảnh hưởng ít nhiều đến chi tiêu của bạn trong năm qua, nên để đảm bảo quyền lợi cho thành viên của Nhà, Nhà sẽ gia hạn thêm 3 tháng sử dụng BEAN tích luỹ trong Quý 1 năm nay, để bạn tha hồ tận hưởng kho ưu đãi siêu xịn sò vừa \"cập bến\" Nhà.",
            "\"Lối nhỏ\" Nhà giao, bao xa cũng tới \n \"Work from home\" hay học online có thèm uống gì thì cứ gọi Nhà nha. Shipper Nhà sẽ mang món bạn yêu thích tới tận nơi:\n GIAO LIỀN TRONG 30 PHÚT\nMỘT LY CŨNG GIAO - NẮNG MƯA CŨNG GIAO\nFREESHIP TỪ ĐƠN HÀNG 50K TRỞ LÊN",
            "Nhà mời cà phê đậm đà, chỉ 12K \n Tuần mới chỉ thật sự tươi tỉnh khi có một tách cà phê đậm đà kề bên. Biết vậy nên Nhà mời liền bạn có hoá đơn từ 50K mua cà phê Việt Nam giá chỉ 12K.\nNhanh tay mở app, nhập mã YEUCAPHE để nhận ưu đãi. Dù bạn ở đâu, shipper Nhà cũng FREESHIP “vitamin cà phê” tới ngay trong 30 phút!",};
    int[] images = {R.drawable.uudai1,R.drawable.uudai2,R.drawable.uudai3,R.drawable.uudai4,R.drawable.uudai5,R.drawable.uudai6,R.drawable.uudai7};

    String[] names2 = {"Nhà Reverside Vũ Tông Phan - Hà Nội vui khai trương linh đình \n Người ta dậy thì thành công, còn chúng mình dậy thì nhớ mang chiếc áo đủ ấm, ghé ngay Nhà Reverside Vũ Tông Phan - Hà Nội mới toanh vui khai trương linh đình (07/12 - 09/12) và tham gia ngay “Vòng xoay may mắn”, để nhận quà cực xịn.",
            "Taste of Xmas \n Những ngày cuối năm thật khác, Giáng sinh cũng vì thế mà khác hơn sau 1 năm đặc biệt. Thế nhưng tại Nhà năm nay, “vị\" Giáng sinh mà bạn yêu thích, mong chờ từ trước đến nay vẫn sẽ vẹn nguyên và đong đầy - tất cả đều sống động qua từng khoảnh khắc, từng ngóc ngách quanh chiếc bàn cà phê ấm cúng….",
            "Trời Se Lạnh, Thưởng Thức Ngay Những Món Nóng Của Nhà \n Chớm đầu Đông, những cơn mưa bất chợt làm trời se lạnh là thời điểm tuyệt vời để nhâm nhi từng ngụm thức uống nóng ấm ngọt ngào. Dành cho bạn những \"chiếc ôm ấm áp\".",
            "Khám Phá Không Gian Nhà Mới: Hiện Đại, Sang Trọng & Ấm Áp \n Hiện đại và sang trọng là cảm giác bạn sẽ nhận được ngay khi bước vào những ngôi Nhà mới. \n  Mô hình thiết kế mới tại Nhà mang đến không gian xinh đẹp vừa quen vừa lạ. Nội thất gỗ mang màu sắc ấm áp kết hợp cùng hệ thống ánh sáng mới tạo nên tổng thể hiện đại. Các dãy bàn ghế tại cửa hàng được bố trí đa dạng để khách hàng có thể riêng tư làm việc, hẹn hò hoặc gặp gỡ hội nhóm..",
            "Nhà Tặng Bạn Thêm 3 Tháng Đổi BEAN Nhận Ưu Đãi \n Nhà biết thời gian qua chúng ta đã trải qua nhiều biến động vì COVID-19. Việc này có thể ảnh hưởng trực tiếp đến thói quen sử dụng dịch vụ, hoạt động chi tiêu của bạn..",
            "Thưởng Thức Phim The Tale Of Cuội 2020 \n Thời gian trôi qua, mỗi năm một khác, câu chuyện Trung thu cũng vì thế mà khó được trọn vẹn như xưa, đặc biệt trong những ngày nhiều biến động, lo âu này. Nhưng điều đó lại càng thôi thúc Nhà mang những cảm xúc háo hức, vui tươi của Mùa trăng tuổi thơ trở lại",
            "Tất Bật Vì Bạn - Là Niềm Hạnh Phúc Của Shipper Nhà \n Và ngoài tiêu chí nhanh chóng, tiện lợi để món mang tới tận tay bạn phải thiệt ngon, thì những ngày này an toàn sức khoẻ của bạn và Shipper là ưu tiên hàng đầu, mỗi đơn hàng phải thiệt an toàn trong suốt quá trình giao nhận nước. Vì thế các \"anh trai mưa\" của Nhà",};
    int[] images2 = {R.drawable.nha1,R.drawable.nha2,R.drawable.nha3,R.drawable.nha4,R.drawable.nha5,R.drawable.nha6,R.drawable.nha7};

    String[] names3 = {"Bản Sắc Nơi Đất Trồng, Một Hành Trình Tìm Về Nguyên Bản \n Câu chuyện Từ Nông Trại Tới Ly Cà Phê chưa dừng lại ở phim “Khác Biệt Từ Chất Nguyên Bản” đầy màu sắc, mà còn 2 hành trình thú vị chưa được kể trước đây.",
            "Hương vị Cà phê mới tại Nhà Signature \n Cuối năm bận rộn thi cử, chạy số, chiến \"deadline\" nhưng không được bỏ bữa nha ấy nhé! Nhà luôn sẵn sàng giao tận nơi bánh mì nóng giòn cùng cà phê đậm đà, trà mát lạnh cho ban nạp năng lượng.",
            "Cảm ơn bạn, vì đã luôn là 1 bản nguyên khác biệt \n Thước phim “Khác biệt\" dưới đây là món quà được lấy cảm hứng từ chất nguyên bản của bạn - như lời cảm ơn đặc biệt Nhà dành cho bạn - Một bản nguyên khác biệt của Nhà.",
            "Nhà Gửi Bạn, Vụ Mùa Của Những Bản Sắc \n Tháng 6 này, The Coffee House sẽ tiếp tục mang đến cho bạn 4 bản sắc được sáng tạo từ chất nguyên bản của hạt cà phê Việt Nam - được chọn lọc kỹ lưỡng từ 100% Arabica Cầu Đất với 4 phiên bản đặc biệt. Hãy cùng Nhà thưởng thức.",
            "Costa Tica - Tách \"Hand Brew\" Mới, Bạn Đã Thử Chưa?\n Hạt cà phê Costa Rica, nổi tiếng với phương pháp chế biến Mật Ong đặc trưng, đã vượt qua hàng ngàn dặm từ vùng đất Trung Mỹ xa xôi, để có mặt tại Nhà Signature - cho bạn 1 hương vị ngọt ngào, thơm lừng khó lẫn, 1 trải nghiệm thú vị với vùng đất mới tại The Coffee House Signature.",
            "Hương Vị \"Handbrew\" Mới - Bạn Đã Thử Chưa? \n Tiếp nối những hương vị “specialty coffee” tuyệt vời. Tháng 2 này, The Coffee House Signature sẽ đưa bạn đến trải nghiệm thêm 1 vùng đất mới, nơi tạo ra hương vị cà phê “Panama Creativa Coffee Districst” đặc trưng, thơm lừng nổi tiếng thế giới.",
            "Nhà Signature có thêm điều thú vị \n Một mẻ rang mới vừa hoàn thành, hãy sẵn sàng cùng The Coffee House Signature, bước vào một thế giới hương vị “specialty coffee” hoàn toàn mới cùng những hạt cà phê đặc biệt đến từ những vùng đất khác nhau. Nhấn vào từng hình ảnh dưới đây để khám phá những cái tên mới tại Nhà",};
    int[] images3 = {R.drawable.lover1,R.drawable.lover2,R.drawable.lover3,R.drawable.lover4,R.drawable.lover5,R.drawable.lover6,R.drawable.lover7};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GV_330=findViewById(R.id.gridview);
        CustomAdapter customAdapter = new CustomAdapter(names,images,this);
        GV_330.setAdapter(customAdapter);

        GV2_330=findViewById(R.id.gridview2);
        CustomAdapter customAdapter2 = new CustomAdapter(names2,images2,this);
        GV2_330.setAdapter(customAdapter2);

        GV3_330=findViewById(R.id.gridview3);
        CustomAdapter customAdapter3 = new CustomAdapter(names3,images3,this);
        GV3_330.setAdapter(customAdapter3);


        btdn_330 = (Button) findViewById(R.id.btlg);
        btdn_330.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main_Login_Click.class);
                startActivity(intent);
            }
        });

        item1_330 = (TextView) findViewById(R.id.tv1);
        item1_330.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main_Tichdiem.class);
                startActivity(intent);
            }
        });
        item2_330 = (TextView) findViewById(R.id.tv2);
        item2_330.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main_Dathang.class);
                startActivity(intent);
            }
        });
        item3_330 = (TextView) findViewById(R.id.tv3);
        item3_330.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main_Coupon.class);
                startActivity(intent);
            }
        });

        menu1_330=(TextView) findViewById(R.id.tv_menu1);
        menu2_330=(TextView) findViewById(R.id.tv_menu2);
        registerForContextMenu(menu2_330);
        menu3_330=(TextView) findViewById(R.id.tv_menu3);
        registerForContextMenu(menu3_330);

        menu1_330.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowMenu();
            }
        });
        menu2_330.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowMenu2();
            }
        });
        menu3_330.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowMenu3();
            }
        });




        BottomNavigationView BottomNavigationView = findViewById(R.id.BNV);

        BottomNavigationView.setSelectedItemId(R.id.item_tintuc);

        BottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.item_tintuc:
                        return;
                    case R.id.item_dathang:
                        Intent INTENT2_330 = new Intent(MainActivity.this, Main_Dathang.class ) ;
                        startActivity( INTENT2_330 ) ;
                        overridePendingTransition(0,0);
                        return;
                    case R.id.item_cuahang:
                        Intent INTENT3_330 = new Intent(MainActivity.this, MapsActivity.class ) ;
                        startActivity( INTENT3_330 ) ;
                        overridePendingTransition(0,0);
                        return;
                    case R.id.item_taikhoan:
                        Intent INTENT1_330 = new Intent(MainActivity.this, Main_Login.class ) ;
                        startActivity( INTENT1_330 ) ;
                        overridePendingTransition(0,0);
                        return;
                }
            }
        });
    }

    private void ShowMenu(){
        PopupMenu popupMenu = new PopupMenu(this,menu1_330);
        popupMenu.getMenuInflater().inflate(R.menu.context_menu,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.op1:Toast.makeText(MainActivity.this, "Cảm ơn bạn đã tin tưởng", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.op2:Toast.makeText(MainActivity.this, "Chúng tôi sẽ cố gắng cải thiện hơn!!", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });
        popupMenu.show();
    }
    private void ShowMenu2(){
        PopupMenu popupMenu = new PopupMenu(this,menu2_330);
        popupMenu.getMenuInflater().inflate(R.menu.context_menu,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.op1:Toast.makeText(MainActivity.this, "Cảm ơn bạn đã tin tưởng", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.op2:Toast.makeText(MainActivity.this, "Chúng tôi sẽ cố gắng cải thiện hơn!!", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });
        popupMenu.show();
    }
    private void ShowMenu3(){
        PopupMenu popupMenu = new PopupMenu(this,menu3_330);
        popupMenu.getMenuInflater().inflate(R.menu.context_menu,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.op1:Toast.makeText(MainActivity.this, "Cảm ơn bạn đã tin tưởng", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.op2:Toast.makeText(MainActivity.this, "Chúng tôi sẽ cố gắng cải thiện hơn!!", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });
        popupMenu.show();
    }

    public class CustomAdapter extends BaseAdapter{
        private String[] imageNames;
        private int[] imagePhoto;
        private Context context;
        private LayoutInflater layoutInflater;

        public CustomAdapter(String[] imageNames, int[] imagePhoto, Context context) {
            this.imageNames = imageNames;
            this.imagePhoto = imagePhoto;
            this.context = context;
            this.layoutInflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return imagePhoto.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if(view == null)
            {
                view = layoutInflater.inflate(R.layout.row_item,viewGroup,false);
            }
            TextView tvName = view.findViewById(R.id.tvName);
            ImageView imageView = view.findViewById(R.id.imageView);

            tvName.setText(imageNames[i]);
            imageView.setImageResource(imagePhoto[i]);

            return view;
        }
    }

}