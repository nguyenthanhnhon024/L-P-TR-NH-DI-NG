package com.duyexample.passiocoffee.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.duyexample.passiocoffee.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UsedFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UsedFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1_309;
    private String mParam2_309;

    public UsedFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment UsedFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static UsedFragment newInstance(String param1, String param2) {
        UsedFragment fragment309 = new UsedFragment();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_used, container, false);
    }
}