package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzdqx {
    private final Executor zza;
    private final zzcum zzb;
    private final zzdja zzc;

    zzdqx(Executor executor, zzcum zzcumVar, zzdja zzdjaVar) {
        this.zza = executor;
        this.zzc = zzdjaVar;
        this.zzb = zzcumVar;
    }

    public final void zza(final zzcli zzcliVar) {
        if (zzcliVar == null) {
            return;
        }
        this.zzc.zza(zzcliVar.zzH());
        this.zzc.zzj(new zzbam() { // from class: com.google.android.gms.internal.ads.zzdqt
            @Override // com.google.android.gms.internal.ads.zzbam
            public final void zzc(zzbal zzbalVar) {
                zzcli.this.zzP().zzo(zzbalVar.zzd.left, zzbalVar.zzd.top, false);
            }
        }, this.zza);
        this.zzc.zzj(new zzbam() { // from class: com.google.android.gms.internal.ads.zzdqu
            @Override // com.google.android.gms.internal.ads.zzbam
            public final void zzc(zzbal zzbalVar) {
                zzcli zzcliVar2 = zzcli.this;
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != zzbalVar.zzj ? "0" : "1");
                zzcliVar2.zzd("onAdVisibilityChanged", hashMap);
            }
        }, this.zza);
        this.zzc.zzj(this.zzb, this.zza);
        this.zzb.zzf(zzcliVar);
        zzcliVar.zzaf("/trackActiveViewUnit", new zzbol() { // from class: com.google.android.gms.internal.ads.zzdqv
            @Override // com.google.android.gms.internal.ads.zzbol
            public final void zza(Object obj, Map map) {
                zzdqx.this.zzb((zzcli) obj, map);
            }
        });
        zzcliVar.zzaf("/untrackActiveViewUnit", new zzbol() { // from class: com.google.android.gms.internal.ads.zzdqw
            @Override // com.google.android.gms.internal.ads.zzbol
            public final void zza(Object obj, Map map) {
                zzdqx.this.zzc((zzcli) obj, map);
            }
        });
    }

    final /* synthetic */ void zzb(zzcli zzcliVar, Map map) {
        this.zzb.zzb();
    }

    final /* synthetic */ void zzc(zzcli zzcliVar, Map map) {
        this.zzb.zza();
    }
}
