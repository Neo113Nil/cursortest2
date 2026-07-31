package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbbd {
    private zzbas zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    zzbbd(Context context) {
        this.zzc = context;
    }

    final Future zza(zzbat zzbatVar) {
        zzbax zzbaxVar = new zzbax(this);
        zzbbb zzbbbVar = new zzbbb(this, zzbatVar, zzbaxVar);
        zzbbc zzbbcVar = new zzbbc(this, zzbaxVar);
        synchronized (this.zzd) {
            zzbas zzbasVar = new zzbas(this.zzc, com.google.android.gms.ads.internal.zzt.zzs().zza(), zzbbbVar, zzbbcVar);
            this.zza = zzbasVar;
            zzbasVar.checkAvailabilityAndConnect();
        }
        return zzbaxVar;
    }

    final /* synthetic */ zzbas zzc() {
        return this.zza;
    }

    final /* synthetic */ boolean zzd() {
        return this.zzb;
    }

    final /* synthetic */ void zze(boolean z) {
        this.zzb = true;
    }

    final /* synthetic */ Object zzf() {
        return this.zzd;
    }

    final /* synthetic */ void zzb() {
        synchronized (this.zzd) {
            zzbas zzbasVar = this.zza;
            if (zzbasVar == null) {
                return;
            }
            zzbasVar.disconnect();
            this.zza = null;
            Binder.flushPendingCommands();
        }
    }
}
