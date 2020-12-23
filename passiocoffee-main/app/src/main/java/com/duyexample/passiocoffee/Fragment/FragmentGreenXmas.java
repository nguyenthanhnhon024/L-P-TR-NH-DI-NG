package com.duyexample.passiocoffee.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

import com.duyexample.passiocoffee.Adapter.NotificationAdapter;
import com.duyexample.passiocoffee.DTO.Notification;
import com.duyexample.passiocoffee.R;
import com.duyexample.passiocoffee.TruyVan.GreenXmasTV;

import java.util.ArrayList;

public class FragmentGreenXmas extends Fragment {

    GridView gv309;
    ArrayList<Notification> arrayList309;
    NotificationAdapter adapter309;
    GreenXmasTV greenXmasTV309;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v309 = inflater.inflate(R.layout.fragment_order_c, container, false);

        greenXmasTV309 = new GreenXmasTV(getActivity());
        arrayList309 = greenXmasTV309.getAll();
        gv309 = (GridView) v309.findViewById(R.id.gv_soda);
        adapter309 = new NotificationAdapter(getActivity(), arrayList309);
        gv309.setAdapter(adapter309);
        return v309;
    }
}
