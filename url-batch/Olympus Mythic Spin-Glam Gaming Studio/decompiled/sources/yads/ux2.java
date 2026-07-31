package yads;

import java.util.List;

/* loaded from: classes5.dex */
public final class ux2 extends tx2 {
    public final List j;

    public ux2(tl2 tl2Var, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(tl2Var, j, j2, j3, j4, list, j5, j6, j7);
        this.j = list2;
    }

    @Override // yads.tx2
    public final tl2 a(mo2 mo2Var, long j) {
        return (tl2) this.j.get((int) (j - this.d));
    }

    @Override // yads.tx2
    public final boolean a() {
        return true;
    }

    @Override // yads.tx2
    public final long a(long j) {
        return this.j.size();
    }
}
