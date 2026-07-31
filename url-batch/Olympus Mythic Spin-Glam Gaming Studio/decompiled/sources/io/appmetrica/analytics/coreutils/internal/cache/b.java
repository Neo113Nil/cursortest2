package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;

/* loaded from: classes6.dex */
public final class b implements Runnable {
    public final /* synthetic */ LocationDataCacheUpdateScheduler a;

    public b(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        this.a = locationDataCacheUpdateScheduler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UpdateConditionsChecker updateConditionsChecker;
        a aVar;
        ILastKnownUpdater iLastKnownUpdater;
        updateConditionsChecker = this.a.c;
        if (updateConditionsChecker.shouldUpdate()) {
            aVar = this.a.d;
            iLastKnownUpdater = aVar.a.b;
            iLastKnownUpdater.updateLastKnown();
        }
    }
}
