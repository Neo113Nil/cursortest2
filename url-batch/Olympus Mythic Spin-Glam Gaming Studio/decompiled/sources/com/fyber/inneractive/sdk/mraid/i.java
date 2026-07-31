package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class i extends e {
    public i(LinkedHashMap linkedHashMap, i0 i0Var, g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        int a = a("w");
        int a2 = a("h");
        this.c.a((String) this.b.get("url"), a <= 0 ? -1 : a, a2 <= 0 ? -1 : a2, "true".equals(this.b.get("shouldUseCustomClose")), "true".equals(this.b.get("lockOrientation")));
    }

    @Override // com.fyber.inneractive.sdk.mraid.e
    public final String c() {
        return (String) this.b.get("url");
    }
}
