package com.meta.analytics.dsp.uinode;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class X7 implements InterfaceC0327Bs {
    public static byte[] A04;
    public static String[] A05 = {"zdP8mq1V4qx9ZCdsfAD4NG7cLFVpQAAe", "koAkuIv", "fyRTvmHGGGsRl9BV6D3JToZwd0QymLEV", "Ol6FmQC", "pWzJ4KWOtVeOprDRKRooJjLfCIz1i7Yl", "FaGWZpOEFJ3DEiDU22ljd64Ld5pUV9HD", "txEKQBUTk3v9kOkzxdvVTnLo1IME9gDG", "VQ1knBpCfCAoSCLl3kVfN2N5wBdN5LBp"};
    public static final InterfaceC0330Bv A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final X6 A02;
    public final C0470Hz A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A05;
            if (strArr[2].charAt(21) == strArr[4].charAt(21)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[6] = "6nR4pRT1Z5KTQHbqvhpghrBhlvQkSoKV";
            strArr2[5] = "SkXTa4uQceGhkSQtr6wVij7rDC15CMq5";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 67);
            i4++;
        }
    }

    public static void A01() {
        A04 = new byte[]{66, 79, 56};
    }

    static {
        A01();
        A06 = new X8();
        A07 = IF.A08(A00(0, 3, 72));
    }

    public X7() {
        this(0L);
    }

    public X7(long j) {
        this.A01 = j;
        this.A02 = new X6(true);
        this.A03 = new C0470Hz(200);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0327Bs
    public final void A8o(InterfaceC0329Bu interfaceC0329Bu) {
        this.A02.A4p(interfaceC0329Bu, new DC(0, 1));
        interfaceC0329Bu.A5Y();
        interfaceC0329Bu.AFi(new C0859Xj(-9223372036854775807L));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0327Bs
    public final int AEH(InterfaceC0328Bt interfaceC0328Bt, C0332Bz c0332Bz) throws IOException, InterruptedException {
        int read = interfaceC0328Bt.read(this.A03.A00, 0, 200);
        if (read == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(read);
        if (!this.A00) {
            this.A02.ADt(this.A01, true);
            this.A00 = true;
        }
        this.A02.A4R(this.A03);
        return 0;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0327Bs
    public final void AFh(long j, long j2) {
        this.A00 = false;
        this.A02.AFg();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0327Bs
    public final boolean AGR(InterfaceC0328Bt interfaceC0328Bt) throws IOException, InterruptedException {
        C0470Hz c0470Hz = new C0470Hz(10);
        C0469Hy c0469Hy = new C0469Hy(c0470Hz.A00);
        int startPosition = 0;
        while (true) {
            interfaceC0328Bt.ADv(c0470Hz.A00, 0, 10);
            c0470Hz.A0Y(0);
            if (c0470Hz.A0G() != A07) {
                break;
            }
            c0470Hz.A0Z(3);
            int A0D = c0470Hz.A0D();
            startPosition += A0D + 10;
            interfaceC0328Bt.A3W(A0D);
        }
        interfaceC0328Bt.AFM();
        interfaceC0328Bt.A3W(startPosition);
        int syncBytes = startPosition;
        int validFramesCount = 0;
        int i = 0;
        while (true) {
            interfaceC0328Bt.ADv(c0470Hz.A00, 0, 2);
            c0470Hz.A0Y(0);
            int headerPosition = 65526 & c0470Hz.A0I();
            if (headerPosition != 65520) {
                i = 0;
                validFramesCount = 0;
                interfaceC0328Bt.AFM();
                syncBytes++;
                int headerPosition2 = syncBytes - startPosition;
                if (headerPosition2 >= 8192) {
                    return false;
                }
                interfaceC0328Bt.A3W(syncBytes);
            } else {
                i++;
                if (i >= 4 && validFramesCount > 188) {
                    return true;
                }
                interfaceC0328Bt.ADv(c0470Hz.A00, 0, 4);
                c0469Hy.A07(14);
                int headerPosition3 = c0469Hy.A04(13);
                if (headerPosition3 <= 6) {
                    return false;
                }
                interfaceC0328Bt.A3W(headerPosition3 - 6);
                validFramesCount += headerPosition3;
            }
        }
    }
}
