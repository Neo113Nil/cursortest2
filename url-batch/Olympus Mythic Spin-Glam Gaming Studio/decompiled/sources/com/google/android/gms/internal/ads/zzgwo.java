package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzgwo extends AbstractSet {
    final /* synthetic */ zzgwt zza;

    /* synthetic */ zzgwo(zzgwt zzgwtVar, byte[] bArr) {
        Objects.requireNonNull(zzgwtVar);
        this.zza = zzgwtVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        zzgwt zzgwtVar = this.zza;
        Map zzc = zzgwtVar.zzc();
        if (zzc != null) {
            return zzc.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int zzi = zzgwtVar.zzi(entry.getKey());
            if (zzi != -1 && Objects.equals(zzgwtVar.zzp(zzi), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgwt zzgwtVar = this.zza;
        Map zzc = zzgwtVar.zzc();
        return zzc != null ? zzc.entrySet().iterator() : new zzgwm(zzgwtVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zzgwt zzgwtVar = this.zza;
        Map zzc = zzgwtVar.zzc();
        if (zzc != null) {
            return zzc.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (zzgwtVar.zzb()) {
            return false;
        }
        int zzh = zzgwtVar.zzh();
        int zze = zzgwu.zze(entry.getKey(), entry.getValue(), zzh, zzgwtVar.zzk(), zzgwtVar.zzl(), zzgwtVar.zzm(), zzgwtVar.zzn());
        if (zze == -1) {
            return false;
        }
        zzgwtVar.zze(zze, zzh);
        zzgwtVar.zzu(zzgwtVar.zzt() - 1);
        zzgwtVar.zzd();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
