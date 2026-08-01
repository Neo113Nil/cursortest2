package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class d7 implements bt0 {
    public final j3 d;
    public final ce0 e;
    public i7 f;
    public long g;
    public long h;
    public boolean i;

    public d7(j3 j3Var, Object obj, i7 i7Var, long j, long j2, boolean z) {
        i7 i7Var2;
        this.d = j3Var;
        this.e = ud0.o(obj);
        if (i7Var != null) {
            i7Var2 = mz.y(i7Var);
        } else {
            i7Var2 = (i7) ((mu) j3Var.e).c(obj);
            i7Var2.d();
        }
        this.f = i7Var2;
        this.g = j;
        this.h = j2;
        this.i = z;
    }

    @Override // defpackage.bt0
    public final Object getValue() {
        return this.e.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.e.getValue() + ", velocity=" + ((mu) this.d.f).c(this.f) + ", isRunning=" + this.i + ", lastFrameTimeNanos=" + this.g + ", finishedTimeNanos=" + this.h + ')';
    }

    public /* synthetic */ d7(j3 j3Var, Comparable comparable, i7 i7Var, int i) {
        this(j3Var, comparable, (i & 4) != 0 ? null : i7Var, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
