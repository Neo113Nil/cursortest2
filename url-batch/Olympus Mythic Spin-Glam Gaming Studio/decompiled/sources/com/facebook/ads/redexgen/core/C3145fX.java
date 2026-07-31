package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.view.Surface;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.fX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3145fX {
    public static byte[] A02;
    public final AA A00;
    public final C3586nA A01 = new C3586nA();

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-64, -54, -66, -64, 1, -1, 19, 17, 3, -64, -66, -40, -66, -64, -74, -64, -76, -74, 6, -7, 2, -8, -7, 6, -7, 6, -35, 2, -8, -7, 12, -74, -76, -50, -76, -74, -54, 37, -9, -6, 9, 16, -73, 2, -6, 8, 8, -10, -4, -6, -73, -75, -49, -75, -73, -75, 92, -82, -77, -86, -97, 92, 90, 116, 90, 92};
    }

    public C3145fX(C3218gi c3218gi) {
        InterfaceC2257Em trackSelectionFactory = new C3603nR(this.A01);
        C21359h c21359h = new C21359h(trackSelectionFactory);
        AnonymousClass74 loadControl = new C3696ox();
        this.A00 = AbstractC20576b.A00(new C3693ou(c3218gi), c21359h, loadControl, this.A01);
    }

    public static String A01(C3759pz c3759pz) {
        boolean z = c3759pz instanceof AD;
        String A00 = A00(36, 2, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        String A002 = A00(0, 14, 108);
        if (z) {
            AD ad = (AD) c3759pz;
            return A00(55, 11, 8) + ad.A03 + A00(14, 22, 98) + ad.A02 + A002 + ad.getCause() + A00;
        }
        return A00(41, 14, 99) + c3759pz.getMessage() + A002 + c3759pz.getCause() + A00;
    }

    public static boolean A03() {
        return true;
    }

    public final int A04() {
        return this.A00.A0I();
    }

    public final int A05() {
        return this.A00.A00();
    }

    public final long A06() {
        return this.A00.A7e();
    }

    public final long A07() {
        return this.A00.A7s();
    }

    public final C3143fV A08() {
        C3778qI vf = this.A00.A0K();
        if (vf == null) {
            return null;
        }
        return new C3143fV(vf.A0L, vf.A0A);
    }

    public final void A09() {
        this.A00.A0L();
    }

    public final void A0A() {
        this.A00.A02();
    }

    public final void A0B() {
        this.A00.A01();
    }

    public final void A0C(float f) {
        this.A00.A0M(f);
    }

    public final void A0D(long j) {
        this.A00.A04(j);
    }

    public final void A0E(Surface surface) {
        this.A00.A0N(surface);
    }

    public final void A0F(C3214ge c3214ge, Uri uri) {
        if (C2668Up.A2z(c3214ge, A03())) {
            C3149fb cacheManager = C3149fb.A06(c3214ge);
            C5Y cachedDataSourceFactory = cacheManager.A0H(c3214ge);
            this.A00.A0Q(new C21409o(cachedDataSourceFactory).A04(uri));
            return;
        }
        InterfaceC2216Cx mediaSource = new C21409o(new C3713pE(c3214ge, C5C.A0j(c3214ge, A00(38, 3, 100)), this.A01)).A04(uri);
        this.A00.A0Q(mediaSource);
    }

    public final void A0G(InterfaceC3142fU interfaceC3142fU) {
        this.A00.A0O(new D6(this, interfaceC3142fU));
    }

    public final void A0H(final InterfaceC3144fW interfaceC3144fW) {
        this.A00.A0P(new InterfaceC3684ol() { // from class: com.facebook.ads.redexgen.X.2s
            @Override // com.facebook.ads.redexgen.core.C5L
            public final void AGa(int i, int i2, int i3, float f) {
                interfaceC3144fW.AGa(i, i2, i3, f);
            }
        });
    }

    public final void A0I(boolean z) {
        this.A00.A0S(z);
    }

    public final boolean A0J() {
        return this.A00.A0T();
    }

    public final boolean A0K() {
        return this.A00.A0J() != null;
    }
}
