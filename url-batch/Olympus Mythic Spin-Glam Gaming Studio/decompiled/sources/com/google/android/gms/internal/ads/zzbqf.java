package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final /* synthetic */ class zzbqf implements zzbqh {
    static final /* synthetic */ zzbqf zza = new zzbqf();

    private /* synthetic */ zzbqf() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcmy zzcmyVar = (zzcmy) obj;
        zzbqh zzbqhVar = zzbqg.zza;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(StringUtils.COMMA);
        HashMap hashMap = new HashMap();
        PackageManager packageManager = zzcmyVar.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            Boolean valueOf = Boolean.valueOf(packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) != null);
            hashMap.put(str2, valueOf);
            StringBuilder sb = new StringBuilder(str2.length() + 14 + valueOf.toString().length());
            sb.append("/canOpenURLs;");
            sb.append(str2);
            sb.append(";");
            sb.append(valueOf);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        ((zzbte) zzcmyVar).zze("openableURLs", hashMap);
    }
}
