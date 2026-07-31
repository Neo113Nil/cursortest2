package io.intercom.android.sdk.carousel;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.List;

/* loaded from: classes8.dex */
public class CarouselScreenPagerAdapter extends FragmentPagerAdapter {
    private List<CarouselScreenFragment> fragments;

    public CarouselScreenPagerAdapter(FragmentManager fragmentManager, List<CarouselScreenFragment> list) {
        super(fragmentManager);
        this.fragments = list;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        return this.fragments.get(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.fragments.size();
    }
}
