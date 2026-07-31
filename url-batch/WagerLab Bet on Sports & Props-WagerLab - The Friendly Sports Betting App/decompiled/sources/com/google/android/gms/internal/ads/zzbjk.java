package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.common.util.concurrent.ListenableFuture;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbjk {
    public static final zzbjl zza = zzbjj.zza;
    public static final zzbjl zzb = zzbja.zza;
    public static final zzbjl zzc = zzbjb.zza;
    public static final zzbjl zzd = new zzbis();
    public static final zzbjl zze = new zzbit();
    public static final zzbjl zzf = zzbjg.zza;
    public static final zzbjl zzg = new zzbiu();
    public static final zzbjl zzh = new zzbiv();
    public static final zzbjl zzi = zzbjh.zza;
    public static final zzbjl zzj = new zzbiw();
    public static final zzbjl zzk = new zzbix();
    public static final zzbjl zzl = new zzcce();
    public static final zzbjl zzm = new zzccf();
    public static final zzbjl zzn = new zzbie();
    public static final zzbkc zzo = new zzbkc();
    public static final zzbjl zzp = new zzbiy();
    public static final zzbjl zzq = new zzbiz();
    public static final zzbjl zzr = new zzbif();
    public static final zzbjl zzs = new zzbig();
    public static final zzbjl zzt = new zzbih();
    public static final zzbjl zzu = new zzbii();
    public static final zzbjl zzv = new zzbij();
    public static final zzbjl zzw = new zzbik();
    public static final zzbjl zzx = new zzbil();
    public static final zzbjl zzy = new zzbim();
    public static final zzbjl zzz = new zzbin();
    public static final zzbjl zzA = new zzbio();
    public static final zzbjl zzB = new zzbiq();
    public static final zzbjl zzC = new zzbir();

    public static ListenableFuture zza(zzcek zzcekVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzauu zzS = zzcekVar.zzS();
            zzfdg zzT = zzcekVar.zzT();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmN)).booleanValue() || zzT == null) {
                if (zzS != null && zzS.zza(parse)) {
                    parse = zzS.zzd(parse, zzcekVar.getContext(), zzcekVar.zzE(), zzcekVar.zzj());
                }
            } else if (zzS != null && zzS.zza(parse)) {
                parse = zzT.zza(parse, zzcekVar.getContext(), zzcekVar.zzE(), zzcekVar.zzj());
            }
        } catch (zzauv unused) {
            String concat = "Unable to append parameter to URL: ".concat(str);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
        }
        Map hashMap = new HashMap();
        if (zzcekVar.zzC() != null) {
            hashMap = zzcekVar.zzC().zzaw;
        }
        final String zzb2 = zzbxt.zzb(parse, zzcekVar.getContext(), hashMap);
        long longValue = ((Long) zzbeh.zze.zze()).longValue();
        if (longValue <= 0 || longValue > 253410000) {
            return zzgot.zza(zzb2);
        }
        zzgol zzw2 = zzgol.zzw(zzcekVar.zzaF());
        zzbjc zzbjcVar = zzbjc.zza;
        zzgpd zzgpdVar = zzbzh.zzg;
        return (zzgol) zzgot.zzg((zzgol) zzgot.zzk((zzgol) zzgot.zzg(zzw2, Throwable.class, zzbjcVar, zzgpdVar), new zzggr() { // from class: com.google.android.gms.internal.ads.zzbjd
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                String str2 = (String) obj;
                zzbjl zzbjlVar = zzbjk.zza;
                String str3 = zzb2;
                if (str2 != null) {
                    if (((Boolean) zzbeh.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str3).getHost();
                        for (int i2 = 0; i2 < 3; i2++) {
                            if (!host.endsWith(strArr[i2])) {
                            }
                        }
                    }
                    String str4 = (String) zzbeh.zza.zze();
                    String str5 = (String) zzbeh.zzb.zze();
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
        }, zzgpdVar), Throwable.class, new zzggr() { // from class: com.google.android.gms.internal.ads.zzbje
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbjl zzbjlVar = zzbjk.zza;
                if (((Boolean) zzbeh.zzi.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "prepareClickUrl.attestation2");
                }
                return zzb2;
            }
        }, zzgpdVar);
    }

    public static zzbjl zzb(final zzddz zzddzVar, final zzcmi zzcmiVar) {
        return new zzbjl() { // from class: com.google.android.gms.internal.ads.zzbjf
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcek zzcekVar = (zzcek) obj;
                zzbjk.zzc(map, zzddz.this);
                final String str = (String) map.get("u");
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                    return;
                }
                final zzcmi zzcmiVar2 = zzcmiVar;
                zzgol zzw2 = zzgol.zzw(zzbjk.zza(zzcekVar, str));
                zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzbji
                    @Override // com.google.android.gms.internal.ads.zzgob
                    public final /* synthetic */ ListenableFuture zza(Object obj2) {
                        zzcmi zzcmiVar3;
                        String str2 = (String) obj2;
                        zzbjl zzbjlVar = zzbjk.zza;
                        return (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkQ)).booleanValue() && (zzcmiVar3 = zzcmi.this) != null && zzcmi.zzc(str)) ? zzcmiVar3.zzb(str2, com.google.android.gms.ads.internal.client.zzbb.zze()) : zzgot.zza(str2);
                    }
                };
                zzgpd zzgpdVar = zzbzh.zza;
                zzgot.zzq((zzgol) zzgot.zzj(zzw2, zzgobVar, zzgpdVar), new zzbip(zzcekVar), zzgpdVar);
            }
        };
    }

    public static void zzc(Map map, zzddz zzddzVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlA)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzddzVar != null) {
            zzddzVar.zzdz();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:(3:10|11|12)|(12:50|51|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e3, code lost:
    
        r7 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ce, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cf, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzh().zzg(r0, r8.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void zze(zzcfw zzcfwVar, Map map) {
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String optString5;
        String optString6;
        String optString7;
        ResolveInfo resolveInfo;
        Intent parseUri;
        PackageManager packageManager = zzcfwVar.getContext().getPackageManager();
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
                        optString4 = jSONObject2.optString(CmcdData.OBJECT_TYPE_MANIFEST);
                        optString5 = jSONObject2.optString("p");
                        optString6 = jSONObject2.optString("c");
                        optString7 = jSONObject2.optString("intent_url");
                        resolveInfo = null;
                    } catch (JSONException e) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the intent data.", e);
                    }
                    if (!TextUtils.isEmpty(optString7)) {
                        try {
                            parseUri = Intent.parseUri(optString7, 0);
                        } catch (URISyntaxException e2) {
                            String.valueOf(optString7);
                            String valueOf = String.valueOf(optString7);
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the url: ".concat(valueOf), e2);
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
                ((zzbmh) zzcfwVar).zzd("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbmh) zzcfwVar).zzd("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbmh) zzcfwVar).zzd("openableIntents", new JSONObject());
        }
    }
}
