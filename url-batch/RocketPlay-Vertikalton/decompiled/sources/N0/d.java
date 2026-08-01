package N0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class d extends S.b {
    public static final Parcelable.Creator<d> CREATOR = new G0.b(1);

    /* renamed from: c, reason: collision with root package name */
    public final int f902c;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f902c = parcel.readInt();
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f902c);
    }

    public d(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f902c = sideSheetBehavior.h;
    }
}
