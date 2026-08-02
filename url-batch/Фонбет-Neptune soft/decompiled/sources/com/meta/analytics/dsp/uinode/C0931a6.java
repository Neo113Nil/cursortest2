package com.meta.analytics.dsp.uinode;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.a6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0931a6<K, V> extends AbstractC01142y<K, V> {
    public final /* synthetic */ C0930a5 A00;

    public C0931a6(C0930a5 c0930a5) {
        this.A00 = c0930a5;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01142y
    public final int A04() {
        return ((AnonymousClass31) this.A00).A00;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01142y
    public final int A05(Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01142y
    public final int A06(Object obj) {
        return this.A00.A07(obj);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01142y
    public final Map<K, V> A07() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01142y
    public final Object A0B(int i, int i2) {
        return this.A00.A02[(i << 1) + i2];
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01142y
    public final V A0C(int i, V value) {
        return this.A00.A0C(i, value);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01142y
    public final void A0D() {
        this.A00.clear();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01142y
    public final void A0E(int i) {
        this.A00.A0A(i);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01142y
    public final void A0F(K key, V value) {
        this.A00.put(key, value);
    }
}
