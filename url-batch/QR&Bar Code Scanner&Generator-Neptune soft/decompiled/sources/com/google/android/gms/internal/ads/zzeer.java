package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeer implements zzfhk {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfjj zzc;
    private final zzfju zzd;

    public zzeer(String str, zzfju zzfjuVar, zzfjj zzfjjVar) {
        this.zzb = str;
        this.zzd = zzfjuVar;
        this.zzc = zzfjjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhk
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        JSONObject jSONObject;
        zzcbf zzcbfVar;
        zzcbf zzcbfVar2;
        zzcbf zzcbfVar3;
        zzcbf zzcbfVar4;
        zzcbf zzcbfVar5;
        zzcbf zzcbfVar6;
        zzcbf zzcbfVar7;
        JSONObject jSONObject2;
        String str;
        zzeeq zzeeqVar = (zzeeq) obj;
        jSONObject = zzeeqVar.zza;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        zzcbfVar = zzeeqVar.zzb;
        String str2 = "";
        if (zzcbfVar.zza() != -2) {
            zzfju zzfjuVar = this.zzd;
            zzfjj zzfjjVar = this.zzc;
            zzfjjVar.zze(false);
            zzfjuVar.zza(zzfjjVar);
            if (zzcbfVar.zza() != 1) {
                throw new zzebh(1);
            }
            if (zzcbfVar.zzf() != null) {
                str2 = TextUtils.join(", ", zzcbfVar.zzf());
                com.google.android.gms.ads.internal.util.zze.zzg(str2);
            }
            throw new zzebh(2, "Error building request URL: ".concat(String.valueOf(str2)));
        }
        HashMap hashMap = new HashMap();
        zzcbfVar2 = zzeeqVar.zzb;
        if (zzcbfVar2.zzh() && !TextUtils.isEmpty(this.zzb)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzaI)).booleanValue()) {
                String str3 = this.zzb;
                if (TextUtils.isEmpty(str3)) {
                    str = "";
                } else {
                    Matcher matcher = zza.matcher(str3);
                    str = "";
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (group != null && (group.toLowerCase(Locale.ROOT).startsWith("id=") || group.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                            if (!TextUtils.isEmpty(str)) {
                                str = str.concat("; ");
                            }
                            str = str.concat(group);
                        }
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put("Cookie", str);
                }
            } else {
                hashMap.put("Cookie", this.zzb);
            }
        }
        zzcbfVar3 = zzeeqVar.zzb;
        if (zzcbfVar3.zzi()) {
            jSONObject2 = zzeeqVar.zza;
            JSONObject optJSONObject = jSONObject2.optJSONObject("pii");
            if (optJSONObject != null) {
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                    hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                    hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
                }
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("DSID signal does not exist.");
            }
        }
        zzcbfVar4 = zzeeqVar.zzb;
        if (zzcbfVar4 != null) {
            zzcbfVar6 = zzeeqVar.zzb;
            if (!TextUtils.isEmpty(zzcbfVar6.zzd())) {
                zzcbfVar7 = zzeeqVar.zzb;
                str2 = zzcbfVar7.zzd();
            }
        }
        zzfju zzfjuVar2 = this.zzd;
        zzfjj zzfjjVar2 = this.zzc;
        zzfjjVar2.zze(true);
        zzfjuVar2.zza(zzfjjVar2);
        zzcbfVar5 = zzeeqVar.zzb;
        return new zzeem(zzcbfVar5.zze(), optInt, hashMap, str2.getBytes(zzfsk.zzc), "");
    }
}
