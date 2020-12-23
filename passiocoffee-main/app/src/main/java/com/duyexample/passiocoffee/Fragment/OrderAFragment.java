package com.duyexample.passiocoffee.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.duyexample.passiocoffee.Activity.ClickBuyActivity;
import com.duyexample.passiocoffee.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OrderAFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OrderAFragment extends Fragment {
    GridView gridView309;
    String mName309[] = {"Passiopucino", "Cookie'n", "Matcha Tea", "Ice Chocolate", "PassioChoco", "PassioCaramel"};
    String mPrice309[] = {"35.000đ", "39.000đ", "39.000đ", "40.000", "39.000đ", "49.000đ"};
    int images309[] = {R.drawable.pucino, R.drawable.cream, R.drawable.matcha, R.drawable.choco, R.drawable.passiochoco, R.drawable.caramel};
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1_309;
    private String mParam2_309;

    public OrderAFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OrderAFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static OrderAFragment newInstance(String param1, String param2) {
        OrderAFragment fragment309 = new OrderAFragment();
        Bundle args309 = new Bundle();
        args309.putString(ARG_PARAM1, param1);
        args309.putString(ARG_PARAM2, param2);
        fragment309.setArguments(args309);
        return fragment309;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1_309 = getArguments().getString(ARG_PARAM1);
            mParam2_309 = getArguments().getString(ARG_PARAM2);
        }
    }

    class MyAdapter extends ArrayAdapter<String> {
        Context context309;
        String rName309[];
        String rPrice309[];
        int rImgs309[];

        MyAdapter(Context context, String name[], String price[], int imgs[]) {
            super(context, R.layout.item_order, R.id.name, name);
            this.context309 = context;
            this.rName309 = name;
            this.rPrice309 = price;
            this.rImgs309 = imgs;
        }

        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater309 = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row309 = layoutInflater309.inflate(R.layout.item_order, parent, false);
            ImageView images309 = row309.findViewById(R.id.image);
            TextView myName309 = row309.findViewById(R.id.name);
            TextView myPrice309 = row309.findViewById(R.id.price);

            images309.setImageResource(rImgs309[position]);
            myName309.setText(rName309[position]);
            myPrice309.setText(rPrice309[position]);

            return row309;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root309 = inflater.inflate(R.layout.fragment_order_a, container, false);
        gridView309 = root309.findViewById(R.id.gv_ice);
        OrderAFragment.MyAdapter adapter = new OrderAFragment.MyAdapter(getActivity(), mName309, mPrice309, images309);
        gridView309.setAdapter(adapter);
        gridView309.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), ClickBuyActivity.class);
                intent.putExtra("title", mName309[position]);
                intent.putExtra("price", mPrice309[position]);
                intent.putExtra("image", images309[position]);
                OrderAFragment.this.startActivity(intent);
            }
        });

        return root309;
    }
}