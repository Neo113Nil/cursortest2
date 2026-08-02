package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzafk {
    public final zzaap zza;
    public zzafy zzd;
    public zzafg zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzafx zzb = new zzafx();
    public final zzef zzc = new zzef();
    private final zzef zzj = new zzef(1);
    private final zzef zzk = new zzef();

    public zzafk(zzaap zzaapVar, zzafy zzafyVar, zzafg zzafgVar) {
        this.zza = zzaapVar;
        this.zzd = zzafyVar;
        this.zze = zzafgVar;
        zzh(zzafyVar, zzafgVar);
    }

    public final int zza() {
        int i = !this.zzl ? this.zzd.zzg[this.zzf] : this.zzb.zzj[this.zzf] ? 1 : 0;
        return zzf() != null ? i | BasicMeasure.EXACTLY : i;
    }

    public final int zzb() {
        return !this.zzl ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i, int i2) {
        zzef zzefVar;
        zzafw zzf = zzf();
        if (zzf == null) {
            return 0;
        }
        int i3 = zzf.zzd;
        if (i3 != 0) {
            zzefVar = this.zzb.zzn;
        } else {
            byte[] bArr = (byte[]) zzen.zzH(zzf.zze);
            zzef zzefVar2 = this.zzk;
            int length = bArr.length;
            zzefVar2.zzD(bArr, length);
            zzefVar = this.zzk;
            i3 = length;
        }
        boolean zzb = this.zzb.zzb(this.zzf);
        boolean z = zzb || i2 != 0;
        zzef zzefVar3 = this.zzj;
        zzefVar3.zzH()[0] = (byte) ((true != z ? 0 : 128) | i3);
        zzefVar3.zzF(0);
        this.zza.zzr(this.zzj, 1, 1);
        this.zza.zzr(zzefVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zzb) {
            this.zzc.zzC(8);
            zzef zzefVar4 = this.zzc;
            byte[] zzH = zzefVar4.zzH();
            zzH[0] = 0;
            zzH[1] = 1;
            zzH[2] = 0;
            zzH[3] = (byte) i2;
            zzH[4] = (byte) ((i >> 24) & 255);
            zzH[5] = (byte) ((i >> 16) & 255);
            zzH[6] = (byte) ((i >> 8) & 255);
            zzH[7] = (byte) (i & 255);
            this.zza.zzr(zzefVar4, 8, 1);
            return i3 + 9;
        }
        zzef zzefVar5 = this.zzb.zzn;
        int zzo = zzefVar5.zzo();
        zzefVar5.zzG(-2);
        int i4 = (zzo * 6) + 2;
        if (i2 != 0) {
            this.zzc.zzC(i4);
            byte[] zzH2 = this.zzc.zzH();
            zzefVar5.zzB(zzH2, 0, i4);
            int i5 = (((zzH2[2] & UByte.MAX_VALUE) << 8) | (zzH2[3] & UByte.MAX_VALUE)) + i2;
            zzH2[2] = (byte) ((i5 >> 8) & 255);
            zzH2[3] = (byte) (i5 & 255);
            zzefVar5 = this.zzc;
        }
        this.zza.zzr(zzefVar5, i4, 1);
        return i3 + 1 + i4;
    }

    public final long zzd() {
        return !this.zzl ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzl) {
            return this.zzd.zzf[this.zzf];
        }
        zzafx zzafxVar = this.zzb;
        return zzafxVar.zzi[this.zzf];
    }

    public final zzafw zzf() {
        if (!this.zzl) {
            return null;
        }
        zzafg zzafgVar = this.zzb.zza;
        int i = zzen.zza;
        int i2 = zzafgVar.zza;
        zzafw zzafwVar = this.zzb.zzm;
        if (zzafwVar == null) {
            zzafwVar = this.zzd.zza.zza(i2);
        }
        if (zzafwVar == null || !zzafwVar.zza) {
            return null;
        }
        return zzafwVar;
    }

    public final void zzh(zzafy zzafyVar, zzafg zzafgVar) {
        this.zzd = zzafyVar;
        this.zze = zzafgVar;
        this.zza.zzk(zzafyVar.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzafx zzafxVar = this.zzb;
        zzafxVar.zzd = 0;
        zzafxVar.zzp = 0L;
        zzafxVar.zzq = false;
        zzafxVar.zzk = false;
        zzafxVar.zzo = false;
        zzafxVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (!this.zzl) {
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
}
