package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.Constants;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbiw {
    public static final zzbix zza = new zzbix() { // from class: com.google.android.gms.internal.ads.zzbhu
        @Override // com.google.android.gms.internal.ads.zzbix
        public final void zza(Object obj, Map map) {
            zzcfq zzcfqVar = (zzcfq) obj;
            zzbix zzbixVar = zzbiw.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = zzcfqVar.getContext().getPackageManager();
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
            ((zzbls) zzcfqVar).zzd("openableURLs", hashMap);
        }
    };
    public static final zzbix zzb = new zzbix() { // from class: com.google.android.gms.internal.ads.zzbhw
        @Override // com.google.android.gms.internal.ads.zzbix
        public final void zza(Object obj, Map map) {
            zzcfq zzcfqVar = (zzcfq) obj;
            zzbix zzbixVar = zzbiw.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzht)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            Boolean valueOf = Boolean.valueOf(zzcfqVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            hashMap.put(str, valueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + valueOf);
            ((zzbls) zzcfqVar).zzd("openableApp", hashMap);
        }
    };
    public static final zzbix zzc = new zzbix() { // from class: com.google.android.gms.internal.ads.zzbhz
        @Override // com.google.android.gms.internal.ads.zzbix
        public final void zza(Object obj, Map map) {
            zzbiw.zzb((zzcfq) obj, map);
        }
    };
    public static final zzbix zzd = new zzbio();
    public static final zzbix zze = new zzbip();
    public static final zzbix zzf = new zzbix() { // from class: com.google.android.gms.internal.ads.zzbia
        @Override // com.google.android.gms.internal.ads.zzbix
        public final void zza(Object obj, Map map) {
            zzcfq zzcfqVar = (zzcfq) obj;
            zzbix zzbixVar = zzbiw.zza;
            String str = (String) map.get("u");
            if (str == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("URL missing from httpTrack GMSG.");
            } else {
                new com.google.android.gms.ads.internal.util.zzbw(zzcfqVar.getContext(), ((zzcfx) zzcfqVar).zzn().afmaVersion, str).zzb();
            }
        }
    };
    public static final zzbix zzg = new zzbiq();
    public static final zzbix zzh = new zzbir();
    public static final zzbix zzi = new zzbix() { // from class: com.google.android.gms.internal.ads.zzbhy
        @Override // com.google.android.gms.internal.ads.zzbix
        public final void zza(Object obj, Map map) {
            zzcfw zzcfwVar = (zzcfw) obj;
            zzbix zzbixVar = zzbiw.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                zzauo zzI = zzcfwVar.zzI();
                if (zzI != null) {
                    zzI.zzc().zzl(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbix zzj = new zzbis();
    public static final zzbix zzk = new zzbit();
    public static final zzbix zzl = new zzccj();
    public static final zzbix zzm = new zzcck();
    public static final zzbix zzn = new zzbhq();
    public static final zzbjn zzo = new zzbjn();
    public static final zzbix zzp = new zzbiu();
    public static final zzbix zzq = new zzbiv();
    public static final zzbix zzr = new zzbib();
    public static final zzbix zzs = new zzbic();
    public static final zzbix zzt = new zzbid();
    public static final zzbix zzu = new zzbie();
    public static final zzbix zzv = new zzbif();
    public static final zzbix zzw = new zzbig();
    public static final zzbix zzx = new zzbih();
    public static final zzbix zzy = new zzbii();
    public static final zzbix zzz = new zzbij();
    public static final zzbix zzA = new zzbik();
    public static final zzbix zzB = new zzbim();
    public static final zzbix zzC = new zzbin();

    public static ListenableFuture zza(zzcej zzcejVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzauo zzI = zzcejVar.zzI();
            zzffk zzS = zzcejVar.zzS();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzla)).booleanValue() || zzS == null) {
                if (zzI != null && zzI.zzf(parse)) {
                    parse = zzI.zza(parse, zzcejVar.getContext(), zzcejVar.zzF(), zzcejVar.zzi());
                }
            } else if (zzI != null && zzI.zzf(parse)) {
                parse = zzS.zza(parse, zzcejVar.getContext(), zzcejVar.zzF(), zzcejVar.zzi());
            }
        } catch (zzaup unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to append parameter to URL: ".concat(str));
        }
        Map hashMap = new HashMap();
        if (zzcejVar.zzD() != null) {
            hashMap = zzcejVar.zzD().zzaw;
        }
        final String zzb2 = zzbyc.zzb(parse, zzcejVar.getContext(), hashMap);
        long longValue = ((Long) zzbdr.zze.zze()).longValue();
        return (longValue <= 0 || longValue > 242402501) ? zzgcj.zzh(zzb2) : zzgcj.zze(zzgcj.zzm(zzgcj.zze(zzgca.zzu(zzcejVar.zzT()), Throwable.class, new zzful() { // from class: com.google.android.gms.internal.ads.zzbhr
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbix zzbixVar = zzbiw.zza;
                if (!((Boolean) zzbdr.zzi.zze()).booleanValue()) {
                    return "failure_click_attok";
                }
                com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        }, zzbzo.zzf), new zzful() { // from class: com.google.android.gms.internal.ads.zzbhs
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                zzbix zzbixVar = zzbiw.zza;
                String str3 = zzb2;
                if (str2 != null) {
                    if (((Boolean) zzbdr.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str3).getHost();
                        for (int i = 0; i < 3; i++) {
                            if (!host.endsWith(strArr[i])) {
                            }
                        }
                    }
                    String str4 = (String) zzbdr.zza.zze();
                    String str5 = (String) zzbdr.zzb.zze();
                    if (!TextUtils.isEmpty(str4)) {
                        str3 = str3.replace(str4, str2);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        Uri parse2 = Uri.parse(str3);
                        if (TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                            return parse2.buildUpon().appendQueryParameter(str5, str2).toString();
                        }
                    }
                }
                return str3;
            }
        }, zzbzo.zzf), Throwable.class, new zzful() { // from class: com.google.android.gms.internal.ads.zzbht
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbix zzbixVar = zzbiw.zza;
                if (((Boolean) zzbdr.zzi.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "prepareClickUrl.attestation2");
                }
                return zzb2;
            }
        }, zzbzo.zzf);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:10|11|12|(12:50|51|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ca, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
    
        com.google.android.gms.ads.internal.zzu.zzo().zzw(r0, r8.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void zzb(zzcfq zzcfqVar, Map map) {
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String optString5;
        String optString6;
        String optString7;
        ResolveInfo resolveInfo;
        Intent parseUri;
        PackageManager packageManager = zzcfqVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        optString = jSONObject2.optString(FacebookMediationAdapter.KEY_ID);
                        optString2 = jSONObject2.optString("u");
                        optString3 = jSONObject2.optString("i");
                        optString4 = jSONObject2.optString("m");
                        optString5 = jSONObject2.optString("p");
                        optString6 = jSONObject2.optString("c");
                        optString7 = jSONObject2.optString("intent_url");
                        resolveInfo = null;
                    } catch (JSONException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Error parsing the intent data.", e);
                    }
                    if (!TextUtils.isEmpty(optString7)) {
                        try {
                            parseUri = Intent.parseUri(optString7, 0);
                        } catch (URISyntaxException e2) {
                            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error parsing the url: ".concat(String.valueOf(optString7)), e2);
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
                ((zzbls) zzcfqVar).zze("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbls) zzcfqVar).zze("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbls) zzcfqVar).zze("openableIntents", new JSONObject());
        }
    }

    public static void zzc(Map map, zzdeq zzdeqVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjQ)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdeqVar != null) {
            zzdeqVar.zzdG();
        }
    }
}
