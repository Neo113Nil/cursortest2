package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class B1 extends Lambda implements Function1 {
    public final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(boolean z) {
        super(1);
        this.a = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        C0092z c0092z = it.v;
        boolean z = this.a;
        if (z) {
            i = 0;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2;
        }
        c0092z.setOverScrollMode(i);
        return Unit.INSTANCE;
    }
}
