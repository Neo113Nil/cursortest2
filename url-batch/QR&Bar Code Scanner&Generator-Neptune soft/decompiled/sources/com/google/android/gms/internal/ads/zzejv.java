package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzejv implements zzejp {
    private final zzdnd zza;
    private final zzfzq zzb;
    private final zzdrd zzc;
    private final zzffb zzd;
    private final zzdtt zze;

    public zzejv(zzdnd zzdndVar, zzfzq zzfzqVar, zzdrd zzdrdVar, zzffb zzffbVar, zzdtt zzdttVar) {
        this.zza = zzdndVar;
        this.zzb = zzfzqVar;
        this.zzc = zzdrdVar;
        this.zzd = zzffbVar;
        this.zze = zzdttVar;
    }

    private final zzfzp zzg(final zzfdw zzfdwVar, final zzfdk zzfdkVar, final JSONObject jSONObject) {
        final zzfzp zza = this.zzd.zza();
        final zzfzp zza2 = this.zzc.zza(zzfdwVar, zzfdkVar, jSONObject);
        return zzfzg.zzd(zza, zza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzejq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzejv.this.zzc(zza2, zza, zzfdwVar, zzfdkVar, jSONObject);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final zzfzp zza(final zzfdw zzfdwVar, final zzfdk zzfdkVar) {
        return zzfzg.zzn(zzfzg.zzn(this.zzd.zza(), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzejs
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzejv.this.zze(zzfdkVar, (zzdtn) obj);
            }
        }, this.zzb), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzejt
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzejv.this.zzf(zzfdwVar, zzfdkVar, (JSONArray) obj);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final boolean zzb(zzfdw zzfdwVar, zzfdk zzfdkVar) {
        zzfdp zzfdpVar = zzfdkVar.zzt;
        return (zzfdpVar == null || zzfdpVar.zzc == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzdol zzc(zzfzp zzfzpVar, zzfzp zzfzpVar2, zzfdw zzfdwVar, zzfdk zzfdkVar, JSONObject jSONObject) throws Exception {
        zzdoq zzdoqVar = (zzdoq) zzfzpVar.get();
        zzdtn zzdtnVar = (zzdtn) zzfzpVar2.get();
        zzdor zzd = this.zza.zzd(new zzczt(zzfdwVar, zzfdkVar, null), new zzdpc(zzdoqVar), new zzdns(jSONObject, zzdtnVar));
        zzd.zzj().zzb();
        zzd.zzk().zza(zzdtnVar);
        zzd.zzg().zza(zzdoqVar.zzr());
        zzd.zzl().zza(this.zze);
        return zzd.zza();
    }

    final /* synthetic */ zzfzp zzd(zzdtn zzdtnVar, JSONObject jSONObject) throws Exception {
        this.zzd.zzb(zzfzg.zzi(zzdtnVar));
        if (jSONObject.optBoolean("success")) {
            return zzfzg.zzi(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbtz("process json failed");
    }

    final /* synthetic */ zzfzp zze(zzfdk zzfdkVar, final zzdtn zzdtnVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhp)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfdkVar.zzt.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzfzg.zzn(zzdtnVar.zzd("google.afma.nativeAds.preProcessJson", jSONObject2), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzejr
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzejv.this.zzd(zzdtnVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ zzfzp zzf(zzfdw zzfdwVar, zzfdk zzfdkVar, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzfzg.zzh(new zzebh(3));
        }
        if (zzfdwVar.zza.zza.zzk <= 1) {
            return zzfzg.zzm(zzg(zzfdwVar, zzfdkVar, jSONArray.getJSONObject(0)), new zzfsm() { // from class: com.google.android.gms.internal.ads.zzeju
                @Override // com.google.android.gms.internal.ads.zzfsm
                public final Object apply(Object obj) {
                    return Collections.singletonList(zzfzg.zzi((zzdol) obj));
                }
            }, this.zzb);
        }
        int length = jSONArray.length();
        this.zzd.zzc(Math.min(length, zzfdwVar.zza.zza.zzk));
        ArrayList arrayList = new ArrayList(zzfdwVar.zza.zza.zzk);
        for (int i = 0; i < zzfdwVar.zza.zza.zzk; i++) {
            if (i < length) {
                arrayList.add(zzg(zzfdwVar, zzfdkVar, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(zzfzg.zzh(new zzebh(3)));
            }
        }
        return zzfzg.zzi(arrayList);
    }
}
