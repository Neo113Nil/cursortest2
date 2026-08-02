package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdmv {
    private final Executor zza;
    private final zzcop zzb;
    private final zzdek zzc;
    private final zzcni zzd;

    zzdmv(Executor executor, zzcop zzcopVar, zzdek zzdekVar, zzcni zzcniVar) {
        this.zza = executor;
        this.zzc = zzdekVar;
        this.zzb = zzcopVar;
        this.zzd = zzcniVar;
    }

    public final void zza(final zzcej zzcejVar) {
        if (zzcejVar == null) {
            return;
        }
        this.zzc.zza(zzcejVar.zzF());
        this.zzc.zzo(new zzaxw() { // from class: com.google.android.gms.internal.ads.zzdmr
            @Override // com.google.android.gms.internal.ads.zzaxw
            public final void zzdp(zzaxv zzaxvVar) {
                zzcgb zzN = zzcej.this.zzN();
                Rect rect = zzaxvVar.zzd;
                zzN.zzq(rect.left, rect.top, false);
            }
        }, this.zza);
        this.zzc.zzo(new zzaxw() { // from class: com.google.android.gms.internal.ads.zzdms
            @Override // com.google.android.gms.internal.ads.zzaxw
            public final void zzdp(zzaxv zzaxvVar) {
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != zzaxvVar.zzj ? "0" : "1");
                zzcej.this.zzd("onAdVisibilityChanged", hashMap);
            }
        }, this.zza);
        this.zzc.zzo(this.zzb, this.zza);
        this.zzb.zzf(zzcejVar);
        zzcgb zzN = zzcejVar.zzN();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjl)).booleanValue() && zzN != null) {
            zzN.zzJ(this.zzd);
            zzN.zzK(this.zzd, null, null);
        }
        zzcejVar.zzag("/trackActiveViewUnit", new zzbix() { // from class: com.google.android.gms.internal.ads.zzdmt
            @Override // com.google.android.gms.internal.ads.zzbix
            public final void zza(Object obj, Map map) {
                zzdmv.this.zzb((zzcej) obj, map);
            }
        });
        zzcejVar.zzag("/untrackActiveViewUnit", new zzbix() { // from class: com.google.android.gms.internal.ads.zzdmu
            @Override // com.google.android.gms.internal.ads.zzbix
            public final void zza(Object obj, Map map) {
                zzdmv.this.zzc((zzcej) obj, map);
            }
        });
    }

    final /* synthetic */ void zzb(zzcej zzcejVar, Map map) {
        this.zzb.zzb();
    }

    final /* synthetic */ void zzc(zzcej zzcejVar, Map map) {
        this.zzb.zza();
    }
}
