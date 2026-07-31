package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.network.f0;

/* loaded from: classes3.dex */
public final class h implements f0 {
    public final /* synthetic */ k a;

    public h(k kVar) {
        this.a = kVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        if (str != null) {
            this.a.c = str;
        }
    }
}
