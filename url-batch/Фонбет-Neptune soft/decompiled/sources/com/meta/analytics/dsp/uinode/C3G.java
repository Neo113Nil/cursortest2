package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.3G, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3G extends AbstractC02006j implements InterfaceC0461Hq {
    public static byte[] A0E;
    public static String[] A0F = {"2QlMa6qwn7PgdSN4l85jvs7nWajl1MES", "7IDLWOxlh1sFSIB31zRzFYQ7PMnWp72Y", "sIqK", "BoflpFUQeBwwM6pd17Qd", "rQg4TubfQMsXj8fsx3Kc9qFAo71Wl6cI", "0mBM", "Xb0wUTlMwSXhcbJOEuklFsawZUYnk", "6gVYRFlBQUgMJoz7eJC1LBuasB8Ybt5d"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaFormat A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final C0291Ai A0C;
    public final InterfaceC0297Ao A0D;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 67);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0E = new byte[]{37, 39, 50, 68, 57, 47, 41, 68, Ascii.VT, Ascii.VT, 9, 68, Ascii.SO, Ascii.SI, 9, 6, 4, 17, 103, 46, 38, 38, 46, 37, 44, 103, 59, 40, 62, 103, 45, 44, 42, 38, 45, 44, 59, 111, 96, 106, 124, 97, 103, 106, 32, 125, 97, 104, 122, 121, 111, 124, 107, 32, 98, 107, 111, 96, 108, 111, 109, 101, 108, 120, 105, 100, 98, 34, Byte.MAX_VALUE, 108, 122, Base64.padSymbol, 54, 63, 48, 48, 59, 50, 115, Base64.padSymbol, 49, 43, 48, 42, 59, 54, 33, 60, 63, 39, 54, Ascii.CR, 0, Ascii.ETB, 10, Ascii.DC4, 9, 17, 0, 82, 94, 71, Ascii.DC2, 86, 81, 79, 74, 75, Ascii.DC2, 76, 86, 69, 90, 3, 7, 3, Ascii.VT, 47, 45, 54, 48, 45, 54, 43, 38, 125, 111, 99, 126, 98, 107, 35, 124, 111, 122, 107, Ascii.GS, Ascii.SI, 3, Ascii.GS, Ascii.ESC, 0, 9, 72, 87, 64, 93, 84, 94, 70, 87};
    }

    static {
        A06();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C3G(Context context, DM dm, InterfaceC0311Bc<FrameworkMediaCrypto> interfaceC0311Bc, boolean z, Handler handler, InterfaceC0292Aj interfaceC0292Aj, AU au, InterfaceC0284Ab... interfaceC0284AbArr) {
        this(context, dm, interfaceC0311Bc, z, handler, interfaceC0292Aj, new C0874Xy(au, interfaceC0284AbArr));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C3G(Context context, DM dm, InterfaceC0311Bc<FrameworkMediaCrypto> interfaceC0311Bc, boolean z, Handler handler, InterfaceC0292Aj interfaceC0292Aj, InterfaceC0297Ao interfaceC0297Ao) {
        super(1, dm, interfaceC0311Bc, z);
        this.A0B = context.getApplicationContext();
        this.A0D = interfaceC0297Ao;
        this.A0C = new C0291Ai(handler, interfaceC0292Aj);
        interfaceC0297Ao.AG4(new C0872Xw(this));
    }

    private int A00(DG dg, Format format) {
        PackageManager packageManager;
        if (IF.A02 < 24 && A04(15, 22, 10).equals(dg.A02)) {
            boolean z = true;
            if (IF.A02 == 23 && (packageManager = this.A0B.getPackageManager()) != null) {
                boolean needsRawDecoderWorkaround = packageManager.hasSystemFeature(A04(37, 25, 77));
                if (needsRawDecoderWorkaround) {
                    z = false;
                }
            }
            if (z) {
                return -1;
            }
        }
        return format.A09;
    }

    private final int A01(DG dg, Format format, Format[] formatArr) {
        int maxInputSize = A00(dg, format);
        return maxInputSize;
    }

    private final MediaFormat A02(Format format, String str, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A04(113, 4, 45), str);
        mediaFormat.setInteger(A04(71, 13, 29), format.A05);
        mediaFormat.setInteger(A04(125, 11, 77), format.A0C);
        DS.A06(mediaFormat, format.A0P);
        DS.A04(mediaFormat, A04(99, 14, 124), i);
        if (IF.A02 >= 23) {
            mediaFormat.setInteger(A04(117, 8, 28), 0);
        }
        return mediaFormat;
    }

    private void A05() {
        long A6e = this.A0D.A6e(A91());
        if (A6e != Long.MIN_VALUE) {
            if (!this.A08) {
                long newCurrentPositionUs = this.A05;
                A6e = Math.max(newCurrentPositionUs, A6e);
            }
            this.A05 = A6e;
            this.A08 = false;
        }
    }

    public static boolean A08(String str) {
        if (IF.A02 < 24 && A04(0, 15, 41).equals(str)) {
            if (A04(Opcodes.L2I, 7, 45).equals(IF.A05)) {
                if (!IF.A03.startsWith(A04(Opcodes.D2L, 8, 113)) && !IF.A03.startsWith(A04(84, 7, 16))) {
                    boolean startsWith = IF.A03.startsWith(A04(91, 8, 38));
                    if (A0F[0].charAt(11) == 'E') {
                        throw new RuntimeException();
                    }
                    A0F[7] = "opGrTNmI0QvRBzLgsKXfoISibxDPDheH";
                    if (startsWith) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    private final boolean A09(String str) {
        int A00 = AbstractC0463Hs.A00(str);
        return A00 != 0 && this.A0D.A90(A00);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02006j, com.meta.analytics.dsp.uinode.EM
    public final void A13() {
        super.A13();
        this.A0D.AE2();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02006j, com.meta.analytics.dsp.uinode.EM
    public final void A14() {
        A05();
        this.A0D.pause();
        super.A14();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02006j, com.meta.analytics.dsp.uinode.EM
    public final void A15() {
        try {
            this.A0D.AEV();
            try {
                super.A15();
                this.A0U.A00();
                this.A0C.A04(this.A0U);
                String[] strArr = A0F;
                if (strArr[5].length() != strArr[2].length()) {
                    throw new RuntimeException();
                }
                A0F[0] = "oD9vMZ2y7vvHJ8P8Vn8jWHJMMQFHYWzQ";
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.A15();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02006j, com.meta.analytics.dsp.uinode.EM
    public final void A16(long j, boolean z) throws C02609c {
        super.A16(j, z);
        this.A0D.reset();
        this.A05 = j;
        this.A07 = true;
        this.A08 = true;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02006j, com.meta.analytics.dsp.uinode.EM
    public final void A17(boolean z) throws C02609c {
        super.A17(z);
        this.A0C.A05(this.A0U);
        int i = A12().A00;
        if (i != 0) {
            this.A0D.A5W(i);
        } else {
            this.A0D.A59();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02006j
    public final int A1B(MediaCodec mediaCodec, DG dg, Format format, Format format2) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bb, code lost:
    
        if (r6 != (-1)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bd, code lost:
    
        r1 = r17.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c3, code lost:
    
        if (r5.A0G(r1) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c5, code lost:
    
        r1 = r17.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c7, code lost:
    
        if (r1 == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cf, code lost:
    
        if (r5.A0F(r17.A05) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00db, code lost:
    
        if (r6 != (-1)) goto L49;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    @Override // com.meta.analytics.dsp.uinode.AbstractC02006j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A1C(DM dm, InterfaceC0311Bc<FrameworkMediaCrypto> interfaceC0311Bc, Format format) throws DP {
        int i;
        String str = format.A0O;
        boolean z = false;
        if (!AbstractC0463Hs.A09(str)) {
            return 0;
        }
        int i2 = IF.A02 >= 21 ? 32 : 0;
        boolean A0y = EM.A0y(interfaceC0311Bc, format.A0H);
        int i3 = 4;
        if (A0y) {
            boolean A09 = A09(str);
            int tunnelingSupport = A0F[0].charAt(11);
            if (tunnelingSupport == 69) {
                throw new RuntimeException();
            }
            A0F[7] = "6sleKLNQpbvHoKVWyK7EUP7qImvC8hiJ";
            if (A09 && dm.A7c() != null) {
                return i2 | 8 | 4;
            }
        }
        String mimeType = A04(62, 9, 78);
        if ((mimeType.equals(str) && !this.A0D.A90(format.A0A)) || !this.A0D.A90(2)) {
            return 1;
        }
        boolean requiresSecureDecryption = false;
        DrmInitData drmInitData = format.A0H;
        if (drmInitData != null) {
            for (int tunnelingSupport2 = 0; tunnelingSupport2 < drmInitData.A01; tunnelingSupport2++) {
                requiresSecureDecryption |= drmInitData.A01(tunnelingSupport2).A03;
            }
        }
        DG A6m = dm.A6m(str, requiresSecureDecryption);
        if (A6m == null) {
            return (!requiresSecureDecryption || dm.A6m(str, false) == null) ? 1 : 2;
        }
        if (!A0y) {
            return 2;
        }
        if (IF.A02 >= 21) {
            int i4 = format.A0C;
            int tunnelingSupport3 = A0F[7].charAt(27);
            if (tunnelingSupport3 != 51) {
                String[] strArr = A0F;
                strArr[6] = "YbsTws3ypMFNM7ai4KKw1OCVUgQ1r";
                strArr[3] = "Svs1q3oiD8cOh72XtRNv";
                i = -1;
            } else {
                i = -1;
            }
            if (!z) {
                i3 = 3;
            }
            return i2 | 8 | i3;
        }
        z = true;
        if (!z) {
        }
        return i2 | 8 | i3;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02006j
    public final DG A1F(DM dm, Format format, boolean z) throws DP {
        DG passthroughDecoderInfo;
        if (A09(format.A0O) && (passthroughDecoderInfo = dm.A7c()) != null) {
            return passthroughDecoderInfo;
        }
        return super.A1F(dm, format, z);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02006j
    public final void A1I() throws C02609c {
        try {
            this.A0D.AE3();
        } catch (C0296An e) {
            throw C02609c.A01(e, A0z());
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x006a */
    @Override // com.meta.analytics.dsp.uinode.AbstractC02006j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1L(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C02609c {
        int i;
        int[] iArr;
        int encoding;
        MediaFormat mediaFormat2 = this.A06;
        if (mediaFormat2 != null) {
            String string = mediaFormat2.getString(A04(113, 4, 45));
            String[] strArr = A0F;
            if (strArr[5].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "rkxX";
            strArr2[2] = "9ODr";
            i = AbstractC0463Hs.A00(string);
            mediaFormat = this.A06;
        } else {
            i = this.A04;
        }
        int integer = mediaFormat.getInteger(A04(71, 13, 29));
        int integer2 = mediaFormat.getInteger(A04(125, 11, 77));
        if (this.A09 && integer == 6 && (encoding = this.A00) < 6) {
            iArr = new int[encoding];
            for (int i2 = 0; i2 < encoding; i2++) {
                iArr[i2] = i2;
            }
        } else {
            iArr = null;
        }
        try {
            this.A0D.A4P(i, integer, integer2, 0, iArr, this.A02, this.A03);
        } catch (C0293Ak e) {
            throw C02609c.A01(e, A0z());
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02006j
    public final void A1M(Format format) throws C02609c {
        int i;
        super.A1M(format);
        this.A0C.A03(format);
        if (A04(62, 9, 78).equals(format.A0O)) {
            i = format.A0A;
        } else {
            i = 2;
        }
        this.A04 = i;
        this.A00 = format.A05;
        this.A02 = format.A06;
        this.A03 = format.A07;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02006j
    public final void A1N(C0867Xr c0867Xr) {
        if (this.A07 && !c0867Xr.A03()) {
            if (Math.abs(c0867Xr.A00 - this.A05) > 500000) {
                this.A05 = c0867Xr.A00;
            }
            this.A07 = false;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02006j
    public final void A1O(DG dg, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.A01 = A01(dg, format, A1A());
        this.A09 = A08(dg.A02);
        this.A0A = dg.A04;
        MediaFormat A02 = A02(format, dg.A01 == null ? A04(62, 9, 78) : dg.A01, this.A01);
        mediaCodec.configure(A02, (Surface) null, mediaCrypto, 0);
        if (this.A0A) {
            this.A06 = A02;
            String A04 = A04(113, 4, 45);
            String codecMimeType = format.A0O;
            A02.setString(A04, codecMimeType);
            return;
        }
        this.A06 = null;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02006j
    public final void A1P(String str, long j, long j2) {
        this.A0C.A06(str, j, j2);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02006j
    public final boolean A1Q(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C02609c {
        if (this.A0A && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        }
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.A0U.A08++;
            this.A0D.A8U();
            return true;
        }
        try {
            if (!this.A0D.A8R(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.A0U.A06++;
            return true;
        } catch (C0294Al | C0296An e) {
            throw C02609c.A01(e, A0z());
        }
    }

    @Override // com.meta.analytics.dsp.uinode.EM, com.meta.analytics.dsp.uinode.Y5
    public final InterfaceC0461Hq A7N() {
        return this;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0461Hq
    public final C02809x A7h() {
        return this.A0D.A7h();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0461Hq
    public final long A7k() {
        if (A81() == 2) {
            A05();
        }
        return this.A05;
    }

    @Override // com.meta.analytics.dsp.uinode.EM, com.meta.analytics.dsp.uinode.A7
    public final void A8V(int i, Object obj) throws C02609c {
        switch (i) {
            case 2:
                this.A0D.setVolume(((Float) obj).floatValue());
                break;
            case 3:
                this.A0D.AFs((AT) obj);
                break;
            default:
                super.A8V(i, obj);
                break;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02006j, com.meta.analytics.dsp.uinode.Y5
    public final boolean A91() {
        return super.A91() && this.A0D.A91();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02006j, com.meta.analytics.dsp.uinode.Y5
    public final boolean A9C() {
        return this.A0D.A8Z() || super.A9C();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0461Hq
    public final C02809x AGA(C02809x c02809x) {
        return this.A0D.AGA(c02809x);
    }
}
