package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
@SafeParcelable.Class(creator = "UploadBatchesParcelCreator")
/* loaded from: classes6.dex */
public final class zzpe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpe> CREATOR = new zzpf();
    public final List zza;

    zzpe(List list) {
        this.zza = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, list, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
