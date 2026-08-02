package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfd implements zzew {
    private final Context zza;
    private final zzew zzb;

    public zzfd(Context context) {
        zzff zzffVar = new zzff();
        this.zza = context.getApplicationContext();
        this.zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzew
    public final /* bridge */ /* synthetic */ zzex zza() {
        return new zzfe(this.zza, ((zzff) this.zzb).zza());
    }
}
