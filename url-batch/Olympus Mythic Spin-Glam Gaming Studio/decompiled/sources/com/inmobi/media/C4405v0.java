package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4405v0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new C4431w0(source);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C4431w0[i];
    }
}
