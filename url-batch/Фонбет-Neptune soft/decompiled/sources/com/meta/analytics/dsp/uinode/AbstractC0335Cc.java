package com.meta.analytics.dsp.uinode;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.Cc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0335Cc {
    public static byte[] A00;
    public static String[] A01 = {"bdaFL9zMZ", "I63pCoSBBbO7fDlHhIa7BrZ6Ava1cIF3", "x5nJfB3W8HSDeHix", "yyLZDQNtNFC811gZWNvs8tiPSoT", "kE4kWLsRx96QKHczqOKboI9lp", "rJUZcTDeN", "z735Hr0viTdtcy9jRTmcNapxWooAX9zU", "rl5X7GmnpjWHRCYLou0FtooQfFV"};
    public static final int[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[0].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[3] = "MWn";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 122);
            if (A01[7].length() == 12) {
                throw new RuntimeException();
            }
            A01[7] = "KMAr4";
            i4++;
        }
    }

    public static void A01() {
        A00 = new byte[]{-44, 8, -45, 2, Ascii.EM, 77, Ascii.CAN, 72, -8, 44, 42, -5, Ascii.SYN, 74, 74, Ascii.EM, -49, 3, Ascii.FF, -20, 32, 43, -17, Ascii.SO, 66, 78, 17, -42, -67, -54, -87, 63, 38, 72, Ascii.DC2, 63, 38, 72, 66, -41, -35, -40, -32, 4, Ascii.EM, 6, -44, 19, -31, 35, -51, Ascii.ESC, Ascii.CAN, 41, -28, Ascii.FF, Ascii.SUB, 7, -43, Ascii.ETB, 33, Ascii.GS, -32, 55, 65, Base64.padSymbol, 1, 62, 72, 68, 9, -9, 1, -3, -61, 9, 19, Ascii.SI, -42, 40, 50, 46, 44, Ascii.SO, 7, 7, Ascii.FF, Ascii.CAN, Ascii.ESC, -33, -36, 97, 100, 40, 38, -10, -7, -91, -91};
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d1, code lost:
    
        if (r3 == 1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00df, code lost:
    
        if (com.meta.analytics.dsp.uinode.AbstractC0335Cc.A01[7].length() == 12) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e1, code lost:
    
        com.meta.analytics.dsp.uinode.AbstractC0335Cc.A01[7] = "X5YHVW4uSpKOduvkf9RISQBbBxib";
        r9.A0Z(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0131, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f9, code lost:
    
        if (A02(r9.A08()) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fb, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fc, code lost:
    
        if (r14 != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fe, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ee, code lost:
    
        if (r3 == 1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0139, code lost:
    
        if (r14 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013d, code lost:
    
        if (r17 != r11) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x008a, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A05(InterfaceC0328Bt interfaceC0328Bt, boolean z) throws IOException, InterruptedException {
        boolean z2;
        long A7I = interfaceC0328Bt.A7I();
        long j = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        long j2 = -1;
        if (A7I != -1 && A7I <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j = A7I;
        }
        int i = (int) j;
        C0470Hz c0470Hz = new C0470Hz(64);
        int i2 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            if (i2 >= i) {
                z2 = false;
                break;
            }
            int i3 = 8;
            c0470Hz.A0W(8);
            interfaceC0328Bt.ADv(c0470Hz.A00, 0, 8);
            long A0M = c0470Hz.A0M();
            int A08 = c0470Hz.A08();
            if (A0M == 1) {
                i3 = 16;
                interfaceC0328Bt.ADv(c0470Hz.A00, 8, 8);
                if (A01[3].length() == 21) {
                    throw new RuntimeException();
                }
                A01[3] = "x";
                c0470Hz.A0X(16);
                A0M = c0470Hz.A0N();
            } else if (A0M == 0) {
                long A7I2 = interfaceC0328Bt.A7I();
                if (A7I2 != j2) {
                    A0M = (A7I2 - interfaceC0328Bt.A7i()) + 8;
                }
            }
            if (A0M >= i3) {
                i2 += i3;
                if (A08 != CJ.A0k) {
                    if (A08 == CJ.A0j) {
                        z2 = false;
                        break;
                    }
                    if (A08 == CJ.A0n) {
                        z2 = false;
                        break;
                    }
                    if ((i2 + A0M) - i3 >= i) {
                        z2 = false;
                        break;
                    }
                    int i4 = (int) (A0M - i3);
                    i2 += i4;
                    if (A08 == CJ.A0V) {
                        if (i4 < 8) {
                            return false;
                        }
                        c0470Hz.A0W(i4);
                        interfaceC0328Bt.ADv(c0470Hz.A00, 0, i4);
                        int i5 = i4 / 4;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                break;
                            }
                            if (A01[3].length() != 21) {
                                String[] strArr = A01;
                                strArr[2] = "gohG7oAKJXd788dq";
                                strArr[4] = "s0tItg43zYN2kAKL8Ko7hXkhv";
                            }
                            i6++;
                        }
                    } else if (i4 != 0) {
                        interfaceC0328Bt.A3W(i4);
                    }
                    j2 = -1;
                } else {
                    j2 = -1;
                }
            } else {
                if (A01[6].length() != 14) {
                    A01[6] = "xNdZT7PF3cfE5U51qI7qEUy5Bn2I1n4";
                    return false;
                }
                A01[6] = "uC";
                return false;
            }
        }
    }

    static {
        A01();
        A02 = new int[]{IF.A08(A00(79, 4, 69)), IF.A08(A00(59, 4, 52)), IF.A08(A00(63, 4, 84)), IF.A08(A00(67, 4, 91)), IF.A08(A00(71, 4, 20)), IF.A08(A00(75, 4, 38)), IF.A08(A00(43, 4, 41)), IF.A08(A00(55, 4, 42)), IF.A08(A00(51, 4, 57)), IF.A08(A00(87, 4, 49)), IF.A08(A00(91, 4, 122)), IF.A08(A00(0, 4, 39)), IF.A08(A00(4, 4, 108)), IF.A08(A00(19, 4, 63)), IF.A08(A00(23, 4, 97)), IF.A08(A00(8, 4, 75)), IF.A08(A00(12, 4, 105)), IF.A08(A00(31, 4, 120)), IF.A08(A00(27, 4, 15)), IF.A08(A00(47, 4, 51)), IF.A08(A00(83, 4, 41)), IF.A08(A00(35, 4, 120)), IF.A08(A00(95, 4, 11)), IF.A08(A00(39, 4, 16))};
    }

    public static boolean A02(int i) {
        if ((i >>> 8) == IF.A08(A00(16, 3, 34))) {
            return true;
        }
        for (int i2 : A02) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean A03(InterfaceC0328Bt interfaceC0328Bt) throws IOException, InterruptedException {
        return A05(interfaceC0328Bt, true);
    }

    public static boolean A04(InterfaceC0328Bt interfaceC0328Bt) throws IOException, InterruptedException {
        return A05(interfaceC0328Bt, false);
    }
}
