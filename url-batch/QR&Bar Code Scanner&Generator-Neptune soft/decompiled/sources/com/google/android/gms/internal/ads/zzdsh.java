package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdsh {
    private final Executor zza;
    private final zzcvu zzb;
    private final zzdki zzc;

    zzdsh(Executor executor, zzcvu zzcvuVar, zzdki zzdkiVar) {
        this.zza = executor;
        this.zzc = zzdkiVar;
        this.zzb = zzcvuVar;
    }

    public final void zza(final zzcmp zzcmpVar) {
        if (zzcmpVar == null) {
            return;
        }
        this.zzc.zza(zzcmpVar.zzH());
        this.zzc.zzj(new zzbbq() { // from class: com.google.android.gms.internal.ads.zzdsd
            @Override // com.google.android.gms.internal.ads.zzbbq
            public final void zzc(zzbbp zzbbpVar) {
                zzcmp.this.zzP().zzo(zzbbpVar.zzd.left, zzbbpVar.zzd.top, false);
            }
        }, this.zza);
        this.zzc.zzj(new zzbbq() { // from class: com.google.android.gms.internal.ads.zzdse
            @Override // com.google.android.gms.internal.ads.zzbbq
            public final void zzc(zzbbp zzbbpVar) {
                zzcmp zzcmpVar2 = zzcmp.this;
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != zzbbpVar.zzj ? "0" : "1");
                zzcmpVar2.zzd("onAdVisibilityChanged", hashMap);
            }
        }, this.zza);
        this.zzc.zzj(this.zzb, this.zza);
        this.zzb.zzf(zzcmpVar);
        zzcmpVar.zzaf("/trackActiveViewUnit", new zzbpu() { // from class: com.google.android.gms.internal.ads.zzdsf
            @Override // com.google.android.gms.internal.ads.zzbpu
            public final void zza(Object obj, Map map) {
                zzdsh.this.zzb((zzcmp) obj, map);
            }
        });
        zzcmpVar.zzaf("/untrackActiveViewUnit", new zzbpu() { // from class: com.google.android.gms.internal.ads.zzdsg
            @Override // com.google.android.gms.internal.ads.zzbpu
            public final void zza(Object obj, Map map) {
                zzdsh.this.zzc((zzcmp) obj, map);
            }
        });
    }

    final /* synthetic */ void zzb(zzcmp zzcmpVar, Map map) {
        this.zzb.zzb();
    }

    final /* synthetic */ void zzc(zzcmp zzcmpVar, Map map) {
        this.zzb.zza();
    }
}
