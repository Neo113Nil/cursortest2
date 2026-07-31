package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Strings;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzexr implements zzfdi {

    @Nullable
    private final zzfic zza;

    zzexr(@Nullable zzfic zzficVar) {
        this.zza = zzficVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        zzfic zzficVar = this.zza;
        if (zzficVar == null) {
            return zzhcy.zza(new zzexq(null));
        }
        String zza = zzficVar.zza();
        return Strings.isEmptyOrWhitespace(zza) ? zzhcy.zza(new zzexq(null)) : zzhcy.zza(new zzexq(zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 15;
    }
}
