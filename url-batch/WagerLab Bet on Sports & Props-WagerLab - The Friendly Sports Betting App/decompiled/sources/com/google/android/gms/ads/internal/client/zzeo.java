package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.internal.ads.zzazx;
import com.google.android.gms.internal.ads.zzbab;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes4.dex */
public final class zzeo extends com.google.android.gms.ads.preload.zzb {
    public zzeo(Context context) {
        super(context, AdFormat.APP_OPEN_AD);
    }

    public final AppOpenAd zza(String str) {
        zzbab zzbabVar;
        try {
            zzbabVar = this.zza.zzp(str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            zzbabVar = null;
        }
        if (zzbabVar == null) {
            return null;
        }
        return new zzazx(zzbabVar);
    }
}
