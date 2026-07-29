package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbok {
    public static final zzbol zza = new zzbol() { // from class: com.google.android.gms.internal.ads.zzbnw
        @Override // com.google.android.gms.internal.ads.zzbol
        public final void zza(Object obj, Map map) {
            zzcmj zzcmjVar = (zzcmj) obj;
            zzbol zzbolVar = zzbok.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.zze.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = zzcmjVar.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                boolean z = true;
                if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                hashMap.put(str2, valueOf);
                com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str2 + ";" + valueOf);
            }
            ((zzbrc) zzcmjVar).zzd("openableURLs", hashMap);
        }
    };
    public static final zzbol zzb = new zzbol() { // from class: com.google.android.gms.internal.ads.zzbnx
        @Override // com.google.android.gms.internal.ads.zzbol
        public final void zza(Object obj, Map map) {
            zzcmj zzcmjVar = (zzcmj) obj;
            zzbol zzbolVar = zzbok.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgP)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.zze.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            Boolean valueOf = Boolean.valueOf(zzcmjVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            hashMap.put(str, valueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + valueOf);
            ((zzbrc) zzcmjVar).zzd("openableApp", hashMap);
        }
    };
    public static final zzbol zzc = new zzbol() { // from class: com.google.android.gms.internal.ads.zzbnp
        @Override // com.google.android.gms.internal.ads.zzbol
        public final void zza(Object obj, Map map) {
            zzbok.zzc((zzcmj) obj, map);
        }
    };
    public static final zzbol zzd = new zzboc();
    public static final zzbol zze = new zzbod();
    public static final zzbol zzf = new zzbol() { // from class: com.google.android.gms.internal.ads.zzbnv
        @Override // com.google.android.gms.internal.ads.zzbol
        public final void zza(Object obj, Map map) {
            zzcmj zzcmjVar = (zzcmj) obj;
            zzbol zzbolVar = zzbok.zza;
            String str = (String) map.get("u");
            if (str == null) {
                com.google.android.gms.ads.internal.util.zze.zzj("URL missing from httpTrack GMSG.");
            } else {
                new com.google.android.gms.ads.internal.util.zzby(zzcmjVar.getContext(), ((zzcmr) zzcmjVar).zzp().zza, str).zzb();
            }
        }
    };
    public static final zzbol zzg = new zzboe();
    public static final zzbol zzh = new zzbof();
    public static final zzbol zzi = new zzbol() { // from class: com.google.android.gms.internal.ads.zzbnu
        @Override // com.google.android.gms.internal.ads.zzbol
        public final void zza(Object obj, Map map) {
            zzcmq zzcmqVar = (zzcmq) obj;
            zzbol zzbolVar = zzbok.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                zzaoc zzK = zzcmqVar.zzK();
                if (zzK != null) {
                    zzK.zzc().zzl(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.zze.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbol zzj = new zzbog();
    public static final zzbol zzk = new zzboh();
    public static final zzbol zzl = new zzcji();
    public static final zzbol zzm = new zzcjj();
    public static final zzbol zzn = new zzbno();
    public static final zzboz zzo = new zzboz();
    public static final zzbol zzp = new zzboi();
    public static final zzbol zzq = new zzboj();
    public static final zzbol zzr = new zzbny();
    public static final zzbol zzs = new zzbnz();
    public static final zzbol zzt = new zzboa();

    public static zzbol zza(final zzdjf zzdjfVar) {
        return new zzbol() { // from class: com.google.android.gms.internal.ads.zzbnt
            @Override // com.google.android.gms.internal.ads.zzbol
            public final void zza(Object obj, Map map) {
                zzcli zzcliVar = (zzcli) obj;
                zzbok.zzd(map, zzdjf.this);
                String str = (String) map.get("u");
                if (str == null) {
                    com.google.android.gms.ads.internal.util.zze.zzj("URL missing from click GMSG.");
                } else {
                    zzfva.zzr(zzbok.zzb(zzcliVar, str), new zzbob(zzcliVar), zzcfv.zza);
                }
            }
        };
    }

    public static zzfvj zzb(zzcli zzcliVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzaoc zzK = zzcliVar.zzK();
            if (zzK != null && zzK.zzf(parse)) {
                parse = zzK.zza(parse, zzcliVar.getContext(), zzcliVar.zzH(), zzcliVar.zzk());
            }
        } catch (zzaod unused) {
            com.google.android.gms.ads.internal.util.zze.zzj("Unable to append parameter to URL: ".concat(str));
        }
        final String zzb2 = zzcdp.zzb(parse, zzcliVar.getContext());
        long longValue = ((Long) zzbjn.zze.zze()).longValue();
        return (longValue <= 0 || longValue > 221310600) ? zzfva.zzi(zzb2) : zzfva.zzf(zzfva.zzm(zzfva.zzf(zzfur.zzv(zzcliVar.zzT()), Throwable.class, new zzfoi() { // from class: com.google.android.gms.internal.ads.zzbnq
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbol zzbolVar = zzbok.zza;
                if (!((Boolean) zzbjn.zzk.zze()).booleanValue()) {
                    return "failure_click_attok";
                }
                com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        }, zzcfv.zzf), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzbnr
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                String str2 = zzb2;
                String str3 = (String) obj;
                zzbol zzbolVar = zzbok.zza;
                if (str3 != null) {
                    if (((Boolean) zzbjn.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str2).getHost();
                        for (int i = 0; i < 3; i++) {
                            if (!host.endsWith(strArr[i])) {
                            }
                        }
                    }
                    String str4 = (String) zzbjn.zza.zze();
                    String str5 = (String) zzbjn.zzb.zze();
                    if (!TextUtils.isEmpty(str4)) {
                        str2 = str2.replace(str4, str3);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        Uri parse2 = Uri.parse(str2);
                        if (TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                            return parse2.buildUpon().appendQueryParameter(str5, str3).toString();
                        }
                    }
                }
                return str2;
            }
        }, zzcfv.zzf), Throwable.class, new zzfoi() { // from class: com.google.android.gms.internal.ads.zzbns
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                String str2 = zzb2;
                Throwable th = (Throwable) obj;
                zzbol zzbolVar = zzbok.zza;
                if (((Boolean) zzbjn.zzk.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "prepareClickUrl.attestation2");
                }
                return str2;
            }
        }, zzcfv.zzf);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:10|11|12|(12:50|51|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:
    
        com.google.android.gms.ads.internal.util.zze.zzh("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ca, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzo().zzt(r0, r8.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void zzc(zzcmj zzcmjVar, Map map) {
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String optString5;
        String optString6;
        String optString7;
        ResolveInfo resolveInfo;
        Intent parseUri;
        PackageManager packageManager = zzcmjVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        optString = jSONObject2.optString("id");
                        optString2 = jSONObject2.optString("u");
                        optString3 = jSONObject2.optString("i");
                        optString4 = jSONObject2.optString("m");
                        optString5 = jSONObject2.optString("p");
                        optString6 = jSONObject2.optString("c");
                        optString7 = jSONObject2.optString("intent_url");
                        resolveInfo = null;
                    } catch (JSONException e) {
                        com.google.android.gms.ads.internal.util.zze.zzh("Error parsing the intent data.", e);
                    }
                    if (!TextUtils.isEmpty(optString7)) {
                        try {
                            parseUri = Intent.parseUri(optString7, 0);
                        } catch (URISyntaxException e2) {
                            com.google.android.gms.ads.internal.util.zze.zzh("Error parsing the url: ".concat(String.valueOf(optString7)), e2);
                        }
                        if (parseUri == null) {
                            parseUri = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                parseUri.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                parseUri.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                parseUri.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                parseUri.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    parseUri.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        Intent intent = parseUri;
                        resolveInfo = packageManager.resolveActivity(intent, 65536);
                        jSONObject.put(optString, resolveInfo != null);
                    }
                    parseUri = null;
                    if (parseUri == null) {
                    }
                    Intent intent2 = parseUri;
                    resolveInfo = packageManager.resolveActivity(intent2, 65536);
                    jSONObject.put(optString, resolveInfo != null);
                }
                ((zzbrc) zzcmjVar).zze("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbrc) zzcmjVar).zze("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbrc) zzcmjVar).zze("openableIntents", new JSONObject());
        }
    }

    public static void zzd(Map map, zzdjf zzdjfVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzie)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdjfVar != null) {
            zzdjfVar.zzq();
        }
    }
}
