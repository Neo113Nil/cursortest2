package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import org.chromium.net.NetError;

/* loaded from: assets/audience_network/classes2.dex */
public final class ZR implements TA {
    public static ZR A07;
    public static byte[] A08;
    public InterfaceC2448Lx A00;
    public T1 A01;
    public T9 A02;
    public TP A03;
    public U7 A04;
    public VM A05;
    public CY A06;

    static {
        A07();
    }

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + NetError.ERR_CONNECTION_TIMED_OUT);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{44, 62, 76, 76, 66, 72, 71, -7, 61, 58, 77, 58, -7, 66, 71, 66, 77, 66, 58, 69, 66, 83, 62, 61, 28, -13, -19, 32, 27, -15, 28, 15, 26, 25, 28, 30, -3, 15, 29, 29, 19, 25, 24, -18, 11, 30, 11, -13, 24, 19, 30, 19, 11, 22, 19, 36, 15, 14};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C3214ge c3214ge) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c3214ge);
        this.A06 = A05(c3214ge, this.A03, A03(c3214ge));
        A09(c3214ge, A00(c3214ge, this.A06));
        A0A(c3214ge, this.A06);
        A0B(c3214ge, this.A06);
        if (this.A06 != null) {
            this.A06.A6d();
        }
    }

    public static SR A00(C3214ge c3214ge, CY cy) {
        if (!C2668Up.A1r(c3214ge) || cy == null) {
            return null;
        }
        return SS.A00().A00(cy);
    }

    public static TP A01(C3214ge c3214ge) {
        return TQ.A00().A00(c3214ge, new C2917bp());
    }

    public static synchronized ZR A02() {
        ZR zr;
        synchronized (ZR.class) {
            if (A07 == null) {
                A07 = new ZR();
            }
            zr = A07;
        }
        return zr;
    }

    public static InterfaceC3169fv A03(C3214ge c3214ge) {
        if (!C2668Up.A1n(c3214ge)) {
            return null;
        }
        return C3187gD.A01(c3214ge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.TA
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized CY A9F() {
        return this.A06;
    }

    public static CY A05(C3214ge c3214ge, TP tp, InterfaceC3169fv interfaceC3169fv) {
        if (!C2668Up.A2m(c3214ge) || interfaceC3169fv == null || ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return AbstractC3210ga.A00().A00(c3214ge, tp, interfaceC3169fv, WI.A04(c3214ge), new ZW(new WA(c3214ge, A06(0, 0, 9), null, EnumC2693Vq.A08, 0, new C2697Vu(), AbstractC2745Xt.A01(C2668Up.A0N(c3214ge)), null, null, new C3337ij()), c3214ge), C3208gY.A00().A00());
    }

    public static void A08() {
        AbstractC2701Vy.A05(A06(30, 28, 52), A06(0, 24, 99), A06(24, 6, 68));
    }

    public static void A09(C3214ge c3214ge, SR sr) {
        if (!C2668Up.A1r(c3214ge) || sr == null) {
            return;
        }
        SP.A00().A00(sr, c3214ge);
    }

    public static void A0A(C3214ge c3214ge, CY cy) {
        if (!C2668Up.A0m(c3214ge) || cy == null) {
            return;
        }
        new C2613Sm(c3214ge, cy, new C2614Sn(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C3214ge c3214ge, CY cy) {
        if (cy == null) {
            return;
        }
        AbstractC2672Ut.A00(c3214ge, cy);
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final VA A6n(C3214ge c3214ge) {
        return WW.A01(c3214ge);
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized T9 A74(T8 t8) {
        if (this.A02 == null) {
            this.A02 = new C2784Zg(this);
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized T1 A7G() {
        if (this.A01 == null) {
            this.A01 = new C3219gj();
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized TP A7l(T8 t8) {
        if (this.A03 == null) {
            this.A03 = A01(t8.A02());
        }
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized InterfaceC2629Tc A7n(T8 t8) {
        return new C3112f0(t8);
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized TB A7x(final T8 t8) {
        return new AbstractC2916bo(t8) { // from class: com.facebook.ads.redexgen.X.72
            @Override // com.facebook.ads.redexgen.core.TB
            public final boolean A9m() {
                return TextureViewSurfaceTextureListenerC2218Cz.A09();
            }

            @Override // com.facebook.ads.redexgen.core.TB
            public final void ACP() {
                U2.A06(C2591Rp.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.core.TB
            public final void ACn() {
                U2.A07(C2591Rp.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.core.TB
            public final void ADI(C3214ge c3214ge) {
                OP.A01(c3214ge);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized InterfaceC2448Lx A8C(T8 t8) {
        if (!C2668Up.A13(t8)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = AbstractC2449Ly.A00().A00(new C2880bE(t8));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized TD A8y(T8 t8) {
        return new C2854ao(t8);
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final C3214ge A8z(Context context) {
        C3214ge sdkContext = T7.A00();
        if (sdkContext == null) {
            C3214ge sdkContext2 = new C3214ge(context, this);
            T7.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized VM A90(C3214ge c3214ge) {
        if (this.A05 == null) {
            this.A05 = new XP(c3214ge);
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized U7 A96() {
        if (this.A04 == null) {
            this.A04 = new U7();
            A08();
        }
        return this.A04;
    }
}
