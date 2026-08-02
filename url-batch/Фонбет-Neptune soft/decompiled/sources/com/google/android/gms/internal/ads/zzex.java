package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzex implements zzbj {
    public static final Parcelable.Creator<zzex> CREATOR = new zzev();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* synthetic */ zzex(Parcel parcel, zzew zzewVar) {
        String readString = parcel.readString();
        int i = zzet.zza;
        this.zza = readString;
        this.zzb = parcel.createByteArray();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt();
    }

    public zzex(String str, byte[] bArr, int i, int i2) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzex zzexVar = (zzex) obj;
            if (this.zza.equals(zzexVar.zza) && Arrays.equals(this.zzb, zzexVar.zzb) && this.zzc == zzexVar.zzc && this.zzd == zzexVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + 527) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final /* synthetic */ void zza(zzbf zzbfVar) {
    }

    public final String toString() {
        String zzA;
        int i = this.zzd;
        if (i == 1) {
            zzA = zzet.zzA(this.zzb);
        } else if (i == 23) {
            zzA = String.valueOf(Float.intBitsToFloat(zzgap.zzd(this.zzb)));
        } else if (i != 67) {
            byte[] bArr = this.zzb;
            int length = bArr.length;
            StringBuilder sb = new StringBuilder(length + length);
            for (int i2 = 0; i2 < bArr.length; i2++) {
                sb.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i2] & Ascii.SI, 16));
            }
            zzA = sb.toString();
        } else {
            zzA = String.valueOf(zzgap.zzd(this.zzb));
        }
        return "mdta: key=" + this.zza + ", value=" + zzA;
    }
}
