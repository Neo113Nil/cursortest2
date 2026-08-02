package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzebp implements zzfio {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfju zzc;
    private final zzfkf zzd;

    public zzebp(String str, zzfkf zzfkfVar, zzfju zzfjuVar) {
        this.zzb = str;
        this.zzd = zzfkfVar;
        this.zzc = zzfjuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfio
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        JSONObject jSONObject;
        zzbvd zzbvdVar;
        zzdwl zzdwlVar;
        zzbvd zzbvdVar2;
        zzbvd zzbvdVar3;
        zzbvd zzbvdVar4;
        zzbvd zzbvdVar5;
        zzbvd zzbvdVar6;
        zzbvd zzbvdVar7;
        zzbvd zzbvdVar8;
        JSONObject jSONObject2;
        String str;
        zzebo zzeboVar = (zzebo) obj;
        jSONObject = zzeboVar.zza;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        zzbvdVar = zzeboVar.zzb;
        String str2 = "";
        if (zzbvdVar.zza() != -2) {
            if (zzbvdVar.zza() == 1) {
                if (zzbvdVar.zzh() != null) {
                    str2 = TextUtils.join(", ", zzbvdVar.zzh());
                    com.google.android.gms.ads.internal.util.client.zzm.zzg(str2);
                }
                zzdwlVar = new zzdwl(2, "Error building request URL: ".concat(String.valueOf(str2)));
            } else {
                zzdwlVar = new zzdwl(1);
            }
            zzfkf zzfkfVar = this.zzd;
            zzfju zzfjuVar = this.zzc;
            zzfjuVar.zzh(zzdwlVar);
            zzfjuVar.zzg(false);
            zzfkfVar.zza(zzfjuVar);
            throw zzdwlVar;
        }
        HashMap hashMap = new HashMap();
        zzbvdVar2 = zzeboVar.zzb;
        if (zzbvdVar2.zzj() && !TextUtils.isEmpty(this.zzb)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzaG)).booleanValue()) {
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
                    hashMap.put(HttpHeaders.COOKIE, str);
                }
            } else {
                hashMap.put(HttpHeaders.COOKIE, this.zzb);
            }
        }
        zzbvdVar3 = zzeboVar.zzb;
        if (zzbvdVar3.zzk()) {
            jSONObject2 = zzeboVar.zza;
            zzebq.zza(hashMap, jSONObject2);
        }
        zzbvdVar4 = zzeboVar.zzb;
        if (zzbvdVar4 != null) {
            zzbvdVar7 = zzeboVar.zzb;
            if (!TextUtils.isEmpty(zzbvdVar7.zzf())) {
                zzbvdVar8 = zzeboVar.zzb;
                str2 = zzbvdVar8.zzf();
            }
        }
        zzfkf zzfkfVar2 = this.zzd;
        zzfju zzfjuVar2 = this.zzc;
        zzfjuVar2.zzg(true);
        zzfkfVar2.zza(zzfjuVar2);
        zzbvdVar5 = zzeboVar.zzb;
        String zzg = zzbvdVar5.zzg();
        byte[] bytes = str2.getBytes(zzfuj.zzc);
        zzbvdVar6 = zzeboVar.zzb;
        return new zzebk(zzg, optInt, hashMap, bytes, "", zzbvdVar6.zzk());
    }
}
