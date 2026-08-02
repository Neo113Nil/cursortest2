package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbap implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbah zza;
    final /* synthetic */ zzbzt zzb;
    final /* synthetic */ zzbar zzc;

    zzbap(zzbar zzbarVar, zzbah zzbahVar, zzbzt zzbztVar) {
        this.zza = zzbahVar;
        this.zzb = zzbztVar;
        this.zzc = zzbarVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        boolean z;
        final zzbag zzbagVar;
        obj = this.zzc.zzd;
        synchronized (obj) {
            zzbar zzbarVar = this.zzc;
            z = zzbarVar.zzb;
            if (z) {
                return;
            }
            zzbarVar.zzb = true;
            zzbagVar = this.zzc.zza;
            if (zzbagVar == null) {
                return;
            }
            zzgcu zzgcuVar = zzbzo.zza;
            final zzbah zzbahVar = this.zza;
            final zzbzt zzbztVar = this.zzb;
            final ListenableFuture zza = zzgcuVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbam
                @Override // java.lang.Runnable
                public final void run() {
                    zzbap zzbapVar = zzbap.this;
                    zzbag zzbagVar2 = zzbagVar;
                    zzbzt zzbztVar2 = zzbztVar;
                    try {
                        zzbaj zzq = zzbagVar2.zzq();
                        boolean zzp = zzbagVar2.zzp();
                        zzbah zzbahVar2 = zzbahVar;
                        zzbae zzg = zzp ? zzq.zzg(zzbahVar2) : zzq.zzf(zzbahVar2);
                        if (!zzg.zze()) {
                            zzbztVar2.zzd(new RuntimeException("No entry contents."));
                            zzbar.zze(zzbapVar.zzc);
                            return;
                        }
                        zzbao zzbaoVar = new zzbao(zzbapVar, zzg.zzc(), 1);
                        int read = zzbaoVar.read();
                        if (read == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zzbaoVar.unread(read);
                        zzbztVar2.zzc(zzbat.zzb(zzbaoVar, zzg.zzd(), zzg.zzg(), zzg.zza(), zzg.zzf()));
                    } catch (RemoteException | IOException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to obtain a cache service instance.", e);
                        zzbztVar2.zzd(e);
                        zzbar.zze(zzbapVar.zzc);
                    }
                }
            });
            final zzbzt zzbztVar2 = this.zzb;
            zzbztVar2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzban
                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzbap.zzd;
                    if (zzbzt.this.isCancelled()) {
                        zza.cancel(true);
                    }
                }
            }, zzbzo.zzf);
        }
    }
}
