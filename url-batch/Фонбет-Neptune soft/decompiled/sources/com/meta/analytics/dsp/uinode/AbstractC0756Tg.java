package com.meta.analytics.dsp.uinode;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.material.card.MaterialCardViewHelper;
import com.google.common.base.Ascii;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Tg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0756Tg extends OL implements OE {
    public static byte[] A08;
    public static String[] A09 = {"1qM0UqBuKeNFs4931PZdKXfB5ZchECK5", "3ZSmcCEAG5Dz0dWrJNlp2MNszP7YT25A", "Vrvau7r1HMpQKQXhvyVkTfJZAsfHOW4A", "oVRoE2FdK0le1s2SfNIozg00Kc9sH4MP", "npYoVlwUwM4clRwIxvjz9nauDkw8jySV", "7Yuh663Y", "kkRlGGIMUj7iwn7pYEfT9Vq54HRzcbQk", "UynwTjbvMY6JmtelA"};
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public LX A00;
    public KI A01;
    public KA A02;
    public final AbstractC0992b5 A03;
    public final C1G A04;
    public final MC A05;
    public final AbstractC0608No A06;
    public final OG A07;

    public static String A0C(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A08 = new byte[]{9, 5, 7, 68, Ascii.FF, Ascii.VT, 9, Ascii.SI, 8, 5, 5, 1, 68, Ascii.VT, Ascii.SO, Ascii.EM, 68, 3, 4, Ascii.RS, Ascii.SI, Ascii.CAN, Ascii.EM, Ascii.RS, 3, Ascii.RS, 3, Ascii.VT, 6, 68, 9, 6, 3, 9, 1, Ascii.SI, Ascii.SO, 92, 75, 89, 79, 92, 74, 75, 74, 113, 88, 71, 74, 75, 65};
    }

    static {
        A0D();
        A0D = (int) (LD.A02 * 48.0f);
        A0H = (int) (LD.A02 * 16.0f);
        A0A = (int) (LD.A02 * 4.0f);
        A0G = (int) (LD.A02 * 44.0f);
        A0E = (int) (LD.A02 * 8.0f);
        A0F = (int) (LD.A02 * 12.0f);
        A0J = (int) (LD.A02 * 12.0f);
        A0I = (int) (LD.A02 * 26.0f);
        int A01 = AbstractC01052p.A01(-1, 77);
        A0B = A01;
        A0C = AbstractC01052p.A01(A01, 90);
    }

    public AbstractC0756Tg(OP op, boolean z) {
        super(op, z);
        AbstractC0992b5 A04 = op.A04();
        this.A03 = A04;
        this.A07 = OG.A01(op.A05(), A04, this);
        this.A04 = A04.A0x();
        this.A06 = A0B(op);
        MB A082 = op.A08();
        this.A05 = op.A09();
        if (A082 != null) {
            A082.setLayoutParams(new RelativeLayout.LayoutParams(-1, A082.getToolbarHeight()));
            A082.setPageDetailsVisible(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C0757Th A0B(OP op) {
        String A0C2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (!op.A04().A0P().equals(A0C(37, 14, 56))) {
            if (A09[5].length() != 7) {
                A09[7] = "aLegEIjbGKC4WYI41vdDU1g9u";
                A0C2 = A0C(0, 37, 124);
                C0757Th c0757Th = new C0757Th(op.A05(), A0D, this.A04.A0E().A00() != C1L.A05, getColors(), this.A04.A0F().A06(), A0C2, op.A06(), op.A09(), op.A0B(), op.A07(), op.A04().A0y());
                this.A02 = new KA(c0757Th, 400, 100, 0);
                AbstractC0556Lo.A0K(c0757Th);
                c0757Th.A0A(op.A00());
                if (C0478Ih.A0y(op.A05())) {
                }
                addView(c0757Th, layoutParams);
                c0757Th.getCTAButton().A0A(this.A03, op.A08());
                return c0757Th;
            }
            throw new RuntimeException();
        }
        QP qp = QP.A04;
        if (A09[7].length() != 22) {
            String[] strArr = A09;
            strArr[6] = "Ca3psE1IPVUhCMreDaAATfbsplsRsoNT";
            strArr[1] = "q1VyT2b1NhDnFBLs9y9UP0y4iho0jP8D";
            A0C2 = qp.A02();
            C0757Th c0757Th2 = new C0757Th(op.A05(), A0D, this.A04.A0E().A00() != C1L.A05, getColors(), this.A04.A0F().A06(), A0C2, op.A06(), op.A09(), op.A0B(), op.A07(), op.A04().A0y());
            this.A02 = new KA(c0757Th2, 400, 100, 0);
            AbstractC0556Lo.A0K(c0757Th2);
            c0757Th2.A0A(op.A00());
            if (C0478Ih.A0y(op.A05())) {
                c0757Th2.A09();
                if (op.A08() != null) {
                    op.A08().setCTAClickListener(getCtaButton());
                }
            }
            addView(c0757Th2, layoutParams);
            c0757Th2.getCTAButton().A0A(this.A03, op.A08());
            return c0757Th2;
        }
        throw new RuntimeException();
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public void A0v() {
        super.A0v();
        this.A07.A0A();
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public void A10(C1G c1g, String str, double d, Bundle bundle) {
        super.A10(c1g, str, d, bundle);
        this.A06.setInfo(c1g.A0E(), c1g.A0F(), str, this.A03.A10().A01(), null);
    }

    public final int A13(MB mb) {
        return mb == null ? MB.A00 : mb.getToolbarHeight();
    }

    public void A14() {
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null) {
            LX lx = new LX(true);
            this.A00 = lx;
            KI ki = this.A01;
            if (ki != null) {
                lx.A0I(ki);
            }
            C1P A01 = this.A03.A0w().A01();
            this.A00.A0I(new KC(getAdDetailsView().getCTAButton(), MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, -1, A01.A09(true)));
            int i = A0B;
            int i2 = A0C;
            int i3 = A0A;
            Drawable A082 = AbstractC0556Lo.A08(i, i2, i3);
            Drawable startDrawable = AbstractC0556Lo.A05(A01.A08(true), i3);
            this.A00.A0I(new KM(getAdDetailsView().getCTAButton(), MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, A082, startDrawable));
            this.A00.A0I(new KF(expandableLayout, Opcodes.FCMPG, false));
            this.A00.A0H(2300);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.OE
    public final void AC9() {
        this.A05.A43(getAdDataBundle().A0L());
    }

    public AbstractC0992b5 getAdDataBundle() {
        return this.A03;
    }

    public KA getAdDetailsAnimation() {
        return this.A02;
    }

    public AbstractC0608No getAdDetailsView() {
        return this.A06;
    }

    public C1G getAdInfo() {
        return this.A04;
    }

    public LX getAnimationPlugin() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.OL, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getAdDetailsView().A0A(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout == null || !z) {
            return;
        }
        KI ki = this.A01;
        if (A09[2].charAt(30) != '4') {
            throw new RuntimeException();
        }
        A09[0] = "AO2Vor543jhYYkt1oYijcT7buZTkR3eI";
        if (ki == null) {
            KI ki2 = new KI(expandableLayout, MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, expandableLayout.getHeight(), 0);
            this.A01 = ki2;
            this.A00.A0I(ki2);
            this.A00.A0G();
        }
    }
}
