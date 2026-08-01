package com.luckycounter.drinkwater;

import A.b;
import S0.a;
import S0.n;
import T0.d;
import V0.g;
import W0.j;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.luckycounter.drinkwater.data.HydrationRepository;
import g.AbstractActivityC0129i;
import i1.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class PyramidActivity extends AbstractActivityC0129i {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f2479A = 0;

    /* renamed from: y, reason: collision with root package name */
    public final g f2480y = new g(new a(this, 2));

    /* renamed from: z, reason: collision with root package name */
    public HydrationRepository f2481z;

    @Override // g.AbstractActivityC0129i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        List<n> list;
        super.onCreate(bundle);
        g gVar = this.f2480y;
        setContentView(((d) gVar.a()).f1153a);
        this.f2481z = new HydrationRepository(this);
        LinearLayout linearLayout = ((d) gVar.a()).f1154b;
        linearLayout.removeAllViews();
        HydrationRepository hydrationRepository = this.f2481z;
        if (hydrationRepository == null) {
            f.h("repository");
            throw null;
        }
        int streakDays = hydrationRepository.getStreakDays();
        List list2 = S0.g.f1080a;
        f.e(list2, "<this>");
        if (list2.size() <= 1) {
            list = j.z0(list2);
        } else {
            ArrayList arrayList = new ArrayList(list2);
            Collections.reverse(arrayList);
            list = arrayList;
        }
        for (n nVar : list) {
            boolean z2 = streakDays >= nVar.f1094c;
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(1);
            linearLayout2.setGravity(1);
            int i = nVar.f1092a;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) (linearLayout2.getResources().getDisplayMetrics().widthPixels * ((i * 0.12f) + 0.5f)), -2);
            layoutParams.topMargin = 12;
            layoutParams.bottomMargin = 12;
            linearLayout2.setLayoutParams(layoutParams);
            linearLayout2.setPadding(16, 16, 16, 16);
            linearLayout2.setBackground(A.a.b(this, z2 ? R.drawable.bg_neon_button_aqua : R.drawable.bg_neon_button));
            int i2 = R.string.tier_spark;
            if (i != 0) {
                if (i == 1) {
                    i2 = R.string.tier_pulse;
                } else if (i == 2) {
                    i2 = R.string.tier_blaze;
                } else if (i == 3) {
                    i2 = R.string.tier_nova;
                } else if (i == 4) {
                    i2 = R.string.tier_apex;
                }
            }
            TextView textView = new TextView(this);
            textView.setText(getString(i2));
            textView.setTextColor(b.a(this, z2 ? R.color.aqua : R.color.hot_pink));
            textView.setTextSize(18.0f);
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setGravity(17);
            TextView textView2 = new TextView(this);
            textView2.setText(getString(z2 ? R.string.tier_unlocked : R.string.tier_locked));
            textView2.setTextColor(b.a(this, R.color.neon_white));
            textView2.setTextSize(14.0f);
            textView2.setGravity(17);
            TextView textView3 = new TextView(this);
            textView3.setText(getString(R.string.tier_requirement, Integer.valueOf(nVar.f1094c)));
            textView3.setTextColor(b.a(this, R.color.plasma_aqua));
            textView3.setTextSize(12.0f);
            textView3.setGravity(17);
            TextView textView4 = new TextView(this);
            textView4.setText(getString(R.string.max_goal, Integer.valueOf(nVar.f1095e)));
            textView4.setTextColor(b.a(this, R.color.capsule_glow));
            textView4.setTextSize(12.0f);
            textView4.setGravity(17);
            linearLayout2.addView(textView);
            linearLayout2.addView(textView2);
            linearLayout2.addView(textView3);
            linearLayout2.addView(textView4);
            linearLayout.addView(linearLayout2);
        }
    }
}
