package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UE implements InterfaceC0670Py {
    public static byte[] A01;
    public final /* synthetic */ UD A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.GS, Ascii.ESC, Ascii.CR, Ascii.SUB, Ascii.VT, 4, 1, Ascii.VT, 3};
    }

    public UE(UD ud) {
        this.A00 = ud;
    }

    public /* synthetic */ UE(UD ud, UK uk) {
        this(ud);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0670Py
    public final void ABD() {
        this.A00.A0U(true, A00(0, 9, 55));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0670Py
    public final void ABj() {
        AbstractC0992b5 abstractC0992b5;
        MC mc;
        InterfaceC0577Mj interfaceC0577Mj;
        J2 j2;
        AbstractC0992b5 abstractC0992b52;
        Q0 q0;
        Q0 q02;
        AbstractC0992b5 abstractC0992b53;
        C0889Yn c0889Yn;
        AbstractC0992b5 abstractC0992b54;
        C0889Yn c0889Yn2;
        abstractC0992b5 = this.A00.A0F;
        if (!TextUtils.isEmpty(abstractC0992b5.A12())) {
            j2 = this.A00.A0J;
            abstractC0992b52 = this.A00.A0F;
            String A12 = abstractC0992b52.A12();
            C0602Ni c0602Ni = new C0602Ni();
            q0 = this.A00.A07;
            C0602Ni A03 = c0602Ni.A03(q0.getViewabilityChecker());
            q02 = this.A00.A07;
            j2.A9g(A12, A03.A02(q02.getTouchDataRecorder()).A05());
            abstractC0992b53 = this.A00.A0F;
            C1U A0y = abstractC0992b53.A0y();
            c0889Yn = this.A00.A0I;
            C1U.A07(A0y, c0889Yn);
            abstractC0992b54 = this.A00.A0F;
            C2O.A00(abstractC0992b54.A0N());
            c0889Yn2 = this.A00.A0I;
            c0889Yn2.A0E().A2k();
        }
        mc = this.A00.A0N;
        interfaceC0577Mj = this.A00.A0O;
        mc.A43(interfaceC0577Mj.A7B());
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0670Py
    public final void AC4() {
        MC mc;
        InterfaceC0577Mj interfaceC0577Mj;
        mc = this.A00.A0N;
        interfaceC0577Mj = this.A00.A0O;
        mc.A43(interfaceC0577Mj.A6y());
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0670Py
    public final void ADj() {
        MC mc;
        mc = this.A00.A0N;
        mc.AB0(15);
    }
}
