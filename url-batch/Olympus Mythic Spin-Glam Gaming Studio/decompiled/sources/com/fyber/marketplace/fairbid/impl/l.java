package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.marketplace.fairbid.bridge.MarketplaceOnUserAgentAvailableListener;

/* loaded from: classes3.dex */
public final class l implements Runnable {
    public final /* synthetic */ MarketplaceOnUserAgentAvailableListener a;

    public l(MarketplaceOnUserAgentAvailableListener marketplaceOnUserAgentAvailableListener) {
        this.a = marketplaceOnUserAgentAvailableListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAConfigManager iAConfigManager;
        int i = 0;
        while (true) {
            iAConfigManager = IAConfigManager.N;
            if (!iAConfigManager.x.a.get() || iAConfigManager.x.d.compareAndSet(true, true) || i >= 100) {
                break;
            }
            IAlog.a("UserAgentProvider | waiting on user agent", new Object[0]);
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            i++;
        }
        String a = iAConfigManager.x.a();
        if (a.isEmpty()) {
            return;
        }
        IAlog.a("UserAgentAvailable", new Object[0]);
        this.a.onUserAgentAvailable(a);
    }
}
