package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.77, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass77 extends AbstractC0777Ub<RE> implements InterfaceC02137b {
    public static String[] A02 = {"iVby5wy6H7l4dzY0Hld0xs9tuHtnGk", "Nr0U5YnFPaRVMsCPPiWFbDdqiRS3TX59", "NmHEOi9mcJk9OQjZmIqLk3AYwOx5ICK3", "j6OxXppfxNxejmkkIb10P2S2ED13bfax", "YxA", "okdCTGqDBxOQkU", "XAA3rxsPdfTGxXL8JCFSxOB2RupP9g", "Mu"};
    public C0889Yn A00;
    public boolean A01;

    public AnonymousClass77(RE re, C0889Yn c0889Yn) {
        super(re);
        this.A00 = c0889Yn;
        this.A01 = false;
    }

    private void A00(int i) {
        if (!this.A01) {
            this.A00.A0E().A3K(i);
        }
        String[] strArr = A02;
        if (strArr[0].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        A02[1] = "k6Oe58jhR2JQ133LIP7LsY5lW6eco9l5";
        this.A01 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.meta.analytics.dsp.uinode.KT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A06() {
        View view;
        WeakReference weakReference;
        boolean z;
        int i;
        int i2;
        int i3;
        RF rf;
        boolean wasViewable;
        Map map;
        Map map2;
        boolean z2;
        boolean z3;
        boolean z4;
        KT kt;
        Handler handler;
        KT kt2;
        int i4;
        boolean z5;
        boolean z6;
        Map map3;
        RF rf2;
        RE A07 = A07();
        int i5 = 0;
        if (A07 == null) {
            A00(0);
            return;
        }
        view = A07.A0C;
        weakReference = A07.A0E;
        RD rd = (RD) weakReference.get();
        int i6 = 1;
        boolean z7 = view == null;
        if (!z7 && rd != null) {
            i = A07.A0A;
            RF A0E = RE.A0E(view, i, this.A00);
            if (A0E.A04()) {
                RE.A05(A07);
            } else {
                A07.A00 = 0;
            }
            i2 = A07.A00;
            i3 = A07.A09;
            boolean z8 = i2 > i3;
            rf = A07.A05;
            if (rf != null) {
                rf2 = A07.A05;
                if (rf2.A04()) {
                    wasViewable = true;
                    if (!z8 || !A0E.A04()) {
                        A07.A05 = A0E;
                    }
                    String valueOf = String.valueOf(A0E.A01());
                    synchronized (A07) {
                        map = A07.A06;
                        if (map.containsKey(valueOf)) {
                            map3 = A07.A06;
                            i5 = ((Integer) map3.get(valueOf)).intValue();
                        }
                        map2 = A07.A06;
                        map2.put(valueOf, Integer.valueOf(i5 + 1));
                    }
                    if (z8 && !wasViewable) {
                        this.A01 = true;
                        A07.A03 = System.currentTimeMillis();
                        z5 = A07.A07;
                        if (z5) {
                            this.A00.A0E().A3L();
                        }
                        rd.A03();
                        if (BuildConfigApi.isDebug() && AdInternalSettings.isVisibleAnimation()) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                            alphaAnimation.setDuration(500L);
                            view.startAnimation(alphaAnimation);
                        }
                        z6 = A07.A0F;
                        if (!z6) {
                            return;
                        }
                    } else if (!z8 && wasViewable) {
                        this.A01 = true;
                        z3 = A07.A07;
                        if (z3) {
                            this.A00.A0E().A2r(A0E.A02());
                        }
                        rd.A00();
                    } else {
                        rd.A02();
                        if (!this.A01) {
                            z2 = A07.A07;
                            if (z2) {
                                this.A00.A0E().A3J(A0E.A02());
                            }
                        }
                        this.A01 = true;
                    }
                    z4 = A07.A08;
                    if (z4) {
                        return;
                    }
                    kt = A07.A04;
                    if (kt == null) {
                        return;
                    }
                    handler = A07.A0B;
                    kt2 = A07.A04;
                    i4 = A07.A02;
                    handler.postDelayed(kt2, i4);
                    return;
                }
            }
            wasViewable = false;
            if (!z8) {
            }
            A07.A05 = A0E;
            String valueOf2 = String.valueOf(A0E.A01());
            synchronized (A07) {
            }
        } else {
            z = A07.A07;
            if (z) {
                if (!z7) {
                    i6 = 2;
                }
                A00(i6);
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02137b
    public final C0889Yn A5t() {
        return this.A00;
    }
}
