package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class Pa {
    public static String a(String fileKey) {
        Intrinsics.checkNotNullParameter(fileKey, "fileKey");
        return "com.im.keyValueStore." + fileKey;
    }

    public static Qa a(Context context, String fileKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileKey, "fileKey");
        String a = a(fileKey);
        ConcurrentHashMap concurrentHashMap = Qa.b;
        Qa qa = (Qa) concurrentHashMap.get(a);
        if (qa == null) {
            qa = new Qa(context, a);
            Qa qa2 = (Qa) concurrentHashMap.putIfAbsent(a, qa);
            if (qa2 != null) {
                return qa2;
            }
        }
        return qa;
    }
}
