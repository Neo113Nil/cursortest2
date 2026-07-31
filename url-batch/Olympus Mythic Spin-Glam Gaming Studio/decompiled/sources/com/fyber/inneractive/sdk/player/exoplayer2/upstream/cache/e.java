package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.e0;
import java.io.IOException;
import java.io.InterruptedIOException;

/* loaded from: classes5.dex */
public final class e implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.h {
    public final l a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h b;
    public final e0 c;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h d;
    public final boolean e = false;
    public final boolean f = true;
    public final boolean g = false;
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.h h;
    public boolean i;
    public Uri j;
    public int k;
    public String l;
    public long m;
    public long n;
    public m o;
    public boolean p;
    public boolean q;

    public e(l lVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar2, c cVar) {
        this.a = lVar;
        this.b = hVar2;
        this.d = hVar;
        if (cVar != null) {
            this.c = new e0(hVar, cVar);
        } else {
            this.c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[Catch: IOException -> 0x0023, TryCatch #0 {IOException -> 0x0023, blocks: (B:3:0x0001, B:6:0x0012, B:8:0x001e, B:12:0x0032, B:16:0x003d, B:18:0x0049, B:21:0x0055, B:22:0x005a, B:24:0x005d, B:26:0x005b, B:27:0x0025, B:29:0x002b, B:32:0x000e), top: B:2:0x0001 }] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar) {
        boolean z;
        long j;
        long a;
        try {
            Uri uri = kVar.a;
            this.j = uri;
            this.k = kVar.f;
            String str = kVar.e;
            if (str == null) {
                str = uri.toString();
            }
            this.l = str;
            this.m = kVar.c;
            if (this.f) {
                if (!this.p) {
                }
                z = true;
                this.q = z;
                j = kVar.d;
                if (j == -1 && !z) {
                    a = this.a.a(str);
                    this.n = a;
                    if (a != -1) {
                        long j2 = a - kVar.c;
                        this.n = j2;
                        if (j2 <= 0) {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.i();
                        }
                    }
                    a(true);
                    return this.n;
                }
                this.n = j;
                a(true);
                return this.n;
            }
            if (kVar.d != -1 || !this.g) {
                z = false;
                this.q = z;
                j = kVar.d;
                if (j == -1) {
                    a = this.a.a(str);
                    this.n = a;
                    if (a != -1) {
                    }
                    a(true);
                    return this.n;
                }
                this.n = j;
                a(true);
                return this.n;
            }
            z = true;
            this.q = z;
            j = kVar.d;
            if (j == -1) {
            }
            this.n = j;
            a(true);
            return this.n;
        } catch (IOException e) {
            if (this.h == this.b || (e instanceof a)) {
                this.p = true;
            }
            throw e;
        }
    }

    public final void b() {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar = this.h;
        if (hVar == null) {
            return;
        }
        try {
            hVar.close();
            this.h = null;
            this.i = false;
            m mVar = this.o;
            if (mVar != null) {
                l lVar = this.a;
                synchronized (lVar) {
                    if (mVar != lVar.c.remove(mVar.a)) {
                        throw new IllegalStateException();
                    }
                    lVar.notifyAll();
                }
                this.o = null;
            }
        } catch (Throwable th) {
            m mVar2 = this.o;
            if (mVar2 != null) {
                this.a.b(mVar2);
                this.o = null;
            }
            throw th;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.j = null;
        try {
            b();
        } catch (IOException e) {
            if (this.h == this.b || (e instanceof a)) {
                this.p = true;
            }
            throw e;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.n == 0) {
            return -1;
        }
        try {
            int read = this.h.read(bArr, i, i2);
            if (read >= 0) {
                long j = read;
                this.m += j;
                long j2 = this.n;
                if (j2 != -1) {
                    this.n = j2 - j;
                }
            } else {
                if (this.i) {
                    a(this.m);
                    this.n = 0L;
                }
                b();
                long j3 = this.n;
                if ((j3 > 0 || j3 == -1) && a(false)) {
                    return read(bArr, i, i2);
                }
            }
            return read;
        } catch (IOException e) {
            if (this.h == this.b || (e instanceof a)) {
                this.p = true;
            }
            throw e;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar = this.h;
        return hVar == this.d ? hVar.a() : this.j;
    }

    public final boolean a(boolean z) {
        m a;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar2;
        long j;
        IOException iOException = null;
        if (this.q) {
            a = null;
        } else if (this.e) {
            try {
                l lVar = this.a;
                String str = this.l;
                long j2 = this.m;
                synchronized (lVar) {
                    while (true) {
                        a = lVar.a(str, j2);
                        if (a != null) {
                            break;
                        }
                        lVar.wait();
                    }
                }
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        } else {
            a = this.a.a(this.l, this.m);
        }
        if (a == null) {
            this.h = this.d;
            Uri uri = this.j;
            long j3 = this.m;
            kVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uri, j3, j3, this.n, this.l, this.k);
        } else {
            if (a.d) {
                Uri fromFile = Uri.fromFile(a.e);
                long j4 = this.m - a.b;
                long j5 = a.c - j4;
                long j6 = this.n;
                if (j6 != -1) {
                    j5 = Math.min(j5, j6);
                }
                kVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(fromFile, this.m, j4, j5, this.l, this.k);
                this.h = this.b;
            } else {
                long j7 = a.c;
                if (j7 == -1) {
                    j7 = this.n;
                } else {
                    long j8 = this.n;
                    if (j8 != -1) {
                        j7 = Math.min(j7, j8);
                    }
                }
                long j9 = j7;
                Uri uri2 = this.j;
                long j10 = this.m;
                kVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uri2, j10, j10, j9, this.l, this.k);
                e0 e0Var = this.c;
                if (e0Var != null) {
                    this.h = e0Var;
                    this.o = a;
                } else {
                    this.h = this.d;
                    this.a.b(a);
                }
            }
            kVar2 = kVar;
        }
        boolean z2 = false;
        this.i = kVar2.d == -1;
        try {
            j = this.h.a(kVar2);
            z2 = true;
        } catch (IOException e) {
            if (!z && this.i) {
                for (Throwable th = e; th != null; th = th.getCause()) {
                    if ((th instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.i) && ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.i) th).a == 0) {
                        break;
                    }
                }
            }
            iOException = e;
            if (iOException != null) {
                throw iOException;
            }
            j = 0;
        }
        if (this.i && j != -1) {
            this.n = j;
            a(kVar2.c + j);
        }
        return z2;
    }

    public final void a(long j) {
        if (this.h == this.c) {
            l lVar = this.a;
            String str = this.l;
            synchronized (lVar) {
                try {
                    i iVar = lVar.d;
                    h hVar = (h) iVar.a.get(str);
                    if (hVar == null) {
                        iVar.a(str, j);
                    } else if (hVar.d != j) {
                        hVar.d = j;
                        iVar.f = true;
                    }
                    lVar.d.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
