package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdlr {
    private final zzgcu zza;
    private final zzdme zzb;
    private final zzdmj zzc;

    public zzdlr(zzgcu zzgcuVar, zzdme zzdmeVar, zzdmj zzdmjVar) {
        this.zza = zzgcuVar;
        this.zzb = zzdmeVar;
        this.zzc = zzdmjVar;
    }

    public final ListenableFuture zza(final zzfex zzfexVar, final zzfel zzfelVar, final JSONObject jSONObject) {
        ListenableFuture zzn;
        final ListenableFuture zzb = this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdlp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdjb zzdjbVar = new zzdjb();
                JSONObject jSONObject2 = jSONObject;
                zzdjbVar.zzaa(jSONObject2.optInt("template_id", -1));
                zzdjbVar.zzK(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
                String optString = optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null;
                zzfex zzfexVar2 = zzfexVar;
                zzdjbVar.zzV(optString);
                zzffg zzffgVar = zzfexVar2.zza.zza;
                if (!zzffgVar.zzg.contains(Integer.toString(zzdjbVar.zzc()))) {
                    throw new zzeir(1, "Invalid template ID: " + zzdjbVar.zzc());
                }
                if (zzdjbVar.zzc() == 3) {
                    if (zzdjbVar.zzA() == null) {
                        throw new zzeir(1, "No custom template id for custom template ad response.");
                    }
                    if (!zzffgVar.zzh.contains(zzdjbVar.zzA())) {
                        throw new zzeir(1, "Unexpected custom template id in the response.");
                    }
                }
                zzfel zzfelVar2 = zzfelVar;
                zzdjbVar.zzY(jSONObject2.optDouble("rating", -1.0d));
                String optString2 = jSONObject2.optString("headline", null);
                if (zzfelVar2.zzM) {
                    com.google.android.gms.ads.internal.zzu.zzp();
                    optString2 = com.google.android.gms.ads.internal.util.zzt.zzy() + " : " + optString2;
                }
                zzdjbVar.zzZ("headline", optString2);
                zzdjbVar.zzZ("body", jSONObject2.optString("body", null));
                zzdjbVar.zzZ("call_to_action", jSONObject2.optString("call_to_action", null));
                zzdjbVar.zzZ("store", jSONObject2.optString("store", null));
                zzdjbVar.zzZ("price", jSONObject2.optString("price", null));
                zzdjbVar.zzZ("advertiser", jSONObject2.optString("advertiser", null));
                return zzdjbVar;
            }
        });
        final ListenableFuture zzf = this.zzb.zzf(jSONObject, "images");
        zzfeo zzfeoVar = zzfexVar.zzb.zzb;
        zzdme zzdmeVar = this.zzb;
        final ListenableFuture zzg = zzdmeVar.zzg(jSONObject, "images", zzfelVar, zzfeoVar);
        final ListenableFuture zze = zzdmeVar.zze(jSONObject, "secondary_image");
        final ListenableFuture zze2 = zzdmeVar.zze(jSONObject, "app_icon");
        final ListenableFuture zzd = zzdmeVar.zzd(jSONObject, "attribution");
        final ListenableFuture zzh = this.zzb.zzh(jSONObject, zzfelVar, zzfexVar.zzb.zzb);
        final ListenableFuture zza = this.zzc.zza(jSONObject, "custom_assets");
        if (jSONObject.optBoolean("enable_omid")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzn = zzgcj.zzh(null);
            } else {
                final String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzn = zzgcj.zzh(null);
                } else {
                    final zzdme zzdmeVar2 = this.zzb;
                    zzn = zzgcj.zzn(zzgcj.zzh(null), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdlt
                        @Override // com.google.android.gms.internal.ads.zzgbq
                        public final ListenableFuture zza(Object obj) {
                            return zzdme.this.zzc(optString, obj);
                        }
                    }, zzbzo.zze);
                }
            }
        } else {
            zzn = zzgcj.zzh(null);
        }
        final ListenableFuture listenableFuture = zzn;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzb);
        arrayList.add(zzf);
        arrayList.add(zzg);
        arrayList.add(zze);
        arrayList.add(zze2);
        arrayList.add(zzd);
        arrayList.add(zzh);
        arrayList.add(zza);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeH)).booleanValue()) {
            arrayList.add(listenableFuture);
        }
        return zzgcj.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdlq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdjb zzdjbVar = (zzdjb) zzb.get();
                zzdjbVar.zzP((List) zzf.get());
                zzdjbVar.zzM((zzbfd) zze2.get());
                zzdjbVar.zzQ((zzbfd) zze.get());
                zzdjbVar.zzJ((zzbew) zzd.get());
                JSONObject jSONObject2 = jSONObject;
                zzdjbVar.zzS(zzdme.zzj(jSONObject2));
                zzdjbVar.zzL(zzdme.zzi(jSONObject2));
                zzcej zzcejVar = (zzcej) zzh.get();
                if (zzcejVar != null) {
                    zzdjbVar.zzad(zzcejVar);
                    zzdjbVar.zzac(zzcejVar.zzF());
                    zzdjbVar.zzab(zzcejVar.zzq());
                }
                zzcej zzcejVar2 = (zzcej) zzg.get();
                if (zzcejVar2 != null) {
                    zzdjbVar.zzO(zzcejVar2);
                    zzdjbVar.zzae(zzcejVar2.zzF());
                }
                ListenableFuture listenableFuture2 = listenableFuture;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeH)).booleanValue()) {
                    zzdjbVar.zzU(listenableFuture2);
                    zzdjbVar.zzX(new zzbzt());
                } else {
                    zzcej zzcejVar3 = (zzcej) listenableFuture2.get();
                    if (zzcejVar3 != null) {
                        zzdjbVar.zzT(zzcejVar3);
                    }
                }
                for (zzdmi zzdmiVar : (List) zza.get()) {
                    if (zzdmiVar.zza != 1) {
                        zzdjbVar.zzN(zzdmiVar.zzb, zzdmiVar.zzd);
                    } else {
                        zzdjbVar.zzZ(zzdmiVar.zzb, zzdmiVar.zzc);
                    }
                }
                return zzdjbVar;
            }
        }, this.zza);
    }
}
