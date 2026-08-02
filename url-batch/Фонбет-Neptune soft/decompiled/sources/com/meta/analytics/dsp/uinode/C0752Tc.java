package com.meta.analytics.dsp.uinode;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.PointerIconCompat;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0752Tc extends OL implements OE {
    public static byte[] A05;
    public static final int A06;
    public final AbstractC0992b5 A00;
    public final MC A01;
    public final OG A02;
    public final C0632Om A03;
    public final C0660Po A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{52, 48, 60, 58, 56};
    }

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public C0752Tc(OP op, boolean z) {
        super(op, z);
        int id;
        int A01;
        this.A01 = op.A09();
        AbstractC0992b5 A04 = op.A04();
        this.A00 = A04;
        C0632Om c0632Om = new C0632Om(op.A05(), op.A02());
        this.A03 = c0632Om;
        c0632Om.A01(getTitleDescContainer(), z);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(OL.A07, OL.A07, OL.A07, OL.A07);
        getCtaButton().setLayoutParams(layoutParams);
        if (op.A0C()) {
            C0660Po c0660Po = new C0660Po(op.A05());
            this.A04 = c0660Po;
            c0660Po.setPageDetails(op.A04().A10());
            AbstractC0556Lo.A0G(PointerIconCompat.TYPE_CROSSHAIR, c0660Po);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(2, getCtaButton().getId());
            layoutParams2.setMargins(OL.A07, OL.A07 - (OL.A07 / 2), OL.A07, 0);
            c0660Po.setLayoutParams(layoutParams2);
            id = c0660Po.getId();
            A01 = op.A01() - (OL.A07 / 2);
        } else {
            id = getCtaButton().getId();
            A01 = op.A01();
            this.A04 = null;
        }
        FrameLayout frameLayout = new FrameLayout(op.A05());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(10);
        layoutParams3.addRule(2, id);
        layoutParams3.setMargins(0, A01, 0, 0);
        frameLayout.setLayoutParams(layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 17;
        layoutParams4.setMargins(OL.A07, 0, OL.A07, 0);
        frameLayout.addView(c0632Om, layoutParams4);
        addView(frameLayout);
        View view = this.A04;
        if (view != null) {
            addView(view);
        }
        addView(getCtaButton());
        getCtaButton().A0A(op.A04(), op.A08());
        View A02 = op.A02();
        OG A012 = OG.A01(op.A05(), A04, this);
        this.A02 = A012;
        OF A09 = A012.A09(A04);
        op.A05().A0F().A00(A09.A01);
        if (A02 != null && A09.A00) {
            getCtaButton().setCreativeAsCtaLoggingHelper(A012);
            A02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.OV
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C0752Tc.this.A13(view2);
                }
            });
        } else if (A02 != null && C0478Ih.A16(getAdContextWrapper())) {
            AbstractC0605Nl.A00(A02, C0478Ih.A17(getAdContextWrapper()), new OW(this));
        }
        if (C0478Ih.A0y(op.A05())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (op.A08() != null) {
                op.A08().setCTAClickListener(getCtaButton());
            }
        }
        if (this.A04 != null && C0478Ih.A0z(op.A05())) {
            this.A04.setOnClickListener(getCtaButton());
        }
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final boolean A02() {
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final boolean A0D() {
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final void A0v() {
        super.A0v();
        this.A02.A0A();
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final void A10(C1G c1g, String str, double d, Bundle bundle) {
        super.A10(c1g, str, d, bundle);
        if (d > 0.0d) {
            int mediaHeight = (int) ((A06 - (OL.A07 * 2)) / d);
            this.A03.A00(mediaHeight);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final boolean A11() {
        return false;
    }

    public final /* synthetic */ void A13(View view) {
        getCtaButton().A09(A00(0, 5, 75));
    }

    @Override // com.meta.analytics.dsp.uinode.OE
    public final void AC9() {
        this.A01.A43(this.A00.A0L());
    }
}
