package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzdrb {
    public static final zzdrb zza = new zzdrb(new zzdra());

    @Nullable
    private final zzbnt zzb;

    @Nullable
    private final zzbnq zzc;

    @Nullable
    private final zzbog zzd;

    @Nullable
    private final zzbod zze;

    @Nullable
    private final zzbtc zzf;
    private final SimpleArrayMap zzg;
    private final SimpleArrayMap zzh;

    private zzdrb(zzdra zzdraVar) {
        this.zzb = zzdraVar.zza;
        this.zzc = zzdraVar.zzb;
        this.zzd = zzdraVar.zzc;
        this.zzg = new SimpleArrayMap(zzdraVar.zzf);
        this.zzh = new SimpleArrayMap(zzdraVar.zzg);
        this.zze = zzdraVar.zzd;
        this.zzf = zzdraVar.zze;
    }

    /* synthetic */ zzdrb(zzdra zzdraVar, byte[] bArr) {
        this(zzdraVar);
    }

    @Nullable
    public final zzbnt zza() {
        return this.zzb;
    }

    @Nullable
    public final zzbnq zzb() {
        return this.zzc;
    }

    @Nullable
    public final zzbog zzc() {
        return this.zzd;
    }

    @Nullable
    public final zzbod zzd() {
        return this.zze;
    }

    @Nullable
    public final zzbtc zze() {
        return this.zzf;
    }

    @Nullable
    public final zzbnz zzf(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return (zzbnz) this.zzg.get(str);
    }

    @Nullable
    public final zzbnw zzg(String str) {
        return (zzbnw) this.zzh.get(str);
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        SimpleArrayMap simpleArrayMap = this.zzg;
        ArrayList arrayList = new ArrayList(simpleArrayMap.getSize());
        for (int i = 0; i < simpleArrayMap.getSize(); i++) {
            arrayList.add((String) simpleArrayMap.keyAt(i));
        }
        return arrayList;
    }
}
