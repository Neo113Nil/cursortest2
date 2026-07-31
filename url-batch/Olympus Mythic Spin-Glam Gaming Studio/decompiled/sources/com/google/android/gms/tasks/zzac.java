package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-tasks@@18.2.1 */
/* loaded from: classes11.dex */
final class zzac<T> implements zzad<T> {
    private final CountDownLatch zza = new CountDownLatch(1);

    private zzac() {
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.zza.countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc) {
        this.zza.countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t) {
        this.zza.countDown();
    }

    public final void zza() throws InterruptedException {
        this.zza.await();
    }

    public final boolean zzb(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.zza.await(j, timeUnit);
    }

    /* synthetic */ zzac(zzaf zzafVar) {
    }
}
