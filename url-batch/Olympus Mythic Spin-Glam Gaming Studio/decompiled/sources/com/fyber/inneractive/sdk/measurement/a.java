package com.fyber.inneractive.sdk.measurement;

import com.fyber.inneractive.sdk.network.f0;

/* loaded from: classes5.dex */
public final class a implements f0 {
    public final /* synthetic */ e a;

    public a(e eVar) {
        this.a = eVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        if (str != null) {
            this.a.b = str;
        }
    }
}
