package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes6.dex */
public final class ct1 implements gm1, fm1 {
    public final gm1[] b;
    public final IdentityHashMap c;
    public final xc0 d;
    public final ArrayList e = new ArrayList();
    public final HashMap f = new HashMap();
    public fm1 g;
    public y73 h;
    public gm1[] i;
    public ny j;

    public ct1(xc0 xc0Var, long[] jArr, gm1... gm1VarArr) {
        this.d = xc0Var;
        this.b = gm1VarArr;
        xc0Var.getClass();
        this.j = new ny(new iy2[0]);
        this.c = new IdentityHashMap();
        this.i = new gm1[0];
        for (int i = 0; i < gm1VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = new at1(gm1VarArr[i], j);
            }
        }
    }

    @Override // yads.hy2
    public final void a(iy2 iy2Var) {
        fm1 fm1Var = this.g;
        fm1Var.getClass();
        fm1Var.a((iy2) this);
    }

    @Override // yads.iy2
    public final boolean c(long j) {
        if (this.e.isEmpty()) {
            return this.j.c(j);
        }
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            ((gm1) this.e.get(i)).c(j);
        }
        return false;
    }

    @Override // yads.iy2
    public final long getBufferedPositionUs() {
        return this.j.getBufferedPositionUs();
    }

    @Override // yads.iy2
    public final long getNextLoadPositionUs() {
        return this.j.getNextLoadPositionUs();
    }

    @Override // yads.gm1
    public final y73 getTrackGroups() {
        y73 y73Var = this.h;
        y73Var.getClass();
        return y73Var;
    }

    @Override // yads.iy2
    public final boolean isLoading() {
        return this.j.isLoading();
    }

    @Override // yads.gm1
    public final void maybeThrowPrepareError() {
        for (gm1 gm1Var : this.b) {
            gm1Var.maybeThrowPrepareError();
        }
    }

    @Override // yads.gm1
    public final long readDiscontinuity() {
        long j = -9223372036854775807L;
        for (gm1 gm1Var : this.i) {
            long readDiscontinuity = gm1Var.readDiscontinuity();
            if (readDiscontinuity != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (gm1 gm1Var2 : this.i) {
                        if (gm1Var2 == gm1Var) {
                            break;
                        }
                        if (gm1Var2.seekToUs(readDiscontinuity) != readDiscontinuity) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = readDiscontinuity;
                } else if (readDiscontinuity != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && gm1Var.seekToUs(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // yads.iy2
    public final void reevaluateBuffer(long j) {
        this.j.reevaluateBuffer(j);
    }

    @Override // yads.gm1
    public final long seekToUs(long j) {
        long seekToUs = this.i[0].seekToUs(j);
        int i = 1;
        while (true) {
            gm1[] gm1VarArr = this.i;
            if (i >= gm1VarArr.length) {
                return seekToUs;
            }
            if (gm1VarArr[i].seekToUs(seekToUs) != seekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // yads.gm1
    public final void a(fm1 fm1Var, long j) {
        this.g = fm1Var;
        Collections.addAll(this.e, this.b);
        for (gm1 gm1Var : this.b) {
            gm1Var.a(this, j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // yads.gm1
    public final long a(xo0[] xo0VarArr, boolean[] zArr, ys2[] ys2VarArr, boolean[] zArr2, long j) {
        ys2 ys2Var;
        int[] iArr = new int[xo0VarArr.length];
        int[] iArr2 = new int[xo0VarArr.length];
        int i = 0;
        while (true) {
            ys2Var = null;
            if (i >= xo0VarArr.length) {
                break;
            }
            ys2 ys2Var2 = ys2VarArr[i];
            Integer num = ys2Var2 != null ? (Integer) this.c.get(ys2Var2) : null;
            iArr[i] = num == null ? -1 : num.intValue();
            iArr2[i] = -1;
            xo0 xo0Var = xo0VarArr[i];
            if (xo0Var != null) {
                x73 x73Var = (x73) this.f.get(xo0Var.c());
                x73Var.getClass();
                int i2 = 0;
                while (true) {
                    gm1[] gm1VarArr = this.b;
                    if (i2 >= gm1VarArr.length) {
                        break;
                    }
                    int indexOf = gm1VarArr[i2].getTrackGroups().c.indexOf(x73Var);
                    if (indexOf < 0) {
                        indexOf = -1;
                    }
                    if (indexOf != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
            i++;
        }
        this.c.clear();
        int length = xo0VarArr.length;
        ys2[] ys2VarArr2 = new ys2[length];
        ys2[] ys2VarArr3 = new ys2[xo0VarArr.length];
        xo0[] xo0VarArr2 = new xo0[xo0VarArr.length];
        ArrayList arrayList = new ArrayList(this.b.length);
        long j2 = j;
        int i3 = 0;
        xo0[] xo0VarArr3 = xo0VarArr2;
        while (i3 < this.b.length) {
            for (int i4 = 0; i4 < xo0VarArr.length; i4++) {
                ys2VarArr3[i4] = iArr[i4] == i3 ? ys2VarArr[i4] : ys2Var;
                if (iArr2[i4] == i3) {
                    xo0 xo0Var2 = xo0VarArr[i4];
                    xo0Var2.getClass();
                    x73 x73Var2 = (x73) this.f.get(xo0Var2.c());
                    x73Var2.getClass();
                    xo0VarArr3[i4] = new zs1(xo0Var2, x73Var2);
                } else {
                    xo0VarArr3[i4] = ys2Var;
                }
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            xo0[] xo0VarArr4 = xo0VarArr3;
            long a = this.b[i3].a(xo0VarArr3, zArr, ys2VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = a;
            } else if (a != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < xo0VarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    ys2 ys2Var3 = ys2VarArr3[i6];
                    ys2Var3.getClass();
                    ys2VarArr2[i6] = ys2VarArr3[i6];
                    this.c.put(ys2Var3, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5 && ys2VarArr3[i6] != null) {
                    throw new IllegalStateException();
                }
            }
            if (z) {
                arrayList2.add(this.b[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            xo0VarArr3 = xo0VarArr4;
            ys2Var = null;
        }
        System.arraycopy(ys2VarArr2, 0, ys2VarArr, 0, length);
        gm1[] gm1VarArr2 = (gm1[]) arrayList.toArray(new gm1[0]);
        this.i = gm1VarArr2;
        this.d.getClass();
        this.j = new ny(gm1VarArr2);
        return j2;
    }

    @Override // yads.gm1
    public final void a(long j) {
        for (gm1 gm1Var : this.i) {
            gm1Var.a(j);
        }
    }

    @Override // yads.gm1
    public final long a(long j, nx2 nx2Var) {
        gm1[] gm1VarArr = this.i;
        return (gm1VarArr.length > 0 ? gm1VarArr[0] : this.b[0]).a(j, nx2Var);
    }

    @Override // yads.fm1
    public final void a(gm1 gm1Var) {
        this.e.remove(gm1Var);
        if (!this.e.isEmpty()) {
            return;
        }
        int i = 0;
        for (gm1 gm1Var2 : this.b) {
            i += gm1Var2.getTrackGroups().b;
        }
        x73[] x73VarArr = new x73[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            gm1[] gm1VarArr = this.b;
            if (i2 < gm1VarArr.length) {
                y73 trackGroups = gm1VarArr[i2].getTrackGroups();
                int i4 = trackGroups.b;
                int i5 = 0;
                while (i5 < i4) {
                    x73 a = trackGroups.a(i5);
                    x73 x73Var = new x73(i2 + ":" + a.c, a.e);
                    this.f.put(x73Var, a);
                    x73VarArr[i3] = x73Var;
                    i5++;
                    i3++;
                }
                i2++;
            } else {
                this.h = new y73(x73VarArr);
                fm1 fm1Var = this.g;
                fm1Var.getClass();
                fm1Var.a((gm1) this);
                return;
            }
        }
    }
}
