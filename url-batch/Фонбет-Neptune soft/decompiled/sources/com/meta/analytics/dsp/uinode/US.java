package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class US extends AbstractC01604t {
    public static String[] A01 = {"8Yn2PgyedH1iX", "R67HljoZMbsPm0e6EtybvG", "", "R8Pp2uuVTku92bGxcvFWCvwfHASfPd1y", "2y5E80sPhAjkTDK", "Itturke", "abRBLy2wdT4xlnoMDCf2vtSzdY3x1mV2", "QG421Xj1ReSIzqeVHucrcoJTP843GzsJ"};
    public final /* synthetic */ C01333r A00;

    public US(C01333r c01333r) {
        this.A00 = c01333r;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01604t
    public final void A0L(C0372Eb c0372Eb, int i) {
        int scrollPosition;
        super.A0L(c0372Eb, i);
        C0915Zo linearLayoutManager = this.A00.getLayoutManager();
        if (linearLayoutManager == null || (scrollPosition = linearLayoutManager.A23()) < 0 || this.A00.getAdapter() == null || scrollPosition >= this.A00.getAdapter().A0E()) {
            return;
        }
        MJ mj = (MJ) c0372Eb.A1F(scrollPosition);
        if (A01[1].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[5] = "EBOsosi";
        strArr[2] = "";
        if (mj == null) {
            return;
        }
        mj.AFr();
    }
}
