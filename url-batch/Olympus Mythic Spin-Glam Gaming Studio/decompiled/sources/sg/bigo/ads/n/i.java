package sg.bigo.ads.n;

import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.api.NativeAd;

/* loaded from: classes5.dex */
public final class i extends d {
    public i(@NonNull sg.bigo.ads.p.a aVar, @NonNull List<NativeAd> list, @NonNull sg.bigo.ads.o.b bVar) {
        super(aVar, list, bVar);
        this.f = true;
    }

    @Override // sg.bigo.ads.n.d
    @Nullable
    protected final List<View> a(@NonNull a aVar) {
        ArrayList arrayList;
        LinearLayout linearLayout;
        int size = this.b.size();
        if (size == 0) {
            return new ArrayList();
        }
        if (size == 1) {
            View a = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style2, this.a, false);
            c();
            this.a.setOrientation(0);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(a);
            a(12, 0, 12, 12);
            this.a.addView(a, new LinearLayout.LayoutParams(-1, sg.bigo.ads.common.utils.f.a(this.d, 60)));
            return arrayList2;
        }
        if (size != 2) {
            View a2 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style2, this.a, false);
            View a3 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style2, this.a, false);
            View a4 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style2, this.a, false);
            this.a.setOrientation(1);
            arrayList = new ArrayList();
            int a5 = sg.bigo.ads.common.utils.f.a(this.d, 60);
            LinearLayout linearLayout2 = new LinearLayout(this.d);
            linearLayout2.setOrientation(0);
            a(linearLayout2);
            b(linearLayout2);
            this.a.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
            linearLayout2.addView(a2, new LinearLayout.LayoutParams(-1, a5));
            arrayList.add(linearLayout2);
            LinearLayout linearLayout3 = new LinearLayout(this.d);
            linearLayout3.setOrientation(0);
            a(linearLayout3);
            b(linearLayout3);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = sg.bigo.ads.common.utils.f.a(this.d, 8);
            layoutParams.bottomMargin = sg.bigo.ads.common.utils.f.a(this.d, 8);
            this.a.addView(linearLayout3, layoutParams);
            linearLayout3.addView(a3, new LinearLayout.LayoutParams(-1, a5));
            arrayList.add(linearLayout3);
            linearLayout = new LinearLayout(this.d);
            linearLayout.setOrientation(0);
            a(linearLayout);
            b(linearLayout);
            this.a.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
            linearLayout.addView(a4, new LinearLayout.LayoutParams(-1, a5));
        } else {
            View a6 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style2, this.a, false);
            View a7 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style2, this.a, false);
            this.a.setOrientation(1);
            arrayList = new ArrayList();
            int a8 = sg.bigo.ads.common.utils.f.a(this.d, 60);
            LinearLayout linearLayout4 = new LinearLayout(this.d);
            linearLayout4.setOrientation(0);
            a(linearLayout4);
            b(linearLayout4);
            this.a.addView(linearLayout4, new LinearLayout.LayoutParams(-1, -2));
            linearLayout4.addView(a6, new LinearLayout.LayoutParams(-1, a8));
            arrayList.add(linearLayout4);
            linearLayout = new LinearLayout(this.d);
            linearLayout.setOrientation(0);
            a(linearLayout);
            b(linearLayout);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = sg.bigo.ads.common.utils.f.a(this.d, 8);
            this.a.addView(linearLayout, layoutParams2);
            linearLayout.addView(a7, new LinearLayout.LayoutParams(-1, a8));
        }
        arrayList.add(linearLayout);
        return arrayList;
    }

    @Override // sg.bigo.ads.n.d
    protected final b a() {
        float a = sg.bigo.ads.common.utils.f.a(this.d, 8);
        return new b(a, a, a, a, new Rect(0, sg.bigo.ads.common.utils.f.a(this.d, 10), 0, 0), this.h, null, this.g);
    }
}
