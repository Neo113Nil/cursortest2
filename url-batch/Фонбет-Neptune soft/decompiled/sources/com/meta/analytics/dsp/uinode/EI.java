package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class EI implements Handler.Callback, WQ, InterfaceC0428Gi, InterfaceC0386Ep, C9Z, A6 {
    public static byte[] A0V;
    public static String[] A0W = {"TSIQGmaqgvrUxo0yYDewkVNDuuioOpPV", "LhstooR1wZsH8RVMZSyyF7FJZ5wrHutR", "WZmkRBn8iXpnqDBIN644YOqcruHieEQJ", "OBm1ApV8rqkCiyt7FxArHXpNA0", "RSLtmQKc5IgtmDXEpea3qKBmF", "cT5hSyxhu4oYAFMn61C1ja3cHbuAf9wl", "QQz6Qig88n9IGtqyO", "pBG4ezF2k8D44jdvacVEPM0q7VNUtk0G"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C02699l A04;
    public C02799w A05;
    public InterfaceC0387Eq A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public Y5[] A0C;
    public final long A0D;
    public final Handler A0E;
    public final HandlerThread A0F;
    public final Y8 A0G;
    public final Y6 A0H;
    public final InterfaceC02749r A0J;
    public final AF A0L;
    public final AG A0M;
    public final AbstractC0429Gj A0N;
    public final C0430Gk A0O;
    public final InterfaceC0448Hd A0P;
    public final InterfaceC0458Hn A0Q;
    public final ArrayList<C02679j> A0R;
    public final boolean A0S;
    public final Y5[] A0T;
    public final AA[] A0U;
    public final C02779u A0K = new C02779u();
    public AD A06 = AD.A03;
    public final C02689k A0I = new C02689k();

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0V, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 42);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A07() throws C02609c, IOException {
        long AGs = this.A0P.AGs();
        A0I();
        if (!this.A0K.A0P()) {
            A0B();
            A0R(AGs, 10L);
            return;
        }
        C02759s A0G = this.A0K.A0G();
        IC.A02(A06(Opcodes.FCMPG, 10, 20));
        A0J();
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        A0G.A08.A5A(this.A05.A0A - this.A0D, this.A0S);
        boolean z = true;
        boolean z2 = true;
        for (Y5 y5 : this.A0C) {
            y5.AFB(this.A03, elapsedRealtime);
            boolean z3 = true;
            z = z && y5.A91();
            boolean z4 = y5.A9C() || y5.A91() || A0s(y5);
            if (!z4) {
                y5.AAP();
            }
            if (!z2 || !z4) {
                z3 = false;
            }
            z2 = z3;
        }
        if (!z2) {
            A0B();
        }
        long j = A0G.A02.A01;
        if (z && ((j == -9223372036854775807L || j <= this.A05.A0A) && A0G.A02.A05)) {
            A0N(4);
            A0H();
        } else if (this.A05.A00 == 2 && A0u(z2)) {
            A0N(3);
            if (this.A08) {
                A0G();
            }
        } else if (this.A05.A00 == 3) {
            int length = this.A0C.length;
            String[] strArr = A0W;
            if (strArr[4].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[4] = "Eggx5Ft4Lgnx6HVrotcHBkscR";
            strArr2[3] = "Urp4oA4mdP1paz0o5Y10JqXrCe";
            if (length != 0 ? !z2 : !A0q()) {
                this.A09 = this.A08;
                A0N(2);
                A0H();
            }
        }
        if (this.A05.A00 == 2) {
            for (Y5 y52 : this.A0C) {
                y52.AAP();
            }
        }
        boolean z5 = this.A08;
        if (A0W[7].charAt(9) != '8') {
            throw new RuntimeException();
        }
        A0W[5] = "rTELFOhgZqImPwKgVJI0nXuoysvpkaxO";
        if ((z5 && this.A05.A00 == 3) || this.A05.A00 == 2) {
            A0R(AGs, 10L);
        } else if (this.A0C.length == 0 || this.A05.A00 == 4) {
            this.A0Q.AF8(2);
        } else {
            A0R(AGs, 1000L);
        }
        IC.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r6 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        r7 = r14.A0K.A0G();
        r2 = r14.A0K.A0S(r7);
        r6 = new boolean[r14.A0T.length];
        r10 = r7.A0B(r14.A05.A0A, r2, r6);
        A0i(r7.A03, r7.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r14.A05.A00 == 4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        if (r10 == r14.A05.A0A) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        r8 = r14.A05;
        r14.A05 = r8.A04(r8.A04, r10, r14.A05.A01);
        r14.A0I.A04(4);
        A0P(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        if (com.meta.analytics.dsp.uinode.EI.A0W[2].charAt(12) == 'N') goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        r2 = com.meta.analytics.dsp.uinode.EI.A0W;
        r2[1] = "v6rigB8My08mC5ZvZtTcxONYTtnHkhiY";
        r2[0] = "jJJ7EyTzSHhVUQBMBNjuu6IlWzfsi9o6";
        r8 = new boolean[r14.A0T.length];
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
    
        r1 = r14.A0T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cd, code lost:
    
        if (r10 >= r1.length) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
    
        r11 = r1[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        if (r11.A81() == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
    
        r8[r10] = r0;
        r1 = r7.A0A[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00de, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e0, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e4, code lost:
    
        if (r8[r10] == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ea, code lost:
    
        if (r1 == r11.A84()) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ec, code lost:
    
        A0b(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ef, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f4, code lost:
    
        if (r6[r10] == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f6, code lost:
    
        r4 = r14.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0104, code lost:
    
        if (com.meta.analytics.dsp.uinode.EI.A0W[5].charAt(1) == 'w') goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0106, code lost:
    
        com.meta.analytics.dsp.uinode.EI.A0W[7] = "kUW5tsmcM8CZIAjkj84TOGdyZAx2gWc6";
        r11.AFN(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a3, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0111, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0133, code lost:
    
        r14.A05 = r14.A05.A05(r7.A03, r7.A04);
        A0p(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0113, code lost:
    
        com.meta.analytics.dsp.uinode.EI.A0W[7] = "5RhHFxqKf8KludlSzI9zDK8m295dvAFV";
        r8 = new boolean[r14.A0T.length];
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0143, code lost:
    
        r14.A0K.A0S(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014a, code lost:
    
        if (r5.A06 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014c, code lost:
    
        r5.A0A(java.lang.Math.max(r5.A02.A03, r5.A08(r14.A03)), false);
        A0i(r5.A03, r5.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0128, code lost:
    
        if (r6 != false) goto L20;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0E() throws C02609c {
        if (this.A0K.A0P()) {
            float f = this.A0G.A7h().A01;
            C02759s A0G = this.A0K.A0G();
            C02759s A0H = this.A0K.A0H();
            if (A0W[6].length() == 17) {
                String[] strArr = A0W;
                strArr[1] = "D9etX6yGBrwjRzOUEpEFU5ER5XUfrbIh";
                strArr[0] = "v3YP09X53VrDeZJkDNiGeietvmwAimn0";
                boolean z = true;
                while (A0G != null && A0G.A06) {
                    if (A0G.A0I(f)) {
                        if (A0W[2].charAt(12) != 'N') {
                            A0W[2] = "qdzsaLeT6GVLLZLLIHWPE1kBVsafqqMr";
                        } else {
                            A0W[5] = "7WrBcNkU6uNk4nx5t1RXmqyIgKSjjx3l";
                        }
                        int i = this.A05.A00;
                        if (A0W[6].length() == 17) {
                            String[] strArr2 = A0W;
                            strArr2[4] = "GCKjwcvTJfMpQgG8NpKVbaI1H";
                            strArr2[3] = "kOcbaoLdOMGBVdRezVYeBIh2yM";
                            if (i == 4) {
                                return;
                            }
                            A09();
                            A0J();
                            InterfaceC0458Hn interfaceC0458Hn = this.A0Q;
                            if (A0W[6].length() == 17) {
                                A0W[5] = "0v8QL5oJXgBRdj6LoWxDDzyaCLbuPlQC";
                                interfaceC0458Hn.AFn(2);
                                return;
                            }
                        }
                    } else {
                        if (A0G == A0H) {
                            z = false;
                        }
                        A0G = A0G.A01;
                    }
                }
                return;
            }
            throw new RuntimeException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0193, code lost:
    
        if (r8.A8y() != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0195, code lost:
    
        r10 = r5.A01.A00(r4);
        r9 = r5.A00(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a8, code lost:
    
        if (r3.A0U[r4].A8C() != 5) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01aa, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ab, code lost:
    
        r1 = r7.A03[r4];
        r0 = r5.A03[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b3, code lost:
    
        if (r9 == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b9, code lost:
    
        if (r0.equals(r1) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bb, code lost:
    
        if (r2 != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bd, code lost:
    
        r8.AFD(A0v(r10), r6.A0A[r4], r6.A07());
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01cf, code lost:
    
        r8.AFy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01cd, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01d4, code lost:
    
        if (r4 >= r8.length) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01d9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01d7, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00fe, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        if (r6 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cb, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
    
        if (r6 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        if (r4.A02.A05 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d4, code lost:
    
        r1 = r3.A0T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
    
        if (r5 >= r1.length) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d9, code lost:
    
        r2 = r1[r5];
        r1 = r4.A0A[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00df, code lost:
    
        if (r1 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e5, code lost:
    
        if (r2.A84() != r1) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00eb, code lost:
    
        if (r2.A8a() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
    
        r2.AFy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f6, code lost:
    
        if (r4.A01 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fc, code lost:
    
        if (r4.A01.A06 != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ff, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0100, code lost:
    
        r1 = r3.A0T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0103, code lost:
    
        if (r6 >= r1.length) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0105, code lost:
    
        r8 = r1[r6];
        r7 = r4.A0A[r6];
        r5 = r8.A84();
        r2 = com.meta.analytics.dsp.uinode.EI.A0W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0121, code lost:
    
        if (r2[1].charAt(10) == r2[0].charAt(10)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0123, code lost:
    
        com.meta.analytics.dsp.uinode.EI.A0W[2] = "GzZd6F7lJVp08TeGQitpN19OrvCnG4PK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012a, code lost:
    
        if (r5 != r7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012c, code lost:
    
        if (r7 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0132, code lost:
    
        if (r8.A8a() != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0134, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0135, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0138, code lost:
    
        com.meta.analytics.dsp.uinode.EI.A0W[5] = "G5Kl7lcZBM87T4fNUwO1IYVdGnNcsgpo";
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x013f, code lost:
    
        if (r5 != r7) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0142, code lost:
    
        r7 = r4.A04;
        r6 = r3.A0K.A0D();
        r5 = r6.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0159, code lost:
    
        if (r6.A08.AEL() == (-9223372036854775807L)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x015b, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015c, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015d, code lost:
    
        r8 = r3.A0T;
        r2 = com.meta.analytics.dsp.uinode.EI.A0W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0171, code lost:
    
        if (r2[1].charAt(10) == r2[0].charAt(10)) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0173, code lost:
    
        com.meta.analytics.dsp.uinode.EI.A0W[5] = "zgqvIFw9hHXttypZtkJx3efsgqUZ32NO";
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017b, code lost:
    
        if (r4 >= r8.length) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017d, code lost:
    
        r8 = r8[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0183, code lost:
    
        if (r7.A00(r4) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0189, code lost:
    
        if (r11 == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x018b, code lost:
    
        r8.AFy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0185, code lost:
    
        r4 = r4 + 1;
        r3 = r12;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0I() throws C02609c, IOException {
        int i;
        EI ei = this;
        InterfaceC0387Eq interfaceC0387Eq = ei.A07;
        if (interfaceC0387Eq == null) {
            return;
        }
        if (ei.A01 > 0) {
            interfaceC0387Eq.AAO();
            return;
        }
        A0C();
        C02759s A0F = ei.A0K.A0F();
        if (A0F == null || A0F.A0H()) {
            ei.A0k(false);
        } else if (!ei.A05.A08) {
            A09();
        }
        if (!ei.A0K.A0P()) {
            return;
        }
        C02759s A0G = ei.A0K.A0G();
        C02759s A0H = ei.A0K.A0H();
        boolean z = false;
        while (true) {
            boolean z2 = ei.A08;
            if (A0W[6].length() != 17) {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[4] = "7VXwhx8w334qXwwhe6EPuoxrs";
            strArr[3] = "i8G0S3EG91lb4Tbi5TJ2bFfoM2";
            if (!z2 || A0G == A0H || ei.A03 < A0G.A01.A00) {
                break;
            }
            if (z) {
                A0A();
            }
            boolean z3 = A0G.A02.A06;
            String[] strArr2 = A0W;
            if (strArr2[1].charAt(10) != strArr2[0].charAt(10)) {
                A0W[7] = "JHuaS3X828K0z1yeMtavkm7JkVnfol1Z";
            } else {
                A0W[5] = "wtrsjVL1JaCAi24uhunV07R35PJNTCvI";
            }
            C02759s c02759s = A0G;
            A0G = ei.A0K.A0C();
            ei.A0V(c02759s);
            ei.A05 = ei.A05.A04(A0G.A02.A04, A0G.A02.A03, A0G.A02.A00);
            ei.A0I.A04(i);
            A0J();
            z = true;
        }
    }

    public static void A0K() {
        byte[] bArr = {68, 121, 110, 81, 109, 96, 120, 100, 115, 72, 108, 113, 109, 72, 111, 117, 100, 115, 111, 96, 109, 111, 82, 69, 122, 70, 75, 83, 79, 88, 99, 71, 90, 70, 99, 68, 94, 79, 88, 68, 75, 70, 16, 98, 75, 68, 78, 70, 79, 88, 66, 108, 101, 100, 121, 98, 101, 108, 43, 102, 110, 120, 120, 106, 108, 110, 120, 43, 120, 110, 101, Byte.MAX_VALUE, 43, 106, 109, Byte.MAX_VALUE, 110, 121, 43, 121, 110, 103, 110, 106, 120, 110, 37, 69, 98, 120, 105, 126, 98, 109, 96, 44, 126, 121, 98, 120, 101, 97, 105, 44, 105, 126, 126, 99, 126, 34, Ascii.CAN, 36, 41, 49, 42, 41, 43, 35, 104, 45, 58, 58, 39, 58, 102, 74, 118, 108, 107, 122, 124, 57, 124, 107, 107, 118, 107, 55, 72, 111, 116, 107, 59, 125, 122, 114, 119, 126, Byte.MAX_VALUE, 53, 90, 81, 109, 81, 83, 91, 105, 81, 76, 85};
        String[] strArr = A0W;
        if (strArr[1].charAt(10) == strArr[0].charAt(10)) {
            throw new RuntimeException();
        }
        A0W[7] = "OuUcfGxYs8HKuxzYIQS3N8YCcqwYwO9D";
        A0V = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0S(C02669i c02669i) throws C02609c {
        if (c02669i.A01 != this.A07) {
            return;
        }
        AH ah = this.A05.A03;
        AH ah2 = c02669i.A00;
        Object obj = c02669i.A02;
        this.A0K.A0N(ah2);
        this.A05 = this.A05.A03(ah2, obj);
        A0F();
        int i = this.A01;
        if (i > 0) {
            this.A0I.A03(i);
            this.A01 = 0;
            C02699l c02699l = this.A04;
            if (c02699l != null) {
                Pair<Integer, Long> A04 = A04(c02699l, true);
                this.A04 = null;
                if (A04 == null) {
                    A08();
                    return;
                }
                int intValue = ((Integer) A04.first).intValue();
                long longValue = ((Long) A04.second).longValue();
                C0385Eo A0L = this.A0K.A0L(intValue, longValue);
                this.A05 = this.A05.A04(A0L, A0L.A01() ? 0L : longValue, longValue);
                return;
            }
            if (this.A05.A02 == -9223372036854775807L) {
                if (ah2.A0E()) {
                    A08();
                    return;
                }
                Pair<Integer, Long> A05 = A05(ah2, ah2.A05(this.A0B), -9223372036854775807L);
                int intValue2 = ((Integer) A05.first).intValue();
                long longValue2 = ((Long) A05.second).longValue();
                C0385Eo A0L2 = this.A0K.A0L(intValue2, longValue2);
                this.A05 = this.A05.A04(A0L2, A0L2.A01() ? 0L : longValue2, longValue2);
                return;
            }
            return;
        }
        int i2 = this.A05.A04.A02;
        long j = this.A05.A01;
        if (ah.A0E()) {
            if (ah2.A0E()) {
                return;
            }
            C0385Eo A0L3 = this.A0K.A0L(i2, j);
            this.A05 = this.A05.A04(A0L3, A0L3.A01() ? 0L : j, j);
            return;
        }
        C02759s A0E = this.A0K.A0E();
        int A042 = ah2.A04(A0E == null ? ah.A0A(i2, this.A0L, true).A03 : A0E.A09);
        if (A042 != -1) {
            if (A042 != i2) {
                this.A05 = this.A05.A01(A042);
            }
            C0385Eo c0385Eo = this.A05.A04;
            if (c0385Eo.A01()) {
                C0385Eo A0L4 = this.A0K.A0L(A042, j);
                if (!A0L4.equals(c0385Eo)) {
                    this.A05 = this.A05.A04(A0L4, A02(A0L4, A0L4.A01() ? 0L : j), j);
                    return;
                }
            }
            if (this.A0K.A0U(c0385Eo, this.A03)) {
                return;
            }
            A0j(false);
            return;
        }
        int A01 = A01(i2, ah, ah2);
        if (A0W[2].charAt(12) == 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A0W;
        strArr[4] = "W6zkXP9eIZkyJx4uPbHf9NTX6";
        strArr[3] = "m3yrwIeXeqUIkhQgLJp1WNCsrl";
        if (A01 == -1) {
            A08();
            return;
        }
        Pair<Integer, Long> A052 = A05(ah2, ah2.A09(A01, this.A0L).A00, -9223372036854775807L);
        int intValue3 = ((Integer) A052.first).intValue();
        long longValue3 = ((Long) A052.second).longValue();
        C0385Eo A0L5 = this.A0K.A0L(intValue3, longValue3);
        ah2.A0A(intValue3, this.A0L, true);
        if (A0E != null) {
            Object obj2 = this.A0L.A03;
            A0E.A02 = A0E.A02.A00(-1);
            while (A0E.A01 != null) {
                A0E = A0E.A01;
                if (A0E.A09.equals(obj2)) {
                    C02779u c02779u = this.A0K;
                    C02769t c02769t = A0E.A02;
                    if (A0W[2].charAt(12) == 'N') {
                        throw new RuntimeException();
                    }
                    A0W[5] = "ODoCru5Men7rnsumvsVlRJsOWyiHNrdt";
                    A0E.A02 = c02779u.A0J(c02769t, intValue3);
                } else {
                    A0E.A02 = A0E.A02.A00(-1);
                }
            }
        }
        boolean A012 = A0L5.A01();
        if (A0W[6].length() != 17) {
            throw new RuntimeException();
        }
        A0W[7] = "hRbRvIJE18IQkSZp4h0fxN12mLMfZDhd";
        this.A05 = this.A05.A04(A0L5, A02(A0L5, A012 ? 0L : longValue3), longValue3);
    }

    static {
        A0K();
    }

    public EI(Y5[] y5Arr, AbstractC0429Gj abstractC0429Gj, C0430Gk c0430Gk, InterfaceC02749r interfaceC02749r, boolean z, int i, boolean z2, Handler handler, Y6 y6, InterfaceC0448Hd interfaceC0448Hd) {
        this.A0T = y5Arr;
        this.A0N = abstractC0429Gj;
        this.A0O = c0430Gk;
        this.A0J = interfaceC02749r;
        this.A08 = z;
        this.A02 = i;
        this.A0B = z2;
        this.A0E = handler;
        this.A0H = y6;
        this.A0P = interfaceC0448Hd;
        this.A0D = interfaceC02749r.A65();
        this.A0S = interfaceC02749r.AFO();
        this.A05 = new C02799w(AH.A01, -9223372036854775807L, TrackGroupArray.A04, c0430Gk);
        this.A0U = new AA[y5Arr.length];
        for (int i2 = 0; i2 < y5Arr.length; i2++) {
            y5Arr[i2].AG2(i2);
            this.A0U[i2] = y5Arr[i2].A6I();
        }
        this.A0G = new Y8(this, interfaceC0448Hd);
        this.A0R = new ArrayList<>();
        this.A0C = new Y5[0];
        this.A0M = new AG();
        this.A0L = new AF();
        abstractC0429Gj.A00(this);
        HandlerThread handlerThread = new HandlerThread(A06(21, 29, 0), -16);
        this.A0F = handlerThread;
        handlerThread.start();
        this.A0Q = interfaceC0448Hd.A4c(handlerThread.getLooper(), this);
    }

    private int A00() {
        AH ah = this.A05.A03;
        if (ah.A0E()) {
            return 0;
        }
        return ah.A0B(ah.A05(this.A0B), this.A0M).A00;
    }

    private int A01(int i, AH ah, AH ah2) {
        int i2 = i;
        int maxIterations = -1;
        int A00 = ah.A00();
        for (int i3 = 0; i3 < A00 && maxIterations == -1; i3++) {
            i2 = ah.A03(i2, this.A0L, this.A0M, this.A02, this.A0B);
            if (i2 == -1) {
                break;
            }
            maxIterations = ah2.A04(ah.A0A(i2, this.A0L, true).A03);
        }
        return maxIterations;
    }

    private long A02(C0385Eo c0385Eo, long j) throws C02609c {
        return A03(c0385Eo, j, this.A0K.A0G() != this.A0K.A0H());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r4 != r3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (r12 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        A0V(r4);
        r2 = com.meta.analytics.dsp.uinode.EI.A0W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        if (r2[1].charAt(10) == r2[0].charAt(10)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        r2 = com.meta.analytics.dsp.uinode.EI.A0W;
        r2[4] = "JYav744H3005gGdd3wHQ67gij";
        r2[3] = "FVGbgJ3f5rxs8oy2Mt1O3WpPvx";
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (r3.A05 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        r10 = r3.A08.AFl(r10);
        r7 = r3.A08;
        r2 = r10 - r8.A0D;
        r6 = r8.A0S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:
    
        if (com.meta.analytics.dsp.uinode.EI.A0W[7].charAt(9) == '8') goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b2, code lost:
    
        com.meta.analytics.dsp.uinode.EI.A0W[7] = "LvYFslBjN8wEk55S4mS5Jlrj4VNptxmz";
        r7.A5A(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bc, code lost:
    
        A0P(r10);
        A09();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c2, code lost:
    
        r8.A0Q.AFn(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d4, code lost:
    
        if (com.meta.analytics.dsp.uinode.EI.A0W[2].charAt(12) == 'N') goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d6, code lost:
    
        com.meta.analytics.dsp.uinode.EI.A0W[2] = "qbdkiXSPlbFYutVyIKxCWSr3uDHCS3n2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dd, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        if (r3.A05 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        r8.A0K.A0O(true);
        A0P(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003d, code lost:
    
        r4 = r8.A0C;
        r2 = r4.length;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0041, code lost:
    
        if (r1 >= r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0043, code lost:
    
        A0b(r4[r1]);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0052, code lost:
    
        r8.A0C = new com.meta.analytics.dsp.uinode.Y5[0];
        r4 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long A03(C0385Eo c0385Eo, long j, boolean z) throws C02609c {
        A0H();
        this.A09 = false;
        A0N(2);
        C02759s A0G = this.A0K.A0G();
        C02759s newPlayingPeriodHolder = A0G;
        while (true) {
            if (newPlayingPeriodHolder == null) {
                break;
            }
            boolean A0t = A0t(c0385Eo, j, newPlayingPeriodHolder);
            String[] strArr = A0W;
            if (strArr[1].charAt(10) == strArr[0].charAt(10)) {
                break;
            }
            A0W[7] = "3g90ZjAQy8gphAPE4L2ghHg16cmQ019E";
            if (A0t) {
                this.A0K.A0S(newPlayingPeriodHolder);
                break;
            }
            newPlayingPeriodHolder = this.A0K.A0C();
        }
        throw new RuntimeException();
    }

    private Pair<Integer, Long> A04(C02699l c02699l, boolean z) {
        int A01;
        AH ah = this.A05.A03;
        AH ah2 = c02699l.A02;
        if (ah.A0E()) {
            return null;
        }
        if (ah2.A0E()) {
            ah2 = ah;
        }
        try {
            Pair<Integer, Long> A07 = ah2.A07(this.A0M, this.A0L, c02699l.A00, c02699l.A01);
            if (ah == ah2) {
                return A07;
            }
            int A04 = ah.A04(ah2.A0A(((Integer) A07.first).intValue(), this.A0L, true).A03);
            if (A04 != -1) {
                return Pair.create(Integer.valueOf(A04), (Long) A07.second);
            }
            if (!z || (A01 = A01(((Integer) A07.first).intValue(), ah2, ah)) == -1) {
                return null;
            }
            Pair<Integer, Long> A05 = A05(ah, ah.A09(A01, this.A0L).A00, -9223372036854775807L);
            String[] strArr = A0W;
            if (strArr[4].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[1] = "LZRu6qU1d7MAJxELkyp6D6bqJ9pCtQWv";
            strArr2[0] = "5OOlDtGsHYXmvjCA2lYHypc4I8JTMes9";
            return A05;
        } catch (IndexOutOfBoundsException unused) {
            throw new C02739q(ah, c02699l.A00, c02699l.A01);
        }
    }

    private Pair<Integer, Long> A05(AH ah, int i, long j) {
        return ah.A07(this.A0M, this.A0L, i, j);
    }

    private void A08() {
        A0N(4);
        A0o(false, true, false);
    }

    private void A09() {
        C02759s A0F = this.A0K.A0F();
        long nextLoadPositionUs = A0F.A06();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            A0k(false);
            return;
        }
        boolean AGI = this.A0J.AGI(nextLoadPositionUs - A0F.A08(this.A03), this.A0G.A7h().A01);
        A0k(AGI);
        if (AGI) {
            A0F.A0F(this.A03);
        }
    }

    private void A0A() {
        int i;
        boolean z;
        int i2;
        if (this.A0I.A06(this.A05)) {
            Handler handler = this.A0E;
            i = this.A0I.A01;
            z = this.A0I.A03;
            if (z) {
                i2 = this.A0I.A00;
            } else {
                i2 = -1;
            }
            handler.obtainMessage(0, i, i2, this.A05).sendToTarget();
            this.A0I.A05(this.A05);
        }
    }

    private void A0B() throws IOException {
        C02759s A0F = this.A0K.A0F();
        C02759s readingPeriodHolder = this.A0K.A0H();
        if (A0F != null && !A0F.A06) {
            if (readingPeriodHolder != null) {
                C02759s loadingPeriodHolder = readingPeriodHolder.A01;
                if (loadingPeriodHolder != A0F) {
                    return;
                }
            }
            Y5[] y5Arr = this.A0C;
            if (A0W[2].charAt(12) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[4] = "M2PhxJTgTMxoek0nGdRGZ8ED7";
            strArr[3] = "JhH24KrsERDOvzAX41swXn1Uhz";
            for (Y5 y5 : y5Arr) {
                if (!y5.A8a()) {
                    return;
                }
            }
            A0F.A08.AAN();
        }
    }

    private void A0C() throws IOException {
        this.A0K.A0M(this.A03);
        if (this.A0K.A0Q()) {
            C02769t A0I = this.A0K.A0I(this.A03, this.A05);
            if (A0I == null) {
                this.A07.AAO();
                return;
            }
            WP mediaPeriod = this.A0K.A0K(this.A0U, this.A0N, this.A0J.A60(), this.A07, this.A05.A03.A0A(A0I.A04.A02, this.A0L, true).A03, A0I);
            mediaPeriod.AE4(this, A0I.A03);
            A0k(true);
        }
    }

    private void A0D() {
        A0o(true, true, true);
        this.A0J.ACr();
        A0N(1);
        this.A0F.quit();
        synchronized (this) {
            this.A0A = true;
            notifyAll();
        }
    }

    private void A0F() {
        for (int size = this.A0R.size() - 1; size >= 0; size--) {
            if (!A0r(this.A0R.get(size))) {
                this.A0R.get(size).A03.A0A(false);
                this.A0R.remove(size);
            }
        }
        Collections.sort(this.A0R);
    }

    private void A0G() throws C02609c {
        this.A09 = false;
        this.A0G.A05();
        for (Y5 y5 : this.A0C) {
            y5.start();
        }
    }

    private void A0H() throws C02609c {
        this.A0G.A06();
        for (Y5 y5 : this.A0C) {
            A0c(y5);
        }
    }

    private void A0J() throws C02609c {
        long A0C;
        if (!this.A0K.A0P()) {
            return;
        }
        C02759s A0G = this.A0K.A0G();
        WP wp = A0G.A08;
        if (A0W[6].length() != 17) {
            throw new RuntimeException();
        }
        A0W[7] = "e9etinPRA8BQH2CZknXr4yAbSJ3blA39";
        long AEL = wp.AEL();
        if (AEL != -9223372036854775807L) {
            A0P(AEL);
            if (AEL != this.A05.A0A) {
                C02799w c02799w = this.A05;
                C0385Eo c0385Eo = c02799w.A04;
                long periodPositionUs = this.A05.A01;
                this.A05 = c02799w.A04(c0385Eo, AEL, periodPositionUs);
                this.A0I.A04(4);
            }
        } else {
            long A04 = this.A0G.A04();
            this.A03 = A04;
            long A08 = A0G.A08(A04);
            A0Q(this.A05.A0A, A08);
            this.A05.A0A = A08;
        }
        C02799w c02799w2 = this.A05;
        if (this.A0C.length == 0) {
            A0C = A0G.A02.A01;
        } else {
            A0C = A0G.A0C(true);
        }
        c02799w2.A09 = A0C;
    }

    private void A0L(float f) {
        for (C02759s A0E = this.A0K.A0E(); A0E != null; A0E = A0E.A01) {
            C0430Gk c0430Gk = A0E.A04;
            if (A0W[7].charAt(9) != '8') {
                throw new RuntimeException();
            }
            A0W[5] = "TmHCYSIZuHNmxK6kBnR58JopztOBcNrn";
            if (c0430Gk != null) {
                for (InterfaceC0426Gg interfaceC0426Gg : A0E.A04.A01.A01()) {
                    if (interfaceC0426Gg != null) {
                        interfaceC0426Gg.ACc(f);
                    }
                }
            }
        }
    }

    private void A0M(int i) throws C02609c {
        this.A02 = i;
        if (!this.A0K.A0R(i)) {
            A0j(true);
        }
    }

    private void A0N(int i) {
        if (this.A05.A00 != i) {
            C02799w A02 = this.A05.A02(i);
            if (A0W[7].charAt(9) != '8') {
                throw new RuntimeException();
            }
            A0W[2] = "kM2qExU4ybhQ7HWfawBquzR2zjX0F4jA";
            this.A05 = A02;
        }
    }

    private void A0O(int i, boolean playing, int i2) throws C02609c {
        C02759s playingPeriodHolder = this.A0K.A0G();
        Y5 y5 = this.A0T[i];
        this.A0C[i2] = y5;
        if (y5.A81() == 0) {
            AB ab = playingPeriodHolder.A04.A03[i];
            String[] strArr = A0W;
            if (strArr[1].charAt(10) == strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0W[2] = "NYdCxyfB4qBB5fQElsuicf6C6huVudSr";
            Format[] A0v = A0v(playingPeriodHolder.A04.A01.A00(i));
            boolean z = this.A08 && this.A05.A00 == 3;
            y5.A5V(ab, A0v, playingPeriodHolder.A0A[i], this.A03, !playing && z, playingPeriodHolder.A07());
            this.A0G.A09(y5);
            if (z) {
                y5.start();
            }
        }
    }

    private void A0P(long j) throws C02609c {
        if (this.A0K.A0P()) {
            j = this.A0K.A0G().A09(j);
        }
        this.A03 = j;
        this.A0G.A07(j);
        for (Y5 y5 : this.A0C) {
            y5.AFN(this.A03);
        }
    }

    private void A0Q(long j, long j2) throws C02609c {
        C02679j c02679j;
        if (this.A0R.isEmpty() || this.A05.A04.A01()) {
            return;
        }
        if (this.A05.A02 == j) {
            j--;
        }
        C02799w c02799w = this.A05;
        if (A0W[2].charAt(12) == 'N') {
            throw new RuntimeException();
        }
        A0W[2] = "iI9novLuZIFAEfCO4qiE3Y1J9OFTcxg5";
        int i = c02799w.A04.A02;
        int currentPeriodIndex = this.A00;
        C02679j c02679j2 = currentPeriodIndex > 0 ? this.A0R.get(currentPeriodIndex - 1) : null;
        while (c02679j2 != null) {
            if (c02679j2.A00 <= i) {
                int i2 = c02679j2.A00;
                if (A0W[7].charAt(9) == '8') {
                    A0W[2] = "hDlIvL5rLgyE5VG4VUIth4YrdDyvlxxs";
                    if (i2 == i) {
                        if (c02679j2.A01 <= j) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            int currentPeriodIndex2 = this.A00 - 1;
            this.A00 = currentPeriodIndex2;
            c02679j2 = currentPeriodIndex2 > 0 ? this.A0R.get(currentPeriodIndex2 - 1) : null;
        }
        if (this.A00 < this.A0R.size()) {
            c02679j = this.A0R.get(this.A00);
        } else {
            c02679j = null;
        }
        while (c02679j != null && c02679j.A02 != null && (c02679j.A00 < i || (c02679j.A00 == i && c02679j.A01 <= j))) {
            int i3 = this.A00 + 1;
            this.A00 = i3;
            if (i3 < this.A0R.size()) {
                c02679j = this.A0R.get(this.A00);
            } else {
                c02679j = null;
            }
        }
        while (c02679j != null && c02679j.A02 != null && c02679j.A00 == i && c02679j.A01 > j && c02679j.A01 <= j2) {
            A0Z(c02679j.A03);
            if (c02679j.A03.A0B() || c02679j.A03.A0D()) {
                this.A0R.remove(this.A00);
            } else {
                this.A00++;
            }
            if (this.A00 < this.A0R.size()) {
                ArrayList<C02679j> arrayList = this.A0R;
                int i4 = this.A00;
                if (A0W[5].charAt(1) == 'w') {
                    throw new RuntimeException();
                }
                A0W[6] = "2inRqgHKNmW90mXz8";
                c02679j = arrayList.get(i4);
            } else {
                c02679j = null;
            }
        }
    }

    private void A0R(long j, long j2) {
        this.A0Q.AF8(2);
        this.A0Q.AFo(2, j + j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0T(C02699l c02699l) throws C02609c {
        long longValue;
        C0385Eo A0L;
        long longValue2;
        boolean seekPositionAdjusted;
        this.A0I.A03(1);
        Pair<Integer, Long> resolvedSeekPosition = A04(c02699l, true);
        if (resolvedSeekPosition == null) {
            A0L = new C0385Eo(A00());
            longValue2 = -9223372036854775807L;
            longValue = -9223372036854775807L;
            seekPositionAdjusted = true;
        } else {
            int intValue = ((Integer) resolvedSeekPosition.first).intValue();
            longValue = ((Long) resolvedSeekPosition.second).longValue();
            A0L = this.A0K.A0L(intValue, longValue);
            if (A0L.A01()) {
                longValue2 = 0;
                seekPositionAdjusted = true;
            } else {
                longValue2 = ((Long) resolvedSeekPosition.second).longValue();
                seekPositionAdjusted = c02699l.A01 == -9223372036854775807L;
            }
        }
        try {
            try {
                if (this.A07 != null && this.A01 <= 0) {
                    if (A0W[5].charAt(1) != 'w') {
                        A0W[5] = "YfoxJXVxtggAgJ3C0qUN5WGXkfVCteCk";
                        try {
                            if (longValue2 == -9223372036854775807L) {
                                A0N(4);
                                A0o(false, true, false);
                            } else {
                                long j = longValue2;
                                if (A0L.equals(this.A05.A04)) {
                                    C02759s A0G = this.A0K.A0G();
                                    if (A0G != null && j != 0) {
                                        j = A0G.A08.A5x(j, this.A06);
                                    }
                                    long contentPositionUs = C9W.A01(j);
                                    long newPeriodPositionUs = this.A05.A0A;
                                    if (contentPositionUs == C9W.A01(newPeriodPositionUs)) {
                                        this.A05 = this.A05.A04(A0L, this.A05.A0A, longValue);
                                        if (seekPositionAdjusted) {
                                            this.A0I.A04(2);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                long A02 = A02(A0L, j);
                                seekPositionAdjusted |= longValue2 != A02;
                                if (A0W[6].length() == 17) {
                                    A0W[7] = "LtwUHLpv08wEzos7LWvR75PA6MqqEvuh";
                                    longValue2 = A02;
                                }
                            }
                            this.A05 = this.A05.A04(A0L, longValue2, longValue);
                            if (!seekPositionAdjusted) {
                                C02689k c02689k = this.A0I;
                                String[] strArr = A0W;
                                if (strArr[4].length() != strArr[3].length()) {
                                    A0W[6] = "NnvGpWmx2ly54VvtA";
                                    c02689k.A04(2);
                                    return;
                                } else {
                                    c02689k.A04(2);
                                    return;
                                }
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            this.A05 = this.A05.A04(A0L, longValue2, longValue);
                            if (seekPositionAdjusted) {
                                this.A0I.A04(2);
                            }
                            throw th;
                        }
                    }
                    throw new RuntimeException();
                }
                this.A04 = c02699l;
                this.A05 = this.A05.A04(A0L, longValue2, longValue);
                if (!seekPositionAdjusted) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void A0V(C02759s c02759s) throws C02609c {
        C02759s A0G = this.A0K.A0G();
        if (A0G == null || c02759s == A0G) {
            return;
        }
        int i = 0;
        boolean[] zArr = new boolean[this.A0T.length];
        int i2 = 0;
        while (true) {
            Y5[] y5Arr = this.A0T;
            if (i2 < y5Arr.length) {
                Y5 y5 = y5Arr[i2];
                zArr[i2] = y5.A81() != 0;
                if (A0G.A04.A00(i2)) {
                    i++;
                }
                if (zArr[i2] && (!A0G.A04.A00(i2) || (y5.A8y() && y5.A84() == c02759s.A0A[i2]))) {
                    A0b(y5);
                }
                i2++;
            } else {
                this.A05 = this.A05.A05(A0G.A03, A0G.A04);
                A0p(zArr, i);
                return;
            }
        }
    }

    private void A0W(C02809x c02809x) {
        this.A0G.AGA(c02809x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(A8 a8) throws C02609c {
        if (a8.A0D()) {
            return;
        }
        try {
            a8.A04().A8V(a8.A00(), a8.A09());
            a8.A0A(true);
            String[] strArr = A0W;
            if (strArr[1].charAt(10) == strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[4] = "j7cBoz179DrNpy3qD7RptXNd9";
            strArr2[3] = "0iwSWX3dM4PAnuiRq1LulMUFPW";
        } catch (Throwable th) {
            a8.A0A(true);
            throw th;
        }
    }

    private void A0Y(A8 a8) throws C02609c {
        if (a8.A02() == -9223372036854775807L) {
            A0Z(a8);
            return;
        }
        if (this.A07 == null || this.A01 > 0) {
            this.A0R.add(new C02679j(a8));
            return;
        }
        C02679j c02679j = new C02679j(a8);
        if (A0r(c02679j)) {
            this.A0R.add(c02679j);
            Collections.sort(this.A0R);
        } else {
            a8.A0A(false);
        }
    }

    private void A0Z(A8 a8) throws C02609c {
        if (a8.A03().getLooper() == this.A0Q.A7L()) {
            A0X(a8);
            C02799w c02799w = this.A05;
            if (A0W[6].length() != 17) {
                throw new RuntimeException();
            }
            A0W[5] = "cBEQE15IFXZqMCE104UHZMDgeC8qTiqN";
            if (c02799w.A00 == 3 || this.A05.A00 == 2) {
                this.A0Q.AFn(2);
                return;
            }
            return;
        }
        this.A0Q.AAb(15, a8).sendToTarget();
    }

    private void A0a(final A8 a8) {
        a8.A03().post(new Runnable() { // from class: com.facebook.ads.redexgen.X.9h
            public static byte[] A02;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 14);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A02 = new byte[]{-60, -9, -18, -49, -21, -32, -8, -28, -15, -56, -20, -17, -21, -56, -19, -13, -28, -15, -19, -32, -21, -52, -27, -36, -17, -25, -36, -38, -21, -36, -37, -105, -36, -23, -23, -26, -23, -105, -37, -36, -29, -32, -19, -36, -23, -32, -27, -34, -105, -28, -36, -22, -22, -40, -34, -36, -105, -26, -27, -105, -36, -17, -21, -36, -23, -27, -40, -29, -105, -21, -33, -23, -36, -40, -37, -91};
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (KL.A02(this)) {
                    return;
                }
                try {
                    try {
                        EI.this.A0X(a8);
                    } catch (C02609c e) {
                        Log.e(A00(0, 21, 113), A00(21, 55, 105), e);
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    KL.A00(th, this);
                }
            }
        });
    }

    private void A0b(Y5 y5) throws C02609c {
        this.A0G.A08(y5);
        A0c(y5);
        y5.A58();
    }

    private void A0c(Y5 y5) throws C02609c {
        if (y5.A81() == 2) {
            y5.stop();
        }
    }

    private void A0d(AD ad) {
        this.A06 = ad;
    }

    private void A0e(WP wp) {
        if (!this.A0K.A0T(wp)) {
            return;
        }
        this.A0K.A0M(this.A03);
        A09();
    }

    private void A0f(WP wp) throws C02609c {
        if (!this.A0K.A0T(wp)) {
            return;
        }
        C02759s A0F = this.A0K.A0F();
        A0F.A0E(this.A0G.A7h().A01);
        A0i(A0F.A03, A0F.A04);
        if (!this.A0K.A0P()) {
            C02759s loadingPeriodHolder = this.A0K.A0C();
            A0P(loadingPeriodHolder.A02.A03);
            A0V(null);
        }
        A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.FC
    /* renamed from: A0g, reason: merged with bridge method [inline-methods] */
    public final void ABC(WP wp) {
        this.A0Q.AAb(10, wp).sendToTarget();
    }

    private void A0h(InterfaceC0387Eq interfaceC0387Eq, boolean z, boolean z2) {
        this.A01++;
        A0o(true, z, z2);
        this.A0J.onPrepared();
        this.A07 = interfaceC0387Eq;
        A0N(2);
        interfaceC0387Eq.AE7(this.A0H, true, this);
        this.A0Q.AFn(2);
    }

    private void A0i(TrackGroupArray trackGroupArray, C0430Gk c0430Gk) {
        this.A0J.ADN(this.A0T, trackGroupArray, c0430Gk.A01);
    }

    private void A0j(boolean z) throws C02609c {
        C0385Eo c0385Eo = this.A0K.A0G().A02.A04;
        long A03 = A03(c0385Eo, this.A05.A0A, true);
        if (A03 != this.A05.A0A) {
            C02799w c02799w = this.A05;
            this.A05 = c02799w.A04(c0385Eo, A03, c02799w.A01);
            if (z) {
                this.A0I.A04(4);
            }
        }
    }

    private void A0k(boolean z) {
        if (this.A05.A08 != z) {
            this.A05 = this.A05.A06(z);
        }
    }

    private void A0l(boolean z) throws C02609c {
        this.A09 = false;
        this.A08 = z;
        if (!z) {
            A0H();
            A0J();
        } else if (this.A05.A00 == 3) {
            A0G();
            this.A0Q.AFn(2);
        } else {
            if (this.A05.A00 != 2) {
                return;
            }
            this.A0Q.AFn(2);
        }
    }

    private void A0m(boolean z) throws C02609c {
        this.A0B = z;
        if (!this.A0K.A0V(z)) {
            A0j(true);
        }
    }

    private void A0n(boolean z, boolean z2) {
        A0o(true, z, z);
        this.A0I.A03(this.A01 + (z2 ? 1 : 0));
        this.A01 = 0;
        this.A0J.ADF();
        A0N(1);
    }

    private void A0o(boolean z, boolean z2, boolean z3) {
        Object obj;
        long j;
        C0430Gk c0430Gk;
        InterfaceC0387Eq interfaceC0387Eq;
        this.A0Q.AF8(2);
        this.A09 = false;
        this.A0G.A06();
        this.A03 = 0L;
        for (Y5 y5 : this.A0C) {
            try {
                A0b(y5);
            } catch (C02609c | RuntimeException e) {
                Log.e(A06(0, 21, 43), A06(Opcodes.L2D, 12, 49), e);
            }
        }
        this.A0C = new Y5[0];
        this.A0K.A0O(!z2);
        A0k(false);
        if (z2) {
            this.A04 = null;
        }
        if (z3) {
            this.A0K.A0N(AH.A01);
            Iterator<C02679j> it = this.A0R.iterator();
            while (it.hasNext()) {
                it.next().A03.A0A(false);
            }
            this.A0R.clear();
            this.A00 = 0;
        }
        AH ah = z3 ? AH.A01 : this.A05.A03;
        if (z3) {
            obj = null;
        } else {
            obj = this.A05.A07;
        }
        C0385Eo c0385Eo = z2 ? new C0385Eo(A00()) : this.A05.A04;
        long j2 = -9223372036854775807L;
        if (z2) {
            j = -9223372036854775807L;
        } else {
            j = this.A05.A0A;
        }
        if (!z2) {
            j2 = this.A05.A01;
        }
        int i = this.A05.A00;
        TrackGroupArray trackGroupArray = z3 ? TrackGroupArray.A04 : this.A05.A05;
        if (z3) {
            c0430Gk = this.A0O;
        } else {
            c0430Gk = this.A05.A06;
        }
        this.A05 = new C02799w(ah, obj, c0385Eo, j, j2, i, false, trackGroupArray, c0430Gk);
        if (z && (interfaceC0387Eq = this.A07) != null) {
            interfaceC0387Eq.AEb(this);
            this.A07 = null;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0p(boolean[] zArr, int i) throws C02609c {
        this.A0C = new Y5[i];
        int enabledRendererCount = 0;
        C02759s A0G = this.A0K.A0G();
        for (int i2 = 0; i2 < enabledRendererCount; i2++) {
            if (A0G.A04.A00(i2)) {
                A0O(i2, zArr[i2], enabledRendererCount);
                enabledRendererCount++;
            }
        }
    }

    private boolean A0q() {
        C02759s A0G = this.A0K.A0G();
        long j = A0G.A02.A01;
        if (j != -9223372036854775807L) {
            long playingPeriodDurationUs = this.A05.A0A;
            if (playingPeriodDurationUs >= j) {
                C02759s c02759s = A0G.A01;
                if (A0W[7].charAt(9) != '8') {
                    throw new RuntimeException();
                }
                String[] strArr = A0W;
                strArr[1] = "YaIhV2LltIG4HuclCS5WOO9hjwkCXeMt";
                strArr[0] = "X0pypN8zwLPsNLuJVHuHfetSc0yM8k9B";
                if (c02759s != null) {
                    C02759s playingPeriodHolder = A0G.A01;
                    if (!playingPeriodHolder.A06) {
                        C02759s playingPeriodHolder2 = A0G.A01;
                        if (playingPeriodHolder2.A02.A04.A01()) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean A0r(C02679j c02679j) {
        if (c02679j.A02 == null) {
            Pair<Integer, Long> A04 = A04(new C02699l(c02679j.A03.A08(), c02679j.A03.A01(), C9W.A00(c02679j.A03.A02())), false);
            if (A04 == null) {
                return false;
            }
            int intValue = ((Integer) A04.first).intValue();
            long longValue = ((Long) A04.second).longValue();
            AH ah = this.A05.A03;
            Integer num = (Integer) A04.first;
            String[] strArr = A0W;
            if (strArr[1].charAt(10) != strArr[0].charAt(10)) {
                A0W[6] = "Qe4SjxIsSBa3x6HAW";
                c02679j.A01(intValue, longValue, ah.A0A(num.intValue(), this.A0L, true).A03);
            } else {
                throw new RuntimeException();
            }
        } else {
            int A042 = this.A05.A03.A04(c02679j.A02);
            if (A042 == -1) {
                return false;
            }
            c02679j.A00 = A042;
        }
        return true;
    }

    private boolean A0s(Y5 y5) {
        C02759s A0H = this.A0K.A0H();
        C02759s readingPeriodHolder = A0H.A01;
        if (readingPeriodHolder != null) {
            C02759s readingPeriodHolder2 = A0H.A01;
            if (readingPeriodHolder2.A06 && y5.A8a()) {
                return true;
            }
        }
        return false;
    }

    private boolean A0t(C0385Eo c0385Eo, long j, C02759s c02759s) {
        if (c0385Eo.equals(c02759s.A02.A04) && c02759s.A06) {
            this.A05.A03.A09(c02759s.A02.A04.A02, this.A0L);
            int A04 = this.A0L.A04(j);
            if (A04 == -1 || this.A0L.A09(A04) == c02759s.A02.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean A0u(boolean z) {
        if (this.A0C.length == 0) {
            return A0q();
        }
        if (!z) {
            return false;
        }
        if (!this.A05.A08) {
            return true;
        }
        C02759s A0F = this.A0K.A0F();
        long A0C = A0F.A0C(!A0F.A02.A05);
        return A0C == Long.MIN_VALUE || this.A0J.AGL(A0C - A0F.A08(this.A03), this.A0G.A7h().A01, this.A09);
    }

    public static Format[] A0v(InterfaceC0426Gg interfaceC0426Gg) {
        int length = interfaceC0426Gg != null ? interfaceC0426Gg.length() : 0;
        Format[] formatArr = new Format[length];
        String[] strArr = A0W;
        String str = strArr[1];
        String str2 = strArr[0];
        int charAt = str.charAt(10);
        int length2 = str2.charAt(10);
        if (charAt == length2) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0W;
        strArr2[4] = "X04sVE4WijYjotgv6w3bASzS6";
        strArr2[3] = "U1jCIvxI6fY8JZE6Ili1DHAvIg";
        for (int length3 = 0; length3 < length; length3++) {
            formatArr[length3] = interfaceC0426Gg.A76(length3);
        }
        return formatArr;
    }

    public final Looper A0w() {
        return this.A0F.getLooper();
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0010 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void A0x() {
        if (this.A0A) {
            return;
        }
        this.A0Q.AFn(7);
        boolean z = false;
        while (!wasInterrupted) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final void A0y(AH ah, int i, long j) {
        this.A0Q.AAb(3, new C02699l(ah, i, j)).sendToTarget();
    }

    public final void A0z(InterfaceC0387Eq interfaceC0387Eq, boolean z, boolean z2) {
        this.A0Q.AAa(0, z ? 1 : 0, z2 ? 1 : 0, interfaceC0387Eq).sendToTarget();
    }

    public final void A10(boolean z) {
        this.A0Q.AAZ(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void A11(boolean z) {
        this.A0Q.AAZ(6, z ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.meta.analytics.dsp.uinode.C9Z
    public final void ACb(C02809x c02809x) {
        this.A0E.obtainMessage(1, c02809x).sendToTarget();
        A0L(c02809x.A01);
    }

    @Override // com.meta.analytics.dsp.uinode.WQ
    public final void ACj(WP wp) {
        this.A0Q.AAb(9, wp).sendToTarget();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0386Ep
    public final void ADA(InterfaceC0387Eq interfaceC0387Eq, AH ah, Object obj) {
        this.A0Q.AAb(8, new C02669i(interfaceC0387Eq, ah, obj)).sendToTarget();
    }

    @Override // com.meta.analytics.dsp.uinode.A6
    public final synchronized void AFp(A8 a8) {
        if (this.A0A) {
            Log.w(A06(0, 21, 43), A06(50, 37, 33));
            a8.A0A(false);
        } else {
            this.A0Q.AAb(14, a8).sendToTarget();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String A06 = A06(0, 21, 43);
        try {
            switch (message.what) {
                case 0:
                    A0h((InterfaceC0387Eq) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    A0l(message.arg1 != 0);
                    break;
                case 2:
                    A07();
                    break;
                case 3:
                    A0T((C02699l) message.obj);
                    break;
                case 4:
                    A0W((C02809x) message.obj);
                    break;
                case 5:
                    A0d((AD) message.obj);
                    break;
                case 6:
                    A0n(message.arg1 != 0, true);
                    break;
                case 7:
                    A0D();
                    return true;
                case 8:
                    A0S((C02669i) message.obj);
                    break;
                case 9:
                    A0f((WP) message.obj);
                    break;
                case 10:
                    A0e((WP) message.obj);
                    break;
                case 11:
                    A0E();
                    break;
                case 12:
                    A0M(message.arg1);
                    break;
                case 13:
                    A0m(message.arg1 != 0);
                    break;
                case 14:
                    A0Y((A8) message.obj);
                    break;
                case 15:
                    A0a((A8) message.obj);
                    break;
                default:
                    return false;
            }
            A0A();
        } catch (C02609c e) {
            Log.e(A06, A06(110, 15, 98), e);
            A0n(false, false);
            this.A0E.obtainMessage(2, e).sendToTarget();
            A0A();
        } catch (IOException e2) {
            Log.e(A06, A06(125, 13, 51), e2);
            A0n(false, false);
            this.A0E.obtainMessage(2, C02609c.A00(e2)).sendToTarget();
            A0A();
        } catch (RuntimeException e3) {
            Log.e(A06, A06(87, 23, 38), e3);
            A0n(false, false);
            this.A0E.obtainMessage(2, C02609c.A02(e3)).sendToTarget();
            A0A();
        }
        return true;
    }
}
