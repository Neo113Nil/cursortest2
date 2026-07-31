package com.google.android.gms.internal.playcore_hsdp;

import java.io.Serializable;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes13.dex */
public final class zzj {
    public static zzg zza(zzg zzgVar) {
        return ((zzgVar instanceof zzi) || (zzgVar instanceof zzh)) ? zzgVar : zzgVar instanceof Serializable ? new zzh(zzgVar) : new zzi(zzgVar);
    }
}
