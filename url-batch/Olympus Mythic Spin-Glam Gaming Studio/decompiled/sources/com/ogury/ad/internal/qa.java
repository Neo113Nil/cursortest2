package com.ogury.ad.internal;

import android.graphics.Rect;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class qa extends FunctionReferenceImpl implements Function1 {
    public qa(Object obj) {
        super(1, obj, ra.class, "onMouseUp", "onMouseUp(Lcom/ogury/ad/viewer/AdLayout;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g p0 = (g) obj;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ra raVar = (ra) this.receiver;
        raVar.a.getClass();
        Rect adLayoutRect = wi.a((ViewGroup) p0);
        vg vgVar = raVar.b;
        vgVar.getClass();
        Intrinsics.checkNotNullParameter(adLayoutRect, "adLayoutRect");
        vgVar.c = new Rect(adLayoutRect);
        return Unit.INSTANCE;
    }
}
