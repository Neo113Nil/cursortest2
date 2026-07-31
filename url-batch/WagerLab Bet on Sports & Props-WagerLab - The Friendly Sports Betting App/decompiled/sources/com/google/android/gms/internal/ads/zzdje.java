package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdje {
    public static final zzdje zza = new zzdje(new zzdjd());
    private final zzbgx zzb;
    private final zzbgu zzc;
    private final zzbhk zzd;
    private final zzbhh zze;
    private final zzbmf zzf;
    private final SimpleArrayMap zzg;
    private final SimpleArrayMap zzh;

    private zzdje(zzdjd zzdjdVar) {
        this.zzb = zzdjdVar.zza;
        this.zzc = zzdjdVar.zzb;
        this.zzd = zzdjdVar.zzc;
        this.zzg = new SimpleArrayMap(zzdjdVar.zzf);
        this.zzh = new SimpleArrayMap(zzdjdVar.zzg);
        this.zze = zzdjdVar.zzd;
        this.zzf = zzdjdVar.zze;
    }

    /* synthetic */ zzdje(zzdjd zzdjdVar, byte[] bArr) {
        this(zzdjdVar);
    }

    public final zzbgx zza() {
        return this.zzb;
    }

    public final zzbgu zzb() {
        return this.zzc;
    }

    public final zzbhk zzc() {
        return this.zzd;
    }

    public final zzbhh zzd() {
        return this.zze;
    }

    public final zzbmf zze() {
        return this.zzf;
    }

    public final zzbhd zzf(String str) {
        if (str == null) {
            return null;
        }
        return (zzbhd) this.zzg.get(str);
    }

    public final zzbha zzg(String str) {
        return (zzbha) this.zzh.get(str);
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
