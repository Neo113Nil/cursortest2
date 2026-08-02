package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class VG extends RD {
    public static String[] A01 = {"17VeHKqvAV3iPquTRFV5nkfekqPAOX2Y", "lAWAATHLIf1ZCLkldXz2HdhVco5hUmDN", "zF5", "DmLMY21jiUoRuKlWConaRVpMyfqBnv90", "gnaW18bfkM8k", "Xsqe1WvhzdEOHDRdZu2mXr6vcctMp9sP", "yZ63PHoRBoKgX7qS3XV5e7w7nB", "vlnJSN6CnOAejO47j4gW78Wzdr557VH0"};
    public final /* synthetic */ VE A00;

    public VG(VE ve) {
        this.A00 = ve;
    }

    @Override // com.meta.analytics.dsp.uinode.RD
    public final void A00() {
        C0309Ba c0309Ba;
        C0309Ba c0309Ba2;
        c0309Ba = this.A00.A04;
        if (c0309Ba != null) {
            c0309Ba2 = this.A00.A04;
            c0309Ba2.A0W();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r0 != false) goto L11;
     */
    @Override // com.meta.analytics.dsp.uinode.RD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A03() {
        C0309Ba c0309Ba;
        boolean z;
        boolean z2;
        boolean A0K;
        c0309Ba = this.A00.A04;
        if (c0309Ba != null) {
            z = this.A00.A0B;
            if (!z) {
                z2 = this.A00.A0A;
                if (!z2) {
                    A0K = this.A00.A0K();
                }
                VE ve = this.A00;
                QM qm = QM.A02;
                if (A01[5].charAt(14) == 'd') {
                    throw new RuntimeException();
                }
                A01[3] = "6AVoG9MmguoU1vvLobA8P3uXYnnJUDvb";
                ve.A0J(qm);
            }
            this.A00.A0A = false;
            this.A00.A0B = false;
        }
    }
}
