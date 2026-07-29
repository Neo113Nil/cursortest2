package com.onevcat.uniwebview.internal.obfuscated;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.b2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009b2 extends Lambda implements Function0 {
    public final /* synthetic */ String[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0009b2(String[] strArr) {
        super(0);
        this.a = strArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list = K2.j;
        List packages = ArraysKt.toList(this.a);
        Intrinsics.checkNotNullParameter(packages, "packages");
        ArrayList arrayList = K2.k;
        arrayList.clear();
        arrayList.addAll(packages);
        C0058o c0058o = C0058o.b;
        String message = "Set preferred Custom Tabs browsers: " + arrayList;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.DEBUG, message);
        return Unit.INSTANCE;
    }
}
