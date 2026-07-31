package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.screenshot.impl.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5888z implements Parcelable {

    @NotNull
    public static final C5887y CREATOR = new C5887y();
    public final boolean a;

    public C5888z(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableApiCaptorConfig(enabled=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }

    public C5888z(e0 e0Var) {
        this(e0Var.a());
    }
}
