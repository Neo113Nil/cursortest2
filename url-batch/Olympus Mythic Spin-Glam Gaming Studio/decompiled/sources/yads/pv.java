package yads;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class pv implements gm1, fm1 {
    public final gm1 b;
    public fm1 c;
    public ov[] d = new ov[0];
    public long e;
    public long f;
    public long g;
    public rv h;

    public pv(gm1 gm1Var, boolean z, long j, long j2) {
        this.b = gm1Var;
        this.e = z ? j : -9223372036854775807L;
        this.f = j;
        this.g = j2;
    }

    @Override // yads.hy2
    public final void a(iy2 iy2Var) {
        fm1 fm1Var = this.c;
        fm1Var.getClass();
        fm1Var.a((iy2) this);
    }

    @Override // yads.iy2
    public final boolean c(long j) {
        return this.b.c(j);
    }

    @Override // yads.iy2
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.b.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j = this.g;
            if (j == Long.MIN_VALUE || bufferedPositionUs < j) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // yads.iy2
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.b.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j = this.g;
            if (j == Long.MIN_VALUE || nextLoadPositionUs < j) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // yads.gm1
    public final y73 getTrackGroups() {
        return this.b.getTrackGroups();
    }

    @Override // yads.iy2
    public final boolean isLoading() {
        return this.b.isLoading();
    }

    @Override // yads.gm1
    public final void maybeThrowPrepareError() {
        rv rvVar = this.h;
        if (rvVar != null) {
            throw rvVar;
        }
        this.b.maybeThrowPrepareError();
    }

    @Override // yads.gm1
    public final long readDiscontinuity() {
        long j = this.e;
        if (j != -9223372036854775807L) {
            this.e = -9223372036854775807L;
            long readDiscontinuity = readDiscontinuity();
            return readDiscontinuity != -9223372036854775807L ? readDiscontinuity : j;
        }
        long readDiscontinuity2 = this.b.readDiscontinuity();
        if (readDiscontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (readDiscontinuity2 < this.f) {
            throw new IllegalStateException();
        }
        long j2 = this.g;
        if (j2 == Long.MIN_VALUE || readDiscontinuity2 <= j2) {
            return readDiscontinuity2;
        }
        throw new IllegalStateException();
    }

    @Override // yads.iy2
    public final void reevaluateBuffer(long j) {
        this.b.reevaluateBuffer(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // yads.gm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long seekToUs(long j) {
        this.e = -9223372036854775807L;
        for (ov ovVar : this.d) {
            if (ovVar != null) {
                ovVar.c = false;
            }
        }
        long seekToUs = this.b.seekToUs(j);
        if (seekToUs != j) {
            if (seekToUs >= this.f) {
                long j2 = this.g;
                if (j2 != Long.MIN_VALUE) {
                }
            }
            throw new IllegalStateException();
        }
        return seekToUs;
    }

    @Override // yads.gm1
    public final void a(fm1 fm1Var, long j) {
        this.c = fm1Var;
        this.b.a(this, j);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0150, code lost:
    
        if (r1 > r3) goto L109;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x00ef. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    @Override // yads.gm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(xo0[] xo0VarArr, boolean[] zArr, ys2[] ys2VarArr, boolean[] zArr2, long j) {
        long j2;
        char c;
        ut1 b;
        this.d = new ov[ys2VarArr.length];
        ys2[] ys2VarArr2 = new ys2[ys2VarArr.length];
        int i = 0;
        while (true) {
            ys2 ys2Var = null;
            if (i >= ys2VarArr.length) {
                break;
            }
            ov[] ovVarArr = this.d;
            ov ovVar = (ov) ys2VarArr[i];
            ovVarArr[i] = ovVar;
            if (ovVar != null) {
                ys2Var = ovVar.b;
            }
            ys2VarArr2[i] = ys2Var;
            i++;
        }
        long a = this.b.a(xo0VarArr, zArr, ys2VarArr2, zArr2, j);
        if (this.e != -9223372036854775807L) {
            long j3 = this.f;
            if (j == j3 && j3 != 0) {
                for (xo0 xo0Var : xo0VarArr) {
                    if (xo0Var != null) {
                        jw0 d = xo0Var.d();
                        String str = d.m;
                        String str2 = d.j;
                        ArrayList arrayList = vt1.a;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -2123537834:
                                    if (str.equals("audio/eac3-joc")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -432837260:
                                    if (str.equals("audio/mpeg-L1")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -432837259:
                                    if (str.equals("audio/mpeg-L2")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -53558318:
                                    if (str.equals("audio/mp4a-latm")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 187078296:
                                    if (str.equals("audio/ac3")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 187094639:
                                    if (str.equals("audio/raw")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1504578661:
                                    if (str.equals("audio/eac3")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1504619009:
                                    if (str.equals("audio/flac")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1504831518:
                                    if (str.equals("audio/mpeg")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1903231877:
                                    if (str.equals("audio/g711-alaw")) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1903589369:
                                    if (str.equals("audio/g711-mlaw")) {
                                        c = '\n';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 3:
                                    if (str2 != null && (b = vt1.b(str2)) != null) {
                                        int i2 = b.b;
                                        char c2 = i2 != 2 ? i2 != 5 ? i2 != 29 ? i2 != 42 ? i2 != 22 ? i2 != 23 ? (char) 0 : (char) 15 : (char) 0 : (char) 16 : '\f' : (char) 11 : '\n';
                                        if (c2 != 0 && c2 != 16) {
                                            break;
                                        }
                                    }
                                    break;
                            }
                            this.e = j2;
                            if (a != j) {
                                if (a >= this.f) {
                                    long j4 = this.g;
                                    if (j4 != Long.MIN_VALUE) {
                                    }
                                }
                                throw new IllegalStateException();
                            }
                            for (int i3 = 0; i3 < ys2VarArr.length; i3++) {
                                ys2 ys2Var2 = ys2VarArr2[i3];
                                if (ys2Var2 == null) {
                                    this.d[i3] = null;
                                } else {
                                    ov[] ovVarArr2 = this.d;
                                    ov ovVar2 = ovVarArr2[i3];
                                    if (ovVar2 == null || ovVar2.b != ys2Var2) {
                                        ovVarArr2[i3] = new ov(this, ys2Var2);
                                    }
                                }
                                ys2VarArr[i3] = this.d[i3];
                            }
                            return a;
                        }
                        j2 = a;
                        this.e = j2;
                        if (a != j) {
                        }
                        while (i3 < ys2VarArr.length) {
                        }
                        return a;
                    }
                }
            }
        }
        j2 = -9223372036854775807L;
        this.e = j2;
        if (a != j) {
        }
        while (i3 < ys2VarArr.length) {
        }
        return a;
    }

    @Override // yads.gm1
    public final void a(long j) {
        this.b.a(j);
    }

    @Override // yads.gm1
    public final long a(long j, nx2 nx2Var) {
        long j2 = this.f;
        if (j == j2) {
            return j2;
        }
        int i = sb3.a;
        long max = Math.max(0L, Math.min(nx2Var.a, j - j2));
        long j3 = nx2Var.b;
        long j4 = this.g;
        long max2 = Math.max(0L, Math.min(j3, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j));
        if (max != nx2Var.a || max2 != nx2Var.b) {
            nx2Var = new nx2(max, max2);
        }
        return this.b.a(j, nx2Var);
    }

    @Override // yads.fm1
    public final void a(gm1 gm1Var) {
        if (this.h != null) {
            return;
        }
        fm1 fm1Var = this.c;
        fm1Var.getClass();
        fm1Var.a((gm1) this);
    }
}
