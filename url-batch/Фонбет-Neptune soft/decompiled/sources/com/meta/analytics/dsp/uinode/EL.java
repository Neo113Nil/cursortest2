package com.meta.analytics.dsp.uinode;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.app.NotificationManagerCompat;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class EL {
    public static byte[] A05;
    public static String[] A06 = {"ys79rflcZR", "JvXVVVa5NcPDQ", "Q89GAQFZPNwANkfCdiKH1gvUr6", "fZOyMOuChjfI9gOKYd90JCIRk18sz1rD", "OOW8UfRJew081BUdbBG5Pxzf0VO", "xPmLQSFy3SjaACTv6gu", "e8kFvK5VJCM4F", "4YvHW6"};
    public final InterfaceC0437Gr A00;
    public final InterfaceC0439Gt A01;
    public final InterfaceC0439Gt A02;
    public final HK A03;
    public final I3 A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] - i3) - 26;
            String[] strArr = A06;
            if (strArr[1].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A06[5] = "z6hEl1VDyGriGJRg";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{126, -115, Byte.MIN_VALUE, 124, -113, Byte.MIN_VALUE, 95, 124, -113, 124, 110, -124, -119, -122};
    }

    static {
        A01();
    }

    public EL(HK hk, InterfaceC0439Gt interfaceC0439Gt) {
        this(hk, interfaceC0439Gt, null, null, null);
    }

    public EL(HK hk, InterfaceC0439Gt interfaceC0439Gt, InterfaceC0439Gt interfaceC0439Gt2, InterfaceC0437Gr interfaceC0437Gr, I3 i3) {
        AbstractC0445Ha.A01(interfaceC0439Gt);
        this.A03 = hk;
        this.A02 = interfaceC0439Gt;
        this.A01 = interfaceC0439Gt2;
        this.A00 = interfaceC0437Gr;
        this.A04 = i3;
    }

    public final HK A02() {
        return this.A03;
    }

    public final C0811Vk A03(boolean z) {
        InterfaceC0440Gu c0823Vw;
        InterfaceC0439Gt interfaceC0439Gt = this.A01;
        if (interfaceC0439Gt != null) {
            c0823Vw = interfaceC0439Gt.A4X();
        } else {
            c0823Vw = new C0823Vw();
        }
        if (z) {
            return new C0811Vk(this.A03, C0824Vx.A02, c0823Vw, null, 1, null);
        }
        if (0 != 0) {
            throw new NullPointerException(A00(0, 14, 1));
        }
        C0812Vl c0812Vl = new C0812Vl(this.A03, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        InterfaceC0440Gu A4X = this.A02.A4X();
        I3 i3 = this.A04;
        if (i3 != null) {
            A4X = new C0816Vp(A4X, i3, NotificationManagerCompat.IMPORTANCE_UNSPECIFIED);
        }
        InterfaceC0440Gu upstream = c0823Vw;
        return new C0811Vk(this.A03, A4X, upstream, c0812Vl, 1, null);
    }

    public final I3 A04() {
        I3 i3 = this.A04;
        return i3 != null ? i3 : new I3();
    }
}
