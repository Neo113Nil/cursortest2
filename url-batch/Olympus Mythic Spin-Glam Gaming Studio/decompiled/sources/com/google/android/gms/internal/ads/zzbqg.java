package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzbqg {
    public static final zzbqh zza = zzbqf.zza;
    public static final zzbqh zzb = zzbpw.zza;
    public static final zzbqh zzc = zzbpx.zza;
    public static final zzbqh zzd = new zzbpo();
    public static final zzbqh zze = new zzbpp();
    public static final zzbqh zzf = zzbqc.zza;
    public static final zzbqh zzg = new zzbpq();
    public static final zzbqh zzh = new zzbpr();
    public static final zzbqh zzi = zzbqd.zza;
    public static final zzbqh zzj = new zzbps();
    public static final zzbqh zzk = new zzbpt();
    public static final zzbqh zzl = new zzcjg();
    public static final zzbqh zzm = new zzcjh();
    public static final zzbqh zzn = new zzbpa();
    public static final zzbqz zzo = new zzbqz();
    public static final zzbqh zzp = new zzbpu();
    public static final zzbqh zzq = new zzbpv();
    public static final zzbqh zzr = new zzbpb();
    public static final zzbqh zzs = new zzbpc();
    public static final zzbqh zzt = new zzbpd();
    public static final zzbqh zzu = new zzbpe();
    public static final zzbqh zzv = new zzbpf();
    public static final zzbqh zzw = new zzbpg();
    public static final zzbqh zzx = new zzbph();
    public static final zzbqh zzy = new zzbpi();
    public static final zzbqh zzz = new zzbpj();
    public static final zzbqh zzA = new zzbpk();
    public static final zzbqh zzB = new zzbpm();
    public static final zzbqh zzC = new zzbpn();

    public static ListenableFuture zza(zzclm zzclmVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzbbd zzS = zzclmVar.zzS();
            zzfma zzT = zzclmVar.zzT();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznH)).booleanValue() || zzT == null) {
                if (zzS != null && zzS.zza(parse)) {
                    parse = zzS.zzd(parse, zzclmVar.getContext(), zzclmVar.zzE(), zzclmVar.zzj());
                }
            } else if (zzS != null && zzS.zza(parse)) {
                parse = zzT.zza(parse, zzclmVar.getContext(), zzclmVar.zzE(), zzclmVar.zzj());
            }
        } catch (zzbbe unused) {
            String concat = "Unable to append parameter to URL: ".concat(str);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
        }
        Map hashMap = new HashMap();
        if (zzclmVar.zzC() != null) {
            hashMap = zzclmVar.zzC().zzaw;
        }
        final String zzb2 = zzcet.zzb(parse, zzclmVar.getContext(), hashMap);
        long longValue = ((Long) zzblg.zze.zze()).longValue();
        if (longValue <= 0 || longValue > 262180000) {
            return zzhcy.zza(zzb2);
        }
        zzhcq zzw2 = zzhcq.zzw(zzclmVar.zzaF());
        zzbpy zzbpyVar = zzbpy.zza;
        zzhdi zzhdiVar = zzcgj.zzh;
        return (zzhcq) zzhcy.zzg((zzhcq) zzhcy.zzk((zzhcq) zzhcy.zzg(zzw2, Throwable.class, zzbpyVar, zzhdiVar), new zzgub() { // from class: com.google.android.gms.internal.ads.zzbpz
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                String str2 = (String) obj;
                zzbqh zzbqhVar = zzbqg.zza;
                String str3 = zzb2;
                if (str2 != null) {
                    if (((Boolean) zzblg.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str3).getHost();
                        for (int i2 = 0; i2 < 3; i2++) {
                            if (!host.endsWith(strArr[i2])) {
                            }
                        }
                    }
                    String str4 = (String) zzblg.zza.zze();
                    String str5 = (String) zzblg.zzb.zze();
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
        }, zzhdiVar), Throwable.class, new zzgub() { // from class: com.google.android.gms.internal.ads.zzbqa
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbqh zzbqhVar = zzbqg.zza;
                if (((Boolean) zzblg.zzi.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "prepareClickUrl.attestation2");
                }
                return zzb2;
            }
        }, zzhdiVar);
    }

    public static zzbqh zzb(final zzdlw zzdlwVar, final zzcub zzcubVar) {
        return new zzbqh() { // from class: com.google.android.gms.internal.ads.zzbqb
            @Override // com.google.android.gms.internal.ads.zzbqh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzclm zzclmVar = (zzclm) obj;
                zzbqg.zzc(map, zzdlw.this);
                final String str = (String) map.get("u");
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                    return;
                }
                final zzcub zzcubVar2 = zzcubVar;
                zzhcq zzw2 = zzhcq.zzw(zzbqg.zza(zzclmVar, str));
                zzhcg zzhcgVar = new zzhcg() { // from class: com.google.android.gms.internal.ads.zzbqe
                    @Override // com.google.android.gms.internal.ads.zzhcg
                    public final /* synthetic */ ListenableFuture zza(Object obj2) {
                        zzcub zzcubVar3;
                        String str2 = (String) obj2;
                        zzbqh zzbqhVar = zzbqg.zza;
                        return (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlH)).booleanValue() && (zzcubVar3 = zzcub.this) != null && zzcub.zzc(str)) ? zzcubVar3.zzb(str2, com.google.android.gms.ads.internal.client.zzay.zzh()) : zzhcy.zza(str2);
                    }
                };
                zzhdi zzhdiVar = zzcgj.zza;
                zzhcy.zzr((zzhcq) zzhcy.zzj(zzw2, zzhcgVar, zzhdiVar), new zzbpl(zzclmVar), zzhdiVar);
            }
        };
    }

    public static void zzc(Map map, zzdlw zzdlwVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmr)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdlwVar != null) {
            zzdlwVar.zzdu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(13:(3:10|11|12)|(11:50|51|(10:16|(1:18)|19|(1:21)|22|(1:24)|25|(1:27)|28|(2:30|(1:32)))|33|34|35|(1:37)(1:46)|38|39|41|42)|14|(0)|33|34|35|(0)(0)|38|39|41|42|8) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
    
        r0 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cc, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzh().zzh(r0, r9.toString());
        r15 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void zze(zzcmy zzcmyVar, Map map) {
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String optString5;
        String optString6;
        String optString7;
        Intent parseUri;
        PackageManager packageManager = zzcmyVar.getContext().getPackageManager();
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
                    } catch (JSONException e) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the intent data.", e);
                    }
                    if (!TextUtils.isEmpty(optString7)) {
                        try {
                            parseUri = Intent.parseUri(optString7, 0);
                        } catch (URISyntaxException e2) {
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
                        ResolveInfo resolveInfo = packageManager.resolveActivity(intent, 65536);
                        jSONObject.put(optString, resolveInfo == null);
                    }
                    parseUri = null;
                    if (parseUri == null) {
                    }
                    Intent intent2 = parseUri;
                    ResolveInfo resolveInfo2 = packageManager.resolveActivity(intent2, 65536);
                    jSONObject.put(optString, resolveInfo2 == null);
                }
                ((zzbte) zzcmyVar).zzd("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbte) zzcmyVar).zzd("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbte) zzcmyVar).zzd("openableIntents", new JSONObject());
        }
    }
}
