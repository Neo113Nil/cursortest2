package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
final class zzane extends zzann {

    @Nullable
    private zzagu zza;

    @Nullable
    private zzand zzb;

    zzane() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzann
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzann
    protected final long zzb(zzeu zzeuVar) {
        if (!zzd(zzeuVar.zzi())) {
            return -1L;
        }
        int i = (zzeuVar.zzi()[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int zzc = zzagp.zzc(zzeuVar, i);
            zzeuVar.zzh(0);
            return zzc;
        }
        zzeuVar.zzk(4);
        zzeuVar.zzO();
        int zzc2 = zzagp.zzc(zzeuVar, i);
        zzeuVar.zzh(0);
        return zzc2;
    }

    @Override // com.google.android.gms.internal.ads.zzann
    protected final boolean zzc(zzeu zzeuVar, long j, zzanl zzanlVar) {
        byte[] zzi = zzeuVar.zzi();
        zzagu zzaguVar = this.zza;
        if (zzaguVar == null) {
            zzagu zzaguVar2 = new zzagu(zzi, 17);
            this.zza = zzaguVar2;
            zzt zza = zzaguVar2.zzc(Arrays.copyOfRange(zzi, 9, zzeuVar.zze()), null).zza();
            zza.zzn("audio/ogg");
            zzanlVar.zza = zza.zzQ();
            return true;
        }
        if ((zzi[0] & Byte.MAX_VALUE) == 3) {
            zzagt zzc = zzagr.zzc(zzeuVar);
            zzagu zze = zzaguVar.zze(zzc);
            this.zza = zze;
            this.zzb = new zzand(zze, zzc);
            return true;
        }
        if (!zzd(zzi)) {
            return true;
        }
        zzand zzandVar = this.zzb;
        if (zzandVar != null) {
            zzandVar.zzd(j);
            zzanlVar.zzb = this.zzb;
        }
        zzanlVar.zza.getClass();
        return false;
    }
}
