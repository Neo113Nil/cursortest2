package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import java.io.IOException;
import java.util.Map;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaia implements zzzi {
    public static final zzzp zza = new zzzp() { // from class: com.google.android.gms.internal.ads.zzahy
        @Override // com.google.android.gms.internal.ads.zzzp
        public final zzzi[] zza() {
            zzzp zzzpVar = zzaia.zza;
            return new zzzi[]{new zzaia()};
        }

        @Override // com.google.android.gms.internal.ads.zzzp
        public final /* synthetic */ zzzi[] zzb(Uri uri, Map map) {
            return zzzo.zza(this, uri, map);
        }
    };
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    private zzahw zzj;
    private zzzl zzk;
    private boolean zzl;
    private final zzel zzb = new zzel(0);
    private final zzef zzd = new zzef(4096);
    private final SparseArray zzc = new SparseArray();
    private final zzahx zze = new zzahx();

    /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
    @Override // com.google.android.gms.internal.ads.zzzi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzzj zzzjVar, zzaai zzaaiVar) throws IOException {
        zzahc zzaheVar;
        zzdd.zzb(this.zzk);
        long zzd = zzzjVar.zzd();
        if (zzd != -1) {
            zzahx zzahxVar = this.zze;
            if (!zzahxVar.zze()) {
                return zzahxVar.zza(zzzjVar, zzaaiVar);
            }
        }
        if (!this.zzl) {
            this.zzl = true;
            zzahx zzahxVar2 = this.zze;
            if (zzahxVar2.zzb() != -9223372036854775807L) {
                zzahw zzahwVar = new zzahw(zzahxVar2.zzd(), zzahxVar2.zzb(), zzd);
                this.zzj = zzahwVar;
                this.zzk.zzN(zzahwVar.zzb());
            } else {
                this.zzk.zzN(new zzaak(zzahxVar2.zzb(), 0L));
            }
        }
        zzahw zzahwVar2 = this.zzj;
        if (zzahwVar2 != null && zzahwVar2.zze()) {
            return zzahwVar2.zza(zzzjVar, zzaaiVar);
        }
        zzzjVar.zzj();
        long zze = zzd != -1 ? zzd - zzzjVar.zze() : -1L;
        if ((zze != -1 && zze < 4) || !zzzjVar.zzm(this.zzd.zzH(), 0, 4, true)) {
            return -1;
        }
        this.zzd.zzF(0);
        int zze2 = this.zzd.zze();
        if (zze2 == 441) {
            return -1;
        }
        if (zze2 == 442) {
            zzyy zzyyVar = (zzyy) zzzjVar;
            zzyyVar.zzm(this.zzd.zzH(), 0, 10, false);
            this.zzd.zzF(9);
            zzyyVar.zzo((this.zzd.zzk() & 7) + 14, false);
            return 0;
        }
        if (zze2 == 443) {
            zzyy zzyyVar2 = (zzyy) zzzjVar;
            zzyyVar2.zzm(this.zzd.zzH(), 0, 2, false);
            this.zzd.zzF(0);
            zzyyVar2.zzo(this.zzd.zzo() + 6, false);
            return 0;
        }
        if ((zze2 >> 8) != 1) {
            ((zzyy) zzzjVar).zzo(1, false);
            return 0;
        }
        int i = zze2 & 255;
        zzahz zzahzVar = (zzahz) this.zzc.get(i);
        if (!this.zzf) {
            if (zzahzVar == null) {
                zzahc zzahcVar = null;
                if (i == 189) {
                    zzaheVar = new zzags(null);
                    this.zzg = true;
                    this.zzi = zzzjVar.zzf();
                } else if ((i & 224) == 192) {
                    zzaheVar = new zzahq(null);
                    this.zzg = true;
                    this.zzi = zzzjVar.zzf();
                } else {
                    if ((i & 240) == 224) {
                        zzaheVar = new zzahe(null);
                        this.zzh = true;
                        this.zzi = zzzjVar.zzf();
                    }
                    if (zzahcVar != null) {
                        zzahcVar.zzb(this.zzk, new zzaio(Integer.MIN_VALUE, i, 256));
                        zzahzVar = new zzahz(zzahcVar, this.zzb);
                        this.zzc.put(i, zzahzVar);
                    }
                }
                zzahcVar = zzaheVar;
                if (zzahcVar != null) {
                }
            }
            boolean z = this.zzg;
            long j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            if (z && this.zzh) {
                j = this.zzi + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            if (zzzjVar.zzf() > j) {
                this.zzf = true;
                this.zzk.zzC();
            }
        }
        zzyy zzyyVar3 = (zzyy) zzzjVar;
        zzyyVar3.zzm(this.zzd.zzH(), 0, 2, false);
        this.zzd.zzF(0);
        int zzo = this.zzd.zzo() + 6;
        if (zzahzVar == null) {
            zzyyVar3.zzo(zzo, false);
        } else {
            this.zzd.zzC(zzo);
            zzyyVar3.zzn(this.zzd.zzH(), 0, zzo, false);
            this.zzd.zzF(6);
            zzahzVar.zza(this.zzd);
            zzef zzefVar = this.zzd;
            zzefVar.zzE(zzefVar.zzb());
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzb(zzzl zzzlVar) {
        this.zzk = zzzlVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 != r7) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[LOOP:0: B:13:0x002c->B:15:0x0034, LOOP_END] */
    @Override // com.google.android.gms.internal.ads.zzzi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(long j, long j2) {
        zzahw zzahwVar;
        int i;
        zzel zzelVar = this.zzb;
        if (zzelVar.zze() != -9223372036854775807L) {
            long zzc = zzelVar.zzc();
            if (zzc != -9223372036854775807L) {
                if (zzc != 0) {
                }
            }
            zzahwVar = this.zzj;
            if (zzahwVar != null) {
                zzahwVar.zzd(j2);
            }
            for (i = 0; i < this.zzc.size(); i++) {
                ((zzahz) this.zzc.valueAt(i)).zzb();
            }
        }
        zzelVar.zzf(j2);
        zzahwVar = this.zzj;
        if (zzahwVar != null) {
        }
        while (i < this.zzc.size()) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zzd(zzzj zzzjVar) throws IOException {
        byte[] bArr = new byte[14];
        zzyy zzyyVar = (zzyy) zzzjVar;
        zzyyVar.zzm(bArr, 0, 14, false);
        if ((((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzyyVar.zzl(bArr[13] & 7, false);
        zzyyVar.zzm(bArr, 0, 3, false);
        return ((((bArr[0] & UByte.MAX_VALUE) << 16) | ((bArr[1] & UByte.MAX_VALUE) << 8)) | (bArr[2] & UByte.MAX_VALUE)) == 1;
    }
}
