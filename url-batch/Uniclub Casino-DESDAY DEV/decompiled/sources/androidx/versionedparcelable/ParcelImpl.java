package androidx.versionedparcelable;

import Q.k;
import android.os.Parcel;
import android.os.Parcelable;
import m0.C0271b;
import m0.InterfaceC0272c;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new k(14);

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0272c f1499a;

    public ParcelImpl(Parcel parcel) {
        this.f1499a = new C0271b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C0271b(parcel).i(this.f1499a);
    }
}
