package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzagg {
    private final zzagh zza = new zzagh();
    private final zzef zzb = new zzef(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    zzagg() {
    }

    private final int zzf(int i) {
        int i2;
        int i3 = 0;
        this.zzd = 0;
        do {
            int i4 = this.zzd;
            int i5 = i + i4;
            zzagh zzaghVar = this.zza;
            if (i5 >= zzaghVar.zzc) {
                break;
            }
            int[] iArr = zzaghVar.zzf;
            this.zzd = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final zzef zza() {
        return this.zzb;
    }

    public final zzagh zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zza();
        this.zzb.zzC(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final void zzd() {
        zzef zzefVar = this.zzb;
        if (zzefVar.zzH().length == 65025) {
            return;
        }
        zzefVar.zzD(Arrays.copyOf(zzefVar.zzH(), Math.max(65025, zzefVar.zzd())), this.zzb.zzd());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zze(zzzj zzzjVar) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zzC(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i = this.zzc;
            if (i < 0) {
                if (!this.zza.zzc(zzzjVar, -1L) || !this.zza.zzb(zzzjVar, true)) {
                    break;
                }
                zzagh zzaghVar = this.zza;
                int i2 = zzaghVar.zzd;
                if ((zzaghVar.zza & 1) == 1 && this.zzb.zzd() == 0) {
                    i2 += zzf(0);
                    i = this.zzd;
                } else {
                    i = 0;
                }
                if (!zzzm.zze(zzzjVar, i2)) {
                    return false;
                }
                this.zzc = i;
            }
            int zzf = zzf(i);
            int i3 = this.zzc + this.zzd;
            if (zzf > 0) {
                zzef zzefVar = this.zzb;
                zzefVar.zzz(zzefVar.zzd() + zzf);
                zzef zzefVar2 = this.zzb;
                if (!zzzm.zzd(zzzjVar, zzefVar2.zzH(), zzefVar2.zzd(), zzf)) {
                    return false;
                }
                zzef zzefVar3 = this.zzb;
                zzefVar3.zzE(zzefVar3.zzd() + zzf);
                this.zze = this.zza.zzf[i3 + (-1)] != 255;
            }
            if (i3 == this.zza.zzc) {
                i3 = -1;
            }
            this.zzc = i3;
        }
    }
}
