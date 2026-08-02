package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbel {
    private zzbea zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    zzbel(Context context) {
        this.zzc = context;
    }

    final Future zzc(zzbeb zzbebVar) {
        zzbef zzbefVar = new zzbef(this);
        zzbej zzbejVar = new zzbej(this, zzbebVar, zzbefVar);
        zzbek zzbekVar = new zzbek(this, zzbefVar);
        synchronized (this.zzd) {
            zzbea zzbeaVar = new zzbea(this.zzc, com.google.android.gms.ads.internal.zzt.zzt().zzb(), zzbejVar, zzbekVar);
            this.zza = zzbeaVar;
            zzbeaVar.checkAvailabilityAndConnect();
        }
        return zzbefVar;
    }

    static /* bridge */ /* synthetic */ void zze(zzbel zzbelVar) {
        synchronized (zzbelVar.zzd) {
            zzbea zzbeaVar = zzbelVar.zza;
            if (zzbeaVar == null) {
                return;
            }
            zzbeaVar.disconnect();
            zzbelVar.zza = null;
            Binder.flushPendingCommands();
        }
    }
}
