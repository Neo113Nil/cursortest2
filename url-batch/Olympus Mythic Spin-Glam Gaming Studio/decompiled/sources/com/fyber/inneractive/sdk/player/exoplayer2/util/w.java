package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.Trace;

/* loaded from: classes6.dex */
public abstract class w {
    public static void a(String str) {
        if (z.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a() {
        if (z.a >= 18) {
            Trace.endSection();
        }
    }
}
