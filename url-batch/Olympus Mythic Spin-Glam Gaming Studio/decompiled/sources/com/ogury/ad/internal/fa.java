package com.ogury.ad.internal;

import android.app.Activity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final /* synthetic */ class fa extends FunctionReferenceImpl implements Function2 {
    public fa(ga gaVar) {
        super(2, gaVar, ga.class, "showNextAd", "showNextAd(Lcom/ogury/ad/common/network/models/Ad;Ljava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b p0 = (b) obj;
        List p1 = (List) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ga gaVar = (ga) this.receiver;
        Activity activity = gaVar.j;
        if (activity != null) {
            g gVar = new g(gaVar.a);
            gaVar.e = gVar;
            gVar.setContainsOverlayAd(true);
            gaVar.h = gaVar.b();
            gaVar.a(p0, p1, activity, true);
        }
        return Unit.INSTANCE;
    }
}
