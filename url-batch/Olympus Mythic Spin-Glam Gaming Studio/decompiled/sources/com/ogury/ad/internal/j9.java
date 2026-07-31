package com.ogury.ad.internal;

import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class j9 extends Lambda implements Function1 {
    public final /* synthetic */ n9 a;
    public final /* synthetic */ c0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(n9 n9Var, c0 c0Var) {
        super(1);
        this.a = n9Var;
        this.b = c0Var;
    }

    public final void a(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        n9 n9Var = this.a;
        n9Var.i = it;
        n9Var.h = 4;
        LogTag logTag = LogTag.INTERNAL;
        SourceTag sourceTag = SourceTag.ADS;
        IntegrationLogger.e(logTag, sourceTag, "[Setup] Failed to set up " + it.getMessage());
        Logger.INSTANCE.e(logTag, sourceTag, it);
        this.b.d.onFailed(null);
        n9 n9Var2 = this.a;
        Iterator it2 = n9Var2.j.iterator();
        while (it2.hasNext()) {
            ((d0) ((o9) it2.next())).a(it);
        }
        n9Var2.j.clear();
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
