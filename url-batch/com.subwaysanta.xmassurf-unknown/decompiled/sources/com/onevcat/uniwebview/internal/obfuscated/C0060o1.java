package com.onevcat.uniwebview.internal.obfuscated;

import android.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0060o1 extends Lambda implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0060o1(String str, float f, float f2, float f3) {
        super(0);
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        r rVar = r.b;
        String name = this.a;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        K2 k2 = (K2) rVar.a.get(name);
        if (k2 != null) {
            float f = 255;
            k2.h = Integer.valueOf(Color.rgb((int) (this.b * f), (int) (this.c * f), (int) (this.d * f)));
        }
        return Unit.INSTANCE;
    }
}
