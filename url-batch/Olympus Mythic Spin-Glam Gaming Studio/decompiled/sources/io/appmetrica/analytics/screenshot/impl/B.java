package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class B implements Parcelable {

    @NotNull
    public static final A CREATOR = new A();
    public final boolean a;
    public final List b;
    public final long c;

    public B(boolean z, List list, long j) {
        this.a = z;
        this.b = list;
        this.c = j;
    }

    public final long a() {
        return this.c;
    }

    public final boolean b() {
        return this.a;
    }

    public final List c() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableContentObserverCaptorConfig(enabled=" + this.a + ", mediaStoreColumnNames=" + this.b + ", detectWindowSeconds=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.b);
        parcel.writeLong(this.c);
    }

    public B(f0 f0Var) {
        this(f0Var.b(), f0Var.c(), f0Var.a());
    }
}
