package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhij {
    private zzhil zza;
    private String zzb;
    private zzhik zzc;
    private zzhga zzd;

    private zzhij() {
        throw null;
    }

    /* synthetic */ zzhij(byte[] bArr) {
    }

    public final zzhij zza(zzhil zzhilVar) {
        this.zza = zzhilVar;
        return this;
    }

    public final zzhij zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzhij zzc(zzhik zzhikVar) {
        this.zzc = zzhikVar;
        return this;
    }

    public final zzhij zzd(zzhga zzhgaVar) {
        this.zzd = zzhgaVar;
        return this;
    }

    public final zzhim zze() throws GeneralSecurityException {
        if (this.zza == null) {
            this.zza = zzhil.zzb;
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        zzhik zzhikVar = this.zzc;
        if (zzhikVar == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        zzhga zzhgaVar = this.zzd;
        if (zzhgaVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzhgaVar.zza()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((zzhikVar.equals(zzhik.zza) && (zzhgaVar instanceof zzhhd)) || ((zzhikVar.equals(zzhik.zzc) && (zzhgaVar instanceof zzhhs)) || ((zzhikVar.equals(zzhik.zzb) && (zzhgaVar instanceof zzhjo)) || ((zzhikVar.equals(zzhik.zzd) && (zzhgaVar instanceof zzhgm)) || ((zzhikVar.equals(zzhik.zze) && (zzhgaVar instanceof zzhgu)) || (zzhikVar.equals(zzhik.zzf) && (zzhgaVar instanceof zzhhm))))))) {
            return new zzhim(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        String zzhikVar2 = this.zzc.toString();
        String valueOf = String.valueOf(this.zzd);
        StringBuilder sb = new StringBuilder(zzhikVar2.length() + 67 + valueOf.length() + 1);
        sb.append("Cannot use parsing strategy ");
        sb.append(zzhikVar2);
        sb.append(" when new keys are picked according to ");
        sb.append(valueOf);
        sb.append(".");
        throw new GeneralSecurityException(sb.toString());
    }
}
