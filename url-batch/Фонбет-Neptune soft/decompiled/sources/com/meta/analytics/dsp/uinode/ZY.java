package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class ZY extends AbstractC01584r {
    public static byte[] A03;
    public static String[] A04 = {"WP5CpU5dCfM1vj2iCgRczyLeS833jqA7", "f0t6mABNpir4NiI1IJBR", "VMSqLwjWc3fXvu7D9B7JwatTJSWiKmSt", "2kGOlvpEajHcc9JJ5BV7kSrV8Uhb9VDh", "BGGgbgkg4NpzKA2XjpG6Q8iHB2GG9zH0", "ziOTckvigWpUqNYWulExTvMWDfbzI1Sq", "WkLWBkQ13lLgYVln8HDaQ7gYbGPRUWfj", "hZJ2tRP2pGaevCKAXmW2Fr9GhnOGACBf"};
    public C0372Eb A00;
    public Scroller A01;
    public final AbstractC01604t A02 = new ZZ(this);

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        byte[] bArr = {-35, 10, -68, 5, 10, Ascii.SI, 16, -3, 10, -1, 1, -68, Ascii.VT, 2, -68, -21, 10, -30, 8, 5, 10, 3, -24, 5, Ascii.SI, 16, 1, 10, 1, Ascii.SO, -68, -3, 8, Ascii.SO, 1, -3, 0, Ascii.NAK, -68, Ascii.SI, 1, 16, -54};
        if (A04[2].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[3] = "Gfsvb5V6ZkZ1EjPhJmDEOg0wCX37AMGK";
        strArr[5] = "BogmwpJuEiSgKohE6B9VLJKkNQC2pxlX";
        A03 = bArr;
    }

    public abstract int A0C(AbstractC01554o abstractC01554o, int i, int i2);

    public abstract View A0D(AbstractC01554o abstractC01554o);

    @Deprecated
    public abstract C0914Zn A0E(AbstractC01554o abstractC01554o);

    public abstract int[] A0H(AbstractC01554o abstractC01554o, View view);

    static {
        A09();
    }

    private final C0914Zn A05(AbstractC01554o abstractC01554o) {
        return A0E(abstractC01554o);
    }

    private void A07() {
        this.A00.A1g(this.A02);
        this.A00.setOnFlingListener(null);
    }

    private void A08() throws IllegalStateException {
        if (this.A00.getOnFlingListener() == null) {
            this.A00.A1f(this.A02);
            this.A00.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException(A06(0, 43, 103));
    }

    private boolean A0A(AbstractC01554o abstractC01554o, int i, int i2) {
        C0914Zn A05;
        if (!(abstractC01554o instanceof AnonymousClass50) || (A05 = A05(abstractC01554o)) == null) {
            return false;
        }
        int A0C = A0C(abstractC01554o, i, i2);
        String[] strArr = A04;
        if (strArr[0].charAt(25) == strArr[7].charAt(25)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "3QNQgzU1MIdfo8xP0zEWa1SfaSPVi8u7";
        strArr2[7] = "BhxrOivCOMjMD1hwED78TbVHZR3oyoMb";
        if (A0C == -1) {
            return false;
        }
        A05.A0A(A0C);
        abstractC01554o.A1L(A05);
        return true;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01584r
    public final boolean A0B(int i, int i2) {
        AbstractC01554o layoutManager = this.A00.getLayoutManager();
        if (layoutManager == null || this.A00.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.A00.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && A0A(layoutManager, i, i2);
    }

    public final void A0F() {
        AbstractC01554o layoutManager;
        View A0D;
        C0372Eb c0372Eb = this.A00;
        if (c0372Eb == null || (layoutManager = c0372Eb.getLayoutManager()) == null || (A0D = A0D(layoutManager)) == null) {
            return;
        }
        int[] A0H = A0H(layoutManager, A0D);
        if (A0H[0] != 0 || A0H[1] != 0) {
            this.A00.A1c(A0H[0], A0H[1]);
        }
    }

    public final void A0G(C0372Eb c0372Eb) throws IllegalStateException {
        C0372Eb c0372Eb2 = this.A00;
        if (c0372Eb2 == c0372Eb) {
            return;
        }
        if (c0372Eb2 != null) {
            A07();
        }
        this.A00 = c0372Eb;
        if (c0372Eb != null) {
            A08();
            this.A01 = new Scroller(this.A00.getContext(), new DecelerateInterpolator());
            A0F();
        }
    }
}
