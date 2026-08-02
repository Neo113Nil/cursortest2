package com.meta.analytics.dsp.uinode;

import android.graphics.Rect;
import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4Y, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C4Y {
    public static byte[] A03;
    public int A00;
    public final Rect A01;
    public final AbstractC01554o A02;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{84, 83, 75, 92, 81, 84, 89, Ascii.GS, 82, 79, 84, 88, 83, 73, 92, 73, 84, 82, 83};
    }

    public abstract int A06();

    public abstract int A07();

    public abstract int A08();

    public abstract int A09();

    public abstract int A0A();

    public abstract int A0B();

    public abstract int A0C(View view);

    public abstract int A0D(View view);

    public abstract int A0E(View view);

    public abstract int A0F(View view);

    public abstract int A0G(View view);

    public abstract int A0H(View view);

    public abstract void A0J(int i);

    public C4Y(AbstractC01554o abstractC01554o) {
        this.A00 = Integer.MIN_VALUE;
        this.A01 = new Rect();
        this.A02 = abstractC01554o;
    }

    public /* synthetic */ C4Y(AbstractC01554o abstractC01554o, C0913Zm c0913Zm) {
        this(abstractC01554o);
    }

    public static C0913Zm A00(AbstractC01554o abstractC01554o) {
        return new C0913Zm(abstractC01554o);
    }

    public static C0912Zl A01(AbstractC01554o abstractC01554o) {
        return new C0912Zl(abstractC01554o);
    }

    public static C4Y A02(AbstractC01554o abstractC01554o, int i) {
        switch (i) {
            case 0:
                return A00(abstractC01554o);
            case 1:
                return A01(abstractC01554o);
            default:
                throw new IllegalArgumentException(A03(0, 19, 11));
        }
    }

    public final int A05() {
        if (Integer.MIN_VALUE == this.A00) {
            return 0;
        }
        return A0B() - this.A00;
    }

    public final void A0I() {
        this.A00 = A0B();
    }
}
