package com.example.kontrasv2;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

// Fragment1
public class Fragment1 extends Fragment {

    private OnLinkSelectedListener linkSelectedListener;

    public String receivedData;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnLinkSelectedListener) {
            linkSelectedListener = (OnLinkSelectedListener) context;
        } else {
            throw new ClassCastException(context.toString() + " must implement OnLinkSelectedListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);

        Button button2 = view.findViewById(R.id.button2);
        Button button3 = view.findViewById(R.id.button3);
        Button button4 = view.findViewById(R.id.button4);

        String link1 = "https://www.google.com/search?channel=fs$client=ubuntu&q=search+querys+in+google";
        String link2 = "https://www.google.com/search?channel=fs$client=ubuntu&q=programming+with+Android+Studio";
        String link3 = "http://alkas.lt/?s=Jokubaitis";


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the link from wherever you have it

                // Notify the MainActivity to handle the link
                if (linkSelectedListener != null) {
                    linkSelectedListener.onLinkSelected(link1);
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the link from wherever you have it

                // Notify the MainActivity to handle the link
                if (linkSelectedListener != null) {
                    linkSelectedListener.onLinkSelected(link2);
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the link from wherever you have it

                // Notify the MainActivity to handle the link
                if (linkSelectedListener != null) {
                    linkSelectedListener.onLinkSelected(link3);
                }
            }
        });

        return view;
    }

    public interface OnLinkSelectedListener {
        void onLinkSelected(String link);
    }

}



