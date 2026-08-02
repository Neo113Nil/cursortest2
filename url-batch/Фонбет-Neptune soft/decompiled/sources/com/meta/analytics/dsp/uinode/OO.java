package com.meta.analytics.dsp.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OO {
    public boolean A00;
    public View A03;
    public V2 A04;
    public MB A05;
    public KP A06;
    public final View A07;
    public final AbstractC0992b5 A08;
    public final C0889Yn A09;
    public final J2 A0A;
    public final C0548Lg A0B;
    public final MC A0C;
    public final RE A0D;
    public int A02 = 0;
    public int A01 = 1;

    public OO(C0889Yn c0889Yn, J2 j2, MC mc, AbstractC0992b5 abstractC0992b5, View view, RE re, C0548Lg c0548Lg) {
        this.A09 = c0889Yn;
        this.A0A = j2;
        this.A0C = mc;
        this.A08 = abstractC0992b5;
        this.A07 = view;
        this.A0D = re;
        this.A0B = c0548Lg;
    }

    public final OO A0D(int i) {
        this.A01 = i;
        return this;
    }

    public final OO A0E(int i) {
        this.A02 = i;
        return this;
    }

    public final OO A0F(View view) {
        this.A03 = view;
        return this;
    }

    public final OO A0G(V2 v2) {
        this.A04 = v2;
        return this;
    }

    public final OO A0H(MB mb) {
        this.A05 = mb;
        return this;
    }

    public final OO A0I(KP kp) {
        this.A06 = kp;
        return this;
    }

    public final OO A0J(boolean z) {
        this.A00 = z;
        return this;
    }

    public final OP A0K() {
        return new OP(this);
    }
}
