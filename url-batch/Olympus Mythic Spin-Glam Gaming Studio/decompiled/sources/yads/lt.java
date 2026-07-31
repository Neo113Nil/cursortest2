package yads;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class lt extends ot {
    public final xb2 g = new xb2();
    public final wb2 h = new wb2();
    public int i = -1;
    public final int j;
    public final jt[] k;
    public jt l;
    public List m;
    public List n;
    public kt o;
    public int p;

    public lt(int i, List list) {
        this.j = i == -1 ? 1 : i;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b = ((byte[]) list.get(0))[0];
        }
        this.k = new jt[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.k[i2] = new jt();
        }
        this.l = this.k[0];
    }

    @Override // yads.ot
    public final void a(mt mtVar) {
        ByteBuffer byteBuffer = mtVar.d;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        xb2 xb2Var = this.g;
        int limit = byteBuffer.limit();
        xb2Var.a = array;
        xb2Var.c = limit;
        xb2Var.b = 0;
        while (true) {
            xb2 xb2Var2 = this.g;
            if (xb2Var2.c - xb2Var2.b < 3) {
                return;
            }
            int k = xb2Var2.k();
            int i = k & 3;
            boolean z = (k & 4) == 4;
            byte k2 = (byte) this.g.k();
            byte k3 = (byte) this.g.k();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        g();
                        int i2 = (k2 & 192) >> 6;
                        int i3 = this.i;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            for (int i4 = 0; i4 < 8; i4++) {
                                this.k[i4].b();
                            }
                            gh1.d("Cea708Decoder", "Sequence number discontinuity. previous=" + this.i + " current=" + i2);
                        }
                        this.i = i2;
                        int i5 = k2 & 63;
                        if (i5 == 0) {
                            i5 = 64;
                        }
                        kt ktVar = new kt(i2, i5);
                        this.o = ktVar;
                        byte[] bArr = ktVar.c;
                        ktVar.d = 1;
                        bArr[0] = k3;
                    } else {
                        if (i != 2) {
                            throw new IllegalArgumentException();
                        }
                        kt ktVar2 = this.o;
                        if (ktVar2 == null) {
                            gh1.b("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = ktVar2.c;
                            int i6 = ktVar2.d;
                            int i7 = i6 + 1;
                            ktVar2.d = i7;
                            bArr2[i6] = k2;
                            ktVar2.d = i6 + 2;
                            bArr2[i7] = k3;
                        }
                    }
                    kt ktVar3 = this.o;
                    if (ktVar3.d == (ktVar3.b * 2) - 1) {
                        g();
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // yads.ot
    public final pt c() {
        List list = this.m;
        this.n = list;
        list.getClass();
        return new pt(list);
    }

    @Override // yads.ot
    public final boolean f() {
        return this.m != this.n;
    }

    @Override // yads.ot, yads.bb0
    public final void flush() {
        super.flush();
        this.m = null;
        this.n = null;
        this.p = 0;
        this.l = this.k[0];
        for (int i = 0; i < 8; i++) {
            this.k[i].b();
        }
        this.o = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void g() {
        boolean z;
        int i;
        char c;
        kt ktVar = this.o;
        if (ktVar == null) {
            return;
        }
        int i2 = 2;
        boolean z2 = true;
        if (ktVar.d != (ktVar.b * 2) - 1) {
            gh1.a("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.o.b * 2) - 1) + ", but current index is " + this.o.d + " (sequence number " + this.o.a + ");");
        }
        wb2 wb2Var = this.h;
        kt ktVar2 = this.o;
        wb2Var.b(ktVar2.c, ktVar2.d);
        boolean z3 = false;
        while (true) {
            if (this.h.b() > 0) {
                int i3 = 3;
                int a = this.h.a(3);
                int a2 = this.h.a(5);
                int i4 = 7;
                if (a == 7) {
                    this.h.c(i2);
                    a = this.h.a(6);
                    if (a < 7) {
                        mf1.a(a, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (a2 == 0) {
                    if (a != 0) {
                        gh1.d("Cea708Decoder", "serviceNumber is non-zero (" + a + ") when blockSize is 0");
                    }
                } else if (a != this.j) {
                    this.h.d(a2);
                } else {
                    int d = (a2 * 8) + this.h.d();
                    while (this.h.d() < d) {
                        int a3 = this.h.a(8);
                        if (a3 != 16) {
                            if (a3 <= 31) {
                                if (a3 != 0) {
                                    if (a3 == i3) {
                                        this.m = h();
                                    } else if (a3 != 8) {
                                        switch (a3) {
                                            case 12:
                                                for (int i5 = 0; i5 < 8; i5++) {
                                                    this.k[i5].b();
                                                }
                                                break;
                                            case 13:
                                                this.l.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (a3 < 17 || a3 > 23) {
                                                    if (a3 < 24 || a3 > 31) {
                                                        mf1.a(a3, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    } else {
                                                        mf1.a(a3, "Currently unsupported COMMAND_P16 Command: ", "Cea708Decoder");
                                                        this.h.c(16);
                                                        break;
                                                    }
                                                } else {
                                                    mf1.a(a3, "Currently unsupported COMMAND_EXT1 Command: ", "Cea708Decoder");
                                                    this.h.c(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        jt jtVar = this.l;
                                        int length = jtVar.b.length();
                                        if (length > 0) {
                                            jtVar.b.delete(length - 1, length);
                                        }
                                    }
                                }
                                i = i2;
                                z = true;
                            } else {
                                if (a3 > 127) {
                                    if (a3 <= 159) {
                                        switch (a3) {
                                            case 128:
                                            case 129:
                                            case 130:
                                            case MRAID_JS_WRITE_FAILED_VALUE:
                                            case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                            case OMSDK_JS_WRITE_FAILED_VALUE:
                                            case 134:
                                            case 135:
                                                z = true;
                                                int i6 = a3 - 128;
                                                if (this.p != i6) {
                                                    this.p = i6;
                                                    this.l = this.k[i6];
                                                    break;
                                                }
                                                break;
                                            case 136:
                                                z = true;
                                                for (int i7 = 1; i7 <= 8; i7++) {
                                                    if (this.h.e()) {
                                                        jt jtVar2 = this.k[8 - i7];
                                                        jtVar2.a.clear();
                                                        jtVar2.b.clear();
                                                        jtVar2.p = -1;
                                                        jtVar2.q = -1;
                                                        jtVar2.r = -1;
                                                        jtVar2.t = -1;
                                                        jtVar2.v = 0;
                                                    }
                                                }
                                                break;
                                            case TPAT_RETRY_FAILED_VALUE:
                                                for (int i8 = 1; i8 <= 8; i8++) {
                                                    if (this.h.e()) {
                                                        this.k[8 - i8].d = true;
                                                    }
                                                }
                                                z = true;
                                                i = 2;
                                                i4 = 7;
                                                break;
                                            case 138:
                                                for (int i9 = 1; i9 <= 8; i9++) {
                                                    if (this.h.e()) {
                                                        this.k[8 - i9].d = false;
                                                    }
                                                }
                                                z = true;
                                                i = 2;
                                                i4 = 7;
                                                break;
                                            case 139:
                                                for (int i10 = 1; i10 <= 8; i10++) {
                                                    if (this.h.e()) {
                                                        this.k[8 - i10].d = !r1.d;
                                                    }
                                                }
                                                z = true;
                                                i = 2;
                                                i4 = 7;
                                                break;
                                            case 140:
                                                for (int i11 = 1; i11 <= 8; i11++) {
                                                    if (this.h.e()) {
                                                        this.k[8 - i11].b();
                                                    }
                                                }
                                                z = true;
                                                i = 2;
                                                i4 = 7;
                                                break;
                                            case ModuleDescriptor.MODULE_VERSION /* 141 */:
                                                this.h.c(8);
                                                z = true;
                                                i = 2;
                                                i4 = 7;
                                                break;
                                            case 142:
                                                break;
                                            case 143:
                                                for (int i12 = 0; i12 < 8; i12++) {
                                                    this.k[i12].b();
                                                }
                                                z = true;
                                                i = 2;
                                                i4 = 7;
                                                break;
                                            case 144:
                                                if (!this.l.c) {
                                                    this.h.c(16);
                                                    z = true;
                                                    i = 2;
                                                    i3 = 3;
                                                    i4 = 7;
                                                    break;
                                                } else {
                                                    this.h.a(4);
                                                    this.h.a(2);
                                                    this.h.a(2);
                                                    boolean e = this.h.e();
                                                    boolean e2 = this.h.e();
                                                    i3 = 3;
                                                    this.h.a(3);
                                                    this.h.a(3);
                                                    this.l.a(e, e2);
                                                    z = true;
                                                    i = 2;
                                                    i4 = 7;
                                                }
                                            case 145:
                                                if (this.l.c) {
                                                    int a4 = jt.a(this.h.a(2), this.h.a(2), this.h.a(2), this.h.a(2));
                                                    int a5 = jt.a(this.h.a(2), this.h.a(2), this.h.a(2), this.h.a(2));
                                                    this.h.c(2);
                                                    jt.a(this.h.a(2), this.h.a(2), this.h.a(2), 0);
                                                    this.l.a(a4, a5);
                                                } else {
                                                    this.h.c(24);
                                                }
                                                z = true;
                                                i = 2;
                                                i3 = 3;
                                                i4 = 7;
                                                break;
                                            case 146:
                                                if (this.l.c) {
                                                    this.h.c(4);
                                                    int a6 = this.h.a(4);
                                                    this.h.c(2);
                                                    this.h.a(6);
                                                    jt jtVar3 = this.l;
                                                    if (jtVar3.v != a6) {
                                                        jtVar3.a('\n');
                                                    }
                                                    jtVar3.v = a6;
                                                } else {
                                                    this.h.c(16);
                                                }
                                                z = true;
                                                i = 2;
                                                i3 = 3;
                                                i4 = 7;
                                                break;
                                            case 147:
                                            case 148:
                                            case 149:
                                            case 150:
                                            default:
                                                mf1.a(a3, "Invalid C1 command: ", "Cea708Decoder");
                                                break;
                                            case 151:
                                                if (this.l.c) {
                                                    int a7 = jt.a(this.h.a(2), this.h.a(2), this.h.a(2), this.h.a(2));
                                                    this.h.a(2);
                                                    jt.a(this.h.a(2), this.h.a(2), this.h.a(2), 0);
                                                    this.h.e();
                                                    this.h.e();
                                                    this.h.a(2);
                                                    this.h.a(2);
                                                    int a8 = this.h.a(2);
                                                    this.h.c(8);
                                                    jt jtVar4 = this.l;
                                                    jtVar4.o = a7;
                                                    jtVar4.l = a8;
                                                } else {
                                                    this.h.c(32);
                                                }
                                                z = true;
                                                i = 2;
                                                i3 = 3;
                                                i4 = 7;
                                                break;
                                            case 152:
                                            case 153:
                                            case 154:
                                            case 155:
                                            case 156:
                                            case 157:
                                            case 158:
                                            case 159:
                                                int i13 = a3 - 152;
                                                jt jtVar5 = this.k[i13];
                                                this.h.c(i2);
                                                boolean e3 = this.h.e();
                                                boolean e4 = this.h.e();
                                                this.h.e();
                                                int a9 = this.h.a(i3);
                                                boolean e5 = this.h.e();
                                                int a10 = this.h.a(i4);
                                                int a11 = this.h.a(8);
                                                int a12 = this.h.a(4);
                                                int a13 = this.h.a(4);
                                                this.h.c(i2);
                                                this.h.a(6);
                                                this.h.c(i2);
                                                int a14 = this.h.a(3);
                                                int a15 = this.h.a(3);
                                                jtVar5.c = true;
                                                jtVar5.d = e3;
                                                jtVar5.k = e4;
                                                jtVar5.e = a9;
                                                jtVar5.f = e5;
                                                jtVar5.g = a10;
                                                jtVar5.h = a11;
                                                jtVar5.i = a12;
                                                int i14 = a13 + 1;
                                                if (jtVar5.j != i14) {
                                                    jtVar5.j = i14;
                                                    while (true) {
                                                        if ((e4 && jtVar5.a.size() >= jtVar5.j) || jtVar5.a.size() >= 15) {
                                                            jtVar5.a.remove(0);
                                                        }
                                                    }
                                                }
                                                if (a14 != 0 && jtVar5.m != a14) {
                                                    jtVar5.m = a14;
                                                    int i15 = a14 - 1;
                                                    int i16 = jt.C[i15];
                                                    boolean z4 = jt.B[i15];
                                                    int i17 = jt.z[i15];
                                                    int i18 = jt.A[i15];
                                                    int i19 = jt.y[i15];
                                                    jtVar5.o = i16;
                                                    jtVar5.l = i19;
                                                }
                                                if (a15 != 0 && jtVar5.n != a15) {
                                                    jtVar5.n = a15;
                                                    int i20 = a15 - 1;
                                                    int i21 = jt.E[i20];
                                                    int i22 = jt.D[i20];
                                                    jtVar5.a(false, false);
                                                    jtVar5.a(jt.w, jt.F[i20]);
                                                }
                                                if (this.p != i13) {
                                                    this.p = i13;
                                                    this.l = this.k[i13];
                                                }
                                                z = true;
                                                i = 2;
                                                i3 = 3;
                                                i4 = 7;
                                                break;
                                        }
                                        c = 6;
                                        z3 = z;
                                        i2 = i;
                                        z2 = z3;
                                    } else {
                                        z = true;
                                        if (a3 <= 255) {
                                            this.l.a((char) (a3 & 255));
                                        } else {
                                            mf1.a(a3, "Invalid base command: ", "Cea708Decoder");
                                            i = 2;
                                            i4 = 7;
                                        }
                                    }
                                    i = 2;
                                    i4 = 7;
                                    c = 6;
                                    z3 = z;
                                    i2 = i;
                                    z2 = z3;
                                } else if (a3 == 127) {
                                    this.l.a((char) 9835);
                                } else {
                                    this.l.a((char) (a3 & 255));
                                }
                                i = i2;
                                z = true;
                                c = 6;
                                z3 = z;
                                i2 = i;
                                z2 = z3;
                            }
                            c = 6;
                            int i23 = i;
                            z2 = z;
                            i2 = i23;
                        } else {
                            z = true;
                            int a16 = this.h.a(8);
                            if (a16 <= 31) {
                                i4 = 7;
                                if (a16 > 7) {
                                    if (a16 <= 15) {
                                        this.h.c(8);
                                    } else if (a16 <= 23) {
                                        this.h.c(16);
                                    } else if (a16 <= 31) {
                                        this.h.c(24);
                                    }
                                }
                            } else {
                                i4 = 7;
                                if (a16 <= 127) {
                                    if (a16 == 32) {
                                        this.l.a(' ');
                                    } else if (a16 == 33) {
                                        this.l.a((char) 160);
                                    } else if (a16 == 37) {
                                        this.l.a((char) 8230);
                                    } else if (a16 == 42) {
                                        this.l.a((char) 352);
                                    } else if (a16 == 44) {
                                        this.l.a((char) 338);
                                    } else if (a16 == 63) {
                                        this.l.a((char) 376);
                                    } else if (a16 == 57) {
                                        this.l.a((char) 8482);
                                    } else if (a16 == 58) {
                                        this.l.a((char) 353);
                                    } else if (a16 == 60) {
                                        this.l.a((char) 339);
                                    } else if (a16 != 61) {
                                        switch (a16) {
                                            case 48:
                                                this.l.a((char) 9608);
                                                break;
                                            case 49:
                                                this.l.a((char) 8216);
                                                break;
                                            case 50:
                                                this.l.a((char) 8217);
                                                break;
                                            case 51:
                                                this.l.a((char) 8220);
                                                break;
                                            case 52:
                                                this.l.a((char) 8221);
                                                break;
                                            case 53:
                                                this.l.a((char) 8226);
                                                break;
                                            default:
                                                switch (a16) {
                                                    case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                                        this.l.a((char) 8539);
                                                        break;
                                                    case JSON_ENCODE_ERROR_VALUE:
                                                        this.l.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.l.a((char) 8541);
                                                        break;
                                                    case TPAT_ERROR_VALUE:
                                                        this.l.a((char) 8542);
                                                        break;
                                                    case INVALID_ADS_ENDPOINT_VALUE:
                                                        this.l.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.l.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.l.a((char) 9492);
                                                        break;
                                                    case INVALID_METRICS_ENDPOINT_VALUE:
                                                        this.l.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.l.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.l.a((char) 9484);
                                                        break;
                                                    default:
                                                        mf1.a(a16, "Invalid G2 character: ", "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.l.a((char) 8480);
                                    }
                                    i = 2;
                                    c = 6;
                                    z3 = z;
                                    i2 = i;
                                    z2 = z3;
                                } else {
                                    if (a16 > 159) {
                                        i = 2;
                                        c = 6;
                                        if (a16 <= 255) {
                                            if (a16 == 160) {
                                                this.l.a((char) 13252);
                                            } else {
                                                mf1.a(a16, "Invalid G3 character: ", "Cea708Decoder");
                                                this.l.a('_');
                                            }
                                            z3 = z;
                                            i2 = i;
                                            z2 = z3;
                                        } else {
                                            mf1.a(a16, "Invalid extended command: ", "Cea708Decoder");
                                        }
                                    } else if (a16 <= 135) {
                                        this.h.c(32);
                                    } else if (a16 <= 143) {
                                        this.h.c(40);
                                    } else if (a16 <= 159) {
                                        i = 2;
                                        this.h.c(2);
                                        c = 6;
                                        this.h.c(this.h.a(6) * 8);
                                    }
                                    int i232 = i;
                                    z2 = z;
                                    i2 = i232;
                                }
                            }
                            i = 2;
                            c = 6;
                            int i2322 = i;
                            z2 = z;
                            i2 = i2322;
                        }
                    }
                    z2 = z2;
                    i2 = i2;
                }
            }
        }
        if (z3) {
            this.m = h();
        }
        this.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List h() {
        ht htVar;
        Layout.Alignment alignment;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            jt jtVar = this.k[i];
            if (jtVar.c && (!jtVar.a.isEmpty() || jtVar.b.length() != 0)) {
                jt jtVar2 = this.k[i];
                if (jtVar2.d) {
                    if (!jtVar2.c || (jtVar2.a.isEmpty() && jtVar2.b.length() == 0)) {
                        htVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i2 = 0; i2 < jtVar2.a.size(); i2++) {
                            spannableStringBuilder.append((CharSequence) jtVar2.a.get(i2));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) jtVar2.a());
                        int i3 = jtVar2.l;
                        if (i3 != 0) {
                            if (i3 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i3 == 2) {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            } else if (i3 != 3) {
                                throw new IllegalArgumentException("Unexpected justification value: " + jtVar2.l);
                            }
                            if (jtVar2.f) {
                                f = jtVar2.h / 209.0f;
                                f2 = jtVar2.g / 74.0f;
                            } else {
                                f = jtVar2.h / 99.0f;
                                f2 = jtVar2.g / 99.0f;
                            }
                            float f3 = (f * 0.9f) + 0.05f;
                            float f4 = (f2 * 0.9f) + 0.05f;
                            int i4 = jtVar2.i;
                            int i5 = i4 / 3;
                            int i6 = i4 % 3;
                            htVar = new ht(spannableStringBuilder, alignment, f4, i5 != 0 ? 0 : i5 == 1 ? 1 : 2, f3, i6 != 0 ? 0 : i6 == 1 ? 1 : 2, jtVar2.o == jt.x, jtVar2.o, jtVar2.e);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        if (jtVar2.f) {
                        }
                        float f32 = (f * 0.9f) + 0.05f;
                        float f42 = (f2 * 0.9f) + 0.05f;
                        int i42 = jtVar2.i;
                        int i52 = i42 / 3;
                        int i62 = i42 % 3;
                        htVar = new ht(spannableStringBuilder, alignment, f42, i52 != 0 ? 0 : i52 == 1 ? 1 : 2, f32, i62 != 0 ? 0 : i62 == 1 ? 1 : 2, jtVar2.o == jt.x, jtVar2.o, jtVar2.e);
                    }
                    ht htVar2 = htVar;
                    if (htVar2 != null) {
                        arrayList.add(htVar2);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, ht.c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            arrayList2.add(((ht) arrayList.get(i7)).a);
        }
        return Collections.unmodifiableList(arrayList2);
    }
}
