package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzdpt {
    private final zzfvk zza;
    private final zzdqg zzb;
    private final zzdql zzc;

    public zzdpt(zzfvk zzfvkVar, zzdqg zzdqgVar, zzdql zzdqlVar) {
        this.zza = zzfvkVar;
        this.zzb = zzdqgVar;
        this.zzc = zzdqlVar;
    }

    public final zzfvj zza(final zzfbs zzfbsVar, final zzfbg zzfbgVar, final JSONObject jSONObject) {
        zzfvj zzi;
        final zzfvj zzb = this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdpr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfbs zzfbsVar2 = zzfbsVar;
                zzfbg zzfbgVar2 = zzfbgVar;
                JSONObject jSONObject2 = jSONObject;
                zzdng zzdngVar = new zzdng();
                zzdngVar.zzV(jSONObject2.optInt("template_id", -1));
                zzdngVar.zzI(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
                zzdngVar.zzS(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
                zzfby zzfbyVar = zzfbsVar2.zza.zza;
                if (!zzfbyVar.zzg.contains(Integer.toString(zzdngVar.zzc()))) {
                    throw new zzeio(1, "Invalid template ID: " + zzdngVar.zzc());
                }
                if (zzdngVar.zzc() == 3) {
                    if (zzdngVar.zzy() == null) {
                        throw new zzeio(1, "No custom template id for custom template ad response.");
                    }
                    if (!zzfbyVar.zzh.contains(zzdngVar.zzy())) {
                        throw new zzeio(1, "Unexpected custom template id in the response.");
                    }
                }
                zzdngVar.zzT(jSONObject2.optDouble("rating", -1.0d));
                String optString = jSONObject2.optString("headline", null);
                if (zzfbgVar2.zzN) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    optString = com.google.android.gms.ads.internal.util.zzs.zzv() + " : " + optString;
                }
                zzdngVar.zzU("headline", optString);
                zzdngVar.zzU("body", jSONObject2.optString("body", null));
                zzdngVar.zzU("call_to_action", jSONObject2.optString("call_to_action", null));
                zzdngVar.zzU("store", jSONObject2.optString("store", null));
                zzdngVar.zzU("price", jSONObject2.optString("price", null));
                zzdngVar.zzU("advertiser", jSONObject2.optString("advertiser", null));
                return zzdngVar;
            }
        });
        final zzfvj zzf = this.zzb.zzf(jSONObject, "images");
        final zzfvj zzg = this.zzb.zzg(jSONObject, "images", zzfbgVar, zzfbsVar.zzb.zzb);
        final zzfvj zze = this.zzb.zze(jSONObject, "secondary_image");
        final zzfvj zze2 = this.zzb.zze(jSONObject, "app_icon");
        final zzfvj zzd = this.zzb.zzd(jSONObject, "attribution");
        final zzfvj zzh = this.zzb.zzh(jSONObject, zzfbgVar, zzfbsVar.zzb.zzb);
        final zzdqg zzdqgVar = this.zzb;
        if (jSONObject.optBoolean("enable_omid")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzi = zzfva.zzi(null);
            } else {
                final String optString = optJSONObject.optString("omid_html");
                zzi = TextUtils.isEmpty(optString) ? zzfva.zzi(null) : zzfva.zzn(zzfva.zzi(null), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzdpv
                    @Override // com.google.android.gms.internal.ads.zzfuh
                    public final zzfvj zza(Object obj) {
                        return zzdqg.this.zzc(optString, obj);
                    }
                }, zzcfv.zze);
            }
        } else {
            zzi = zzfva.zzi(null);
        }
        final zzfvj zzfvjVar = zzi;
        final zzfvj zza = this.zzc.zza(jSONObject, "custom_assets");
        return zzfva.zzb(zzb, zzf, zzg, zze, zze2, zzd, zzh, zzfvjVar, zza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdps
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfvj zzfvjVar2 = zzb;
                zzfvj zzfvjVar3 = zzf;
                zzfvj zzfvjVar4 = zze2;
                zzfvj zzfvjVar5 = zze;
                zzfvj zzfvjVar6 = zzd;
                JSONObject jSONObject2 = jSONObject;
                zzfvj zzfvjVar7 = zzh;
                zzfvj zzfvjVar8 = zzg;
                zzfvj zzfvjVar9 = zzfvjVar;
                zzfvj zzfvjVar10 = zza;
                zzdng zzdngVar = (zzdng) zzfvjVar2.get();
                zzdngVar.zzN((List) zzfvjVar3.get());
                zzdngVar.zzK((zzbla) zzfvjVar4.get());
                zzdngVar.zzO((zzbla) zzfvjVar5.get());
                zzdngVar.zzH((zzbks) zzfvjVar6.get());
                zzdngVar.zzQ(zzdqg.zzj(jSONObject2));
                zzdngVar.zzJ(zzdqg.zzi(jSONObject2));
                zzcli zzcliVar = (zzcli) zzfvjVar7.get();
                if (zzcliVar != null) {
                    zzdngVar.zzY(zzcliVar);
                    zzdngVar.zzX(zzcliVar.zzH());
                    zzdngVar.zzW(zzcliVar.zzs());
                }
                zzcli zzcliVar2 = (zzcli) zzfvjVar8.get();
                if (zzcliVar2 != null) {
                    zzdngVar.zzM(zzcliVar2);
                    zzdngVar.zzZ(zzcliVar2.zzH());
                }
                zzcli zzcliVar3 = (zzcli) zzfvjVar9.get();
                if (zzcliVar3 != null) {
                    zzdngVar.zzR(zzcliVar3);
                }
                for (zzdqk zzdqkVar : (List) zzfvjVar10.get()) {
                    if (zzdqkVar.zza != 1) {
                        zzdngVar.zzL(zzdqkVar.zzb, zzdqkVar.zzd);
                    } else {
                        zzdngVar.zzU(zzdqkVar.zzb, zzdqkVar.zzc);
                    }
                }
                return zzdngVar;
            }
        }, this.zza);
    }
}
