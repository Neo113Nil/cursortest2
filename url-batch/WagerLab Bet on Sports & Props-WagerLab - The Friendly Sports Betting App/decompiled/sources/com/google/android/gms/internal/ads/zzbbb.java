package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzbbb implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbat zza;
    final /* synthetic */ zzbzm zzb;
    final /* synthetic */ zzbbd zzc;

    zzbbb(zzbbd zzbbdVar, zzbat zzbatVar, zzbzm zzbzmVar) {
        this.zza = zzbatVar;
        this.zzb = zzbzmVar;
        Objects.requireNonNull(zzbbdVar);
        this.zzc = zzbbdVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbbd zzbbdVar = this.zzc;
        synchronized (zzbbdVar.zzf()) {
            if (zzbbdVar.zzd()) {
                return;
            }
            zzbbdVar.zze(true);
            final zzbas zzc = zzbbdVar.zzc();
            if (zzc == null) {
                return;
            }
            zzgpd zzgpdVar = zzbzh.zza;
            final zzbat zzbatVar = this.zza;
            final zzbzm zzbzmVar = this.zzb;
            final ListenableFuture submit = zzgpdVar.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbba
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzbzm zzbzmVar2 = zzbzmVar;
                    zzbas zzbasVar = zzc;
                    zzbbb zzbbbVar = zzbbb.this;
                    try {
                        zzbav zzq = zzbasVar.zzq();
                        boolean zzp = zzbasVar.zzp();
                        zzbat zzbatVar2 = zzbatVar;
                        zzbaq zzf = zzp ? zzq.zzf(zzbatVar2) : zzq.zze(zzbatVar2);
                        if (!zzf.zza()) {
                            zzbzmVar2.zzd(new RuntimeException("No entry contents."));
                            zzbbbVar.zzc.zzb();
                            return;
                        }
                        zzbay zzbayVar = new zzbay(zzbbbVar, zzf.zzb(), 1);
                        int read = zzbayVar.read();
                        if (read == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zzbayVar.unread(read);
                        zzbzmVar2.zzc(zzbbf.zza(zzbayVar, zzf.zzd(), zzf.zzg(), zzf.zzf(), zzf.zze()));
                    } catch (RemoteException | IOException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                        zzbzmVar2.zzd(e);
                        zzbbbVar.zzc.zzb();
                    }
                }
            });
            zzbzmVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbaz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i = zzbbb.zzd;
                    if (zzbzm.this.isCancelled()) {
                        submit.cancel(true);
                    }
                }
            }, zzbzh.zzg);
        }
    }
}
