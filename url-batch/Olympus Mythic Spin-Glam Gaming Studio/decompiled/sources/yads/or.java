package yads;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class or {
    public final fr a;
    public final br b;
    public final v30 c;
    public final String d;
    public final byte[] e;
    public final nr f;
    public long g;
    public long h;
    public long i;
    public volatile boolean j;

    public or(fr frVar, v30 v30Var, byte[] bArr, nr nrVar) {
        this.a = frVar;
        this.b = frVar.a;
        this.c = v30Var;
        this.e = bArr == null ? new byte[131072] : bArr;
        this.f = nrVar;
        this.d = frVar.e.a(v30Var);
        this.g = v30Var.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014e A[Catch: IOException -> 0x016b, TryCatch #2 {IOException -> 0x016b, blocks: (B:60:0x0147, B:63:0x014e, B:68:0x0163, B:69:0x015d, B:77:0x0173, B:79:0x0177, B:82:0x0183, B:84:0x018d, B:87:0x019e, B:88:0x0198, B:89:0x01a5, B:94:0x01a7, B:95:0x01ac, B:99:0x01af, B:101:0x01ba, B:106:0x01ce, B:110:0x01c8), top: B:59:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0173 A[Catch: IOException -> 0x016b, TryCatch #2 {IOException -> 0x016b, blocks: (B:60:0x0147, B:63:0x014e, B:68:0x0163, B:69:0x015d, B:77:0x0173, B:79:0x0177, B:82:0x0183, B:84:0x018d, B:87:0x019e, B:88:0x0198, B:89:0x01a5, B:94:0x01a7, B:95:0x01ac, B:99:0x01af, B:101:0x01ba, B:106:0x01ce, B:110:0x01c8), top: B:59:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01af A[Catch: IOException -> 0x016b, TryCatch #2 {IOException -> 0x016b, blocks: (B:60:0x0147, B:63:0x014e, B:68:0x0163, B:69:0x015d, B:77:0x0173, B:79:0x0177, B:82:0x0183, B:84:0x018d, B:87:0x019e, B:88:0x0198, B:89:0x01a5, B:94:0x01a7, B:95:0x01ac, B:99:0x01af, B:101:0x01ba, B:106:0x01ce, B:110:0x01c8), top: B:59:0x0147 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        String str;
        long j;
        int i;
        long j2;
        long j3;
        if (this.j) {
            throw new InterruptedIOException();
        }
        br brVar = this.b;
        String str2 = this.d;
        v30 v30Var = this.c;
        this.i = ((lz2) brVar).a(str2, v30Var.f, v30Var.g);
        v30 v30Var2 = this.c;
        long j4 = v30Var2.g;
        long j5 = -1;
        if (j4 != -1) {
            this.h = v30Var2.f + j4;
        } else {
            long a = lz.a(((lz2) this.b).b(this.d));
            if (a == -1) {
                a = -1;
            }
            this.h = a;
        }
        nr nrVar = this.f;
        if (nrVar != null) {
            long j6 = this.h;
            nrVar.a(j6 == -1 ? -1L : j6 - this.c.f, this.i, 0L);
        }
        while (true) {
            long j7 = this.h;
            if (j7 != j5 && this.g >= j7) {
                return;
            }
            if (this.j) {
                throw new InterruptedIOException();
            }
            long j8 = this.h;
            long b = ((lz2) this.b).b(this.d, this.g, j8 == j5 ? Long.MAX_VALUE : j8 - this.g);
            if (b > 0) {
                this.g += b;
            } else {
                long j9 = -b;
                long j10 = j9 == Long.MAX_VALUE ? j5 : j9;
                long j11 = this.g;
                boolean z2 = true;
                boolean z3 = j11 + j10 == this.h || j10 == j5;
                if (j10 != j5) {
                    v30 v30Var3 = this.c;
                    Uri uri = v30Var3.a;
                    long j12 = v30Var3.b;
                    int i2 = v30Var3.c;
                    byte[] bArr = v30Var3.d;
                    Map map = v30Var3.e;
                    String str3 = v30Var3.h;
                    int i3 = v30Var3.i;
                    Object obj = v30Var3.j;
                    oh.a(uri, "The uri must be set.");
                    z = z3;
                    str = "The uri must be set.";
                    try {
                        j = this.a.a(new v30(uri, j12, i2, bArr, map, j11, j10, str3, i3, obj));
                    } catch (IOException unused) {
                        t30.a(this.a);
                    }
                    if (!z2) {
                        if (this.j) {
                            throw new InterruptedIOException();
                        }
                        v30 v30Var4 = this.c;
                        Uri uri2 = v30Var4.a;
                        long j13 = v30Var4.b;
                        int i4 = v30Var4.c;
                        byte[] bArr2 = v30Var4.d;
                        Map map2 = v30Var4.e;
                        String str4 = v30Var4.h;
                        int i5 = v30Var4.i;
                        Object obj2 = v30Var4.j;
                        oh.a(uri2, str);
                        try {
                            j = this.a.a(new v30(uri2, j13, i4, bArr2, map2, j11, -1L, str4, i5, obj2));
                        } catch (IOException e) {
                            t30.a(this.a);
                            throw e;
                        }
                    }
                    if (z && j != -1) {
                        j3 = j + j11;
                        try {
                            if (this.h == j3) {
                                this.h = j3;
                                nr nrVar2 = this.f;
                                if (nrVar2 != null) {
                                    nrVar2.a(j3 == -1 ? -1L : j3 - this.c.f, this.i, 0L);
                                }
                            }
                        } catch (IOException e2) {
                            t30.a(this.a);
                            throw e2;
                        }
                    }
                    int i6 = 0;
                    i = 0;
                    while (i != -1) {
                        if (this.j) {
                            throw new InterruptedIOException();
                        }
                        fr frVar = this.a;
                        byte[] bArr3 = this.e;
                        i = frVar.c(bArr3, 0, bArr3.length);
                        if (i != -1) {
                            long j14 = i;
                            long j15 = this.i + j14;
                            this.i = j15;
                            nr nrVar3 = this.f;
                            if (nrVar3 != null) {
                                long j16 = this.h;
                                nrVar3.a(j16 == -1 ? -1L : j16 - this.c.f, j15, j14);
                            }
                            i6 += i;
                        }
                    }
                    if (z) {
                        long j17 = i6 + j11;
                        if (this.h != j17) {
                            this.h = j17;
                            nr nrVar4 = this.f;
                            if (nrVar4 != null) {
                                j2 = -1;
                                nrVar4.a(j17 == -1 ? -1L : j17 - this.c.f, this.i, 0L);
                                this.a.close();
                                this.g = j11 + i6;
                                j5 = j2;
                            }
                        }
                    }
                    j2 = -1;
                    this.a.close();
                    this.g = j11 + i6;
                    j5 = j2;
                } else {
                    z = z3;
                    str = "The uri must be set.";
                }
                j = -1;
                z2 = false;
                if (!z2) {
                }
                if (z) {
                    j3 = j + j11;
                    if (this.h == j3) {
                    }
                }
                int i62 = 0;
                i = 0;
                while (i != -1) {
                }
                if (z) {
                }
                j2 = -1;
                this.a.close();
                this.g = j11 + i62;
                j5 = j2;
            }
        }
    }
}
