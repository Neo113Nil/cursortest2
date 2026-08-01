package g0;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public int f2374a;

    /* renamed from: b, reason: collision with root package name */
    public int f2375b;

    /* renamed from: c, reason: collision with root package name */
    public int f2376c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2377e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2378f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2379g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2380j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2381k;

    /* renamed from: l, reason: collision with root package name */
    public int f2382l;

    /* renamed from: m, reason: collision with root package name */
    public long f2383m;

    /* renamed from: n, reason: collision with root package name */
    public int f2384n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f2379g ? this.f2375b - this.f2376c : this.f2377e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f2374a + ", mData=null, mItemCount=" + this.f2377e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f2375b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2376c + ", mStructureChanged=" + this.f2378f + ", mInPreLayout=" + this.f2379g + ", mRunSimpleAnimations=" + this.f2380j + ", mRunPredictiveAnimations=" + this.f2381k + '}';
    }
}
