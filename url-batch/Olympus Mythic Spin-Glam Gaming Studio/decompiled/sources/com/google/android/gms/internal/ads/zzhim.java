package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhim extends zzhga {
    private final zzhil zza;
    private final String zzb;
    private final zzhik zzc;
    private final zzhga zzd;

    /* synthetic */ zzhim(zzhil zzhilVar, String str, zzhik zzhikVar, zzhga zzhgaVar, byte[] bArr) {
        this.zza = zzhilVar;
        this.zzb = str;
        this.zzc = zzhikVar;
        this.zzd = zzhgaVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhim)) {
            return false;
        }
        zzhim zzhimVar = (zzhim) obj;
        return zzhimVar.zzc.equals(this.zzc) && zzhimVar.zzd.equals(this.zzd) && zzhimVar.zzb.equals(this.zzb) && zzhimVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Objects.hash(zzhim.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        zzhil zzhilVar = this.zza;
        zzhga zzhgaVar = this.zzd;
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(zzhgaVar);
        String valueOf3 = String.valueOf(zzhilVar);
        String str = this.zzb;
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        StringBuilder sb = new StringBuilder(length + 64 + length2 + 27 + valueOf2.length() + 11 + valueOf3.length() + 1);
        sb.append("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        sb.append(str);
        sb.append(", dekParsingStrategy: ");
        sb.append(valueOf);
        sb.append(", dekParametersForNewKeys: ");
        sb.append(valueOf2);
        sb.append(", variant: ");
        sb.append(valueOf3);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zza != zzhil.zzb;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzhil zzc() {
        return this.zza;
    }

    public final zzhga zzd() {
        return this.zzd;
    }
}
