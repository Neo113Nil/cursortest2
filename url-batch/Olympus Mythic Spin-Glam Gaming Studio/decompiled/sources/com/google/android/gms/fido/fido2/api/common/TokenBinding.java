package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@SafeParcelable.Class(creator = "TokenBindingCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes13.dex */
public class TokenBinding extends AbstractSafeParcelable {
    private final TokenBindingStatus zza;
    private final String zzb;

    @NonNull
    public static final Parcelable.Creator<TokenBinding> CREATOR = new zzau();
    public static final TokenBinding SUPPORTED = new TokenBinding(TokenBindingStatus.SUPPORTED.toString(), null);
    public static final TokenBinding NOT_SUPPORTED = new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.toString(), null);

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public enum TokenBindingStatus implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");


        @NonNull
        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new zzat();

        @NonNull
        private final String zzb;

        TokenBindingStatus(String str) {
            this.zzb = str;
        }

        @NonNull
        public static TokenBindingStatus fromString(@NonNull String str) throws UnsupportedTokenBindingStatusException {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.zzb)) {
                    return tokenBindingStatus;
                }
            }
            throw new UnsupportedTokenBindingStatusException(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.zzb;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeString(this.zzb);
        }
    }

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class UnsupportedTokenBindingStatusException extends Exception {
        public UnsupportedTokenBindingStatusException(@NonNull String str) {
            super(String.format("TokenBindingStatus %s not supported", str));
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        return com.google.android.gms.internal.fido.zzal.zza(this.zza, tokenBinding.zza) && com.google.android.gms.internal.fido.zzal.zza(this.zzb, tokenBinding.zzb);
    }

    public String getTokenBindingId() {
        return this.zzb;
    }

    public String getTokenBindingStatusAsString() {
        return this.zza.toString();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getTokenBindingStatusAsString(), false);
        SafeParcelWriter.writeString(parcel, 3, getTokenBindingId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    TokenBinding(String str, String str2) {
        Preconditions.checkNotNull(str);
        try {
            this.zza = TokenBindingStatus.fromString(str);
            this.zzb = str2;
        } catch (UnsupportedTokenBindingStatusException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
