package com.example.herminahealtcenter.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.herminahealtcenter.LaboratoriumHeaderActivity;
import com.example.herminahealtcenter.R;
import com.example.herminahealtcenter.RiwayatActivity;
import com.example.herminahealtcenter.utils.SessionsManager;

public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    SessionsManager sessionsManager;
    ImageView imageViewlab, imageViewRiwayat;
    TextView textViewlab, textViewRiwayat;
    String norm;
    Context context;
    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sessionsManager = new SessionsManager(getContext());
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view =  inflater.inflate(R.layout.fragment_home, container, false);

        imageViewlab = (ImageView) view.findViewById(R.id.btnimglab);
        textViewlab = (TextView) view.findViewById(R.id.btntvlab);
        imageViewRiwayat = (ImageView) view.findViewById(R.id.btnimgriwayat);
        textViewRiwayat = (TextView) view.findViewById(R.id.btntvriwayat);
//        imageViewriwayat =(ImageView) view.findViewById(R.id.btntvriwayat);
//        textViewriwayat =(TextView) view.findViewById(R.id.btnimgriwayat);
        norm = sessionsManager.getUserName();
        imageViewlab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LaboratoriumHeaderActivity.class);
                startActivity(intent);
            }
        });

        textViewlab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LaboratoriumHeaderActivity.class);
                startActivity(intent);
            }
        });

        imageViewRiwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), RiwayatActivity.class));
            }
        });

        textViewRiwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), RiwayatActivity.class));
            }
        });

//        imageViewriwayat.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(getActivity(), RiwayatActivity.class));
//            }
//        });
//
//        textViewriwayat.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(getActivity(), RiwayatActivity.class));
//            }
//        });

        return  view;

    }



}