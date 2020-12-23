package com.duyexample.passiocoffee.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.duyexample.passiocoffee.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OrderBFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OrderBFragment extends Fragment {
    GridView gridView309;
    String mName309[] = {"Pinky Summer", "Ananas Tea", "PassioChocolate", "PassioCaramel"};
    String mPrice309[] = {"49.000đ", "39.000", "39.000đ", "45.000đ"};
    int images309[] = {R.drawable.pinky, R.drawable.ananas, R.drawable.passiochoco, R.drawable.caramel};
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1_309;
    private String mParam2_309;

    public OrderBFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OrderBFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static OrderBFragment newInstance(String param1, String param2) {
        OrderBFragment fragment309 = new OrderBFragment();
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
        View root309 = inflater.inflate(R.layout.fragment_order_b, container, false);
        gridView309 = root309.findViewById(R.id.gv_soda);
        OrderBFragment.MyAdapter adapter309 = new OrderBFragment.MyAdapter(getActivity(), mName309, mPrice309, images309);
        gridView309.setAdapter(adapter309);

        return root309;
    }
}