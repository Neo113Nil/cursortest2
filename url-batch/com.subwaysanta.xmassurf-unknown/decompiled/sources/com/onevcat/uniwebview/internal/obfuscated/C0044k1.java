package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044k1 extends Lambda implements Function1 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0044k1(String str) {
        super(1);
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        C0092z c0092z = it.v;
        String scheme = this.a;
        c0092z.getClass();
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        C0077u c0077u = c0092z.e.h;
        c0077u.getClass();
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        c0077u.d.remove(scheme);
        return Unit.INSTANCE;
    }
}
