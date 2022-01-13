package com.example.myschool;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class FormationFragment extends Fragment {

    private ListView listFormation;
    private String[] tabForamtions, tabDetail;
    private String formation, detail;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_formation, container, false);
        listFormation = view.findViewById(R.id.listFormation);
        tabDetail = getResources().getStringArray(R.array.detail_formation);
        tabForamtions = getResources().getStringArray(R.array.table_formation);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1,tabForamtions);
        listFormation.setAdapter(adapter);
        listFormation.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                formation = tabForamtions[position];
                detail = tabDetail[position];

                AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
                dialog.setIcon(R.mipmap.ic_launcher);
                dialog.setTitle(formation);
                dialog.setMessage(detail);

                dialog.setNegativeButton(getString(R.string.cancel), null);
                dialog.setPositiveButton(getString(R.string.inscription), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.show(); //
            }
        });
        return view;
    }
}