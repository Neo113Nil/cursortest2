package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public class zzcor {
    private final zzcqq zza;
    private final View zzb;
    private final zzfck zzc;
    private final zzcek zzd;

    public zzcor(View view, zzcek zzcekVar, zzcqq zzcqqVar, zzfck zzfckVar) {
        this.zzb = view;
        this.zzd = zzcekVar;
        this.zza = zzcqqVar;
        this.zzc = zzfckVar;
    }

    public final zzcek zza() {
        return this.zzd;
    }

    public final View zzb() {
        return this.zzb;
    }

    public final zzcqq zzc() {
        return this.zza;
    }

    public final zzfck zzd() {
        return this.zzc;
    }

    public zzcxe zze(Set set) {
        return new zzcxe(set);
    }
}
