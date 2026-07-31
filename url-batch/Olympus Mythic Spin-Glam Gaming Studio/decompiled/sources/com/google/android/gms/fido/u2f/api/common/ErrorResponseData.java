package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzaj;
import com.google.android.gms.internal.fido.zzak;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@SafeParcelable.Class(creator = "ErrorResponseDataCreator")
@SafeParcelable.Reserved({1})
@Deprecated
/* loaded from: classes6.dex */
public class ErrorResponseData extends ResponseData {

    @NonNull
    public static final Parcelable.Creator<ErrorResponseData> CREATOR = new zzd();
    private final ErrorCode zza;
    private final String zzb;

    ErrorResponseData(int i, String str) {
        this.zza = ErrorCode.toErrorCode(i);
        this.zzb = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        return Objects.equal(this.zza, errorResponseData.zza) && Objects.equal(this.zzb, errorResponseData.zzb);
    }

    public int getErrorCodeAsInt() {
        return this.zza.getCode();
    }

    public String getErrorMessage() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    public String toString() {
        zzaj zza = zzak.zza(this);
        zza.zza(IronSourceConstants.EVENTS_ERROR_CODE, this.zza.getCode());
        String str = this.zzb;
        if (str != null) {
            zza.zzb("errorMessage", str);
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getErrorCodeAsInt());
        SafeParcelWriter.writeString(parcel, 3, getErrorMessage(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
