package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099z0 extends Lambda implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0099z0(String str, boolean z) {
        super(0);
        this.a = str;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C0014d c0014d = C0014d.b;
        String name = this.a;
        c0014d.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        D d = (D) c0014d.a.get(name);
        if (d != null) {
            d.i = this.b;
        }
        return Unit.INSTANCE;
    }
}
