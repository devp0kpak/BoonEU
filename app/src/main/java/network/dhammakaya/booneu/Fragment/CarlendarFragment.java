package network.dhammakaya.booneu.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import network.dhammakaya.booneu.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CarlendarFragment extends Fragment {


    public CarlendarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_carlendar, container, false);
    }

}
