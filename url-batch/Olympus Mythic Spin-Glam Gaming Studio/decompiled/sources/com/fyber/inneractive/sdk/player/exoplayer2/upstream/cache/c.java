package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.util.p;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.safedk.android.internal.partials.DTExchangeFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class c {
    public final l a;
    public final long b = 10485760;
    public final int c = 20480;
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.k d;
    public File e;
    public OutputStream f;
    public FileOutputStream g;
    public long h;
    public long i;
    public p j;

    public c(l lVar) {
        this.a = lVar;
    }

    public final void a() {
        OutputStream outputStream = this.f;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            this.g.getFD().sync();
            z.a(this.f);
            this.f = null;
            File file = this.e;
            this.e = null;
            l lVar = this.a;
            synchronized (lVar) {
                m a = m.a(file, lVar.d);
                if (a == null) {
                    throw new IllegalStateException();
                }
                if (!lVar.c.containsKey(a.a)) {
                    throw new IllegalStateException();
                }
                if (file.exists()) {
                    if (file.length() == 0) {
                        file.delete();
                        return;
                    }
                    long a2 = lVar.a(a.a);
                    if (a2 != -1 && a.b + a.c > a2) {
                        throw new IllegalStateException();
                    }
                    lVar.a(a);
                    lVar.d.b();
                    lVar.notifyAll();
                }
            }
        } catch (Throwable th) {
            z.a(this.f);
            this.f = null;
            File file2 = this.e;
            this.e = null;
            file2.delete();
            throw th;
        }
    }

    public final void b() {
        File file;
        long j = this.d.d;
        long min = j == -1 ? this.b : Math.min(j - this.i, this.b);
        l lVar = this.a;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = this.d;
        String str = kVar.e;
        long j2 = kVar.b + this.i;
        synchronized (lVar) {
            try {
                if (!lVar.c.containsKey(str)) {
                    throw new IllegalStateException();
                }
                if (!lVar.a.exists()) {
                    lVar.a();
                    lVar.a.mkdirs();
                }
                lVar.b.a(lVar, min);
                File file2 = lVar.a;
                i iVar = lVar.d;
                h hVar = (h) iVar.a.get(str);
                if (hVar == null) {
                    hVar = iVar.a(str, -1L);
                }
                int i = hVar.a;
                long currentTimeMillis = System.currentTimeMillis();
                Pattern pattern = m.g;
                file = new File(file2, i + "." + j2 + "." + currentTimeMillis + ".v3.exo");
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e = file;
        FileOutputStream fileOutputStreamCtor = DTExchangeFilesBridge.fileOutputStreamCtor(this.e);
        this.g = fileOutputStreamCtor;
        if (this.c > 0) {
            p pVar = this.j;
            if (pVar == null) {
                this.j = new p(this.g, this.c);
            } else {
                pVar.a(fileOutputStreamCtor);
            }
            this.f = this.j;
        } else {
            this.f = fileOutputStreamCtor;
        }
        this.h = 0L;
    }
}
