package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzabp extends zzacc {
    public static final Parcelable.Creator<zzabp> CREATOR = new zzabo();
    public final byte[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzabp(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i = zzeg.zza;
        this.zza = (byte[]) zzeg.zzG(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzabp zzabpVar = (zzabp) obj;
            if (this.zzf.equals(zzabpVar.zzf) && Arrays.equals(this.zza, zzabpVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzf.hashCode() + 527) * 31) + Arrays.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeByteArray(this.zza);
    }

    public zzabp(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }
}
