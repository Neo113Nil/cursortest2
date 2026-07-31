package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
public final class zzeyn implements zzinw {
    public static zzeyn zza() {
        return zzeym.zza;
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        List arrayList = new ArrayList();
        zzbix zzbixVar = zzbjg.zznu;
        if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).split(StringUtils.COMMA));
        }
        zzioe.zzb(arrayList);
        return arrayList;
    }
}
