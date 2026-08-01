package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class z70 implements Parcelable {
    public static final Parcelable.Creator<z70> CREATOR = new q1(1);
    public final String d;
    public final int e;
    public final Bundle f;
    public final Bundle g;

    public z70(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.d = readString;
        this.e = parcel.readInt();
        this.f = parcel.readBundle(z70.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(z70.class.getClassLoader());
        readBundle.getClass();
        this.g = readBundle;
    }

    public final y70 a(Context context, m80 m80Var, f20 f20Var, e80 e80Var) {
        context.getClass();
        f20Var.getClass();
        Bundle bundle = this.f;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String str = this.d;
        str.getClass();
        return new y70(context, m80Var, bundle2, f20Var, e80Var, str, this.g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeBundle(this.f);
        parcel.writeBundle(this.g);
    }

    public z70(y70 y70Var) {
        y70Var.getClass();
        this.d = y70Var.i;
        this.e = y70Var.e.i;
        this.f = y70Var.a();
        Bundle bundle = new Bundle();
        this.g = bundle;
        y70Var.l.b(bundle);
    }
}
