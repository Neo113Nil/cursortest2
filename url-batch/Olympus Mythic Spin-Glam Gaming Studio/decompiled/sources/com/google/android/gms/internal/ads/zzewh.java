package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.common.util.concurrent.ListenableFuture;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzewh implements zzfdi {
    private final Context zza;
    private final zzhdi zzb;

    zzewh(zzhdi zzhdiVar, Context context) {
        this.zzb = zzhdiVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoJ)).booleanValue()) {
            return zzhcy.zza(new zzewi(null, false));
        }
        final ContentResolver contentResolver = this.zza.getContentResolver();
        return contentResolver == null ? zzhcy.zza(new zzewi(null, false)) : this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzewg
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                ContentResolver contentResolver2 = contentResolver;
                return new zzewi(Settings.Secure.getString(contentResolver2, "advertising_id"), Settings.Secure.getInt(contentResolver2, CommonUrlParts.LIMIT_AD_TRACKING, 0) == 1);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 61;
    }
}
