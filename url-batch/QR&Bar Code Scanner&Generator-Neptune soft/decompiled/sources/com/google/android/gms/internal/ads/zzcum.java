package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcum implements zzctw {
    private final CookieManager zza;

    public zzcum(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzt.zzq().zzb(context);
    }

    @Override // com.google.android.gms.internal.ads.zzctw
    public final void zza(Map map) {
        if (this.zza == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.zza.setCookie((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzaH), str);
            return;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzaH);
        String cookie = this.zza.getCookie(str2);
        if (cookie == null) {
            return;
        }
        List zzf = zzftk.zzc(zzfsj.zzc(';')).zzf(cookie);
        for (int i = 0; i < zzf.size(); i++) {
            CookieManager cookieManager = this.zza;
            Iterator it = zzftk.zzc(zzfsj.zzc('=')).zzd((String) zzf.get(i)).iterator();
            Objects.requireNonNull(it);
            if (!it.hasNext()) {
                throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
            }
            cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzau))));
        }
    }
}
