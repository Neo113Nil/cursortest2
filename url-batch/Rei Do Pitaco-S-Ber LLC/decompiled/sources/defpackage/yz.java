package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class yz {
    public po a;
    public bx b;
    public String d;
    public km e;
    public b00 g;
    public zz h;
    public zz i;
    public zz j;
    public long k;
    public long l;
    public ei m;
    public int c = -1;
    public j0 f = new j0(21);

    public static void b(zz zzVar, String str) {
        if (zzVar != null) {
            if (zzVar.l != null) {
                l8.e(str.concat(".body != null"));
                return;
            }
            if (zzVar.m != null) {
                l8.e(str.concat(".networkResponse != null"));
            } else if (zzVar.n != null) {
                l8.e(str.concat(".cacheResponse != null"));
            } else {
                if (zzVar.o == null) {
                    return;
                }
                l8.e(str.concat(".priorResponse != null"));
            }
        }
    }

    public final zz a() {
        int i = this.c;
        if (i < 0) {
            l8.m("code < 0: ", this.c);
            return null;
        }
        po poVar = this.a;
        if (poVar == null) {
            l8.u("request == null");
            return null;
        }
        bx bxVar = this.b;
        if (bxVar == null) {
            l8.u("protocol == null");
            return null;
        }
        String str = this.d;
        if (str != null) {
            return new zz(poVar, bxVar, str, i, this.e, this.f.y(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        l8.u("message == null");
        return null;
    }
}
