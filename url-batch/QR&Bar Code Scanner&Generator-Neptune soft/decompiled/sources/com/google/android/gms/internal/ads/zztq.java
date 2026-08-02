package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zztq extends zzrj implements zzth {
    private final zzbg zza;
    private final zzay zzb;
    private final zzew zzc;
    private final zzpq zzd;
    private final int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;
    private zzfz zzj;
    private final zztn zzk;
    private final zzwm zzl;

    /* synthetic */ zztq(zzbg zzbgVar, zzew zzewVar, zztn zztnVar, zzpq zzpqVar, zzwm zzwmVar, int i, zztp zztpVar, byte[] bArr) {
        zzay zzayVar = zzbgVar.zzd;
        Objects.requireNonNull(zzayVar);
        this.zzb = zzayVar;
        this.zza = zzbgVar;
        this.zzc = zzewVar;
        this.zzk = zztnVar;
        this.zzd = zzpqVar;
        this.zzl = zzwmVar;
        this.zze = i;
        this.zzf = true;
        this.zzg = -9223372036854775807L;
    }

    private final void zzv() {
        long j = this.zzg;
        boolean z = this.zzh;
        boolean z2 = this.zzi;
        zzbg zzbgVar = this.zza;
        zzud zzudVar = new zzud(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, zzbgVar, z2 ? zzbgVar.zzf : null);
        zzo(this.zzf ? new zztm(this, zzudVar) : zzudVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzB(zzsg zzsgVar) {
        ((zztl) zzsgVar).zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final zzsg zzD(zzsi zzsiVar, zzwi zzwiVar, long j) {
        zzex zza = this.zzc.zza();
        zzfz zzfzVar = this.zzj;
        if (zzfzVar != null) {
            zza.zzf(zzfzVar);
        }
        Uri uri = this.zzb.zza;
        zztn zztnVar = this.zzk;
        zzb();
        zzrl zzrlVar = new zzrl(zztnVar.zza);
        zzpq zzpqVar = this.zzd;
        zzpk zzc = zzc(zzsiVar);
        zzwm zzwmVar = this.zzl;
        zzsr zze = zze(zzsiVar);
        String str = this.zzb.zzf;
        return new zztl(uri, zza, zzrlVar, zzpqVar, zzc, zzwmVar, zze, this, zzwiVar, null, this.zze, null);
    }

    @Override // com.google.android.gms.internal.ads.zzth
    public final void zza(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.zzg;
        }
        if (!this.zzf && this.zzg == j && this.zzh == z && this.zzi == z2) {
            return;
        }
        this.zzg = j;
        this.zzh = z;
        this.zzi = z2;
        this.zzf = false;
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    protected final void zzn(zzfz zzfzVar) {
        this.zzj = zzfzVar;
        Objects.requireNonNull(Looper.myLooper());
        zzb();
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    protected final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzw() {
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final zzbg zzz() {
        return this.zza;
    }
}
