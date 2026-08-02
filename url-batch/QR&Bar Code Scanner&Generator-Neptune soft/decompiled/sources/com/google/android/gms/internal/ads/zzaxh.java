package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaxh implements Parcelable {
    public static final Parcelable.Creator<zzaxh> CREATOR = new zzaxf();
    private final zzaxg[] zza;

    zzaxh(Parcel parcel) {
        this.zza = new zzaxg[parcel.readInt()];
        int i = 0;
        while (true) {
            zzaxg[] zzaxgVarArr = this.zza;
            if (i >= zzaxgVarArr.length) {
                return;
            }
            zzaxgVarArr[i] = (zzaxg) parcel.readParcelable(zzaxg.class.getClassLoader());
            i++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zza, ((zzaxh) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza.length);
        for (zzaxg zzaxgVar : this.zza) {
            parcel.writeParcelable(zzaxgVar, 0);
        }
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzaxg zzb(int i) {
        return this.zza[i];
    }

    public zzaxh(List list) {
        zzaxg[] zzaxgVarArr = new zzaxg[list.size()];
        this.zza = zzaxgVarArr;
        list.toArray(zzaxgVarArr);
    }
}
