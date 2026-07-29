package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfrk implements Map, Serializable {

    @CheckForNull
    private transient zzfrm zza;

    @CheckForNull
    private transient zzfrm zzb;

    @CheckForNull
    private transient zzfrc zzc;

    zzfrk() {
    }

    public static zzfrk zzc(Map map) {
        Set entrySet = map.entrySet();
        zzfrj zzfrjVar = new zzfrj(entrySet instanceof Collection ? entrySet.size() : 4);
        zzfrjVar.zzb(entrySet);
        return zzfrjVar.zzc();
    }

    public static zzfrk zzd() {
        return zzfsv.zza;
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
        return zzfsc.zzb(this, obj);
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
        return zzftc.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzfrm zzfrmVar = this.zzb;
        if (zzfrmVar != null) {
            return zzfrmVar;
        }
        zzfrm zzf = zzf();
        this.zzb = zzf;
        return zzf;
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
        zzfqg.zza(size, "size");
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

    abstract zzfrc zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzfrc values() {
        zzfrc zzfrcVar = this.zzc;
        if (zzfrcVar != null) {
            return zzfrcVar;
        }
        zzfrc zza = zza();
        this.zzc = zza;
        return zza;
    }

    abstract zzfrm zze();

    abstract zzfrm zzf();

    @Override // java.util.Map
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzfrm entrySet() {
        zzfrm zzfrmVar = this.zza;
        if (zzfrmVar != null) {
            return zzfrmVar;
        }
        zzfrm zze = zze();
        this.zza = zze;
        return zze;
    }
}
