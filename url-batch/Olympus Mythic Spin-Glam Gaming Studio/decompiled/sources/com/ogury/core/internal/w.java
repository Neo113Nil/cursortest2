package com.ogury.core.internal;

import android.content.Context;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes4.dex */
public final class w {
    public final Context a;

    public w(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        z0 z0Var = (z0) LazyKt.lazy(new r(this)).getValue();
        z0Var.getClass();
        BuildersKt__BuildersKt.runBlocking$default(null, new w0(z0Var, null), 1, null);
        SharedPrefsUtilsKt.deleteLegacySharedPreferences(context, "ogury_core_token_file");
    }
}
