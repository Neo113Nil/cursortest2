package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: io.appmetrica.analytics.impl.sb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5668sb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C5694tb(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C5694tb[i];
    }
}
