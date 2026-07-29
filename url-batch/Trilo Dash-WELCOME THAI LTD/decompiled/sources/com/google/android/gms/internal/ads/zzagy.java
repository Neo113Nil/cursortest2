package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import java.io.IOException;
import java.util.Map;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzagy implements zzys {
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzagw
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzagy.zza;
            return new zzys[]{new zzagy()};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    private zzagu zzj;
    private zzyv zzk;
    private boolean zzl;
    private final zzee zzb = new zzee(0);
    private final zzdy zzd = new zzdy(4096);
    private final SparseArray zzc = new SparseArray();
    private final zzagv zze = new zzagv();

    /* JADX WARN: Removed duplicated region for block: B:54:0x0147  */
    @Override // com.google.android.gms.internal.ads.zzys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzyt zzytVar, zzzs zzzsVar) throws IOException {
        zzaga zzagcVar;
        zzcw.zzb(this.zzk);
        long zzd = zzytVar.zzd();
        if (zzd != -1) {
            zzagv zzagvVar = this.zze;
            if (!zzagvVar.zze()) {
                return zzagvVar.zza(zzytVar, zzzsVar);
            }
        }
        if (!this.zzl) {
            this.zzl = true;
            zzagv zzagvVar2 = this.zze;
            if (zzagvVar2.zzb() != -9223372036854775807L) {
                zzagu zzaguVar = new zzagu(zzagvVar2.zzd(), zzagvVar2.zzb(), zzd);
                this.zzj = zzaguVar;
                this.zzk.zzL(zzaguVar.zzb());
            } else {
                this.zzk.zzL(new zzzu(zzagvVar2.zzb(), 0L));
            }
        }
        zzagu zzaguVar2 = this.zzj;
        if (zzaguVar2 != null && zzaguVar2.zze()) {
            return zzaguVar2.zza(zzytVar, zzzsVar);
        }
        zzytVar.zzj();
        long zze = zzd != -1 ? zzd - zzytVar.zze() : -1L;
        if ((zze != -1 && zze < 4) || !zzytVar.zzm(this.zzd.zzH(), 0, 4, true)) {
            return -1;
        }
        this.zzd.zzF(0);
        int zze2 = this.zzd.zze();
        if (zze2 == 441) {
            return -1;
        }
        if (zze2 == 442) {
            zzym zzymVar = (zzym) zzytVar;
            zzymVar.zzm(this.zzd.zzH(), 0, 10, false);
            this.zzd.zzF(9);
            zzymVar.zzo((this.zzd.zzk() & 7) + 14, false);
            return 0;
        }
        if (zze2 == 443) {
            zzym zzymVar2 = (zzym) zzytVar;
            zzymVar2.zzm(this.zzd.zzH(), 0, 2, false);
            this.zzd.zzF(0);
            zzymVar2.zzo(this.zzd.zzo() + 6, false);
            return 0;
        }
        if ((zze2 >> 8) != 1) {
            ((zzym) zzytVar).zzo(1, false);
            return 0;
        }
        int i = zze2 & 255;
        zzagx zzagxVar = (zzagx) this.zzc.get(i);
        if (!this.zzf) {
            if (zzagxVar == null) {
                zzaga zzagaVar = null;
                if (i == 189) {
                    zzagcVar = new zzafq(null);
                    this.zzg = true;
                    this.zzi = zzytVar.zzf();
                } else if ((i & 224) == 192) {
                    zzagcVar = new zzago(null);
                    this.zzg = true;
                    this.zzi = zzytVar.zzf();
                } else {
                    if ((i & 240) == 224) {
                        zzagcVar = new zzagc(null);
                        this.zzh = true;
                        this.zzi = zzytVar.zzf();
                    }
                    if (zzagaVar != null) {
                        zzagaVar.zzb(this.zzk, new zzahm(Integer.MIN_VALUE, i, 256));
                        zzagxVar = new zzagx(zzagaVar, this.zzb);
                        this.zzc.put(i, zzagxVar);
                    }
                }
                zzagaVar = zzagcVar;
                if (zzagaVar != null) {
                }
            }
            boolean z = this.zzg;
            long j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            if (z && this.zzh) {
                j = this.zzi + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            if (zzytVar.zzf() > j) {
                this.zzf = true;
                this.zzk.zzB();
            }
        }
        zzym zzymVar3 = (zzym) zzytVar;
        zzymVar3.zzm(this.zzd.zzH(), 0, 2, false);
        this.zzd.zzF(0);
        int zzo = this.zzd.zzo() + 6;
        if (zzagxVar == null) {
            zzymVar3.zzo(zzo, false);
        } else {
            this.zzd.zzC(zzo);
            zzymVar3.zzn(this.zzd.zzH(), 0, zzo, false);
            this.zzd.zzF(6);
            zzagxVar.zza(this.zzd);
            zzdy zzdyVar = this.zzd;
            zzdyVar.zzE(zzdyVar.zzb());
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zzk = zzyvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 != r7) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[LOOP:0: B:13:0x002c->B:15:0x0034, LOOP_END] */
    @Override // com.google.android.gms.internal.ads.zzys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(long j, long j2) {
        zzagu zzaguVar;
        int i;
        zzee zzeeVar = this.zzb;
        if (zzeeVar.zze() != -9223372036854775807L) {
            long zzc = zzeeVar.zzc();
            if (zzc != -9223372036854775807L) {
                if (zzc != 0) {
                }
            }
            zzaguVar = this.zzj;
            if (zzaguVar != null) {
                zzaguVar.zzd(j2);
            }
            for (i = 0; i < this.zzc.size(); i++) {
                ((zzagx) this.zzc.valueAt(i)).zzb();
            }
        }
        zzeeVar.zzf(j2);
        zzaguVar = this.zzj;
        if (zzaguVar != null) {
        }
        while (i < this.zzc.size()) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean zzd(zzyt zzytVar) throws IOException {
        byte[] bArr = new byte[14];
        zzym zzymVar = (zzym) zzytVar;
        zzymVar.zzm(bArr, 0, 14, false);
        if ((((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzymVar.zzl(bArr[13] & 7, false);
        zzymVar.zzm(bArr, 0, 3, false);
        return ((((bArr[0] & UByte.MAX_VALUE) << 16) | ((bArr[1] & UByte.MAX_VALUE) << 8)) | (bArr[2] & UByte.MAX_VALUE)) == 1;
    }
}
