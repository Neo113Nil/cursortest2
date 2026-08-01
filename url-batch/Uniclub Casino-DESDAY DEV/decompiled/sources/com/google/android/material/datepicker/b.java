package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Q.k(7);

    /* renamed from: a, reason: collision with root package name */
    public final o f1647a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1648b;

    /* renamed from: c, reason: collision with root package name */
    public final d f1649c;
    public final o d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1650e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1651f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1652g;

    public b(o oVar, o oVar2, d dVar, o oVar3, int i) {
        Objects.requireNonNull(oVar, "start cannot be null");
        Objects.requireNonNull(oVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f1647a = oVar;
        this.f1648b = oVar2;
        this.d = oVar3;
        this.f1650e = i;
        this.f1649c = dVar;
        if (oVar3 != null && oVar.f1707a.compareTo(oVar3.f1707a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (oVar3 != null && oVar3.f1707a.compareTo(oVar2.f1707a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > w.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f1652g = oVar.d(oVar2) + 1;
        this.f1651f = (oVar2.f1709c - oVar.f1709c) + 1;
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
        return this.f1647a.equals(bVar.f1647a) && this.f1648b.equals(bVar.f1648b) && Objects.equals(this.d, bVar.d) && this.f1650e == bVar.f1650e && this.f1649c.equals(bVar.f1649c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1647a, this.f1648b, this.d, Integer.valueOf(this.f1650e), this.f1649c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1647a, 0);
        parcel.writeParcelable(this.f1648b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.f1649c, 0);
        parcel.writeInt(this.f1650e);
    }
}
