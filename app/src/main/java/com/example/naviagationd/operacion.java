package com.example.naviagationd;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link operacion#newInstance} factory method to
 * create an instance of this fragment.
 */
public class operacion extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public operacion() {
        // Required empty public constructor

    }



    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment operacion.
     */
    // TODO: Rename and change types and number of parameters
    public static operacion newInstance(String param1, String param2) {
        operacion fragment = new operacion();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    private View view;
    private EditText txtnum1,txtnum2, etresultado;
    private Button btnsumar,btnrestar,btnmultiplicacion,btndivision, btnsalir;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_operacion,container,false);
        txtnum1=view.findViewById(R.id.editText3);
        txtnum2=view.findViewById(R.id.editText4);
        etresultado=view.findViewById(R.id.etresultado);
        btnsumar=view.findViewById(R.id.bnsuma);
        btnrestar=view.findViewById(R.id.bnresta);
        btnmultiplicacion=view.findViewById(R.id.bnmultiplicacion);
        btndivision=view.findViewById(R.id.bndivision);


        


        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1=Double.parseDouble(txtnum1.getText().toString());
                double numero2=Double.parseDouble(txtnum2.getText().toString());
                double divi=numero1/numero2;
                etresultado.setText(String.valueOf(divi));
                Toast.makeText(getActivity(), "la división es:"+divi, Toast.LENGTH_SHORT).show();
            }
        });
        btnmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1=Double.parseDouble(txtnum1.getText().toString());
                double numero2=Double.parseDouble(txtnum2.getText().toString());
                double multi=numero1*numero2;
                etresultado.setText(String.valueOf(multi));
                Toast.makeText(getActivity(), "la multiplicación es:"+multi, Toast.LENGTH_SHORT).show();
            }
        });
        btnrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1=Double.parseDouble(txtnum1.getText().toString());
                double numero2=Double.parseDouble(txtnum2.getText().toString());
                double resta=numero1-numero2;
                etresultado.setText(String.valueOf(resta));
                Toast.makeText(getActivity(), "la resta es:"+resta, Toast.LENGTH_SHORT).show();
            }
        });
        btnsumar.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View v) {

                double numero1=Double.parseDouble(txtnum1.getText().toString());
                double numero2=Double.parseDouble(txtnum2.getText().toString());
                double suma=numero1+numero2;
              etresultado.setText(String.valueOf(suma));
              Toast.makeText(getActivity(), "la suma es:"+suma, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }




}