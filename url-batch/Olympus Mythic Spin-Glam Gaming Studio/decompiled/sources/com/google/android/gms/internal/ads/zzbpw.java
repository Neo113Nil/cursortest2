package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final /* synthetic */ class zzbpw implements zzbqh {
    static final /* synthetic */ zzbpw zza = new zzbpw();

    private /* synthetic */ zzbpw() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcmy zzcmyVar = (zzcmy) obj;
        zzbqh zzbqhVar = zzbqg.zza;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjE)).booleanValue()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        Boolean valueOf = Boolean.valueOf(zzcmyVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        hashMap.put(str, valueOf);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + valueOf.toString().length());
        sb.append("/canOpenApp;");
        sb.append(str);
        sb.append(";");
        sb.append(valueOf);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        ((zzbte) zzcmyVar).zze("openableApp", hashMap);
    }
}
