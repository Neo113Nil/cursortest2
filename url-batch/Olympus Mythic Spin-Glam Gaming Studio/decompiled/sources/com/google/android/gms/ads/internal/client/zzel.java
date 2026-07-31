package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbgz;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzel extends com.google.android.gms.ads.preload.zzb {
    public zzel(Context context) {
        super(context, AdFormat.APP_OPEN_AD);
    }

    @Nullable
    public final AppOpenAd zza(String str) {
        zzbgz zzbgzVar;
        try {
            zzbgzVar = this.zza.zzp(str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            zzbgzVar = null;
        }
        if (zzbgzVar == null) {
            return null;
        }
        return new zzbgv(zzbgzVar);
    }
}
