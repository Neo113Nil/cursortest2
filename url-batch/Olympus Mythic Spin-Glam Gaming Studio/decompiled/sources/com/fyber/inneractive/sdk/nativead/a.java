package com.fyber.inneractive.sdk.nativead;

import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.player.cache.g;
import com.fyber.inneractive.sdk.player.cache.l;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;

/* loaded from: classes13.dex */
public final class a implements Runnable {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        File a = b.a(this.a);
        if (a != null) {
            try {
                IAlog.a("NativeCache opening the cache in directory - %s", a);
                this.a.b = g.a(a, 41943040L);
                g gVar = this.a.b;
                gVar.getClass();
                IAlog.e("DiskLruCache delete cache", new Object[0]);
                gVar.close();
                l.a(gVar.a);
                this.a.b = g.a(a, 41943040L);
                g gVar2 = this.a.b;
                synchronized (gVar2) {
                    j = gVar2.h;
                }
                IAlog.a("NativeCache opened the cache in directory - %s current size is %d", a, Long.valueOf(j));
                b bVar = this.a;
                bVar.b.l = bVar;
                bVar.c = true;
            } catch (Throwable th) {
                z.a("Failed to open cache directory", th.getMessage(), null, null);
                IAlog.a("Failed to open cache directory", th, new Object[0]);
            }
        }
    }
}
