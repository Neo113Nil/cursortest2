package yads;

/* loaded from: classes5.dex */
public final class do1 implements c5 {
    public final t8 a;
    public final tn1 b;

    public do1(t8 t8Var, tn1 tn1Var) {
        this.a = t8Var;
        this.b = tn1Var;
    }

    @Override // yads.c5
    public final p2 a() {
        return new qo1(this.b);
    }

    @Override // yads.c5
    public final w8 b() {
        return new ko1(this.a);
    }
}
