package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaly implements zzack {
    private final zzalz zza = new zzalz(null, 0);
    private final zzek zzb = new zzek(16384);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzack
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) throws IOException {
        int zza = zzaclVar.zza(this.zzb.zzM(), 0, 16384);
        if (zza == -1) {
            return -1;
        }
        this.zzb.zzK(0);
        this.zzb.zzJ(zza);
        if (!this.zzc) {
            this.zza.zzd(0L, 4);
            this.zzc = true;
        }
        this.zza.zza(this.zzb);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return zzfxr.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        this.zza.zzb(zzacnVar, new zzans(Integer.MIN_VALUE, 0, 1));
        zzacnVar.zzD();
        zzacnVar.zzO(new zzadh(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j, long j2) {
        this.zzc = false;
        this.zza.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        r16.zzj();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if ((r4 - r3) >= 8192) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.ads.zzack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzj(zzacl zzaclVar) throws IOException {
        zzaby zzabyVar;
        int i;
        zzek zzekVar = new zzek(10);
        int i2 = 0;
        while (true) {
            zzabyVar = (zzaby) zzaclVar;
            zzabyVar.zzm(zzekVar.zzM(), 0, 10, false);
            zzekVar.zzK(0);
            if (zzekVar.zzo() != 4801587) {
                break;
            }
            zzekVar.zzL(3);
            int zzl = zzekVar.zzl();
            i2 += zzl + 10;
            zzabyVar.zzl(zzl, false);
        }
        zzaclVar.zzj();
        zzabyVar.zzl(i2, false);
        int i3 = i2;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = 7;
                zzabyVar.zzm(zzekVar.zzM(), 0, 7, false);
                zzekVar.zzK(0);
                int zzq = zzekVar.zzq();
                if (zzq != 44096 && zzq != 44097) {
                    break;
                }
                i4++;
                if (i4 >= 4) {
                    return true;
                }
                byte[] zzM = zzekVar.zzM();
                int i6 = zzabm.zza;
                if (zzM.length < 7) {
                    i = -1;
                } else {
                    int i7 = ((zzM[2] & 255) << 8) | (zzM[3] & 255);
                    if (i7 == 65535) {
                        i7 = ((zzM[4] & 255) << 16) | ((zzM[5] & 255) << 8) | (zzM[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (zzq == 44097) {
                        i5 += 2;
                    }
                    i = i7 + i5;
                }
                if (i == -1) {
                    return false;
                }
                zzabyVar.zzl(i - 7, false);
            }
            zzabyVar.zzl(i3, false);
        }
    }
}
