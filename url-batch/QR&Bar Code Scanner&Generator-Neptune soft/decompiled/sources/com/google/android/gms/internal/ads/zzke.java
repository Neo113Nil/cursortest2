package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzke {
    private final zzhk zza;

    @Deprecated
    public zzke(Context context, zzcly zzclyVar, byte[] bArr) {
        this.zza = new zzhk(context, zzclyVar, null);
    }

    @Deprecated
    public final zzke zza(final zzjh zzjhVar) {
        zzhk zzhkVar = this.zza;
        zzdd.zzf(!zzhkVar.zzq);
        Objects.requireNonNull(zzjhVar);
        zzhkVar.zzf = new zzftn() { // from class: com.google.android.gms.internal.ads.zzhc
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                return zzjh.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzke zzb(final zzvz zzvzVar) {
        zzhk zzhkVar = this.zza;
        zzdd.zzf(!zzhkVar.zzq);
        Objects.requireNonNull(zzvzVar);
        zzhkVar.zze = new zzftn() { // from class: com.google.android.gms.internal.ads.zzhd
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                return zzvz.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzkf zzc() {
        zzhk zzhkVar = this.zza;
        zzdd.zzf(!zzhkVar.zzq);
        zzhkVar.zzq = true;
        return new zzkf(zzhkVar);
    }
}
