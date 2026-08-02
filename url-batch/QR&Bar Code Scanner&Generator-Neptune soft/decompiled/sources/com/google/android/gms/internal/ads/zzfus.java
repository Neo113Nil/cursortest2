package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfus extends AbstractSet {
    final /* synthetic */ zzfux zza;

    zzfus(zzfux zzfuxVar) {
        this.zza = zzfuxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        int zzv;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzv = this.zza.zzv(entry.getKey());
            if (zzv != -1 && zzfss.zza(zzfux.zzj(this.zza, zzv), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfux zzfuxVar = this.zza;
        Map zzl = zzfuxVar.zzl();
        return zzl != null ? zzl.entrySet().iterator() : new zzfuq(zzfuxVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        int zzu;
        int[] zzz;
        Object[] zzA;
        Object[] zzB;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzfux zzfuxVar = this.zza;
        if (zzfuxVar.zzq()) {
            return false;
        }
        zzu = zzfuxVar.zzu();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object zzk = zzfux.zzk(this.zza);
        zzz = this.zza.zzz();
        zzA = this.zza.zzA();
        zzB = this.zza.zzB();
        int zzb = zzfuy.zzb(key, value, zzu, zzk, zzz, zzA, zzB);
        if (zzb == -1) {
            return false;
        }
        this.zza.zzp(zzb, zzu);
        zzfux.zzb(this.zza);
        this.zza.zzn();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
