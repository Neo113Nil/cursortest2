package com.inmobi.media;

import android.content.Context;
import com.iab.omid.library.inmobi.Omid;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.yf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4499yf {
    public static final /* synthetic */ int a = 0;

    static {
        Intrinsics.checkNotNullExpressionValue(AbstractC4499yf.class.getSimpleName(), "getSimpleName(...)");
    }

    public static boolean a(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        try {
            if (!Omid.isActive()) {
                Omid.activate(applicationContext);
            }
            return Omid.isActive();
        } catch (Throwable th) {
            th.getStackTrace();
            return false;
        }
    }
}
