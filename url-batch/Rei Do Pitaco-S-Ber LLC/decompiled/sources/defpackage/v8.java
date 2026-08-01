package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class v8 implements Parcelable {
    public static final Parcelable.Creator<v8> CREATOR = new i1(6);
    public final qt f;
    public final qt g;
    public final vd h;
    public final qt i;
    public final int j;
    public final int k;
    public final int l;

    public v8(qt qtVar, qt qtVar2, vd vdVar, qt qtVar3, int i) {
        Objects.requireNonNull(qtVar, "start cannot be null");
        Objects.requireNonNull(qtVar2, "end cannot be null");
        Objects.requireNonNull(vdVar, "validator cannot be null");
        this.f = qtVar;
        this.g = qtVar2;
        this.i = qtVar3;
        this.j = i;
        this.h = vdVar;
        if (qtVar3 != null && qtVar.f.compareTo(qtVar3.f) > 0) {
            l8.l("start Month cannot be after current Month");
            throw null;
        }
        if (qtVar3 != null && qtVar3.f.compareTo(qtVar2.f) > 0) {
            l8.l("current Month cannot be after end Month");
            throw null;
        }
        if (i < 0 || i > x60.c(null).getMaximum(7)) {
            l8.l("firstDayOfWeek is not valid");
            throw null;
        }
        this.l = qtVar.d(qtVar2) + 1;
        this.k = (qtVar2.h - qtVar.h) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8)) {
            return false;
        }
        v8 v8Var = (v8) obj;
        return this.f.equals(v8Var.f) && this.g.equals(v8Var.g) && Objects.equals(this.i, v8Var.i) && this.j == v8Var.j && this.h.equals(v8Var.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.g, this.i, Integer.valueOf(this.j), this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f, 0);
        parcel.writeParcelable(this.g, 0);
        parcel.writeParcelable(this.i, 0);
        parcel.writeParcelable(this.h, 0);
        parcel.writeInt(this.j);
    }
}
