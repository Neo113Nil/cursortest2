package com.neptunesoft.gestionbacdz.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> lstFragment;
    private final List<String> lstTitles;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        this.lstFragment = new ArrayList();
        this.lstTitles = new ArrayList();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int position) {
        return this.lstFragment.get(position);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.lstTitles.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int position) {
        return this.lstTitles.get(position);
    }

    public void addFragment(Fragment fragment, String title) {
        this.lstFragment.add(fragment);
        this.lstTitles.add(title);
    }
}
