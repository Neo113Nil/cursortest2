package com.google.android.gms.internal.ads;

import androidx.media3.extractor.ogg.OggPageHeader;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzajd {
    private final zzaje zza = new zzaje();
    private final zzef zzb = new zzef(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    zzajd() {
    }

    private final int zzf(int i) {
        int i2;
        int i3 = 0;
        this.zzd = 0;
        do {
            int i4 = this.zzd;
            int i5 = i + i4;
            zzaje zzajeVar = this.zza;
            if (i5 >= zzajeVar.zzc) {
                break;
            }
            this.zzd = i4 + 1;
            i2 = zzajeVar.zzf[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final void zza() {
        this.zza.zza();
        this.zzb.zza(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final zzaje zzc() {
        return this.zza;
    }

    public final zzef zzd() {
        return this.zzb;
    }

    public final void zze() {
        zzef zzefVar = this.zzb;
        if (zzefVar.zzi().length == 65025) {
            return;
        }
        zzefVar.zzb(Arrays.copyOf(zzefVar.zzi(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, zzefVar.zze())), zzefVar.zze());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(zzacv zzacvVar) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zza(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i = this.zzc;
            if (i < 0) {
                zzaje zzajeVar = this.zza;
                if (!zzajeVar.zzb(zzacvVar, -1L) || !zzajeVar.zzc(zzacvVar, true)) {
                    break;
                }
                int i2 = zzajeVar.zzd;
                if ((zzajeVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    i2 += zzf(0);
                    i = this.zzd;
                } else {
                    i = 0;
                }
                if (!zzacy.zzd(zzacvVar, i2)) {
                    return false;
                }
                this.zzc = i;
            }
            int zzf = zzf(i);
            int i3 = this.zzc + this.zzd;
            if (zzf > 0) {
                zzef zzefVar = this.zzb;
                zzefVar.zzc(zzefVar.zze() + zzf);
                if (!zzacy.zzc(zzacvVar, zzefVar.zzi(), zzefVar.zze(), zzf)) {
                    return false;
                }
                zzefVar.zzf(zzefVar.zze() + zzf);
                this.zze = this.zza.zzf[i3 + (-1)] != 255;
            }
            if (i3 == this.zza.zzc) {
                i3 = -1;
            }
            this.zzc = i3;
        }
    }
}
