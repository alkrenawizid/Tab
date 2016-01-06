package com.zdeve.zid.tab;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TabFragment extends Fragment {
    @Bind(R.id.tabsLayout)
    TabLayout tabsLayout;
    @Bind(R.id.viewPagers)
    ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    private void SetupTabs() {
        TabsPagerAdapter adapter = new TabsPagerAdapter(getChildFragmentManager());
        viewPager.setAdapter(adapter);
        tabsLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
