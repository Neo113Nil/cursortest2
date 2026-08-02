package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbej implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbeb zza;
    final /* synthetic */ zzchh zzb;
    final /* synthetic */ zzbel zzc;

    zzbej(zzbel zzbelVar, zzbeb zzbebVar, zzchh zzchhVar) {
        this.zzc = zzbelVar;
        this.zza = zzbebVar;
        this.zzb = zzchhVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        boolean z;
        final zzbea zzbeaVar;
        obj = this.zzc.zzd;
        synchronized (obj) {
            zzbel zzbelVar = this.zzc;
            z = zzbelVar.zzb;
            if (z) {
                return;
            }
            zzbelVar.zzb = true;
            zzbeaVar = this.zzc.zza;
            if (zzbeaVar == null) {
                return;
            }
            zzfzq zzfzqVar = zzchc.zza;
            final zzbeb zzbebVar = this.zza;
            final zzchh zzchhVar = this.zzb;
            final zzfzp zza = zzfzqVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbeg
                @Override // java.lang.Runnable
                public final void run() {
                    zzbej zzbejVar = zzbej.this;
                    zzbea zzbeaVar2 = zzbeaVar;
                    zzbeb zzbebVar2 = zzbebVar;
                    zzchh zzchhVar2 = zzchhVar;
                    try {
                        zzbed zzq = zzbeaVar2.zzq();
                        zzbdy zzg = zzbeaVar2.zzp() ? zzq.zzg(zzbebVar2) : zzq.zzf(zzbebVar2);
                        if (!zzg.zze()) {
                            zzchhVar2.zze(new RuntimeException("No entry contents."));
                            zzbel.zze(zzbejVar.zzc);
                            return;
                        }
                        zzbei zzbeiVar = new zzbei(zzbejVar, zzg.zzc(), 1);
                        int read = zzbeiVar.read();
                        if (read == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zzbeiVar.unread(read);
                        zzchhVar2.zzd(zzben.zzb(zzbeiVar, zzg.zzd(), zzg.zzg(), zzg.zza(), zzg.zzf()));
                    } catch (RemoteException | IOException e) {
                        com.google.android.gms.ads.internal.util.zze.zzh("Unable to obtain a cache service instance.", e);
                        zzchhVar2.zze(e);
                        zzbel.zze(zzbejVar.zzc);
                    }
                }
            });
            final zzchh zzchhVar2 = this.zzb;
            zzchhVar2.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbeh
                @Override // java.lang.Runnable
                public final void run() {
                    zzchh zzchhVar3 = zzchh.this;
                    Future future = zza;
                    int i = zzbej.zzd;
                    if (zzchhVar3.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, zzchc.zzf);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
