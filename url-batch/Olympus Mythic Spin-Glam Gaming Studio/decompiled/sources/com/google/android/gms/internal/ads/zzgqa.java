package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzgqa implements zzgpx {
    private final zzgrh zza;
    private final long zzb;

    zzgqa(zzgdq zzgdqVar, zzgrh zzgrhVar, long j) {
        this.zza = zzgrhVar;
        this.zzb = j;
    }

    private static boolean zzc(zzggt zzggtVar) {
        int zza = zzggtVar.zzb().zza().zza();
        int zzb = zzggtVar.zzb().zza().zzb();
        byte[] versionArray = zzavo.zza();
        Intrinsics.checkNotNullParameter(versionArray, "versionArray");
        ByteBuffer allocate = ByteBuffer.allocate(6);
        Intrinsics.checkNotNullExpressionValue(allocate, "allocate(...)");
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort((short) zza);
        allocate.putInt(zzb);
        byte[] array = allocate.array();
        Intrinsics.checkNotNullExpressionValue(array, "array(...)");
        return Arrays.equals(array, versionArray);
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final boolean zza(zzggt zzggtVar) {
        if (zzggtVar == null || zzggtVar.equals(zzggt.zzh())) {
            this.zza.zzb(20202);
            return true;
        }
        if (!zzc(zzggtVar)) {
            this.zza.zzb(20205);
            return true;
        }
        boolean z = zzggtVar.zzb().zzc() - System.currentTimeMillis() <= this.zzb;
        if (z) {
            this.zza.zzb(20203);
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final boolean zzb(zzggt zzggtVar) {
        if (zzggtVar == null || zzggtVar.equals(zzggt.zzh())) {
            this.zza.zzb(20204);
            return false;
        }
        if (zzc(zzggtVar)) {
            return true;
        }
        this.zza.zzb(20206);
        return false;
    }
}
