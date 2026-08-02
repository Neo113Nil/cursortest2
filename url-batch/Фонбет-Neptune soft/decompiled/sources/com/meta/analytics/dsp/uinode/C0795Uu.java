package com.meta.analytics.dsp.uinode;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Uu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0795Uu extends KT {
    public static byte[] A02;
    public final /* synthetic */ K1 A00;
    public final /* synthetic */ K4 A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 119);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{10, 75, 89, 68, 71, 72, 72, 67, 84, 89, 77, 67, 95, 101, 68, Ascii.VT, 69, 78, 95, 92, 68, 89, 64, Ascii.VT, 72, 68, 69, 69, 78, 72, 95, 66, 68, 69};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        C0889Yn c0889Yn;
        C0889Yn c0889Yn2;
        C0889Yn c0889Yn3;
        C0889Yn c0889Yn4;
        C0889Yn c0889Yn5;
        long j;
        C0889Yn c0889Yn6;
        String str;
        Map<? extends String, ? extends String> map;
        RL A022;
        C0889Yn c0889Yn7;
        C0889Yn c0889Yn8;
        C0889Yn c0889Yn9;
        C0889Yn c0889Yn10;
        long j2;
        c0889Yn = this.A01.A04;
        if (AbstractC0545Ld.A00(c0889Yn) == EnumC0544Lc.A07) {
            this.A01.A09();
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String A00 = A00(13, 21, 92);
            c0889Yn10 = this.A01.A04;
            C0S A0E = c0889Yn10.A0E();
            j2 = this.A01.A00;
            A0E.A2v(C0547Lf.A01(j2), adErrorType.getErrorCode(), A00, adErrorType.isPublicError());
            this.A01.A0D(new C0495Jb(adErrorType, A00));
            return;
        }
        c0889Yn2 = this.A01.A04;
        C8J.A08(c0889Yn2);
        c0889Yn3 = this.A01.A04;
        C6E.A07(c0889Yn3);
        C02448l A002 = C02448l.A00();
        c0889Yn4 = this.A01.A04;
        boolean z = true;
        Map<String, String> A09 = this.A00.A09(A002.A01(c0889Yn4, true).A6w(this.A00.A05()));
        this.A01.A02 = A09;
        try {
            c0889Yn7 = this.A01.A04;
            PackageManager packageManager = c0889Yn7.getPackageManager();
            if (packageManager != null) {
                String A003 = A00(1, 12, 113);
                StringBuilder sb = new StringBuilder();
                c0889Yn8 = this.A01.A04;
                StringBuilder append = sb.append(c0889Yn8.getPackageName()).append(A00(0, 1, 93));
                c0889Yn9 = this.A01.A04;
                A09.put(A003, new String(Base64.encode(append.append(packageManager.getInstallerPackageName(c0889Yn9.getPackageName())).toString().getBytes(), 2)));
            }
        } catch (Exception unused) {
        }
        try {
            if (this.A00.A06() != EnumC0499Jg.A03 && this.A00.A06() != EnumC0499Jg.A05 && this.A00.A06() != EnumC0499Jg.A04 && this.A00.A06() != null) {
                z = false;
            }
            c0889Yn6 = this.A01.A04;
            RK A023 = C0700Rc.A02(z, c0889Yn6);
            str = this.A01.A06;
            RY ry = new RY();
            map = this.A01.A02;
            byte[] A08 = ry.A05(map).A08();
            A022 = this.A01.A02(C0547Lf.A00(), this.A00);
            A023.AE0(str, A08, A022);
        } catch (Exception e) {
            AdErrorType adErrorType2 = AdErrorType.AD_REQUEST_FAILED;
            String message = e.getMessage();
            c0889Yn5 = this.A01.A04;
            C0S A0E2 = c0889Yn5.A0E();
            j = this.A01.A00;
            A0E2.A2v(C0547Lf.A01(j), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            this.A01.A0D(C0495Jb.A01(adErrorType2, message));
        }
    }

    public C0795Uu(K4 k4, K1 k1) {
        this.A01 = k4;
        this.A00 = k1;
    }
}
