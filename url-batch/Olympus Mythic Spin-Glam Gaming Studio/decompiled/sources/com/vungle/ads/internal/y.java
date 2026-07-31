package com.vungle.ads.internal;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes15.dex */
public final class y implements w {
    public final /* synthetic */ BlockingQueue a;

    public y(LinkedBlockingQueue linkedBlockingQueue) {
        this.a = linkedBlockingQueue;
    }

    @Override // com.vungle.ads.internal.w
    public final void a() {
        boolean z = com.vungle.ads.internal.util.u.a;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Failed to send ");
        a.append(this.a.size());
        a.append(" metrics");
        com.vungle.ads.internal.util.t.a("AnalyticsClient", a.toString());
        AnalyticsClient.INSTANCE.getClass();
        AnalyticsClient.b.addAll(this.a);
    }

    @Override // com.vungle.ads.internal.w
    public final void onSuccess() {
        boolean z = com.vungle.ads.internal.util.u.a;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Sent ");
        a.append(this.a.size());
        a.append(" metrics");
        com.vungle.ads.internal.util.t.a("AnalyticsClient", a.toString());
    }
}
