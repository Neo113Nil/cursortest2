package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzev;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzet extends zzcw {
    private final zzev zza;
    private final zzaaj zzb;

    @Nullable
    private final Integer zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcw, com.google.android.gms.internal.p002firebaseauthapi.zzbi
    public final /* synthetic */ zzcb zza() {
        return (zzev) zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcw
    /* renamed from: zzc */
    public final /* synthetic */ zzcy zza() {
        return this.zza;
    }

    public static zzet zza(zzev zzevVar, @Nullable Integer num) throws GeneralSecurityException {
        zzaaj zza;
        if (zzevVar.zzb() == zzev.zza.zza) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zza = zzaaj.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzevVar.zzb() != zzev.zza.zzb) {
                throw new GeneralSecurityException("Unknown Variant: " + String.valueOf(zzevVar.zzb()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zza = zzaaj.zza(new byte[0]);
        }
        return new zzet(zzevVar, zza, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcw
    public final zzaaj zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbi
    public final Integer zzb() {
        return this.zzc;
    }

    private zzet(zzev zzevVar, zzaaj zzaajVar, @Nullable Integer num) {
        this.zza = zzevVar;
        this.zzb = zzaajVar;
        this.zzc = num;
    }
}
