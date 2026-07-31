package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzfla implements Runnable {
    final /* synthetic */ zzflb zza;

    zzfla(zzflb zzflbVar) {
        Objects.requireNonNull(zzflbVar);
        this.zza = zzflbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzflb zzflbVar = this.zza;
        if (zzflbVar.zzA() != null) {
            zzfkk zzA = zzflbVar.zzA();
            Clock zzB = zzflbVar.zzB();
            zzA.zzj(zzB.currentTimeMillis(), zzflbVar.zzC(), zzflbVar.zze.zzd, zzflbVar.zzz());
        }
    }
}
