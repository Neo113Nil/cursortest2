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

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbpt {
    public static final zzbpu zza = new zzbpu() { // from class: com.google.android.gms.internal.ads.zzbpa
        @Override // com.google.android.gms.internal.ads.zzbpu
        public final void zza(Object obj, Map map) {
            zzcnq zzcnqVar = (zzcnq) obj;
            zzbpu zzbpuVar = zzbpt.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.zze.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = zzcnqVar.getContext().getPackageManager();
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
            ((zzbsn) zzcnqVar).zzd("openableURLs", hashMap);
        }
    };
    public static final zzbpu zzb = new zzbpu() { // from class: com.google.android.gms.internal.ads.zzbpb
        @Override // com.google.android.gms.internal.ads.zzbpu
        public final void zza(Object obj, Map map) {
            zzcnq zzcnqVar = (zzcnq) obj;
            zzbpu zzbpuVar = zzbpt.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.zze.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            Boolean valueOf = Boolean.valueOf(zzcnqVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            hashMap.put(str, valueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + valueOf);
            ((zzbsn) zzcnqVar).zzd("openableApp", hashMap);
        }
    };
    public static final zzbpu zzc = new zzbpu() { // from class: com.google.android.gms.internal.ads.zzbot
        @Override // com.google.android.gms.internal.ads.zzbpu
        public final void zza(Object obj, Map map) {
            zzbpt.zzc((zzcnq) obj, map);
        }
    };
    public static final zzbpu zzd = new zzbpl();
    public static final zzbpu zze = new zzbpm();
    public static final zzbpu zzf = new zzbpu() { // from class: com.google.android.gms.internal.ads.zzboz
        @Override // com.google.android.gms.internal.ads.zzbpu
        public final void zza(Object obj, Map map) {
            zzcnq zzcnqVar = (zzcnq) obj;
            zzbpu zzbpuVar = zzbpt.zza;
            String str = (String) map.get("u");
            if (str == null) {
                com.google.android.gms.ads.internal.util.zze.zzj("URL missing from httpTrack GMSG.");
            } else {
                new com.google.android.gms.ads.internal.util.zzby(zzcnqVar.getContext(), ((zzcny) zzcnqVar).zzp().zza, str).zzb();
            }
        }
    };
    public static final zzbpu zzg = new zzbpn();
    public static final zzbpu zzh = new zzbpo();
    public static final zzbpu zzi = new zzbpu() { // from class: com.google.android.gms.internal.ads.zzboy
        @Override // com.google.android.gms.internal.ads.zzbpu
        public final void zza(Object obj, Map map) {
            zzcnx zzcnxVar = (zzcnx) obj;
            zzbpu zzbpuVar = zzbpt.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                zzape zzK = zzcnxVar.zzK();
                if (zzK != null) {
                    zzK.zzc().zzl(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.zze.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbpu zzj = new zzbpp();
    public static final zzbpu zzk = new zzbpq();
    public static final zzbpu zzl = new zzckp();
    public static final zzbpu zzm = new zzckq();
    public static final zzbpu zzn = new zzbos();
    public static final zzbqj zzo = new zzbqj();
    public static final zzbpu zzp = new zzbpr();
    public static final zzbpu zzq = new zzbps();
    public static final zzbpu zzr = new zzbpc();
    public static final zzbpu zzs = new zzbpd();
    public static final zzbpu zzt = new zzbpe();
    public static final zzbpu zzu = new zzbpf();
    public static final zzbpu zzv = new zzbpg();
    public static final zzbpu zzw = new zzbph();
    public static final zzbpu zzx = new zzbpi();
    public static final zzbpu zzy = new zzbpj();

    public static zzbpu zza(final zzdkn zzdknVar) {
        return new zzbpu() { // from class: com.google.android.gms.internal.ads.zzbox
            @Override // com.google.android.gms.internal.ads.zzbpu
            public final void zza(Object obj, Map map) {
                zzcmp zzcmpVar = (zzcmp) obj;
                zzbpt.zzd(map, zzdkn.this);
                String str = (String) map.get("u");
                if (str == null) {
                    com.google.android.gms.ads.internal.util.zze.zzj("URL missing from click GMSG.");
                } else {
                    zzfzg.zzr(zzbpt.zzb(zzcmpVar, str), new zzbpk(zzcmpVar), zzchc.zza);
                }
            }
        };
    }

    public static zzfzp zzb(zzcmp zzcmpVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzape zzK = zzcmpVar.zzK();
            if (zzK != null && zzK.zzf(parse)) {
                parse = zzK.zza(parse, zzcmpVar.getContext(), zzcmpVar.zzH(), zzcmpVar.zzk());
            }
        } catch (zzapf unused) {
            com.google.android.gms.ads.internal.util.zze.zzj("Unable to append parameter to URL: ".concat(str));
        }
        final String zzb2 = zzcew.zzb(parse, zzcmpVar.getContext());
        long longValue = ((Long) zzbkr.zze.zze()).longValue();
        return (longValue <= 0 || longValue > 223104600) ? zzfzg.zzi(zzb2) : zzfzg.zzf(zzfzg.zzm(zzfzg.zzf(zzfyx.zzv(zzcmpVar.zzT()), Throwable.class, new zzfsm() { // from class: com.google.android.gms.internal.ads.zzbou
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbpu zzbpuVar = zzbpt.zza;
                if (!((Boolean) zzbkr.zzk.zze()).booleanValue()) {
                    return "failure_click_attok";
                }
                com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        }, zzchc.zzf), new zzfsm() { // from class: com.google.android.gms.internal.ads.zzbov
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                String str2 = zzb2;
                String str3 = (String) obj;
                zzbpu zzbpuVar = zzbpt.zza;
                if (str3 != null) {
                    if (((Boolean) zzbkr.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str2).getHost();
                        for (int i = 0; i < 3; i++) {
                            if (!host.endsWith(strArr[i])) {
                            }
                        }
                    }
                    String str4 = (String) zzbkr.zza.zze();
                    String str5 = (String) zzbkr.zzb.zze();
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
        }, zzchc.zzf), Throwable.class, new zzfsm() { // from class: com.google.android.gms.internal.ads.zzbow
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                String str2 = zzb2;
                Throwable th = (Throwable) obj;
                zzbpu zzbpuVar = zzbpt.zza;
                if (((Boolean) zzbkr.zzk.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "prepareClickUrl.attestation2");
                }
                return str2;
            }
        }, zzchc.zzf);
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
    static /* synthetic */ void zzc(zzcnq zzcnqVar, Map map) {
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String optString5;
        String optString6;
        String optString7;
        ResolveInfo resolveInfo;
        Intent parseUri;
        PackageManager packageManager = zzcnqVar.getContext().getPackageManager();
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
                ((zzbsn) zzcnqVar).zze("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbsn) zzcnqVar).zze("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbsn) zzcnqVar).zze("openableIntents", new JSONObject());
        }
    }

    public static void zzd(Map map, zzdkn zzdknVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziv)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdknVar != null) {
            zzdknVar.zzq();
        }
    }
}
