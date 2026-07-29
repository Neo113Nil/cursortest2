package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0078u0 extends Lambda implements Function1 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0078u0(String str) {
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
        if (a == null) {
            C0058o c0058o = C0058o.b;
            String message = "Cannot add SSL exception domain. Invalid input: '" + domain + '\'';
            c0058o.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c0058o.a(EnumC0054n.CRITICAL, message);
        } else {
            c0007b0.i.add(a);
            if (!c0007b0.k) {
                C0058o c0058o2 = C0058o.b;
                c0058o2.getClass();
                Intrinsics.checkNotNullParameter("AddSslExceptionDomain is deprecated and no longer bypasses SSL errors. Use AddSslPinnedFingerprint instead.", "message");
                c0058o2.a(EnumC0054n.CRITICAL, "AddSslExceptionDomain is deprecated and no longer bypasses SSL errors. Use AddSslPinnedFingerprint instead.");
                c0007b0.k = true;
            }
        }
        return Unit.INSTANCE;
    }
}
