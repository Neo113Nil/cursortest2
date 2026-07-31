package com.my.target.nativeads.views;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.nativeads.NativeAppwallAd;
import com.my.target.nativeads.banners.NativeAppwallBanner;
import com.my.target.qi;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes10.dex */
public class AppwallAdView extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, AbsListView.OnScrollListener {
    private final ListView a;
    private final qi b;
    private final HashMap c;
    private AppwallAdViewListener d;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface AppwallAdViewListener {
        void onBannerClick(@NonNull NativeAppwallBanner nativeAppwallBanner);

        void onBannersShow(@NonNull List<NativeAppwallBanner> list);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class AppwallAdapter extends ArrayAdapter<NativeAppwallBanner> {
        AppwallAdapter(Context context, List list) {
            super(context, 0, list);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @NonNull
        public View getView(int i, View view, @NonNull ViewGroup viewGroup) {
            NativeAppwallBanner nativeAppwallBanner = (NativeAppwallBanner) getItem(i);
            if (view == null) {
                view = new AppwallCardPlaceholder(new AppwallAdTeaserView(getContext()), getContext());
            }
            if (nativeAppwallBanner != null) {
                ((AppwallCardPlaceholder) view).getView().setNativeAppwallBanner(nativeAppwallBanner);
            }
            return view;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    @SuppressLint({"ViewConstructor"})
    public static class AppwallCardPlaceholder extends FrameLayout {
        private final AppwallAdTeaserView a;
        private final LinearLayout b;

        public AppwallCardPlaceholder(@NonNull AppwallAdTeaserView appwallAdTeaserView, @NonNull Context context) {
            super(context);
            qi g = qi.g(context);
            this.a = appwallAdTeaserView;
            int b = g.b(9);
            int b2 = g.b(4);
            int b3 = g.b(2);
            LinearLayout linearLayout = new LinearLayout(context);
            this.b = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(b, b2, b, b2);
            appwallAdTeaserView.setLayoutParams(layoutParams);
            linearLayout.addView(appwallAdTeaserView);
            appwallAdTeaserView.setElevation(b3);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{-1, -1});
            GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{MediaAdView.COLOR_PLACEHOLDER_GRAY, MediaAdView.COLOR_PLACEHOLDER_GRAY});
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
            stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
            appwallAdTeaserView.setBackground(stateListDrawable);
            addView(linearLayout, -2, -2);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent me) {
            DetectTouchUtils.viewOnTouch(h.r, this, me);
            return super.dispatchTouchEvent(me);
        }

        @NonNull
        public AppwallAdTeaserView getView() {
            return this.a;
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            if (1 == 0) {
                setMeasuredDimension(0, 0);
            } else {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
        }
    }

    public AppwallAdView(@NonNull Context context) {
        super(context);
        this.c = new HashMap();
        setVerticalFadingEdgeEnabled(false);
        setBackgroundColor(-1);
        this.b = qi.g(context);
        this.a = new ListView(context);
        b();
    }

    private void a() {
        AppwallAdViewListener appwallAdViewListener;
        if (this.a.getAdapter() == null) {
            return;
        }
        int lastVisiblePosition = this.a.getLastVisiblePosition();
        ArrayList arrayList = new ArrayList();
        for (int firstVisiblePosition = this.a.getFirstVisiblePosition(); firstVisiblePosition <= lastVisiblePosition; firstVisiblePosition++) {
            NativeAppwallBanner nativeAppwallBanner = (NativeAppwallBanner) this.a.getAdapter().getItem(firstVisiblePosition);
            if (this.c.get(nativeAppwallBanner) == null) {
                arrayList.add(nativeAppwallBanner);
                this.c.put(nativeAppwallBanner, Boolean.TRUE);
            }
        }
        if (arrayList.size() <= 0 || (appwallAdViewListener = this.d) == null) {
            return;
        }
        appwallAdViewListener.onBannersShow(arrayList);
    }

    private void b() {
        int b = this.b.b(4);
        int b2 = this.b.b(4);
        this.a.setDividerHeight(0);
        this.a.setVerticalFadingEdgeEnabled(false);
        this.a.setOnItemClickListener(this);
        this.a.setOnScrollListener(this);
        this.a.setPadding(0, b, 0, b2);
        this.a.setClipToPadding(false);
        addView(this.a, -1, -1);
        this.a.setBackgroundColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void notifyDataSetChanged() {
        ((AppwallAdapter) this.a.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        a();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        NativeAppwallBanner nativeAppwallBanner = (NativeAppwallBanner) this.a.getAdapter().getItem(i);
        AppwallAdViewListener appwallAdViewListener = this.d;
        if (appwallAdViewListener != null) {
            appwallAdViewListener.onBannerClick(nativeAppwallBanner);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        a();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public void setAppwallAdViewListener(@Nullable AppwallAdViewListener appwallAdViewListener) {
        this.d = appwallAdViewListener;
    }

    public void setupView(@NonNull NativeAppwallAd nativeAppwallAd) {
        this.a.setAdapter((ListAdapter) new AppwallAdapter(getContext(), nativeAppwallAd.getBanners()));
    }
}
