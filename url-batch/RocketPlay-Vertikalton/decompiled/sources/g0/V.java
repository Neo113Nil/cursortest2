package g0;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public int f2812a;

    /* renamed from: b, reason: collision with root package name */
    public int f2813b;

    /* renamed from: c, reason: collision with root package name */
    public int f2814c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2815e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2816f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2817g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2818j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2819k;

    /* renamed from: l, reason: collision with root package name */
    public int f2820l;

    /* renamed from: m, reason: collision with root package name */
    public long f2821m;

    /* renamed from: n, reason: collision with root package name */
    public int f2822n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f2817g ? this.f2813b - this.f2814c : this.f2815e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f2812a + ", mData=null, mItemCount=" + this.f2815e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f2813b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2814c + ", mStructureChanged=" + this.f2816f + ", mInPreLayout=" + this.f2817g + ", mRunSimpleAnimations=" + this.f2818j + ", mRunPredictiveAnimations=" + this.f2819k + '}';
    }
}
