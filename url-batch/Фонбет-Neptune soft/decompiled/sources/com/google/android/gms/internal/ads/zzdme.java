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
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdme {
    private final Context zza;
    private final zzdln zzb;
    private final zzauo zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbav zzf;
    private final Executor zzg;
    private final zzbes zzh;
    private final zzdmw zzi;
    private final zzdpl zzj;
    private final ScheduledExecutorService zzk;
    private final zzdog zzl;
    private final zzdsk zzm;
    private final zzfll zzn;
    private final zzedh zzo;
    private final zzeds zzp;
    private final zzffk zzq;

    public zzdme(Context context, zzdln zzdlnVar, zzauo zzauoVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbav zzbavVar, Executor executor, zzffg zzffgVar, zzdmw zzdmwVar, zzdpl zzdplVar, ScheduledExecutorService scheduledExecutorService, zzdsk zzdskVar, zzfll zzfllVar, zzedh zzedhVar, zzdog zzdogVar, zzeds zzedsVar, zzffk zzffkVar) {
        this.zza = context;
        this.zzb = zzdlnVar;
        this.zzc = zzauoVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbavVar;
        this.zzg = executor;
        this.zzh = zzffgVar.zzi;
        this.zzi = zzdmwVar;
        this.zzj = zzdplVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdskVar;
        this.zzn = zzfllVar;
        this.zzo = zzedhVar;
        this.zzl = zzdogVar;
        this.zzp = zzedsVar;
        this.zzq = zzffkVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzel zzi(JSONObject jSONObject) {
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
            return zzfxr.zzm();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfxr.zzm();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzel zzr = zzr(optJSONArray.optJSONObject(i));
            if (zzr != null) {
                arrayList.add(zzr);
            }
        }
        return zzfxr.zzk(arrayList);
    }

    private static ListenableFuture zzl(ListenableFuture listenableFuture, Object obj) {
        final Object obj2 = null;
        return zzgcj.zzf(listenableFuture, Exception.class, new zzgbq(obj2) { // from class: com.google.android.gms.internal.ads.zzdmc
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzgcj.zzh(null);
            }
        }, zzbzo.zzf);
    }

    private static ListenableFuture zzm(boolean z, final ListenableFuture listenableFuture, Object obj) {
        return z ? zzgcj.zzn(listenableFuture, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdmd
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj2) {
                return obj2 != null ? ListenableFuture.this : zzgcj.zzg(new zzeir(1, "Retrieve required value in native ad response failed."));
            }
        }, zzbzo.zzf) : zzl(listenableFuture, null);
    }

    private final ListenableFuture zzn(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzgcj.zzh(null);
        }
        final String optString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(optString)) {
            return zzgcj.zzh(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzgcj.zzh(new zzbeq(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzgcj.zzm(this.zzb.zzb(optString, optDouble, optBoolean), new zzful() { // from class: com.google.android.gms.internal.ads.zzdlu
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                return new zzbeq(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2);
            }
        }, this.zzg), null);
    }

    private final ListenableFuture zzo(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgcj.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z));
        }
        return zzgcj.zzm(zzgcj.zzd(arrayList), new zzful() { // from class: com.google.android.gms.internal.ads.zzdlz
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzbeq zzbeqVar : (List) obj) {
                    if (zzbeqVar != null) {
                        arrayList2.add(zzbeqVar);
                    }
                }
                return arrayList2;
            }
        }, this.zzg);
    }

    private final ListenableFuture zzp(JSONObject jSONObject, zzfel zzfelVar, zzfeo zzfeoVar) {
        final ListenableFuture zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfelVar, zzfeoVar, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzgcj.zzn(zzb, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdlv
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                zzcej zzcejVar = (zzcej) obj;
                if (zzcejVar == null || zzcejVar.zzq() == null) {
                    throw new zzeir(1, "Retrieve video view in html5 ad response failed.");
                }
                return ListenableFuture.this;
            }
        }, zzbzo.zzf);
    }

    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final com.google.android.gms.ads.internal.client.zzel zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzel(optString, optString2);
    }

    final /* synthetic */ zzben zza(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzq = zzq(jSONObject, "bg_color");
        Integer zzq2 = zzq(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzben(optString, list, zzq, zzq2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.zzh.zze, optBoolean);
    }

    final /* synthetic */ ListenableFuture zzb(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfel zzfelVar, zzfeo zzfeoVar, String str, String str2, Object obj) throws Exception {
        zzcej zza = this.zzj.zza(zzqVar, zzfelVar, zzfeoVar);
        final zzbzs zza2 = zzbzs.zza(zza);
        zzdod zzb = this.zzl.zzb();
        zza.zzN().zzR(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zza, null, null), null, null, this.zzo, this.zzn, this.zzm, null, zzb, null, null, null, null);
        zza.zzag("/getNativeAdViewSignals", zzbiw.zzs);
        zza.zzag("/getNativeClickMeta", zzbiw.zzt);
        zza.zzN().zzB(new zzcfz() { // from class: com.google.android.gms.internal.ads.zzdly
            @Override // com.google.android.gms.internal.ads.zzcfz
            public final void zza(boolean z, int i, String str3, String str4) {
                zzbzs zzbzsVar = zzbzs.this;
                if (z) {
                    zzbzsVar.zzb();
                    return;
                }
                zzbzsVar.zzd(new zzeir(1, "Image Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zza.zzae(str, str2, null);
        return zza2;
    }

    final /* synthetic */ ListenableFuture zzc(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzu.zzz();
        zzcej zza = zzcew.zza(this.zza, zzcgd.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, this.zzp, this.zzq);
        final zzbzs zza2 = zzbzs.zza(zza);
        zza.zzN().zzB(new zzcfz() { // from class: com.google.android.gms.internal.ads.zzdma
            @Override // com.google.android.gms.internal.ads.zzcfz
            public final void zza(boolean z, int i, String str2, String str3) {
                zzbzs.this.zzb();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeE)).booleanValue()) {
            zza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zza.loadData(str, "text/html", "UTF-8");
        }
        return zza2;
    }

    public final ListenableFuture zzd(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzgcj.zzh(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzm(optJSONObject.optBoolean("require"), zzgcj.zzm(zzo(optJSONArray, false, true), new zzful() { // from class: com.google.android.gms.internal.ads.zzdmb
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                return zzdme.this.zza(optJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final ListenableFuture zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final ListenableFuture zzf(JSONObject jSONObject, String str) {
        zzbes zzbesVar = this.zzh;
        return zzo(jSONObject.optJSONArray("images"), zzbesVar.zzb, zzbesVar.zzd);
    }

    public final ListenableFuture zzg(JSONObject jSONObject, String str, final zzfel zzfelVar, final zzfeo zzfeoVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjf)).booleanValue()) {
            return zzgcj.zzh(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzgcj.zzh(null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zzgcj.zzh(null);
        }
        final String optString = optJSONObject.optString("base_url");
        final String optString2 = optJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzq zzk = zzk(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(optString2)) {
            return zzgcj.zzh(null);
        }
        final ListenableFuture zzn = zzgcj.zzn(zzgcj.zzh(null), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdlw
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                return zzdme.this.zzb(zzk, zzfelVar, zzfeoVar, optString, optString2, obj);
            }
        }, zzbzo.zze);
        return zzgcj.zzn(zzn, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdlx
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                if (((zzcej) obj) != null) {
                    return ListenableFuture.this;
                }
                throw new zzeir(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzbzo.zzf);
    }

    public final ListenableFuture zzh(JSONObject jSONObject, zzfel zzfelVar, zzfeo zzfeoVar) {
        ListenableFuture zza;
        JSONObject zzh = com.google.android.gms.ads.internal.util.zzbs.zzh(jSONObject, "html_containers", "instream");
        if (zzh != null) {
            return zzp(zzh, zzfelVar, zzfeoVar);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            return zzgcj.zzh(null);
        }
        String optString = optJSONObject.optString("vast_xml");
        boolean z = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzje)).booleanValue() && optJSONObject.has("html")) {
            z = true;
        }
        if (TextUtils.isEmpty(optString)) {
            if (!z) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Required field 'vast_xml' or 'html' is missing");
                return zzgcj.zzh(null);
            }
        } else if (!z) {
            zza = this.zzi.zza(optJSONObject);
            return zzl(zzgcj.zzo(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdt)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        zza = zzp(optJSONObject, zzfelVar, zzfeoVar);
        return zzl(zzgcj.zzo(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdt)).intValue(), TimeUnit.SECONDS, this.zzk), null);
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
