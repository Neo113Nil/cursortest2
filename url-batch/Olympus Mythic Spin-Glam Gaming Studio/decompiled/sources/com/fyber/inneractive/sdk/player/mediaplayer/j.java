package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes15.dex */
public final class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public j(p pVar, int i) {
        this.b = pVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.b;
        int i = this.a;
        String b = pVar.b();
        long currentTimeMillis = System.currentTimeMillis();
        pVar.seekTo(i);
        IAlog.e(b + "timelog: seekTo took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }
}
