package androidx.versionedparcelable;

import C0.b;
import android.os.Parcel;
import android.os.Parcelable;
import q0.C0324b;
import q0.InterfaceC0325c;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new b(15);

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0325c f1721a;

    public ParcelImpl(Parcel parcel) {
        this.f1721a = new C0324b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C0324b(parcel).i(this.f1721a);
    }
}
