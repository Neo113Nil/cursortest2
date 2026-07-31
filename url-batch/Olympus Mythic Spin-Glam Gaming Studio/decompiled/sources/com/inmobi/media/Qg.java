package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class Qg {
    public final Qa a;

    public Qg(Context context, String sharePrefFile) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharePrefFile, "sharePrefFile");
        ConcurrentHashMap concurrentHashMap = Qa.b;
        this.a = Pa.a(context, sharePrefFile);
    }

    public final String a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Qa qa = this.a;
        qa.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        return qa.a.getString(key, null);
    }
}
