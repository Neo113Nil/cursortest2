package yads;

import android.util.SparseArray;
import java.util.List;

/* loaded from: classes3.dex */
public final class qq implements wp0, cu {
    public static final bu k = new bu() { // from class: yads.qq$$ExternalSyntheticLambda0
        @Override // yads.bu
        public final cu a(int i, jw0 jw0Var, boolean z, List list, c83 c83Var, ff2 ff2Var) {
            return qq.a(i, jw0Var, z, list, c83Var, ff2Var);
        }
    };
    public static final dg2 l = new dg2();
    public final tp0 b;
    public final int c;
    public final jw0 d;
    public final SparseArray e = new SparseArray();
    public boolean f;
    public zn g;
    public long h;
    public mx2 i;
    public jw0[] j;

    public qq(tp0 tp0Var, int i, jw0 jw0Var) {
        this.b = tp0Var;
        this.c = i;
        this.d = jw0Var;
    }

    public static cu a(int i, jw0 jw0Var, boolean z, List list, c83 c83Var, ff2 ff2Var) {
        tp0 pw0Var;
        String str = jw0Var.l;
        if (vt1.e(str)) {
            return null;
        }
        if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
            pw0Var = new ti1(1);
        } else {
            pw0Var = new pw0(z ? 4 : 0, list, c83Var);
        }
        return new qq(pw0Var, i, jw0Var);
    }

    public final eu b() {
        mx2 mx2Var = this.i;
        if (mx2Var instanceof eu) {
            return (eu) mx2Var;
        }
        return null;
    }

    public final void c() {
        this.b.release();
    }

    public final void a(zn znVar, long j, long j2) {
        c83 hl0Var;
        this.g = znVar;
        this.h = j2;
        if (!this.f) {
            this.b.a(this);
            if (j != -9223372036854775807L) {
                this.b.a(0L, j);
            }
            this.f = true;
            return;
        }
        tp0 tp0Var = this.b;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        tp0Var.a(0L, j);
        for (int i = 0; i < this.e.size(); i++) {
            pq pqVar = (pq) this.e.valueAt(i);
            if (znVar == null) {
                pqVar.e = pqVar.c;
            } else {
                pqVar.f = j2;
                int i2 = pqVar.a;
                int i3 = 0;
                while (true) {
                    int[] iArr = znVar.a;
                    if (i3 < iArr.length) {
                        if (i2 == iArr[i3]) {
                            hl0Var = znVar.b[i3];
                            break;
                        }
                        i3++;
                    } else {
                        gh1.b("BaseMediaChunkOutput", "Unmatched track of type: " + i2);
                        hl0Var = new hl0();
                        break;
                    }
                }
                pqVar.e = hl0Var;
                jw0 jw0Var = pqVar.d;
                if (jw0Var != null) {
                    hl0Var.a(jw0Var);
                }
            }
        }
    }

    @Override // yads.wp0
    public final c83 a(int i, int i2) {
        c83 hl0Var;
        pq pqVar = (pq) this.e.get(i);
        if (pqVar == null) {
            if (this.j == null) {
                pqVar = new pq(i, i2, i2 == this.c ? this.d : null);
                zn znVar = this.g;
                long j = this.h;
                if (znVar == null) {
                    pqVar.e = pqVar.c;
                } else {
                    pqVar.f = j;
                    int i3 = 0;
                    while (true) {
                        int[] iArr = znVar.a;
                        if (i3 < iArr.length) {
                            if (i2 == iArr[i3]) {
                                hl0Var = znVar.b[i3];
                                break;
                            }
                            i3++;
                        } else {
                            gh1.b("BaseMediaChunkOutput", "Unmatched track of type: " + i2);
                            hl0Var = new hl0();
                            break;
                        }
                    }
                    pqVar.e = hl0Var;
                    jw0 jw0Var = pqVar.d;
                    if (jw0Var != null) {
                        hl0Var.a(jw0Var);
                    }
                }
                this.e.put(i, pqVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return pqVar;
    }

    @Override // yads.wp0
    public final void a() {
        jw0[] jw0VarArr = new jw0[this.e.size()];
        for (int i = 0; i < this.e.size(); i++) {
            jw0 jw0Var = ((pq) this.e.valueAt(i)).d;
            if (jw0Var == null) {
                throw new IllegalStateException();
            }
            jw0VarArr[i] = jw0Var;
        }
        this.j = jw0VarArr;
    }

    @Override // yads.wp0
    public final void a(mx2 mx2Var) {
        this.i = mx2Var;
    }
}
