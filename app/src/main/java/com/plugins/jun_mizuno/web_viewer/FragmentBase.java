package com.plugins.jun_mizuno.web_viewer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public abstract class FragmentBase extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // @memo. 継承先でレイアウトを指定してViewを生成すること
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public void open() {
        receivedArgumentState();
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_layout, this);
        transaction.commit();
    }

    public void close() {

    }

    protected void receivedArgumentState() {
        Bundle arg = getArguments();
        if (arg != null) {
            // @memo. 変数を受け取る場合はここで
        }
    }
}
