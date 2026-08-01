package u0;

import R.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316a extends b {
    public static final Parcelable.Creator<C0316a> CREATOR = new D0.b(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f3810c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3811e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3812f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3813g;

    public C0316a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3810c = parcel.readInt();
        this.d = parcel.readInt();
        this.f3811e = parcel.readInt() == 1;
        this.f3812f = parcel.readInt() == 1;
        this.f3813g = parcel.readInt() == 1;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3810c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f3811e ? 1 : 0);
        parcel.writeInt(this.f3812f ? 1 : 0);
        parcel.writeInt(this.f3813g ? 1 : 0);
    }

    public C0316a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f3810c = bottomSheetBehavior.f1559L;
        this.d = bottomSheetBehavior.f1581e;
        this.f3811e = bottomSheetBehavior.f1576b;
        this.f3812f = bottomSheetBehavior.f1556I;
        this.f3813g = bottomSheetBehavior.f1557J;
    }
}
