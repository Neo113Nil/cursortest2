package com.ogury.core.internal;

import android.content.Context;
import com.ogury.core.internal.datastore.datastore.core.DataStore;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes4.dex */
public final class r extends Lambda implements Function0 {
    public final /* synthetic */ w a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w wVar) {
        super(0);
        this.a = wVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        Context context = this.a.a;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        KProperty[] kPropertyArr = x.a;
        Intrinsics.checkNotNullParameter(applicationContext, "<this>");
        return new z0(context, "ogury_core_token_file", (DataStore) x.b.getValue(applicationContext, x.a[0]));
    }
}
