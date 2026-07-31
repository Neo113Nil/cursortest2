package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzgjf extends AbstractSet {
    final /* synthetic */ zzgjk zza;

    /* synthetic */ zzgjf(zzgjk zzgjkVar, byte[] bArr) {
        Objects.requireNonNull(zzgjkVar);
        this.zza = zzgjkVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        zzgjk zzgjkVar = this.zza;
        Map zzc = zzgjkVar.zzc();
        if (zzc != null) {
            return zzc.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int zzi = zzgjkVar.zzi(entry.getKey());
            if (zzi != -1 && Objects.equals(zzgjkVar.zzp(zzi), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgjk zzgjkVar = this.zza;
        Map zzc = zzgjkVar.zzc();
        return zzc != null ? zzc.entrySet().iterator() : new zzgjd(zzgjkVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzh;
        int zze;
        zzgjk zzgjkVar = this.zza;
        Map zzc = zzgjkVar.zzc();
        if (zzc != null) {
            return zzc.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (zzgjkVar.zzb() || (zze = zzgjl.zze(entry.getKey(), entry.getValue(), (zzh = zzgjkVar.zzh()), zzgjkVar.zzk(), zzgjkVar.zzl(), zzgjkVar.zzm(), zzgjkVar.zzn())) == -1) {
            return false;
        }
        zzgjkVar.zze(zze, zzh);
        zzgjkVar.zzu(zzgjkVar.zzt() - 1);
        zzgjkVar.zzd();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
