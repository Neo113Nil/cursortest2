package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzayn implements zzavi {
    private zzayl zze;
    private zzayl zzf;
    private zzasw zzg;
    private zzasw zzh;
    private long zzi;
    private zzaym zzk;
    private final zzazp zzl;
    private final zzayk zza = new zzayk();
    private final zzayj zzb = new zzayj();
    private final zzbak zzc = new zzbak(32);
    private final AtomicInteger zzd = new AtomicInteger();
    private int zzj = 65536;

    public zzayn(zzazp zzazpVar, byte[] bArr) {
        this.zzl = zzazpVar;
        zzayl zzaylVar = new zzayl(0L, 65536);
        this.zze = zzaylVar;
        this.zzf = zzaylVar;
    }

    private final int zzo(int i) {
        if (this.zzj == 65536) {
            this.zzj = 0;
            zzayl zzaylVar = this.zzf;
            if (zzaylVar.zzc) {
                this.zzf = zzaylVar.zze;
            }
            zzayl zzaylVar2 = this.zzf;
            zzazj zzb = this.zzl.zzb();
            zzayl zzaylVar3 = new zzayl(this.zzf.zzb, 65536);
            zzaylVar2.zzd = zzb;
            zzaylVar2.zze = zzaylVar3;
            zzaylVar2.zzc = true;
        }
        return Math.min(i, 65536 - this.zzj);
    }

    private final void zzp() {
        this.zza.zzg();
        zzayl zzaylVar = this.zze;
        if (zzaylVar.zzc) {
            zzayl zzaylVar2 = this.zzf;
            boolean z = zzaylVar2.zzc;
            int i = (z ? 1 : 0) + (((int) (zzaylVar2.zza - zzaylVar.zza)) / 65536);
            zzazj[] zzazjVarArr = new zzazj[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzazjVarArr[i2] = zzaylVar.zzd;
                zzaylVar.zzd = null;
                zzaylVar = zzaylVar.zze;
            }
            this.zzl.zzd(zzazjVarArr);
        }
        zzayl zzaylVar3 = new zzayl(0L, 65536);
        this.zze = zzaylVar3;
        this.zzf = zzaylVar3;
        this.zzi = 0L;
        this.zzj = 65536;
        this.zzl.zzg();
    }

    private final void zzq(long j) {
        while (true) {
            zzayl zzaylVar = this.zze;
            if (j < zzaylVar.zzb) {
                return;
            }
            this.zzl.zzc(zzaylVar.zzd);
            zzayl zzaylVar2 = this.zze;
            zzaylVar2.zzd = null;
            this.zze = zzaylVar2.zze;
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
            zzazj zzazjVar = this.zze.zzd;
            System.arraycopy(zzazjVar.zza, i3, bArr, i2, min);
            j += min;
            i2 += min;
            if (j == this.zze.zzb) {
                this.zzl.zzc(zzazjVar);
                zzayl zzaylVar = this.zze;
                zzaylVar.zzd = null;
                this.zze = zzaylVar.zze;
            }
        }
    }

    private final boolean zzt() {
        return this.zzd.compareAndSet(0, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final void zza(zzasw zzaswVar) {
        zzasw zzaswVar2 = zzaswVar == null ? null : zzaswVar;
        boolean zzk = this.zza.zzk(zzaswVar2);
        this.zzh = zzaswVar;
        zzaym zzaymVar = this.zzk;
        if (zzaymVar == null || !zzk) {
            return;
        }
        zzaymVar.zzv(zzaswVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final void zzb(zzbak zzbakVar, int i) {
        if (!zzt()) {
            zzbakVar.zzw(i);
            return;
        }
        while (i > 0) {
            int zzo = zzo(i);
            zzbakVar.zzq(this.zzf.zzd.zza, this.zzj, zzo);
            this.zzj += zzo;
            this.zzi += zzo;
            i -= zzo;
        }
        zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final void zzc(long j, int i, int i2, int i3, zzavh zzavhVar) {
        if (!zzt()) {
            this.zza.zzi(j);
            return;
        }
        try {
            this.zza.zzh(j, i, this.zzi - i2, i2, zzavhVar);
        } finally {
            zzr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final int zzd(zzauy zzauyVar, int i, boolean z) throws IOException, InterruptedException {
        if (!zzt()) {
            int zzb = zzauyVar.zzb(i);
            if (zzb != -1) {
                return zzb;
            }
            throw new EOFException();
        }
        try {
            int zza = zzauyVar.zza(this.zzf.zzd.zza, this.zzj, zzo(i));
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

    public final int zzf(zzasx zzasxVar, zzaur zzaurVar, boolean z, boolean z2, long j) {
        int zzb = this.zza.zzb(zzasxVar, zzaurVar, z, z2, this.zzg, this.zzb);
        if (zzb == -5) {
            this.zzg = zzasxVar.zza;
            return -5;
        }
        if (zzb != -4) {
            return -3;
        }
        if (!zzaurVar.zzf()) {
            if (zzaurVar.zzc < j) {
                zzaurVar.zza(Integer.MIN_VALUE);
            }
            if (zzaurVar.zzi()) {
                zzayj zzayjVar = this.zzb;
                long j2 = zzayjVar.zzb;
                int i = 1;
                this.zzc.zzs(1);
                zzs(j2, this.zzc.zza, 1);
                long j3 = j2 + 1;
                byte b = this.zzc.zza[0];
                int i2 = b & ByteCompanionObject.MIN_VALUE;
                int i3 = b & ByteCompanionObject.MAX_VALUE;
                zzaup zzaupVar = zzaurVar.zza;
                if (zzaupVar.zza == null) {
                    zzaupVar.zza = new byte[16];
                }
                zzs(j3, zzaupVar.zza, i3);
                long j4 = j3 + i3;
                if (i2 != 0) {
                    this.zzc.zzs(2);
                    zzs(j4, this.zzc.zza, 2);
                    j4 += 2;
                    i = this.zzc.zzj();
                }
                int i4 = i;
                zzaup zzaupVar2 = zzaurVar.zza;
                int[] iArr = zzaupVar2.zzd;
                if (iArr == null || iArr.length < i4) {
                    iArr = new int[i4];
                }
                int[] iArr2 = iArr;
                int[] iArr3 = zzaupVar2.zze;
                if (iArr3 == null || iArr3.length < i4) {
                    iArr3 = new int[i4];
                }
                int[] iArr4 = iArr3;
                if (i2 != 0) {
                    int i5 = i4 * 6;
                    this.zzc.zzs(i5);
                    zzs(j4, this.zzc.zza, i5);
                    j4 += i5;
                    this.zzc.zzv(0);
                    for (int i6 = 0; i6 < i4; i6++) {
                        iArr2[i6] = this.zzc.zzj();
                        iArr4[i6] = this.zzc.zzi();
                    }
                } else {
                    iArr2[0] = 0;
                    iArr4[0] = zzayjVar.zza - ((int) (j4 - zzayjVar.zzb));
                }
                zzavh zzavhVar = zzayjVar.zzd;
                zzaup zzaupVar3 = zzaurVar.zza;
                byte[] bArr = zzavhVar.zzb;
                byte[] bArr2 = zzaupVar3.zza;
                int i7 = zzavhVar.zza;
                zzaupVar3.zzb(i4, iArr2, iArr4, bArr, bArr2, 1);
                long j5 = zzayjVar.zzb;
                int i8 = (int) (j4 - j5);
                zzayjVar.zzb = j5 + i8;
                zzayjVar.zza -= i8;
            }
            zzaurVar.zzh(this.zzb.zza);
            zzayj zzayjVar2 = this.zzb;
            long j6 = zzayjVar2.zzb;
            ByteBuffer byteBuffer = zzaurVar.zzb;
            int i9 = zzayjVar2.zza;
            zzq(j6);
            while (i9 > 0) {
                int i10 = (int) (j6 - this.zze.zza);
                int min = Math.min(i9, 65536 - i10);
                zzazj zzazjVar = this.zze.zzd;
                byteBuffer.put(zzazjVar.zza, i10, min);
                j6 += min;
                i9 -= min;
                if (j6 == this.zze.zzb) {
                    this.zzl.zzc(zzazjVar);
                    zzayl zzaylVar = this.zze;
                    zzaylVar.zzd = null;
                    this.zze = zzaylVar.zze;
                }
            }
            zzq(this.zzb.zzc);
        }
        return -4;
    }

    public final long zzg() {
        return this.zza.zzc();
    }

    public final zzasw zzh() {
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

    public final void zzk(zzaym zzaymVar) {
        this.zzk = zzaymVar;
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
