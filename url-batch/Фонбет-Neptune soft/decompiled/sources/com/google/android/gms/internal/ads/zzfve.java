package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfve implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfvh zzb;

    zzfve(zzfvh zzfvhVar, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzfvhVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzf;
        zzf = this.zzb.zzf(this.zza);
        return zzf;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzfum.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
