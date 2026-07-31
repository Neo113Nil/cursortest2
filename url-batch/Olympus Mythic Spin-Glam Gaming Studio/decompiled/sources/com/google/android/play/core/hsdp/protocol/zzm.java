package com.google.android.play.core.hsdp.protocol;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes12.dex */
final class zzm implements Parcelable.Creator {
    zzm() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PrewarmRequest(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PrewarmRequest[i];
    }
}
