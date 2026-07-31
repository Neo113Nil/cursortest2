package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes15.dex */
public final class z extends Lambda implements Function0 {
    public final /* synthetic */ Sdk.SDKError.Reason a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Sdk.SDKError.Builder c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Sdk.SDKError.Reason reason, String str, Sdk.SDKError.Builder builder) {
        super(0);
        this.a = reason;
        this.b = str;
        this.c = builder;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Logging error: ");
        a.append(this.a);
        a.append(" with message: ");
        a.append(this.b);
        a.append(", mediation: ");
        a.append(this.c.getMediationName());
        return a.toString();
    }
}
