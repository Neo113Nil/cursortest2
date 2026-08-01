package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class gf {
    public final Object a;
    public final dc b;
    public final ru c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ gf(Object obj, dc dcVar, ru ruVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : dcVar, (i & 4) != 0 ? null : ruVar, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static gf a(gf gfVar, dc dcVar, Throwable th, int i) {
        Object obj = gfVar.a;
        if ((i & 2) != 0) {
            dcVar = gfVar.b;
        }
        dc dcVar2 = dcVar;
        ru ruVar = gfVar.c;
        Object obj2 = gfVar.d;
        if ((i & 16) != 0) {
            th = gfVar.e;
        }
        return new gf(obj, dcVar2, ruVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf)) {
            return false;
        }
        gf gfVar = (gf) obj;
        return nz.l(this.a, gfVar.a) && nz.l(this.b, gfVar.b) && nz.l(this.c, gfVar.c) && nz.l(this.d, gfVar.d) && nz.l(this.e, gfVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        dc dcVar = this.b;
        int hashCode2 = (hashCode + (dcVar == null ? 0 : dcVar.hashCode())) * 31;
        ru ruVar = this.c;
        int hashCode3 = (hashCode2 + (ruVar == null ? 0 : ruVar.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public gf(Object obj, dc dcVar, ru ruVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = dcVar;
        this.c = ruVar;
        this.d = obj2;
        this.e = th;
    }
}
