package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfsq extends zzfrh {
    static final zzfrh zza = new zzfsq(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzfsq(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfos.zza(i, this.zzc, "index");
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfrh, com.google.android.gms.internal.ads.zzfrc
    final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzc);
        return i + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    final Object[] zzg() {
        return this.zzb;
    }
}
