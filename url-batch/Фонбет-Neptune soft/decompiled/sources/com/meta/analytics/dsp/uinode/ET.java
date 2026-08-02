package com.meta.analytics.dsp.uinode;

import com.facebook.ads.MediaViewVideoRenderer;

/* loaded from: assets/audience_network.dex */
public class ET extends MV {
    public final /* synthetic */ C01735h A00;

    public ET(C01735h c01735h) {
        this.A00 = c01735h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC02518s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(MW mw) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onVolumeChanged();
    }
}
