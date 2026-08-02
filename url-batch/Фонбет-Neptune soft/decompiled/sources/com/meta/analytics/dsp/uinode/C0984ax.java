package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.ax, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0984ax implements AnonymousClass61 {
    public static String[] A05 = {"SGxBKOT0PnlxeQ2jGccieZy3bFeI", "1PQaT", "uVEahNbfwTxCxKVGO7p", "rVPhbhRBlKfAg8fviAhE", "2ov", "KrP87Bn8e271VzBAE5Wi", "4No2VIB7eIWgh7ub8hExBeYUcY", "mEjh"};
    public final /* synthetic */ AbstractC0992b5 A00;
    public final /* synthetic */ InterfaceC00711h A01;
    public final /* synthetic */ C00721i A02;
    public final /* synthetic */ C0889Yn A03;
    public final /* synthetic */ boolean A04;

    public C0984ax(C00721i c00721i, C0889Yn c0889Yn, boolean z, AbstractC0992b5 abstractC0992b5, InterfaceC00711h interfaceC00711h) {
        this.A02 = c00721i;
        this.A03 = c0889Yn;
        this.A04 = z;
        this.A00 = abstractC0992b5;
        this.A01 = interfaceC00711h;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass61
    public final void AAl() {
        ArrayList arrayList;
        if (C0478Ih.A1O(this.A03) && this.A04) {
            arrayList = this.A02.A02;
            arrayList.add(PC.A01(this.A03, this.A00, 1, new C0985ay(this)));
            return;
        }
        InterfaceC00711h interfaceC00711h = this.A01;
        if (A05[2].length() != 19) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[5] = "X6BBoGIR5wPjpoFUlFYz";
        strArr[3] = "SlUPa0nBeexeGnx3tyWk";
        interfaceC00711h.AAf();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass61
    public final void AAm() {
        this.A01.AAe(AdError.CACHE_ERROR);
    }
}
