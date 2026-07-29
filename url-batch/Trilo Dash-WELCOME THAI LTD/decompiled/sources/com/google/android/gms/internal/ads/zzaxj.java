package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaxj implements zzaue {
    private zzaxh zze;
    private zzaxh zzf;
    private zzars zzg;
    private zzars zzh;
    private long zzi;
    private zzaxi zzk;
    private final zzayl zzl;
    private final zzaxg zza = new zzaxg();
    private final zzaxf zzb = new zzaxf();
    private final zzazg zzc = new zzazg(32);
    private final AtomicInteger zzd = new AtomicInteger();
    private int zzj = 65536;

    public zzaxj(zzayl zzaylVar, byte[] bArr) {
        this.zzl = zzaylVar;
        zzaxh zzaxhVar = new zzaxh(0L, 65536);
        this.zze = zzaxhVar;
        this.zzf = zzaxhVar;
    }

    private final int zzo(int i) {
        if (this.zzj == 65536) {
            this.zzj = 0;
            zzaxh zzaxhVar = this.zzf;
            if (zzaxhVar.zzc) {
                this.zzf = zzaxhVar.zze;
            }
            zzaxh zzaxhVar2 = this.zzf;
            zzayf zzb = this.zzl.zzb();
            zzaxh zzaxhVar3 = new zzaxh(this.zzf.zzb, 65536);
            zzaxhVar2.zzd = zzb;
            zzaxhVar2.zze = zzaxhVar3;
            zzaxhVar2.zzc = true;
        }
        return Math.min(i, 65536 - this.zzj);
    }

    private final void zzp() {
        this.zza.zzg();
        zzaxh zzaxhVar = this.zze;
        if (zzaxhVar.zzc) {
            zzaxh zzaxhVar2 = this.zzf;
            boolean z = zzaxhVar2.zzc;
            int i = (z ? 1 : 0) + (((int) (zzaxhVar2.zza - zzaxhVar.zza)) / 65536);
            zzayf[] zzayfVarArr = new zzayf[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzayfVarArr[i2] = zzaxhVar.zzd;
                zzaxhVar.zzd = null;
                zzaxhVar = zzaxhVar.zze;
            }
            this.zzl.zzd(zzayfVarArr);
        }
        zzaxh zzaxhVar3 = new zzaxh(0L, 65536);
        this.zze = zzaxhVar3;
        this.zzf = zzaxhVar3;
        this.zzi = 0L;
        this.zzj = 65536;
        this.zzl.zzg();
    }

    private final void zzq(long j) {
        while (true) {
            zzaxh zzaxhVar = this.zze;
            if (j < zzaxhVar.zzb) {
                return;
            }
            this.zzl.zzc(zzaxhVar.zzd);
            zzaxh zzaxhVar2 = this.zze;
            zzaxhVar2.zzd = null;
            this.zze = zzaxhVar2.zze;
        }
    }

    private final void zzr() {
        if (this.zzd.compareAndSet(1, 0)) {
            return;
        }
        zzp();
    }

    private final void zzs(long j, byte[] bArr, int i) {
        zzq(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.zze.zza);
            int min = Math.min(i - i2, 65536 - i3);
            zzayf zzayfVar = this.zze.zzd;
            System.arraycopy(zzayfVar.zza, i3, bArr, i2, min);
            j += min;
            i2 += min;
            if (j == this.zze.zzb) {
                this.zzl.zzc(zzayfVar);
                zzaxh zzaxhVar = this.zze;
                zzaxhVar.zzd = null;
                this.zze = zzaxhVar.zze;
            }
        }
    }

    private final boolean zzt() {
        return this.zzd.compareAndSet(0, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaue
    public final void zza(zzars zzarsVar) {
        zzars zzarsVar2 = zzarsVar == null ? null : zzarsVar;
        boolean zzk = this.zza.zzk(zzarsVar2);
        this.zzh = zzarsVar;
        zzaxi zzaxiVar = this.zzk;
        if (zzaxiVar == null || !zzk) {
            return;
        }
        zzaxiVar.zzv(zzarsVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaue
    public final void zzb(zzazg zzazgVar, int i) {
        if (!zzt()) {
            zzazgVar.zzw(i);
            return;
        }
        while (i > 0) {
            int zzo = zzo(i);
            zzazgVar.zzq(this.zzf.zzd.zza, this.zzj, zzo);
            this.zzj += zzo;
            this.zzi += zzo;
            i -= zzo;
        }
        zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzaue
    public final void zzc(long j, int i, int i2, int i3, zzaud zzaudVar) {
        if (!zzt()) {
            this.zza.zzi(j);
            return;
        }
        try {
            this.zza.zzh(j, i, this.zzi - i2, i2, zzaudVar);
        } finally {
            zzr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaue
    public final int zzd(zzatu zzatuVar, int i, boolean z) throws IOException, InterruptedException {
        if (!zzt()) {
            int zzb = zzatuVar.zzb(i);
            if (zzb != -1) {
                return zzb;
            }
            throw new EOFException();
        }
        try {
            int zza = zzatuVar.zza(this.zzf.zzd.zza, this.zzj, zzo(i));
            if (zza == -1) {
                throw new EOFException();
            }
            this.zzj += zza;
            this.zzi += zza;
            return zza;
        } finally {
            zzr();
        }
    }

    public final int zze() {
        return this.zza.zza();
    }

    public final int zzf(zzart zzartVar, zzatn zzatnVar, boolean z, boolean z2, long j) {
        int i;
        int zzb = this.zza.zzb(zzartVar, zzatnVar, z, z2, this.zzg, this.zzb);
        if (zzb == -5) {
            this.zzg = zzartVar.zza;
            return -5;
        }
        if (zzb != -4) {
            return -3;
        }
        if (!zzatnVar.zzf()) {
            if (zzatnVar.zzc < j) {
                zzatnVar.zza(Integer.MIN_VALUE);
            }
            if (zzatnVar.zzi()) {
                zzaxf zzaxfVar = this.zzb;
                long j2 = zzaxfVar.zzb;
                this.zzc.zzs(1);
                zzs(j2, this.zzc.zza, 1);
                long j3 = j2 + 1;
                byte b = this.zzc.zza[0];
                int i2 = b & ByteCompanionObject.MIN_VALUE;
                int i3 = b & ByteCompanionObject.MAX_VALUE;
                zzatl zzatlVar = zzatnVar.zza;
                if (zzatlVar.zza == null) {
                    zzatlVar.zza = new byte[16];
                }
                zzs(j3, zzatlVar.zza, i3);
                long j4 = j3 + i3;
                if (i2 != 0) {
                    this.zzc.zzs(2);
                    zzs(j4, this.zzc.zza, 2);
                    j4 += 2;
                    i = this.zzc.zzj();
                } else {
                    i = 1;
                }
                zzatl zzatlVar2 = zzatnVar.zza;
                int[] iArr = zzatlVar2.zzd;
                if (iArr == null || iArr.length < i) {
                    iArr = new int[i];
                }
                int[] iArr2 = iArr;
                int[] iArr3 = zzatlVar2.zze;
                if (iArr3 == null || iArr3.length < i) {
                    iArr3 = new int[i];
                }
                int[] iArr4 = iArr3;
                if (i2 != 0) {
                    int i4 = i * 6;
                    this.zzc.zzs(i4);
                    zzs(j4, this.zzc.zza, i4);
                    j4 += i4;
                    this.zzc.zzv(0);
                    for (int i5 = 0; i5 < i; i5++) {
                        iArr2[i5] = this.zzc.zzj();
                        iArr4[i5] = this.zzc.zzi();
                    }
                } else {
                    iArr2[0] = 0;
                    iArr4[0] = zzaxfVar.zza - ((int) (j4 - zzaxfVar.zzb));
                }
                zzaud zzaudVar = zzaxfVar.zzd;
                zzatl zzatlVar3 = zzatnVar.zza;
                byte[] bArr = zzaudVar.zzb;
                byte[] bArr2 = zzatlVar3.zza;
                int i6 = zzaudVar.zza;
                zzatlVar3.zzb(i, iArr2, iArr4, bArr, bArr2, 1);
                long j5 = zzaxfVar.zzb;
                int i7 = (int) (j4 - j5);
                zzaxfVar.zzb = j5 + i7;
                zzaxfVar.zza -= i7;
            }
            zzatnVar.zzh(this.zzb.zza);
            zzaxf zzaxfVar2 = this.zzb;
            long j6 = zzaxfVar2.zzb;
            ByteBuffer byteBuffer = zzatnVar.zzb;
            int i8 = zzaxfVar2.zza;
            zzq(j6);
            while (i8 > 0) {
                int i9 = (int) (j6 - this.zze.zza);
                int min = Math.min(i8, 65536 - i9);
                zzayf zzayfVar = this.zze.zzd;
                byteBuffer.put(zzayfVar.zza, i9, min);
                j6 += min;
                i8 -= min;
                if (j6 == this.zze.zzb) {
                    this.zzl.zzc(zzayfVar);
                    zzaxh zzaxhVar = this.zze;
                    zzaxhVar.zzd = null;
                    this.zze = zzaxhVar.zze;
                }
            }
            zzq(this.zzb.zzc);
        }
        return -4;
    }

    public final long zzg() {
        return this.zza.zzc();
    }

    public final zzars zzh() {
        return this.zza.zzf();
    }

    public final void zzi() {
        if (this.zzd.getAndSet(2) == 0) {
            zzp();
        }
    }

    public final void zzj(boolean z) {
        int andSet = this.zzd.getAndSet(true != z ? 2 : 0);
        zzp();
        this.zza.zzj();
        if (andSet == 2) {
            this.zzg = null;
        }
    }

    public final void zzk(zzaxi zzaxiVar) {
        this.zzk = zzaxiVar;
    }

    public final void zzl() {
        long zzd = this.zza.zzd();
        if (zzd != -1) {
            zzq(zzd);
        }
    }

    public final boolean zzm() {
        return this.zza.zzl();
    }

    public final boolean zzn(long j, boolean z) {
        long zze = this.zza.zze(j, z);
        if (zze == -1) {
            return false;
        }
        zzq(zze);
        return true;
    }
}
