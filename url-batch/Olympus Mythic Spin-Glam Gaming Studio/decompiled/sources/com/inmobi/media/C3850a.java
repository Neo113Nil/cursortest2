package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: com.inmobi.media.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C3850a extends S0 {
    public final byte[] b;
    public final long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3850a(byte[] response, long j, C4493y9 c4493y9) {
        super(c4493y9);
        Intrinsics.checkNotNullParameter(response, "response");
        this.b = response;
        this.c = j;
    }

    @Override // com.inmobi.media.S0
    public final Unit a(AdResponse adResponse, Function1 function1) {
        C4493y9 c4493y9 = this.a;
        if (c4493y9 != null) {
            c4493y9.a("ABAdResponseManager", "Instance PLId: " + this.c + ", Response PLId: " + adResponse.getPlacementId());
        }
        W0.a(adResponse, this.a, function1);
        return Unit.INSTANCE;
    }

    @Override // com.inmobi.media.S0
    public final Object a(Continuation continuation) {
        return new String(this.b, Charsets.UTF_8);
    }
}
