package com.meta.analytics.dsp.uinode;

import android.util.Log;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public abstract class DF {
    public static byte[] A00;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C0835Wl A00(InterfaceC0328Bt interfaceC0328Bt) throws IOException, InterruptedException {
        AbstractC0445Ha.A01(interfaceC0328Bt);
        C0470Hz c0470Hz = new C0470Hz(16);
        if (DE.A00(interfaceC0328Bt, c0470Hz).A00 != IF.A08(A01(111, 4, 112))) {
            return null;
        }
        int i = 0;
        interfaceC0328Bt.ADv(c0470Hz.A00, 0, 4);
        c0470Hz.A0Y(0);
        int A08 = c0470Hz.A08();
        int A082 = IF.A08(A01(Opcodes.MONITOREXIT, 4, 13));
        String A01 = A01(Opcodes.IFNONNULL, 15, 13);
        if (A08 != A082) {
            Log.e(A01, A01(115, 25, 27) + A08);
            return null;
        }
        DE A002 = DE.A00(interfaceC0328Bt, c0470Hz);
        while (A002.A00 != IF.A08(A01(218, 4, 32))) {
            interfaceC0328Bt.A3W((int) A002.A01);
            A002 = DE.A00(interfaceC0328Bt, c0470Hz);
        }
        AbstractC0445Ha.A04(A002.A01 >= 16);
        interfaceC0328Bt.ADv(c0470Hz.A00, 0, 16);
        c0470Hz.A0Y(0);
        int A0C = c0470Hz.A0C();
        int A0C2 = c0470Hz.A0C();
        int A0B = c0470Hz.A0B();
        int A0B2 = c0470Hz.A0B();
        int A0C3 = c0470Hz.A0C();
        int A0C4 = c0470Hz.A0C();
        int i2 = (A0C2 * A0C4) / 8;
        if (A0C3 != i2) {
            throw new C02789v(A01(57, 26, 48) + i2 + A01(10, 7, 62) + A0C3);
        }
        switch (A0C) {
            case 1:
            case 65534:
                i = IF.A02(A0C4);
                break;
            case 3:
                if (A0C4 == 32) {
                    i = 4;
                    break;
                }
                break;
            default:
                Log.e(A01, A01(Opcodes.IF_ACMPNE, 29, 30) + A0C);
                return null;
        }
        if (i == 0) {
            Log.e(A01, A01(Opcodes.F2L, 26, 101) + A0C4 + A01(0, 10, 35) + A0C);
            return null;
        }
        interfaceC0328Bt.A3W(((int) A002.A01) - 16);
        return new C0835Wl(A0C2, A0B, A0B2, A0C3, A0C4, i);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 36);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{39, 97, 104, 117, 39, 115, 126, 119, 98, 39, 33, 58, 125, 117, 110, 32, 58, 123, 80, 77, 86, 83, Ascii.CAN, 81, 75, Ascii.CAN, 76, 87, 87, Ascii.CAN, 84, 89, 74, 95, 93, Ascii.CAN, 16, 70, 10, Byte.MAX_VALUE, 122, 19, 17, Ascii.CAN, 76, 87, Ascii.CAN, 75, 83, 81, 72, 3, Ascii.CAN, 81, 92, 2, Ascii.CAN, 81, 108, 100, 113, 119, 96, 113, 112, 52, 118, 120, 123, 119, Byte.MAX_VALUE, 52, 117, 120, 125, 115, 122, 121, 113, 122, 96, 46, 52, 103, 73, 64, 65, 92, 71, 64, 73, Ascii.SO, 91, 64, 69, 64, 65, 89, 64, Ascii.SO, 121, 111, 120, Ascii.SO, 77, 70, 91, 64, 69, Ascii.DC4, Ascii.SO, 6, Ascii.GS, Ascii.DC2, Ascii.DC2, 106, 81, 76, 74, 79, 79, 80, 77, 75, 90, 91, Ascii.US, 109, 118, 121, 121, Ascii.US, 89, 80, 77, 82, 94, 75, 5, Ascii.US, Ascii.DC4, 47, 50, 52, 49, 49, 46, 51, 53, 36, 37, 97, Ascii.SYN, 0, Ascii.ETB, 97, 35, 40, 53, 97, 37, 36, 49, 53, 41, 97, 111, 84, 73, 79, 74, 74, 85, 72, 78, 95, 94, Ascii.SUB, 109, 123, 108, Ascii.SUB, 92, 85, 72, 87, 91, 78, Ascii.SUB, 78, 67, 74, 95, 0, Ascii.SUB, 126, 104, Byte.MAX_VALUE, 108, 126, 72, 95, 97, 76, 72, 77, 76, 91, 123, 76, 72, 77, 76, 91, 10, Ascii.SI, Ascii.SUB, Ascii.SI, 98, 105, 112, 36};
    }

    public static void A03(InterfaceC0328Bt interfaceC0328Bt, C0835Wl c0835Wl) throws IOException, InterruptedException {
        AbstractC0445Ha.A01(interfaceC0328Bt);
        AbstractC0445Ha.A01(c0835Wl);
        interfaceC0328Bt.AFM();
        C0470Hz c0470Hz = new C0470Hz(8);
        DE A002 = DE.A00(interfaceC0328Bt, c0470Hz);
        while (A002.A00 != IF.A08(A01(214, 4, 74))) {
            Log.w(A01(Opcodes.IFNONNULL, 15, 13), A01(83, 28, 10) + A002.A00);
            long j = A002.A01 + 8;
            if (A002.A00 == IF.A08(A01(111, 4, 112))) {
                j = 12;
            }
            if (j <= 2147483647L) {
                interfaceC0328Bt.AGP((int) j);
                A002 = DE.A00(interfaceC0328Bt, c0470Hz);
            } else {
                throw new C02789v(A01(17, 40, 28) + A002.A00);
            }
        }
        interfaceC0328Bt.AGP(8);
        c0835Wl.A06(interfaceC0328Bt.A7i(), A002.A01);
    }
}
