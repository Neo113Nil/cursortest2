package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0020e1 extends Lambda implements Function1 {
    public static final C0020e1 a = new C0020e1();

    public C0020e1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.l) {
            it.e();
        } else {
            C0058o c0058o = C0058o.b;
            String message = "Ignored transparency mask refresh for " + it.b + " because feature is disabled";
            c0058o.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c0058o.a(EnumC0054n.DEBUG, message);
        }
        return Unit.INSTANCE;
    }
}
