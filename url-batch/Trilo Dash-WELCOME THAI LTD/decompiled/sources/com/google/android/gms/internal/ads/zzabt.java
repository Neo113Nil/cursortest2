package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzabt extends zzacc {
    public static final Parcelable.Creator<zzabt> CREATOR = new zzabs();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzacc[] zze;

    zzabt(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = zzeg.zza;
        this.zza = readString;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = (String[]) zzeg.zzG(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.zze = new zzacc[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.zze[i2] = (zzacc) parcel.readParcelable(zzacc.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzabt zzabtVar = (zzabt) obj;
            if (this.zzb == zzabtVar.zzb && this.zzc == zzabtVar.zzc && zzeg.zzS(this.zza, zzabtVar.zza) && Arrays.equals(this.zzd, zzabtVar.zzd) && Arrays.equals(this.zze, zzabtVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0)) * 31;
        String str = this.zza;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzacc zzaccVar : this.zze) {
            parcel.writeParcelable(zzaccVar, 0);
        }
    }

    public zzabt(String str, boolean z, boolean z2, String[] strArr, zzacc[] zzaccVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzaccVarArr;
    }
}
