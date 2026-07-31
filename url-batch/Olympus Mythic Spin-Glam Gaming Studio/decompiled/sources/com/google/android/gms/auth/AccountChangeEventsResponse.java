package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
@SafeParcelable.Class(creator = "AccountChangeEventsResponseCreator")
/* loaded from: classes5.dex */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new zzc();
    final int zza;
    final List zzb;

    AccountChangeEventsResponse(int i, List list) {
        this.zza = i;
        this.zzb = (List) Preconditions.checkNotNull(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
