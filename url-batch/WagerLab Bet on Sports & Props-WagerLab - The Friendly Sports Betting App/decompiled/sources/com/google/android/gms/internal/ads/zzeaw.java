package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzeaw implements zzfgm {
    private static final Pattern zzd = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zza;
    private final zzfhr zzb;
    private final zzfib zzc;

    public zzeaw(String str, zzfib zzfibVar, zzfhr zzfhrVar) {
        this.zza = str;
        this.zzc = zzfibVar;
        this.zzb = zzfhrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    @Override // com.google.android.gms.internal.ads.zzfgm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzdwz zzdwzVar;
        String str;
        byte[] bArr;
        JSONObject zza;
        String str2;
        zzeav zzeavVar = (zzeav) obj;
        int optInt = zzeavVar.zza().optInt("http_timeout_millis", 60000);
        zzbux zzb = zzeavVar.zzb();
        if (zzb.zza() != -2) {
            if (zzb.zza() == 1) {
                if (zzb.zzb() != null) {
                    str = TextUtils.join(", ", zzb.zzb());
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(str);
                } else {
                    str = "";
                }
                String.valueOf(str);
                zzdwzVar = new zzdwz(2, "Error building request URL: ".concat(String.valueOf(str)));
            } else {
                zzdwzVar = new zzdwz(1);
            }
            zzfib zzfibVar = this.zzc;
            zzfhr zzfhrVar = this.zzb;
            zzfhrVar.zzj(zzdwzVar);
            zzfhrVar.zzd(false);
            zzfibVar.zza(zzfhrVar);
            throw zzdwzVar;
        }
        HashMap hashMap = new HashMap();
        if (zzeavVar.zzb().zzg()) {
            String str3 = this.zza;
            if (!TextUtils.isEmpty(str3)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbe)).booleanValue()) {
                    if (TextUtils.isEmpty(str3)) {
                        str2 = "";
                    } else {
                        Matcher matcher = zzd.matcher(str3);
                        str2 = "";
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null && (group.toLowerCase(Locale.ROOT).startsWith("id=") || group.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                                if (!TextUtils.isEmpty(str2)) {
                                    str2 = str2.concat("; ");
                                }
                                str2 = str2.concat(group);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        hashMap.put(HttpHeaders.COOKIE, str2);
                    }
                } else {
                    hashMap.put(HttpHeaders.COOKIE, str3);
                }
            }
        }
        if (zzeavVar.zzb().zzf() && (zza = zzeavVar.zza()) != null) {
            JSONObject optJSONObject = zza.optJSONObject("pii");
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
        byte[] bArr2 = new byte[0];
        if (!TextUtils.isEmpty(zzeavVar.zzb().zzd())) {
            byte[] bytes = zzeavVar.zzb().zzd().getBytes(StandardCharsets.UTF_8);
            if (zzeavVar.zzb().zzm()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.finish();
                        bArr2 = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                    } finally {
                    }
                } catch (IOException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("gzip compression failed, sending uncompressed.", e);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PrepareRequestFunction.apply");
                    bArr2 = null;
                }
                if (bArr2 != null) {
                    hashMap.put(HttpHeaders.CONTENT_ENCODING, "gzip");
                }
            }
            bArr = bytes;
            String zzl = TextUtils.isEmpty(zzeavVar.zzb().zzl()) ? zzeavVar.zzb().zzl() : "";
            zzfib zzfibVar2 = this.zzc;
            zzfhr zzfhrVar2 = this.zzb;
            zzfhrVar2.zzd(true);
            zzfibVar2.zza(zzfhrVar2);
            return new zzear(zzeavVar.zzb().zze(), optInt, hashMap, bArr, zzl, zzeavVar.zzb().zzf());
        }
        bArr = bArr2;
        if (TextUtils.isEmpty(zzeavVar.zzb().zzl())) {
        }
        zzfib zzfibVar22 = this.zzc;
        zzfhr zzfhrVar22 = this.zzb;
        zzfhrVar22.zzd(true);
        zzfibVar22.zza(zzfhrVar22);
        return new zzear(zzeavVar.zzb().zze(), optInt, hashMap, bArr, zzl, zzeavVar.zzb().zzf());
    }
}
