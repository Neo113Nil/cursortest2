package com.ogury.ad.internal;

import android.content.Context;
import com.ogury.core.internal.datastore.datastore.core.DataStore;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class je extends Lambda implements Function0 {
    public final /* synthetic */ ke a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je(ke keVar) {
        super(0);
        this.a = keVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        ke keVar = this.a;
        Context context = keVar.a;
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (DataStore) keVar.b.getValue(context, ke.e[0]);
    }
}
