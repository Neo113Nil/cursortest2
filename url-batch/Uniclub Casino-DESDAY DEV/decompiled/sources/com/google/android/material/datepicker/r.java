package com.google.android.material.datepicker;

import K.B;
import K.S;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fortuneodd.shadegrid.R;
import f0.X;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends X {

    /* renamed from: t, reason: collision with root package name */
    public final TextView f1719t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialCalendarGridView f1720u;

    public r(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f1719t = textView;
        WeakHashMap weakHashMap = S.f360a;
        new B(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(textView, Boolean.TRUE);
        this.f1720u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
