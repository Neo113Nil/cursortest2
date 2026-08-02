package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgrv extends zzgpg implements RandomAccess, zzgrw {
    public static final zzgrw zza;
    private static final zzgrv zzb;
    private final List zzc;

    static {
        zzgrv zzgrvVar = new zzgrv(10);
        zzb = zzgrvVar;
        zzgrvVar.zzb();
        zza = zzgrvVar;
    }

    public zzgrv() {
        this(10);
    }

    private static String zzj(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzgpw ? ((zzgpw) obj).zzA(zzgro.zzb) : zzgro.zzh((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgpg, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zzbM();
        this.zzc.add(i, (String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgpg, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        zzbM();
        if (collection instanceof zzgrw) {
            collection = ((zzgrw) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.ads.zzgpg, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbM();
        this.zzc.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgpg, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbM();
        Object remove = this.zzc.remove(i);
        this.modCount++;
        return zzj(remove);
    }

    @Override // com.google.android.gms.internal.ads.zzgpg, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zzbM();
        return zzj(this.zzc.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgrn
    public final /* bridge */ /* synthetic */ zzgrn zzd(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzc);
        return new zzgrv(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzgrw
    public final zzgrw zze() {
        return zzc() ? new zzgud(this) : this;
    }

    @Override // com.google.android.gms.internal.ads.zzgrw
    public final Object zzf(int i) {
        return this.zzc.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgpw) {
            zzgpw zzgpwVar = (zzgpw) obj;
            String zzA = zzgpwVar.zzA(zzgro.zzb);
            if (zzgpwVar.zzp()) {
                this.zzc.set(i, zzA);
            }
            return zzA;
        }
        byte[] bArr = (byte[]) obj;
        String zzh = zzgro.zzh(bArr);
        if (zzgro.zzi(bArr)) {
            this.zzc.set(i, zzh);
        }
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgrw
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgrw
    public final void zzi(zzgpw zzgpwVar) {
        zzbM();
        this.zzc.add(zzgpwVar);
        this.modCount++;
    }

    public zzgrv(int i) {
        this.zzc = new ArrayList(i);
    }

    private zzgrv(ArrayList arrayList) {
        this.zzc = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzgpg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
