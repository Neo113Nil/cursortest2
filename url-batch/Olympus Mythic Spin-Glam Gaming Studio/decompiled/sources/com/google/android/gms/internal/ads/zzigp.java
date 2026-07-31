package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzigp {
    private final zzigo zza;

    private zzigp(zziin zziinVar, Object obj, zziin zziinVar2, Object obj2) {
        this.zza = new zzigo(zziinVar, "", zziinVar2, obj2);
    }

    public static zzigp zza(zziin zziinVar, Object obj, zziin zziinVar2, Object obj2) {
        return new zzigp(zziinVar, "", zziinVar2, obj2);
    }

    static void zzb(zzier zzierVar, zzigo zzigoVar, Object obj, Object obj2) throws IOException {
        zzifb.zzf(zzierVar, zzigoVar.zza, 1, obj);
        zzifb.zzf(zzierVar, zzigoVar.zzc, 2, obj2);
    }

    static int zzc(zzigo zzigoVar, Object obj, Object obj2) {
        return zzifb.zzh(zzigoVar.zza, 1, obj) + zzifb.zzh(zzigoVar.zzc, 2, obj2);
    }

    public final int zzd(int i, Object obj, Object obj2) {
        zzigo zzigoVar = this.zza;
        int zzF = zzier.zzF(i << 3);
        int zzc = zzc(zzigoVar, obj, obj2);
        return zzF + zzier.zzF(zzc) + zzc;
    }

    final zzigo zze() {
        return this.zza;
    }
}
