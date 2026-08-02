package com.meta.analytics.dsp.uinode;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.Yp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0891Yp implements InterfaceC0697Qz {
    public static byte[] A04;
    public static String[] A05 = {"YemVV2CAzinSYko79pvdFyiaYh6Ax0NW", "FtFCRkuseyQck6qipAKyAgz81MNc63Vq", "zQJLp3VKHBLQ3ByylDAuuS44tkTO3MMG", "42Yp5AyXW20j54q75pN0MZ83oMgNP5AR", "H6ih9Bh2z", "6YmusGfII7QcqEjcRVkg771Wm5bkMvFZ", "MrQdRQonl4dLBaJwcA8", "V6zsFfxQuHmo6VBO3CkkHMQL74uZQLm4"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C6X A02;
    public final /* synthetic */ C6Y A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 94);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{Ascii.CAN, 3, 6, 3, 2, Ascii.SUB, 3, 62, 33, 44, 45, 39};
    }

    static {
        A01();
    }

    public C0891Yp(C6X c6x, C6Y c6y, long j, long j2) {
        this.A02 = c6x;
        this.A03 = c6y;
        this.A00 = j;
        this.A01 = j2;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0697Qz
    public final void ABL(boolean z) {
        C02177f c02177f;
        BlockingQueue blockingQueue;
        C02177f c02177f2;
        Map map;
        C02177f c02177f3;
        c02177f = this.A02.A01.A04;
        if (C01976f.A06(c02177f)) {
            C01966e c01966e = new C01966e(this.A03.A06, this.A03.A07, A00(7, 5, 22), this.A03.A02, this.A03.A08);
            c02177f2 = this.A02.A01.A04;
            C01976f.A04(c02177f2, c01966e, z);
            if (!z) {
                c02177f3 = this.A02.A01.A04;
                C01976f.A05(c02177f3, this.A03.A06, this.A03.A07, this.A03.A08, A00(7, 5, 22), this.A03.A02, 2112, null, Long.valueOf(this.A00), Long.valueOf(System.currentTimeMillis() - this.A01), null);
            }
            map = C01946c.A0G;
            if (A05[1].charAt(13) == 'O') {
                throw new RuntimeException();
            }
            A05[1] = "tpujksKgYg5a3fdXCIDkrfoMaur1s0eW";
            map.put(c01966e.A04, c01966e);
        }
        try {
            blockingQueue = this.A02.A00;
            blockingQueue.put(true);
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0697Qz
    public final void ABT(Throwable th) {
        C02177f c02177f;
        BlockingQueue blockingQueue;
        C02177f c02177f2;
        c02177f = this.A02.A01.A04;
        if (C01976f.A06(c02177f)) {
            c02177f2 = this.A02.A01.A04;
            String str = this.A03.A06;
            String str2 = this.A03.A07;
            String str3 = this.A03.A08;
            String A00 = A00(7, 5, 22);
            String str4 = this.A03.A02;
            String th2 = th != null ? th.toString() : A00(0, 7, 51);
            Long valueOf = Long.valueOf(System.currentTimeMillis() - this.A01);
            String[] strArr = A05;
            if (strArr[3].charAt(20) == strArr[0].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[2] = "AayJnSlXKOYoed0ZHJ3UlPrg44Go7inE";
            strArr2[7] = "t2uUu9WqhkybHrBNVhVVT1YnAGopOKs6";
            C01976f.A05(c02177f2, str, str2, str3, A00, str4, 2119, th2, null, valueOf, null);
        }
        try {
            blockingQueue = this.A02.A00;
            blockingQueue.put(false);
        } catch (InterruptedException unused) {
        }
    }
}
