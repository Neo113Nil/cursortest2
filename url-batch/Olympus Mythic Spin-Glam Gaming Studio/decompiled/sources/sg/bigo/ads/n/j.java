package sg.bigo.ads.n;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.api.NativeAd;

/* loaded from: classes5.dex */
public final class j extends d {
    public final int i;

    @NonNull
    private final b j;

    public j(@NonNull sg.bigo.ads.p.a aVar, @NonNull List<NativeAd> list, @NonNull sg.bigo.ads.o.b bVar) {
        super(aVar, list, bVar);
        this.i = sg.bigo.ads.common.utils.f.a(this.d, 72);
        this.j = new b(sg.bigo.ads.common.utils.f.a(this.d, 8), this.h, this.g);
    }

    private List<View> a(@NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5, @Nullable View view6) {
        c();
        this.a.setOrientation(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        arrayList.add(view3);
        arrayList.add(view4);
        arrayList.add(view5);
        a(0, 0, 0, 16);
        LinearLayout linearLayout = new LinearLayout(this.d);
        linearLayout.setOrientation(0);
        this.a.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(view, new LinearLayout.LayoutParams(this.i, -2));
        linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(view2, new LinearLayout.LayoutParams(this.i, -2));
        linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(view3, new LinearLayout.LayoutParams(this.i, -2));
        linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        LinearLayout linearLayout2 = new LinearLayout(this.d);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = sg.bigo.ads.common.utils.f.a(this.d, 12);
        this.a.addView(linearLayout2, layoutParams);
        linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout2.addView(view4, new LinearLayout.LayoutParams(this.i, -2));
        linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout2.addView(view5, new LinearLayout.LayoutParams(this.i, -2));
        linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        if (view6 != null) {
            arrayList.add(view6);
            linearLayout2.addView(view6, new LinearLayout.LayoutParams(this.i, -2));
        } else {
            linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(this.i, -2));
        }
        linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        return arrayList;
    }

    @Override // sg.bigo.ads.n.d
    @Nullable
    protected final List<View> a(@NonNull a aVar) {
        ArrayList arrayList;
        LinearLayout linearLayout;
        View space;
        ViewGroup.LayoutParams layoutParams;
        View a;
        View a2;
        View a3;
        View a4;
        View a5;
        View view;
        int size = this.b.size();
        if (size == 0) {
            return new ArrayList();
        }
        if (size == 1) {
            this.f = true;
            View a6 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style1, this.a, false);
            a(this.j);
            this.a.setOrientation(0);
            arrayList = new ArrayList();
            arrayList.add(a6);
            a(20, 16, 20, 16);
            this.a.addView(a6, new LinearLayout.LayoutParams(-1, sg.bigo.ads.common.utils.f.a(this.d, 60)));
        } else if (size != 2) {
            if (size == 3) {
                View a7 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
                View a8 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
                View a9 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
                c();
                this.a.setOrientation(0);
                arrayList = new ArrayList();
                arrayList.add(a7);
                arrayList.add(a8);
                arrayList.add(a9);
                a(0, 0, 0, 16);
                this.a.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                this.a.addView(a7, new LinearLayout.LayoutParams(this.i, -2));
                this.a.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                this.a.addView(a8, new LinearLayout.LayoutParams(this.i, -2));
                this.a.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                this.a.addView(a9, new LinearLayout.LayoutParams(this.i, -2));
                linearLayout = this.a;
                space = new Space(this.d);
                layoutParams = new LinearLayout.LayoutParams(0, 60, 1.0f);
            } else {
                if (size != 4) {
                    if (size != 5) {
                        a = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
                        a2 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
                        a3 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
                        a4 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
                        a5 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
                        view = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
                    } else {
                        a = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
                        a2 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
                        a3 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
                        a4 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
                        a5 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
                        view = null;
                    }
                    return a(a, a2, a3, a4, a5, view);
                }
                View a10 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
                View a11 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
                View a12 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
                View a13 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
                c();
                this.a.setOrientation(1);
                this.a.setGravity(1);
                arrayList = new ArrayList();
                arrayList.add(a10);
                arrayList.add(a11);
                arrayList.add(a12);
                arrayList.add(a13);
                arrayList.add(a13);
                a(0, 0, 0, 16);
                LinearLayout linearLayout2 = new LinearLayout(this.d);
                linearLayout2.setOrientation(0);
                this.a.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
                linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                linearLayout2.addView(a10, new LinearLayout.LayoutParams(this.i, -2));
                linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                linearLayout2.addView(a11, new LinearLayout.LayoutParams(this.i, -2));
                linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                linearLayout = new LinearLayout(this.d);
                linearLayout.setOrientation(0);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.topMargin = sg.bigo.ads.common.utils.f.a(this.d, 12);
                this.a.addView(linearLayout, layoutParams2);
                linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                linearLayout.addView(a12, new LinearLayout.LayoutParams(this.i, -1));
                linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                linearLayout.addView(a13, new LinearLayout.LayoutParams(this.i, -2));
                space = new Space(this.d);
                layoutParams = new LinearLayout.LayoutParams(0, 60, 1.0f);
            }
            linearLayout.addView(space, layoutParams);
        } else {
            this.f = true;
            View a14 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style1, this.a, false);
            View a15 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style1, this.a, false);
            a(this.j);
            this.a.setOrientation(1);
            arrayList = new ArrayList();
            arrayList.add(a14);
            arrayList.add(a15);
            a(20, 16, 20, 16);
            int a16 = sg.bigo.ads.common.utils.f.a(this.d, 60);
            this.a.addView(a14, new LinearLayout.LayoutParams(-1, a16));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, a16);
            layoutParams3.topMargin = sg.bigo.ads.common.utils.f.a(this.d, 20);
            this.a.addView(a15, layoutParams3);
        }
        return arrayList;
    }

    @Override // sg.bigo.ads.n.d
    protected final b a() {
        float a = sg.bigo.ads.common.utils.f.a(this.d, 8);
        return new b(a, a, a, a, new Rect(0, sg.bigo.ads.common.utils.f.a(this.d, 12), 0, 0), this.h, null, this.g);
    }
}
