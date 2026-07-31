package com.ogury.ad.internal;

import android.content.Context;
import com.ogury.core.internal.SharedPrefsUtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class y6 {
    public final l7 a(Context context) {
        l7 l7Var;
        Intrinsics.checkNotNullParameter(context, "context");
        l7 l7Var2 = l7.e;
        if (l7Var2 != null) {
            return l7Var2;
        }
        synchronized (this) {
            l7Var = l7.e;
            if (l7Var == null) {
                l7Var = new l7(context);
                l7.e = l7Var;
                SharedPrefsUtilsKt.deleteLegacySharedPreferences(context, "ogury_mraid");
            }
        }
        return l7Var;
    }
}
