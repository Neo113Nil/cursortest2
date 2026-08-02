package com.meta.analytics.dsp.uinode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class HH implements InterfaceC1076ce {
    public final List<InterfaceC0715Rr> A00 = new ArrayList();

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1076ce
    public final InterfaceC0715Rr A5q(int i) {
        this.A00.get(i);
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC0715Rr> iterator() {
        return this.A00.iterator();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1076ce
    public final int size() {
        return this.A00.size();
    }
}
