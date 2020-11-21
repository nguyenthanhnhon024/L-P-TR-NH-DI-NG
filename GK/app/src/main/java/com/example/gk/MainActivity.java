package com.example.gk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gv;
    String[] names = {"Giảm 25%","Giảm 20K","Now 0đ","Mua 2 tặng 1","Giờ vàng 40% ","Áp dụng trên 50k","Ăn sang 50%","Ăn miễn phí vs AIRPAY","Top sản phẩm giảm 25%","Thứ 3 mỗi tuần","Gợi ý ăn sáng","Món ăn khuya","Đặt bàn trên NowTable","Top món mềm dẻo","Giảm 90%","Giảm 150K"};
    int[] images = {R.drawable.n13,R.drawable.n14,R.drawable.n15,R.drawable.n16,R.drawable.n1,R.drawable.n2,R.drawable.n3,R.drawable.n4,R.drawable.n5,R.drawable.n6,R.drawable.n7,R.drawable.n8,R.drawable.n9,R.drawable.n10,R.drawable.n11,R.drawable.n12};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gv=findViewById(R.id.gridview);

        CustomAdapter customAdapter = new CustomAdapter(names,images,this);
        gv.setAdapter(customAdapter);

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                String selectedName = names[i];
                int selectedImage = images[i];
                startActivity(new Intent(MainActivity.this,ClickedItemActivity.class).putExtra("name",selectedName).putExtra("image",selectedImage));

            }
        });

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