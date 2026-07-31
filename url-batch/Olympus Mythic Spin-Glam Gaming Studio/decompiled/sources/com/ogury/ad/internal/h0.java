package com.ogury.ad.internal;

import com.ogury.ad.OguryAdError;
import com.ogury.ad.viewer.AdsCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class h0 extends Lambda implements Function1 {
    public final /* synthetic */ o0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(o0 o0Var) {
        super(1);
        this.a = o0Var;
    }

    public final void a(ph throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        int ordinal = throwable.b.ordinal();
        if (ordinal == 0) {
            this.a.c("Failed to load (" + throwable.a.getMessage() + ")");
            this.a.a(new OguryAdError(OguryAdError.Type.LOAD_ERROR, 2200, "The load failed because the ad request encountered an error, and the server returned an unexpected response: " + throwable.a.getMessage() + "."));
            return;
        }
        if (ordinal == 1) {
            this.a.c("Failed to load (" + throwable.a.getMessage() + ")");
            this.a.a(new OguryAdError(OguryAdError.Type.LOAD_ERROR, 2202, "The ad could not be loaded due to a failure in parsing."));
            return;
        }
        if (ordinal == 2) {
            this.a.c("Failed to load (no ad available)");
            this.a.b("Triggering onAdError() callback");
            o0 o0Var = this.a;
            if (o0Var.t == null) {
                o0Var.b("No ad listener registered");
            }
            AdsCallback adsCallback = this.a.t;
            if (adsCallback != null) {
                adsCallback.onAdNotAvailable();
            }
            this.a.q = false;
            return;
        }
        if (ordinal != 3) {
            return;
        }
        this.a.c("Failed to load (" + throwable.getMessage() + ")");
        this.a.a(new OguryAdError(OguryAdError.Type.LOAD_ERROR, 2200, "The load failed because the ad request encountered an error, and the server returned an unexpected response: " + throwable.a.getMessage() + "."));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((ph) obj);
        return Unit.INSTANCE;
    }
}
