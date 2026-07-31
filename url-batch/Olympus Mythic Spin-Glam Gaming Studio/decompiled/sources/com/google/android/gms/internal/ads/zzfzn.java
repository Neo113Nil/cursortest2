package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@SafeParcelable.Class(creator = "GassResponseParcelCreator")
/* loaded from: classes14.dex */
public final class zzfzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfzn> CREATOR = new zzfzo();

    @SafeParcelable.VersionField(id = 1)
    public final int zza;

    @SafeParcelable.Field(getter = "getAfmaSignalsAsBytes", id = 2, type = "byte[]")
    private zzaza zzb = null;
    private byte[] zzc;

    @SafeParcelable.Constructor
    zzfzn(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.zza = i;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzaza zzazaVar = this.zzb;
        if (zzazaVar != null || this.zzc == null) {
            if (zzazaVar == null || this.zzc != null) {
                if (zzazaVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzazaVar != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzaN();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzaza zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzaza.zzi(this.zzc, zziew.zzb());
                this.zzc = null;
            } catch (zzige | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        zzb();
        return this.zzb;
    }
}
