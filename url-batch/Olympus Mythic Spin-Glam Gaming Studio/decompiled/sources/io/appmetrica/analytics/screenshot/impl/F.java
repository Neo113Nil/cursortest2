package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class F implements Parcelable {

    @NotNull
    public static final E CREATOR = new E();
    public final boolean a;
    public final long b;

    public F(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final long a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableServiceCaptorConfig(enabled=" + this.a + ", delaySeconds=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.b);
    }

    public F(i0 i0Var) {
        this(i0Var.b(), i0Var.a());
    }
}
