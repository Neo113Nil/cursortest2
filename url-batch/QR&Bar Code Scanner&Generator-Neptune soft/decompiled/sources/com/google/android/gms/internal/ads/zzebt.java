package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzebt implements zzgxi {
    private final zzgxv zza;

    public zzebt(zzgxv zzgxvVar) {
        this.zza = zzgxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.zza.zzb()).getApplicationInfo();
        zzgxq.zzb(applicationInfo);
        return applicationInfo;
    }
}
