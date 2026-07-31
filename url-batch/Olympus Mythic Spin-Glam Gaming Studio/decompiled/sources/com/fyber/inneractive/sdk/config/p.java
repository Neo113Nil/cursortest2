package com.fyber.inneractive.sdk.config;

/* loaded from: classes5.dex */
public final class p implements com.fyber.inneractive.sdk.network.f0 {
    public final /* synthetic */ s a;

    public p(s sVar) {
        this.a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        o oVar = (o) obj;
        if (oVar != null) {
            s sVar = this.a;
            if (oVar.equals(sVar.b)) {
                return;
            }
            sVar.d = true;
            sVar.b = oVar;
            com.fyber.inneractive.sdk.util.r.a.execute(new q(sVar));
        }
    }
}
