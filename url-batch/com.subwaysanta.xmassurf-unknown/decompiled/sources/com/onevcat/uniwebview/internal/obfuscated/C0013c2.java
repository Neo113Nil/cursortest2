package com.onevcat.uniwebview.internal.obfuscated;

import android.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013c2 extends Lambda implements Function1 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0013c2(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        super(1);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        float f5 = this.e;
        float f6 = this.f;
        float f7 = this.g;
        float f8 = this.h;
        float f9 = this.i;
        it.getClass();
        it.x.setShadowStyle(new L2(RangesKt.coerceAtLeast(f6, 0.0f), RangesKt.coerceIn(f5, 0.0f, 1.0f), f7, f8, RangesKt.coerceAtLeast(f9, 0.0f), Color.argb(MathKt.roundToInt(RangesKt.coerceIn(f4, 0.0f, 1.0f) * 255.0f), MathKt.roundToInt(RangesKt.coerceIn(f, 0.0f, 1.0f) * 255.0f), MathKt.roundToInt(RangesKt.coerceIn(f2, 0.0f, 1.0f) * 255.0f), MathKt.roundToInt(RangesKt.coerceIn(f3, 0.0f, 1.0f) * 255.0f))));
        it.f();
        return Unit.INSTANCE;
    }
}
