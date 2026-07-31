package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes14.dex */
public final class d {
    public boolean L;
    public r O;
    public int P;
    public String a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public com.fyber.inneractive.sdk.player.exoplayer2.drm.d i;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = 0;
    public byte[] o = null;
    public int p = -1;
    public boolean q = false;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = 1000;
    public int v = 200;
    public float w = -1.0f;
    public float x = -1.0f;
    public float y = -1.0f;
    public float z = -1.0f;
    public float A = -1.0f;
    public float B = -1.0f;
    public float C = -1.0f;
    public float D = -1.0f;
    public float E = -1.0f;
    public float F = -1.0f;
    public int G = 1;
    public int H = -1;
    public int I = 8000;
    public long J = 0;
    public long K = 0;
    public boolean M = true;
    public String N = "eng";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03eb, code lost:
    
        if (r3.g() == r4.getLeastSignificantBits()) goto L220;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0444  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(j jVar, int i) {
        char c;
        int i2;
        List singletonList;
        String str;
        int a;
        List list;
        int i3;
        List list2;
        String str2;
        int i4;
        int i5;
        o oVar;
        int i6;
        com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar;
        byte[] bArr;
        int i7;
        String str3 = this.a;
        str3.getClass();
        String str4 = "video/x-unknown";
        String str5 = "audio/raw";
        int i8 = 2;
        switch (str3.hashCode()) {
            case -2095576542:
                if (str3.equals("V_MPEG4/ISO/AP")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str3.equals("V_MPEG4/ISO/SP")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str3.equals("A_MS/ACM")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str3.equals("A_TRUEHD")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str3.equals("A_VORBIS")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str3.equals("A_MPEG/L2")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str3.equals("A_MPEG/L3")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str3.equals("V_MS/VFW/FOURCC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str3.equals("S_DVBSUB")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str3.equals("V_MPEG4/ISO/ASP")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str3.equals("V_MPEG4/ISO/AVC")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str3.equals("S_VOBSUB")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str3.equals("A_DTS/LOSSLESS")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str3.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str3.equals("A_AC3")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str3.equals("A_DTS")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str3.equals("V_VP8")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str3.equals("V_VP9")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str3.equals("S_HDMV/PGS")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str3.equals("V_THEORA")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str3.equals("A_DTS/EXPRESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str3.equals("A_PCM/INT/LIT")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str3.equals("V_MPEGH/ISO/HEVC")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str3.equals("S_TEXT/UTF8")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str3.equals("V_MPEG2")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str3.equals("A_EAC3")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str3.equals("A_FLAC")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str3.equals("A_OPUS")) {
                    c = 27;
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
                byte[] bArr2 = this.h;
                singletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                str = "video/mp4v-es";
                i4 = -1;
                list = singletonList;
                i5 = i4;
                i3 = -1;
                int i9 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str))) {
                    oVar = o.a(Integer.toString(i), str, -1, i3, this.G, this.I, i5, -1, -1, list, this.i, i9, this.N, null);
                    i8 = 1;
                } else if ("video".equals(i.b(str))) {
                    if (this.n == 0) {
                        int i10 = this.l;
                        i6 = -1;
                        if (i10 == -1) {
                            i10 = this.j;
                        }
                        this.l = i10;
                        int i11 = this.m;
                        if (i11 == -1) {
                            i11 = this.k;
                        }
                        this.m = i11;
                    } else {
                        i6 = -1;
                    }
                    float f = (this.l == i6 || (i7 = this.m) == i6) ? -1.0f : (this.k * r1) / (this.j * i7);
                    if (this.q) {
                        if (this.w == -1.0f || this.x == -1.0f || this.y == -1.0f || this.z == -1.0f || this.A == -1.0f || this.B == -1.0f || this.C == -1.0f || this.D == -1.0f || this.E == -1.0f || this.F == -1.0f) {
                            bArr = null;
                        } else {
                            bArr = new byte[25];
                            ByteBuffer wrap = ByteBuffer.wrap(bArr);
                            wrap.put((byte) 0);
                            wrap.putShort((short) ((this.w * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.x * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.y * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.z * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.A * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.B * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.C * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.D * 50000.0f) + 0.5f));
                            wrap.putShort((short) (this.E + 0.5f));
                            wrap.putShort((short) (this.F + 0.5f));
                            wrap.putShort((short) this.u);
                            wrap.putShort((short) this.v);
                        }
                        cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.r, this.t, this.s, bArr);
                    } else {
                        cVar = null;
                    }
                    oVar = o.a(Integer.toString(i), str, i3, this.j, this.k, list, -1, f, this.o, this.p, cVar, this.i);
                } else {
                    if ("application/x-subrip".equals(str)) {
                        oVar = o.a(Integer.toString(i), str, i9, this.N, -1, this.i, Long.MAX_VALUE, Collections.emptyList());
                    } else {
                        if (!"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Unexpected MIME type.");
                        }
                        oVar = new o(Integer.toString(i), null, str, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.i, null);
                    }
                    i8 = i2;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2 = jVar.a(this.b, i8);
                this.O = a2;
                a2.a(oVar);
                return;
            case 2:
                i2 = 3;
                n nVar = new n(this.h);
                try {
                    int f2 = nVar.f();
                    if (f2 != 1) {
                        if (f2 == 65534) {
                            nVar.e(24);
                            long g = nVar.g();
                            UUID uuid = e.b0;
                            if (g == uuid.getMostSignificantBits()) {
                                break;
                            }
                        }
                        Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                        str4 = "audio/x-unknown";
                        singletonList = null;
                        a = -1;
                        str5 = str4;
                        i4 = a;
                        str = str5;
                        list = singletonList;
                        i5 = i4;
                        i3 = -1;
                        int i92 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                        if (!"audio".equals(i.b(str))) {
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a22 = jVar.a(this.b, i8);
                        this.O = a22;
                        a22.a(oVar);
                        return;
                    }
                    a = z.a(this.H);
                    if (a != 0) {
                        str4 = "audio/raw";
                        singletonList = null;
                        str5 = str4;
                        i4 = a;
                        str = str5;
                        list = singletonList;
                        i5 = i4;
                        i3 = -1;
                        int i922 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                        if (!"audio".equals(i.b(str))) {
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a222 = jVar.a(this.b, i8);
                        this.O = a222;
                        a222.a(oVar);
                        return;
                    }
                    Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + this.H + ". Setting mimeType to audio/x-unknown");
                    str4 = "audio/x-unknown";
                    singletonList = null;
                    a = -1;
                    str5 = str4;
                    i4 = a;
                    str = str5;
                    list = singletonList;
                    i5 = i4;
                    i3 = -1;
                    int i9222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                    if (!"audio".equals(i.b(str))) {
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2222 = jVar.a(this.b, i8);
                    this.O = a2222;
                    a2222.a(oVar);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing MS/ACM codec private");
                }
            case 3:
                i2 = 3;
                str4 = "audio/true-hd";
                singletonList = null;
                a = -1;
                str5 = str4;
                i4 = a;
                str = str5;
                list = singletonList;
                i5 = i4;
                i3 = -1;
                int i92222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a22222 = jVar.a(this.b, i8);
                this.O = a22222;
                a22222.a(oVar);
                return;
            case 4:
                byte[] bArr3 = this.h;
                try {
                    if (bArr3[0] != 2) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                    }
                    int i12 = 1;
                    int i13 = 0;
                    while (true) {
                        int i14 = bArr3[i12];
                        int i15 = -1;
                        if (i14 == -1) {
                            i13 += 255;
                            i12++;
                        } else {
                            int i16 = i12 + 1;
                            int i17 = i13 + i14;
                            int i18 = 0;
                            while (true) {
                                int i19 = bArr3[i16];
                                if (i19 != i15) {
                                    int i20 = i16 + 1;
                                    int i21 = i18 + i19;
                                    if (bArr3[i20] != 1) {
                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                                    }
                                    byte[] bArr4 = new byte[i17];
                                    System.arraycopy(bArr3, i20, bArr4, 0, i17);
                                    int i22 = i20 + i17;
                                    i2 = 3;
                                    if (bArr3[i22] != 3) {
                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                                    }
                                    int i23 = i22 + i21;
                                    if (bArr3[i23] != 5) {
                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                                    }
                                    byte[] bArr5 = new byte[bArr3.length - i23];
                                    System.arraycopy(bArr3, i23, bArr5, 0, bArr3.length - i23);
                                    ArrayList arrayList = new ArrayList(2);
                                    arrayList.add(bArr4);
                                    arrayList.add(bArr5);
                                    str = "audio/vorbis";
                                    list = arrayList;
                                    i3 = 8192;
                                    i5 = -1;
                                    int i922222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                                    if (!"audio".equals(i.b(str))) {
                                    }
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a222222 = jVar.a(this.b, i8);
                                    this.O = a222222;
                                    a222222.a(oVar);
                                    return;
                                }
                                i18 += 255;
                                i16++;
                                i15 = -1;
                            }
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                }
                break;
            case 5:
                str = "audio/mpeg-L2";
                list = null;
                i2 = 3;
                i3 = 4096;
                i5 = -1;
                int i9222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2222222 = jVar.a(this.b, i8);
                this.O = a2222222;
                a2222222.a(oVar);
                return;
            case 6:
                str = "audio/mpeg";
                list = null;
                i2 = 3;
                i3 = 4096;
                i5 = -1;
                int i92222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a22222222 = jVar.a(this.b, i8);
                this.O = a22222222;
                a22222222.a(oVar);
                return;
            case 7:
                byte[] bArr6 = this.h;
                try {
                    if (16 > bArr6.length) {
                        throw new IllegalArgumentException();
                    }
                    if ((((bArr6[17] & 255) << 8) | (bArr6[16] & 255) | ((bArr6[18] & 255) << 16) | ((bArr6[19] & 255) << 24)) == 826496599) {
                        for (int i24 = 40; i24 < bArr6.length - 4; i24++) {
                            if (bArr6[i24] == 0 && bArr6[i24 + 1] == 0 && bArr6[i24 + 2] == 1) {
                                if (bArr6[i24 + 3] == 15) {
                                    singletonList = Collections.singletonList(Arrays.copyOfRange(bArr6, i24, bArr6.length));
                                }
                            }
                        }
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Failed to find FourCC VC1 initialization data");
                    }
                    singletonList = null;
                    if (singletonList != null) {
                        str4 = "video/wvc1";
                    } else {
                        Log.w("MatroskaExtractor", "Unsupported FourCC. Setting mimeType to video/x-unknown");
                    }
                    a = -1;
                    i2 = 3;
                    str5 = str4;
                    i4 = a;
                    str = str5;
                    list = singletonList;
                    i5 = i4;
                    i3 = -1;
                    int i922222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                    if (!"audio".equals(i.b(str))) {
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a222222222 = jVar.a(this.b, i8);
                    this.O = a222222222;
                    a222222222.a(oVar);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused3) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing FourCC VC1 codec private");
                }
            case '\b':
                byte[] bArr7 = this.h;
                singletonList = Collections.singletonList(new byte[]{bArr7[0], bArr7[1], bArr7[2], bArr7[3]});
                i2 = 3;
                str = "application/dvbsubs";
                i4 = -1;
                list = singletonList;
                i5 = i4;
                i3 = -1;
                int i9222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2222222222 = jVar.a(this.b, i8);
                this.O = a2222222222;
                a2222222222.a(oVar);
                return;
            case '\n':
                com.fyber.inneractive.sdk.player.exoplayer2.video.a a3 = com.fyber.inneractive.sdk.player.exoplayer2.video.a.a(new n(this.h));
                list2 = a3.a;
                this.P = a3.b;
                str2 = "video/avc";
                i2 = 3;
                i4 = -1;
                List list3 = list2;
                str = str2;
                singletonList = list3;
                list = singletonList;
                i5 = i4;
                i3 = -1;
                int i92222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a22222222222 = jVar.a(this.b, i8);
                this.O = a22222222222;
                a22222222222.a(oVar);
                return;
            case 11:
                singletonList = Collections.singletonList(this.h);
                i2 = 3;
                str = "application/vobsub";
                i4 = -1;
                list = singletonList;
                i5 = i4;
                i3 = -1;
                int i922222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a222222222222 = jVar.a(this.b, i8);
                this.O = a222222222222;
                a222222222222.a(oVar);
                return;
            case '\f':
                str4 = "audio/vnd.dts.hd";
                i2 = 3;
                singletonList = null;
                a = -1;
                str5 = str4;
                i4 = a;
                str = str5;
                list = singletonList;
                i5 = i4;
                i3 = -1;
                int i9222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2222222222222 = jVar.a(this.b, i8);
                this.O = a2222222222222;
                a2222222222222.a(oVar);
                return;
            case '\r':
                singletonList = Collections.singletonList(this.h);
                str = "audio/mp4a-latm";
                i2 = 3;
                i4 = -1;
                list = singletonList;
                i5 = i4;
                i3 = -1;
                int i92222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a22222222222222 = jVar.a(this.b, i8);
                this.O = a22222222222222;
                a22222222222222.a(oVar);
                return;
            case 14:
                str4 = "audio/ac3";
                i2 = 3;
                singletonList = null;
                a = -1;
                str5 = str4;
                i4 = a;
                str = str5;
                list = singletonList;
                i5 = i4;
                i3 = -1;
                int i922222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a222222222222222 = jVar.a(this.b, i8);
                this.O = a222222222222222;
                a222222222222222.a(oVar);
                return;
            case 15:
            case 20:
                str4 = "audio/vnd.dts";
                i2 = 3;
                singletonList = null;
                a = -1;
                str5 = str4;
                i4 = a;
                str = str5;
                list = singletonList;
                i5 = i4;
                i3 = -1;
                int i9222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2222222222222222 = jVar.a(this.b, i8);
                this.O = a2222222222222222;
                a2222222222222222.a(oVar);
                return;
            case 16:
                str4 = "video/x-vnd.on2.vp8";
                i2 = 3;
                singletonList = null;
                a = -1;
                str5 = str4;
                i4 = a;
                str = str5;
                list = singletonList;
                i5 = i4;
                i3 = -1;
                int i92222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a22222222222222222 = jVar.a(this.b, i8);
                this.O = a22222222222222222;
                a22222222222222222.a(oVar);
                return;
            case 17:
                str4 = "video/x-vnd.on2.vp9";
                i2 = 3;
                singletonList = null;
                a = -1;
                str5 = str4;
                i4 = a;
                str = str5;
                list = singletonList;
                i5 = i4;
                i3 = -1;
                int i922222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a222222222222222222 = jVar.a(this.b, i8);
                this.O = a222222222222222222;
                a222222222222222222.a(oVar);
                return;
            case 18:
                i2 = 3;
                str4 = "application/pgs";
                singletonList = null;
                a = -1;
                str5 = str4;
                i4 = a;
                str = str5;
                list = singletonList;
                i5 = i4;
                i3 = -1;
                int i9222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2222222222222222222 = jVar.a(this.b, i8);
                this.O = a2222222222222222222;
                a2222222222222222222.a(oVar);
                return;
            case 19:
                i2 = 3;
                singletonList = null;
                a = -1;
                str5 = str4;
                i4 = a;
                str = str5;
                list = singletonList;
                i5 = i4;
                i3 = -1;
                int i92222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a22222222222222222222 = jVar.a(this.b, i8);
                this.O = a22222222222222222222;
                a22222222222222222222.a(oVar);
                return;
            case 21:
                int a4 = z.a(this.H);
                if (a4 != 0) {
                    singletonList = null;
                    i2 = 3;
                    a = a4;
                    i4 = a;
                    str = str5;
                    list = singletonList;
                    i5 = i4;
                    i3 = -1;
                    int i922222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                    if (!"audio".equals(i.b(str))) {
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a222222222222222222222 = jVar.a(this.b, i8);
                    this.O = a222222222222222222222;
                    a222222222222222222222.a(oVar);
                    return;
                }
                Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + this.H + ". Setting mimeType to audio/x-unknown");
                i2 = 3;
                str4 = "audio/x-unknown";
                singletonList = null;
                a = -1;
                str5 = str4;
                i4 = a;
                str = str5;
                list = singletonList;
                i5 = i4;
                i3 = -1;
                int i9222222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2222222222222222222222 = jVar.a(this.b, i8);
                this.O = a2222222222222222222222;
                a2222222222222222222222.a(oVar);
                return;
            case 22:
                com.fyber.inneractive.sdk.player.exoplayer2.video.d a5 = com.fyber.inneractive.sdk.player.exoplayer2.video.d.a(new n(this.h));
                list2 = a5.a;
                this.P = a5.b;
                str2 = "video/hevc";
                i2 = 3;
                i4 = -1;
                List list32 = list2;
                str = str2;
                singletonList = list32;
                list = singletonList;
                i5 = i4;
                i3 = -1;
                int i92222222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a22222222222222222222222 = jVar.a(this.b, i8);
                this.O = a22222222222222222222222;
                a22222222222222222222222.a(oVar);
                return;
            case 23:
                i2 = 3;
                str4 = "application/x-subrip";
                singletonList = null;
                a = -1;
                str5 = str4;
                i4 = a;
                str = str5;
                list = singletonList;
                i5 = i4;
                i3 = -1;
                int i922222222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a222222222222222222222222 = jVar.a(this.b, i8);
                this.O = a222222222222222222222222;
                a222222222222222222222222.a(oVar);
                return;
            case 24:
                str4 = "video/mpeg2";
                i2 = 3;
                singletonList = null;
                a = -1;
                str5 = str4;
                i4 = a;
                str = str5;
                list = singletonList;
                i5 = i4;
                i3 = -1;
                int i9222222222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2222222222222222222222222 = jVar.a(this.b, i8);
                this.O = a2222222222222222222222222;
                a2222222222222222222222222.a(oVar);
                return;
            case 25:
                str4 = "audio/eac3";
                i2 = 3;
                singletonList = null;
                a = -1;
                str5 = str4;
                i4 = a;
                str = str5;
                list = singletonList;
                i5 = i4;
                i3 = -1;
                int i92222222222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a22222222222222222222222222 = jVar.a(this.b, i8);
                this.O = a22222222222222222222222222;
                a22222222222222222222222222.a(oVar);
                return;
            case 26:
                singletonList = Collections.singletonList(this.h);
                str = "audio/flac";
                i2 = 3;
                i4 = -1;
                list = singletonList;
                i5 = i4;
                i3 = -1;
                int i922222222222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a222222222222222222222222222 = jVar.a(this.b, i8);
                this.O = a222222222222222222222222222;
                a222222222222222222222222222.a(oVar);
                return;
            case 27:
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.add(this.h);
                arrayList2.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.J).array());
                arrayList2.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.K).array());
                str = "audio/opus";
                list = arrayList2;
                i2 = 3;
                i3 = 5760;
                i5 = -1;
                int i9222222222222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2222222222222222222222222222 = jVar.a(this.b, i8);
                this.O = a2222222222222222222222222222;
                a2222222222222222222222222222.a(oVar);
                return;
            default:
                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Unrecognized codec identifier.");
        }
    }
}
