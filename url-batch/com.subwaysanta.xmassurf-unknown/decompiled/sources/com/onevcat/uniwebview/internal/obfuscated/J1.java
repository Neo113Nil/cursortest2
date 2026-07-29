package com.onevcat.uniwebview.internal.obfuscated;

import android.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class J1 extends Lambda implements Function1 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1(float f, float f2, float f3, float f4) {
        super(1);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        C0039j0 c0039j0 = it.w;
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        c0039j0.getClass();
        float f5 = 255;
        int argb = Color.argb((int) (f4 * f5), (int) (f * f5), (int) (f2 * f5), (int) (f3 * f5));
        c0039j0.b.setTextColor(argb);
        c0039j0.c.setTextColor(argb);
        c0039j0.a.setTextColor(argb);
        return Unit.INSTANCE;
    }
}
