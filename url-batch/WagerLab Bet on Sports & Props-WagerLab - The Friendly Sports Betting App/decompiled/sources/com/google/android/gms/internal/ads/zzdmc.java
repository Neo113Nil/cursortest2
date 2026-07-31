package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdmc {
    private final Context zza;
    private final zzdli zzb;
    private final zzauu zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbbh zzf;
    private final Executor zzg;
    private final zzbfl zzh;
    private final zzdmu zzi;
    private final zzdpi zzj;
    private final ScheduledExecutorService zzk;
    private final zzdod zzl;
    private final zzdsm zzm;
    private final zzfjv zzn;
    private final zzecn zzo;
    private final zzecy zzp;
    private final zzfdg zzq;
    private final zzdsg zzr;
    private final zzdtp zzs;

    public zzdmc(Context context, zzdli zzdliVar, zzauu zzauuVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbbh zzbbhVar, Executor executor, zzfdc zzfdcVar, zzdmu zzdmuVar, zzdpi zzdpiVar, ScheduledExecutorService scheduledExecutorService, zzdsm zzdsmVar, zzfjv zzfjvVar, zzecn zzecnVar, zzdod zzdodVar, zzecy zzecyVar, zzfdg zzfdgVar, zzdsg zzdsgVar, zzdtp zzdtpVar) {
        this.zza = context;
        this.zzb = zzdliVar;
        this.zzc = zzauuVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbbhVar;
        this.zzg = executor;
        this.zzh = zzfdcVar.zzj;
        this.zzi = zzdmuVar;
        this.zzj = zzdpiVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdsmVar;
        this.zzn = zzfjvVar;
        this.zzo = zzecnVar;
        this.zzl = zzdodVar;
        this.zzp = zzecyVar;
        this.zzq = zzfdgVar;
        this.zzr = zzdsgVar;
        this.zzs = zzdtpVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzez zzk(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzt(optJSONObject);
    }

    public static final List zzl(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzgjz.zzi();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzgjz.zzi();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzez zzt = zzt(optJSONArray.optJSONObject(i));
            if (zzt != null) {
                arrayList.add(zzt);
            }
        }
        return zzgjz.zzq(arrayList);
    }

    private final ListenableFuture zzm(JSONArray jSONArray, boolean z, boolean z2, zzdru zzdruVar) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgot.zza(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcy)).booleanValue()) {
            this.zzr.zze().putLong(zzdruVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z, null));
        }
        return zzgot.zzk(zzgot.zzl(arrayList), zzdmb.zza, this.zzg);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ListenableFuture zzn(JSONObject jSONObject, boolean z, zzdru zzdruVar) {
        HashMap hashMap;
        final String optString;
        int i;
        double d;
        if (jSONObject == null) {
            return zzgot.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzes)).booleanValue()) {
            if (jSONObject.has((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzet))) {
                HashMap hashMap2 = new HashMap();
                for (String str : ((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeu)).split(f.f598a)) {
                    try {
                        hashMap2.put(str, jSONObject.getString(str));
                    } catch (JSONException unused) {
                    }
                }
                hashMap = hashMap2;
                optString = jSONObject.optString("url");
                if (!TextUtils.isEmpty(optString) && hashMap == null) {
                    return zzgot.zza(null);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcy)).booleanValue() && zzdruVar != null) {
                    this.zzr.zze().putLong(zzdruVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                }
                final double optDouble = jSONObject.optDouble("scale", 1.0d);
                boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
                final int optInt = jSONObject.optInt("width", -1);
                final int optInt2 = jSONObject.optInt("height", -1);
                if (!z) {
                    i = optInt;
                    d = optDouble;
                } else {
                    if (hashMap == null) {
                        return zzr(jSONObject.optBoolean("require"), zzgot.zzk(this.zzb.zza(optString, optDouble, optBoolean), new zzggr() { // from class: com.google.android.gms.internal.ads.zzdlr
                            @Override // com.google.android.gms.internal.ads.zzggr
                            public final /* synthetic */ Object apply(Object obj) {
                                return new zzbfh(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2, null);
                            }
                        }, this.zzg), null);
                    }
                    d = optDouble;
                    i = optInt;
                }
                return zzgot.zza(new zzbfh(null, Uri.parse(optString), d, i, optInt2, hashMap));
            }
        }
        hashMap = null;
        optString = jSONObject.optString("url");
        if (!TextUtils.isEmpty(optString)) {
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcy)).booleanValue()) {
            this.zzr.zze().putLong(zzdruVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final double optDouble2 = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean2 = jSONObject.optBoolean("is_transparent", true);
        final int optInt3 = jSONObject.optInt("width", -1);
        final int optInt22 = jSONObject.optInt("height", -1);
        if (!z) {
        }
        return zzgot.zza(new zzbfh(null, Uri.parse(optString), d, i, optInt22, hashMap));
    }

    private static Integer zzo(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final ListenableFuture zzp(JSONObject jSONObject, zzfcj zzfcjVar, zzfcm zzfcmVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxf zzbxfVar) {
        final ListenableFuture zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfcjVar, zzfcmVar, zzs(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)), zzbVar, zzbxfVar);
        return zzgot.zzj(zzb, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdlw
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                zzcek zzcekVar = (zzcek) obj;
                if (zzcekVar == null || zzcekVar.zzh() == null) {
                    throw new zzeho(1, "Retrieve video view in html5 ad response failed.");
                }
                return ListenableFuture.this;
            }
        }, zzbzh.zzg);
    }

    private static ListenableFuture zzq(ListenableFuture listenableFuture, Object obj) {
        final Object obj2 = null;
        return zzgot.zzh(listenableFuture, Exception.class, new zzgob(obj2) { // from class: com.google.android.gms.internal.ads.zzdlx
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzgot.zza(null);
            }
        }, zzbzh.zzg);
    }

    private static ListenableFuture zzr(boolean z, final ListenableFuture listenableFuture, Object obj) {
        return z ? zzgot.zzj(listenableFuture, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdly
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj2) {
                return obj2 != null ? ListenableFuture.this : zzgot.zzc(new zzeho(1, "Retrieve required value in native ad response failed."));
            }
        }, zzbzh.zzg) : zzq(listenableFuture, null);
    }

    private static final com.google.android.gms.ads.internal.client.zzez zzt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzez(optString, optString2);
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str, zzdru zzdruVar) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb, zzdruVar);
    }

    public final ListenableFuture zzb(JSONObject jSONObject, String str, zzdru zzdruVar) {
        zzbfl zzbflVar = this.zzh;
        return zzm(jSONObject.optJSONArray("images"), zzbflVar.zzb, zzbflVar.zzd, zzdruVar);
    }

    public final ListenableFuture zzc(JSONObject jSONObject, String str, final zzfcj zzfcjVar, final zzfcm zzfcmVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzbxf zzbxfVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkP)).booleanValue()) {
            return zzgot.zza(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzgot.zza(null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zzgot.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzes)).booleanValue()) {
            if (optJSONObject.has((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzet))) {
                return zzgot.zza(null);
            }
        }
        final String optString = optJSONObject.optString("base_url");
        final String optString2 = optJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzr zzs = zzs(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(optString2)) {
            return zzgot.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcy)).booleanValue()) {
            this.zzr.zze().putLong(zzdru.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final ListenableFuture zzj = zzgot.zzj(zzgot.zza(null), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdls
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzdmc.this.zzh(zzs, zzfcjVar, zzfcmVar, zzbVar, zzbxfVar, optString, optString2, obj);
            }
        }, zzbzh.zzf);
        return zzgot.zzj(zzj, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdlt
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                if (((zzcek) obj) != null) {
                    return ListenableFuture.this;
                }
                throw new zzeho(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzbzh.zzg);
    }

    public final ListenableFuture zzd(JSONObject jSONObject, String str, zzdru zzdruVar) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzgot.zza(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzr(optJSONObject.optBoolean("require"), zzgot.zzk(zzm(optJSONArray, false, true, zzdruVar), new zzggr() { // from class: com.google.android.gms.internal.ads.zzdlu
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return zzdmc.this.zzi(optJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final ListenableFuture zze(JSONObject jSONObject, final com.google.android.gms.ads.internal.zzb zzbVar, final zzbxf zzbxfVar) {
        if (!jSONObject.optBoolean("enable_omid")) {
            return zzgot.zza(null);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        if (optJSONObject == null) {
            return zzgot.zza(null);
        }
        final String optString = optJSONObject.optString("omid_html");
        if (TextUtils.isEmpty(optString)) {
            return zzgot.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcy)).booleanValue()) {
            this.zzr.zze().putLong(zzdru.NATIVE_ASSETS_LOADING_OMID_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzgot.zzj(zzgot.zza(null), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdlv
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzdmc.this.zzj(optString, zzbxfVar, zzbVar, obj);
            }
        }, zzbzh.zzf);
    }

    public final ListenableFuture zzf(ListenableFuture listenableFuture) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcy)).booleanValue()) {
            this.zzr.zze().putLong(zzdru.NATIVE_ASSETS_LOADING_MEDIA_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzbzm zzbzmVar = new zzbzm();
        zzgot.zzq(listenableFuture, new zzdlq(this, zzbzmVar), zzbzh.zzf);
        return zzbzmVar;
    }

    public final ListenableFuture zzg(JSONObject jSONObject, zzfcj zzfcjVar, zzfcm zzfcmVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxf zzbxfVar) {
        ListenableFuture zza;
        zzdmc zzdmcVar;
        boolean z = false;
        JSONObject zzi = com.google.android.gms.ads.internal.util.zzbp.zzi(jSONObject, "html_containers", "instream");
        if (zzi != null) {
            return zzp(zzi, zzfcjVar, zzfcmVar, zzbVar, zzbxfVar);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            return zzgot.zza(null);
        }
        String optString = optJSONObject.optString("vast_xml");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkO)).booleanValue() && optJSONObject.has("html")) {
            z = true;
        }
        if (TextUtils.isEmpty(optString)) {
            if (!z) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Required field 'vast_xml' or 'html' is missing");
                return zzgot.zza(null);
            }
        } else if (!z) {
            zza = this.zzi.zza(optJSONObject, zzbVar, zzbxfVar);
            zzdmcVar = this;
            return zzq(zzgot.zzi(zza, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzek)).intValue(), TimeUnit.SECONDS, zzdmcVar.zzk), null);
        }
        zzdmcVar = this;
        zza = zzdmcVar.zzp(optJSONObject, zzfcjVar, zzfcmVar, zzbVar, zzbxfVar);
        return zzq(zzgot.zzi(zza, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzek)).intValue(), TimeUnit.SECONDS, zzdmcVar.zzk), null);
    }

    final /* synthetic */ ListenableFuture zzh(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfcj zzfcjVar, zzfcm zzfcmVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxf zzbxfVar, String str, String str2, Object obj) {
        zzdtp zzdtpVar;
        zzcek zza = this.zzj.zza(zzrVar, zzfcjVar, zzfcmVar);
        final zzbzl zza2 = zzbzl.zza(zza);
        zzdoa zza3 = this.zzl.zza();
        zzcgi zzP = zza.zzP();
        zzbbz zzbbzVar = zzbci.zzoq;
        zzP.zzZ(zza3, zza3, zza3, zza3, zza3, false, null, !((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(this.zza, null, null) : zzbVar, null, true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue() ? null : zzbxfVar, this.zzo, this.zzn, this.zzm, null, zza3, null, null, null, null, null, null);
        zza.zzab("/getNativeAdViewSignals", zzbjk.zzs);
        zza.zzab("/getNativeClickMeta", zzbjk.zzt);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzio)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziq)).booleanValue() && (zzdtpVar = this.zzs) != null) {
                zza.zzab("/onDeviceStorageEvent", new zzbjt(zzdtpVar));
            }
        }
        zza.zzP().zzQ(true);
        zza.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzdma
            @Override // com.google.android.gms.internal.ads.zzcgg
            public final /* synthetic */ void zza(boolean z, int i, String str3, String str4) {
                zzbzl zzbzlVar = zzbzl.this;
                if (z) {
                    zzbzlVar.zzb();
                    return;
                }
                int length = String.valueOf(i).length();
                StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb.append("Image Web View failed to load. Error code: ");
                sb.append(i);
                sb.append(", Description: ");
                sb.append(str3);
                sb.append(", Failing URL: ");
                sb.append(str4);
                zzbzlVar.zzd(new zzeho(1, sb.toString()));
            }
        });
        zza.zzau(str, str2, null);
        return zza2;
    }

    final /* synthetic */ zzbfe zzi(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzo = zzo(jSONObject, "bg_color");
        Integer zzo2 = zzo(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbfe(optString, list, zzo, zzo2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.zzh.zze, optBoolean);
    }

    final /* synthetic */ ListenableFuture zzj(String str, zzbxf zzbxfVar, com.google.android.gms.ads.internal.zzb zzbVar, Object obj) {
        com.google.android.gms.ads.internal.zzt.zzd();
        Context context = this.zza;
        zzecy zzecyVar = this.zzp;
        zzcek zza = zzcfa.zza(context, zzcgt.zzb(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, zzecyVar, this.zzq, this.zzm);
        final zzbzl zza2 = zzbzl.zza(zza);
        zza.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzdlz
            @Override // com.google.android.gms.internal.ads.zzcgg
            public final /* synthetic */ void zza(boolean z, int i, String str2, String str3) {
                zzbzl.this.zzb();
            }
        });
        zza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoq)).booleanValue()) {
            if (zzbxfVar != null) {
                zza.zzP().zzj(zzbxfVar);
            }
            zza.zzP().zzi(zzbVar);
        }
        return zza2;
    }

    private final com.google.android.gms.ads.internal.client.zzr zzs(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return com.google.android.gms.ads.internal.client.zzr.zzb();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzr(this.zza, new AdSize(i, i2));
    }
}
