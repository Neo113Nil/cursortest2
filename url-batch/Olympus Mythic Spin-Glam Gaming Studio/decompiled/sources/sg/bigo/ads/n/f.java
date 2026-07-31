package sg.bigo.ads.n;

import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import sg.bigo.ads.R;
import sg.bigo.ads.api.NativeAd;

/* loaded from: classes5.dex */
public class f extends d {
    public f(@NonNull sg.bigo.ads.p.a aVar, @NonNull List<NativeAd> list, @NonNull sg.bigo.ads.o.b bVar) {
        super(aVar, list, bVar);
    }

    @Override // sg.bigo.ads.n.d
    @Nullable
    protected final List<View> a(@NonNull a aVar) {
        ArrayList arrayList;
        sg.bigo.ads.p.a aVar2;
        Space space;
        LinearLayout.LayoutParams layoutParams;
        Object tag = aVar.a.getTag();
        Boolean bool = Boolean.TRUE;
        if (!Objects.equals(tag, bool)) {
            a(aVar.a);
            aVar.a.setTag(bool);
        }
        this.a.setOrientation(0);
        int size = this.b.size();
        if (size == 0) {
            return new ArrayList();
        }
        if (size == 1) {
            this.f = true;
            View a = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style2, this.a, false);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(a);
            a(20, 0, 20, 0);
            this.a.addView(a, new LinearLayout.LayoutParams(-1, sg.bigo.ads.common.utils.f.a(this.d, 60)));
            return arrayList2;
        }
        if (size == 2) {
            View a2 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_style2, this.a, false);
            View a3 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_style2, this.a, false);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(a2);
            arrayList3.add(a3);
            a(20, 0, 20, 0);
            int a4 = sg.bigo.ads.common.utils.f.a(this.d, 60);
            this.a.addView(a2, new LinearLayout.LayoutParams(0, a4, 1.0f));
            this.a.addView(new Space(this.d), new LinearLayout.LayoutParams(sg.bigo.ads.common.utils.f.a(this.d, 31), a4));
            this.a.addView(a3, new LinearLayout.LayoutParams(0, a4, 1.0f));
            return arrayList3;
        }
        if (size != 3) {
            View a5 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
            View a6 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
            View a7 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
            View a8 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
            arrayList = new ArrayList();
            arrayList.add(a5);
            arrayList.add(a6);
            arrayList.add(a7);
            arrayList.add(a8);
            a(0, 0, 0, 0);
            int a9 = sg.bigo.ads.common.utils.f.a(this.d, 72);
            this.a.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            this.a.addView(a5, new LinearLayout.LayoutParams(a9, -2));
            this.a.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            this.a.addView(a6, new LinearLayout.LayoutParams(a9, -2));
            this.a.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            this.a.addView(a7, new LinearLayout.LayoutParams(a9, -2));
            this.a.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            this.a.addView(a8, new LinearLayout.LayoutParams(a9, -2));
            aVar2 = this.a;
            space = new Space(this.d);
            layoutParams = new LinearLayout.LayoutParams(0, 60, 1.0f);
        } else {
            View a10 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
            View a11 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
            View a12 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
            arrayList = new ArrayList();
            arrayList.add(a10);
            arrayList.add(a11);
            arrayList.add(a12);
            a(0, 0, 0, 0);
            int a13 = sg.bigo.ads.common.utils.f.a(this.d, 72);
            this.a.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            this.a.addView(a10, new LinearLayout.LayoutParams(a13, -2));
            this.a.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            this.a.addView(a11, new LinearLayout.LayoutParams(a13, -2));
            this.a.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            this.a.addView(a12, new LinearLayout.LayoutParams(a13, -2));
            aVar2 = this.a;
            space = new Space(this.d);
            layoutParams = new LinearLayout.LayoutParams(0, 60, 1.0f);
        }
        aVar2.addView(space, layoutParams);
        return arrayList;
    }

    @Override // sg.bigo.ads.n.d
    protected final b a() {
        int a = sg.bigo.ads.common.utils.f.a(this.d, 8);
        float f = a;
        return new b(f, f, 0.0f, 0.0f, new Rect(0, a, 0, 0), this.h, new boolean[]{false, false, false, true}, this.g);
    }
}
