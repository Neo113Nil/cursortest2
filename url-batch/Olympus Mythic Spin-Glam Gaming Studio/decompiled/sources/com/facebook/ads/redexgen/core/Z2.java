package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class Z2 extends FrameLayout {
    public static byte[] A0D;
    public static String[] A0E = {"EYRP1PEEhxzmFZofVXiCCrEXWQs6qPAa", "IPRTBS", "NsAYUXCCkxBbK0XyUhCt1xHChz5fZfMK", "fEJJ0", "6651Qynk9CVpAvzNTMvYSQKVDYa6iazW", "nD7S5n7VHEDKGeK1PzI1a27Vk58dSaaa", "vFV0GS7SjmRPmH7mLZ5yrXn6gSrRknN8", "LPfldR2r"};
    public static final int A0F;
    public boolean A00;
    public final C3388ji A01;
    public final AbstractC3383jd A02;
    public final C3218gi A03;
    public final VA A04;
    public final VI A05;
    public final Y2 A06;
    public final C2524Ow A07;
    public final AbstractC2518Oq A08;
    public final AbstractC3162fo A09;
    public final C3163fp A0A;
    public final String A0B;
    public final WeakReference<Z1> A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public Z2(C3218gi c3218gi, VA va, C2624Sx c2624Sx, WeakReference<Z1> weakReference, int i, int i2, int i3, int i4, C3388ji c3388ji, String str) {
        super(c3218gi);
        this.A06 = new Y2();
        this.A03 = c3218gi;
        this.A04 = va;
        this.A01 = c3388ji;
        this.A0C = weakReference;
        this.A0B = str;
        AbstractC3383jd A0F2 = this.A01.A0F();
        if (A0F2 == null) {
            throw new IllegalStateException(A09(0, 32, 86));
        }
        this.A02 = this.A01.A0F();
        YB.A0N(this, -1);
        this.A05 = new VI(this.A01.A7O(), this.A04);
        this.A09 = A06();
        this.A0A = A07(i, i4, i2, i3);
        LinearLayout linearLayout = new LinearLayout(c3218gi);
        linearLayout.setOrientation(1);
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        this.A08 = A04(c2624Sx);
        if (this.A08 != null) {
            linearLayout.addView(this.A08, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        this.A07 = A02(A0F2);
        linearLayout.addView(this.A07, new LinearLayout.LayoutParams(-1, -2));
    }

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 99);
            if (A0E[6].charAt(17) == 'I') {
                throw new RuntimeException();
            }
            A0E[6] = "HyV3wef6DGt1nbLL1fRSvAmBe6VeBas4";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A0D = new byte[]{-6, 29, -39, 29, 26, 45, 26, -39, 27, 46, 39, 29, 37, 30, -39, 34, 44, -39, 28, 26, 39, 39, 40, 45, -39, 27, 30, -39, 39, 46, 37, 37, 52, 64, 62, -1, 55, 50, 52, 54, 51, 64, 64, 60, -1, 50, 53, 68, -1, 51, 50, 63, 63, 54, 67, -1, 52, 61, 58, 52, 60, 54, 53};
    }

    static {
        A0F();
        A0F = (int) (XX.A02 * 40.0f);
    }

    private C2524Ow A02(AbstractC3383jd abstractC3383jd) {
        C2476Na A00;
        NR A29 = abstractC3383jd.A29();
        PW pw = new PW() { // from class: com.facebook.ads.redexgen.X.6f
            public static byte[] A01;
            public static String[] A02 = {"69whQSJFXzC5tMS1mvBQof2SK7ErE5ZD", "1jHEgafKgZ1qGtZeFln5jYEaZuoTSi1L", "X7dL0uEA8hI8yFDxVjmpGWGPGaRf3imC", "xkNxR1N5ht6u5HrBYV6Jaj9BRbbqvvjX", "FzWiIV8jsRMCATg74qRy8XJg", "NPgeBhkCK5cdUCtVbQG3V7Bzbyz9qF6p", "wkBgnizDM2wMuU", "fQJYdDBiu8hI0YoMzyDMv7ESaoH1tCRU"};

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                int i4 = 0;
                while (true) {
                    int length = copyOfRange.length;
                    String[] strArr = A02;
                    if (strArr[5].charAt(30) == strArr[3].charAt(30)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A02;
                    strArr2[5] = "zFlqgUHcpRBmVFunDUsFQIo1zDN3Ly6W";
                    strArr2[3] = "vgtBZdmtnd3XTM9GsG6r3isUaM0HNLHl";
                    if (i4 >= length) {
                        return new String(copyOfRange);
                    }
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 4);
                    i4++;
                }
            }

            public static void A01() {
                A01 = new byte[]{-102};
            }

            static {
                A01();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC2759Yh
            public final void A4j(String str) {
                String str2;
                C3218gi c3218gi;
                StringBuilder append = new StringBuilder().append(str).append(A00(0, 1, 92));
                str2 = Z2.this.A0B;
                Intent intent = new Intent(append.append(str2).toString());
                c3218gi = Z2.this.A03;
                P2.A00(c3218gi).A07(intent);
            }
        };
        if (getOrientation() == 1) {
            A00 = abstractC3383jd.A28().A01();
        } else {
            NN A28 = abstractC3383jd.A28();
            String[] strArr = A0E;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0E[7] = "bY8FFe1Y";
            A00 = A28.A00();
        }
        C2524Ow c2524Ow = new C2524Ow(this.A03, A0F, A00, A29.A0J().A06(), A09(32, 31, 110), this.A04, pw, this.A0A, this.A06, abstractC3383jd.A2A());
        c2524Ow.setInfo(A29.A0I(), A29.A0J(), this.A01.A7O(), abstractC3383jd.A2C().A01(), null, null);
        if (C2668Up.A1N(this.A03)) {
            c2524Ow.A0k();
        }
        return c2524Ow;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.6q] */
    private AbstractC2518Oq A04(C2624Sx c2624Sx) {
        final ViewOnClickListenerC2777Yz viewOnClickListenerC2777Yz = new ViewOnClickListenerC2777Yz(this);
        String videoUrl = this.A01.A0e();
        if (A0H(c2624Sx, this.A01) && videoUrl != null) {
            C20626g videoView = new C20626g(this.A03, this.A04, c2624Sx, this.A05, viewOnClickListenerC2777Yz, this.A02).A0I(this.A01.A7O(), videoUrl, this.A01.A0H() != null ? this.A01.A0H().getUrl() : null, this.A01.A0R(), this.A01.A0Q());
            if (C2668Up.A1R(this.A03)) {
                setViewAsCTA(videoView);
            }
            return videoView;
        }
        C2680Vb A0H = this.A01.A0H();
        if (A0H == null) {
            return null;
        }
        final C3218gi c3218gi = this.A03;
        final VI vi = this.A05;
        final AbstractC3383jd abstractC3383jd = this.A02;
        C20726q A0I = new AbstractC2518Oq(c3218gi, viewOnClickListenerC2777Yz, vi, abstractC3383jd) { // from class: com.facebook.ads.redexgen.X.6q
            public final C2871b5 A00;

            {
                super(c3218gi, viewOnClickListenerC2777Yz, vi, abstractC3383jd);
                this.A00 = new C2871b5(c3218gi);
                addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC2518Oq
            public final void A0E() {
                super.A0E();
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC2518Oq
            public final void A0F() {
                super.A0F();
                if (this.A04 != null) {
                    YB.A0J(this.A04);
                    this.A04.setLayoutParams(AbstractC2518Oq.A0A(null));
                    addView(this.A04);
                }
            }

            public final C20726q A0I(String str) {
                new LM(this.A00, this.A08).A05(this.A00.getHeight(), this.A00.getWidth()).A06(new C2519Or(this)).A07(str);
                A0F();
                return this;
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC2518Oq
            public int getMediaViewId() {
                return this.A00.getId();
            }
        }.A0I(A0H.getUrl());
        if (C2668Up.A1P(this.A03)) {
            setViewAsCTA(A0I);
        }
        return A0I;
    }

    private C2503Ob A06() {
        return new C2503Ob(this);
    }

    private C3163fp A07(int i, int i2, int i3, int i4) {
        C3163fp c3163fp = new C3163fp(this, i, i2, true, new WeakReference(this.A09), this.A03);
        c3163fp.A0W(i3);
        c3163fp.A0X(i4);
        return c3163fp;
    }

    private void A0C() {
        String A0M = this.A01.A0M();
        if (!TextUtils.isEmpty(A0M)) {
            X6 x6 = new X6();
            C3218gi c3218gi = this.A03;
            Uri A00 = XB.A00(A0M);
            String adChoicesLinkUrl = this.A01.A7O();
            X6.A0O(x6, c3218gi, A00, adChoicesLinkUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A05.A04(VH.A0A, null);
        if (!AbstractC2509Oh.A00(this.A03.A02()).A0O(this.A03, false)) {
            A0C();
            return;
        }
        AbstractC2781Zd A01 = AbstractC2782Ze.A01(this.A03, this.A04, this.A01.A7O(), this);
        if (A01 == null) {
            A0C();
            return;
        }
        YB.A0W(this);
        addView(A01, new FrameLayout.LayoutParams(-1, -1));
        A01.A0N();
    }

    private void A0E() {
        if (getVisibility() == 0 && this.A00 && hasWindowFocus()) {
            this.A0A.A0U();
        } else {
            this.A0A.A0V();
        }
    }

    public static boolean A0H(C2624Sx c2624Sx, C3388ji c3388ji) {
        String A0e = c3388ji.A0e();
        if (TextUtils.isEmpty(A0e)) {
            return false;
        }
        String videoUrl = c2624Sx.A0T(A0e);
        return !TextUtils.isEmpty(videoUrl);
    }

    public final void A0I() {
        if (this.A08 != null) {
            this.A08.A0D();
        }
        if (this.A0A != null) {
            this.A0A.A0V();
        }
        YB.A0J(this);
    }

    public final void A0J() {
        if (this.A08 != null) {
            AbstractC2518Oq abstractC2518Oq = this.A08;
            if (A0E[2].charAt(13) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[0] = "hgkEcT5pEsAUKYMkvVnojxGMD5WCOUSh";
            strArr[5] = "qBRuzdoZQfMYUt1SZmDdshQz8Ndd8EXP";
            abstractC2518Oq.A0E();
        }
    }

    private int getOrientation() {
        Activity activity = this.A03.A0E();
        if (activity != null) {
            return activity.getResources().getConfiguration().orientation;
        }
        return 1;
    }

    public C3163fp getViewabilityChecker() {
        return this.A0A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A00 = true;
        A0E();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00 = false;
        A0E();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        A0E();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A0E();
    }

    private void setViewAsCTA(View view) {
        view.setOnClickListener(new Z0(this));
    }
}
