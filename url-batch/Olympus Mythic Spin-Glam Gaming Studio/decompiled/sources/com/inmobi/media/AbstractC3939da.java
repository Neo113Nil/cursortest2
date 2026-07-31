package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.inmobi.media.da, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC3939da {
    public static Qa a;

    public static final Qa a() {
        Qa qa;
        if (a == null) {
            Context context = AbstractC4002fj.a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                qa = Pa.a(context, "CrashSession-store");
            } else {
                qa = null;
            }
            a = qa;
        }
        return a;
    }
}
