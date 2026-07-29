package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzbdf implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbcx zza;
    final /* synthetic */ zzcga zzb;
    final /* synthetic */ zzbdh zzc;

    zzbdf(zzbdh zzbdhVar, zzbcx zzbcxVar, zzcga zzcgaVar) {
        this.zzc = zzbdhVar;
        this.zza = zzbcxVar;
        this.zzb = zzcgaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        boolean z;
        final zzbcw zzbcwVar;
        obj = this.zzc.zzd;
        synchronized (obj) {
            zzbdh zzbdhVar = this.zzc;
            z = zzbdhVar.zzb;
            if (z) {
                return;
            }
            zzbdhVar.zzb = true;
            zzbcwVar = this.zzc.zza;
            if (zzbcwVar == null) {
                return;
            }
            zzfvk zzfvkVar = zzcfv.zza;
            final zzbcx zzbcxVar = this.zza;
            final zzcga zzcgaVar = this.zzb;
            final zzfvj zza = zzfvkVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdc
                @Override // java.lang.Runnable
                public final void run() {
                    zzbdf zzbdfVar = zzbdf.this;
                    zzbcw zzbcwVar2 = zzbcwVar;
                    zzbcx zzbcxVar2 = zzbcxVar;
                    zzcga zzcgaVar2 = zzcgaVar;
                    try {
                        zzbcz zzq = zzbcwVar2.zzq();
                        zzbcu zzg = zzbcwVar2.zzp() ? zzq.zzg(zzbcxVar2) : zzq.zzf(zzbcxVar2);
                        if (!zzg.zze()) {
                            zzcgaVar2.zze(new RuntimeException("No entry contents."));
                            zzbdh.zze(zzbdfVar.zzc);
                            return;
                        }
                        zzbde zzbdeVar = new zzbde(zzbdfVar, zzg.zzc(), 1);
                        int read = zzbdeVar.read();
                        if (read == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zzbdeVar.unread(read);
                        zzcgaVar2.zzd(zzbdj.zzb(zzbdeVar, zzg.zzd(), zzg.zzg(), zzg.zza(), zzg.zzf()));
                    } catch (RemoteException | IOException e) {
                        com.google.android.gms.ads.internal.util.zze.zzh("Unable to obtain a cache service instance.", e);
                        zzcgaVar2.zze(e);
                        zzbdh.zze(zzbdfVar.zzc);
                    }
                }
            });
            final zzcga zzcgaVar2 = this.zzb;
            zzcgaVar2.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdd
                @Override // java.lang.Runnable
                public final void run() {
                    zzcga zzcgaVar3 = zzcga.this;
                    Future future = zza;
                    int i = zzbdf.zzd;
                    if (zzcgaVar3.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, zzcfv.zzf);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
