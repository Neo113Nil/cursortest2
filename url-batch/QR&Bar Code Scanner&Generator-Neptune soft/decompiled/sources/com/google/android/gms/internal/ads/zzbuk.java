package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbuk {
    static final com.google.android.gms.ads.internal.util.zzbb zza = new zzbui();
    static final com.google.android.gms.ads.internal.util.zzbb zzb = new zzbuj();
    private final zzbtw zzc;

    public zzbuk(Context context, zzcgv zzcgvVar, String str, @Nullable zzfjw zzfjwVar) {
        this.zzc = new zzbtw(context, zzcgvVar, str, zza, zzb, zzfjwVar);
    }

    public final zzbua zza(String str, zzbud zzbudVar, zzbuc zzbucVar) {
        return new zzbuo(this.zzc, str, zzbudVar, zzbucVar);
    }

    public final zzbut zzb() {
        return new zzbut(this.zzc);
    }
}
