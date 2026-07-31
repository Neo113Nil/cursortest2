package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzban implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbap zza;

    zzban(zzbap zzbapVar) {
        Objects.requireNonNull(zzbapVar);
        this.zza = zzbapVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbap zzbapVar = this.zza;
        synchronized (zzbapVar.zzh()) {
            try {
                if (zzbapVar.zzi() != null) {
                    zzbapVar.zzk(zzbapVar.zzi().zzq());
                }
            } catch (DeadObjectException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                this.zza.zzg();
            }
            this.zza.zzh().notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzbap zzbapVar = this.zza;
        synchronized (zzbapVar.zzh()) {
            zzbapVar.zzk(null);
            zzbapVar.zzh().notifyAll();
        }
    }
}
