package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzacu extends zzadd {
    public static final Parcelable.Creator<zzacu> CREATOR = new zzact();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzadd[] zze;

    zzacu(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = zzen.zza;
        this.zza = readString;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = (String[]) zzen.zzH(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.zze = new zzadd[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.zze[i2] = (zzadd) parcel.readParcelable(zzadd.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzacu zzacuVar = (zzacu) obj;
            if (this.zzb == zzacuVar.zzb && this.zzc == zzacuVar.zzc && zzen.zzT(this.zza, zzacuVar.zza) && Arrays.equals(this.zzd, zzacuVar.zzd) && Arrays.equals(this.zze, zzacuVar.zze)) {
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
        for (zzadd zzaddVar : this.zze) {
            parcel.writeParcelable(zzaddVar, 0);
        }
    }

    public zzacu(String str, boolean z, boolean z2, String[] strArr, zzadd[] zzaddVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzaddVarArr;
    }
}
