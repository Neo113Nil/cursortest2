package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzarg implements zzagh {
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;

    @Nullable
    private zzarc zzi;
    private zzagk zzj;
    private boolean zzk;
    private final zzfj zza = new zzfj(0);
    private final zzeu zzc = new zzeu(4096);
    private final SparseArray zzb = new SparseArray();
    private final zzard zzd = new zzard();

    static {
        int i = zzarf.zza;
    }

    private final void zzh() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i >= sparseArray.size()) {
                return;
            }
            ((zzare) sparseArray.valueAt(i)).zzc();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        byte[] bArr = new byte[14];
        zzagiVar.zzi(bArr, 0, 14);
        if ((((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzagiVar.zzk(bArr[13] & 7);
        zzagiVar.zzi(bArr, 0, 3);
        return ((((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) | (bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        this.zzj = zzagkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        zzaqh zzaqjVar;
        zzagk zzagkVar = this.zzj;
        zzagkVar.getClass();
        long zzo = zzagiVar.zzo();
        if (zzo != -1) {
            zzard zzardVar = this.zzd;
            if (!zzardVar.zza()) {
                return zzardVar.zzc(zzagiVar, zzahhVar);
            }
        }
        if (!this.zzk) {
            this.zzk = true;
            zzard zzardVar2 = this.zzd;
            if (zzardVar2.zzd() != -9223372036854775807L) {
                zzarc zzarcVar = new zzarc(zzardVar2.zzb(), zzardVar2.zzd(), zzo);
                this.zzi = zzarcVar;
                this.zzj.zzw(zzarcVar.zza());
            } else {
                zzagkVar.zzw(new zzahj(zzardVar2.zzd(), 0L));
            }
        }
        zzarc zzarcVar2 = this.zzi;
        if (zzarcVar2 != null && zzarcVar2.zzc()) {
            return zzarcVar2.zzd(zzagiVar, zzahhVar);
        }
        zzagiVar.zzl();
        long zzm = zzo != -1 ? zzo - zzagiVar.zzm() : -1L;
        if (zzm != -1 && zzm < 4) {
            zzh();
            return -1;
        }
        zzeu zzeuVar = this.zzc;
        if (!zzagiVar.zzh(zzeuVar.zzi(), 0, 4, true)) {
            zzh();
            return -1;
        }
        zzeuVar.zzh(0);
        int zzB = zzeuVar.zzB();
        if (zzB == 441) {
            zzh();
            return -1;
        }
        if (zzB == 442) {
            zzagiVar.zzi(zzeuVar.zzi(), 0, 10);
            zzeuVar.zzh(9);
            zzagiVar.zzf((zzeuVar.zzs() & 7) + 14);
            return 0;
        }
        if (zzB == 443) {
            zzagiVar.zzi(zzeuVar.zzi(), 0, 2);
            zzeuVar.zzh(0);
            zzagiVar.zzf(zzeuVar.zzt() + 6);
            return 0;
        }
        if ((zzB >> 8) != 1) {
            zzagiVar.zzf(1);
            return 0;
        }
        int i = zzB & 255;
        SparseArray sparseArray = this.zzb;
        zzare zzareVar = (zzare) sparseArray.get(i);
        if (!this.zze) {
            if (zzareVar == null) {
                zzaqh zzaqhVar = null;
                if (i == 189) {
                    zzaqjVar = new zzapx(null, 0, "video/mp2p");
                    this.zzf = true;
                    this.zzh = zzagiVar.zzn();
                } else if ((zzB & 224) == 192) {
                    zzaqjVar = new zzaqt(null, 0, "video/mp2p");
                    this.zzf = true;
                    this.zzh = zzagiVar.zzn();
                } else {
                    if ((zzB & 240) == 224) {
                        zzaqjVar = new zzaqj(null, "video/mp2p");
                        this.zzg = true;
                        this.zzh = zzagiVar.zzn();
                    }
                    if (zzaqhVar != null) {
                        zzaqhVar.zzb(this.zzj, new zzarv(Integer.MIN_VALUE, i, 256));
                        zzareVar = new zzare(zzaqhVar, this.zza);
                        sparseArray.put(i, zzareVar);
                    }
                }
                zzaqhVar = zzaqjVar;
                if (zzaqhVar != null) {
                }
            }
            long j = 1048576;
            if (this.zzf && this.zzg) {
                j = 8192 + this.zzh;
            }
            if (zzagiVar.zzn() > j) {
                this.zze = true;
                this.zzj.zzv();
            }
        }
        zzagiVar.zzi(zzeuVar.zzi(), 0, 2);
        zzeuVar.zzh(0);
        int zzt = zzeuVar.zzt() + 6;
        if (zzareVar == null) {
            zzagiVar.zzf(zzt);
        } else {
            zzeuVar.zza(zzt);
            zzagiVar.zzc(zzeuVar.zzi(), 0, zzt);
            zzeuVar.zzh(6);
            zzareVar.zzb(zzeuVar);
            zzeuVar.zzf(zzeuVar.zzj());
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 != r7) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[LOOP:0: B:13:0x002c->B:15:0x0034, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(long j, long j2) {
        zzarc zzarcVar;
        int i;
        SparseArray sparseArray;
        zzfj zzfjVar = this.zza;
        if (zzfjVar.zzc() != -9223372036854775807L) {
            long zza = zzfjVar.zza();
            if (zza != -9223372036854775807L) {
                if (zza != 0) {
                }
            }
            zzarcVar = this.zzi;
            i = 0;
            if (zzarcVar != null) {
                zzarcVar.zzb(j2);
            }
            while (true) {
                sparseArray = this.zzb;
                if (i < sparseArray.size()) {
                    return;
                }
                ((zzare) sparseArray.valueAt(i)).zza();
                i++;
            }
        }
        zzfjVar.zzd(j2);
        zzarcVar = this.zzi;
        i = 0;
        if (zzarcVar != null) {
        }
        while (true) {
            sparseArray = this.zzb;
            if (i < sparseArray.size()) {
            }
            ((zzare) sparseArray.valueAt(i)).zza();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }
}
