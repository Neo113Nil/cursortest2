package yads;

import android.util.Pair;
import android.util.SparseArray;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class ti1 implements tp0 {
    public static final byte[] c0;
    public static final byte[] d0;
    public static final byte[] e0;
    public static final byte[] f0;
    public static final UUID g0;
    public static final Map h0;
    public long A;
    public long B;
    public ih1 C;
    public ih1 D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;
    public final nd0 a;
    public boolean a0;
    public final gc3 b;
    public wp0 b0;
    public final SparseArray c;
    public final boolean d;
    public final xb2 e;
    public final xb2 f;
    public final xb2 g;
    public final xb2 h;
    public final xb2 i;
    public final xb2 j;
    public final xb2 k;
    public final xb2 l;
    public final xb2 m;
    public final xb2 n;
    public ByteBuffer o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public si1 u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z;

    static {
        new yp0() { // from class: yads.ti1$$ExternalSyntheticLambda0
            @Override // yads.yp0
            public final tp0[] a() {
                return ti1.a();
            }
        };
        c0 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        d0 = sb3.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
        e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        qi1.a(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        qi1.a(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        h0 = Collections.unmodifiableMap(hashMap);
    }

    public ti1(int i) {
        nd0 nd0Var = new nd0();
        this.q = -1L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.a = nd0Var;
        nd0Var.d = new ri1(this);
        this.d = (i & 1) == 0;
        this.b = new gc3();
        this.c = new SparseArray();
        this.g = new xb2(4);
        this.h = new xb2(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new xb2(4);
        this.e = new xb2(py1.a);
        this.f = new xb2(4);
        this.j = new xb2();
        this.k = new xb2();
        this.l = new xb2(8);
        this.m = new xb2();
        this.n = new xb2();
        this.L = new int[1];
    }

    public static tp0[] a() {
        return new tp0[]{new ti1(0)};
    }

    public final void b() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.a0 = false;
        this.j.c(0);
    }

    @Override // yads.tp0
    public final void release() {
    }

    @Override // yads.tp0
    public final boolean a(up0 up0Var) {
        f23 f23Var = new f23();
        pd0 pd0Var = (pd0) up0Var;
        long j = pd0Var.c;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        pd0Var.b(f23Var.a.a, 0, 4, false);
        f23Var.b = 4;
        for (long l = f23Var.a.l(); l != 440786851; l = ((l << 8) & (-256)) | (f23Var.a.a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) {
            int i2 = f23Var.b + 1;
            f23Var.b = i2;
            if (i2 == i) {
                return false;
            }
            pd0Var.b(f23Var.a.a, 0, 1, false);
        }
        long a = f23Var.a(pd0Var);
        long j3 = f23Var.b;
        if (a == Long.MIN_VALUE) {
            return false;
        }
        if (j != -1 && j3 + a >= j) {
            return false;
        }
        while (true) {
            long j4 = f23Var.b;
            long j5 = j3 + a;
            if (j4 >= j5) {
                return j4 == j5;
            }
            if (f23Var.a(pd0Var) == Long.MIN_VALUE) {
                return false;
            }
            long a2 = f23Var.a(pd0Var);
            if (a2 < 0 || a2 > 2147483647L) {
                return false;
            }
            if (a2 != 0) {
                int i3 = (int) a2;
                pd0Var.a(false, i3);
                f23Var.b += i3;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x080d, code lost:
    
        if (r1.g() == r10.getLeastSignificantBits()) goto L481;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0a64  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x09dc  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x086d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i) {
        char c;
        int i2;
        List singletonList;
        String str;
        int b;
        int i3;
        ArrayList arrayList;
        int i4;
        Pair pair;
        List list;
        String str2;
        byte[] bArr;
        iw0 iw0Var;
        int i5;
        int i6;
        fx fxVar;
        int i7;
        byte[] bArr2;
        int i8;
        String str3;
        si1 si1Var;
        qj0 a;
        mx2 lx2Var;
        int i9;
        int i10;
        wp0 wp0Var = this.b0;
        if (wp0Var == null) {
            throw new IllegalStateException();
        }
        if (i == 160) {
            if (this.G != 2) {
                return;
            }
            si1 si1Var2 = (si1) this.c.get(this.M);
            si1Var2.X.getClass();
            if (this.R > 0 && "A_OPUS".equals(si1Var2.b)) {
                this.n.a(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.R).array());
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.K; i12++) {
                i11 += this.L[i12];
            }
            int i13 = 0;
            while (i13 < this.K) {
                long j = this.H + ((si1Var2.e * i13) / 1000);
                int i14 = this.O;
                if (i13 == 0 && !this.Q) {
                    i14 |= 1;
                }
                int i15 = this.L[i13];
                int i16 = i11 - i15;
                a(si1Var2, j, i14, i15, i16);
                i13++;
                i11 = i16;
            }
            this.G = 0;
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                int i17 = this.w;
                if (i17 != -1) {
                    long j2 = this.x;
                    if (j2 != -1) {
                        if (i17 == 475249515) {
                            this.z = j2;
                            return;
                        }
                        return;
                    }
                }
                throw new cc2("Mandatory element SeekID or SeekPosition not found", null, true, 1);
            }
            if (i == 25152) {
                a(i);
                si1 si1Var3 = this.u;
                if (si1Var3.h) {
                    b83 b83Var = si1Var3.j;
                    if (b83Var != null) {
                        si1Var3.l = new vk0(null, true, new uk0(xq.a, null, "video/webm", b83Var.b));
                        return;
                    }
                    throw new cc2("Encrypted Track found but ContentEncKeyID was not found", null, true, 1);
                }
                return;
            }
            if (i == 28032) {
                a(i);
                si1 si1Var4 = this.u;
                if (si1Var4.h && si1Var4.i != null) {
                    throw new cc2("Combining encryption and compression is not supported", null, true, 1);
                }
                return;
            }
            if (i == 357149030) {
                if (this.r == -9223372036854775807L) {
                    this.r = 1000000L;
                }
                long j3 = this.s;
                if (j3 != -9223372036854775807L) {
                    this.t = a(j3);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (this.c.size() != 0) {
                    this.b0.a();
                    return;
                }
                throw new cc2("No valid tracks were found", null, true, 1);
            }
            if (i != 475249515) {
                return;
            }
            if (!this.v) {
                ih1 ih1Var = this.C;
                ih1 ih1Var2 = this.D;
                if (this.q != -1 && this.t != -9223372036854775807L && ih1Var != null && (i9 = ih1Var.a) != 0 && ih1Var2 != null && ih1Var2.a == i9) {
                    int[] iArr = new int[i9];
                    long[] jArr = new long[i9];
                    long[] jArr2 = new long[i9];
                    long[] jArr3 = new long[i9];
                    for (int i18 = 0; i18 < i9; i18++) {
                        jArr3[i18] = ih1Var.a(i18);
                        jArr[i18] = ih1Var2.a(i18) + this.q;
                    }
                    int i19 = 0;
                    while (true) {
                        i10 = i9 - 1;
                        if (i19 >= i10) {
                            break;
                        }
                        int i20 = i19 + 1;
                        iArr[i19] = (int) (jArr[i20] - jArr[i19]);
                        jArr2[i19] = jArr3[i20] - jArr3[i19];
                        i19 = i20;
                    }
                    iArr[i10] = (int) ((this.q + this.p) - jArr[i10]);
                    long j4 = this.t - jArr3[i10];
                    jArr2[i10] = j4;
                    if (j4 <= 0) {
                        gh1.d("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j4);
                        iArr = Arrays.copyOf(iArr, i10);
                        jArr = Arrays.copyOf(jArr, i10);
                        jArr2 = Arrays.copyOf(jArr2, i10);
                        jArr3 = Arrays.copyOf(jArr3, i10);
                    }
                    lx2Var = new eu(iArr, jArr, jArr2, jArr3);
                } else {
                    lx2Var = new lx2(this.t, 0L);
                }
                wp0Var.a(lx2Var);
                this.v = true;
            }
            this.C = null;
            this.D = null;
            return;
        }
        si1 si1Var5 = this.u;
        if (si1Var5 != null) {
            String str4 = si1Var5.b;
            if (str4 != null) {
                switch (str4) {
                    case "V_MPEG4/ISO/AP":
                    case "V_MPEG4/ISO/SP":
                    case "A_MS/ACM":
                    case "A_TRUEHD":
                    case "A_VORBIS":
                    case "A_MPEG/L2":
                    case "A_MPEG/L3":
                    case "V_MS/VFW/FOURCC":
                    case "S_DVBSUB":
                    case "V_MPEG4/ISO/ASP":
                    case "V_MPEG4/ISO/AVC":
                    case "S_VOBSUB":
                    case "A_DTS/LOSSLESS":
                    case "A_AAC":
                    case "A_AC3":
                    case "A_DTS":
                    case "V_AV1":
                    case "V_VP8":
                    case "V_VP9":
                    case "S_HDMV/PGS":
                    case "V_THEORA":
                    case "A_DTS/EXPRESS":
                    case "A_PCM/FLOAT/IEEE":
                    case "A_PCM/INT/BIG":
                    case "A_PCM/INT/LIT":
                    case "S_TEXT/ASS":
                    case "V_MPEGH/ISO/HEVC":
                    case "S_TEXT/WEBVTT":
                    case "S_TEXT/UTF8":
                    case "V_MPEG2":
                    case "A_EAC3":
                    case "A_FLAC":
                    case "A_OPUS":
                        int i21 = si1Var5.c;
                        String str5 = "audio/raw";
                        switch (str4.hashCode()) {
                            case -2095576542:
                                if (str4.equals("V_MPEG4/ISO/AP")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -2095575984:
                                if (str4.equals("V_MPEG4/ISO/SP")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1985379776:
                                if (str4.equals("A_MS/ACM")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1784763192:
                                if (str4.equals("A_TRUEHD")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1730367663:
                                if (str4.equals("A_VORBIS")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1482641358:
                                if (str4.equals("A_MPEG/L2")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1482641357:
                                if (str4.equals("A_MPEG/L3")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1373388978:
                                if (str4.equals("V_MS/VFW/FOURCC")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -933872740:
                                if (str4.equals("S_DVBSUB")) {
                                    c = '\b';
                                    break;
                                }
                                c = 65535;
                                break;
                            case -538363189:
                                if (str4.equals("V_MPEG4/ISO/ASP")) {
                                    c = '\t';
                                    break;
                                }
                                c = 65535;
                                break;
                            case -538363109:
                                if (str4.equals("V_MPEG4/ISO/AVC")) {
                                    c = '\n';
                                    break;
                                }
                                c = 65535;
                                break;
                            case -425012669:
                                if (str4.equals("S_VOBSUB")) {
                                    c = 11;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -356037306:
                                if (str4.equals("A_DTS/LOSSLESS")) {
                                    c = '\f';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 62923557:
                                if (str4.equals("A_AAC")) {
                                    c = '\r';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 62923603:
                                if (str4.equals("A_AC3")) {
                                    c = 14;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 62927045:
                                if (str4.equals("A_DTS")) {
                                    c = 15;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 82318131:
                                if (str4.equals("V_AV1")) {
                                    c = 16;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 82338133:
                                if (str4.equals("V_VP8")) {
                                    c = 17;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 82338134:
                                if (str4.equals("V_VP9")) {
                                    c = 18;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 99146302:
                                if (str4.equals("S_HDMV/PGS")) {
                                    c = 19;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 444813526:
                                if (str4.equals("V_THEORA")) {
                                    c = 20;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 542569478:
                                if (str4.equals("A_DTS/EXPRESS")) {
                                    c = 21;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 635596514:
                                if (str4.equals("A_PCM/FLOAT/IEEE")) {
                                    c = 22;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 725948237:
                                if (str4.equals("A_PCM/INT/BIG")) {
                                    c = 23;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 725957860:
                                if (str4.equals("A_PCM/INT/LIT")) {
                                    c = 24;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 738597099:
                                if (str4.equals("S_TEXT/ASS")) {
                                    c = 25;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 855502857:
                                if (str4.equals("V_MPEGH/ISO/HEVC")) {
                                    c = 26;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1045209816:
                                if (str4.equals("S_TEXT/WEBVTT")) {
                                    c = 27;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1422270023:
                                if (str4.equals("S_TEXT/UTF8")) {
                                    c = 28;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1809237540:
                                if (str4.equals("V_MPEG2")) {
                                    c = 29;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1950749482:
                                if (str4.equals("A_EAC3")) {
                                    c = 30;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1950789798:
                                if (str4.equals("A_FLAC")) {
                                    c = 31;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1951062397:
                                if (str4.equals("A_OPUS")) {
                                    c = ' ';
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                            case '\t':
                                i2 = 3;
                                byte[] bArr3 = si1Var5.k;
                                str5 = "video/mp4v-es";
                                if (bArr3 != null) {
                                    singletonList = Collections.singletonList(bArr3);
                                    str = null;
                                    i3 = -1;
                                    b = -1;
                                    bArr = si1Var5.N;
                                    if (bArr != null && (a = qj0.a(new xb2(bArr))) != null) {
                                        str = a.a;
                                        str5 = "video/dolby-vision";
                                    }
                                    int i22 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                    iw0Var = new iw0();
                                    if ("audio".equals(vt1.c(str5))) {
                                        iw0Var.x = si1Var5.O;
                                        iw0Var.y = si1Var5.Q;
                                        iw0Var.z = b;
                                        i5 = 1;
                                    } else if ("video".equals(vt1.c(str5))) {
                                        if (si1Var5.q == 0) {
                                            int i23 = si1Var5.o;
                                            i6 = -1;
                                            if (i23 == -1) {
                                                i23 = si1Var5.m;
                                            }
                                            si1Var5.o = i23;
                                            int i24 = si1Var5.p;
                                            if (i24 == -1) {
                                                i24 = si1Var5.n;
                                            }
                                            si1Var5.p = i24;
                                        } else {
                                            i6 = -1;
                                        }
                                        float f = (si1Var5.o == i6 || (i8 = si1Var5.p) == i6) ? -1.0f : (si1Var5.n * r9) / (si1Var5.m * i8);
                                        if (si1Var5.x) {
                                            if (si1Var5.D == -1.0f || si1Var5.E == -1.0f || si1Var5.F == -1.0f || si1Var5.G == -1.0f || si1Var5.H == -1.0f || si1Var5.I == -1.0f || si1Var5.J == -1.0f || si1Var5.K == -1.0f || si1Var5.L == -1.0f || si1Var5.M == -1.0f) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = new byte[25];
                                                ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                                order.put((byte) 0);
                                                order.putShort((short) ((si1Var5.D * 50000.0f) + 0.5f));
                                                order.putShort((short) ((si1Var5.E * 50000.0f) + 0.5f));
                                                order.putShort((short) ((si1Var5.F * 50000.0f) + 0.5f));
                                                order.putShort((short) ((si1Var5.G * 50000.0f) + 0.5f));
                                                order.putShort((short) ((si1Var5.H * 50000.0f) + 0.5f));
                                                order.putShort((short) ((si1Var5.I * 50000.0f) + 0.5f));
                                                order.putShort((short) ((si1Var5.J * 50000.0f) + 0.5f));
                                                order.putShort((short) ((si1Var5.K * 50000.0f) + 0.5f));
                                                order.putShort((short) (si1Var5.L + 0.5f));
                                                order.putShort((short) (si1Var5.M + 0.5f));
                                                order.putShort((short) si1Var5.B);
                                                order.putShort((short) si1Var5.C);
                                            }
                                            fxVar = new fx(si1Var5.y, si1Var5.A, si1Var5.z, bArr2);
                                        } else {
                                            fxVar = null;
                                        }
                                        String str6 = si1Var5.a;
                                        if (str6 != null) {
                                            Map map = h0;
                                            if (map.containsKey(str6)) {
                                                i7 = ((Integer) map.get(si1Var5.a)).intValue();
                                                if (si1Var5.r == 0 && Float.compare(si1Var5.s, 0.0f) == 0 && Float.compare(si1Var5.t, 0.0f) == 0) {
                                                    if (Float.compare(si1Var5.u, 0.0f) != 0) {
                                                        i7 = 0;
                                                    } else if (Float.compare(si1Var5.t, 90.0f) == 0) {
                                                        i7 = 90;
                                                    } else if (Float.compare(si1Var5.t, -180.0f) == 0 || Float.compare(si1Var5.t, 180.0f) == 0) {
                                                        i7 = 180;
                                                    } else if (Float.compare(si1Var5.t, -90.0f) == 0) {
                                                        i7 = 270;
                                                    }
                                                }
                                                iw0Var.p = si1Var5.m;
                                                iw0Var.q = si1Var5.n;
                                                iw0Var.t = f;
                                                iw0Var.s = i7;
                                                iw0Var.u = si1Var5.v;
                                                iw0Var.v = si1Var5.w;
                                                iw0Var.w = fxVar;
                                                i5 = 2;
                                            }
                                        }
                                        i7 = -1;
                                        if (si1Var5.r == 0) {
                                            if (Float.compare(si1Var5.u, 0.0f) != 0) {
                                            }
                                        }
                                        iw0Var.p = si1Var5.m;
                                        iw0Var.q = si1Var5.n;
                                        iw0Var.t = f;
                                        iw0Var.s = i7;
                                        iw0Var.u = si1Var5.v;
                                        iw0Var.v = si1Var5.w;
                                        iw0Var.w = fxVar;
                                        i5 = 2;
                                    } else {
                                        if (!"application/x-subrip".equals(str5) && !"text/x-ssa".equals(str5) && !"text/vtt".equals(str5) && !"application/vobsub".equals(str5) && !"application/pgs".equals(str5) && !"application/dvbsubs".equals(str5)) {
                                            throw new cc2("Unexpected MIME type.", null, true, 1);
                                        }
                                        i5 = i2;
                                    }
                                    str3 = si1Var5.a;
                                    if (str3 != null && !h0.containsKey(str3)) {
                                        iw0Var.b = si1Var5.a;
                                    }
                                    iw0Var.a = Integer.toString(i21);
                                    iw0Var.k = str5;
                                    iw0Var.l = i3;
                                    iw0Var.c = si1Var5.W;
                                    iw0Var.d = i22;
                                    iw0Var.m = singletonList;
                                    iw0Var.h = str;
                                    iw0Var.n = si1Var5.l;
                                    jw0 jw0Var = new jw0(iw0Var);
                                    c83 a2 = wp0Var.a(si1Var5.c, i5);
                                    si1Var5.X = a2;
                                    a2.a(jw0Var);
                                    this.c.put(si1Var5.c, si1Var5);
                                    si1Var = null;
                                    break;
                                }
                                singletonList = null;
                                str = null;
                                i3 = -1;
                                b = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                    str = a.a;
                                    str5 = "video/dolby-vision";
                                }
                                int i222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                    iw0Var.b = si1Var5.a;
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var2 = new jw0(iw0Var);
                                c83 a22 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a22;
                                a22.a(jw0Var2);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case 2:
                                i2 = 3;
                                xb2 xb2Var = new xb2(si1Var5.a(str4));
                                try {
                                    int f2 = xb2Var.f();
                                    if (f2 != 1) {
                                        if (f2 == 65534) {
                                            xb2Var.e(24);
                                            long g = xb2Var.g();
                                            UUID uuid = g0;
                                            if (g == uuid.getMostSignificantBits()) {
                                                break;
                                            }
                                        }
                                        gh1.d("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                        singletonList = null;
                                        str = null;
                                        str5 = "audio/x-unknown";
                                        i3 = -1;
                                        b = -1;
                                        bArr = si1Var5.N;
                                        if (bArr != null) {
                                        }
                                        int i2222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                        iw0Var = new iw0();
                                        if ("audio".equals(vt1.c(str5))) {
                                        }
                                        str3 = si1Var5.a;
                                        if (str3 != null) {
                                        }
                                        iw0Var.a = Integer.toString(i21);
                                        iw0Var.k = str5;
                                        iw0Var.l = i3;
                                        iw0Var.c = si1Var5.W;
                                        iw0Var.d = i2222;
                                        iw0Var.m = singletonList;
                                        iw0Var.h = str;
                                        iw0Var.n = si1Var5.l;
                                        jw0 jw0Var22 = new jw0(iw0Var);
                                        c83 a222 = wp0Var.a(si1Var5.c, i5);
                                        si1Var5.X = a222;
                                        a222.a(jw0Var22);
                                        this.c.put(si1Var5.c, si1Var5);
                                        si1Var = null;
                                        break;
                                    }
                                    b = sb3.b(si1Var5.P);
                                    if (b == 0) {
                                        gh1.d("MatroskaExtractor", "Unsupported PCM bit depth: " + si1Var5.P + ". Setting mimeType to audio/x-unknown");
                                        singletonList = null;
                                        str = null;
                                        str5 = "audio/x-unknown";
                                        i3 = -1;
                                        b = -1;
                                        bArr = si1Var5.N;
                                        if (bArr != null) {
                                        }
                                        int i22222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                        iw0Var = new iw0();
                                        if ("audio".equals(vt1.c(str5))) {
                                        }
                                        str3 = si1Var5.a;
                                        if (str3 != null) {
                                        }
                                        iw0Var.a = Integer.toString(i21);
                                        iw0Var.k = str5;
                                        iw0Var.l = i3;
                                        iw0Var.c = si1Var5.W;
                                        iw0Var.d = i22222;
                                        iw0Var.m = singletonList;
                                        iw0Var.h = str;
                                        iw0Var.n = si1Var5.l;
                                        jw0 jw0Var222 = new jw0(iw0Var);
                                        c83 a2222 = wp0Var.a(si1Var5.c, i5);
                                        si1Var5.X = a2222;
                                        a2222.a(jw0Var222);
                                        this.c.put(si1Var5.c, si1Var5);
                                        si1Var = null;
                                    } else {
                                        singletonList = null;
                                        str = null;
                                        i3 = -1;
                                        bArr = si1Var5.N;
                                        if (bArr != null) {
                                        }
                                        int i222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                        iw0Var = new iw0();
                                        if ("audio".equals(vt1.c(str5))) {
                                        }
                                        str3 = si1Var5.a;
                                        if (str3 != null) {
                                        }
                                        iw0Var.a = Integer.toString(i21);
                                        iw0Var.k = str5;
                                        iw0Var.l = i3;
                                        iw0Var.c = si1Var5.W;
                                        iw0Var.d = i222222;
                                        iw0Var.m = singletonList;
                                        iw0Var.h = str;
                                        iw0Var.n = si1Var5.l;
                                        jw0 jw0Var2222 = new jw0(iw0Var);
                                        c83 a22222 = wp0Var.a(si1Var5.c, i5);
                                        si1Var5.X = a22222;
                                        a22222.a(jw0Var2222);
                                        this.c.put(si1Var5.c, si1Var5);
                                        si1Var = null;
                                    }
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    throw new cc2("Error parsing MS/ACM codec private", null, true, 1);
                                }
                                break;
                            case 3:
                                i2 = 3;
                                si1Var5.T = new o93();
                                str5 = "audio/true-hd";
                                singletonList = null;
                                str = null;
                                i3 = -1;
                                b = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i2222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i2222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var22222 = new jw0(iw0Var);
                                c83 a222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a222222;
                                a222222.a(jw0Var22222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case 4:
                                byte[] a3 = si1Var5.a(str4);
                                try {
                                    if (a3[0] != 2) {
                                        throw new cc2("Error parsing vorbis codec private", null, true, 1);
                                    }
                                    int i25 = 1;
                                    int i26 = 0;
                                    while (true) {
                                        int i27 = a3[i25] & 255;
                                        if (i27 == 255) {
                                            i26 += 255;
                                            i25++;
                                        } else {
                                            int i28 = i25 + 1;
                                            int i29 = i26 + i27;
                                            int i30 = 0;
                                            while (true) {
                                                int i31 = a3[i28] & 255;
                                                if (i31 == 255) {
                                                    i30 += 255;
                                                    i28++;
                                                } else {
                                                    int i32 = i28 + 1;
                                                    int i33 = i30 + i31;
                                                    if (a3[i32] == 1) {
                                                        byte[] bArr4 = new byte[i29];
                                                        System.arraycopy(a3, i32, bArr4, 0, i29);
                                                        int i34 = i32 + i29;
                                                        i2 = 3;
                                                        if (a3[i34] == 3) {
                                                            int i35 = i34 + i33;
                                                            if (a3[i35] == 5) {
                                                                byte[] bArr5 = new byte[a3.length - i35];
                                                                System.arraycopy(a3, i35, bArr5, 0, a3.length - i35);
                                                                arrayList = new ArrayList(2);
                                                                arrayList.add(bArr4);
                                                                arrayList.add(bArr5);
                                                                str5 = "audio/vorbis";
                                                                i4 = 8192;
                                                                str = null;
                                                                b = -1;
                                                                int i36 = i4;
                                                                singletonList = arrayList;
                                                                i3 = i36;
                                                                bArr = si1Var5.N;
                                                                if (bArr != null) {
                                                                }
                                                                int i22222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                                                iw0Var = new iw0();
                                                                if ("audio".equals(vt1.c(str5))) {
                                                                }
                                                                str3 = si1Var5.a;
                                                                if (str3 != null) {
                                                                }
                                                                iw0Var.a = Integer.toString(i21);
                                                                iw0Var.k = str5;
                                                                iw0Var.l = i3;
                                                                iw0Var.c = si1Var5.W;
                                                                iw0Var.d = i22222222;
                                                                iw0Var.m = singletonList;
                                                                iw0Var.h = str;
                                                                iw0Var.n = si1Var5.l;
                                                                jw0 jw0Var222222 = new jw0(iw0Var);
                                                                c83 a2222222 = wp0Var.a(si1Var5.c, i5);
                                                                si1Var5.X = a2222222;
                                                                a2222222.a(jw0Var222222);
                                                                this.c.put(si1Var5.c, si1Var5);
                                                                si1Var = null;
                                                                break;
                                                            } else {
                                                                throw new cc2("Error parsing vorbis codec private", null, true, 1);
                                                            }
                                                        } else {
                                                            throw new cc2("Error parsing vorbis codec private", null, true, 1);
                                                        }
                                                    } else {
                                                        throw new cc2("Error parsing vorbis codec private", null, true, 1);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                    throw new cc2("Error parsing vorbis codec private", null, true, 1);
                                }
                                break;
                            case 5:
                                str5 = "audio/mpeg-L2";
                                i3 = 4096;
                                singletonList = null;
                                str = null;
                                i2 = 3;
                                b = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var2222222 = new jw0(iw0Var);
                                c83 a22222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a22222222;
                                a22222222.a(jw0Var2222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case 6:
                                str5 = "audio/mpeg";
                                i3 = 4096;
                                singletonList = null;
                                str = null;
                                i2 = 3;
                                b = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i2222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i2222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var22222222 = new jw0(iw0Var);
                                c83 a222222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a222222222;
                                a222222222.a(jw0Var22222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case 7:
                                byte[] a4 = si1Var5.a(str4);
                                try {
                                    if (16 <= a4.length) {
                                        long j5 = (a4[16] & 255) | ((a4[17] & 255) << 8) | ((a4[18] & 255) << 16) | ((255 & a4[19]) << 24);
                                        if (j5 == 1482049860) {
                                            pair = new Pair("video/divx", null);
                                        } else if (j5 == 859189832) {
                                            pair = new Pair("video/3gpp", null);
                                        } else {
                                            if (j5 == 826496599) {
                                                for (int i37 = 40; i37 < a4.length - 4; i37++) {
                                                    if (a4[i37] == 0 && a4[i37 + 1] == 0 && a4[i37 + 2] == 1) {
                                                        if (a4[i37 + 3] == 15) {
                                                            pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(a4, i37, a4.length)));
                                                        }
                                                    }
                                                }
                                                throw new cc2("Failed to find FourCC VC1 initialization data", null, true, 1);
                                            }
                                            gh1.d("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                            pair = new Pair("video/x-unknown", null);
                                        }
                                        str5 = (String) pair.first;
                                        list = (List) pair.second;
                                        singletonList = list;
                                        str = null;
                                        i3 = -1;
                                        i2 = 3;
                                        b = -1;
                                        bArr = si1Var5.N;
                                        if (bArr != null) {
                                        }
                                        int i22222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                        iw0Var = new iw0();
                                        if ("audio".equals(vt1.c(str5))) {
                                        }
                                        str3 = si1Var5.a;
                                        if (str3 != null) {
                                        }
                                        iw0Var.a = Integer.toString(i21);
                                        iw0Var.k = str5;
                                        iw0Var.l = i3;
                                        iw0Var.c = si1Var5.W;
                                        iw0Var.d = i22222222222;
                                        iw0Var.m = singletonList;
                                        iw0Var.h = str;
                                        iw0Var.n = si1Var5.l;
                                        jw0 jw0Var222222222 = new jw0(iw0Var);
                                        c83 a2222222222 = wp0Var.a(si1Var5.c, i5);
                                        si1Var5.X = a2222222222;
                                        a2222222222.a(jw0Var222222222);
                                        this.c.put(si1Var5.c, si1Var5);
                                        si1Var = null;
                                        break;
                                    } else {
                                        throw new IllegalArgumentException();
                                    }
                                } catch (ArrayIndexOutOfBoundsException unused3) {
                                    throw new cc2("Error parsing FourCC private data", null, true, 1);
                                }
                                break;
                            case '\b':
                                byte[] bArr6 = new byte[4];
                                System.arraycopy(si1Var5.a(str4), 0, bArr6, 0, 4);
                                list = l41.a(bArr6);
                                str5 = "application/dvbsubs";
                                singletonList = list;
                                str = null;
                                i3 = -1;
                                i2 = 3;
                                b = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i222222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var2222222222 = new jw0(iw0Var);
                                c83 a22222222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a22222222222;
                                a22222222222.a(jw0Var2222222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case '\n':
                                pk a5 = pk.a(new xb2(si1Var5.a(str4)));
                                singletonList = a5.a;
                                si1Var5.Y = a5.b;
                                str2 = a5.f;
                                str5 = "video/avc";
                                str = str2;
                                i3 = -1;
                                i2 = 3;
                                b = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i2222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i2222222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var22222222222 = new jw0(iw0Var);
                                c83 a222222222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a222222222222;
                                a222222222222.a(jw0Var22222222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case 11:
                                list = l41.a(si1Var5.a(str4));
                                str5 = "application/vobsub";
                                singletonList = list;
                                str = null;
                                i3 = -1;
                                i2 = 3;
                                b = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i22222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i22222222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var222222222222 = new jw0(iw0Var);
                                c83 a2222222222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a2222222222222;
                                a2222222222222.a(jw0Var222222222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case '\f':
                                str5 = "audio/vnd.dts.hd";
                                singletonList = null;
                                str = null;
                                i3 = -1;
                                i2 = 3;
                                b = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i222222222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var2222222222222 = new jw0(iw0Var);
                                c83 a22222222222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a22222222222222;
                                a22222222222222.a(jw0Var2222222222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case '\r':
                                List singletonList2 = Collections.singletonList(si1Var5.a(str4));
                                a a6 = b.a(new wb2(si1Var5.k), false);
                                si1Var5.Q = a6.a;
                                si1Var5.O = a6.b;
                                str5 = "audio/mp4a-latm";
                                str = a6.c;
                                i2 = 3;
                                b = -1;
                                singletonList = singletonList2;
                                i3 = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i2222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i2222222222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var22222222222222 = new jw0(iw0Var);
                                c83 a222222222222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a222222222222222;
                                a222222222222222.a(jw0Var22222222222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case 14:
                                str5 = "audio/ac3";
                                singletonList = null;
                                str = null;
                                i3 = -1;
                                i2 = 3;
                                b = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i22222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i22222222222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var222222222222222 = new jw0(iw0Var);
                                c83 a2222222222222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a2222222222222222;
                                a2222222222222222.a(jw0Var222222222222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case 15:
                            case 21:
                                str5 = "audio/vnd.dts";
                                singletonList = null;
                                str = null;
                                i3 = -1;
                                i2 = 3;
                                b = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i222222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i222222222222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var2222222222222222 = new jw0(iw0Var);
                                c83 a22222222222222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a22222222222222222;
                                a22222222222222222.a(jw0Var2222222222222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case 16:
                                str5 = "video/av01";
                                singletonList = null;
                                str = null;
                                i3 = -1;
                                i2 = 3;
                                b = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i2222222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i2222222222222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var22222222222222222 = new jw0(iw0Var);
                                c83 a222222222222222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a222222222222222222;
                                a222222222222222222.a(jw0Var22222222222222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case 17:
                                str5 = "video/x-vnd.on2.vp8";
                                singletonList = null;
                                str = null;
                                i3 = -1;
                                i2 = 3;
                                b = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i22222222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i22222222222222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var222222222222222222 = new jw0(iw0Var);
                                c83 a2222222222222222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a2222222222222222222;
                                a2222222222222222222.a(jw0Var222222222222222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case 18:
                                str5 = "video/x-vnd.on2.vp9";
                                singletonList = null;
                                str = null;
                                i3 = -1;
                                i2 = 3;
                                b = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i222222222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i222222222222222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var2222222222222222222 = new jw0(iw0Var);
                                c83 a22222222222222222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a22222222222222222222;
                                a22222222222222222222.a(jw0Var2222222222222222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case 19:
                                str5 = "application/pgs";
                                singletonList = null;
                                str = null;
                                i3 = -1;
                                i2 = 3;
                                b = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i2222222222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i2222222222222222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var22222222222222222222 = new jw0(iw0Var);
                                c83 a222222222222222222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a222222222222222222222;
                                a222222222222222222222.a(jw0Var22222222222222222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case 20:
                                str5 = "video/x-unknown";
                                singletonList = null;
                                str = null;
                                i3 = -1;
                                i2 = 3;
                                b = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i22222222222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i22222222222222222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var222222222222222222222 = new jw0(iw0Var);
                                c83 a2222222222222222222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a2222222222222222222222;
                                a2222222222222222222222.a(jw0Var222222222222222222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case 22:
                                if (si1Var5.P != 32) {
                                    gh1.d("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + si1Var5.P + ". Setting mimeType to audio/x-unknown");
                                    singletonList = null;
                                    str = null;
                                    str5 = "audio/x-unknown";
                                    i3 = -1;
                                    i2 = 3;
                                    b = -1;
                                    bArr = si1Var5.N;
                                    if (bArr != null) {
                                    }
                                    int i222222222222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                    iw0Var = new iw0();
                                    if ("audio".equals(vt1.c(str5))) {
                                    }
                                    str3 = si1Var5.a;
                                    if (str3 != null) {
                                    }
                                    iw0Var.a = Integer.toString(i21);
                                    iw0Var.k = str5;
                                    iw0Var.l = i3;
                                    iw0Var.c = si1Var5.W;
                                    iw0Var.d = i222222222222222222222222;
                                    iw0Var.m = singletonList;
                                    iw0Var.h = str;
                                    iw0Var.n = si1Var5.l;
                                    jw0 jw0Var2222222222222222222222 = new jw0(iw0Var);
                                    c83 a22222222222222222222222 = wp0Var.a(si1Var5.c, i5);
                                    si1Var5.X = a22222222222222222222222;
                                    a22222222222222222222222.a(jw0Var2222222222222222222222);
                                    this.c.put(si1Var5.c, si1Var5);
                                    si1Var = null;
                                } else {
                                    singletonList = null;
                                    str = null;
                                    i3 = -1;
                                    i2 = 3;
                                    b = 4;
                                    bArr = si1Var5.N;
                                    if (bArr != null) {
                                    }
                                    int i2222222222222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                    iw0Var = new iw0();
                                    if ("audio".equals(vt1.c(str5))) {
                                    }
                                    str3 = si1Var5.a;
                                    if (str3 != null) {
                                    }
                                    iw0Var.a = Integer.toString(i21);
                                    iw0Var.k = str5;
                                    iw0Var.l = i3;
                                    iw0Var.c = si1Var5.W;
                                    iw0Var.d = i2222222222222222222222222;
                                    iw0Var.m = singletonList;
                                    iw0Var.h = str;
                                    iw0Var.n = si1Var5.l;
                                    jw0 jw0Var22222222222222222222222 = new jw0(iw0Var);
                                    c83 a222222222222222222222222 = wp0Var.a(si1Var5.c, i5);
                                    si1Var5.X = a222222222222222222222222;
                                    a222222222222222222222222.a(jw0Var22222222222222222222222);
                                    this.c.put(si1Var5.c, si1Var5);
                                    si1Var = null;
                                    break;
                                }
                                break;
                            case 23:
                                int i38 = si1Var5.P;
                                if (i38 == 8) {
                                    singletonList = null;
                                    str = null;
                                    i3 = -1;
                                    i2 = 3;
                                    b = 3;
                                    bArr = si1Var5.N;
                                    if (bArr != null) {
                                    }
                                    int i22222222222222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                    iw0Var = new iw0();
                                    if ("audio".equals(vt1.c(str5))) {
                                    }
                                    str3 = si1Var5.a;
                                    if (str3 != null) {
                                    }
                                    iw0Var.a = Integer.toString(i21);
                                    iw0Var.k = str5;
                                    iw0Var.l = i3;
                                    iw0Var.c = si1Var5.W;
                                    iw0Var.d = i22222222222222222222222222;
                                    iw0Var.m = singletonList;
                                    iw0Var.h = str;
                                    iw0Var.n = si1Var5.l;
                                    jw0 jw0Var222222222222222222222222 = new jw0(iw0Var);
                                    c83 a2222222222222222222222222 = wp0Var.a(si1Var5.c, i5);
                                    si1Var5.X = a2222222222222222222222222;
                                    a2222222222222222222222222.a(jw0Var222222222222222222222222);
                                    this.c.put(si1Var5.c, si1Var5);
                                    si1Var = null;
                                    break;
                                } else if (i38 != 16) {
                                    gh1.d("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + si1Var5.P + ". Setting mimeType to audio/x-unknown");
                                    singletonList = null;
                                    str = null;
                                    str5 = "audio/x-unknown";
                                    i3 = -1;
                                    i2 = 3;
                                    b = -1;
                                    bArr = si1Var5.N;
                                    if (bArr != null) {
                                    }
                                    int i222222222222222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                    iw0Var = new iw0();
                                    if ("audio".equals(vt1.c(str5))) {
                                    }
                                    str3 = si1Var5.a;
                                    if (str3 != null) {
                                    }
                                    iw0Var.a = Integer.toString(i21);
                                    iw0Var.k = str5;
                                    iw0Var.l = i3;
                                    iw0Var.c = si1Var5.W;
                                    iw0Var.d = i222222222222222222222222222;
                                    iw0Var.m = singletonList;
                                    iw0Var.h = str;
                                    iw0Var.n = si1Var5.l;
                                    jw0 jw0Var2222222222222222222222222 = new jw0(iw0Var);
                                    c83 a22222222222222222222222222 = wp0Var.a(si1Var5.c, i5);
                                    si1Var5.X = a22222222222222222222222222;
                                    a22222222222222222222222222.a(jw0Var2222222222222222222222222);
                                    this.c.put(si1Var5.c, si1Var5);
                                    si1Var = null;
                                } else {
                                    b = 268435456;
                                    singletonList = null;
                                    str = null;
                                    i3 = -1;
                                    i2 = 3;
                                    bArr = si1Var5.N;
                                    if (bArr != null) {
                                    }
                                    int i2222222222222222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                    iw0Var = new iw0();
                                    if ("audio".equals(vt1.c(str5))) {
                                    }
                                    str3 = si1Var5.a;
                                    if (str3 != null) {
                                    }
                                    iw0Var.a = Integer.toString(i21);
                                    iw0Var.k = str5;
                                    iw0Var.l = i3;
                                    iw0Var.c = si1Var5.W;
                                    iw0Var.d = i2222222222222222222222222222;
                                    iw0Var.m = singletonList;
                                    iw0Var.h = str;
                                    iw0Var.n = si1Var5.l;
                                    jw0 jw0Var22222222222222222222222222 = new jw0(iw0Var);
                                    c83 a222222222222222222222222222 = wp0Var.a(si1Var5.c, i5);
                                    si1Var5.X = a222222222222222222222222222;
                                    a222222222222222222222222222.a(jw0Var22222222222222222222222222);
                                    this.c.put(si1Var5.c, si1Var5);
                                    si1Var = null;
                                }
                                break;
                            case 24:
                                b = sb3.b(si1Var5.P);
                                if (b == 0) {
                                    gh1.d("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + si1Var5.P + ". Setting mimeType to audio/x-unknown");
                                    singletonList = null;
                                    str = null;
                                    str5 = "audio/x-unknown";
                                    i3 = -1;
                                    i2 = 3;
                                    b = -1;
                                    bArr = si1Var5.N;
                                    if (bArr != null) {
                                    }
                                    int i22222222222222222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                    iw0Var = new iw0();
                                    if ("audio".equals(vt1.c(str5))) {
                                    }
                                    str3 = si1Var5.a;
                                    if (str3 != null) {
                                    }
                                    iw0Var.a = Integer.toString(i21);
                                    iw0Var.k = str5;
                                    iw0Var.l = i3;
                                    iw0Var.c = si1Var5.W;
                                    iw0Var.d = i22222222222222222222222222222;
                                    iw0Var.m = singletonList;
                                    iw0Var.h = str;
                                    iw0Var.n = si1Var5.l;
                                    jw0 jw0Var222222222222222222222222222 = new jw0(iw0Var);
                                    c83 a2222222222222222222222222222 = wp0Var.a(si1Var5.c, i5);
                                    si1Var5.X = a2222222222222222222222222222;
                                    a2222222222222222222222222222.a(jw0Var222222222222222222222222222);
                                    this.c.put(si1Var5.c, si1Var5);
                                    si1Var = null;
                                    break;
                                }
                                singletonList = null;
                                str = null;
                                i3 = -1;
                                i2 = 3;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i222222222222222222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i222222222222222222222222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var2222222222222222222222222222 = new jw0(iw0Var);
                                c83 a22222222222222222222222222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a22222222222222222222222222222;
                                a22222222222222222222222222222.a(jw0Var2222222222222222222222222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case 25:
                                list = l41.a(d0, si1Var5.a(str4));
                                str5 = "text/x-ssa";
                                singletonList = list;
                                str = null;
                                i3 = -1;
                                i2 = 3;
                                b = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i2222222222222222222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i2222222222222222222222222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var22222222222222222222222222222 = new jw0(iw0Var);
                                c83 a222222222222222222222222222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a222222222222222222222222222222;
                                a222222222222222222222222222222.a(jw0Var22222222222222222222222222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case 26:
                                a01 a7 = a01.a(new xb2(si1Var5.a(str4)));
                                singletonList = a7.a;
                                si1Var5.Y = a7.b;
                                str2 = a7.d;
                                str5 = "video/hevc";
                                str = str2;
                                i3 = -1;
                                i2 = 3;
                                b = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i22222222222222222222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i22222222222222222222222222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var222222222222222222222222222222 = new jw0(iw0Var);
                                c83 a2222222222222222222222222222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a2222222222222222222222222222222;
                                a2222222222222222222222222222222.a(jw0Var222222222222222222222222222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case 27:
                                str5 = "text/vtt";
                                singletonList = null;
                                str = null;
                                i3 = -1;
                                i2 = 3;
                                b = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i222222222222222222222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i222222222222222222222222222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var2222222222222222222222222222222 = new jw0(iw0Var);
                                c83 a22222222222222222222222222222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a22222222222222222222222222222222;
                                a22222222222222222222222222222222.a(jw0Var2222222222222222222222222222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case 28:
                                str5 = "application/x-subrip";
                                singletonList = null;
                                str = null;
                                i3 = -1;
                                i2 = 3;
                                b = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i2222222222222222222222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i2222222222222222222222222222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var22222222222222222222222222222222 = new jw0(iw0Var);
                                c83 a222222222222222222222222222222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a222222222222222222222222222222222;
                                a222222222222222222222222222222222.a(jw0Var22222222222222222222222222222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case 29:
                                str5 = "video/mpeg2";
                                singletonList = null;
                                str = null;
                                i3 = -1;
                                i2 = 3;
                                b = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i22222222222222222222222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i22222222222222222222222222222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var222222222222222222222222222222222 = new jw0(iw0Var);
                                c83 a2222222222222222222222222222222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a2222222222222222222222222222222222;
                                a2222222222222222222222222222222222.a(jw0Var222222222222222222222222222222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case 30:
                                str5 = "audio/eac3";
                                singletonList = null;
                                str = null;
                                i3 = -1;
                                i2 = 3;
                                b = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i222222222222222222222222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i222222222222222222222222222222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var2222222222222222222222222222222222 = new jw0(iw0Var);
                                c83 a22222222222222222222222222222222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a22222222222222222222222222222222222;
                                a22222222222222222222222222222222222.a(jw0Var2222222222222222222222222222222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case 31:
                                list = Collections.singletonList(si1Var5.a(str4));
                                str5 = "audio/flac";
                                singletonList = list;
                                str = null;
                                i3 = -1;
                                i2 = 3;
                                b = -1;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i2222222222222222222222222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i2222222222222222222222222222222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var22222222222222222222222222222222222 = new jw0(iw0Var);
                                c83 a222222222222222222222222222222222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a222222222222222222222222222222222222;
                                a222222222222222222222222222222222222.a(jw0Var22222222222222222222222222222222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            case ' ':
                                arrayList = new ArrayList(3);
                                arrayList.add(si1Var5.a(si1Var5.b));
                                ByteBuffer allocate = ByteBuffer.allocate(8);
                                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                arrayList.add(allocate.order(byteOrder).putLong(si1Var5.R).array());
                                arrayList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(si1Var5.S).array());
                                str5 = "audio/opus";
                                i4 = 5760;
                                str = null;
                                i2 = 3;
                                b = -1;
                                int i362 = i4;
                                singletonList = arrayList;
                                i3 = i362;
                                bArr = si1Var5.N;
                                if (bArr != null) {
                                }
                                int i22222222222222222222222222222222222222 = (si1Var5.V ? 1 : 0) | (si1Var5.U ? 2 : 0);
                                iw0Var = new iw0();
                                if ("audio".equals(vt1.c(str5))) {
                                }
                                str3 = si1Var5.a;
                                if (str3 != null) {
                                }
                                iw0Var.a = Integer.toString(i21);
                                iw0Var.k = str5;
                                iw0Var.l = i3;
                                iw0Var.c = si1Var5.W;
                                iw0Var.d = i22222222222222222222222222222222222222;
                                iw0Var.m = singletonList;
                                iw0Var.h = str;
                                iw0Var.n = si1Var5.l;
                                jw0 jw0Var222222222222222222222222222222222222 = new jw0(iw0Var);
                                c83 a2222222222222222222222222222222222222 = wp0Var.a(si1Var5.c, i5);
                                si1Var5.X = a2222222222222222222222222222222222222;
                                a2222222222222222222222222222222222222.a(jw0Var222222222222222222222222222222222222);
                                this.c.put(si1Var5.c, si1Var5);
                                si1Var = null;
                                break;
                            default:
                                throw new cc2("Unrecognized codec identifier.", null, true, 1);
                        }
                    default:
                        si1Var = null;
                        break;
                }
                this.u = si1Var;
                return;
            }
            throw new cc2("CodecId is missing in TrackEntry element", null, true, 1);
        }
        throw new IllegalStateException();
    }

    @Override // yads.tp0
    public final void a(wp0 wp0Var) {
        this.b0 = wp0Var;
    }

    @Override // yads.tp0
    public final void a(long j, long j2) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.a.a();
        gc3 gc3Var = this.b;
        gc3Var.b = 0;
        gc3Var.c = 0;
        b();
        for (int i = 0; i < this.c.size(); i++) {
            o93 o93Var = ((si1) this.c.valueAt(i)).T;
            if (o93Var != null) {
                o93Var.b = false;
                o93Var.c = 0;
            }
        }
    }

    @Override // yads.tp0
    public final int a(up0 up0Var, dg2 dg2Var) {
        this.F = false;
        boolean z = true;
        while (z && !this.F) {
            pd0 pd0Var = (pd0) up0Var;
            z = this.a.a(pd0Var);
            if (z) {
                long j = pd0Var.d;
                if (this.y) {
                    this.A = j;
                    dg2Var.a = this.z;
                    this.y = false;
                } else if (this.v) {
                    long j2 = this.A;
                    if (j2 != -1) {
                        dg2Var.a = j2;
                        this.A = -1L;
                    }
                } else {
                    continue;
                }
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.c.size(); i++) {
            si1 si1Var = (si1) this.c.valueAt(i);
            si1Var.X.getClass();
            o93 o93Var = si1Var.T;
            if (o93Var != null) {
                c83 c83Var = si1Var.X;
                b83 b83Var = si1Var.j;
                if (o93Var.c > 0) {
                    c83Var.a(o93Var.d, o93Var.e, o93Var.f, o93Var.g, b83Var);
                    o93Var.c = 0;
                }
            }
        }
        return -1;
    }

    public final void a(int i) {
        if (this.u != null) {
            return;
        }
        throw new cc2("Element " + i + " must be in a TrackEntry", null, true, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(si1 si1Var, long j, int i, int i2, int i3) {
        byte[] a;
        int i4;
        int i5;
        o93 o93Var = si1Var.T;
        if (o93Var != null) {
            o93Var.a(si1Var.X, j, i, i2, i3, si1Var.j);
        } else {
            if ("S_TEXT/UTF8".equals(si1Var.b) || "S_TEXT/ASS".equals(si1Var.b) || "S_TEXT/WEBVTT".equals(si1Var.b)) {
                if (this.K > 1) {
                    gh1.d("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.I;
                    if (j2 == -9223372036854775807L) {
                        gh1.d("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = si1Var.b;
                        byte[] bArr = this.k.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                                a = a("%01d:%02d:%02d:%02d", j2, 10000L);
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                a = a("%02d:%02d:%02d.%03d", j2, 1000L);
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                a = a("%02d:%02d:%02d,%03d", j2, 1000L);
                                i4 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(a, 0, bArr, i4, a.length);
                        int i6 = this.k.b;
                        while (true) {
                            xb2 xb2Var = this.k;
                            if (i6 < xb2Var.c) {
                                if (xb2Var.a[i6] == 0) {
                                    xb2Var.d(i6);
                                } else {
                                    i6++;
                                }
                            }
                        }
                        c83 c83Var = si1Var.X;
                        xb2 xb2Var2 = this.k;
                        c83Var.a(xb2Var2.c, xb2Var2);
                        i5 = i2 + this.k.c;
                        if ((i & 268435456) != 0) {
                            if (this.K > 1) {
                                this.n.c(0);
                            } else {
                                xb2 xb2Var3 = this.n;
                                int i7 = xb2Var3.c;
                                si1Var.X.a(i7, xb2Var3);
                                i5 += i7;
                            }
                        }
                        si1Var.X.a(j, i, i5, i3, si1Var.j);
                    }
                }
            }
            i5 = i2;
            if ((i & 268435456) != 0) {
            }
            si1Var.X.a(j, i, i5, i3, si1Var.j);
        }
        this.F = true;
    }

    public final void a(pd0 pd0Var, int i) {
        xb2 xb2Var = this.g;
        if (xb2Var.c >= i) {
            return;
        }
        byte[] bArr = xb2Var.a;
        if (bArr.length < i) {
            xb2Var.a(Math.max(bArr.length * 2, i));
        }
        xb2 xb2Var2 = this.g;
        byte[] bArr2 = xb2Var2.a;
        int i2 = xb2Var2.c;
        pd0Var.a(bArr2, i2, i - i2, false);
        this.g.d(i);
    }

    public final int a(pd0 pd0Var, si1 si1Var, int i, boolean z) {
        int a;
        int a2;
        int i2;
        if ("S_TEXT/UTF8".equals(si1Var.b)) {
            a(pd0Var, c0, i);
            int i3 = this.T;
            b();
            return i3;
        }
        if ("S_TEXT/ASS".equals(si1Var.b)) {
            a(pd0Var, e0, i);
            int i4 = this.T;
            b();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(si1Var.b)) {
            a(pd0Var, f0, i);
            int i5 = this.T;
            b();
            return i5;
        }
        c83 c83Var = si1Var.X;
        if (!this.V) {
            if (si1Var.h) {
                this.O &= -1073741825;
                if (!this.W) {
                    pd0Var.a(this.g.a, 0, 1, false);
                    this.S++;
                    byte b = this.g.a[0];
                    if ((b & 128) != 128) {
                        this.Z = b;
                        this.W = true;
                    } else {
                        throw new cc2("Extension bit is set in signal byte", null, true, 1);
                    }
                }
                byte b2 = this.Z;
                if ((b2 & 1) == 1) {
                    boolean z2 = (b2 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.a0) {
                        pd0Var.a(this.l.a, 0, 8, false);
                        this.S += 8;
                        this.a0 = true;
                        xb2 xb2Var = this.g;
                        xb2Var.a[0] = (byte) ((z2 ? 128 : 0) | 8);
                        xb2Var.e(0);
                        c83Var.a(1, this.g);
                        this.T++;
                        this.l.e(0);
                        c83Var.a(8, this.l);
                        this.T += 8;
                    }
                    if (z2) {
                        if (!this.X) {
                            pd0Var.a(this.g.a, 0, 1, false);
                            this.S++;
                            this.g.e(0);
                            this.Y = this.g.k();
                            this.X = true;
                        }
                        int i6 = this.Y * 4;
                        this.g.c(i6);
                        pd0Var.a(this.g.a, 0, i6, false);
                        this.S += i6;
                        short s = (short) ((this.Y / 2) + 1);
                        int i7 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.o;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.o = ByteBuffer.allocate(i7);
                        }
                        this.o.position(0);
                        this.o.putShort(s);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.Y;
                            if (i8 >= i2) {
                                break;
                            }
                            int n = this.g.n();
                            if (i8 % 2 == 0) {
                                this.o.putShort((short) (n - i9));
                            } else {
                                this.o.putInt(n - i9);
                            }
                            i8++;
                            i9 = n;
                        }
                        int i10 = (i - this.S) - i9;
                        if (i2 % 2 == 1) {
                            this.o.putInt(i10);
                        } else {
                            this.o.putShort((short) i10);
                            this.o.putInt(0);
                        }
                        xb2 xb2Var2 = this.m;
                        xb2Var2.a = this.o.array();
                        xb2Var2.c = i7;
                        xb2Var2.b = 0;
                        c83Var.a(i7, this.m);
                        this.T += i7;
                    }
                }
            } else {
                byte[] bArr = si1Var.i;
                if (bArr != null) {
                    xb2 xb2Var3 = this.j;
                    int length = bArr.length;
                    xb2Var3.a = bArr;
                    xb2Var3.c = length;
                    xb2Var3.b = 0;
                }
            }
            if (!"A_OPUS".equals(si1Var.b)) {
                z = si1Var.f > 0;
            }
            if (z) {
                this.O |= 268435456;
                this.n.c(0);
                int i11 = (this.j.c + i) - this.S;
                this.g.c(4);
                xb2 xb2Var4 = this.g;
                byte[] bArr2 = xb2Var4.a;
                bArr2[0] = (byte) ((i11 >> 24) & 255);
                bArr2[1] = (byte) ((i11 >> 16) & 255);
                bArr2[2] = (byte) ((i11 >> 8) & 255);
                bArr2[3] = (byte) (i11 & 255);
                c83Var.a(4, xb2Var4);
                this.T += 4;
            }
            this.V = true;
        }
        int i12 = i + this.j.c;
        if (!"V_MPEG4/ISO/AVC".equals(si1Var.b) && !"V_MPEGH/ISO/HEVC".equals(si1Var.b)) {
            o93 o93Var = si1Var.T;
            if (o93Var != null) {
                if (this.j.c == 0) {
                    o93Var.a(pd0Var);
                } else {
                    throw new IllegalStateException();
                }
            }
            while (true) {
                int i13 = this.S;
                if (i13 >= i12) {
                    break;
                }
                int i14 = i12 - i13;
                xb2 xb2Var5 = this.j;
                int i15 = xb2Var5.c - xb2Var5.b;
                if (i15 > 0) {
                    a2 = Math.min(i14, i15);
                    c83Var.a(a2, this.j);
                } else {
                    a2 = c83Var.a(pd0Var, i14, false);
                }
                this.S += a2;
                this.T += a2;
            }
        } else {
            byte[] bArr3 = this.f.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i16 = si1Var.Y;
            int i17 = 4 - i16;
            while (this.S < i12) {
                int i18 = this.U;
                if (i18 == 0) {
                    xb2 xb2Var6 = this.j;
                    int min = Math.min(i16, xb2Var6.c - xb2Var6.b);
                    pd0Var.a(bArr3, i17 + min, i16 - min, false);
                    if (min > 0) {
                        this.j.a(bArr3, i17, min);
                    }
                    this.S += i16;
                    this.f.e(0);
                    this.U = this.f.n();
                    this.e.e(0);
                    c83Var.a(4, this.e);
                    this.T += 4;
                } else {
                    xb2 xb2Var7 = this.j;
                    int i19 = xb2Var7.c - xb2Var7.b;
                    if (i19 > 0) {
                        a = Math.min(i18, i19);
                        c83Var.a(a, this.j);
                    } else {
                        a = c83Var.a(pd0Var, i18, false);
                    }
                    this.S += a;
                    this.T += a;
                    this.U -= a;
                }
            }
        }
        if ("A_VORBIS".equals(si1Var.b)) {
            this.h.e(0);
            c83Var.a(4, this.h);
            this.T += 4;
        }
        int i20 = this.T;
        b();
        return i20;
    }

    public final void a(pd0 pd0Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        xb2 xb2Var = this.k;
        byte[] bArr2 = xb2Var.a;
        if (bArr2.length < length) {
            xb2Var.a(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        pd0Var.a(this.k.a, bArr.length, i, false);
        this.k.e(0);
        this.k.d(length);
    }

    public static byte[] a(String str, long j, long j2) {
        if (j != -9223372036854775807L) {
            int i = (int) (j / 3600000000L);
            long j3 = j - (i * 3600000000L);
            int i2 = (int) (j3 / 60000000);
            long j4 = j3 - (i2 * 60000000);
            int i3 = (int) (j4 / 1000000);
            return sb3.c(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
        }
        throw new IllegalArgumentException();
    }

    public final long a(long j) {
        long j2 = this.r;
        if (j2 != -9223372036854775807L) {
            return sb3.a(j, j2, 1000L);
        }
        throw new cc2("Can't scale timecode prior to timecodeScale being set.", null, true, 1);
    }
}
