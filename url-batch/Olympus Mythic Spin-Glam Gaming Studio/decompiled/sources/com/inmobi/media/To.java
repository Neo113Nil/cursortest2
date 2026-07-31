package com.inmobi.media;

import android.view.WindowInsets;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class To {
    public void a(Tf orientation, Vo finalInsets) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(finalInsets, "finalInsets");
    }

    public boolean a() {
        return true;
    }

    public void a(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
    }
}
