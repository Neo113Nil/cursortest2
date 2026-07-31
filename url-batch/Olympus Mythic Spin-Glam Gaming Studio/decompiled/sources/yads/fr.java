package yads;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class fr implements q30 {
    public final br a;
    public final au0 b;
    public final e63 c;
    public final q30 d;
    public final lr e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public Uri i;
    public v30 j;
    public v30 k;
    public q30 l;
    public long m;
    public long n;
    public long o;
    public nz2 p;
    public boolean q;
    public boolean r;
    public long s;

    public fr(br brVar, q30 q30Var, au0 au0Var, dr drVar, lr lrVar, int i) {
        this.a = brVar;
        this.b = au0Var;
        this.e = lrVar == null ? lr.a : lrVar;
        this.f = (i & 1) != 0;
        this.g = false;
        this.h = false;
        if (q30Var != null) {
            this.d = q30Var;
            this.c = drVar != null ? new e63(q30Var, drVar) : null;
        } else {
            this.d = qd2.a;
            this.c = null;
        }
    }

    @Override // yads.q30
    public final void a(h93 h93Var) {
        h93Var.getClass();
        this.b.a(h93Var);
        this.d.a(h93Var);
    }

    @Override // yads.q30
    public final Map b() {
        return !h() ? this.d.b() : Collections.emptyMap();
    }

    @Override // yads.n30
    public final int c(byte[] bArr, int i, int i2) {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        if (this.o == 0) {
            return -1;
        }
        v30 v30Var = this.j;
        v30Var.getClass();
        v30 v30Var2 = this.k;
        v30Var2.getClass();
        try {
            if (this.n >= this.s) {
                a(v30Var, true);
            }
            q30 q30Var = this.l;
            q30Var.getClass();
            int c = q30Var.c(bArr, i, i2);
            if (c != -1) {
                long j = c;
                this.n += j;
                this.m += j;
                long j2 = this.o;
                if (j2 != -1) {
                    this.o = j2 - j;
                }
                return c;
            }
            if (!h()) {
                long j3 = v30Var2.g;
                if (j3 != -1) {
                    i3 = c;
                    if (this.m < j3) {
                    }
                } else {
                    i3 = c;
                }
                String str = v30Var.h;
                int i4 = sb3.a;
                this.o = 0L;
                if (this.l != this.c) {
                    return i3;
                }
                mz mzVar = new mz();
                mzVar.a.put("exo_len", Long.valueOf(this.n));
                mzVar.b.remove("exo_len");
                ((lz2) this.a).a(str, mzVar);
                return i3;
            }
            i3 = c;
            long j4 = this.o;
            if (j4 <= 0 && j4 != -1) {
                return i3;
            }
            g();
            a(v30Var, false);
            return c(bArr, i, i2);
        } catch (Throwable th) {
            if (h() || (th instanceof yq)) {
                this.q = true;
            }
            throw th;
        }
    }

    @Override // yads.q30
    public final void close() {
        this.j = null;
        this.i = null;
        this.n = 0L;
        try {
            g();
        } catch (Throwable th) {
            if (h() || (th instanceof yq)) {
                this.q = true;
            }
            throw th;
        }
    }

    @Override // yads.q30
    public final Uri d() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        q30 q30Var = this.l;
        if (q30Var == null) {
            return;
        }
        try {
            q30Var.close();
        } finally {
            this.k = null;
            this.l = null;
            nz2 nz2Var = this.p;
            if (nz2Var != null) {
                ((lz2) this.a).b(nz2Var);
                this.p = null;
            }
        }
    }

    public final boolean h() {
        return this.l == this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:3:0x0004, B:9:0x004f, B:11:0x005c, B:15:0x0070, B:17:0x0076, B:18:0x009d, B:20:0x00a3, B:23:0x00ae, B:24:0x00aa, B:25:0x00b0, B:29:0x00bd, B:34:0x00c4, B:36:0x00ba, B:37:0x0079, B:39:0x008b, B:42:0x0095, B:43:0x009c, B:44:0x0063, B:46:0x0067, B:50:0x0045), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:3:0x0004, B:9:0x004f, B:11:0x005c, B:15:0x0070, B:17:0x0076, B:18:0x009d, B:20:0x00a3, B:23:0x00ae, B:24:0x00aa, B:25:0x00b0, B:29:0x00bd, B:34:0x00c4, B:36:0x00ba, B:37:0x0079, B:39:0x008b, B:42:0x0095, B:43:0x009c, B:44:0x0063, B:46:0x0067, B:50:0x0045), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:3:0x0004, B:9:0x004f, B:11:0x005c, B:15:0x0070, B:17:0x0076, B:18:0x009d, B:20:0x00a3, B:23:0x00ae, B:24:0x00aa, B:25:0x00b0, B:29:0x00bd, B:34:0x00c4, B:36:0x00ba, B:37:0x0079, B:39:0x008b, B:42:0x0095, B:43:0x009c, B:44:0x0063, B:46:0x0067, B:50:0x0045), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:3:0x0004, B:9:0x004f, B:11:0x005c, B:15:0x0070, B:17:0x0076, B:18:0x009d, B:20:0x00a3, B:23:0x00ae, B:24:0x00aa, B:25:0x00b0, B:29:0x00bd, B:34:0x00c4, B:36:0x00ba, B:37:0x0079, B:39:0x008b, B:42:0x0095, B:43:0x009c, B:44:0x0063, B:46:0x0067, B:50:0x0045), top: B:2:0x0004 }] */
    @Override // yads.q30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(v30 v30Var) {
        boolean z;
        long j;
        long j2;
        try {
            String a = this.e.a(v30Var);
            v30Var.getClass();
            Uri uri = v30Var.a;
            long j3 = v30Var.b;
            int i = v30Var.c;
            byte[] bArr = v30Var.d;
            Map map = v30Var.e;
            long j4 = v30Var.f;
            long j5 = v30Var.g;
            int i2 = v30Var.i;
            Object obj = v30Var.j;
            oh.a(uri, "The uri must be set.");
            v30 v30Var2 = new v30(uri, j3, i, bArr, map, j4, j5, a, i2, obj);
            this.j = v30Var2;
            String a2 = ((lz2) this.a).b(a).a();
            Uri parse = a2 == null ? null : Uri.parse(a2);
            if (parse == null) {
                parse = uri;
            }
            this.i = parse;
            this.n = v30Var.f;
            if ((!this.g || !this.q) && (!this.h || v30Var.g != -1)) {
                z = false;
                this.r = z;
                if (!z) {
                    this.o = -1L;
                } else {
                    long a3 = lz.a(((lz2) this.a).b(a));
                    this.o = a3;
                    if (a3 != -1) {
                        long j6 = a3 - v30Var.f;
                        this.o = j6;
                        if (j6 < 0) {
                            throw new r30(2008);
                        }
                    }
                }
                j = v30Var.g;
                if (j != -1) {
                    long j7 = this.o;
                    if (j7 != -1) {
                        j = Math.min(j7, j);
                    }
                    this.o = j;
                }
                j2 = this.o;
                if (j2 <= 0 || j2 == -1) {
                    a(v30Var2, false);
                }
                long j8 = v30Var.g;
                return j8 == -1 ? j8 : this.o;
            }
            z = true;
            this.r = z;
            if (!z) {
            }
            j = v30Var.g;
            if (j != -1) {
            }
            j2 = this.o;
            if (j2 <= 0) {
            }
            a(v30Var2, false);
            long j82 = v30Var.g;
            if (j82 == -1) {
            }
        } catch (Throwable th) {
            if (h() || (th instanceof yq)) {
                this.q = true;
            }
            throw th;
        }
    }

    public final void a(v30 v30Var, boolean z) {
        nz2 c;
        String str;
        q30 q30Var;
        v30 v30Var2;
        String str2 = v30Var.h;
        int i = sb3.a;
        if (this.r) {
            c = null;
        } else if (this.f) {
            try {
                br brVar = this.a;
                long j = this.n;
                long j2 = this.o;
                lz2 lz2Var = (lz2) brVar;
                synchronized (lz2Var) {
                    lz2Var.a();
                    while (true) {
                        c = lz2Var.c(str2, j, j2);
                        if (c != null) {
                            break;
                        } else {
                            lz2Var.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            c = ((lz2) this.a).c(str2, this.n, this.o);
        }
        if (c == null) {
            q30 q30Var2 = this.d;
            Uri uri = v30Var.a;
            long j3 = v30Var.b;
            int i2 = v30Var.c;
            byte[] bArr = v30Var.d;
            Map map = v30Var.e;
            String str3 = v30Var.h;
            int i3 = v30Var.i;
            Object obj = v30Var.j;
            long j4 = this.n;
            str = str2;
            long j5 = this.o;
            oh.a(uri, "The uri must be set.");
            v30Var2 = new v30(uri, j3, i2, bArr, map, j4, j5, str3, i3, obj);
            q30Var = q30Var2;
        } else {
            str = str2;
            if (c.e) {
                Uri fromFile = Uri.fromFile(c.f);
                long j6 = c.c;
                long j7 = this.n - j6;
                long j8 = c.d - j7;
                long j9 = this.o;
                if (j9 != -1) {
                    j8 = Math.min(j8, j9);
                }
                long j10 = j8;
                int i4 = v30Var.c;
                byte[] bArr2 = v30Var.d;
                Map map2 = v30Var.e;
                String str4 = v30Var.h;
                int i5 = v30Var.i;
                Object obj2 = v30Var.j;
                oh.a(fromFile, "The uri must be set.");
                v30 v30Var3 = new v30(fromFile, j6, i4, bArr2, map2, j7, j10, str4, i5, obj2);
                q30Var = this.b;
                v30Var2 = v30Var3;
            } else {
                long j11 = c.d;
                if (j11 == -1) {
                    j11 = this.o;
                } else {
                    long j12 = this.o;
                    if (j12 != -1) {
                        j11 = Math.min(j11, j12);
                    }
                }
                long j13 = j11;
                Uri uri2 = v30Var.a;
                long j14 = v30Var.b;
                int i6 = v30Var.c;
                byte[] bArr3 = v30Var.d;
                Map map3 = v30Var.e;
                String str5 = v30Var.h;
                int i7 = v30Var.i;
                Object obj3 = v30Var.j;
                long j15 = this.n;
                oh.a(uri2, "The uri must be set.");
                v30 v30Var4 = new v30(uri2, j14, i6, bArr3, map3, j15, j13, str5, i7, obj3);
                q30Var = this.c;
                if (q30Var != null) {
                    v30Var2 = v30Var4;
                } else {
                    q30Var = this.d;
                    ((lz2) this.a).b(c);
                    v30Var2 = v30Var4;
                    c = null;
                }
            }
        }
        this.s = (this.r || q30Var != this.d) ? Long.MAX_VALUE : this.n + 102400;
        if (z) {
            q30 q30Var3 = this.l;
            q30 q30Var4 = this.d;
            if (q30Var3 != q30Var4) {
                throw new IllegalStateException();
            }
            if (q30Var == q30Var4) {
                return;
            }
            try {
                g();
            } finally {
            }
        }
        if (c != null && !c.e) {
            this.p = c;
        }
        this.l = q30Var;
        this.k = v30Var2;
        this.m = 0L;
        long a = q30Var.a(v30Var2);
        mz mzVar = new mz();
        if (v30Var2.g == -1 && a != -1) {
            this.o = a;
            mzVar.a.put("exo_len", Long.valueOf(this.n + a));
            mzVar.b.remove("exo_len");
        }
        if (!h()) {
            Uri d = q30Var.d();
            this.i = d;
            Uri uri3 = !v30Var.a.equals(d) ? this.i : null;
            if (uri3 == null) {
                mzVar.b.add("exo_redir");
                mzVar.a.remove("exo_redir");
            } else {
                String uri4 = uri3.toString();
                HashMap hashMap = mzVar.a;
                uri4.getClass();
                hashMap.put("exo_redir", uri4);
                mzVar.b.remove("exo_redir");
            }
        }
        if (this.l == this.c) {
            ((lz2) this.a).a(str, mzVar);
        }
    }
}
