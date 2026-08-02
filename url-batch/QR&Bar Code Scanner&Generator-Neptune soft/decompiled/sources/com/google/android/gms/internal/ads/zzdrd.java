package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdrd {
    private final zzfzq zza;
    private final zzdrq zzb;
    private final zzdrv zzc;

    public zzdrd(zzfzq zzfzqVar, zzdrq zzdrqVar, zzdrv zzdrvVar) {
        this.zza = zzfzqVar;
        this.zzb = zzdrqVar;
        this.zzc = zzdrvVar;
    }

    public final zzfzp zza(final zzfdw zzfdwVar, final zzfdk zzfdkVar, final JSONObject jSONObject) {
        zzfzp zzi;
        final zzfzp zzb = this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdrb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfdw zzfdwVar2 = zzfdwVar;
                zzfdk zzfdkVar2 = zzfdkVar;
                JSONObject jSONObject2 = jSONObject;
                zzdoq zzdoqVar = new zzdoq();
                zzdoqVar.zzV(jSONObject2.optInt("template_id", -1));
                zzdoqVar.zzI(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
                zzdoqVar.zzS(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
                zzfef zzfefVar = zzfdwVar2.zza.zza;
                if (!zzfefVar.zzg.contains(Integer.toString(zzdoqVar.zzc()))) {
                    throw new zzekr(1, "Invalid template ID: " + zzdoqVar.zzc());
                }
                if (zzdoqVar.zzc() == 3) {
                    if (zzdoqVar.zzy() == null) {
                        throw new zzekr(1, "No custom template id for custom template ad response.");
                    }
                    if (!zzfefVar.zzh.contains(zzdoqVar.zzy())) {
                        throw new zzekr(1, "Unexpected custom template id in the response.");
                    }
                }
                zzdoqVar.zzT(jSONObject2.optDouble("rating", -1.0d));
                String optString = jSONObject2.optString("headline", null);
                if (zzfdkVar2.zzN) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    optString = com.google.android.gms.ads.internal.util.zzs.zzv() + " : " + optString;
                }
                zzdoqVar.zzU("headline", optString);
                zzdoqVar.zzU("body", jSONObject2.optString("body", null));
                zzdoqVar.zzU("call_to_action", jSONObject2.optString("call_to_action", null));
                zzdoqVar.zzU("store", jSONObject2.optString("store", null));
                zzdoqVar.zzU("price", jSONObject2.optString("price", null));
                zzdoqVar.zzU("advertiser", jSONObject2.optString("advertiser", null));
                return zzdoqVar;
            }
        });
        final zzfzp zzf = this.zzb.zzf(jSONObject, "images");
        final zzfzp zzg = this.zzb.zzg(jSONObject, "images", zzfdkVar, zzfdwVar.zzb.zzb);
        final zzfzp zze = this.zzb.zze(jSONObject, "secondary_image");
        final zzfzp zze2 = this.zzb.zze(jSONObject, "app_icon");
        final zzfzp zzd = this.zzb.zzd(jSONObject, "attribution");
        final zzfzp zzh = this.zzb.zzh(jSONObject, zzfdkVar, zzfdwVar.zzb.zzb);
        final zzdrq zzdrqVar = this.zzb;
        if (jSONObject.optBoolean("enable_omid")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzi = zzfzg.zzi(null);
            } else {
                final String optString = optJSONObject.optString("omid_html");
                zzi = TextUtils.isEmpty(optString) ? zzfzg.zzi(null) : zzfzg.zzn(zzfzg.zzi(null), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzdrf
                    @Override // com.google.android.gms.internal.ads.zzfyn
                    public final zzfzp zza(Object obj) {
                        return zzdrq.this.zzc(optString, obj);
                    }
                }, zzchc.zze);
            }
        } else {
            zzi = zzfzg.zzi(null);
        }
        final zzfzp zzfzpVar = zzi;
        final zzfzp zza = this.zzc.zza(jSONObject, "custom_assets");
        return zzfzg.zzb(zzb, zzf, zzg, zze, zze2, zzd, zzh, zzfzpVar, zza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdrc
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfzp zzfzpVar2 = zzb;
                zzfzp zzfzpVar3 = zzf;
                zzfzp zzfzpVar4 = zze2;
                zzfzp zzfzpVar5 = zze;
                zzfzp zzfzpVar6 = zzd;
                JSONObject jSONObject2 = jSONObject;
                zzfzp zzfzpVar7 = zzh;
                zzfzp zzfzpVar8 = zzg;
                zzfzp zzfzpVar9 = zzfzpVar;
                zzfzp zzfzpVar10 = zza;
                zzdoq zzdoqVar = (zzdoq) zzfzpVar2.get();
                zzdoqVar.zzN((List) zzfzpVar3.get());
                zzdoqVar.zzK((zzbme) zzfzpVar4.get());
                zzdoqVar.zzO((zzbme) zzfzpVar5.get());
                zzdoqVar.zzH((zzblw) zzfzpVar6.get());
                zzdoqVar.zzQ(zzdrq.zzj(jSONObject2));
                zzdoqVar.zzJ(zzdrq.zzi(jSONObject2));
                zzcmp zzcmpVar = (zzcmp) zzfzpVar7.get();
                if (zzcmpVar != null) {
                    zzdoqVar.zzY(zzcmpVar);
                    zzdoqVar.zzX(zzcmpVar.zzH());
                    zzdoqVar.zzW(zzcmpVar.zzs());
                }
                zzcmp zzcmpVar2 = (zzcmp) zzfzpVar8.get();
                if (zzcmpVar2 != null) {
                    zzdoqVar.zzM(zzcmpVar2);
                    zzdoqVar.zzZ(zzcmpVar2.zzH());
                }
                zzcmp zzcmpVar3 = (zzcmp) zzfzpVar9.get();
                if (zzcmpVar3 != null) {
                    zzdoqVar.zzR(zzcmpVar3);
                }
                for (zzdru zzdruVar : (List) zzfzpVar10.get()) {
                    if (zzdruVar.zza != 1) {
                        zzdoqVar.zzL(zzdruVar.zzb, zzdruVar.zzd);
                    } else {
                        zzdoqVar.zzU(zzdruVar.zzb, zzdruVar.zzc);
                    }
                }
                return zzdoqVar;
            }
        }, this.zza);
    }
}
