package com.google.android.material.datepicker;

import K.C;
import K.T;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.luckycounter.drinkwater.R;
import g0.Z;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends Z {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f2312u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f2313v;

    public r(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f2312u = textView;
        WeakHashMap weakHashMap = T.f633a;
        new C(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(textView, Boolean.TRUE);
        this.f2313v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
