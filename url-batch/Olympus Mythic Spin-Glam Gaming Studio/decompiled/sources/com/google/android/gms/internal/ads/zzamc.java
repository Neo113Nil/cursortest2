package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.inmobi.media.core.config.models.AdConfig;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
final class zzamc {
    public final zzaht zza;
    public zzamz zzd;
    public zzalw zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;

    @Nullable
    private zzv zzl;
    private zzv zzm;
    private boolean zzn;
    public final zzamy zzb = new zzamy();
    public final zzeu zzc = new zzeu();
    private final zzeu zzj = new zzeu(1);
    private final zzeu zzk = new zzeu();

    public zzamc(zzaht zzahtVar, zzamz zzamzVar, zzalw zzalwVar, zzv zzvVar) {
        this.zza = zzahtVar;
        this.zzd = zzamzVar;
        this.zze = zzalwVar;
        this.zzm = zzvVar;
        if (zzagg.zza(zzvVar.zzp)) {
            this.zzl = zzvVar;
        }
        zza(zzamzVar, zzalwVar);
    }

    public final void zza(zzamz zzamzVar, zzalw zzalwVar) {
        this.zzd = zzamzVar;
        this.zze = zzalwVar;
        if (this.zzl == null) {
            this.zza.zzA(this.zzm);
        }
        zzc();
    }

    public final void zzb(zzq zzqVar) {
        zzamw zzamwVar = this.zzd.zza;
        zzalw zzalwVar = this.zzb.zza;
        String str = zzfm.zza;
        zzamx zza = zzamwVar.zza(zzalwVar.zza);
        zzq zzb = zzqVar.zzb(zza != null ? zza.zzb : null);
        zzt zza2 = this.zzm.zza();
        zza2.zzs(zzb);
        zzv zzQ = zza2.zzQ();
        if (this.zzl != null) {
            this.zzl = zzQ;
        } else {
            this.zza.zzA(zzQ);
        }
    }

    public final void zzc() {
        zzamy zzamyVar = this.zzb;
        zzamyVar.zzd = 0;
        zzamyVar.zzp = 0L;
        zzamyVar.zzq = false;
        zzamyVar.zzk = false;
        zzamyVar.zzo = false;
        zzamyVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzn = false;
    }

    public final long zzd() {
        if (!this.zzn) {
            return this.zzd.zzf[this.zzf];
        }
        zzamy zzamyVar = this.zzb;
        return zzamyVar.zzi[this.zzf];
    }

    public final long zze() {
        return !this.zzn ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final int zzf() {
        return !this.zzn ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzg() {
        int i = !this.zzn ? this.zzd.zzg[this.zzf] : this.zzb.zzj[this.zzf] ? 1 : 0;
        return zzj() != null ? i | 1073741824 : i;
    }

    public final boolean zzh() {
        this.zzf++;
        if (!this.zzn) {
            return false;
        }
        int i = this.zzg + 1;
        this.zzg = i;
        int[] iArr = this.zzb.zzg;
        int i2 = this.zzh;
        if (i != iArr[i2]) {
            return true;
        }
        this.zzh = i2 + 1;
        this.zzg = 0;
        return false;
    }

    public final int zzi(int i, int i2) {
        zzeu zzeuVar;
        zzamx zzj = zzj();
        if (zzj == null) {
            return 0;
        }
        int i3 = zzj.zzd;
        if (i3 != 0) {
            zzeuVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzj.zze;
            String str = zzfm.zza;
            zzeu zzeuVar2 = this.zzk;
            int length = bArr.length;
            zzeuVar2.zzb(bArr, length);
            zzeuVar = zzeuVar2;
            i3 = length;
        }
        zzamy zzamyVar = this.zzb;
        boolean zzb = zzamyVar.zzb(this.zzf);
        boolean z = zzb || i2 != 0;
        zzeu zzeuVar3 = this.zzj;
        zzeuVar3.zzi()[0] = (byte) ((true != z ? 0 : 128) | i3);
        zzeuVar3.zzh(0);
        zzaht zzahtVar = this.zza;
        zzahtVar.zzd(zzeuVar3, 1, 1);
        zzahtVar.zzd(zzeuVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zzb) {
            zzeu zzeuVar4 = this.zzc;
            zzeuVar4.zza(8);
            byte[] zzi = zzeuVar4.zzi();
            zzi[0] = 0;
            zzi[1] = 1;
            zzi[2] = 0;
            zzi[3] = (byte) i2;
            zzi[4] = (byte) ((i >> 24) & 255);
            zzi[5] = (byte) ((i >> 16) & 255);
            zzi[6] = (byte) ((i >> 8) & 255);
            zzi[7] = (byte) (i & 255);
            zzahtVar.zzd(zzeuVar4, 8, 1);
            return i3 + 9;
        }
        int i4 = i3 + 1;
        zzeu zzeuVar5 = zzamyVar.zzn;
        int zzt = zzeuVar5.zzt();
        zzeuVar5.zzk(-2);
        int i5 = (zzt * 6) + 2;
        if (i2 != 0) {
            zzeu zzeuVar6 = this.zzc;
            zzeuVar6.zza(i5);
            byte[] zzi2 = zzeuVar6.zzi();
            zzeuVar5.zzm(zzi2, 0, i5);
            int i6 = (((zzi2[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (zzi2[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + i2;
            zzi2[2] = (byte) ((i6 >> 8) & 255);
            zzi2[3] = (byte) (i6 & 255);
            zzeuVar5 = zzeuVar6;
        }
        zzahtVar.zzd(zzeuVar5, i5, 1);
        return i4 + i5;
    }

    @Nullable
    public final zzamx zzj() {
        if (!this.zzn) {
            return null;
        }
        zzamy zzamyVar = this.zzb;
        zzalw zzalwVar = zzamyVar.zza;
        String str = zzfm.zza;
        int i = zzalwVar.zza;
        zzamx zzamxVar = zzamyVar.zzm;
        if (zzamxVar == null) {
            zzamxVar = this.zzd.zza.zza(i);
        }
        if (zzamxVar == null || !zzamxVar.zza) {
            return null;
        }
        return zzamxVar;
    }

    final /* synthetic */ zzv zzk() {
        return this.zzl;
    }

    final /* synthetic */ void zzl(zzv zzvVar) {
        this.zzl = null;
    }

    final /* synthetic */ zzv zzm() {
        return this.zzm;
    }

    final /* synthetic */ void zzn(zzv zzvVar) {
        this.zzm = zzvVar;
    }

    final /* synthetic */ boolean zzo() {
        return this.zzn;
    }

    final /* synthetic */ void zzp(boolean z) {
        this.zzn = true;
    }
}
