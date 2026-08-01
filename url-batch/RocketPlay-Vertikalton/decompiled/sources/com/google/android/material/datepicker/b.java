package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new A0.b(8);

    /* renamed from: a, reason: collision with root package name */
    public final o f2241a;

    /* renamed from: b, reason: collision with root package name */
    public final o f2242b;

    /* renamed from: c, reason: collision with root package name */
    public final d f2243c;
    public final o d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2244e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2245f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2246g;

    public b(o oVar, o oVar2, d dVar, o oVar3, int i) {
        Objects.requireNonNull(oVar, "start cannot be null");
        Objects.requireNonNull(oVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f2241a = oVar;
        this.f2242b = oVar2;
        this.d = oVar3;
        this.f2244e = i;
        this.f2243c = dVar;
        if (oVar3 != null && oVar.f2300a.compareTo(oVar3.f2300a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (oVar3 != null && oVar3.f2300a.compareTo(oVar2.f2300a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > w.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f2246g = oVar.d(oVar2) + 1;
        this.f2245f = (oVar2.f2302c - oVar.f2302c) + 1;
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
        return this.f2241a.equals(bVar.f2241a) && this.f2242b.equals(bVar.f2242b) && Objects.equals(this.d, bVar.d) && this.f2244e == bVar.f2244e && this.f2243c.equals(bVar.f2243c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2241a, this.f2242b, this.d, Integer.valueOf(this.f2244e), this.f2243c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2241a, 0);
        parcel.writeParcelable(this.f2242b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.f2243c, 0);
        parcel.writeInt(this.f2244e);
    }
}
