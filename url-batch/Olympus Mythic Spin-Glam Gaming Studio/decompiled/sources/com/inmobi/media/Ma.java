package com.inmobi.media;

import android.os.Build;

/* loaded from: classes11.dex */
public abstract class Ma {
    public static final int a() {
        return Build.VERSION.SDK_INT == 28 ? 2 : 1;
    }
}
