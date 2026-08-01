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
    public final int f3734c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3735e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3736f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3737g;

    public C0301a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3734c = parcel.readInt();
        this.d = parcel.readInt();
        this.f3735e = parcel.readInt() == 1;
        this.f3736f = parcel.readInt() == 1;
        this.f3737g = parcel.readInt() == 1;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3734c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f3735e ? 1 : 0);
        parcel.writeInt(this.f3736f ? 1 : 0);
        parcel.writeInt(this.f3737g ? 1 : 0);
    }

    public C0301a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f3734c = bottomSheetBehavior.f1550L;
        this.d = bottomSheetBehavior.f1572e;
        this.f3735e = bottomSheetBehavior.f1567b;
        this.f3736f = bottomSheetBehavior.f1547I;
        this.f3737g = bottomSheetBehavior.f1548J;
    }
}
