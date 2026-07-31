package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
final class zzank extends zzann {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    zzank() {
    }

    public static boolean zzd(zzeu zzeuVar) {
        return zzk(zzeuVar, zza);
    }

    private static boolean zzk(zzeu zzeuVar, byte[] bArr) {
        if (zzeuVar.zzd() < 8) {
            return false;
        }
        int zzg = zzeuVar.zzg();
        byte[] bArr2 = new byte[8];
        zzeuVar.zzm(bArr2, 0, 8);
        zzeuVar.zzh(zzg);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzann
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzann
    protected final long zzb(zzeu zzeuVar) {
        return zzi(zzgy.zzd(zzeuVar.zzi()));
    }

    @Override // com.google.android.gms.internal.ads.zzann
    protected final boolean zzc(zzeu zzeuVar, long j, zzanl zzanlVar) throws zzat {
        if (zzk(zzeuVar, zza)) {
            byte[] copyOf = Arrays.copyOf(zzeuVar.zzi(), zzeuVar.zze());
            int i = copyOf[9] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            List zza2 = zzgy.zza(copyOf);
            if (zzanlVar.zza != null) {
                return true;
            }
            zzt zztVar = new zzt();
            zztVar.zzn("audio/ogg");
            zztVar.zzo("audio/opus");
            zztVar.zzH(i);
            zztVar.zzJ(48000);
            zztVar.zzr(zza2);
            zzanlVar.zza = zztVar.zzQ();
            return true;
        }
        if (!zzk(zzeuVar, zzb)) {
            zzanlVar.zza.getClass();
            return false;
        }
        zzanlVar.zza.getClass();
        if (this.zzc) {
            return true;
        }
        this.zzc = true;
        zzeuVar.zzk(8);
        zzap zzb2 = zzahv.zzb(zzgxm.zzr(zzhh.zzb(zzeuVar, false, false).zza));
        if (zzb2 == null) {
            return true;
        }
        zzt zza3 = zzanlVar.zza.zza();
        zza3.zzl(zzb2.zzf(zzanlVar.zza.zzl));
        zzanlVar.zza = zza3.zzQ();
        return true;
    }
}
