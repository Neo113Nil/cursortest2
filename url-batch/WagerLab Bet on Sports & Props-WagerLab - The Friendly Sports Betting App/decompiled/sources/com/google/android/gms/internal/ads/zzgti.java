package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzgti extends zzgrf {
    private final zzgtk zza;
    private final zzhgg zzb;

    @Nullable
    private final Integer zzc;

    private zzgti(zzgtk zzgtkVar, zzhgg zzhggVar, @Nullable Integer num) {
        this.zza = zzgtkVar;
        this.zzb = zzhggVar;
        this.zzc = num;
    }

    public static zzgti zzc(zzgtk zzgtkVar, @Nullable Integer num) throws GeneralSecurityException {
        zzhgg zza;
        if (zzgtkVar.zzd() == zzgtj.zza) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zza = zzhgg.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzgtkVar.zzd() != zzgtj.zzb) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(zzgtkVar.zzd().toString()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zza = zzhgg.zza(new byte[0]);
        }
        return new zzgti(zzgtkVar, zza, num);
    }

    @Override // com.google.android.gms.internal.ads.zzgrf, com.google.android.gms.internal.ads.zzgqd
    public final /* synthetic */ zzgqs zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgrf
    public final zzhgg zzb() {
        return this.zzb;
    }

    public final zzgtk zzd() {
        return this.zza;
    }

    public final Integer zze() {
        return this.zzc;
    }
}
