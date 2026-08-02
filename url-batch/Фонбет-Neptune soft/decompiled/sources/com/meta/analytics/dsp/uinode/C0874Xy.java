package com.meta.analytics.dsp.uinode;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.audio.AudioProcessor;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Xy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0874Xy implements InterfaceC0297Ao {
    public static boolean A0p;
    public static boolean A0q;
    public static byte[] A0r;
    public static String[] A0s = {"hUCCDXcY4t01difYD4QJmSlSRe7RVS9F", "yHOnf8lHgEM0FI0EKX1KbB3TaozNa", "kXByBOPR65DToxooqsu0gGt9HKAYl4Vo", "NIkyagP1AzDGImvyfrRhWneTEqqmK", "aXPRHAu0VDe5efXXlwPVbrYy41", "xYrm6yKJij65q9D2CisZETvgfz", "Fi2DTXQipqprJDEroL63LN5SWS4FAMqA", "8o6UBOAn3xAy4ZEKn0SjK2UR42QgxF0P"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public AudioTrack A0M;
    public AudioTrack A0N;
    public C02809x A0O;
    public C02809x A0P;
    public AT A0Q;
    public InterfaceC0295Am A0R;
    public ByteBuffer A0S;
    public ByteBuffer A0T;
    public ByteBuffer A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public byte[] A0c;
    public InterfaceC0284Ab[] A0d;
    public ByteBuffer[] A0e;
    public final ConditionVariable A0f;
    public final AU A0g;
    public final C0303Au A0h;
    public final Y1 A0i;
    public final InterfaceC0306Ax A0j;
    public final C0868Xs A0k;
    public final ArrayDeque<C0308Az> A0l;
    public final boolean A0m;
    public final InterfaceC0284Ab[] A0n;
    public final InterfaceC0284Ab[] A0o;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private AudioTrack A0F(int i) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i);
    }

    public static String A0I(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0r, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A0O() {
        A0r = new byte[]{33, 45, 106, 98, 121, 45, 82, 102, 119, 122, 124, 71, 97, 114, 112, 120, 47, 2, Ascii.CAN, 8, 4, 5, Ascii.US, 2, 5, Ascii.RS, 2, Ascii.US, Ascii.DC2, 75, Ascii.SI, Ascii.SO, Ascii.US, Ascii.SO, 8, Ascii.US, Ascii.SO, Ascii.SI, 75, 48, Ascii.SO, 19, Ascii.ESC, Ascii.SO, 8, Ascii.US, Ascii.SO, Ascii.SI, 75, 33, 57, 38, 43, 38, 46, 78, 121, 111, 121, 104, 104, 117, 114, 123, 60, 111, 104, 125, 112, 112, 121, 120, 60, 125, 105, 120, 117, 115, 60, 104, 110, 125, Byte.MAX_VALUE, 119, 46, Ascii.NAK, Ascii.RS, 3, Ascii.VT, Ascii.RS, Ascii.CAN, Ascii.SI, Ascii.RS, Ascii.US, 91, Ascii.SUB, Ascii.SO, Ascii.US, Ascii.DC2, Ascii.DC4, 91, Ascii.RS, Ascii.NAK, Ascii.CAN, Ascii.DC4, Ascii.US, Ascii.DC2, Ascii.NAK, Ascii.FS, 65, 91, 58, 1, Ascii.FS, Ascii.SUB, Ascii.US, Ascii.US, 0, Ascii.GS, Ascii.ESC, 10, Ascii.VT, 79, Ascii.FF, 7, Ascii.SO, 1, 1, 10, 3, 79, Ascii.FF, 0, Ascii.SUB, 1, Ascii.ESC, 85, 79, Ascii.CAN, 121, 112, 108, 107, 122, 109, 41, 58, 40, 58};
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0202, code lost:
    
        if (r4 != 6) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x020b, code lost:
    
        if (r4 != 7) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x020d, code lost:
    
        r10.A02 = 49152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0214, code lost:
    
        r10.A02 = 294912;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0204, code lost:
    
        r10.A02 = 20480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01d4, code lost:
    
        if (r6 != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0146, code lost:
    
        if (r8 == r13) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014a, code lost:
    
        if (r10.A07 != r5) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0159, code lost:
    
        if (r8 == r13) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0193, code lost:
    
        if (r6 != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0195, code lost:
    
        r2 = android.media.AudioTrack.getMinBufferSize(r13, r5, r10.A08);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019c, code lost:
    
        if (r2 == (-2)) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019e, code lost:
    
        com.meta.analytics.dsp.uinode.AbstractC0445Ha.A04(r4);
        r10.A02 = com.meta.analytics.dsp.uinode.IF.A06(r2 * 4, ((int) A07(250000)) * r10.A09, (int) java.lang.Math.max(r2, A07(750000) * r10.A09));
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c6, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d7, code lost:
    
        r4 = r10.A08;
        r2 = com.meta.analytics.dsp.uinode.C0874Xy.A0s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ea, code lost:
    
        if (r2[2].charAt(5) == r2[7].charAt(5)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f1, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f2, code lost:
    
        r2 = com.meta.analytics.dsp.uinode.C0874Xy.A0s;
        r2[4] = "14nowEFL6Yk6bTHhGEAerIHyFS";
        r2[5] = "whsLbLpoTkO7JKoY0ylMAK08jN";
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ff, code lost:
    
        if (r4 == 5) goto L110;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0297Ao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A4P(int i, int i2, int i3, int i4, int[] iArr, int i5, int i6) throws C0293Ak {
        int i7;
        boolean z;
        boolean z2 = false;
        this.A06 = i3;
        this.A0X = IF.A0c(i);
        this.A0a = this.A0m && A90(1073741824) && IF.A0b(i);
        if (this.A0X) {
            this.A0B = IF.A05(i, i2);
        }
        int i8 = i;
        boolean z3 = this.A0X && i != 4;
        this.A0V = z3 && !this.A0a;
        if (z3) {
            C0868Xs c0868Xs = this.A0k;
            String[] strArr = A0s;
            if (strArr[2].charAt(5) != strArr[7].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[2] = "ej7gIOv1RSWnjsTxHmkmyi8L1IunU9uG";
            strArr2[7] = "hfKjQOc2MeS54BGnG6pnxpZTrszWdpVu";
            c0868Xs.A00(i5, i6);
            this.A0i.A00(iArr);
            for (InterfaceC0284Ab interfaceC0284Ab : A0V()) {
                try {
                    z2 |= interfaceC0284Ab.A4Q(i3, i2, i8);
                    if (interfaceC0284Ab.A8w()) {
                        i2 = interfaceC0284Ab.A7X();
                        i3 = interfaceC0284Ab.A7Z();
                        i8 = interfaceC0284Ab.A7Y();
                    }
                } catch (C0283Aa e) {
                    throw new C0293Ak(e);
                }
            }
        }
        switch (i2) {
            case 1:
                i7 = 4;
                break;
            case 2:
                i7 = 12;
                break;
            case 3:
                i7 = 28;
                break;
            case 4:
                i7 = 204;
                break;
            case 5:
                i7 = 220;
                break;
            case 6:
                i7 = 252;
                break;
            case 7:
                i7 = 1276;
                break;
            case 8:
                i7 = C9W.A00;
                break;
            default:
                throw new C0293Ak(A0I(111, 27, 101) + i2);
        }
        if (IF.A02 <= 23 && A0I(Opcodes.F2I, 6, 21).equals(IF.A03) && A0I(49, 6, 101).equals(IF.A05)) {
            switch (i2) {
                case 3:
                case 5:
                    i7 = 252;
                    break;
                case 7:
                    i7 = C9W.A00;
                    break;
            }
        }
        if (IF.A02 > 25 || !A0I(Opcodes.I2B, 4, 69).equals(IF.A03) || this.A0X) {
            z = true;
        } else {
            z = true;
            if (i2 == 1) {
                i7 = 12;
            }
        }
        if (!z2 && A0U() && this.A08 == i8) {
            int i9 = this.A0A;
            String[] strArr3 = A0s;
            if (strArr3[4].length() == strArr3[5].length()) {
                String[] strArr4 = A0s;
                strArr4[6] = "u2P4sXJj5H8su2Kql34JpmWdGsVOFAs5";
                strArr4[0] = "NVG4MXG40xPwcgngyVWUBbOvox4lVKJJ";
            }
        }
        reset();
        this.A0Z = z3;
        this.A0A = i3;
        this.A07 = i7;
        this.A08 = i8;
        this.A09 = this.A0X ? IF.A05(i8, i2) : -1;
        if (i4 != 0) {
            this.A02 = i4;
            return;
        }
        boolean z4 = this.A0X;
        String[] strArr5 = A0s;
        if (strArr5[6].charAt(5) == strArr5[0].charAt(5)) {
            String[] strArr6 = A0s;
            strArr6[6] = "DTWWXXvppHPLDuHJPaEYpRthtIw4YpkI";
            strArr6[0] = "uyl1CXNLwzeT5NMhWvVG28BgBRP6XYYa";
        }
    }

    static {
        A0O();
        A0p = false;
        A0q = false;
    }

    public C0874Xy(AU au, InterfaceC0306Ax interfaceC0306Ax, boolean z) {
        this.A0g = au;
        this.A0j = (InterfaceC0306Ax) AbstractC0445Ha.A01(interfaceC0306Ax);
        this.A0m = z;
        this.A0f = new ConditionVariable(true);
        this.A0h = new C0303Au(new C0875Xz(this, null));
        Y1 y1 = new Y1();
        this.A0i = y1;
        C0868Xs c0868Xs = new C0868Xs();
        this.A0k = c0868Xs;
        ArrayList<AudioProcessor> toIntPcmAudioProcessors = new ArrayList<>();
        Collections.addAll(toIntPcmAudioProcessors, new C0871Xv(), y1, c0868Xs);
        Collections.addAll(toIntPcmAudioProcessors, interfaceC0306Ax.A64());
        this.A0o = (InterfaceC0284Ab[]) toIntPcmAudioProcessors.toArray(new InterfaceC0284Ab[toIntPcmAudioProcessors.size()]);
        this.A0n = new InterfaceC0284Ab[]{new C0873Xx()};
        this.A00 = 1.0f;
        this.A0D = 0;
        this.A0Q = AT.A04;
        this.A01 = 0;
        this.A0P = C02809x.A04;
        this.A04 = -1;
        this.A0d = new InterfaceC0284Ab[0];
        this.A0e = new ByteBuffer[0];
        this.A0l = new ArrayDeque<>();
    }

    public C0874Xy(AU au, InterfaceC0284Ab[] interfaceC0284AbArr) {
        this(au, interfaceC0284AbArr, false);
    }

    public C0874Xy(AU au, InterfaceC0284Ab[] interfaceC0284AbArr, boolean z) {
        this(au, new Y0(interfaceC0284AbArr), z);
    }

    public static int A00(int i, ByteBuffer byteBuffer) {
        if (i == 7 || i == 8) {
            return B1.A00(byteBuffer);
        }
        if (i == 5) {
            return AQ.A00();
        }
        if (i == 6) {
            int A03 = AQ.A03(byteBuffer);
            String[] strArr = A0s;
            if (strArr[2].charAt(5) != strArr[7].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[4] = "kQJQgIYBfsXVI0BXiDfXFh8Y0v";
            strArr2[5] = "xmKGBElaJ1P1UFLQWjzE2KvoVx";
            return A03;
        }
        if (i == 14) {
            int A02 = AQ.A02(byteBuffer);
            if (A02 == -1) {
                return 0;
            }
            int syncframeOffset = AQ.A04(byteBuffer, A02);
            return syncframeOffset * 16;
        }
        throw new IllegalStateException(A0I(84, 27, 113) + i);
    }

    public static int A01(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    private int A02(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (this.A0S == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.A0S = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.A0S.putInt(1431633921);
        }
        if (this.A03 == 0) {
            this.A0S.putInt(4, i);
            this.A0S.putLong(8, 1000 * j);
            this.A0S.position(0);
            this.A03 = i;
        }
        int remaining = this.A0S.remaining();
        String[] strArr = A0s;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[6] = "ZxHEhXNaRaOeicOuVS0y7eKtBmJV15x7";
        strArr2[0] = "lpmrRXkhPpBf5A8LovnLhyOg75mNhzFm";
        if (remaining > 0) {
            int avSyncHeaderBytesRemaining = audioTrack.write(this.A0S, remaining, 1);
            if (avSyncHeaderBytesRemaining < 0) {
                this.A03 = 0;
                return avSyncHeaderBytesRemaining;
            }
            if (avSyncHeaderBytesRemaining < remaining) {
                return 0;
            }
        }
        int A01 = A01(audioTrack, byteBuffer, i);
        if (A01 < 0) {
            this.A03 = 0;
            String[] strArr3 = A0s;
            String str = strArr3[6];
            String str2 = strArr3[0];
            int charAt = str.charAt(5);
            int avSyncHeaderBytesRemaining2 = str2.charAt(5);
            if (charAt != avSyncHeaderBytesRemaining2) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0s;
            strArr4[6] = "98oBXXwj84JUUigMvdtlS6TYqH9EDAiG";
            strArr4[0] = "VyAxkX5UR8Pe4wLdxiezRSIVcQQDizsa";
            return A01;
        }
        int avSyncHeaderBytesRemaining3 = this.A03;
        this.A03 = avSyncHeaderBytesRemaining3 - A01;
        return A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A03() {
        return this.A0X ? this.A0J / this.A0B : this.A0I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A04() {
        return this.A0X ? this.A0L / this.A09 : this.A0K;
    }

    private long A05(long j) {
        return A08(this.A0j.A80()) + j;
    }

    private long A06(long j) {
        C02809x c02809x;
        long j2;
        long j3;
        long j4;
        C0308Az c0308Az = null;
        while (!this.A0l.isEmpty()) {
            C0308Az checkpoint = this.A0l.getFirst();
            j4 = checkpoint.A01;
            if (j < j4) {
                break;
            }
            C0308Az remove = this.A0l.remove();
            String[] strArr = A0s;
            if (strArr[1].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[1] = "EqLX22Mle1kVg1sX5ZT6YkRLc5f35";
            strArr2[3] = "gdY2b1urbXezKivfsFNrjnMWNzK4t";
            c0308Az = remove;
        }
        if (c0308Az != null) {
            c02809x = c0308Az.A02;
            this.A0P = c02809x;
            j2 = c0308Az.A01;
            this.A0G = j2;
            j3 = c0308Az.A00;
            this.A0F = j3 - this.A0H;
        }
        if (this.A0P.A01 == 1.0f) {
            return (this.A0F + j) - this.A0G;
        }
        if (this.A0l.isEmpty()) {
            return this.A0F + this.A0j.A7O(j - this.A0G);
        }
        return this.A0F + IF.A0C(j - this.A0G, this.A0P.A01);
    }

    private long A07(long j) {
        return (this.A0A * j) / 1000000;
    }

    private long A08(long j) {
        return (1000000 * j) / this.A0A;
    }

    private long A09(long j) {
        return (1000000 * j) / this.A06;
    }

    private AudioTrack A0D() {
        AudioAttributes A00;
        if (this.A0b) {
            A00 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            A00 = this.A0Q.A00();
        }
        AudioFormat build = new AudioFormat.Builder().setChannelMask(this.A07).setEncoding(this.A08).setSampleRate(this.A0A).build();
        int audioSessionId = this.A01;
        if (audioSessionId == 0) {
            audioSessionId = 0;
        }
        return new AudioTrack(A00, build, this.A02, 1, audioSessionId);
    }

    private AudioTrack A0E() throws C0294Al {
        AudioTrack audioTrack;
        if (IF.A02 >= 21) {
            audioTrack = A0D();
        } else {
            int A03 = IF.A03(this.A0Q.A03);
            int streamType = this.A01;
            if (streamType == 0) {
                audioTrack = new AudioTrack(A03, this.A0A, this.A07, this.A08, this.A02, 1);
            } else {
                audioTrack = new AudioTrack(A03, this.A0A, this.A07, this.A08, this.A02, 1, this.A01);
            }
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new C0294Al(state, this.A0A, this.A07, this.A02);
    }

    private void A0J() {
        int i = 0;
        while (true) {
            InterfaceC0284Ab[] interfaceC0284AbArr = this.A0d;
            int i2 = interfaceC0284AbArr.length;
            if (i < i2) {
                InterfaceC0284Ab interfaceC0284Ab = interfaceC0284AbArr[i];
                interfaceC0284Ab.flush();
                this.A0e[i] = interfaceC0284Ab.A7W();
                i++;
            } else {
                return;
            }
        }
    }

    private void A0K() throws C0294Al {
        C02809x c02809x;
        this.A0f.block();
        AudioTrack A0E = A0E();
        this.A0M = A0E;
        int audioSessionId = A0E.getAudioSessionId();
        if (A0p && IF.A02 < 21) {
            AudioTrack audioTrack = this.A0N;
            if (audioTrack != null) {
                int audioSessionId2 = audioTrack.getAudioSessionId();
                if (audioSessionId != audioSessionId2) {
                    A0L();
                }
            }
            if (this.A0N == null) {
                this.A0N = A0F(audioSessionId);
            }
        }
        int audioSessionId3 = this.A01;
        if (audioSessionId3 != audioSessionId) {
            this.A01 = audioSessionId;
            InterfaceC0295Am interfaceC0295Am = this.A0R;
            if (interfaceC0295Am != null) {
                interfaceC0295Am.AAs(audioSessionId);
            }
        }
        if (this.A0V) {
            c02809x = this.A0j.A3b(this.A0P);
        } else {
            c02809x = C02809x.A04;
        }
        this.A0P = c02809x;
        A0N();
        C0303Au c0303Au = this.A0h;
        AudioTrack audioTrack2 = this.A0M;
        int i = this.A08;
        int i2 = this.A09;
        int audioSessionId4 = this.A02;
        c0303Au.A0G(audioTrack2, i, i2, audioSessionId4);
        A0M();
    }

    private void A0L() {
        if (this.A0N == null) {
            return;
        }
        AudioTrack audioTrack = this.A0N;
        this.A0N = null;
        new C0305Aw(this, audioTrack).start();
    }

    private void A0M() {
        if (!A0U()) {
            return;
        }
        if (IF.A02 >= 21) {
            A0Q(this.A0M, this.A00);
            return;
        }
        AudioTrack audioTrack = this.A0M;
        String[] strArr = A0s;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[2] = "RUPACOvpiKp7bcWaTWyqVFSR7GtEantX";
        strArr2[7] = "RzQzoOWLdvYkkdkBCtRhC7yU7hWBsadG";
        A0R(audioTrack, this.A00);
    }

    private void A0N() {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC0284Ab interfaceC0284Ab : A0V()) {
            if (interfaceC0284Ab.A8w()) {
                arrayList.add(interfaceC0284Ab);
            } else {
                interfaceC0284Ab.flush();
            }
        }
        int count = arrayList.size();
        this.A0d = (InterfaceC0284Ab[]) arrayList.toArray(new InterfaceC0284Ab[count]);
        this.A0e = new ByteBuffer[count];
        A0J();
    }

    private void A0P(long j) throws C0296An {
        ByteBuffer input;
        int length = this.A0d.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                int count = i - 1;
                input = this.A0e[count];
            } else {
                input = this.A0T;
                if (input == null) {
                    input = InterfaceC0284Ab.A00;
                }
            }
            if (i == length) {
                A0S(input, j);
            } else {
                InterfaceC0284Ab interfaceC0284Ab = this.A0d[i];
                interfaceC0284Ab.AEF(input);
                ByteBuffer A7W = interfaceC0284Ab.A7W();
                this.A0e[i] = A7W;
                if (A7W.hasRemaining()) {
                    i++;
                }
            }
            boolean hasRemaining = input.hasRemaining();
            String[] strArr = A0s;
            String str = strArr[4];
            String str2 = strArr[5];
            int index = str.length();
            int count2 = str2.length();
            if (index != count2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[2] = "GvJ2yOfBgit1iG3ukbpo3ztMvZtxyKui";
            strArr2[7] = "YNNwMOgGE9szKpvyLkHk1WmQlE5xjnt7";
            if (hasRemaining) {
                return;
            } else {
                i--;
            }
        }
    }

    public static void A0Q(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    public static void A0R(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    private void A0S(ByteBuffer byteBuffer, long j) throws C0296An {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ByteBuffer byteBuffer2 = this.A0U;
        String[] strArr = A0s;
        if (strArr[2].charAt(5) != strArr[7].charAt(5)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[1] = "Y8Mrx0I9TdYWTjTrSbpDFDKjoXuQO";
        strArr2[3] = "wRs1O0frPXGaUer72uaPv4p6RCTih";
        if (byteBuffer2 != null) {
            AbstractC0445Ha.A03(byteBuffer2 == byteBuffer);
        } else {
            this.A0U = byteBuffer;
            if (IF.A02 < 21) {
                int bytesWritten = byteBuffer.remaining();
                byte[] bArr = this.A0c;
                if (bArr == null || bArr.length < bytesWritten) {
                    this.A0c = new byte[bytesWritten];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.A0c, 0, bytesWritten);
                byteBuffer.position(position);
                this.A0C = 0;
            }
        }
        int remaining = byteBuffer.remaining();
        int i = 0;
        if (IF.A02 < 21) {
            int A0B = this.A0h.A0B(this.A0L);
            if (A0B > 0) {
                i = this.A0M.write(this.A0c, this.A0C, Math.min(remaining, A0B));
                if (i > 0) {
                    this.A0C += i;
                    byteBuffer.position(byteBuffer.position() + i);
                }
            }
        } else if (!this.A0b) {
            i = A01(this.A0M, byteBuffer, remaining);
        } else {
            AbstractC0445Ha.A04(j != -9223372036854775807L);
            i = A02(this.A0M, byteBuffer, remaining, j);
        }
        this.A0E = SystemClock.elapsedRealtime();
        if (i >= 0) {
            boolean z = this.A0X;
            if (z) {
                this.A0L += i;
            }
            if (i == remaining) {
                if (!z) {
                    this.A0K += this.A05;
                }
                this.A0U = null;
                return;
            }
            return;
        }
        throw new C0296An(i);
    }

    private boolean A0T() throws C0296An {
        boolean z = false;
        if (this.A04 == -1) {
            boolean audioProcessorNeedsEndOfStream = this.A0Z;
            this.A04 = audioProcessorNeedsEndOfStream ? 0 : this.A0d.length;
            z = true;
        }
        while (true) {
            int i = this.A04;
            InterfaceC0284Ab[] interfaceC0284AbArr = this.A0d;
            if (i < interfaceC0284AbArr.length) {
                InterfaceC0284Ab interfaceC0284Ab = interfaceC0284AbArr[i];
                if (z) {
                    interfaceC0284Ab.AEE();
                }
                A0P(-9223372036854775807L);
                boolean audioProcessorNeedsEndOfStream2 = interfaceC0284Ab.A91();
                if (!audioProcessorNeedsEndOfStream2) {
                    return false;
                }
                z = true;
                this.A04++;
            } else {
                ByteBuffer byteBuffer = this.A0U;
                if (byteBuffer != null) {
                    A0S(byteBuffer, -9223372036854775807L);
                    if (this.A0U != null) {
                        return false;
                    }
                }
                this.A04 = -1;
                return true;
            }
        }
    }

    private boolean A0U() {
        return this.A0M != null;
    }

    private InterfaceC0284Ab[] A0V() {
        if (this.A0a) {
            return this.A0n;
        }
        return this.A0o;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0297Ao
    public final void A59() {
        if (this.A0b) {
            this.A0b = false;
            this.A01 = 0;
            reset();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0297Ao
    public final void A5W(int i) {
        AbstractC0445Ha.A04(IF.A02 >= 21);
        if (this.A0b) {
            int i2 = this.A01;
            String[] strArr = A0s;
            if (strArr[1].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[2] = "PS7IBOM7NZDOoVGPPjdQOv1dv3IkizxK";
            strArr2[7] = "jjqtzOvKeeqNL4elNx3MZRV4owozeHXU";
            if (i2 == i) {
                return;
            }
        }
        this.A0b = true;
        this.A01 = i;
        reset();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0297Ao
    public final long A6e(boolean z) {
        if (!A0U() || this.A0D == 0) {
            return Long.MIN_VALUE;
        }
        long A0C = this.A0h.A0C(z);
        long positionUs = A04();
        return this.A0H + A05(A06(Math.min(A0C, A08(positionUs))));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0297Ao
    public final C02809x A7h() {
        return this.A0P;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0297Ao
    public final boolean A8R(ByteBuffer byteBuffer, long j) throws C0294Al, C0296An {
        ByteBuffer byteBuffer2 = this.A0T;
        AbstractC0445Ha.A03(byteBuffer2 == null || byteBuffer == byteBuffer2);
        boolean A0U = A0U();
        String[] strArr = A0s;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[6] = "RcCB0XsFwDDOAw3euoH2B524NJP5PtQP";
        strArr2[0] = "S6sRDXDIUBrBns4w0IFsbKHJgfJaiswv";
        if (!A0U) {
            A0K();
            if (this.A0Y) {
                AE2();
            }
        }
        if (!this.A0h.A0L(A04())) {
            return false;
        }
        ByteBuffer byteBuffer3 = this.A0T;
        String A0I = A0I(6, 10, 25);
        if (byteBuffer3 == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.A0X && this.A05 == 0) {
                int A00 = A00(this.A08, byteBuffer);
                this.A05 = A00;
                if (A00 == 0) {
                    return true;
                }
            }
            if (this.A0O != null) {
                if (!A0T()) {
                    return false;
                }
                C02809x c02809x = this.A0O;
                this.A0O = null;
                this.A0l.add(new C0308Az(this.A0j.A3b(c02809x), Math.max(0L, j), A08(A04()), null));
                A0N();
            }
            if (this.A0D == 0) {
                this.A0H = Math.max(0L, j);
                this.A0D = 1;
            } else {
                long expectedPresentationTimeUs = this.A0H + A09(A03());
                if (this.A0D == 1 && Math.abs(expectedPresentationTimeUs - j) > 200000) {
                    Log.e(A0I, A0I(16, 33, 97) + expectedPresentationTimeUs + A0I(0, 6, 7) + j + A0I(Opcodes.L2D, 1, 79));
                    this.A0D = 2;
                }
                if (this.A0D == 2) {
                    this.A0H += j - expectedPresentationTimeUs;
                    this.A0D = 1;
                    InterfaceC0295Am interfaceC0295Am = this.A0R;
                    if (interfaceC0295Am != null) {
                        interfaceC0295Am.ACg();
                    }
                }
            }
            if (this.A0X) {
                this.A0J += byteBuffer.remaining();
            } else {
                this.A0I += this.A05;
            }
            this.A0T = byteBuffer;
        }
        if (!this.A0Z) {
            A0S(this.A0T, j);
        } else {
            A0P(j);
        }
        if (!this.A0T.hasRemaining()) {
            this.A0T = null;
            return true;
        }
        if (this.A0h.A0K(A04())) {
            Log.w(A0I, A0I(55, 29, 22));
            reset();
            return true;
        }
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0297Ao
    public final void A8U() {
        if (this.A0D == 1) {
            this.A0D = 2;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0297Ao
    public final boolean A8Z() {
        if (A0U()) {
            boolean A0J = this.A0h.A0J(A04());
            String[] strArr = A0s;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[4] = "9qaAbWK7Rz0EURQ8gVPoKZJ79p";
            strArr2[5] = "PQsLZF4zdgMsSCMdKk30KO6aPE";
            if (A0J) {
                return true;
            }
        }
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0297Ao
    public final boolean A90(int i) {
        if (IF.A0c(i)) {
            return i != 4 || IF.A02 >= 21;
        }
        AU au = this.A0g;
        return au != null && au.A04(i);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0297Ao
    public final boolean A91() {
        return !A0U() || (this.A0W && !A8Z());
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0297Ao
    public final void AE2() {
        this.A0Y = true;
        if (A0U()) {
            this.A0h.A0E();
            this.A0M.play();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0297Ao
    public final void AE3() throws C0296An {
        if (!this.A0W && A0U() && A0T()) {
            this.A0h.A0F(A04());
            String[] strArr = A0s;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[1] = "3Beu4rQqJml6K6p71ugtSnl6z4kve";
            strArr2[3] = "vTiWK9GhFZyDb3TQGI4eNztci47gx";
            this.A0M.stop();
            this.A03 = 0;
            this.A0W = true;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0297Ao
    public final void AEV() {
        reset();
        A0L();
        for (InterfaceC0284Ab interfaceC0284Ab : this.A0o) {
            interfaceC0284Ab.reset();
        }
        for (InterfaceC0284Ab interfaceC0284Ab2 : this.A0n) {
            interfaceC0284Ab2.reset();
        }
        this.A01 = 0;
        this.A0Y = false;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0297Ao
    public final void AFs(AT at) {
        if (this.A0Q.equals(at)) {
            return;
        }
        this.A0Q = at;
        if (this.A0b) {
            return;
        }
        reset();
        this.A01 = 0;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0297Ao
    public final void AG4(InterfaceC0295Am interfaceC0295Am) {
        this.A0R = interfaceC0295Am;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0297Ao
    public final C02809x AGA(C02809x c02809x) {
        if (A0U() && !this.A0V) {
            C02809x c02809x2 = C02809x.A04;
            this.A0P = c02809x2;
            return c02809x2;
        }
        C02809x c02809x3 = this.A0O;
        String[] strArr = A0s;
        if (strArr[6].charAt(5) != strArr[0].charAt(5)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[1] = "qknQOXr2sfI1wZbS1fFTxKCHwtwOF";
        strArr2[3] = "6hx8Cx11JAWA8IEiphxLzKnZtiWJj";
        if (c02809x3 == null) {
            if (!this.A0l.isEmpty()) {
                c02809x3 = this.A0l.getLast().A02;
            } else {
                c02809x3 = this.A0P;
            }
        }
        boolean equals = c02809x.equals(c02809x3);
        String[] strArr3 = A0s;
        if (strArr3[6].charAt(5) != strArr3[0].charAt(5)) {
            throw new RuntimeException();
        }
        String[] strArr4 = A0s;
        strArr4[4] = "rapNwYGl5aH6wSWwsREtxqAYY9";
        strArr4[5] = "Swk5nrnVyktI66zCHmEiilSuas";
        if (!equals) {
            if (A0U()) {
                this.A0O = c02809x;
            } else {
                C02809x lastSetPlaybackParameters = this.A0j.A3b(c02809x);
                this.A0P = lastSetPlaybackParameters;
            }
        }
        C02809x lastSetPlaybackParameters2 = this.A0P;
        return lastSetPlaybackParameters2;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0297Ao
    public final void pause() {
        this.A0Y = false;
        if (A0U() && this.A0h.A0I()) {
            AudioTrack audioTrack = this.A0M;
            String[] strArr = A0s;
            if (strArr[2].charAt(5) != strArr[7].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[2] = "3LzsBOqgGe30i16a9NIVlDJcub4Z4Vvr";
            strArr2[7] = "hMaFPO8QBdBmzyeIOXtEGbbLXROtxATQ";
            audioTrack.pause();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0297Ao
    public final void reset() {
        C02809x c02809x;
        if (A0U()) {
            this.A0J = 0L;
            this.A0I = 0L;
            this.A0L = 0L;
            this.A0K = 0L;
            this.A05 = 0;
            C02809x c02809x2 = this.A0O;
            if (c02809x2 != null) {
                this.A0P = c02809x2;
                String[] strArr = A0s;
                if (strArr[2].charAt(5) != strArr[7].charAt(5)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0s;
                strArr2[1] = "rnKZk3c8Taby0V4iUj7wGFJub43iz";
                strArr2[3] = "VEk4k7rPnS3kvq1QwagsAStWXQ6pG";
                this.A0O = null;
            } else if (!this.A0l.isEmpty()) {
                c02809x = this.A0l.getLast().A02;
                this.A0P = c02809x;
            }
            this.A0l.clear();
            this.A0F = 0L;
            this.A0G = 0L;
            this.A0T = null;
            this.A0U = null;
            A0J();
            this.A0W = false;
            this.A04 = -1;
            this.A0S = null;
            this.A03 = 0;
            this.A0D = 0;
            if (this.A0h.A0H()) {
                this.A0M.pause();
            }
            AudioTrack audioTrack = this.A0M;
            this.A0M = null;
            this.A0h.A0D();
            this.A0f.close();
            new C0304Av(this, audioTrack).start();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0297Ao
    public final void setVolume(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            A0M();
        }
    }
}
