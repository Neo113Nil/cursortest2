package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;

/* loaded from: classes12.dex */
public final class m implements Runnable {
    public final /* synthetic */ n a;

    public m(n nVar) {
        this.a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        File a = n.a(this.a.a, "fyb.vamp.vid.cache");
        if (a != null) {
            try {
                IAlog.a("VideoCache opening the cache in directory - %s", a);
                this.a.b = g.a(a, 52428800L);
                g gVar = this.a.b;
                gVar.getClass();
                IAlog.e("DiskLruCache delete cache", new Object[0]);
                gVar.close();
                l.a(gVar.a);
                this.a.b = g.a(a, 52428800L);
                g gVar2 = this.a.b;
                synchronized (gVar2) {
                    j = gVar2.h;
                }
                IAlog.a("VideoCache opened the cache in directory - %s current size is %d", a, Long.valueOf(j));
                n nVar = this.a;
                nVar.b.l = nVar;
                nVar.c = true;
            } catch (Throwable th) {
                z.a("Failed to open cache directory", th.getMessage(), null, null);
                IAlog.a("Failed to open cache directory", th, new Object[0]);
            }
        }
    }
}
