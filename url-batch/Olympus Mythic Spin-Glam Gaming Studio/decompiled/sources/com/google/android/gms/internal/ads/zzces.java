package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public abstract class zzces {

    @GuardedBy
    @VisibleForTesting
    static zzces zzi;

    public static synchronized zzces zzb(Context context) {
        synchronized (zzces.class) {
            try {
                zzces zzcesVar = zzi;
                if (zzcesVar != null) {
                    return zzcesVar;
                }
                Context applicationContext = context.getApplicationContext();
                zzbjg.zza(applicationContext);
                com.google.android.gms.ads.internal.util.zzg zzp = com.google.android.gms.ads.internal.zzt.zzh().zzp();
                zzp.zza(applicationContext);
                zzcem zzcemVar = new zzcem(null);
                zzcemVar.zza(applicationContext);
                zzcemVar.zzb(com.google.android.gms.ads.internal.zzt.zzk());
                zzcemVar.zzc(zzp);
                zzcemVar.zzd(com.google.android.gms.ads.internal.zzt.zzD());
                zzces zze = zzcemVar.zze();
                zzi = zze;
                ((zzceg) ((zzcen) zze).zzc.zzb()).zza();
                final zzcex zzcexVar = (zzcex) ((zzcen) zzi).zzh.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbk)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    final Map zzx = com.google.android.gms.ads.internal.util.zzs.zzx((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbl));
                    Iterator it = zzx.keySet().iterator();
                    while (it.hasNext()) {
                        zzcexVar.zzb((String) it.next());
                    }
                    zzcexVar.zza(new zzcev() { // from class: com.google.android.gms.internal.ads.zzcew
                        @Override // com.google.android.gms.internal.ads.zzcev
                        public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str, String str2) {
                            zzcex.this.zzc(zzx, sharedPreferences, str, str2);
                        }
                    });
                }
                return zzi;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    abstract zzcek zza();
}
