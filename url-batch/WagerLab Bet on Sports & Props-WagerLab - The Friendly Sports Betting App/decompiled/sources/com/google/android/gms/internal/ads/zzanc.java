package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.ts.PsExtractor;
import java.io.IOException;
import org.msgpack.core.MessagePack;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzanc implements zzacu {
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private zzamy zzi;
    private zzacx zzj;
    private boolean zzk;
    private final zzel zza = new zzel(0);
    private final zzef zzc = new zzef(4096);
    private final SparseArray zzb = new SparseArray();
    private final zzamz zzd = new zzamz();

    static {
        int i = zzanb.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        byte[] bArr = new byte[14];
        zzacl zzaclVar = (zzacl) zzacvVar;
        zzaclVar.zzh(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & MessagePack.Code.BIN8) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzaclVar.zzj(bArr[13] & 7, false);
        zzaclVar.zzh(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zzj = zzacxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0130  */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        zzamd zzamfVar;
        zzacx zzacxVar = this.zzj;
        zzacxVar.getClass();
        long zzo = zzacvVar.zzo();
        if (zzo != -1) {
            zzamz zzamzVar = this.zzd;
            if (!zzamzVar.zza()) {
                return zzamzVar.zzc(zzacvVar, zzadsVar);
            }
        }
        if (!this.zzk) {
            this.zzk = true;
            zzamz zzamzVar2 = this.zzd;
            if (zzamzVar2.zzd() != C.TIME_UNSET) {
                zzamy zzamyVar = new zzamy(zzamzVar2.zzb(), zzamzVar2.zzd(), zzo);
                this.zzi = zzamyVar;
                this.zzj.zzw(zzamyVar.zza());
            } else {
                zzacxVar.zzw(new zzadu(zzamzVar2.zzd(), 0L));
            }
        }
        zzamy zzamyVar2 = this.zzi;
        if (zzamyVar2 != null && zzamyVar2.zzc()) {
            return zzamyVar2.zzd(zzacvVar, zzadsVar);
        }
        zzacvVar.zzl();
        long zzm = zzo != -1 ? zzo - zzacvVar.zzm() : -1L;
        if (zzm != -1 && zzm < 4) {
            return -1;
        }
        zzef zzefVar = this.zzc;
        if (!zzacvVar.zzh(zzefVar.zzi(), 0, 4, true)) {
            return -1;
        }
        zzefVar.zzh(0);
        int zzB = zzefVar.zzB();
        if (zzB == 441) {
            return -1;
        }
        if (zzB == 442) {
            zzacvVar.zzi(zzefVar.zzi(), 0, 10);
            zzefVar.zzh(9);
            zzacvVar.zzf((zzefVar.zzs() & 7) + 14);
            return 0;
        }
        if (zzB == 443) {
            zzacvVar.zzi(zzefVar.zzi(), 0, 2);
            zzefVar.zzh(0);
            zzacvVar.zzf(zzefVar.zzt() + 6);
            return 0;
        }
        if ((zzB >> 8) != 1) {
            zzacvVar.zzf(1);
            return 0;
        }
        int i = zzB & 255;
        SparseArray sparseArray = this.zzb;
        zzana zzanaVar = (zzana) sparseArray.get(i);
        if (!this.zze) {
            if (zzanaVar == null) {
                zzamd zzamdVar = null;
                if (i == 189) {
                    zzamfVar = new zzalt(null, 0, MimeTypes.VIDEO_PS);
                    this.zzf = true;
                    this.zzh = zzacvVar.zzn();
                } else if ((zzB & 224) == 192) {
                    zzamfVar = new zzamp(null, 0, MimeTypes.VIDEO_PS);
                    this.zzf = true;
                    this.zzh = zzacvVar.zzn();
                } else {
                    if ((zzB & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                        zzamfVar = new zzamf(null, MimeTypes.VIDEO_PS);
                        this.zzg = true;
                        this.zzh = zzacvVar.zzn();
                    }
                    if (zzamdVar != null) {
                        zzamdVar.zzb(this.zzj, new zzanr(Integer.MIN_VALUE, i, 256));
                        zzanaVar = new zzana(zzamdVar, this.zza);
                        sparseArray.put(i, zzanaVar);
                    }
                }
                zzamdVar = zzamfVar;
                if (zzamdVar != null) {
                }
            }
            long j = 1048576;
            if (this.zzf && this.zzg) {
                j = PlaybackStateCompat.ACTION_PLAY_FROM_URI + this.zzh;
            }
            if (zzacvVar.zzn() > j) {
                this.zze = true;
                this.zzj.zzv();
            }
        }
        zzacvVar.zzi(zzefVar.zzi(), 0, 2);
        zzefVar.zzh(0);
        int zzt = zzefVar.zzt() + 6;
        if (zzanaVar == null) {
            zzacvVar.zzf(zzt);
        } else {
            zzefVar.zza(zzt);
            zzacvVar.zzc(zzefVar.zzi(), 0, zzt);
            zzefVar.zzh(6);
            zzanaVar.zzb(zzefVar);
            zzefVar.zzf(zzefVar.zzj());
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 != r7) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[LOOP:0: B:13:0x002c->B:15:0x0034, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(long j, long j2) {
        zzamy zzamyVar;
        int i;
        SparseArray sparseArray;
        zzel zzelVar = this.zza;
        if (zzelVar.zzc() != C.TIME_UNSET) {
            long zza = zzelVar.zza();
            if (zza != C.TIME_UNSET) {
                if (zza != 0) {
                }
            }
            zzamyVar = this.zzi;
            i = 0;
            if (zzamyVar != null) {
                zzamyVar.zzb(j2);
            }
            while (true) {
                sparseArray = this.zzb;
                if (i < sparseArray.size()) {
                    return;
                }
                ((zzana) sparseArray.valueAt(i)).zza();
                i++;
            }
        }
        zzelVar.zzd(j2);
        zzamyVar = this.zzi;
        i = 0;
        if (zzamyVar != null) {
        }
        while (true) {
            sparseArray = this.zzb;
            if (i < sparseArray.size()) {
            }
            ((zzana) sparseArray.valueAt(i)).zza();
            i++;
        }
    }
}
