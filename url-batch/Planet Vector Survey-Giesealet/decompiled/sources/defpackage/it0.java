package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class it0 implements ht0 {
    public final q8 d = new q8(0);

    @Override // defpackage.ht0
    public /* synthetic */ jt0 b(jt0 jt0Var, jt0 jt0Var2, jt0 jt0Var3) {
        return null;
    }

    public final boolean e(int i) {
        return (this.d.get() & i) != 0;
    }

    public final void f(int i) {
        q8 q8Var;
        int i2;
        do {
            q8Var = this.d;
            i2 = q8Var.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!q8Var.compareAndSet(i2, i2 | i));
    }
}
