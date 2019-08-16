package com.felangm.programuts;
//15 Agustus 2019 - 10116152 - Moch Sholehudin Mawardi - AKB 4

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFl extends Fragment {
    EditText nama, nim, alamat, umur, institusi;
    TextView hnama, hnim, halamat, humur, hinstitusi;
    Button simpan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_fl);

        nama = (EditText) nama.findViewById();
        nim = (EditText) nim.findViewById();
        alamat = (EditText) alamat.findViewById();
        umur = (EditText) umur.findViewById();
        institusi = (EditText) institusi.findViewById();
        hnama = (TextView) nama.findViewById();
        hnim = (TextView) nim.findViewById();
        halamat= (TextView) alamat.findViewById();
        humur= (TextView) umur.findViewById();
        hinstitusi= (TextView) institusi.findViewById();
        simpan = (Button) simpan.findViewById();

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama, alamat, umur, institusi;
                String nim;

                nama = nama.getText().toString().trim();
                alamat = alamat.getText().toString().trim();
                umur = umur.getText().toString().trim();
                institusi = institusi.getText().toString().trim();

                nim = nim.getText().toString().trim();

                hnama.setText(nama);
                hnim.setText(nim);
                halamat.setText(alamat);
                humur.setText(umur);
                hinstitusi.setText(institusi);
            }
        });
    }

    private void setContentView(int fragment_fl) {
    }

    public FragmentFl() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fl, container, false);
    }

}
