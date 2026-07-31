package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import com.ironsource.C4643f8;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzdul {
    private final Executor zza;
    private final zzcvi zzb;
    private final zzdlq zzc;
    private final zzcub zzd;
    private final zzdck zze;

    zzdul(Executor executor, zzcvi zzcviVar, zzdlq zzdlqVar, zzcub zzcubVar, zzdck zzdckVar) {
        this.zza = executor;
        this.zzc = zzdlqVar;
        this.zzb = zzcviVar;
        this.zzd = zzcubVar;
        this.zze = zzdckVar;
    }

    public final void zza(final zzclm zzclmVar) {
        if (zzclmVar == null) {
            return;
        }
        zzdlq zzdlqVar = this.zzc;
        zzdlqVar.zza(zzclmVar.zzE());
        zzbfg zzbfgVar = new zzbfg() { // from class: com.google.android.gms.internal.ads.zzduk
            @Override // com.google.android.gms.internal.ads.zzbfg
            public final /* synthetic */ void zzdj(zzbff zzbffVar) {
                Rect rect = zzbffVar.zzd;
                zzclm.this.zzP().zza(rect.left, rect.top, false);
            }
        };
        Executor executor = this.zza;
        zzdlqVar.zzq(zzbfgVar, executor);
        zzdlqVar.zzq(new zzbfg() { // from class: com.google.android.gms.internal.ads.zzduh
            @Override // com.google.android.gms.internal.ads.zzbfg
            public final /* synthetic */ void zzdj(zzbff zzbffVar) {
                HashMap hashMap = new HashMap();
                hashMap.put(C4643f8.k, true != zzbffVar.zzj ? "0" : "1");
                zzclm.this.zze("onAdVisibilityChanged", hashMap);
            }
        }, executor);
        zzcvi zzcviVar = this.zzb;
        zzdlqVar.zzq(zzcviVar, executor);
        zzcviVar.zza(zzclmVar);
        zzcnk zzP = zzclmVar.zzP();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlM)).booleanValue() && zzP != null) {
            zzcub zzcubVar = this.zzd;
            zzP.zzc(zzcubVar);
            zzP.zze(zzcubVar, null, null);
        }
        zzclmVar.zzab("/trackActiveViewUnit", new zzbqh() { // from class: com.google.android.gms.internal.ads.zzdui
            @Override // com.google.android.gms.internal.ads.zzbqh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdul.this.zzb((zzclm) obj, map);
            }
        });
        zzclmVar.zzab("/untrackActiveViewUnit", new zzbqh() { // from class: com.google.android.gms.internal.ads.zzduj
            @Override // com.google.android.gms.internal.ads.zzbqh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdul.this.zzc((zzclm) obj, map);
            }
        });
        zzclmVar.zzP().zzJ(this.zze);
    }

    final /* synthetic */ void zzb(zzclm zzclmVar, Map map) {
        this.zzb.zzd();
    }

    final /* synthetic */ void zzc(zzclm zzclmVar, Map map) {
        this.zzb.zzb();
    }
}
