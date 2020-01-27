package com.vkejun.cdyoucd.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.vkejun.cdyoucd.R;

public class F2 extends Fragment
{
    private Toolbar toolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_gj_b, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        this.toolbar = ((Toolbar)getActivity().findViewById(R.id.toolbar));
        this.toolbar.setTitle("社区");
        setHasOptionsMenu(true);
        ((AppCompatActivity)getActivity()).setSupportActionBar(this.toolbar);
    }
}