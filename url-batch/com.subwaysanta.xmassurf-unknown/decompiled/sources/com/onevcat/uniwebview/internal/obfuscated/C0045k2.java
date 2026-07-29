package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.k2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045k2 extends Lambda implements Function1 {
    public final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0045k2(boolean z) {
        super(1);
        this.a = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z = this.a;
        if (it.l != z) {
            it.l = z;
            if (z) {
                it.d();
                it.e();
            } else {
                it.a(CollectionsKt.emptyList(), 1.0f);
            }
        }
        return Unit.INSTANCE;
    }
}
