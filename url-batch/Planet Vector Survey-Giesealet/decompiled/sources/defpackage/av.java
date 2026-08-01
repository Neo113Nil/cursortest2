package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class av extends ac implements zu, i00, yu {
    public final int j;
    public final int k;

    public av(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.j = i;
        this.k = 0;
    }

    @Override // defpackage.ac
    public final i00 d() {
        hj0.a.getClass();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [i00] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof av) {
            av avVar = (av) obj;
            return this.g.equals(avVar.g) && this.h.equals(avVar.h) && this.k == avVar.k && this.j == avVar.j && nz.l(this.e, avVar.e) && e().equals(avVar.e());
        }
        if (!(obj instanceof av)) {
            return false;
        }
        ?? r0 = this.d;
        if (r0 == 0) {
            d();
            this.d = this;
        } else {
            this = r0;
        }
        return obj.equals(this);
    }

    @Override // defpackage.zu
    public final int getArity() {
        return this.j;
    }

    public final int hashCode() {
        e();
        return this.h.hashCode() + ((this.g.hashCode() + (e().hashCode() * 31)) * 31);
    }

    public final String toString() {
        i00 i00Var = this.d;
        if (i00Var == null) {
            d();
            this.d = this;
            i00Var = this;
        }
        if (i00Var != this) {
            return i00Var.toString();
        }
        String str = this.g;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    public av(int i, Class cls, String str, String str2, int i2) {
        this(i, zb.d, cls, str, str2, i2, 0);
    }
}
