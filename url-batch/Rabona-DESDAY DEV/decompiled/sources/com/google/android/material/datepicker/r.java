package com.google.android.material.datepicker;

import K.C;
import K.T;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.linetic.luckycross.R;
import f0.X;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends X {

    /* renamed from: t, reason: collision with root package name */
    public final TextView f1712t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialCalendarGridView f1713u;

    public r(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f1712t = textView;
        WeakHashMap weakHashMap = T.f381a;
        new C(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(textView, Boolean.TRUE);
        this.f1713u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
