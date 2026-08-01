package f0;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f1996a;

    /* renamed from: b, reason: collision with root package name */
    public int f1997b;

    /* renamed from: c, reason: collision with root package name */
    public int f1998c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1999e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2000f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2001g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2002j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2003k;

    /* renamed from: l, reason: collision with root package name */
    public int f2004l;

    /* renamed from: m, reason: collision with root package name */
    public long f2005m;

    /* renamed from: n, reason: collision with root package name */
    public int f2006n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f2001g ? this.f1997b - this.f1998c : this.f1999e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f1996a + ", mData=null, mItemCount=" + this.f1999e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f1997b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1998c + ", mStructureChanged=" + this.f2000f + ", mInPreLayout=" + this.f2001g + ", mRunSimpleAnimations=" + this.f2002j + ", mRunPredictiveAnimations=" + this.f2003k + '}';
    }
}
