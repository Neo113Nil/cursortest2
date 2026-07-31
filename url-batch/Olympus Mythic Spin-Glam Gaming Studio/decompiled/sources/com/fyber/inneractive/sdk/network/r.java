package com.fyber.inneractive.sdk.network;

/* loaded from: classes11.dex */
public final class r implements p0 {
    public final /* synthetic */ s a;

    public r(s sVar) {
        this.a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.p0
    public final void a(String str) {
        str.hashCode();
        switch (str) {
            case "sdkInitNetworkRequest":
                com.fyber.inneractive.sdk.metrics.d.d.a(this.a.d).f();
                break;
            case "sdkGotServerResponse":
                com.fyber.inneractive.sdk.metrics.d.d.a(this.a.d).g();
                break;
            case "sdkParsedResponse":
                com.fyber.inneractive.sdk.metrics.d.d.a(this.a.d).d();
                break;
        }
    }
}
