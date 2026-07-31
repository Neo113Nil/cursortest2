package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public interface zzacu {
    boolean zzd(zzacv zzacvVar) throws IOException;

    default List zze() {
        return zzgjz.zzi();
    }

    void zzf(zzacx zzacxVar);

    int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException;

    void zzh(long j, long j2);

    @SideEffectFree
    default zzacu zzi() {
        return this;
    }
}
