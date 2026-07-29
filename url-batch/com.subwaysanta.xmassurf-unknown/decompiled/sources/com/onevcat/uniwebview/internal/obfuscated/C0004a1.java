package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004a1 extends Lambda implements Function1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0004a1(String str, String str2) {
        super(1);
        this.a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        C0092z c0092z = it.v;
        String str = this.a;
        String str2 = this.b;
        c0092z.getClass();
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("UniWebView will load HTML string with base url: ", str2, c0058o, "message"));
        String message = "Input HTML content: \n" + str;
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.VERBOSE, message);
        C0007b0 c0007b0 = c0092z.e;
        c0007b0.f = 200;
        c0007b0.d = true;
        c0007b0.c = false;
        c0007b0.e = false;
        if (str != null) {
            c0092z.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
        } else {
            c0092z.loadDataWithBaseURL(str2, "", "text/html", "UTF-8", null);
        }
        return Unit.INSTANCE;
    }
}
