package com.meta.analytics.dsp.uinode;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.6j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC02006j extends EM {
    public static byte[] A0d;
    public static String[] A0e = {"el1NIdjJdnQk8rQ7yI3DLJMJGUNGpsaL", "cMnDkAErKs2M6cVzDcwdPqTaRDuVL2G6", "3Ljz1yFix4teFI07gFBJ1ZVJZ4Elk", "rfweshkfyu7YGNu9gmTN5aJbUxr0jD44", "UwDJ5OwzyxxJZbvw2og9SG", "E", "kELoxR7DFwuexd5ZjpenISH", "LMGopoJZLCWwOw1IQPtLBjMdbqq8sxxW"};
    public static final byte[] A0f;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaCodec A06;
    public Format A07;
    public InterfaceC0310Bb<FrameworkMediaCrypto> A08;
    public InterfaceC0310Bb<FrameworkMediaCrypto> A09;
    public DG A0A;
    public ByteBuffer A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public ByteBuffer[] A0S;
    public ByteBuffer[] A0T;
    public BC A0U;
    public final MediaCodec.BufferInfo A0V;
    public final C02729p A0W;
    public final C0867Xr A0X;
    public final C0867Xr A0Y;
    public final InterfaceC0311Bc<FrameworkMediaCrypto> A0Z;
    public final DM A0a;
    public final List<Long> A0b;
    public final boolean A0c;

    public static String A0Z(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0d, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] ^ i3) ^ 57;
            if (A0e[5].length() == 20) {
                throw new RuntimeException();
            }
            A0e[0] = "GT4OiQXgMfCUtJ1QRZ1mZZkQ0KPtv7dD";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A0j() {
        A0d = new byte[]{85, 89, Ascii.ESC, Ascii.FF, Ascii.CR, 89, Ascii.ETB, Ascii.SYN, 89, 10, Ascii.FS, Ascii.SUB, Ascii.FF, Ascii.VT, Ascii.FS, 89, Ascii.GS, Ascii.FS, Ascii.SUB, Ascii.SYN, Ascii.GS, Ascii.FS, Ascii.VT, 89, Ascii.CAN, Ascii.SI, Ascii.CAN, 16, Ascii.NAK, Ascii.CAN, Ascii.ESC, Ascii.NAK, Ascii.FS, 87, 89, 45, Ascii.VT, 0, 16, Ascii.ETB, Ascii.RS, 89, Ascii.CR, Ascii.SYN, 89, 9, Ascii.VT, Ascii.SYN, Ascii.SUB, Ascii.FS, Ascii.FS, Ascii.GS, 89, Ascii.SO, 16, Ascii.CR, 17, 89, 19, 106, 106, 106, 106, 106, 107, 108, 109, 110, 104, Ascii.EM, 106, 106, Ascii.CAN, Ascii.RS, Ascii.ESC, 104, 111, 99, 106, 106, 106, 106, 106, 106, 107, 108, 98, Ascii.EM, Ascii.US, 106, Ascii.FS, 107, 105, 104, 106, 106, 106, 106, 106, 106, 107, 108, 111, 98, 98, 98, 110, 106, Ascii.RS, Ascii.EM, Ascii.US, 109, 107, 107, 98, Ascii.ESC, 106, 106, 106, 104, Ascii.FS, Ascii.CAN, Ascii.FS, 107, Ascii.EM, 105, 107, Ascii.EM, 105, 104, 109, 111, Ascii.RS, 109, 98, 107, 108, 126, 121, 3, 47, 35, 56, 45, 44, 93, 107, 116, 57, 106, 124, 106, 106, 112, 118, 119, 57, 107, 124, 104, 108, 112, 107, 124, 106, 57, 106, 124, 122, 108, 107, 124, 57, 125, 124, 122, 118, 125, 124, 107, 57, Byte.MAX_VALUE, 118, 107, 57, Ascii.ESC, 51, 50, 63, 55, 118, 36, 51, 39, 35, 63, 36, 51, 37, 118, 55, 118, Ascii.DC2, 36, 59, 5, 51, 37, 37, 63, 57, 56, Ascii.ESC, 55, 56, 55, 49, 51, 36, 9, 33, 32, 45, 37, 7, 43, 32, 33, 39, Ascii.SYN, 33, 42, 32, 33, 54, 33, 54, 69, 71, 82, 36, 79, 114, 115, 100, 101, 121, 36, 107, 124, 105, 36, 110, 111, 105, 32, 34, 55, 65, 42, Ascii.ETB, Ascii.SYN, 1, 0, Ascii.FS, 65, Ascii.SO, Ascii.EM, Ascii.FF, 65, Ascii.VT, 10, Ascii.FF, 65, Ascii.FS, 10, Ascii.FF, Ascii.SUB, Ascii.GS, 10, 42, 40, Base64.padSymbol, 75, 40, 49, 46, 75, 36, 48, 33, 44, 42, 75, 33, 32, 38, 42, 33, 32, 55, 75, 40, 53, 86, 80, 82, 71, 49, 82, 75, 84, 49, 73, 86, 91, 90, 80, 49, 91, 90, 92, 80, 91, 90, 77, 49, 94, 73, 92, 36, 38, 51, 69, 37, Ascii.GS, 2, Ascii.SI, 2, 10, 69, 3, 89, 93, 95, 69, Ascii.SI, Ascii.SO, 8, 4, Ascii.SI, Ascii.SO, 63, Base64.padSymbol, 40, 94, 62, 6, Ascii.EM, Ascii.DC4, Ascii.EM, 17, 94, Ascii.CAN, 66, 70, 68, 94, Ascii.DC4, Ascii.NAK, 19, Ascii.US, Ascii.DC4, Ascii.NAK, 94, 3, Ascii.NAK, 19, 5, 2, Ascii.NAK, Ascii.SO, Ascii.FF, Ascii.EM, 111, Ascii.DC2, 4, 2, 111, 32, 55, 34, 111, 37, 36, 34, 4, 6, 19, 101, Ascii.CAN, Ascii.SO, 8, 101, 42, Base64.padSymbol, 40, 101, 47, 46, 40, 101, 56, 46, 40, 62, 57, 46, 4, 6, 19, 101, 42, 39, 39, 60, 34, 37, 37, 46, 57, 101, Base64.padSymbol, 34, 47, 46, 36, 101, 47, 46, 40, 36, 47, 46, 57, 101, 42, Base64.padSymbol, 40, 75, 73, 92, 42, 101, 105, 104, 107, 99, 109, 103, 42, 101, 114, 103, 42, 96, 97, 103, 107, 96, 97, 118, 42, 101, 115, 97, 119, 107, 105, 97, 110, 108, 121, Ascii.SI, 64, 76, 77, 78, 70, 72, 66, Ascii.SI, 64, 87, 66, Ascii.SI, 69, 68, 66, 78, 69, 68, 83, Ascii.SI, 64, 86, 68, 82, 78, 76, 68, Ascii.SI, 82, 68, 66, 84, 83, 68, 87, 85, 64, 54, Byte.MAX_VALUE, 119, 119, Byte.MAX_VALUE, 116, 125, 54, 121, 121, 123, 54, 124, 125, 123, 119, 124, 125, 106, 114, 112, 101, 19, 90, 82, 82, 90, 81, 88, 19, 75, 82, 79, 95, 84, 78, 19, 89, 88, 94, 82, 89, 88, 79, 123, 121, 108, Ascii.SUB, 70, 95, Ascii.SUB, 66, 93, 80, 81, 91, 107, 80, 81, 87, 91, 80, 81, 70, Ascii.SUB, 85, 66, 87, 67, 93, Base64.padSymbol, 81, 37, 33, 32, 58, 36, 68, 40, 92, 91, 89, 57, 39, 71, 45, 82, 90, 90, Ascii.VT, Ascii.NAK, 117, Ascii.DC2, 111, 104, 104, 105, 119, Ascii.ETB, 110, Ascii.SI, 2, Ascii.SI, 104, 106, 120, 124, 96, 123, 108, 90, 108, 122, 122, 96, 102, 103, 124, 119, 126, 113, 113, 122, 115, 50, 124, 112, 106, 113, 107, Ascii.VT, 7, 6, Ascii.SO, 1, Ascii.SI, Ascii.GS, Ascii.SUB, Ascii.CR, 43, 7, Ascii.FF, Ascii.CR, Ascii.VT, 4, Ascii.NAK, 2, 6, 19, 2, 36, 8, 3, 2, 4, 93, 122, 108, Byte.MAX_VALUE, 119, 112, 95, 112, 122, 88, 123, 123, 122, Ascii.RS, Ascii.DC4, Ascii.ETB, Ascii.CR, Ascii.SYN, Ascii.FS, Ascii.GS, 10, 57, 51, 48, 42, 49, 59, 58, 45, 0, 51, 43, 58, 107, 105, 120, 65, 105, 104, 101, 109, 79, 126, 117, 124, 120, 99, 1, 3, Ascii.DC2, 53, Ascii.DC2, 7, Ascii.DC2, 3, 79, 90, 71, 93, 88, 77, 90, 62, 52, 100, 102, 102, 102, 102, 107, 103, 105, 102, 122, 68, 83, 90, 83, 87, 69, 83, 101, 83, 69, 69, 95, 89, 88, 55, 48, 37, 54, 48, 7, 43, 32, 33, 39, 104, 117, 112, 125, 108, 117, 125, 73, 87, 90, 74, 86};
    }

    public abstract int A1B(MediaCodec mediaCodec, DG dg, Format format, Format format2);

    public abstract int A1C(DM dm, InterfaceC0311Bc<FrameworkMediaCrypto> interfaceC0311Bc, Format format) throws DP;

    public abstract void A1L(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C02609c;

    public abstract void A1N(C0867Xr c0867Xr);

    public abstract void A1O(DG dg, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws DP;

    public abstract void A1P(String str, long j, long j2);

    public abstract boolean A1Q(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C02609c;

    static {
        A0j();
        A0f = IF.A0h(A0Z(59, 76, 99));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public AbstractC02006j(int i, DM dm, InterfaceC0311Bc<FrameworkMediaCrypto> interfaceC0311Bc, boolean z) {
        super(i);
        AbstractC0445Ha.A04(IF.A02 >= 16);
        this.A0a = (DM) AbstractC0445Ha.A01(dm);
        this.A0Z = interfaceC0311Bc;
        this.A0c = z;
        this.A0X = new C0867Xr(0);
        this.A0Y = C0867Xr.A02();
        this.A0W = new C02729p();
        this.A0b = new ArrayList();
        this.A0V = new MediaCodec.BufferInfo();
        this.A01 = 0;
        this.A02 = 0;
    }

    private int A0W(String str) {
        if (IF.A02 <= 25 && A0Z(255, 25, 86).equals(str) && (IF.A06.startsWith(A0Z(617, 7, 3)) || IF.A06.startsWith(A0Z(589, 7, 41)) || IF.A06.startsWith(A0Z(596, 7, 80)) || IF.A06.startsWith(A0Z(TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 7, 97)))) {
            return 2;
        }
        if (IF.A02 < 24) {
            if (A0Z(330, 22, 82).equals(str) || A0Z(352, 29, 73).equals(str)) {
                if (!A0Z(689, 8, 65).equals(IF.A03)) {
                    if (!A0Z(697, 12, 102).equals(IF.A03)) {
                        if (!A0Z(731, 7, 17).equals(IF.A03)) {
                            if (A0Z(774, 7, 37).equals(IF.A03)) {
                                return 1;
                            }
                            return 0;
                        }
                        return 1;
                    }
                    return 1;
                }
                return 1;
            }
            return 0;
        }
        return 0;
    }

    private final long A0X() {
        return 0L;
    }

    public static MediaCodec.CryptoInfo A0Y(C0867Xr c0867Xr, int i) {
        MediaCodec.CryptoInfo A02 = c0867Xr.A02.A02();
        if (i == 0) {
            return A02;
        }
        if (A02.numBytesOfClearData == null) {
            A02.numBytesOfClearData = new int[1];
        }
        int[] iArr = A02.numBytesOfClearData;
        int i2 = iArr[0];
        if (A0e[2].length() == 1) {
            throw new RuntimeException();
        }
        String[] strArr = A0e;
        strArr[7] = "NOzrMPRB76F8DdbUb3OPVPb4rTNpEGvY";
        strArr[3] = "IDmZDsJhwqXuUzopfYWLVElAjmr2DtdU";
        iArr[0] = i2 + i;
        return A02;
    }

    private ByteBuffer A0a(int i) {
        if (IF.A02 >= 21) {
            return this.A06.getInputBuffer(i);
        }
        ByteBuffer byteBuffer = this.A0S[i];
        String[] strArr = A0e;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0e;
        strArr2[7] = "akmimywpCQzy2zgGqC6e1Zi0HtFx9MqZ";
        strArr2[3] = "4g16x1WFaX1F1Ai56lyJAgpz1Kjl0dDQ";
        return byteBuffer;
    }

    private ByteBuffer A0b(int i) {
        if (IF.A02 >= 21) {
            return this.A06.getOutputBuffer(i);
        }
        return this.A0T[i];
    }

    private void A0c() {
        if (IF.A02 < 21) {
            this.A0S = this.A06.getInputBuffers();
            MediaCodec mediaCodec = this.A06;
            if (A0e[5].length() == 20) {
                throw new RuntimeException();
            }
            A0e[2] = "BQUwUvW99pDNY9ExELsrhPAvhUrne6";
            this.A0T = mediaCodec.getOutputBuffers();
        }
    }

    private void A0d() throws C02609c {
        if (this.A02 == 2) {
            A1H();
            A1J();
        } else {
            this.A0N = true;
            A1I();
        }
    }

    private void A0e() {
        if (IF.A02 < 21) {
            this.A0T = this.A06.getOutputBuffers();
        }
    }

    private void A0f() throws C02609c {
        MediaFormat outputFormat = this.A06.getOutputFormat();
        if (this.A00 != 0 && outputFormat.getInteger(A0Z(781, 5, 7)) == 32 && outputFormat.getInteger(A0Z(744, 6, 55)) == 32) {
            this.A0O = true;
            return;
        }
        if (this.A0I) {
            outputFormat.setInteger(A0Z(638, 13, 38), 1);
        }
        A1L(this.A06, outputFormat);
    }

    private void A0g() {
        if (IF.A02 < 21) {
            this.A0S = null;
            this.A0T = null;
        }
    }

    private void A0h() {
        this.A03 = -1;
        this.A0X.A01 = null;
    }

    private void A0i() {
        this.A04 = -1;
        this.A0B = null;
    }

    private void A0k(DI di) throws C02609c {
        throw C02609c.A01(di, A0z());
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0139, code lost:
    
        if (r6 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013b, code lost:
    
        A0d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014b, code lost:
    
        if (r13.A0G == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014e, code lost:
    
        r13.A0K = true;
        r13.A06.queueInputBuffer(r13.A03, 0, 0, 0, 4);
        A0h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0160, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0169, code lost:
    
        throw com.meta.analytics.dsp.uinode.C02609c.A01(r1, A0z());
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0146, code lost:
    
        if (r6 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018a, code lost:
    
        if (r8.A05() == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018c, code lost:
    
        r13.A0X.A07();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0193, code lost:
    
        if (r13.A01 != 2) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0195, code lost:
    
        r13.A01 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0197, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a8, code lost:
    
        if (r8.A05() == false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0l() throws C02609c {
        int A11;
        MediaCodec mediaCodec = this.A06;
        if (mediaCodec == null || this.A02 == 2 || this.A0M) {
            return false;
        }
        if (this.A03 < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.A03 = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            this.A0X.A01 = A0a(dequeueInputBuffer);
            this.A0X.A07();
        }
        int i = this.A02;
        if (A0e[2].length() == 1) {
            throw new RuntimeException();
        }
        A0e[0] = "BGv06lkWwG6z0hSmECPMwAj0xiUhKKMm";
        if (i == 1) {
            if (!this.A0G) {
                this.A0K = true;
                this.A06.queueInputBuffer(this.A03, 0, 0, 0L, 4);
                A0h();
            }
            this.A02 = 2;
            return false;
        }
        if (this.A0C) {
            this.A0C = false;
            ByteBuffer byteBuffer = this.A0X.A01;
            byte[] bArr = A0f;
            byteBuffer.put(bArr);
            this.A06.queueInputBuffer(this.A03, 0, bArr.length, 0L, 0);
            A0h();
            this.A0J = true;
            return true;
        }
        int i2 = 0;
        if (this.A0R) {
            A11 = -4;
            if (A0e[2].length() == 1) {
                throw new RuntimeException();
            }
            A0e[0] = "cWcFMDoxN8Aku4bywP95fMqNRICNv17K";
        } else {
            if (this.A01 == 1) {
                for (int result = 0; result < this.A07.A0P.size(); result++) {
                    this.A0X.A01.put(this.A07.A0P.get(result));
                }
                this.A01 = 2;
            }
            i2 = this.A0X.A01.position();
            C02729p c02729p = this.A0W;
            if (A0e[5].length() != 20) {
                String[] strArr = A0e;
                strArr[7] = "GMhmsEJxFGP4UGYwyrNMJ7ABPSyH92Wb";
                strArr[3] = "9vGc1NAfm636mRfTzlbxXXygjN4bGT7w";
                A11 = A11(c02729p, this.A0X, false);
            } else {
                String[] strArr2 = A0e;
                strArr2[4] = "jZbWd1eO6yZY8R9xWwlVER";
                strArr2[6] = "QWk96bCMj56V6fYDRZTqXno";
                A11 = A11(c02729p, this.A0X, false);
            }
        }
        if (A11 == -3) {
            return false;
        }
        if (A11 == -5) {
            if (this.A01 == 2) {
                this.A0X.A07();
                this.A01 = 1;
            }
            A1M(this.A0W.A00);
            return true;
        }
        if (this.A0X.A04()) {
            if (this.A01 == 2) {
                this.A0X.A07();
                this.A01 = 1;
            }
            this.A0M = true;
            boolean z = this.A0J;
            if (A0e[1].charAt(18) == 'w') {
                A0e[5] = "IK13ew4";
            }
        } else {
            if (this.A0Q) {
                C0867Xr c0867Xr = this.A0X;
                if (A0e[0].charAt(8) != 's') {
                    A0e[0] = "ywBWkcBFyHyOTxmikBGNQ7ElC4JSn47y";
                } else {
                    String[] strArr3 = A0e;
                    strArr3[7] = "uqwAh7OiLzrqYCdIK7FE27Aq9dnmjoOb";
                    strArr3[3] = "CGhJEeUUTBGplB6hh3d6N38sXeZGKtI8";
                }
            }
            this.A0Q = false;
            boolean A0A = this.A0X.A0A();
            boolean A0v = A0v(A0A);
            this.A0R = A0v;
            if (A0v) {
                return false;
            }
            if (this.A0D && !A0A) {
                AbstractC0466Hv.A0A(this.A0X.A01);
                if (this.A0X.A01.position() == 0) {
                    return true;
                }
                this.A0D = false;
            }
            try {
                long j = this.A0X.A00;
                if (this.A0X.A03()) {
                    this.A0b.add(Long.valueOf(j));
                }
                this.A0X.A08();
                A1N(this.A0X);
                if (!A0A) {
                    this.A06.queueInputBuffer(this.A03, 0, this.A0X.A01.limit(), j, 0);
                } else {
                    this.A06.queueSecureInputBuffer(this.A03, 0, A0Y(this.A0X, i2), j, 0);
                }
                A0h();
                this.A0J = true;
                this.A01 = 0;
                this.A0U.A04++;
                return true;
            } catch (MediaCodec.CryptoException e) {
                throw C02609c.A01(e, A0z());
            }
        }
    }

    private boolean A0m() {
        return this.A04 >= 0;
    }

    private boolean A0n(long j) {
        int size = this.A0b.size();
        for (int i = 0; i < size; i++) {
            if (this.A0b.get(i).longValue() == j) {
                this.A0b.remove(i);
                int i2 = A0e[1].charAt(18);
                if (i2 != 119) {
                    throw new RuntimeException();
                }
                A0e[5] = "GAQPkPxILqrNxqRn";
                return true;
            }
        }
        return false;
    }

    private boolean A0o(long j, long j2) throws C02609c {
        boolean processedOutputBuffer;
        int dequeueOutputBuffer;
        if (!A0m()) {
            if (this.A0F && this.A0K) {
                try {
                    dequeueOutputBuffer = this.A06.dequeueOutputBuffer(this.A0V, A0X());
                } catch (IllegalStateException unused) {
                    A0d();
                    if (this.A0N) {
                        A1H();
                    }
                    return false;
                }
            } else {
                dequeueOutputBuffer = this.A06.dequeueOutputBuffer(this.A0V, A0X());
            }
            if (dequeueOutputBuffer >= 0) {
                if (this.A0O) {
                    this.A0O = false;
                    this.A06.releaseOutputBuffer(dequeueOutputBuffer, false);
                    return true;
                }
                int outputIndex = this.A0V.size;
                if (outputIndex == 0) {
                    int outputIndex2 = this.A0V.flags;
                    if ((outputIndex2 & 4) != 0) {
                        A0d();
                        return false;
                    }
                }
                this.A04 = dequeueOutputBuffer;
                ByteBuffer A0b = A0b(dequeueOutputBuffer);
                this.A0B = A0b;
                if (A0b != null) {
                    int outputIndex3 = this.A0V.offset;
                    A0b.position(outputIndex3);
                    ByteBuffer byteBuffer = this.A0B;
                    int i = this.A0V.offset;
                    int outputIndex4 = this.A0V.size;
                    int i2 = i + outputIndex4;
                    if (A0e[2].length() != 1) {
                        String[] strArr = A0e;
                        strArr[4] = "FaJE2XiArfhYqeNyfkTyaQ";
                        strArr[6] = "HvmGKe0EFE5f200jghUPQNW";
                        byteBuffer.limit(i2);
                    }
                }
                this.A0P = A0n(this.A0V.presentationTimeUs);
            } else if (A0e[5].length() != 20) {
                A0e[1] = "HT1pBWWLOYy8PEf8scwcSavywhmMK5P3";
                if (dequeueOutputBuffer == -2) {
                    A0f();
                    String[] strArr2 = A0e;
                    String str = strArr2[4];
                    String str2 = strArr2[6];
                    int length = str.length();
                    int outputIndex5 = str2.length();
                    if (length == outputIndex5) {
                        return true;
                    }
                    A0e[5] = "todLl0dSZi0vPTtgICo1ottwNzErViL";
                    return true;
                }
                if (A0e[0].charAt(8) == 's') {
                    throw new RuntimeException();
                }
                A0e[5] = "4PVEqwR";
                if (dequeueOutputBuffer == -3) {
                    A0e();
                    return true;
                }
                boolean z = this.A0G;
                if (A0e[0].charAt(8) == 's') {
                    throw new RuntimeException();
                }
                A0e[1] = "oPTnjsm2EBoNSW7B2QwBvulptlCCgQiW";
                if (z && (this.A0M || this.A02 == 2)) {
                    A0d();
                }
                return false;
            }
            throw new RuntimeException();
        }
        if (this.A0F && this.A0K) {
            try {
                processedOutputBuffer = A1Q(j, j2, this.A06, this.A0B, this.A04, this.A0V.flags, this.A0V.presentationTimeUs, this.A0P);
            } catch (IllegalStateException unused2) {
                A0d();
                if (this.A0N) {
                    A1H();
                }
                return false;
            }
        } else {
            processedOutputBuffer = A1Q(j, j2, this.A06, this.A0B, this.A04, this.A0V.flags, this.A0V.presentationTimeUs, this.A0P);
        }
        if (processedOutputBuffer) {
            A1K(this.A0V.presentationTimeUs);
            boolean processedOutputBuffer2 = (this.A0V.flags & 4) != 0;
            A0i();
            if (!processedOutputBuffer2) {
                return true;
            }
            A0d();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r0.equals(r3) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0p(DG dg) {
        String str = dg.A02;
        if (IF.A02 <= 17) {
            String name = A0Z(565, 24, 13);
            if (!name.equals(str)) {
                String name2 = A0Z(418, 31, 114);
            }
            return true;
        }
        String str2 = IF.A05;
        String name3 = A0Z(Opcodes.F2I, 6, 123);
        if (name3.equals(str2)) {
            String A0Z = A0Z(Opcodes.I2D, 4, 19);
            String name4 = A0e[5];
            if (name4.length() == 20) {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[4] = "ta8dfTbq5GbSxrQo9R7BCH";
            strArr[6] = "TLzt7USKw6C8aMs6TrECz9n";
            String name5 = IF.A06;
            if (A0Z.equals(name5) && dg.A05) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0q(String str) {
        if (IF.A02 > 23 || !A0Z(540, 25, 4).equals(str)) {
            if (IF.A02 <= 19) {
                if (!A0Z(738, 6, 111).equals(IF.A03) || (!A0Z(449, 31, 61).equals(str) && !A0Z(480, 38, 24).equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0r(String str) {
        return IF.A02 == 21 && A0Z(518, 22, 33).equals(str);
    }

    public static boolean A0s(String str) {
        return IF.A02 < 18 || (IF.A02 == 18 && (A0Z(381, 15, 120).equals(str) || A0Z(396, 22, 114).equals(str))) || (IF.A02 == 19 && IF.A06.startsWith(A0Z(TypedValues.MotionType.TYPE_EASING, 7, 83)) && (A0Z(237, 18, 51).equals(str) || A0Z(255, 25, 86).equals(str)));
    }

    public static boolean A0t(String str, Format format) {
        return IF.A02 < 21 && format.A0P.isEmpty() && A0Z(305, 25, 38).equals(str);
    }

    public static boolean A0u(String str, Format format) {
        return IF.A02 <= 18 && format.A05 == 1 && A0Z(280, 25, 92).equals(str);
    }

    private boolean A0v(boolean z) throws C02609c {
        if (0 == 0 || (!z && this.A0c)) {
            return false;
        }
        throw new NullPointerException(A0Z(723, 8, 95));
    }

    @Override // com.meta.analytics.dsp.uinode.EM
    public void A13() {
    }

    @Override // com.meta.analytics.dsp.uinode.EM
    public void A14() {
    }

    @Override // com.meta.analytics.dsp.uinode.EM
    public void A15() {
        this.A07 = null;
        try {
            A1H();
            if (0 != 0) {
                try {
                    throw new NullPointerException(A0Z(750, 14, 15));
                } catch (Throwable th) {
                    if (0 != 0 && 0 != 0) {
                        try {
                            throw new NullPointerException(A0Z(750, 14, 15));
                        } finally {
                        }
                    }
                    throw th;
                }
            }
            if (0 != 0 && 0 != 0) {
                try {
                    throw new NullPointerException(A0Z(750, 14, 15));
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    throw new NullPointerException(A0Z(750, 14, 15));
                } catch (Throwable th3) {
                    if (0 != 0 && 0 != 0) {
                        try {
                            throw new NullPointerException(A0Z(750, 14, 15));
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
            if (0 != 0 && 0 != 0) {
                try {
                    throw new NullPointerException(A0Z(750, 14, 15));
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.EM
    public void A16(long j, boolean z) throws C02609c {
        this.A0M = false;
        this.A0N = false;
        if (this.A06 != null) {
            A1G();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.EM
    public void A17(boolean z) throws C02609c {
        this.A0U = new BC();
    }

    public final MediaCodec A1D() {
        return this.A06;
    }

    public final DG A1E() {
        return this.A0A;
    }

    public DG A1F(DM dm, Format format, boolean z) throws DP {
        return dm.A6m(format.A0O, z);
    }

    public void A1G() throws C02609c {
        this.A05 = -9223372036854775807L;
        A0h();
        A0i();
        this.A0Q = true;
        this.A0R = false;
        this.A0P = false;
        this.A0b.clear();
        this.A0C = false;
        this.A0O = false;
        if (this.A0H || (this.A0E && this.A0K)) {
            A1H();
            A1J();
        } else if (this.A02 != 0) {
            A1H();
            A1J();
        } else {
            this.A06.flush();
            this.A0J = false;
        }
        if (this.A0L && this.A07 != null) {
            this.A01 = 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
    
        if (0 != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e3, code lost:
    
        throw new java.lang.NullPointerException(A0Z(750, 14, 15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d2, code lost:
    
        if (0 != 0) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A1H() {
        this.A05 = -9223372036854775807L;
        A0h();
        A0i();
        this.A0R = false;
        this.A0P = false;
        this.A0b.clear();
        A0g();
        this.A0A = null;
        this.A0L = false;
        this.A0J = false;
        this.A0D = false;
        this.A0H = false;
        this.A00 = 0;
        this.A0G = false;
        this.A0E = false;
        this.A0I = false;
        this.A0C = false;
        this.A0O = false;
        this.A0K = false;
        this.A01 = 0;
        this.A02 = 0;
        if (this.A06 != null) {
            this.A0U.A01++;
            try {
                this.A06.stop();
                try {
                    this.A06.release();
                    this.A06 = null;
                    if (0 != 0 && 0 != 0) {
                        try {
                            throw new NullPointerException(A0Z(750, 14, 15));
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    this.A06 = null;
                    if (0 != 0) {
                        if (A0e[1].charAt(18) != 'w') {
                            throw new RuntimeException();
                        }
                        A0e[1] = "xSjaYNEZ4qh1ZPx8xTwjTufaVWwElX5P";
                        if (0 != 0) {
                            try {
                                throw new NullPointerException(A0Z(750, 14, 15));
                            } finally {
                            }
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.A06.release();
                    this.A06 = null;
                    if (0 != 0) {
                        String[] strArr = A0e;
                        if (strArr[4].length() != strArr[6].length()) {
                            A0e[1] = "DpnT2etBhelIXAl4LKwzAMEbQbMU5HtS";
                        } else {
                            A0e[2] = "TXp75XLN6vD6SaWS";
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.A06 = null;
                    if (0 != 0 && 0 != 0) {
                        try {
                            throw new NullPointerException(A0Z(750, 14, 15));
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    public void A1I() throws C02609c {
    }

    public final void A1J() throws C02609c {
        Format format;
        long j;
        if (this.A06 != null || (format = this.A07) == null) {
            return;
        }
        this.A08 = null;
        String str = format.A0O;
        String[] strArr = A0e;
        if (strArr[7].charAt(15) == strArr[3].charAt(15)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0e;
        strArr2[7] = "pTVSxclXptnWdkcsOldSnbHbt080oNsP";
        strArr2[3] = "3A2dqVKC7anzB9bdQIqtLGHUlM9PHMrl";
        if (0 != 0) {
            throw new NullPointerException(A0Z(709, 14, 53));
        }
        if (this.A0A == null) {
            try {
                DG A1F = A1F(this.A0a, this.A07, false);
                this.A0A = A1F;
                if (A1F == null && 0 != 0) {
                    DG A1F2 = A1F(this.A0a, this.A07, false);
                    this.A0A = A1F2;
                    if (A1F2 != null) {
                        Log.w(A0Z(219, 18, 125), A0Z(Opcodes.I2B, 40, 32) + str + A0Z(0, 58, 64) + this.A0A.A02 + A0Z(58, 1, 4));
                    }
                }
                if (this.A0A == null) {
                    A0k(new DI(this.A07, (Throwable) null, false, -49999));
                    throw null;
                }
            } catch (DP e) {
                A0k(new DI(this.A07, (Throwable) e, false, -49998));
                throw null;
            }
        }
        if (!A1R(this.A0A)) {
            return;
        }
        String str2 = this.A0A.A02;
        this.A00 = A0W(str2);
        this.A0D = A0t(str2, this.A07);
        this.A0H = A0s(str2);
        this.A0G = A0p(this.A0A);
        this.A0E = A0q(str2);
        this.A0F = A0r(str2);
        this.A0I = A0u(str2, this.A07);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            IC.A02(A0Z(665, 12, 94) + str2);
            this.A06 = MediaCodec.createByCodecName(str2);
            IC.A00();
            IC.A02(A0Z(651, 14, 81));
            A1O(this.A0A, this.A06, this.A07, null);
            IC.A00();
            IC.A02(A0Z(764, 10, 125));
            this.A06.start();
            IC.A00();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            A1P(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            A0c();
            if (A81() == 2) {
                j = SystemClock.elapsedRealtime() + 1000;
            } else {
                j = -9223372036854775807L;
            }
            this.A05 = j;
            A0h();
            A0i();
            this.A0Q = true;
            this.A0U.A00++;
        } catch (Exception e2) {
            A0k(new DI(this.A07, (Throwable) e2, false, str2));
            throw null;
        }
    }

    public void A1K(long j) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009b, code lost:
    
        if (r0.A08 == r4.A08) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A1M(Format format) throws C02609c {
        DrmInitData drmInitData;
        MediaCodec mediaCodec;
        boolean z;
        Format format2 = this.A07;
        this.A07 = format;
        DrmInitData drmInitData2 = format.A0H;
        if (format2 == null) {
            drmInitData = null;
        } else {
            drmInitData = format2.A0H;
        }
        if (!IF.A0g(drmInitData2, drmInitData)) {
            Format oldFormat = this.A07;
            if (oldFormat.A0H != null) {
                if (0 != 0) {
                    Looper.myLooper();
                    throw new NullPointerException(A0Z(624, 14, 48));
                }
                throw C02609c.A01(new IllegalStateException(A0Z(Opcodes.INVOKEINTERFACE, 34, 111)), A0z());
            }
            this.A09 = null;
        }
        boolean z2 = false;
        if (0 == 0 && (mediaCodec = this.A06) != null) {
            DG dg = this.A0A;
            Format oldFormat2 = this.A07;
            switch (A1B(mediaCodec, dg, format2, oldFormat2)) {
                case 0:
                    break;
                case 1:
                    z2 = true;
                    break;
                case 2:
                default:
                    throw new IllegalStateException();
                case 3:
                    z2 = true;
                    this.A0L = true;
                    if (A0e[1].charAt(18) != 'w') {
                        throw new RuntimeException();
                    }
                    A0e[5] = "470Pj9QxuaVscsy8pk25MlpSOfE9YJj";
                    this.A01 = 1;
                    int i = this.A00;
                    if (i != 2) {
                        if (i == 1) {
                            Format oldFormat3 = this.A07;
                            if (oldFormat3.A0F == format2.A0F) {
                                Format oldFormat4 = this.A07;
                                break;
                            }
                        }
                        z = false;
                        this.A0C = z;
                        break;
                    }
                    z = true;
                    this.A0C = z;
            }
        }
        if (!z2) {
            if (this.A0J) {
                this.A02 = 1;
            } else {
                A1H();
                A1J();
            }
        }
    }

    public boolean A1R(DG dg) {
        return true;
    }

    @Override // com.meta.analytics.dsp.uinode.Y5
    public boolean A91() {
        return this.A0N;
    }

    @Override // com.meta.analytics.dsp.uinode.Y5
    public boolean A9C() {
        return (this.A07 == null || this.A0R || (!A19() && !A0m() && (this.A05 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.A05))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r6.A06 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        com.meta.analytics.dsp.uinode.IC.A02(A0Z(677, 12, 39));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (A0o(r7, r9) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        if (A0l() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        com.meta.analytics.dsp.uinode.IC.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        r6.A0U.A07 += A10(r7);
        r6.A0Y.A07();
        r0 = A11(r6.A0W, r6.A0Y, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        if (r0 != (-5)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        A1M(r6.A0W.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b7, code lost:
    
        if (r0 != (-4)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
    
        com.meta.analytics.dsp.uinode.AbstractC0445Ha.A04(r6.A0Y.A04());
        r6.A0M = true;
        A0d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
    
        if (r6.A06 != null) goto L19;
     */
    @Override // com.meta.analytics.dsp.uinode.Y5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AFB(long j, long j2) throws C02609c {
        if (this.A0N) {
            A1I();
            String[] strArr = A0e;
            if (strArr[4].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0e[0] = "lwFTUI1opuqPhbxVYngJAvB4EigDaO53";
            return;
        }
        if (this.A07 == null) {
            this.A0Y.A07();
            int result = A11(this.A0W, this.A0Y, true);
            if (result == -5) {
                A1M(this.A0W.A00);
            } else {
                if (result == -4) {
                    AbstractC0445Ha.A04(this.A0Y.A04());
                    this.A0M = true;
                    A0d();
                    return;
                }
                return;
            }
        }
        A1J();
        String[] strArr2 = A0e;
        if (strArr2[4].length() != strArr2[6].length()) {
            A0e[0] = "eroLcdOpjUP85EYGmYhVy7jJ6XqjjMHN";
        } else {
            A0e[1] = "qeXDyPBokWYcVwHFGawdRvPvaKboAA5h";
        }
        this.A0U.A00();
    }

    @Override // com.meta.analytics.dsp.uinode.AA
    public final int AGe(Format format) throws C02609c {
        try {
            return A1C(this.A0a, null, format);
        } catch (DP e) {
            throw C02609c.A01(e, A0z());
        }
    }

    @Override // com.meta.analytics.dsp.uinode.EM, com.meta.analytics.dsp.uinode.AA
    public final int AGg() {
        return 8;
    }
}
