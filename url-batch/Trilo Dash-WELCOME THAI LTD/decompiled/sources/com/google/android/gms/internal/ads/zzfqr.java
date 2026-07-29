package com.google.android.gms.internal.ads;

import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
final class zzfqr extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();

    @CheckForNull
    transient int[] zza;

    @CheckForNull
    transient Object[] zzb;

    @CheckForNull
    transient Object[] zzc;

    @CheckForNull
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;

    @CheckForNull
    private transient Set zzh;

    @CheckForNull
    private transient Set zzi;

    @CheckForNull
    private transient Collection zzj;

    zzfqr() {
        zzo(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzA() {
        Object[] objArr = this.zzb;
        objArr.getClass();
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzc;
        objArr.getClass();
        return objArr;
    }

    static /* synthetic */ int zzb(zzfqr zzfqrVar) {
        int i = zzfqrVar.zzg;
        zzfqrVar.zzg = i - 1;
        return i;
    }

    static /* synthetic */ Object zzg(zzfqr zzfqrVar, int i) {
        return zzfqrVar.zzA()[i];
    }

    static /* synthetic */ Object zzj(zzfqr zzfqrVar, int i) {
        return zzfqrVar.zzB()[i];
    }

    static /* synthetic */ Object zzk(zzfqr zzfqrVar) {
        Object obj = zzfqrVar.zze;
        obj.getClass();
        return obj;
    }

    static /* synthetic */ void zzm(zzfqr zzfqrVar, int i, Object obj) {
        zzfqrVar.zzB()[i] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzu() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv(@CheckForNull Object obj) {
        if (zzq()) {
            return -1;
        }
        int zzb = zzfqz.zzb(obj);
        int zzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int zzc = zzfqs.zzc(obj2, zzb & zzu);
        if (zzc != 0) {
            int i = zzu ^ (-1);
            int i2 = zzb & i;
            do {
                int i3 = zzc - 1;
                int i4 = zzz()[i3];
                if ((i4 & i) == i2 && zzfoo.zza(obj, zzA()[i3])) {
                    return i3;
                }
                zzc = i4 & zzu;
            } while (zzc != 0);
        }
        return -1;
    }

    private final int zzw(int i, int i2, int i3, int i4) {
        Object zzd2 = zzfqs.zzd(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            zzfqs.zze(zzd2, i3 & i5, i4 + 1);
        }
        Object obj = this.zze;
        obj.getClass();
        int[] zzz = zzz();
        for (int i6 = 0; i6 <= i; i6++) {
            int zzc = zzfqs.zzc(obj, i6);
            while (zzc != 0) {
                int i7 = zzc - 1;
                int i8 = zzz[i7];
                int i9 = ((i ^ (-1)) & i8) | i6;
                int i10 = i9 & i5;
                int zzc2 = zzfqs.zzc(zzd2, i10);
                zzfqs.zze(zzd2, i10, zzc);
                zzz[i7] = ((i5 ^ (-1)) & i9) | (zzc2 & i5);
                zzc = i8 & i;
            }
        }
        this.zze = zzd2;
        zzy(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzx(@CheckForNull Object obj) {
        if (zzq()) {
            return zzd;
        }
        int zzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int zzb = zzfqs.zzb(obj, null, zzu, obj2, zzz(), zzA(), null);
        if (zzb == -1) {
            return zzd;
        }
        Object obj3 = zzB()[zzb];
        zzp(zzb, zzu);
        this.zzg--;
        zzn();
        return obj3;
    }

    private final void zzy(int i) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzz() {
        int[] iArr = this.zza;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzq()) {
            return;
        }
        zzn();
        Map zzl = zzl();
        if (zzl != null) {
            this.zzf = zzftm.zzb(size(), 3, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            zzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzA(), 0, this.zzg, (Object) null);
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzz(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map zzl = zzl();
        return zzl != null ? zzl.containsKey(obj) : zzv(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.containsValue(obj);
        }
        for (int i = 0; i < this.zzg; i++) {
            if (zzfoo.zza(obj, zzB()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzfqm zzfqmVar = new zzfqm(this);
        this.zzi = zzfqmVar;
        return zzfqmVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.get(obj);
        }
        int zzv = zzv(obj);
        if (zzv == -1) {
            return null;
        }
        return zzB()[zzv];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzfqo zzfqoVar = new zzfqo(this);
        this.zzh = zzfqoVar;
        return zzfqoVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object put(Object obj, Object obj2) {
        int min;
        if (zzq()) {
            zzfos.zzi(zzq(), "Arrays already allocated");
            int i = this.zzf;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = BasicMeasure.EXACTLY;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzfqs.zzd(max2);
            zzy(max2 - 1);
            this.zza = new int[i];
            this.zzb = new Object[i];
            this.zzc = new Object[i];
        }
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.put(obj, obj2);
        }
        int[] zzz = zzz();
        Object[] zzA = zzA();
        Object[] zzB = zzB();
        int i2 = this.zzg;
        int i3 = i2 + 1;
        int zzb = zzfqz.zzb(obj);
        int zzu = zzu();
        int i4 = zzb & zzu;
        Object obj3 = this.zze;
        obj3.getClass();
        int zzc = zzfqs.zzc(obj3, i4);
        if (zzc != 0) {
            int i5 = zzu ^ (-1);
            int i6 = zzb & i5;
            int i7 = 0;
            while (true) {
                int i8 = zzc - 1;
                int i9 = zzz[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && zzfoo.zza(obj, zzA[i8])) {
                    Object obj4 = zzB[i8];
                    zzB[i8] = obj2;
                    return obj4;
                }
                int i11 = i9 & zzu;
                i7++;
                if (i11 != 0) {
                    zzc = i11;
                } else {
                    if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzu() + 1, 1.0f);
                        int zze = zze();
                        while (zze >= 0) {
                            linkedHashMap.put(zzA()[zze], zzB()[zze]);
                            zze = zzf(zze);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzn();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i3 > zzu) {
                        zzu = zzw(zzu, zzfqs.zza(zzu), zzb, i2);
                    } else {
                        zzz[i8] = (i3 & zzu) | i10;
                    }
                }
            }
        } else if (i3 > zzu) {
            zzu = zzw(zzu, zzfqs.zza(zzu), zzb, i2);
        } else {
            Object obj5 = this.zze;
            obj5.getClass();
            zzfqs.zze(obj5, i4, i3);
        }
        int length = zzz().length;
        if (i3 > length && (min = Math.min(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(zzz(), min);
            this.zzb = Arrays.copyOf(zzA(), min);
            this.zzc = Arrays.copyOf(zzB(), min);
        }
        zzz()[i2] = (zzu ^ (-1)) & zzb;
        zzA()[i2] = obj;
        zzB()[i2] = obj2;
        this.zzg = i3;
        zzn();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object remove(@CheckForNull Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.remove(obj);
        }
        Object zzx = zzx(obj);
        if (zzx == zzd) {
            return null;
        }
        return zzx;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map zzl = zzl();
        return zzl != null ? zzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzfqq zzfqqVar = new zzfqq(this);
        this.zzj = zzfqqVar;
        return zzfqqVar;
    }

    final int zze() {
        return isEmpty() ? -1 : 0;
    }

    final int zzf(int i) {
        int i2 = i + 1;
        if (i2 < this.zzg) {
            return i2;
        }
        return -1;
    }

    @CheckForNull
    final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void zzn() {
        this.zzf += 32;
    }

    final void zzo(int i) {
        this.zzf = zzftm.zzb(8, 1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    final void zzp(int i, int i2) {
        Object obj = this.zze;
        obj.getClass();
        int[] zzz = zzz();
        Object[] zzA = zzA();
        Object[] zzB = zzB();
        int size = size() - 1;
        if (i >= size) {
            zzA[i] = null;
            zzB[i] = null;
            zzz[i] = 0;
            return;
        }
        Object obj2 = zzA[size];
        zzA[i] = obj2;
        zzB[i] = zzB[size];
        zzA[size] = null;
        zzB[size] = null;
        zzz[i] = zzz[size];
        zzz[size] = 0;
        int zzb = zzfqz.zzb(obj2) & i2;
        int zzc = zzfqs.zzc(obj, zzb);
        int i3 = size + 1;
        if (zzc == i3) {
            zzfqs.zze(obj, zzb, i + 1);
            return;
        }
        while (true) {
            int i4 = zzc - 1;
            int i5 = zzz[i4];
            int i6 = i5 & i2;
            if (i6 == i3) {
                zzz[i4] = ((i + 1) & i2) | (i5 & (i2 ^ (-1)));
                return;
            }
            zzc = i6;
        }
    }

    final boolean zzq() {
        return this.zze == null;
    }

    zzfqr(int i) {
        zzo(8);
    }
}
