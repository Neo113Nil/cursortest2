package Y;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: Y.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035c implements Parcelable {
    public static final Parcelable.Creator<C0035c> CREATOR = new C0.b(3);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1056a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1057b;

    public C0035c(Parcel parcel) {
        this.f1056a = parcel.createStringArrayList();
        this.f1057b = parcel.createTypedArrayList(C0034b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1056a);
        parcel.writeTypedList(this.f1057b);
    }
}
