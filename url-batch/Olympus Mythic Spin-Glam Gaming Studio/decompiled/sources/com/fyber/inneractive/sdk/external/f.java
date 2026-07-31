package com.fyber.inneractive.sdk.external;

/* loaded from: classes4.dex */
public final class f implements Runnable {
    public final /* synthetic */ InneractiveAdViewUnitController a;

    public f(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        this.a = inneractiveAdViewUnitController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a();
    }
}
