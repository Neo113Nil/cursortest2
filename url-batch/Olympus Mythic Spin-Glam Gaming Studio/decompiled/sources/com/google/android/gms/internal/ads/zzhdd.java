package com.google.android.gms.internal.ads;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzhdd extends AbstractOwnableSynchronizer implements Runnable {
    private final zzhdf zza;

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.zza.toString();
    }

    final /* synthetic */ void zza(Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }
}
