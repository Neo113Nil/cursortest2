package com.fyber.inneractive.sdk.network;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes5.dex */
public final class h1 extends t0 {
    public final String p;

    public h1(f0 f0Var, String str) {
        super(f0Var, g0.c.a(), null);
        this.p = str;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i) {
        o0 o0Var = new o0();
        com.fyber.inneractive.sdk.click.c cVar = new com.fyber.inneractive.sdk.click.c();
        if (lVar != null) {
            ArrayList arrayList = lVar.f;
            cVar.a.clear();
            cVar.a.addAll(arrayList);
            InputStream inputStream = lVar.c;
            if (inputStream != null) {
                String stringBuffer = com.fyber.inneractive.sdk.util.v.b(inputStream).toString();
                cVar.b = stringBuffer;
                o0Var.b = stringBuffer;
            }
        }
        o0Var.a = cVar;
        return o0Var;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return this.p;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return false;
    }
}
