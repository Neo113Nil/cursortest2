package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
class zzang<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private Object[] zza;
    private int zzb;
    private Map<K, V> zzc;
    private boolean zzd;
    private volatile zzanm zze;
    private Map<K, V> zzf;

    private final int zza(K k) {
        int i;
        int i2 = this.zzb;
        int i3 = i2 - 1;
        if (i3 >= 0) {
            int compareTo = k.compareTo((Comparable) ((zzank) this.zza[i3]).getKey());
            if (compareTo > 0) {
                i = i2 + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i3;
            }
        }
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            int compareTo2 = k.compareTo((Comparable) ((zzank) this.zza[i5]).getKey());
            if (compareTo2 < 0) {
                i3 = i5 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i5;
                }
                i4 = i5 + 1;
            }
        }
        i = i4 + 1;
        return -i;
    }

    public final int zzb() {
        return this.zzb;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i = this.zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.zza[i3].hashCode();
        }
        return this.zzc.size() > 0 ? i2 + this.zzc.hashCode() : i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzb + this.zzc.size();
    }

    public final Iterable<Map.Entry<K, V>> zzc() {
        if (this.zzc.isEmpty()) {
            return Collections.emptySet();
        }
        return this.zzc.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzang<K, V>) comparable);
        if (zza >= 0) {
            return (V) ((zzank) this.zza[zza]).getValue();
        }
        return this.zzc.get(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V zza(K k, V v) {
        zzg();
        int zza = zza((zzang<K, V>) k);
        if (zza >= 0) {
            return (V) ((zzank) this.zza[zza]).setValue(v);
        }
        zzg();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i = -(zza + 1);
        if (i >= 16) {
            return zzf().put(k, v);
        }
        int i2 = this.zzb;
        if (i2 == 16) {
            zzank zzankVar = (zzank) this.zza[15];
            this.zzb = i2 - 1;
            zzf().put((Comparable) zzankVar.getKey(), zzankVar.getValue());
        }
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i, objArr, i + 1, (objArr.length - i) - 1);
        this.zza[i] = new zzank(this, k, v);
        this.zzb++;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzang<K, V>) obj, (Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzg();
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzang<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzb(zza);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzb(int i) {
        zzg();
        V v = (V) ((zzank) this.zza[i]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i + 1, objArr, i, (this.zzb - i) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzf().entrySet().iterator();
            this.zza[this.zzb] = new zzank(this, it.next());
            this.zzb++;
            it.remove();
        }
        return v;
    }

    public final Map.Entry<K, V> zza(int i) {
        if (i >= this.zzb) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        return (zzank) this.zza[i];
    }

    final Set<Map.Entry<K, V>> zzd() {
        return new zzanh(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zzanm(this);
        }
        return this.zze;
    }

    private final SortedMap<K, V> zzf() {
        zzg();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    private zzang() {
        this.zzc = Collections.emptyMap();
        this.zzf = Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzg();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    public void zza() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.zzd) {
            return;
        }
        if (this.zzc.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.zzc);
        }
        this.zzc = unmodifiableMap;
        if (this.zzf.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.zzf);
        }
        this.zzf = unmodifiableMap2;
        this.zzd = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza((zzang<K, V>) comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzang)) {
            return super.equals(obj);
        }
        zzang zzangVar = (zzang) obj;
        int size = size();
        if (size != zzangVar.size()) {
            return false;
        }
        int i = this.zzb;
        if (i != zzangVar.zzb) {
            return entrySet().equals(zzangVar.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!zza(i2).equals(zzangVar.zza(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.zzc.equals(zzangVar.zzc);
        }
        return true;
    }

    public final boolean zze() {
        return this.zzd;
    }
}
