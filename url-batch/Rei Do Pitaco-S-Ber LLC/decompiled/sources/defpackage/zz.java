package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class zz implements Closeable {
    public final po f;
    public final bx g;
    public final String h;
    public final int i;
    public final km j;
    public final nm k;
    public final b00 l;
    public final zz m;
    public final zz n;
    public final zz o;
    public final long p;
    public final long q;
    public final ei r;

    public zz(po poVar, bx bxVar, String str, int i, km kmVar, nm nmVar, b00 b00Var, zz zzVar, zz zzVar2, zz zzVar3, long j, long j2, ei eiVar) {
        poVar.getClass();
        bxVar.getClass();
        str.getClass();
        this.f = poVar;
        this.g = bxVar;
        this.h = str;
        this.i = i;
        this.j = kmVar;
        this.k = nmVar;
        this.l = b00Var;
        this.m = zzVar;
        this.n = zzVar2;
        this.o = zzVar3;
        this.p = j;
        this.q = j2;
        this.r = eiVar;
    }

    public static String m(zz zzVar, String str) {
        zzVar.getClass();
        String a = zzVar.k.a(str);
        if (a == null) {
            return null;
        }
        return a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b00 b00Var = this.l;
        if (b00Var != null) {
            b00Var.close();
        } else {
            l8.u("response is not eligible for a body and must not be closed");
        }
    }

    public final yz n() {
        yz yzVar = new yz();
        yzVar.a = this.f;
        yzVar.b = this.g;
        yzVar.c = this.i;
        yzVar.d = this.h;
        yzVar.e = this.j;
        yzVar.f = this.k.c();
        yzVar.g = this.l;
        yzVar.h = this.m;
        yzVar.i = this.n;
        yzVar.j = this.o;
        yzVar.k = this.p;
        yzVar.l = this.q;
        yzVar.m = this.r;
        return yzVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.g + ", code=" + this.i + ", message=" + this.h + ", url=" + ((xn) this.f.b) + '}';
    }
}
