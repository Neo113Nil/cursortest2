package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new C0.b(8);

    /* renamed from: a, reason: collision with root package name */
    public final o f1873a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1874b;

    /* renamed from: c, reason: collision with root package name */
    public final d f1875c;
    public final o d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1876e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1877f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1878g;

    public b(o oVar, o oVar2, d dVar, o oVar3, int i) {
        Objects.requireNonNull(oVar, "start cannot be null");
        Objects.requireNonNull(oVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f1873a = oVar;
        this.f1874b = oVar2;
        this.d = oVar3;
        this.f1876e = i;
        this.f1875c = dVar;
        if (oVar3 != null && oVar.f1933a.compareTo(oVar3.f1933a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (oVar3 != null && oVar3.f1933a.compareTo(oVar2.f1933a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > w.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f1878g = oVar.d(oVar2) + 1;
        this.f1877f = (oVar2.f1935c - oVar.f1935c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1873a.equals(bVar.f1873a) && this.f1874b.equals(bVar.f1874b) && Objects.equals(this.d, bVar.d) && this.f1876e == bVar.f1876e && this.f1875c.equals(bVar.f1875c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1873a, this.f1874b, this.d, Integer.valueOf(this.f1876e), this.f1875c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1873a, 0);
        parcel.writeParcelable(this.f1874b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.f1875c, 0);
        parcel.writeInt(this.f1876e);
    }
}
