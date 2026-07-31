package com.inmobi.media;

import android.content.res.ColorStateList;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class L6 {
    public static final void a(ProgressBar progressBar, Wg progressConfig, float f) {
        Intrinsics.checkNotNullParameter(progressBar, "<this>");
        Intrinsics.checkNotNullParameter(progressConfig, "progressConfig");
        progressBar.setProgressTintList(ColorStateList.valueOf(H3.a(progressConfig.c)));
        progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(H3.a(progressConfig.d)));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (progressConfig.e * f));
        layoutParams.addRule(12);
        progressBar.setLayoutParams(layoutParams);
    }
}
