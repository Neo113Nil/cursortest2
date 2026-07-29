package com.onevcat.uniwebview.internal.obfuscated;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

/* loaded from: classes.dex */
public final class E1 extends Lambda implements Function1 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E1(float f, float f2, float f3, float f4) {
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
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        it.getClass();
        float coerceAtLeast = RangesKt.coerceAtLeast(f, 0.0f);
        float coerceAtLeast2 = RangesKt.coerceAtLeast(f2, 0.0f);
        float coerceAtLeast3 = RangesKt.coerceAtLeast(f3, 0.0f);
        float coerceAtLeast4 = RangesKt.coerceAtLeast(f4, 0.0f);
        C0011c0 c0011c0 = new C0011c0(coerceAtLeast, coerceAtLeast2, coerceAtLeast3, coerceAtLeast4);
        if (!Intrinsics.areEqual(it.u, c0011c0)) {
            it.u = c0011c0;
            it.y.a(coerceAtLeast, coerceAtLeast2, coerceAtLeast3, coerceAtLeast4);
            M2 m2 = it.x;
            m2.getClass();
            float[] fArr = {RangesKt.coerceAtLeast(coerceAtLeast, 0.0f), RangesKt.coerceAtLeast(coerceAtLeast2, 0.0f), RangesKt.coerceAtLeast(coerceAtLeast3, 0.0f), RangesKt.coerceAtLeast(coerceAtLeast4, 0.0f)};
            if (!Arrays.equals(m2.b, fArr)) {
                m2.b = fArr;
                m2.invalidate();
            }
            it.f();
        }
        return Unit.INSTANCE;
    }
}
