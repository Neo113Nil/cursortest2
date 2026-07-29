package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036i1 extends Lambda implements Function1 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0036i1(String str) {
        super(1);
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        C0092z c0092z = it.v;
        String domain = this.a;
        c0092z.getClass();
        Intrinsics.checkNotNullParameter(domain, "domain");
        C0007b0 c0007b0 = c0092z.e;
        c0007b0.getClass();
        Intrinsics.checkNotNullParameter(domain, "domain");
        String a = C0007b0.a(domain);
        if (a != null) {
            c0007b0.i.remove(a);
        }
        return Unit.INSTANCE;
    }
}
