package yads;

/* loaded from: classes3.dex */
public final class ny implements iy2 {
    public final iy2[] b;

    public ny(iy2[] iy2VarArr) {
        this.b = iy2VarArr;
    }

    @Override // yads.iy2
    public final boolean c(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (iy2 iy2Var : this.b) {
                long nextLoadPositionUs2 = iy2Var.getNextLoadPositionUs();
                boolean z3 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= j;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z3) {
                    z |= iy2Var.c(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // yads.iy2
    public final long getBufferedPositionUs() {
        long j = Long.MAX_VALUE;
        for (iy2 iy2Var : this.b) {
            long bufferedPositionUs = iy2Var.getBufferedPositionUs();
            if (bufferedPositionUs != Long.MIN_VALUE) {
                j = Math.min(j, bufferedPositionUs);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // yads.iy2
    public final long getNextLoadPositionUs() {
        long j = Long.MAX_VALUE;
        for (iy2 iy2Var : this.b) {
            long nextLoadPositionUs = iy2Var.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                j = Math.min(j, nextLoadPositionUs);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // yads.iy2
    public final boolean isLoading() {
        for (iy2 iy2Var : this.b) {
            if (iy2Var.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.iy2
    public final void reevaluateBuffer(long j) {
        for (iy2 iy2Var : this.b) {
            iy2Var.reevaluateBuffer(j);
        }
    }
}
