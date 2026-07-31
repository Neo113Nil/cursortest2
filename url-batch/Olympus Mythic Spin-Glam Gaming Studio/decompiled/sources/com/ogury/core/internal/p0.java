package com.ogury.core.internal;

import android.content.Context;
import com.ogury.core.internal.datastore.datastore.core.DataStore;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes5.dex */
public final class p0 {
    public final Context a;

    public p0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        z0 z0Var = (z0) LazyKt.lazy(new k0(this)).getValue();
        z0Var.getClass();
        BuildersKt__BuildersKt.runBlocking$default(null, new w0(z0Var, null), 1, null);
        SharedPrefsUtilsKt.deleteLegacySharedPreferences(context, "ogury_privacy_data");
    }

    public final DataStore a() {
        Context applicationContext = this.a.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        KProperty[] kPropertyArr = q0.a;
        Intrinsics.checkNotNullParameter(applicationContext, "<this>");
        return (DataStore) q0.b.getValue(applicationContext, q0.a[0]);
    }
}
