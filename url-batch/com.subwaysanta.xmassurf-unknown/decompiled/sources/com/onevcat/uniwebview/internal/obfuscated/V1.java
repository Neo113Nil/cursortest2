package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class V1 extends Lambda implements Function1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V1(String str, String str2) {
        super(1);
        this.a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        C0092z c0092z = it.v;
        String key = this.a;
        String str = this.b;
        c0092z.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        if (StringsKt.isBlank(key)) {
            C0058o c0058o = C0058o.b;
            c0058o.getClass();
            Intrinsics.checkNotNullParameter("Trying to set null or empty key for header field. Please check you have set correct key.", "message");
            c0058o.a(EnumC0054n.CRITICAL, "Trying to set null or empty key for header field. Please check you have set correct key.");
        } else if (str == null) {
            c0092z.e.g.remove(key);
        } else {
            c0092z.e.g.put(key, str);
        }
        return Unit.INSTANCE;
    }
}
