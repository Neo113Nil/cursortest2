package com.ogury.ad.internal;

import com.ogury.ad.OguryAdError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class j0 extends Lambda implements Function1 {
    public final /* synthetic */ o0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(o0 o0Var) {
        super(1);
        this.a = o0Var;
    }

    public final void a(ph errorThrowable) {
        Intrinsics.checkNotNullParameter(errorThrowable, "errorThrowable");
        this.a.c("Failed to load (" + errorThrowable.getMessage() + ")");
        this.a.a(new OguryAdError(OguryAdError.Type.LOAD_ERROR, 2202, "The ad could not be loaded due to a failure in parsing."));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((ph) obj);
        return Unit.INSTANCE;
    }
}
