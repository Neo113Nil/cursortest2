package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class Ak {
    public static final Qa a;
    public static int b;
    public static Integer c;

    static {
        Qa qa;
        Context context = AbstractC4002fj.a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Qa.b;
            qa = Pa.a(context, "imtelemetrydboverflow");
        } else {
            qa = null;
        }
        a = qa;
        b = -1;
    }

    public static int a() {
        if (b == -1) {
            Qa qa = a;
            int i = 0;
            if (qa != null) {
                Intrinsics.checkNotNullParameter("count", "key");
                i = qa.a.getInt("count", 0);
            }
            b = i;
        }
        return b;
    }
}
