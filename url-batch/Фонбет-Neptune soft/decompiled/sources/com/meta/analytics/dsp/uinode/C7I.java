package com.meta.analytics.dsp.uinode;

import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.7I, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7I extends QQ implements View.OnClickListener {
    public static String[] A05 = {"dj2bca5KMhic7lU7SNdjndSTQwmssf52", "TPlcacN2BRfqpmqqou3eGj4ypEirHC", "lK1i5T", "LDnNwGMA5Xj1Rc4RK", "9vPtQslMJEvaRYxyY6ZiMi1q6kn3NQTo", "pbwCeIFhJ07zfEQSECI2TdcOW", "Wj7W52", "ztBFgo3EeJBil6N8wes8zN"};
    public final AbstractC0666Pu A00;
    public final AbstractC0633On A01;
    public final O7 A02;
    public final NX A03;
    public final C0679Qh A04;

    public C7I(C0889Yn c0889Yn) {
        this(c0889Yn, null);
    }

    public C7I(C0889Yn c0889Yn, AttributeSet attributeSet) {
        this(c0889Yn, attributeSet, 0);
    }

    public C7I(C0889Yn c0889Yn, AttributeSet attributeSet, int i) {
        super(c0889Yn, attributeSet, i);
        this.A03 = new NX() { // from class: com.facebook.ads.redexgen.X.7P
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC02518s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0607Nn c0607Nn) {
                C7I.this.setVisibility(0);
            }
        };
        this.A01 = new AbstractC0633On() { // from class: com.facebook.ads.redexgen.X.7O
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC02518s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass98 anonymousClass98) {
                C0679Qh c0679Qh;
                c0679Qh = C7I.this.A04;
                c0679Qh.setChecked(true);
            }
        };
        this.A02 = new O7() { // from class: com.facebook.ads.redexgen.X.7M
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC02518s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(O8 o8) {
                C0679Qh c0679Qh;
                c0679Qh = C7I.this.A04;
                c0679Qh.setChecked(false);
            }
        };
        this.A00 = new AbstractC0666Pu() { // from class: com.facebook.ads.redexgen.X.7L
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC02518s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9H c9h) {
                C0679Qh c0679Qh;
                c0679Qh = C7I.this.A04;
                c0679Qh.setChecked(true);
            }
        };
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        C0679Qh c0679Qh = new C0679Qh(c0889Yn);
        this.A04 = c0679Qh;
        c0679Qh.setChecked(true);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(c0679Qh, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.meta.analytics.dsp.uinode.QQ
    public final void A07() {
        super.A07();
        setOnClickListener(this);
        this.A04.setOnClickListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A00, this.A01, this.A02);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.QQ
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A01, this.A00, this.A03);
        }
        setOnClickListener(null);
        this.A04.setOnClickListener(null);
        super.A08();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KL.A02(this)) {
            return;
        }
        try {
            SA videoView = getVideoView();
            if (videoView == null) {
                return;
            }
            if (videoView.getState() == RB.A07 || videoView.getState() == RB.A05 || videoView.getState() == RB.A06) {
                videoView.A0b(QM.A04, 11);
            } else if (videoView.getState() == RB.A0A) {
                videoView.A0e(true, 7);
            }
        } catch (Throwable th) {
            if (A05[5].length() != 25) {
                throw new RuntimeException();
            }
            A05[7] = "YsoDkb8mAWGLBYzRGBa3i8";
            KL.A00(th, this);
        }
    }

    public void setPauseAccessibilityLabel(String str) {
        this.A04.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(String str) {
        this.A04.setPlayAccessibilityLabel(str);
    }
}
