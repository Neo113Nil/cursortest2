package yads;

/* loaded from: classes12.dex */
public abstract class k43 {
    public c83 b;
    public wp0 c;
    public ba2 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final z92 a = new z92();
    public i43 j = new i43();

    public abstract long a(xb2 xb2Var);

    public void a(boolean z) {
        if (z) {
            this.j = new i43();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }

    public abstract boolean a(xb2 xb2Var, long j, i43 i43Var);

    public void a(long j) {
        this.g = j;
    }
}
