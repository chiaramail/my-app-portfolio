package com.example.uomini.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        Button button1 = (Button) view.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(v.getContext(), "This button will launch " + ((Button)v).getText().toString(), Toast.LENGTH_LONG).show();
            }
        });

        Button button2 = (Button) view.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(v.getContext(), "This button will launch " + ((Button)v).getText().toString(), Toast.LENGTH_LONG).show();
            }
        });

        Button button3 = (Button) view.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(v.getContext(), "This button will launch " + ((Button)v).getText().toString(), Toast.LENGTH_LONG).show();
            }
        });

        Button button4 = (Button) view.findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(v.getContext(), "This button will launch " + ((Button)v).getText().toString(), Toast.LENGTH_LONG).show();
            }
        });

        Button button5 = (Button) view.findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(v.getContext(), "This button will launch " + ((Button)v).getText().toString(), Toast.LENGTH_LONG).show();
            }
        });

        Button button6 = (Button) view.findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(v.getContext(), "This button will launch " + ((Button)v).getText().toString(), Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }

    /** Called when the user touches the button */
    public void sendMessage(View view) {
        // Do something in response to button click
        if (view.isPressed()) {
            Toast.makeText(view.getContext(), "This button will launch " + view.getLabelFor(), Toast.LENGTH_LONG).show();
        }
    }
}
