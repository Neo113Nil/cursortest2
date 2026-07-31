package com.five_corp.ad;

/* loaded from: classes5.dex */
public final class m extends FiveAd {
    public static final m a = new m();

    public static boolean isInitialized() {
        boolean z;
        synchronized (AdLoader.l) {
            z = AdLoader.n != null;
        }
        return z;
    }

    @Override // com.five_corp.ad.FiveAd
    public final void enableSound(boolean z) {
        com.five_corp.ad.internal.soundstate.e eVar = AdLoader.a().i;
        synchronized (eVar.a) {
            eVar.c = new com.five_corp.ad.internal.soundstate.d(z ? 2 : 3, eVar.c.b);
        }
    }

    @Override // com.five_corp.ad.FiveAd
    public final boolean isSoundEnabled() {
        com.five_corp.ad.internal.soundstate.d a2 = AdLoader.a().i.a();
        return com.five_corp.ad.internal.soundstate.f.a(com.five_corp.ad.internal.soundstate.g.a(a2.a, a2.b));
    }
}
