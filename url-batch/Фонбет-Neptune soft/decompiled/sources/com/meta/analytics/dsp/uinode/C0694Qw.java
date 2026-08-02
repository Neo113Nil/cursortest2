package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Qw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0694Qw {
    public static byte[] A02;
    public static String[] A03 = {"WzijvlAd9RP1HJzMxCKzeYHnMs2QP54v", "kfrqpsiELz0FvZTPYg", "hAwPDz", "OryCsPOoCbEZ1Kjw18", "JoqBI6chV", "rfkFyJ13DXugB3RLj6H", "rQvj", "kthZXjW83"};
    public final EH A00;
    public final W1 A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 10);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-114, -104, -116, -114, -49, -51, -31, -33, -47, -114, -116, -90, -116, -114, -96, -86, -98, -96, -16, -29, -20, -30, -29, -16, -29, -16, -57, -20, -30, -29, -10, -96, -98, -72, -98, -96, -114, -23, 111, 114, -127, -68, 99, -75, -70, -79, -90, 99, 97, 123, 97, 99};
    }

    static {
        A02();
    }

    public C0694Qw(C0889Yn c0889Yn) {
        W1 w1 = new W1();
        this.A01 = w1;
        InterfaceC0425Gf trackSelectionFactory = new W8(w1);
        this.A00 = AbstractC02629e.A00(new Y7(c0889Yn), new C0323Bo(trackSelectionFactory), new Y9());
    }

    public static String A01(C02609c c02609c) {
        return A00(41, 11, 55) + c02609c.A01 + A00(14, 22, 116) + c02609c.A00 + A00(0, 14, 98) + c02609c.getCause() + A00(36, 2, 98);
    }

    public static boolean A03() {
        if (A03[0].charAt(3) == 'z') {
            throw new RuntimeException();
        }
        A03[6] = "p35x";
        return true;
    }

    public final int A04() {
        return this.A00.A0J();
    }

    public final int A05() {
        return this.A00.A6B();
    }

    public final long A06() {
        return this.A00.A6d();
    }

    public final long A07() {
        return this.A00.A6q();
    }

    public final C0692Qu A08() {
        Format vf = this.A00.A0L();
        if (vf == null) {
            return null;
        }
        return new C0692Qu(vf.A0F, vf.A08);
    }

    public final void A09() {
        this.A00.AEV();
    }

    public final void A0A() {
        this.A00.AFk();
    }

    public final void A0B() {
        this.A00.A0M();
    }

    public final void A0C(float f) {
        this.A00.A0N(f);
    }

    public final void A0D(long j) {
        this.A00.AFj(j);
    }

    public final void A0E(Surface surface) {
        this.A00.A0O(surface);
    }

    public final void A0F(C0888Ym c0888Ym, Uri uri) {
        if (C0478Ih.A2Q(c0888Ym, A03())) {
            R0 cacheManager = R0.A05(c0888Ym);
            WR wr = new WR(cacheManager.A0F(c0888Ym));
            String A08 = R0.A08(c0888Ym, uri);
            if (A08 != null) {
                wr.A00(A08);
            }
            this.A00.A0P(wr.A01(uri));
            return;
        }
        InterfaceC0387Eq mediaSource = new WR(new C0826Vz(c0888Ym, IF.A0K(c0888Ym, A00(38, 3, 4)), this.A01)).A01(uri);
        this.A00.A0P(mediaSource);
    }

    public final void A0G(InterfaceC0691Qt interfaceC0691Qt) {
        this.A00.A3Q(new C0516Jx(this, interfaceC0691Qt));
    }

    public final void A0H(InterfaceC0693Qv interfaceC0693Qv) {
        this.A00.A0Q(new C0517Jy(this, interfaceC0693Qv));
    }

    public final void A0I(boolean z) {
        this.A00.AG9(z);
    }

    public final boolean A0J() {
        return this.A00.A7g();
    }

    public final boolean A0K() {
        return this.A00.A0K() != null;
    }
}
