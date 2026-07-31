package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@SafeParcelable.Class(creator = "AuthenticatorSelectionCriteriaCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes13.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new zzm();
    private final Attachment zza;
    private final Boolean zzb;
    private final zzay zzc;
    private final ResidentKeyRequirement zzd;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class Builder {
    }

    AuthenticatorSelectionCriteria(String str, Boolean bool, String str2, String str3) {
        Attachment fromString;
        ResidentKeyRequirement residentKeyRequirement = null;
        if (str == null) {
            fromString = null;
        } else {
            try {
                fromString = Attachment.fromString(str);
            } catch (Attachment.UnsupportedAttachmentException | ResidentKeyRequirement.UnsupportedResidentKeyRequirementException | zzax e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.zza = fromString;
        this.zzb = bool;
        this.zzc = str2 == null ? null : zzay.zza(str2);
        if (str3 != null) {
            residentKeyRequirement = ResidentKeyRequirement.fromString(str3);
        }
        this.zzd = residentKeyRequirement;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return Objects.equal(this.zza, authenticatorSelectionCriteria.zza) && Objects.equal(this.zzb, authenticatorSelectionCriteria.zzb) && Objects.equal(this.zzc, authenticatorSelectionCriteria.zzc) && Objects.equal(this.zzd, authenticatorSelectionCriteria.zzd);
    }

    public String getAttachmentAsString() {
        Attachment attachment = this.zza;
        if (attachment == null) {
            return null;
        }
        return attachment.toString();
    }

    public Boolean getRequireResidentKey() {
        return this.zzb;
    }

    public String getResidentKeyRequirementAsString() {
        ResidentKeyRequirement residentKeyRequirement = this.zzd;
        if (residentKeyRequirement == null) {
            return null;
        }
        return residentKeyRequirement.toString();
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getAttachmentAsString(), false);
        SafeParcelWriter.writeBooleanObject(parcel, 3, getRequireResidentKey(), false);
        zzay zzayVar = this.zzc;
        SafeParcelWriter.writeString(parcel, 4, zzayVar == null ? null : zzayVar.toString(), false);
        SafeParcelWriter.writeString(parcel, 5, getResidentKeyRequirementAsString(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
