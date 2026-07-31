package com.ogury.ad.internal;

import com.ogury.ad.viewer.AdsCallback;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class n0 extends FunctionReferenceImpl implements Function1 {
    public n0(o0 o0Var) {
        super(1, o0Var, o0.class, "sendShowEvent", "sendShowEvent(Lcom/ogury/ad/mraid/MraidEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        r7 event = (r7) obj;
        Intrinsics.checkNotNullParameter(event, "p0");
        o0 o0Var = (o0) this.receiver;
        a0 a0Var = o0Var.l;
        x adType = o0Var.k;
        c cVar = o0Var.b;
        AdsCallback adsCallback = o0Var.t;
        g9 g9Var = o0Var.v;
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(adType, "adType");
        if (Intrinsics.areEqual(event.b, "adDisplayed")) {
            a0Var.b(adType, cVar, adsCallback);
        } else if (Intrinsics.areEqual(event.b, "adImpression")) {
            a0Var.a(adType, cVar, event.a, adsCallback);
        } else if (Intrinsics.areEqual(event.b, com.safedk.android.analytics.brandsafety.creatives.discoveries.h.ah)) {
            a0Var.g++;
            a0Var.c(adType, cVar, adsCallback);
        } else if (Intrinsics.areEqual(event.b, "closeWhithoutShowNextAd")) {
            a0Var.h = true;
            a0Var.c(adType, cVar, adsCallback);
        } else if (event instanceof w7) {
            a0.a((w7) event, adType, cVar, g9Var);
        } else if (event instanceof i6) {
            ConcurrentHashMap concurrentHashMap = i.a;
            i.a(event.a);
            a0Var.a(adType, cVar, adsCallback);
        } else if (event instanceof q7) {
            a0.a((q7) event, adType, cVar, adsCallback);
        }
        return Unit.INSTANCE;
    }
}
