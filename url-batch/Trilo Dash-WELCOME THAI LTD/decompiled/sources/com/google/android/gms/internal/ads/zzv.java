package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzv implements Comparator<zzu>, Parcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new zzs();
    public final String zza;
    public final int zzb;
    private final zzu[] zzc;
    private int zzd;

    zzv(Parcel parcel) {
        this.zza = parcel.readString();
        zzu[] zzuVarArr = (zzu[]) zzeg.zzG((zzu[]) parcel.createTypedArray(zzu.CREATOR));
        this.zzc = zzuVarArr;
        this.zzb = zzuVarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzu zzuVar, zzu zzuVar2) {
        zzu zzuVar3 = zzuVar;
        zzu zzuVar4 = zzuVar2;
        return zzm.zza.equals(zzuVar3.zza) ? !zzm.zza.equals(zzuVar4.zza) ? 1 : 0 : zzuVar3.zza.compareTo(zzuVar4.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzv zzvVar = (zzv) obj;
            if (zzeg.zzS(this.zza, zzvVar.zza) && Arrays.equals(this.zzc, zzvVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final zzu zza(int i) {
        return this.zzc[i];
    }

    public final zzv zzb(String str) {
        return zzeg.zzS(this.zza, str) ? this : new zzv(str, false, this.zzc);
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        String str = this.zza;
        int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.zzc);
        this.zzd = hashCode;
        return hashCode;
    }

    private zzv(String str, boolean z, zzu... zzuVarArr) {
        this.zza = str;
        zzuVarArr = z ? (zzu[]) zzuVarArr.clone() : zzuVarArr;
        this.zzc = zzuVarArr;
        this.zzb = zzuVarArr.length;
        Arrays.sort(zzuVarArr, this);
    }

    public zzv(String str, zzu... zzuVarArr) {
        this(null, true, zzuVarArr);
    }

    public zzv(List list) {
        this(null, false, (zzu[]) list.toArray(new zzu[0]));
    }
}
