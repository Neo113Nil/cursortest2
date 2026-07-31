package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class D implements Parcelable {

    @NotNull
    public static final C CREATOR = new C();
    public final C5888z a;
    public final F b;
    public final B c;

    public D(C5888z c5888z, F f, B b) {
        this.a = c5888z;
        this.b = f;
        this.c = b;
    }

    public final C5888z a() {
        return this.a;
    }

    public final B b() {
        return this.c;
    }

    public final F c() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableScreenshotConfig(apiCaptorConfig=" + this.a + ", serviceCaptorConfig=" + this.b + ", contentObserverCaptorConfig=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D(h0 h0Var) {
        this(r2, r3, r5 != null ? new B(r5) : null);
        e0 a = h0Var.a();
        C5888z c5888z = a != null ? new C5888z(a) : null;
        i0 c = h0Var.c();
        F f = c != null ? new F(c) : null;
        f0 b = h0Var.b();
    }
}
