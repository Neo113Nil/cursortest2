package com.ogury.ad.internal;

import com.ogury.ad.OguryAdError;
import com.ogury.ad.common.OguryMediation;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class f0 extends Lambda implements Function1 {
    public final /* synthetic */ o0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(o0 o0Var) {
        super(1);
        this.a = o0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ph it = (ph) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        this.a.c("Failed. Configuration not synced");
        o0 o0Var = this.a;
        u5 u5Var = o0Var.e;
        nb nbVar = nb.l;
        String str = o0Var.b.a;
        String str2 = o0Var.m;
        OguryMediation oguryMediation = o0Var.n;
        JSONObject put = new JSONObject().put("stacktrace", it.getMessage());
        Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(this.a.y != null));
        Pair pair2 = TuplesKt.to("reload", Boolean.valueOf(this.a.p));
        int i = this.a.z;
        u5Var.a(nbVar, str, str2, oguryMediation, pb.a(pair, pair2, TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)), put, this.a.B);
        this.a.a(new OguryAdError(OguryAdError.Type.LOAD_ERROR, 2100, "The load could not proceed due to an invalid SDK configuration."));
        return Unit.INSTANCE;
    }
}
