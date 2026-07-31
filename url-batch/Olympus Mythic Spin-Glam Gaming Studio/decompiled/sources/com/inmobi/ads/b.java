package com.inmobi.ads;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.media.C4485y1;
import com.inmobi.media.C4511z1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class b {
    public static final Animation a(InMobiBanner.AnimationType animationType, float f, float f2) {
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        int i = a.a[animationType.ordinal()];
        if (i == 1) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.5f);
            alphaAnimation.setDuration(1000L);
            alphaAnimation.setFillAfter(false);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            return alphaAnimation;
        }
        if (i == 2) {
            C4485y1 c4485y1 = new C4485y1(f / 2.0f, f2 / 2.0f);
            c4485y1.setDuration(500L);
            c4485y1.setFillAfter(false);
            c4485y1.setInterpolator(new AccelerateInterpolator());
            return c4485y1;
        }
        if (i != 3) {
            return null;
        }
        C4511z1 c4511z1 = new C4511z1(f / 2.0f, f2 / 2.0f);
        c4511z1.setDuration(500L);
        c4511z1.setFillAfter(false);
        c4511z1.setInterpolator(new AccelerateInterpolator());
        return c4511z1;
    }
}
