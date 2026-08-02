package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzfvq implements Map, Serializable {

    @CheckForNull
    private transient zzfvs zza;

    @CheckForNull
    private transient zzfvs zzb;

    @CheckForNull
    private transient zzfvi zzc;

    zzfvq() {
    }

    public static zzfvq zzc(Map map) {
        Set entrySet = map.entrySet();
        zzfvp zzfvpVar = new zzfvp(entrySet instanceof Collection ? entrySet.size() : 4);
        zzfvpVar.zzb(entrySet);
        return zzfvpVar.zzc();
    }

    public static zzfvq zzd() {
        return zzfxb.zza;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        return zzfwi.zzb(this, obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract Object get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzfxi.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfum.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    abstract zzfvi zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzfvi values() {
        zzfvi zzfviVar = this.zzc;
        if (zzfviVar != null) {
            return zzfviVar;
        }
        zzfvi zza = zza();
        this.zzc = zza;
        return zza;
    }

    abstract zzfvs zze();

    abstract zzfvs zzf();

    @Override // java.util.Map
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzfvs entrySet() {
        zzfvs zzfvsVar = this.zza;
        if (zzfvsVar != null) {
            return zzfvsVar;
        }
        zzfvs zze = zze();
        this.zza = zze;
        return zze;
    }

    @Override // java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzfvs keySet() {
        zzfvs zzfvsVar = this.zzb;
        if (zzfvsVar != null) {
            return zzfvsVar;
        }
        zzfvs zzf = zzf();
        this.zzb = zzf;
        return zzf;
    }
}
