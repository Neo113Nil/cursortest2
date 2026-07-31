package com.vungle.ads.internal.bidding;

import android.content.Context;
import com.vungle.ads.internal.ServiceLocator;
import com.vungle.ads.internal.network.VungleApiClient;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class c extends Lambda implements Function0 {
    public final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(0);
        this.a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return ServiceLocator.d.a(this.a).getService(VungleApiClient.class);
    }
}
