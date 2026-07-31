package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzgnd {
    private final zzavl zza;
    private final long zzb;
    private final long zzc;
    private final String zzd;

    private zzgnd(zzavl zzavlVar, long j, long j2, String str) {
        this.zza = zzavlVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = str;
    }

    static /* synthetic */ zzgnd zza(zzavl zzavlVar, byte[] bArr, boolean z) {
        zzavlVar.zza();
        zzavlVar.zzb(bArr);
        List list = (List) zzavlVar.zzc(Optional.empty());
        long longValue = ((Long) list.get(0)).longValue();
        long longValue2 = ((Long) list.get(1)).longValue();
        long longValue3 = ((Long) list.get(2)).longValue();
        zzavlVar.zzd(longValue, Optional.empty());
        String zza = zzgfd.zza(zzavo.zza(), false);
        int length = zza.length();
        String str = true != z ? "" : "-s";
        StringBuilder sb = new StringBuilder(length + 12 + str.length());
        sb.append("3.904631200.");
        sb.append(zza);
        sb.append(str);
        return new zzgnd(zzavlVar, longValue2, longValue3, sb.toString());
    }

    final /* synthetic */ String zzb(Map map) {
        return zzgfd.zza((byte[]) this.zza.zzd(this.zzb, Optional.of(map)), true);
    }

    final /* synthetic */ void zzc(Map map) {
        this.zza.zzd(this.zzc, Optional.of(map));
    }

    final /* synthetic */ String zzd() {
        return this.zzd;
    }
}
