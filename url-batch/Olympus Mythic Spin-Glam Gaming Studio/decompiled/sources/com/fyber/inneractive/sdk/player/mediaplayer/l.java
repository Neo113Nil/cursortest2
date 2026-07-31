package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes15.dex */
public final class l implements Runnable {
    public final /* synthetic */ p a;

    public l(p pVar) {
        this.a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.a;
        String b = pVar.b();
        long currentTimeMillis = System.currentTimeMillis();
        pVar.setVolume(0.0f, 0.0f);
        IAlog.e(b + "timelog: mute took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }
}
