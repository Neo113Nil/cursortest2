package yads;

/* loaded from: classes3.dex */
public final class mt extends g53 implements Comparable {
    public long j;

    /* JADX WARN: Removed duplicated region for block: B:5:0x0030 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e A[RETURN, SYNTHETIC] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(Object obj) {
        mt mtVar = (mt) obj;
        if (b(4) != mtVar.b(4)) {
            return b(4) ? 1 : -1;
        }
        long j = this.f - mtVar.f;
        if (j == 0) {
            j = this.j - mtVar.j;
            if (j == 0) {
                return 0;
            }
        }
        if (j > 0) {
        }
    }
}
