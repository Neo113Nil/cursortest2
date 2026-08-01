package s0;

import R.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301a extends b {
    public static final Parcelable.Creator<C0301a> CREATOR = new B0.b(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f3756c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3757e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3758f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3759g;

    public C0301a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3756c = parcel.readInt();
        this.d = parcel.readInt();
        this.f3757e = parcel.readInt() == 1;
        this.f3758f = parcel.readInt() == 1;
        this.f3759g = parcel.readInt() == 1;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3756c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f3757e ? 1 : 0);
        parcel.writeInt(this.f3758f ? 1 : 0);
        parcel.writeInt(this.f3759g ? 1 : 0);
    }

    public C0301a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f3756c = bottomSheetBehavior.f1553L;
        this.d = bottomSheetBehavior.f1575e;
        this.f3757e = bottomSheetBehavior.f1570b;
        this.f3758f = bottomSheetBehavior.f1550I;
        this.f3759g = bottomSheetBehavior.f1551J;
    }
}
