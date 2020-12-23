package com.example.tintuchouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    GridView GV;

    String[] names = {"Nhà mời 20%,PICKUP nha \n Trải nghiệm ngay tính năng PICKUP của Nhà với ưu đãi GIẢM 20% cho đơn hàng chỉ từ 2 món, khi nhập mã PICKUPDI nào.",
            "Bánh ngon Nhà mời, chỉ 19.000đ \n Cuối năm bận rộn thi cử, chạy số, chiến \"deadline\" nhưng không được bỏ bữa nha ấy nhé! Nhà luôn sẵn sàng giao tận nơi bánh mì nóng giòn cùng cà phê đậm đà, trà mát lạnh cho ban nạp năng lượng.",
            "Mua 3 Tặng 1 - Mời nhóm mình chung vui \n Chỉ cần nhập mã CUNGVUI qua app, Nhà mời ngay ưu đãi Mua 3 Tặng 1 - để team mình linh đình lên tinh thần rôm rả mỗi ngày.",
            "Team Đà Nẵng gọi comba trà mát, Nhà tặng ngay ly xịn sò \n Nhận ngay ly nhựa 2 lớp xịn sò phiên bản Nắng Vàng (Quả dứa) và Biển Xanh(Con thuyền) dung tích 450ml khi mua combo 2 ly Trà sữa Mắc ca trân châu trắng hoặc 02 ly Trà đen Macchiato size L đó.",
            "Loạt Deal Xịn Sò 'Cập Bến' Nhà, Đổi Ngay Thôi \n Tin vui dành riêng cho thành viên thân thiết của Nhà. Nhà hiểu chúng ta đã trải qua một năm nhiều biến động, sẽ ảnh hưởng ít nhiều đến chi tiêu của bạn trong năm qua, nên để đảm bảo quyền lợi cho thành viên của Nhà, Nhà sẽ gia hạn thêm 3 tháng sử dụng BEAN tích luỹ trong Quý 1 năm nay, để bạn tha hồ tận hưởng kho ưu đãi siêu xịn sò vừa \"cập bến\" Nhà.",
            "\"Lối nhỏ\" Nhà giao, bao xa cũng tới \n \"Work from home\" hay học online có thèm uống gì thì cứ gọi Nhà nha. Shipper Nhà sẽ mang món bạn yêu thích tới tận nơi:\n GIAO LIỀN TRONG 30 PHÚT\nMỘT LY CŨNG GIAO - NẮNG MƯA CŨNG GIAO\nFREESHIP TỪ ĐƠN HÀNG 50K TRỞ LÊN",
            "Nhà mời cà phê đậm đà, chỉ 12K \n Tuần mới chỉ thật sự tươi tỉnh khi có một tách cà phê đậm đà kề bên. Biết vậy nên Nhà mời liền bạn có hoá đơn từ 50K mua cà phê Việt Nam giá chỉ 12K.\nNhanh tay mở app, nhập mã YEUCAPHE để nhận ưu đãi. Dù bạn ở đâu, shipper Nhà cũng FREESHIP “vitamin cà phê” tới ngay trong 30 phút!",};
    int[] images = {R.drawable.uudai1,R.drawable.uudai2,R.drawable.uudai3,R.drawable.uudai4,R.drawable.uudai5,R.drawable.uudai6,R.drawable.uudai7};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GV = findViewById(R.id.GridView);
        CustomAdapter customAdapter = new CustomAdapter(names,images,this);
        GV.setAdapter(customAdapter);
    }
    public class CustomAdapter extends BaseAdapter{
        private String[] imageNames;
        private int[] imagePhoto;
        private Context context;
        private LayoutInflater layoutInflater;

        public CustomAdapter(String[] imageNames,int[] imagePhoto,Context context){
            this.imageNames = imageNames;
            this.imagePhoto =imagePhoto;
            this.context = context;
            this.layoutInflater=(LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
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
            if(view==null){
                view = layoutInflater.inflate(R.layout.item_tintuc,viewGroup,false);
            }
            TextView tvName = view.findViewById(R.id.tvName);
            ImageView imageView = view.findViewById(R.id.imageView);
            tvName.setText(imageNames[i]);
            imageView.setImageResource(imagePhoto[i]);
            return view;
        }
    }
}