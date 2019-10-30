package edu.temple.bookcase2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class ViewPage extends Fragment {

   private TextView t;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public ViewPage() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_blank, container, false);

       t=view.findViewById(R.id.bookTitle);
       ViewPageCollectionAdapter v =new ViewPageCollectionAdapter(getFragmentManager());
       String book = v.getItem(0).getArguments().getString("message");
       t.setText(book);
       return view;
    }


}
