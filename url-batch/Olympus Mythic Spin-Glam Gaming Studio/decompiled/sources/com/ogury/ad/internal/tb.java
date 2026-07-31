package com.ogury.ad.internal;

import android.content.Context;
import com.ogury.core.internal.SharedPrefsUtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class tb {
    public final ke a(Context context) {
        ke keVar;
        Intrinsics.checkNotNullParameter(context, "context");
        ke keVar2 = ke.f;
        if (keVar2 != null) {
            return keVar2;
        }
        synchronized (this) {
            keVar = ke.f;
            if (keVar == null) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                keVar = new ke(applicationContext);
                ke.f = keVar;
                SharedPrefsUtilsKt.deleteLegacySharedPreferences(context, "profig");
            }
        }
        return keVar;
    }
}
