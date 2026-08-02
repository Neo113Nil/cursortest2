package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdrq {
    private final Context zza;
    private final zzdqz zzb;
    private final zzape zzc;
    private final zzcgv zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbep zzf;
    private final Executor zzg;
    private final zzbls zzh;
    private final zzdsi zzi;
    private final zzduy zzj;
    private final ScheduledExecutorService zzk;
    private final zzdtt zzl;
    private final zzdxq zzm;
    private final zzfir zzn;
    private final zzfkm zzo;
    private final zzego zzp;

    public zzdrq(Context context, zzdqz zzdqzVar, zzape zzapeVar, zzcgv zzcgvVar, com.google.android.gms.ads.internal.zza zzaVar, zzbep zzbepVar, Executor executor, zzfef zzfefVar, zzdsi zzdsiVar, zzduy zzduyVar, ScheduledExecutorService scheduledExecutorService, zzdxq zzdxqVar, zzfir zzfirVar, zzfkm zzfkmVar, zzego zzegoVar, zzdtt zzdttVar) {
        this.zza = context;
        this.zzb = zzdqzVar;
        this.zzc = zzapeVar;
        this.zzd = zzcgvVar;
        this.zze = zzaVar;
        this.zzf = zzbepVar;
        this.zzg = executor;
        this.zzh = zzfefVar.zzi;
        this.zzi = zzdsiVar;
        this.zzj = zzduyVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdxqVar;
        this.zzn = zzfirVar;
        this.zzo = zzfkmVar;
        this.zzp = zzegoVar;
        this.zzl = zzdttVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzef zzi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(optJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzfvn.zzo();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfvn.zzo();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzef zzr = zzr(optJSONArray.optJSONObject(i));
            if (zzr != null) {
                arrayList.add(zzr);
            }
        }
        return zzfvn.zzm(arrayList);
    }

    private static zzfzp zzl(zzfzp zzfzpVar, Object obj) {
        final Object obj2 = null;
        return zzfzg.zzg(zzfzpVar, Exception.class, new zzfyn(obj2) { // from class: com.google.android.gms.internal.ads.zzdrn
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzfzg.zzi(null);
            }
        }, zzchc.zzf);
    }

    private static zzfzp zzm(boolean z, final zzfzp zzfzpVar, Object obj) {
        return z ? zzfzg.zzn(zzfzpVar, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzdrl
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj2) {
                return obj2 != null ? zzfzp.this : zzfzg.zzh(new zzekr(1, "Retrieve required value in native ad response failed."));
            }
        }, zzchc.zzf) : zzl(zzfzpVar, null);
    }

    private final zzfzp zzn(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzfzg.zzi(null);
        }
        final String optString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(optString)) {
            return zzfzg.zzi(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzfzg.zzi(new zzblq(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzfzg.zzm(this.zzb.zzb(optString, optDouble, optBoolean), new zzfsm() { // from class: com.google.android.gms.internal.ads.zzdro
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                String str = optString;
                return new zzblq(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), optDouble, optInt, optInt2);
            }
        }, this.zzg), null);
    }

    private final zzfzp zzo(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzfzg.zzi(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z));
        }
        return zzfzg.zzm(zzfzg.zze(arrayList), new zzfsm() { // from class: com.google.android.gms.internal.ads.zzdrm
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzblq zzblqVar : (List) obj) {
                    if (zzblqVar != null) {
                        arrayList2.add(zzblqVar);
                    }
                }
                return arrayList2;
            }
        }, this.zzg);
    }

    private final zzfzp zzp(JSONObject jSONObject, zzfdk zzfdkVar, zzfdn zzfdnVar) {
        final zzfzp zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfdkVar, zzfdnVar, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzfzg.zzn(zzb, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzdrp
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                zzfzp zzfzpVar = zzfzp.this;
                zzcmp zzcmpVar = (zzcmp) obj;
                if (zzcmpVar == null || zzcmpVar.zzs() == null) {
                    throw new zzekr(1, "Retrieve video view in html5 ad response failed.");
                }
                return zzfzpVar;
            }
        }, zzchc.zzf);
    }

    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final com.google.android.gms.ads.internal.client.zzef zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzef(optString, optString2);
    }

    final /* synthetic */ zzbln zza(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzq = zzq(jSONObject, "bg_color");
        Integer zzq2 = zzq(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbln(optString, list, zzq, zzq2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.zzh.zze, optBoolean);
    }

    final /* synthetic */ zzfzp zzb(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfdk zzfdkVar, zzfdn zzfdnVar, String str, String str2, Object obj) throws Exception {
        zzcmp zza = this.zzj.zza(zzqVar, zzfdkVar, zzfdnVar);
        final zzchg zza2 = zzchg.zza(zza);
        zzdtq zzb = this.zzl.zzb();
        zza.zzP().zzL(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zza, null, null), null, null, this.zzp, this.zzo, this.zzm, this.zzn, null, zzb, null, null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcT)).booleanValue()) {
            zza.zzaf("/getNativeAdViewSignals", zzbpt.zzs);
        }
        zza.zzaf("/getNativeClickMeta", zzbpt.zzt);
        zza.zzP().zzz(new zzcoa() { // from class: com.google.android.gms.internal.ads.zzdrk
            @Override // com.google.android.gms.internal.ads.zzcoa
            public final void zza(boolean z) {
                zzchg zzchgVar = zzchg.this;
                if (z) {
                    zzchgVar.zzb();
                } else {
                    zzchgVar.zze(new zzekr(1, "Image Web View failed to load."));
                }
            }
        });
        zza.zzad(str, str2, null);
        return zza2;
    }

    final /* synthetic */ zzfzp zzc(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcmp zza = zzcnb.zza(this.zza, zzcoe.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null);
        final zzchg zza2 = zzchg.zza(zza);
        zza.zzP().zzz(new zzcoa() { // from class: com.google.android.gms.internal.ads.zzdrg
            @Override // com.google.android.gms.internal.ads.zzcoa
            public final void zza(boolean z) {
                zzchg.this.zzb();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzej)).booleanValue()) {
            zza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zza.loadData(str, "text/html", "UTF-8");
        }
        return zza2;
    }

    public final zzfzp zzd(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzfzg.zzi(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzm(optJSONObject.optBoolean("require"), zzfzg.zzm(zzo(optJSONArray, false, true), new zzfsm() { // from class: com.google.android.gms.internal.ads.zzdrh
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                return zzdrq.this.zza(optJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final zzfzp zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final zzfzp zzf(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        zzbls zzblsVar = this.zzh;
        return zzo(optJSONArray, zzblsVar.zzb, zzblsVar.zzd);
    }

    public final zzfzp zzg(JSONObject jSONObject, String str, final zzfdk zzfdkVar, final zzfdn zzfdnVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzik)).booleanValue()) {
            return zzfzg.zzi(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfzg.zzi(null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zzfzg.zzi(null);
        }
        final String optString = optJSONObject.optString("base_url");
        final String optString2 = optJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzq zzk = zzk(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(optString2)) {
            return zzfzg.zzi(null);
        }
        final zzfzp zzn = zzfzg.zzn(zzfzg.zzi(null), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzdri
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzdrq.this.zzb(zzk, zzfdkVar, zzfdnVar, optString, optString2, obj);
            }
        }, zzchc.zze);
        return zzfzg.zzn(zzn, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzdrj
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                zzfzp zzfzpVar = zzfzp.this;
                if (((zzcmp) obj) != null) {
                    return zzfzpVar;
                }
                throw new zzekr(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzchc.zzf);
    }

    public final zzfzp zzh(JSONObject jSONObject, zzfdk zzfdkVar, zzfdn zzfdnVar) {
        zzfzp zza;
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbu.zzg(jSONObject, "html_containers", "instream");
        if (zzg != null) {
            return zzp(zzg, zzfdkVar, zzfdnVar);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            return zzfzg.zzi(null);
        }
        String optString = optJSONObject.optString("vast_xml");
        boolean z = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzij)).booleanValue() && optJSONObject.has("html")) {
            z = true;
        }
        if (TextUtils.isEmpty(optString)) {
            if (!z) {
                com.google.android.gms.ads.internal.util.zze.zzj("Required field 'vast_xml' or 'html' is missing");
                return zzfzg.zzi(null);
            }
        } else if (!z) {
            zza = this.zzi.zza(optJSONObject);
            return zzl(zzfzg.zzo(zza, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcU)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        zza = zzp(optJSONObject, zzfdkVar, zzfdnVar);
        return zzl(zzfzg.zzo(zza, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcU)).intValue(), TimeUnit.SECONDS, this.zzk), null);
    }

    private final com.google.android.gms.ads.internal.client.zzq zzk(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return com.google.android.gms.ads.internal.client.zzq.zzc();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzq(this.zza, new AdSize(i, i2));
    }
}
