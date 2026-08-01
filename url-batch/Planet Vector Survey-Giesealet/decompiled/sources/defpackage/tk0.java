package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class tk0 extends sk0 implements zu {
    public final int d;

    public tk0(kj kjVar) {
        super(kjVar);
        this.d = 2;
    }

    @Override // defpackage.zu
    public final int getArity() {
        return this.d;
    }

    @Override // defpackage.h9
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        hj0.a.getClass();
        return ij0.a(this);
    }
}
