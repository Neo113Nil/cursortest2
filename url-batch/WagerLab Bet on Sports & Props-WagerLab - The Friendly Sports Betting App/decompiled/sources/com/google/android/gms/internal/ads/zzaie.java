package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzaie {
    public final zzaeb zza;
    public zzaiv zzd;
    public zzahz zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final zzu zzj;
    private boolean zzm;
    public final zzaiu zzb = new zzaiu();
    public final zzef zzc = new zzef();
    private final zzef zzk = new zzef(1);
    private final zzef zzl = new zzef();

    public zzaie(zzaeb zzaebVar, zzaiv zzaivVar, zzahz zzahzVar, zzu zzuVar) {
        this.zza = zzaebVar;
        this.zzd = zzaivVar;
        this.zze = zzahzVar;
        this.zzj = zzuVar;
        zza(zzaivVar, zzahzVar);
    }

    public final void zza(zzaiv zzaivVar, zzahz zzahzVar) {
        this.zzd = zzaivVar;
        this.zze = zzahzVar;
        this.zza.zzu(this.zzj);
        zzc();
    }

    public final void zzb(zzp zzpVar) {
        zzais zzaisVar = this.zzd.zza;
        zzahz zzahzVar = this.zzb.zza;
        String str = zzeo.zza;
        zzait zza = zzaisVar.zza(zzahzVar.zza);
        zzp zzb = zzpVar.zzb(zza != null ? zza.zzb : null);
        zzs zza2 = this.zzj.zza();
        zza2.zzq(zzb);
        this.zza.zzu(zza2.zzM());
    }

    public final void zzc() {
        zzaiu zzaiuVar = this.zzb;
        zzaiuVar.zzd = 0;
        zzaiuVar.zzp = 0L;
        zzaiuVar.zzq = false;
        zzaiuVar.zzk = false;
        zzaiuVar.zzo = false;
        zzaiuVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzm = false;
    }

    public final long zzd() {
        if (!this.zzm) {
            return this.zzd.zzf[this.zzf];
        }
        zzaiu zzaiuVar = this.zzb;
        return zzaiuVar.zzi[this.zzf];
    }

    public final long zze() {
        return !this.zzm ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final int zzf() {
        return !this.zzm ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzg() {
        int i = !this.zzm ? this.zzd.zzg[this.zzf] : this.zzb.zzj[this.zzf] ? 1 : 0;
        return zzj() != null ? i | 1073741824 : i;
    }

    public final boolean zzh() {
        this.zzf++;
        if (!this.zzm) {
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
        zzef zzefVar;
        zzait zzj = zzj();
        if (zzj == null) {
            return 0;
        }
        int i3 = zzj.zzd;
        if (i3 != 0) {
            zzefVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzj.zze;
            String str = zzeo.zza;
            zzef zzefVar2 = this.zzl;
            byte[] bArr2 = bArr;
            int length = bArr2.length;
            zzefVar2.zzb(bArr2, length);
            zzefVar = zzefVar2;
            i3 = length;
        }
        zzaiu zzaiuVar = this.zzb;
        boolean zzb = zzaiuVar.zzb(this.zzf);
        boolean z = zzb || i2 != 0;
        zzef zzefVar3 = this.zzk;
        zzefVar3.zzi()[0] = (byte) ((true != z ? 0 : 128) | i3);
        zzefVar3.zzh(0);
        zzaeb zzaebVar = this.zza;
        zzaebVar.zzw(zzefVar3, 1, 1);
        zzaebVar.zzw(zzefVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zzb) {
            zzef zzefVar4 = this.zzc;
            zzefVar4.zza(8);
            byte[] zzi = zzefVar4.zzi();
            zzi[0] = 0;
            zzi[1] = 1;
            zzi[2] = 0;
            zzi[3] = (byte) i2;
            zzi[4] = (byte) ((i >> 24) & 255);
            zzi[5] = (byte) ((i >> 16) & 255);
            zzi[6] = (byte) ((i >> 8) & 255);
            zzi[7] = (byte) (i & 255);
            zzaebVar.zzw(zzefVar4, 8, 1);
            return i3 + 9;
        }
        int i4 = i3 + 1;
        zzef zzefVar5 = zzaiuVar.zzn;
        int zzt = zzefVar5.zzt();
        zzefVar5.zzk(-2);
        int i5 = (zzt * 6) + 2;
        if (i2 != 0) {
            zzef zzefVar6 = this.zzc;
            zzefVar6.zza(i5);
            byte[] zzi2 = zzefVar6.zzi();
            zzefVar5.zzm(zzi2, 0, i5);
            int i6 = (((zzi2[2] & 255) << 8) | (zzi2[3] & 255)) + i2;
            zzi2[2] = (byte) ((i6 >> 8) & 255);
            zzi2[3] = (byte) (i6 & 255);
            zzefVar5 = zzefVar6;
        }
        zzaebVar.zzw(zzefVar5, i5, 1);
        return i4 + i5;
    }

    public final zzait zzj() {
        if (!this.zzm) {
            return null;
        }
        zzaiu zzaiuVar = this.zzb;
        zzahz zzahzVar = zzaiuVar.zza;
        String str = zzeo.zza;
        int i = zzahzVar.zza;
        zzait zzaitVar = zzaiuVar.zzm;
        if (zzaitVar == null) {
            zzaitVar = this.zzd.zza.zza(i);
        }
        if (zzaitVar == null || !zzaitVar.zza) {
            return null;
        }
        return zzaitVar;
    }

    final /* synthetic */ boolean zzk() {
        return this.zzm;
    }

    final /* synthetic */ void zzl(boolean z) {
        this.zzm = true;
    }
}
