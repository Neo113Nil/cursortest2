package com.meta.analytics.dsp.uinode;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.io.encoding.Base64;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class Q0 extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"2LrpfYyae0azpeRldXrTpIs5j5WolZYJ", "aTWFoH17M5HvBaS06GyoTMgY8LK09kB1", "ZT9jJV1ne", "vwbwskwEgIVHj6V8wHV", "a8UIfMhCahgZVDol7QIaAFMNjSR7v8Rm", "pauq9xVSe1TSbn6Nh8iDWIypG", "tig0s2h3zWgeN1kA13N6tuAlrnUP1dby", "gu60Pcp0oAdbO9RcUpkXMIBgrMh0CW0V"};
    public static final float A0E;
    public static final RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public Map<String, String> A02;
    public final AbstractC0992b5 A03;
    public final C00661c A04;
    public final C0889Yn A05;
    public final J2 A06;
    public final InterfaceC0595Nb A07;
    public final C0768Ts A08;
    public final InterfaceC0670Py A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            if (A0D[5].length() != 25) {
                throw new RuntimeException();
            }
            A0D[4] = "2xsSJQdmJTzWNKbVkLPVv70adF3crTtp";
            copyOfRange[i4] = (byte) (i5 ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0C = new byte[]{Ascii.VT, 47, Ascii.GS, 33, 44, 52, 44, 47, 33, 40, Ascii.FF, 41, 52, 5, Ascii.SYN, Ascii.ETB, Ascii.CR, 10, 3, 68, 1, Ascii.SYN, Ascii.SYN, Ascii.VT, Ascii.SYN, 52, 8, 5, Ascii.GS, 5, 6, 8, 1, 68, 0, Ascii.VT, 39, 16, 5, 39, 8, Ascii.CR, 7, Ascii.SI, 68, 16, Ascii.SYN, Ascii.CR, 3, 3, 1, Ascii.SYN, 1, 0, 68, 19, Ascii.CR, 16, Ascii.FF, 68, Ascii.DC4, Ascii.SYN, 1, 73, 1, Ascii.DC2, 1, 10, 16, 68, 7, 8, Ascii.CR, 7, Ascii.SI, Ascii.ETB, 68, 7, Ascii.VT, 17, 10, 16, 68, 5, 10, 0, 68, 32, 1, 8, 5, Ascii.GS, 106, 86, 91, 67, 91, 88, 86, 95, 123, 94, 73, 108, 83, 95, 77, 102, 97, 99, 109, 106, 36, 104, 107, 101, 96, 109, 106, 99, 36, 118, 97, 105, 107, 112, 97, 36, 116, 104, 101, 125, 101, 102, 104, 97, Base64.padSymbol, 50, 55, Base64.padSymbol, 53, 45, 112, 113, 120, 117, 109, 93, 65, 76, 84, 76, 79, 65, 72, 55, 43, 38, 62, 38, 37, 43, 34, Ascii.CAN, 53, 34, 42, 40, 51, 34, Ascii.NAK, 2, 10, 8, 19, 2, 56, Ascii.DC4, 2, Ascii.DC4, Ascii.DC4, Ascii.SO, 8, 9, 56, Ascii.SO, 3, Ascii.DC4, Ascii.SI, Ascii.VT, 5, Ascii.SO, 107, 121, 126, 67, 106, 117, 121, 107};
    }

    static {
        A09();
        A0E = (int) (LD.A02 * 4.0f);
        A0F = new RelativeLayout.LayoutParams(-1, -1);
    }

    public Q0(C0889Yn c0889Yn, AbstractC0992b5 abstractC0992b5, C00661c c00661c, J2 j2, InterfaceC0670Py interfaceC0670Py, Map<String, String> playableMetricsData) {
        super(c0889Yn);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A07 = new AbstractC0771Tv() { // from class: com.facebook.ads.redexgen.X.9O
            @Override // com.meta.analytics.dsp.uinode.InterfaceC0595Nb
            public final void AAn() {
            }

            @Override // com.meta.analytics.dsp.uinode.AbstractC0771Tv, com.meta.analytics.dsp.uinode.InterfaceC0595Nb
            public final void ABW(int i, String str) {
                AtomicBoolean atomicBoolean;
                InterfaceC0670Py interfaceC0670Py2;
                atomicBoolean = Q0.this.A0B;
                atomicBoolean.set(true);
                interfaceC0670Py2 = Q0.this.A09;
                interfaceC0670Py2.AC4();
            }

            @Override // com.meta.analytics.dsp.uinode.InterfaceC0595Nb
            public final void ABj() {
                AtomicBoolean atomicBoolean;
                AtomicBoolean atomicBoolean2;
                InterfaceC0670Py interfaceC0670Py2;
                atomicBoolean = Q0.this.A0B;
                if (atomicBoolean.get()) {
                    return;
                }
                atomicBoolean2 = Q0.this.A0A;
                if (!atomicBoolean2.compareAndSet(false, true)) {
                    return;
                }
                interfaceC0670Py2 = Q0.this.A09;
                interfaceC0670Py2.ABj();
            }

            @Override // com.meta.analytics.dsp.uinode.InterfaceC0595Nb
            public final void ADj() {
                InterfaceC0670Py interfaceC0670Py2;
                interfaceC0670Py2 = Q0.this.A09;
                interfaceC0670Py2.ADj();
            }
        };
        this.A05 = c0889Yn;
        this.A03 = abstractC0992b5;
        this.A04 = c00661c;
        this.A06 = j2;
        this.A09 = interfaceC0670Py;
        this.A02 = playableMetricsData;
        C0768Ts A04 = A04();
        this.A08 = A04;
        if (C0478Ih.A1W(c0889Yn)) {
            c0889Yn.A0A().AGv(A04, abstractC0992b5.A12(), false);
        }
        addView(A04, A0F);
    }

    public static /* synthetic */ int A00(Q0 q0) {
        int i = q0.A00;
        q0.A00 = i + 1;
        return i;
    }

    private C0768Ts A04() {
        C0768Ts c0768Ts = new C0768Ts(this.A05, (WeakReference<InterfaceC0595Nb>) new WeakReference(this.A07), 10, C0478Ih.A1f(this.A05));
        c0768Ts.setCornerRadius(A0E);
        c0768Ts.setLogMultipleImpressions(false);
        c0768Ts.setCheckAssetsByJavascriptBridge(false);
        c0768Ts.setWebViewTimeoutInMillis(this.A04.A08());
        c0768Ts.setRequestId(this.A03.A0S());
        c0768Ts.setOnTouchListener(new ViewOnTouchListenerC0671Pz(this));
        WebSettings settings = c0768Ts.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
        }
        if (Build.VERSION.SDK_INT > 16) {
            c0768Ts.addJavascriptInterface(new Q1(this.A05, this, this.A06, this.A02, this.A03.A12()), A06(0, 12, 104));
        }
        return c0768Ts;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b8, code lost:
    
        if (r3 <= com.meta.analytics.dsp.uinode.C0478Ih.A0H(r8)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ba, code lost:
    
        r3 = r9.A09;
        r2 = com.meta.analytics.dsp.uinode.Q0.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ce, code lost:
    
        if (r2[0].charAt(14) == r2[7].charAt(14)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d0, code lost:
    
        r3.ABD();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d4, code lost:
    
        r2 = com.meta.analytics.dsp.uinode.Q0.A0D;
        r2[0] = "1qrV4xG42mjJ5wR1PYF4mguO0xYm8sMw";
        r2[7] = "To2gWJFbGkwQ4PRGYAw3BZd3UXo54AHv";
        r3.ABD();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f5, code lost:
    
        r7.A05(0);
        r9.A05.A07().A9a(r6, com.meta.analytics.dsp.uinode.C8A.A2E, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f2, code lost:
    
        if (r3 <= com.meta.analytics.dsp.uinode.C0478Ih.A0H(r8)) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0A() {
        long currentTimeMillis = System.currentTimeMillis() - this.A01;
        C8B c8b = new C8B(A06(25, 67, 65));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A06(Opcodes.L2I, 6, 123), this.A00);
            jSONObject.put(A06(Opcodes.D2I, 5, 49), currentTimeMillis);
            jSONObject.put(A06(Opcodes.NEW, 5, 69), this.A03.A12());
        } catch (JSONException e) {
            Log.e(A06(92, 15, 31), A06(12, 13, 65), e);
        }
        c8b.A07(jSONObject);
        c8b.A05(1);
        C0889Yn c0889Yn = this.A05;
        if (A0D[2].length() == 31) {
            throw new RuntimeException();
        }
        String[] strArr = A0D;
        strArr[0] = "lhJ8s2Q4sCds7IROMAxOWHrUi0xft2U2";
        strArr[7] = "JiEJ4GJfM63VUjRSw5kXmgHmRai0omG0";
        AnonymousClass89 A07 = c0889Yn.A07();
        int i = C8A.A2D;
        String A06 = A06(Opcodes.I2S, 8, 8);
        A07.A9b(A06, i, c8b);
        this.A00 = 0;
        if (C0478Ih.A1S(this.A05)) {
            C0889Yn c0889Yn2 = this.A05;
            if (A0D[6].charAt(9) == 'W') {
                A0D[3] = "";
            }
        } else {
            this.A09.ABD();
        }
    }

    public final void A0B() {
        String A0E2;
        if (this.A04.A0J()) {
            C8B c8b = new C8B(A06(107, 29, 33));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A06(Opcodes.TABLESWITCH, 17, 66), this.A04.A0F());
                jSONObject.put(A06(Opcodes.NEW, 5, 69), this.A03.A12());
            } catch (JSONException e) {
                Log.e(A06(92, 15, 31), A06(12, 13, 65), e);
            }
            c8b.A07(jSONObject);
            c8b.A05(1);
            AnonymousClass89 A07 = this.A05.A07();
            if (A0D[4].charAt(0) == 'P') {
                throw new RuntimeException();
            }
            A0D[1] = "TEDpWyR4sKSlO4xRZxixfnQAFgDgpHMF";
            int i = C8A.A2G;
            String A06 = A06(155, 15, 98);
            A07.A9b(A06, i, c8b);
            if (C0478Ih.A0m(this.A05) && AbstractC0545Ld.A00(this.A05) == EnumC0544Lc.A07) {
                this.A05.A07().A9b(A06, C8A.A2F, c8b);
                this.A07.ABW(0, null);
                return;
            }
        }
        try {
            C0768Ts c0768Ts = this.A08;
            if (!TextUtils.isEmpty(this.A04.A0B())) {
                A0E2 = this.A04.A0B();
            } else {
                A0E2 = this.A04.A0E();
            }
            c0768Ts.loadUrl(A0E2);
        } catch (Exception e2) {
            this.A05.A07().A9a(A06(Opcodes.CHECKCAST, 8, 57), C8A.A2d, new C8B(e2));
        }
    }

    public final void A0C() {
        if (C0478Ih.A1W(this.A05)) {
            C0889Yn c0889Yn = this.A05;
            if (A0D[2].length() == 31) {
                throw new RuntimeException();
            }
            A0D[1] = "2a9geg5CZy9bcTekyOeVTlcxLNQduX9G";
            c0889Yn.A0A().AGk(this.A08);
        }
        this.A08.removeJavascriptInterface(A06(0, 12, 104));
        if (A0D[3].length() != 23) {
            A0D[6] = "33aduEcFLWt6pdjLdZ5sJJvVvr5WDkst";
            this.A08.destroy();
        } else {
            this.A08.destroy();
        }
    }

    public C0548Lg getTouchDataRecorder() {
        return this.A08.getTouchDataRecorder();
    }

    public RE getViewabilityChecker() {
        return this.A08.getViewabilityChecker();
    }
}
