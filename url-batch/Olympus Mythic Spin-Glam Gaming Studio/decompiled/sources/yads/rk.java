package yads;

/* loaded from: classes4.dex */
public final class rk implements mx2 {
    public final long a;
    public final /* synthetic */ tk b;

    public rk(tk tkVar, long j) {
        this.b = tkVar;
        this.a = j;
    }

    @Override // yads.mx2
    public final boolean b() {
        return true;
    }

    @Override // yads.mx2
    public final long c() {
        return this.a;
    }

    @Override // yads.mx2
    public final kx2 b(long j) {
        kx2 b = this.b.g[0].b(j);
        int i = 1;
        while (true) {
            fu[] fuVarArr = this.b.g;
            if (i >= fuVarArr.length) {
                return b;
            }
            kx2 b2 = fuVarArr[i].b(j);
            if (b2.a.b < b.a.b) {
                b = b2;
            }
            i++;
        }
    }
}
