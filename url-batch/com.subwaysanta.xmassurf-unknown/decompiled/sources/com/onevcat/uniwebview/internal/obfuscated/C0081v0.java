package com.onevcat.uniwebview.internal.obfuscated;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0081v0 extends Lambda implements Function1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0081v0(String str, String str2) {
        super(1);
        this.a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
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
        if (a == null) {
            C0058o c0058o = C0058o.b;
            String message = "Cannot pin SSL fingerprint. Invalid domain: '" + domain + '\'';
            c0058o.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c0058o.a(EnumC0054n.CRITICAL, message);
        } else {
            String b = C0007b0.b(fingerprint);
            if (b == null) {
                C0058o c0058o2 = C0058o.b;
                String message2 = "Cannot pin SSL fingerprint for '" + a + "'. Invalid fingerprint: '" + fingerprint + '\'';
                c0058o2.getClass();
                Intrinsics.checkNotNullParameter(message2, "message");
                c0058o2.a(EnumC0054n.CRITICAL, message2);
            } else {
                LinkedHashMap linkedHashMap = c0007b0.j;
                Object obj2 = linkedHashMap.get(a);
                if (obj2 == null) {
                    obj2 = new LinkedHashSet();
                    linkedHashMap.put(a, obj2);
                }
                ((Set) obj2).add(b);
                C0058o c0058o3 = C0058o.b;
                String message3 = "Registered SSL fingerprint for domain '" + a + "'.";
                c0058o3.getClass();
                Intrinsics.checkNotNullParameter(message3, "message");
                c0058o3.a(EnumC0054n.VERBOSE, message3);
            }
        }
        return Unit.INSTANCE;
    }
}
