package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzafp extends zzagd {
    public static final Parcelable.Creator<zzafp> CREATOR = new zzafo();
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    zzafp(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = zzet.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzafp zzafpVar = (zzafp) obj;
            if (this.zzc == zzafpVar.zzc && zzet.zzG(this.zza, zzafpVar.zza) && zzet.zzG(this.zzb, zzafpVar.zzb) && Arrays.equals(this.zzd, zzafpVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = str != null ? str.hashCode() : 0;
        int i = this.zzc;
        String str2 = this.zzb;
        return ((((((i + 527) * 31) + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", description=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzagd, com.google.android.gms.internal.ads.zzbj
    public final void zza(zzbf zzbfVar) {
        zzbfVar.zza(this.zzd, this.zzc);
    }

    public zzafp(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = bArr;
    }
}
