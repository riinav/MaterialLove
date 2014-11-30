package com.aquajax.riinav.materiallove;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public static final String ARG_MENU_INDEX = "ARG_MENU_INDEX";
    private View rootView;
    private TextView tvDesc;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_blank, container, false);

        int clickedMenuNo = getArguments().getInt(ARG_MENU_INDEX, 0) + 1;

        tvDesc = (TextView) rootView.findViewById(R.id.tv_desc);
        tvDesc.setText("Clicked Menu No: " + clickedMenuNo);

        return rootView;
    }
}
