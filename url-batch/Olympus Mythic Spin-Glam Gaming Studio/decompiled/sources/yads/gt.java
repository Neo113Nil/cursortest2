package yads;

import com.explorestack.protobuf.openrtb.LossReason;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class gt extends ot {
    public final int h;
    public final int i;
    public final int j;
    public List n;
    public List o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public byte t;
    public byte u;
    public boolean w;
    public long x;
    public static final int[] y = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, POBCommonConstants.DEFAULT_MIN_BITRATE, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 120, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};
    public static final int[] D = {193, 201, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 249, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 171, 187};
    public static final int[] E = {195, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 205, 204, 236, 210, 242, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, 123, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 92, 94, 95, 124, 126, 196, 228, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final xb2 g = new xb2();
    public final ArrayList l = new ArrayList();
    public ft m = new ft(0, 4);
    public int v = 0;
    public final long k = 16000000;

    public gt(int i, String str) {
        this.h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.j = 0;
            this.i = 0;
        } else if (i == 2) {
            this.j = 1;
            this.i = 0;
        } else if (i == 3) {
            this.j = 0;
            this.i = 1;
        } else if (i != 4) {
            gh1.d("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.j = 0;
            this.i = 0;
        } else {
            this.j = 1;
            this.i = 1;
        }
        a(0);
        h();
        this.w = true;
        this.x = -9223372036854775807L;
    }

    @Override // yads.ot
    public final pt c() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new pt(list);
    }

    @Override // yads.ot, yads.bb0
    /* renamed from: d */
    public final h53 a() {
        h53 e;
        h53 a = super.a();
        if (a != null) {
            return a;
        }
        long j = this.k;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.x;
        if (j2 == -9223372036854775807L || this.e - j2 < j || (e = e()) == null) {
            return null;
        }
        this.n = Collections.emptyList();
        this.x = -9223372036854775807L;
        pt c = c();
        long j3 = this.e;
        e.c = j3;
        e.d = c;
        e.e = j3;
        return e;
    }

    @Override // yads.ot
    public final boolean f() {
        return this.n != this.o;
    }

    @Override // yads.ot, yads.bb0
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        a(0);
        this.q = 4;
        this.m.h = 4;
        h();
        this.r = false;
        this.s = false;
        this.t = (byte) 0;
        this.u = (byte) 0;
        this.v = 0;
        this.w = true;
        this.x = -9223372036854775807L;
    }

    public final ArrayList g() {
        int size = this.l.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            s20 a = ((ft) this.l.get(i2)).a(Integer.MIN_VALUE);
            arrayList.add(a);
            if (a != null) {
                i = Math.min(i, a.j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            s20 s20Var = (s20) arrayList.get(i3);
            if (s20Var != null) {
                if (s20Var.j != i) {
                    s20Var = ((ft) this.l.get(i3)).a(i);
                    s20Var.getClass();
                }
                arrayList2.add(s20Var);
            }
        }
        return arrayList2;
    }

    public final void h() {
        ft ftVar = this.m;
        ftVar.g = this.p;
        ftVar.a.clear();
        ftVar.b.clear();
        ftVar.c.setLength(0);
        ftVar.d = 15;
        ftVar.e = 0;
        ftVar.f = 0;
        this.l.clear();
        this.l.add(this.m);
    }

    @Override // yads.ot, yads.bb0
    public final void release() {
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090 A[SYNTHETIC] */
    @Override // yads.ot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(mt mtVar) {
        boolean z2;
        ByteBuffer byteBuffer = mtVar.d;
        byteBuffer.getClass();
        xb2 xb2Var = this.g;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        xb2Var.a = array;
        xb2Var.c = limit;
        xb2Var.b = 0;
        boolean z3 = false;
        while (true) {
            xb2 xb2Var2 = this.g;
            int i = xb2Var2.c - xb2Var2.b;
            int i2 = this.h;
            if (i < i2) {
                if (z3) {
                    int i3 = this.p;
                    if (i3 == 1 || i3 == 3) {
                        this.n = g();
                        this.x = this.e;
                        return;
                    }
                    return;
                }
                return;
            }
            byte k = i2 == 2 ? (byte) -4 : (byte) xb2Var2.k();
            int k2 = this.g.k();
            int k3 = this.g.k();
            if ((k & 2) == 0 && (k & 1) == this.i) {
                byte b = (byte) (k2 & 127);
                byte b2 = (byte) (k3 & 127);
                if (b != 0 || b2 != 0) {
                    boolean z4 = this.r;
                    if ((k & 4) == 4) {
                        boolean[] zArr = F;
                        if (zArr[k2] && zArr[k3]) {
                            z2 = true;
                            this.r = z2;
                            if (z2 || (b & 240) != 16) {
                                this.s = false;
                            } else if (this.s && this.t == b && this.u == b2) {
                                this.s = false;
                            } else {
                                this.s = true;
                                this.t = b;
                                this.u = b2;
                            }
                            if (!z2) {
                                if (1 <= b && b <= 15) {
                                    this.w = false;
                                } else if ((b & 247) == 20) {
                                    if (b2 != 32 && b2 != 47) {
                                        switch (b2) {
                                            default:
                                                switch (b2) {
                                                    case 42:
                                                    case 43:
                                                        this.w = false;
                                                        break;
                                                }
                                            case 37:
                                            case 38:
                                            case 39:
                                                this.w = true;
                                                break;
                                        }
                                    }
                                    this.w = true;
                                }
                                if (this.w) {
                                    int i4 = b & 224;
                                    if (i4 == 0) {
                                        this.v = (b >> 3) & 1;
                                    }
                                    if (this.v == this.j) {
                                        if (i4 == 0) {
                                            int i5 = b & 247;
                                            if (i5 == 17 && (b2 & 240) == 48) {
                                                ft ftVar = this.m;
                                                char c = (char) C[b2 & 15];
                                                if (ftVar.c.length() < 32) {
                                                    ftVar.c.append(c);
                                                }
                                            } else {
                                                int i6 = b & 246;
                                                if (i6 == 18 && (b2 & 224) == 32) {
                                                    this.m.a();
                                                    ft ftVar2 = this.m;
                                                    char c2 = (char) ((b & 1) == 0 ? D[b2 & 31] : E[b2 & 31]);
                                                    if (ftVar2.c.length() < 32) {
                                                        ftVar2.c.append(c2);
                                                    }
                                                } else if (i5 == 17 && (b2 & 240) == 32) {
                                                    ft ftVar3 = this.m;
                                                    if (ftVar3.c.length() < 32) {
                                                        ftVar3.c.append(' ');
                                                    }
                                                    boolean z5 = (b2 & 1) == 1;
                                                    ft ftVar4 = this.m;
                                                    ftVar4.a.add(new et((b2 >> 1) & 7, ftVar4.c.length(), z5));
                                                } else if ((b & 240) == 16 && (b2 & 192) == 64) {
                                                    int i7 = y[b & 7];
                                                    if ((b2 & 32) != 0) {
                                                        i7++;
                                                    }
                                                    ft ftVar5 = this.m;
                                                    if (i7 != ftVar5.d) {
                                                        if (this.p != 1 && (!ftVar5.a.isEmpty() || !ftVar5.b.isEmpty() || ftVar5.c.length() != 0)) {
                                                            ft ftVar6 = new ft(this.p, this.q);
                                                            this.m = ftVar6;
                                                            this.l.add(ftVar6);
                                                        }
                                                        this.m.d = i7;
                                                    }
                                                    boolean z6 = (b2 & 16) == 16;
                                                    boolean z7 = (b2 & 1) == 1;
                                                    int i8 = (b2 >> 1) & 7;
                                                    ft ftVar7 = this.m;
                                                    ftVar7.a.add(new et(z6 ? 8 : i8, ftVar7.c.length(), z7));
                                                    if (z6) {
                                                        this.m.e = z[i8];
                                                    }
                                                } else if (i5 == 23 && b2 >= 33 && b2 <= 35) {
                                                    this.m.f = b2 - 32;
                                                } else if (i6 == 20 && (b2 & 240) == 32) {
                                                    if (b2 == 32) {
                                                        a(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                a(1);
                                                                this.q = 2;
                                                                this.m.h = 2;
                                                                break;
                                                            case 38:
                                                                a(1);
                                                                this.q = 3;
                                                                this.m.h = 3;
                                                                break;
                                                            case 39:
                                                                a(1);
                                                                this.q = 4;
                                                                this.m.h = 4;
                                                                break;
                                                            default:
                                                                int i9 = this.p;
                                                                if (i9 != 0) {
                                                                    if (b2 == 33) {
                                                                        this.m.a();
                                                                        break;
                                                                    } else {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.n = Collections.emptyList();
                                                                                int i10 = this.p;
                                                                                if (i10 == 1 || i10 == 3) {
                                                                                    h();
                                                                                    break;
                                                                                }
                                                                            case 45:
                                                                                if (i9 == 1) {
                                                                                    ft ftVar8 = this.m;
                                                                                    if (!ftVar8.a.isEmpty() || !ftVar8.b.isEmpty() || ftVar8.c.length() != 0) {
                                                                                        ft ftVar9 = this.m;
                                                                                        ftVar9.b.add(ftVar9.b());
                                                                                        ftVar9.c.setLength(0);
                                                                                        ftVar9.a.clear();
                                                                                        int min = Math.min(ftVar9.h, ftVar9.d);
                                                                                        while (ftVar9.b.size() >= min) {
                                                                                            ftVar9.b.remove(0);
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                h();
                                                                                break;
                                                                            case 47:
                                                                                this.n = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        a(3);
                                                    }
                                                }
                                            }
                                        } else {
                                            ft ftVar10 = this.m;
                                            int[] iArr = B;
                                            char c3 = (char) iArr[(b & Byte.MAX_VALUE) - 32];
                                            if (ftVar10.c.length() < 32) {
                                                ftVar10.c.append(c3);
                                            }
                                            if ((b2 & 224) != 0) {
                                                ft ftVar11 = this.m;
                                                char c4 = (char) iArr[(b2 & Byte.MAX_VALUE) - 32];
                                                if (ftVar11.c.length() < 32) {
                                                    ftVar11.c.append(c4);
                                                }
                                            }
                                        }
                                        z3 = true;
                                    }
                                }
                            } else if (z4) {
                                h();
                                z3 = true;
                            }
                        }
                    }
                    z2 = false;
                    this.r = z2;
                    if (z2) {
                    }
                    this.s = false;
                    if (!z2) {
                    }
                }
            }
        }
    }

    public final void a(int i) {
        int i2 = this.p;
        if (i2 == i) {
            return;
        }
        this.p = i;
        if (i == 3) {
            for (int i3 = 0; i3 < this.l.size(); i3++) {
                ((ft) this.l.get(i3)).g = i;
            }
            return;
        }
        h();
        if (i2 == 3 || i == 1 || i == 0) {
            this.n = Collections.emptyList();
        }
    }
}
