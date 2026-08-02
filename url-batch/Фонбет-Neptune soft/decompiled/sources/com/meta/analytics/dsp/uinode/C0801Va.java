package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Va, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0801Va implements InterfaceC1075cd<C0483Io, C0488It> {
    public VX A00;

    public C0801Va(VX vx) {
        this.A00 = vx;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ca != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC1075cd
    public final void A5c(C1072ca<C0483Io, C0488It> c1072ca, InterfaceC1062cP interfaceC1062cP) {
        switch (Im.A00[interfaceC1062cP.A8J(c1072ca).ordinal()]) {
            case 1:
            case 2:
                this.A00.A02(c1072ca, interfaceC1062cP);
                break;
        }
    }
}
