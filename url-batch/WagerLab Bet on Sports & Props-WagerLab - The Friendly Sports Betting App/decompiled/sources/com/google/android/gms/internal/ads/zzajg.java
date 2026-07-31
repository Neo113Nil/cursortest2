package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.OpusUtil;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzajg extends zzajj {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    zzajg() {
    }

    public static boolean zzd(zzef zzefVar) {
        return zzk(zzefVar, zza);
    }

    private static boolean zzk(zzef zzefVar, byte[] bArr) {
        if (zzefVar.zzd() < 8) {
            return false;
        }
        int zzg = zzefVar.zzg();
        byte[] bArr2 = new byte[8];
        zzefVar.zzm(bArr2, 0, 8);
        zzefVar.zzh(zzg);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    protected final long zzb(zzef zzefVar) {
        return zzi(zzadr.zzd(zzefVar.zzi()));
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzef zzefVar, long j, zzajh zzajhVar) throws zzas {
        if (zzk(zzefVar, zza)) {
            byte[] copyOf = Arrays.copyOf(zzefVar.zzi(), zzefVar.zze());
            int i = copyOf[9] & 255;
            List zza2 = zzadr.zza(copyOf);
            if (zzajhVar.zza != null) {
                return true;
            }
            zzs zzsVar = new zzs();
            zzsVar.zzl(MimeTypes.AUDIO_OGG);
            zzsVar.zzm(MimeTypes.AUDIO_OPUS);
            zzsVar.zzE(i);
            zzsVar.zzF(OpusUtil.SAMPLE_RATE);
            zzsVar.zzp(zza2);
            zzajhVar.zza = zzsVar.zzM();
            return true;
        }
        if (!zzk(zzefVar, zzb)) {
            zzajhVar.zza.getClass();
            return false;
        }
        zzajhVar.zza.getClass();
        if (this.zzc) {
            return true;
        }
        this.zzc = true;
        zzefVar.zzk(8);
        zzao zzc = zzaeh.zzc(zzgjz.zzr(zzaeh.zzb(zzefVar, false, false).zza));
        if (zzc == null) {
            return true;
        }
        zzs zza3 = zzajhVar.zza.zza();
        zza3.zzk(zzc.zzc(zzajhVar.zza.zzl));
        zzajhVar.zza = zza3.zzM();
        return true;
    }
}
