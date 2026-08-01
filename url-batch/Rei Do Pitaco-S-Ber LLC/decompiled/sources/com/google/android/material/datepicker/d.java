package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.ionia.reidopitaco.libya.R;
import defpackage.dz;
import defpackage.f80;
import defpackage.t70;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class d extends dz {
    public final TextView u;
    public final MaterialCalendarGridView v;

    public d(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.u = textView;
        WeakHashMap weakHashMap = f80.a;
        new t70(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(textView, Boolean.TRUE);
        this.v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
