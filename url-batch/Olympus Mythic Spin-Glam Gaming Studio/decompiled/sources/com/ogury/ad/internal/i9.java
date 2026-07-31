package com.ogury.ad.internal;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes9.dex */
public final class i9 extends Lambda implements Function0 {
    public final /* synthetic */ n9 a;
    public final /* synthetic */ ke b;
    public final /* synthetic */ c0 c;
    public final /* synthetic */ Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(n9 n9Var, ke keVar, c0 c0Var, Context context) {
        super(0);
        this.a = n9Var;
        this.b = keVar;
        this.c = c0Var;
        this.d = context;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        ke keVar = this.b;
        String apiKey = this.c.b;
        Intrinsics.checkNotNull(apiKey);
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        BuildersKt.runBlocking(Dispatchers.getIO(), new qd(keVar, apiKey, null));
        this.a.a(this.d, this.b);
        return Unit.INSTANCE;
    }
}
