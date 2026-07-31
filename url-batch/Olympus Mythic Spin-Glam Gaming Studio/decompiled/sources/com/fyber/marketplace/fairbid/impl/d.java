package com.fyber.marketplace.fairbid.impl;

import java.util.Map;

/* loaded from: classes3.dex */
public final class d implements com.fyber.inneractive.sdk.network.o {
    public final /* synthetic */ Map a;
    public final /* synthetic */ String b;

    public d(Map map, String str) {
        this.a = map;
        this.b = str;
    }

    @Override // com.fyber.inneractive.sdk.network.o
    public final StringBuffer a() {
        return new StringBuffer(this.b);
    }

    @Override // com.fyber.inneractive.sdk.network.o
    public final Map b() {
        return this.a;
    }
}
