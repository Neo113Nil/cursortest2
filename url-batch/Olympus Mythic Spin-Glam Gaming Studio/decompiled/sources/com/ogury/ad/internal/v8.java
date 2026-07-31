package com.ogury.ad.internal;

import com.ogury.core.internal.network.NetworkRequest;
import com.ogury.core.internal.network.NetworkResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class v8 extends Lambda implements Function0 {
    public final /* synthetic */ z8 a;
    public final /* synthetic */ NetworkRequest b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(z8 z8Var, NetworkRequest networkRequest) {
        super(0);
        this.a = z8Var;
        this.b = networkRequest;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        NetworkResponse execute = this.a.b.newCall(this.b).execute();
        if (execute instanceof NetworkResponse.Failure) {
            throw ((NetworkResponse.Failure) execute).getCom.mobilefuse.sdk.telemetry.TelemetryCategory.EXCEPTION java.lang.String();
        }
        return Unit.INSTANCE;
    }
}
