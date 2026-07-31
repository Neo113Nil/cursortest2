package yads;

import android.os.SystemClock;

/* loaded from: classes14.dex */
public final class u33 implements tj1 {
    public final p53 b;
    public boolean c;
    public long d;
    public long e;
    public re2 f = re2.e;

    public u33(p53 p53Var) {
        this.b = p53Var;
    }

    public final void a(long j) {
        this.d = j;
        if (this.c) {
            this.b.getClass();
            this.e = SystemClock.elapsedRealtime();
        }
    }

    @Override // yads.tj1
    public final re2 getPlaybackParameters() {
        return this.f;
    }

    @Override // yads.tj1
    public final long a() {
        long j;
        long j2 = this.d;
        if (!this.c) {
            return j2;
        }
        this.b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        if (this.f.b == 1.0f) {
            j = sb3.a(elapsedRealtime);
        } else {
            j = elapsedRealtime * r4.d;
        }
        return j2 + j;
    }

    @Override // yads.tj1
    public final void a(re2 re2Var) {
        if (this.c) {
            a(a());
        }
        this.f = re2Var;
    }
}
