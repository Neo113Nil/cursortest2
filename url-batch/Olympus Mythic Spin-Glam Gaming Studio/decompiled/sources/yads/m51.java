package yads;

/* loaded from: classes4.dex */
public final class m51 {
    public final bu1 a;
    public final k00 b;

    public m51(bu1 bu1Var, k00 k00Var) {
        this.a = bu1Var;
        this.b = k00Var;
    }

    public final void a() {
        bu1 bu1Var = this.a;
        bu1Var.a.a.execute(new Runnable() { // from class: yads.m51$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                m51.a(m51.this);
            }
        });
    }

    public static final void a(m51 m51Var) {
        m51Var.b.onInitializationCompleted();
    }
}
