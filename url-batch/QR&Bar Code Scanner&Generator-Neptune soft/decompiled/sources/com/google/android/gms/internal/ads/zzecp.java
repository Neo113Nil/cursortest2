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

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzecp {
    private final zzcom zza;
    private final Context zzb;
    private final zzcgv zzc;
    private final zzfef zzd;
    private final Executor zze;
    private final String zzf;
    private final zzfju zzg;
    private final zzfer zzh;
    private final zzdxl zzi;

    public zzecp(zzcom zzcomVar, Context context, zzcgv zzcgvVar, zzfef zzfefVar, Executor executor, String str, zzfju zzfjuVar, zzdxl zzdxlVar) {
        this.zza = zzcomVar;
        this.zzb = context;
        this.zzc = zzcgvVar;
        this.zzd = zzfefVar;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzfjuVar;
        this.zzh = zzcomVar.zzv();
        this.zzi = zzdxlVar;
    }

    private final zzfzp zzc(final String str, final String str2) {
        zzfjj zza = zzfji.zza(this.zzb, 11);
        zza.zzf();
        final zzbua zza2 = com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzb, this.zzc, this.zza.zzy()).zza("google.afma.response.normalize", zzbuh.zza, zzbuh.zza);
        zzfzp zzn = zzfzg.zzn(zzfzg.zzn(zzfzg.zzn(zzfzg.zzi(""), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzecm
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
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
                    return zzfzg.zzi(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(String.valueOf(e.getCause()))));
                }
            }
        }, this.zze), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzecn
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzbua.this.zzb((JSONObject) obj);
            }
        }, this.zze), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzeco
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzecp.this.zzb((JSONObject) obj);
            }
        }, this.zze);
        zzfjt.zza(zzn, this.zzg, zza);
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzfzp zza() {
        Boolean bool;
        String str = this.zzd.zzd.zzx;
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzga)).booleanValue()) {
                String zze = zze(str);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgn)).booleanValue() && zze.isEmpty()) {
                    int lastIndexOf = str.lastIndexOf("&request_id=");
                    zze = lastIndexOf != -1 ? str.substring(lastIndexOf + 12) : "";
                }
                if (TextUtils.isEmpty(zze)) {
                    return zzfzg.zzh(new zzekr(15, "Invalid ad string."));
                }
                String zzb = this.zza.zzm().zzb(zze, this.zzi);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgn)).booleanValue()) {
                    zzdxl zzdxlVar = this.zzi;
                    if (!TextUtils.isEmpty(zzb)) {
                        if (new JSONObject(zzb).optString("is_gbid").equals("true")) {
                            bool = true;
                            if (bool.booleanValue()) {
                                int lastIndexOf2 = str.lastIndexOf("&");
                                String str2 = null;
                                String substring = lastIndexOf2 != -1 ? str.substring(0, lastIndexOf2) : null;
                                if (!TextUtils.isEmpty(substring)) {
                                    try {
                                        byte[] decode = Base64.decode(substring, 11);
                                        byte[] bytes = zze.getBytes("UTF-8");
                                        try {
                                            str2 = new JSONObject(zzb).getString("arek");
                                        } catch (JSONException e) {
                                            com.google.android.gms.ads.internal.util.zze.zza("Failed to get key from QueryJSONMap".concat(e.toString()));
                                            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "CryptoUtils.getKeyFromQueryJsonMap");
                                        }
                                        str = zzfer.zzb(decode, bytes, str2, zzdxlVar);
                                    } catch (UnsupportedEncodingException e2) {
                                        com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat(e2.toString()));
                                        com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "PreloadedLoader.decryptAdResponseIfNecessary");
                                    }
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
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfY)).booleanValue()) {
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
        return zzfzg.zzh(new zzekr(14, "Mismatch request IDs."));
    }

    final /* synthetic */ zzfzp zzb(JSONObject jSONObject) throws Exception {
        return zzfzg.zzi(new zzfdw(new zzfdt(this.zzd), zzfdv.zza(new StringReader(jSONObject.toString()))));
    }
}
