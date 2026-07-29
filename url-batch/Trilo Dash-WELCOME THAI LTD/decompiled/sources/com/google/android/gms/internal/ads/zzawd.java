package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzawd implements Parcelable {
    public static final Parcelable.Creator<zzawd> CREATOR = new zzawb();
    private final zzawc[] zza;

    zzawd(Parcel parcel) {
        this.zza = new zzawc[parcel.readInt()];
        int i = 0;
        while (true) {
            zzawc[] zzawcVarArr = this.zza;
            if (i >= zzawcVarArr.length) {
                return;
            }
            zzawcVarArr[i] = (zzawc) parcel.readParcelable(zzawc.class.getClassLoader());
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
        return Arrays.equals(this.zza, ((zzawd) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza.length);
        for (zzawc zzawcVar : this.zza) {
            parcel.writeParcelable(zzawcVar, 0);
        }
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzawc zzb(int i) {
        return this.zza[i];
    }

    public zzawd(List list) {
        zzawc[] zzawcVarArr = new zzawc[list.size()];
        this.zza = zzawcVarArr;
        list.toArray(zzawcVarArr);
    }
}
