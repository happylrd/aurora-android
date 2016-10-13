package com.happylrd.aurora.ui.dialog;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.happylrd.aurora.R;
import com.happylrd.aurora.ui.fragment.ListMessageFragment;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class TabDialog extends DialogFragment {

    public TabDialog() {
    }

    public static TabDialog newInstance() {
        TabDialog tabDialog = new TabDialog();
        return tabDialog;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_tab, container);

        ViewPager viewPager = (ViewPager) view.findViewById(R.id.view_pager);
        CircleIndicator circleIndicator = (CircleIndicator)
                view.findViewById(R.id.circle_indicator);

        Adapter adapter = new Adapter(getChildFragmentManager());
        adapter.addFragment(new ListMessageFragment(), "1");
        adapter.addFragment(new ListMessageFragment(), "2");
        adapter.addFragment(new ListMessageFragment(), "3");

        viewPager.setAdapter(adapter);
        circleIndicator.setViewPager(viewPager);

        return view;
    }

    static class Adapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public Adapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }
    }
}