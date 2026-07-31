package com.ogury.ad.internal;

import com.ogury.ad.viewer.AdsCallback;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class i0 extends Lambda implements Function1 {
    public final /* synthetic */ o0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(o0 o0Var) {
        super(1);
        this.a = o0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        q adResponse = (q) obj;
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        o0 o0Var = this.a;
        if (!o0Var.x) {
            o0Var.b("Ads available");
            AdsCallback adsCallback = o0Var.t;
            if (adsCallback != null) {
                adsCallback.onAdAvailable();
            }
            o0Var.a(CollectionsKt.toMutableList((Collection) adResponse.a));
        }
        return Unit.INSTANCE;
    }
}
