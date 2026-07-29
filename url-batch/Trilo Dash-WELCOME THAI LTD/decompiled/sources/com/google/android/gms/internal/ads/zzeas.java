package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.os.EnvironmentCompat;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzeas {
    private final zzcnf zza;
    private final Context zzb;
    private final zzcfo zzc;
    private final zzfby zzd;
    private final Executor zze;
    private final String zzf;
    private final zzfhq zzg;
    private final zzfck zzh;
    private final zzdwb zzi;

    public zzeas(zzcnf zzcnfVar, Context context, zzcfo zzcfoVar, zzfby zzfbyVar, Executor executor, String str, zzfhq zzfhqVar, zzdwb zzdwbVar) {
        this.zza = zzcnfVar;
        this.zzb = context;
        this.zzc = zzcfoVar;
        this.zzd = zzfbyVar;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzfhqVar;
        this.zzh = zzcnfVar.zzv();
        this.zzi = zzdwbVar;
    }

    private final zzfvj zzc(final String str, final String str2) {
        zzfhg zza = zzfhf.zza(this.zzb, 11);
        zza.zzf();
        final zzbsp zza2 = com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzb, this.zzc, this.zza.zzy()).zza("google.afma.response.normalize", zzbsw.zza, zzbsw.zza);
        zzfvj zzn = zzfva.zzn(zzfva.zzn(zzfva.zzn(zzfva.zzi(""), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzeap
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                String str3 = str;
                String str4 = str2;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzfva.zzi(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getMessage())));
                }
            }
        }, this.zze), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzeaq
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzbsp.this.zzb((JSONObject) obj);
            }
        }, this.zze), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzear
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzeas.this.zzb((JSONObject) obj);
            }
        }, this.zze);
        zzfhp.zza(zzn, this.zzg, zza);
        return zzn;
    }

    private final String zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && EnvironmentCompat.MEDIA_UNKNOWN.equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzf));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    private static final String zze(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzfvj zza() {
        Boolean bool;
        String str = this.zzd.zzd.zzx;
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfT)).booleanValue()) {
                String zze = zze(str);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgf)).booleanValue() && zze.isEmpty()) {
                    int lastIndexOf = str.lastIndexOf("&request_id=");
                    zze = lastIndexOf != -1 ? str.substring(lastIndexOf + 12) : "";
                }
                if (TextUtils.isEmpty(zze)) {
                    return zzfva.zzh(new zzeio(15, "Invalid ad string."));
                }
                String zzb = this.zza.zzm().zzb(zze, this.zzi);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgf)).booleanValue()) {
                    zzdwb zzdwbVar = this.zzi;
                    if (!TextUtils.isEmpty(zzb)) {
                        if (new JSONObject(zzb).optString("is_gbid").equals("true")) {
                            bool = true;
                            if (bool.booleanValue()) {
                                try {
                                    int lastIndexOf2 = str.lastIndexOf("&");
                                    String str2 = null;
                                    byte[] decode = Base64.decode(lastIndexOf2 != -1 ? str.substring(0, lastIndexOf2) : null, 11);
                                    byte[] bytes = zze.getBytes("UTF-8");
                                    try {
                                        str2 = new JSONObject(zzb).getString("arek");
                                    } catch (JSONException e) {
                                        com.google.android.gms.ads.internal.util.zze.zza("Failed to get key from QueryJSONMap".concat(e.toString()));
                                        com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "CryptoUtils.getKeyFromQueryJsonMap");
                                    }
                                    str = zzfck.zzb(decode, bytes, str2, zzdwbVar);
                                } catch (UnsupportedEncodingException e2) {
                                    com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat(e2.toString()));
                                    com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "PreloadedLoader.decryptAdResponseIfNecessary");
                                }
                            }
                        }
                        bool = false;
                        if (bool.booleanValue()) {
                        }
                    }
                }
                if (!TextUtils.isEmpty(zzb)) {
                    return zzc(str, zzd(zzb));
                }
            }
        }
        com.google.android.gms.ads.internal.client.zzc zzcVar = this.zzd.zzd.zzs;
        if (zzcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfR)).booleanValue()) {
                String zze2 = zze(zzcVar.zza);
                String zze3 = zze(zzcVar.zzb);
                if (TextUtils.isEmpty(zze3) || !zze2.equals(zze3)) {
                    this.zzi.zza().put("ridmm", "true");
                } else {
                    this.zza.zzm().zzf(zze2);
                    this.zzi.zza().put("rid", zze2);
                }
            }
            return zzc(zzcVar.zza, zzd(zzcVar.zzb));
        }
        return zzfva.zzh(new zzeio(14, "Mismatch request IDs."));
    }

    final /* synthetic */ zzfvj zzb(JSONObject jSONObject) throws Exception {
        return zzfva.zzi(new zzfbs(new zzfbp(this.zzd), zzfbr.zza(new StringReader(jSONObject.toString()))));
    }
}
