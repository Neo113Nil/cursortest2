package s0;

import R.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300a extends b {
    public static final Parcelable.Creator<C0300a> CREATOR = new B0.b(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f3750c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3751e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3752f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3753g;

    public C0300a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3750c = parcel.readInt();
        this.d = parcel.readInt();
        this.f3751e = parcel.readInt() == 1;
        this.f3752f = parcel.readInt() == 1;
        this.f3753g = parcel.readInt() == 1;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3750c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f3751e ? 1 : 0);
        parcel.writeInt(this.f3752f ? 1 : 0);
        parcel.writeInt(this.f3753g ? 1 : 0);
    }

    public C0300a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f3750c = bottomSheetBehavior.f1547L;
        this.d = bottomSheetBehavior.f1569e;
        this.f3751e = bottomSheetBehavior.f1564b;
        this.f3752f = bottomSheetBehavior.f1544I;
        this.f3753g = bottomSheetBehavior.f1545J;
    }
}
