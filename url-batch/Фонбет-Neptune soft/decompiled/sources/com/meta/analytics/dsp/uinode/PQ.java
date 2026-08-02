package com.meta.analytics.dsp.uinode;

import android.content.res.Configuration;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public abstract class PQ extends RelativeLayout {
    public boolean A00;
    public final int A01;
    public final RD A02;
    public final boolean A03;
    public final boolean A04;
    public final AbstractC0992b5 A05;
    public final C0889Yn A06;
    public final J2 A07;
    public final C0548Lg A08;
    public final MC A09;
    public final InterfaceC0577Mj A0A;
    public final RE A0B;

    public abstract void A0z();

    public abstract void A10();

    public abstract void A11();

    public abstract void A12(boolean z);

    public abstract void A13(boolean z);

    public abstract boolean A14();

    public abstract boolean A15();

    public abstract C0648Pc getFullScreenAdStyle();

    public PQ(C0889Yn c0889Yn, InterfaceC0577Mj interfaceC0577Mj, J2 j2, AbstractC0992b5 abstractC0992b5, int i, boolean z, boolean z2, MC mc) {
        super(c0889Yn);
        this.A08 = new C0548Lg();
        this.A00 = false;
        TB tb = new TB(this);
        this.A02 = tb;
        this.A01 = i;
        this.A06 = c0889Yn;
        this.A04 = z;
        this.A03 = z2;
        this.A09 = mc;
        this.A0A = interfaceC0577Mj;
        this.A05 = abstractC0992b5;
        this.A07 = j2;
        RE re = new RE(this, 1, new WeakReference(tb), c0889Yn);
        this.A0B = re;
        re.A0W(abstractC0992b5.A0C());
        re.A0X(abstractC0992b5.A0D());
    }

    public final void A03() {
        if (!this.A00) {
            this.A0B.A0U();
            this.A00 = true;
        }
    }

    public AbstractC0992b5 getAdDataBundle() {
        return this.A05;
    }

    public RE getAdViewabilityChecker() {
        return this.A0B;
    }

    public C0548Lg getTouchDataRecorder() {
        return this.A08;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
