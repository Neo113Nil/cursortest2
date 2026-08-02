package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgbu {
    private final ConcurrentMap zza;
    private final zzgbo zzb;
    private final Class zzc;
    private final zzghm zzd;

    /* synthetic */ zzgbu(ConcurrentMap concurrentMap, zzgbo zzgboVar, zzghm zzghmVar, Class cls, zzgbt zzgbtVar) {
        this.zza = concurrentMap;
        this.zzb = zzgboVar;
        this.zzc = cls;
        this.zzd = zzghmVar;
    }

    @Nullable
    public final zzgbo zza() {
        return this.zzb;
    }

    public final zzghm zzb() {
        return this.zzd;
    }

    public final Class zzc() {
        return this.zzc;
    }

    public final Collection zzd() {
        return this.zza.values();
    }

    public final List zze(byte[] bArr) {
        List list = (List) this.zza.get(new zzgbq(bArr, null));
        return list != null ? list : Collections.emptyList();
    }

    public final boolean zzf() {
        return !this.zzd.zza().isEmpty();
    }
}
