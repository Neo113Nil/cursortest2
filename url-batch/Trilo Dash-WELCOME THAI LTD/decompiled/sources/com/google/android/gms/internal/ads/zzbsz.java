package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbsz {
    static final com.google.android.gms.ads.internal.util.zzbb zza = new zzbsx();
    static final com.google.android.gms.ads.internal.util.zzbb zzb = new zzbsy();
    private final zzbsl zzc;

    public zzbsz(Context context, zzcfo zzcfoVar, String str, @Nullable zzfhs zzfhsVar) {
        this.zzc = new zzbsl(context, zzcfoVar, str, zza, zzb, zzfhsVar);
    }

    public final zzbsp zza(String str, zzbss zzbssVar, zzbsr zzbsrVar) {
        return new zzbtd(this.zzc, str, zzbssVar, zzbsrVar);
    }

    public final zzbti zzb() {
        return new zzbti(this.zzc);
    }
}
