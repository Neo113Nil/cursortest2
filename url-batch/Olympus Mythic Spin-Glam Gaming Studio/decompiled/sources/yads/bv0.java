package yads;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class bv0 implements tp0 {
    public wp0 f;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public hk o;
    public rj3 p;
    public final xb2 a = new xb2(4);
    public final xb2 b = new xb2(9);
    public final xb2 c = new xb2(11);
    public final xb2 d = new xb2();
    public final ht2 e = new ht2();
    public int g = 1;

    static {
        new yp0() { // from class: yads.bv0$$ExternalSyntheticLambda0
            @Override // yads.yp0
            public final tp0[] a() {
                return bv0.a();
            }
        };
    }

    public static /* synthetic */ tp0[] a() {
        return new tp0[]{new bv0()};
    }

    @Override // yads.tp0
    public final void release() {
    }

    @Override // yads.tp0
    public final boolean a(up0 up0Var) {
        pd0 pd0Var = (pd0) up0Var;
        pd0Var.b(this.a.a, 0, 3, false);
        this.a.e(0);
        if (this.a.m() != 4607062) {
            return false;
        }
        pd0Var.b(this.a.a, 0, 2, false);
        this.a.e(0);
        if ((this.a.p() & POBCommonConstants.DEFAULT_MIN_BITRATE) != 0) {
            return false;
        }
        pd0Var.b(this.a.a, 0, 4, false);
        this.a.e(0);
        int a = this.a.a();
        pd0Var.f = 0;
        pd0Var.a(false, a);
        pd0Var.b(this.a.a, 0, 4, false);
        this.a.e(0);
        return this.a.a() == 0;
    }

    @Override // yads.tp0
    public final void a(wp0 wp0Var) {
        this.f = wp0Var;
    }

    @Override // yads.tp0
    public final void a(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0379 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0006 A[SYNTHETIC] */
    @Override // yads.tp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(up0 up0Var, dg2 dg2Var) {
        long j;
        long j2;
        int i;
        boolean z;
        boolean z2;
        if (this.f == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i2 = this.g;
            if (i2 == 1) {
                if (!((pd0) up0Var).a(this.b.a, 0, 9, true)) {
                    return -1;
                }
                this.b.e(0);
                xb2 xb2Var = this.b;
                xb2Var.e(xb2Var.b + 4);
                int k = this.b.k();
                boolean z3 = (k & 4) != 0;
                boolean z4 = (k & 1) != 0;
                if (z3 && this.o == null) {
                    this.o = new hk(this.f.a(8, 1));
                }
                if (z4 && this.p == null) {
                    this.p = new rj3(this.f.a(9, 2));
                }
                this.f.a();
                this.j = this.b.a() - 5;
                this.g = 2;
            } else if (i2 == 2) {
                ((pd0) up0Var).a(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException();
                }
                if (this.h) {
                    j = this.i + this.m;
                } else if (this.e.b != -9223372036854775807L) {
                    j = this.m;
                } else {
                    j2 = 0;
                    i = this.k;
                    if (i != 8 && this.o != null) {
                        if (!this.n) {
                            this.f.a(new lx2(-9223372036854775807L, 0L));
                            this.n = true;
                        }
                        hk hkVar = this.o;
                        xb2 a = a((pd0) up0Var);
                        if (!hkVar.b) {
                            int k2 = a.k();
                            int i3 = (k2 >> 4) & 15;
                            hkVar.d = i3;
                            if (i3 == 2) {
                                int i4 = hk.e[(k2 >> 2) & 3];
                                iw0 iw0Var = new iw0();
                                iw0Var.k = "audio/mpeg";
                                iw0Var.x = 1;
                                iw0Var.y = i4;
                                hkVar.a.a(new jw0(iw0Var));
                                hkVar.c = true;
                            } else if (i3 == 7 || i3 == 8) {
                                String str = i3 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                iw0 iw0Var2 = new iw0();
                                iw0Var2.k = str;
                                iw0Var2.x = 1;
                                iw0Var2.y = 8000;
                                hkVar.a.a(new jw0(iw0Var2));
                                hkVar.c = true;
                            } else if (i3 != 10) {
                                throw new x53("Audio format not supported: " + hkVar.d);
                            }
                            hkVar.b = true;
                        } else {
                            a.e(a.b + 1);
                        }
                        if (hkVar.d == 2) {
                            int i5 = a.c - a.b;
                            hkVar.a.a(i5, a);
                            hkVar.a.a(j2, 1, i5, 0, null);
                        } else {
                            int k3 = a.k();
                            if (k3 == 0 && !hkVar.c) {
                                int i6 = a.c - a.b;
                                byte[] bArr = new byte[i6];
                                a.a(bArr, 0, i6);
                                a a2 = b.a(new wb2(bArr), false);
                                iw0 iw0Var3 = new iw0();
                                iw0Var3.k = "audio/mp4a-latm";
                                iw0Var3.h = a2.c;
                                iw0Var3.x = a2.b;
                                iw0Var3.y = a2.a;
                                iw0Var3.m = Collections.singletonList(bArr);
                                hkVar.a.a(new jw0(iw0Var3));
                                hkVar.c = true;
                            } else if (hkVar.d != 10 || k3 == 1) {
                                int i7 = a.c - a.b;
                                hkVar.a.a(i7, a);
                                hkVar.a.a(j2, 1, i7, 0, null);
                            }
                            z = false;
                            z2 = true;
                            if (!this.h) {
                            }
                            this.j = 4;
                            this.g = 2;
                            if (!z2) {
                            }
                        }
                        z = true;
                        z2 = z;
                        if (!this.h) {
                        }
                        this.j = 4;
                        this.g = 2;
                        if (!z2) {
                        }
                    } else {
                        if (i != 9 && this.p != null) {
                            if (!this.n) {
                                this.f.a(new lx2(-9223372036854775807L, 0L));
                                this.n = true;
                            }
                            rj3 rj3Var = this.p;
                            xb2 a3 = a((pd0) up0Var);
                            rj3Var.getClass();
                            int k4 = a3.k();
                            int i8 = (k4 >> 4) & 15;
                            int i9 = k4 & 15;
                            if (i9 == 7) {
                                rj3Var.g = i8;
                                if (i8 != 5) {
                                    int k5 = a3.k();
                                    byte[] bArr2 = a3.a;
                                    int i10 = a3.b;
                                    int i11 = i10 + 1;
                                    a3.b = i11;
                                    int i12 = ((bArr2[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) >> 8;
                                    a3.b = i10 + 2;
                                    int i13 = ((bArr2[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
                                    int i14 = i10 + 3;
                                    a3.b = i14;
                                    long j3 = (((bArr2[r15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i13) * 1000) + j2;
                                    if (k5 == 0 && !rj3Var.e) {
                                        byte[] bArr3 = new byte[a3.c - i14];
                                        xb2 xb2Var2 = new xb2(bArr3);
                                        a3.a(bArr3, 0, a3.c - a3.b);
                                        pk a4 = pk.a(xb2Var2);
                                        rj3Var.d = a4.b;
                                        iw0 iw0Var4 = new iw0();
                                        iw0Var4.k = "video/avc";
                                        iw0Var4.h = a4.f;
                                        iw0Var4.p = a4.c;
                                        iw0Var4.q = a4.d;
                                        iw0Var4.t = a4.e;
                                        iw0Var4.m = a4.a;
                                        rj3Var.a.a(new jw0(iw0Var4));
                                        rj3Var.e = true;
                                    } else if (k5 == 1 && rj3Var.e) {
                                        int i15 = rj3Var.g == 1 ? 1 : 0;
                                        if (rj3Var.f || i15 != 0) {
                                            byte[] bArr4 = rj3Var.c.a;
                                            bArr4[0] = 0;
                                            bArr4[1] = 0;
                                            bArr4[2] = 0;
                                            int i16 = 4 - rj3Var.d;
                                            int i17 = 0;
                                            while (a3.c - a3.b > 0) {
                                                a3.a(rj3Var.c.a, i16, rj3Var.d);
                                                rj3Var.c.e(0);
                                                int n = rj3Var.c.n();
                                                rj3Var.b.e(0);
                                                rj3Var.a.a(4, rj3Var.b);
                                                rj3Var.a.a(n, a3);
                                                i17 = i17 + 4 + n;
                                            }
                                            rj3Var.a.a(j3, i15, i17, 0, null);
                                            rj3Var.f = true;
                                            z = true;
                                            z2 = z;
                                            if (!this.h) {
                                                this.h = true;
                                                this.i = this.e.b != -9223372036854775807L ? -this.m : 0L;
                                            }
                                            this.j = 4;
                                            this.g = 2;
                                            if (!z2) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                throw new x53(gg2.a(i9, "Video format not supported: "));
                            }
                        } else if (i != 18 && !this.n) {
                            ht2 ht2Var = this.e;
                            xb2 a5 = a((pd0) up0Var);
                            ht2Var.getClass();
                            if (a5.k() == 2 && "onMetaData".equals(ht2.b(a5)) && a5.c - a5.b != 0 && a5.k() == 8) {
                                HashMap a6 = ht2.a(a5);
                                Object obj = a6.get(IronSourceConstants.EVENTS_DURATION);
                                if (obj instanceof Double) {
                                    double doubleValue = ((Double) obj).doubleValue();
                                    if (doubleValue > 0.0d) {
                                        ht2Var.b = (long) (doubleValue * 1000000.0d);
                                    }
                                }
                                Object obj2 = a6.get("keyframes");
                                if (obj2 instanceof Map) {
                                    Map map = (Map) obj2;
                                    Object obj3 = map.get("filepositions");
                                    Object obj4 = map.get("times");
                                    if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                        List list = (List) obj3;
                                        List list2 = (List) obj4;
                                        int size = list2.size();
                                        ht2Var.c = new long[size];
                                        ht2Var.d = new long[size];
                                        for (int i18 = 0; i18 < size; i18++) {
                                            Object obj5 = list.get(i18);
                                            Object obj6 = list2.get(i18);
                                            if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                                                ht2Var.c[i18] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                                ht2Var.d[i18] = ((Double) obj5).longValue();
                                            } else {
                                                ht2Var.c = new long[0];
                                                ht2Var.d = new long[0];
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            ht2 ht2Var2 = this.e;
                            long j4 = ht2Var2.b;
                            if (j4 != -9223372036854775807L) {
                                this.f.a(new c51(j4, ht2Var2.d, ht2Var2.c));
                                this.n = true;
                            }
                        } else {
                            ((pd0) up0Var).a(this.l);
                            z = false;
                            z2 = z;
                            if (!this.h && z) {
                                this.h = true;
                                this.i = this.e.b != -9223372036854775807L ? -this.m : 0L;
                            }
                            this.j = 4;
                            this.g = 2;
                            if (!z2) {
                                return 0;
                            }
                        }
                        z = false;
                        z2 = true;
                        if (!this.h) {
                        }
                        this.j = 4;
                        this.g = 2;
                        if (!z2) {
                        }
                    }
                }
                j2 = j;
                i = this.k;
                if (i != 8) {
                }
                if (i != 9) {
                }
                if (i != 18) {
                }
                ((pd0) up0Var).a(this.l);
                z = false;
                z2 = z;
                if (!this.h) {
                }
                this.j = 4;
                this.g = 2;
                if (!z2) {
                }
            } else {
                if (!((pd0) up0Var).a(this.c.a, 0, 11, true)) {
                    return -1;
                }
                this.c.e(0);
                this.k = this.c.k();
                this.l = this.c.m();
                this.m = this.c.m();
                this.m = ((this.c.k() << 24) | this.m) * 1000;
                xb2 xb2Var3 = this.c;
                xb2Var3.e(xb2Var3.b + 3);
                this.g = 4;
            }
        }
    }

    public final xb2 a(pd0 pd0Var) {
        int i = this.l;
        xb2 xb2Var = this.d;
        byte[] bArr = xb2Var.a;
        if (i > bArr.length) {
            xb2Var.a = new byte[Math.max(bArr.length * 2, i)];
            xb2Var.c = 0;
            xb2Var.b = 0;
        } else {
            xb2Var.e(0);
        }
        this.d.d(this.l);
        pd0Var.a(this.d.a, 0, this.l, false);
        return this.d;
    }
}
