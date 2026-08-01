package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class fu0 extends lj implements zu {
    private final int arity;

    public fu0(int i, kj kjVar) {
        super(kjVar);
        this.arity = i;
    }

    @Override // defpackage.zu
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.h9
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        hj0.a.getClass();
        return ij0.a(this);
    }
}
