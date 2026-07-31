package com.ogury.ad.internal;

import android.app.Application;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class w0 extends FunctionReferenceImpl implements Function2 {
    public w0(x0 x0Var) {
        super(2, x0Var, x0.class, "showNextAd", "showNextAd(Lcom/ogury/ad/common/network/models/Ad;Ljava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b p0 = (b) obj;
        List p1 = (List) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        x0 x0Var = (x0) this.receiver;
        Application context = x0Var.a;
        Intrinsics.checkNotNullParameter(context, "context");
        g gVar = new g(context);
        gVar.setupDrag(false);
        x0Var.c = gVar;
        m1 m1Var = x0Var.e;
        m1Var.getClass();
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        m1Var.a = gVar;
        x0Var.f = x0Var.a();
        x0Var.a(p0, x0Var.h, p1, false);
        return Unit.INSTANCE;
    }
}
