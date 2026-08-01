package x0;

import S.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0380a extends b {
    public static final Parcelable.Creator<C0380a> CREATOR = new G0.b(7);

    /* renamed from: c, reason: collision with root package name */
    public final int f4463c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4464e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4465f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4466g;

    public C0380a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4463c = parcel.readInt();
        this.d = parcel.readInt();
        this.f4464e = parcel.readInt() == 1;
        this.f4465f = parcel.readInt() == 1;
        this.f4466g = parcel.readInt() == 1;
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4463c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f4464e ? 1 : 0);
        parcel.writeInt(this.f4465f ? 1 : 0);
        parcel.writeInt(this.f4466g ? 1 : 0);
    }

    public C0380a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f4463c = bottomSheetBehavior.f2153L;
        this.d = bottomSheetBehavior.f2175e;
        this.f4464e = bottomSheetBehavior.f2170b;
        this.f4465f = bottomSheetBehavior.f2150I;
        this.f4466g = bottomSheetBehavior.f2151J;
    }
}
