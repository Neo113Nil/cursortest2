package com.onevcat.uniwebview.internal.obfuscated;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040j1 extends Lambda implements Function1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0040j1(String str, String str2) {
        super(1);
        this.a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String b;
        Set set;
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        C0092z c0092z = it.v;
        String domain = this.a;
        String fingerprint = this.b;
        c0092z.getClass();
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(fingerprint, "fingerprint");
        C0007b0 c0007b0 = c0092z.e;
        c0007b0.getClass();
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(fingerprint, "fingerprint");
        String a = C0007b0.a(domain);
        if (a != null && (b = C0007b0.b(fingerprint)) != null && (set = (Set) c0007b0.j.get(a)) != null && set.remove(b)) {
            if (set.isEmpty()) {
                c0007b0.j.remove(a);
            }
            C0058o c0058o = C0058o.b;
            String message = "Removed SSL fingerprint for domain '" + a + "'. Remaining count: " + set.size();
            c0058o.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c0058o.a(EnumC0054n.VERBOSE, message);
        }
        return Unit.INSTANCE;
    }
}
