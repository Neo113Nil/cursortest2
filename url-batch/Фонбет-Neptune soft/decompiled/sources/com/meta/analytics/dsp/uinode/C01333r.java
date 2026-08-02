package com.meta.analytics.dsp.uinode;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.3r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C01333r extends C0372Eb {
    public C01333r(C0889Yn c0889Yn) {
        super(c0889Yn);
        setCarouselLayoutManager(c0889Yn);
    }

    public AbstractC0724Sa getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        }
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.C0372Eb
    public C0915Zo getLayoutManager() {
        return (C0915Zo) super.getLayoutManager();
    }

    public AbstractC01604t getOnScrollListener() {
        return new US(this);
    }

    private void setCarouselLayoutManager(C0889Yn c0889Yn) {
        C0915Zo c0915Zo = new C0915Zo(c0889Yn, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c0915Zo.A1R(true);
        }
        super.setLayoutManager(c0915Zo);
    }

    @Override // com.meta.analytics.dsp.uinode.C0372Eb
    public void setLayoutManager(AbstractC01554o abstractC01554o) {
    }
}
