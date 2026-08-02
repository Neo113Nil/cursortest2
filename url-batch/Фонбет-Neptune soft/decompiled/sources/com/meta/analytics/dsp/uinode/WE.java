package com.meta.analytics.dsp.uinode;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WE implements InterfaceC0409Fo {
    public final long[] A00;
    public final C0408Fn[] A01;

    public WE(C0408Fn[] c0408FnArr, long[] jArr) {
        this.A01 = c0408FnArr;
        this.A00 = jArr;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0409Fo
    public final List<C0408Fn> A6Z(long j) {
        C0408Fn c0408Fn;
        int A0B = IF.A0B(this.A00, j, true, false);
        if (A0B == -1 || (c0408Fn = this.A01[A0B]) == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(c0408Fn);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0409Fo
    public final long A70(int i) {
        boolean z = true;
        AbstractC0445Ha.A03(i >= 0);
        if (i >= this.A00.length) {
            z = false;
        }
        AbstractC0445Ha.A03(z);
        return this.A00[i];
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0409Fo
    public final int A71() {
        return this.A00.length;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0409Fo
    public final int A7T(long j) {
        int A0A = IF.A0A(this.A00, j, false, false);
        int index = this.A00.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
