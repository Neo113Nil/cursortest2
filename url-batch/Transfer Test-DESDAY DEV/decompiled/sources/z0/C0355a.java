package z0;

import S.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355a extends b {
    public static final Parcelable.Creator<C0355a> CREATOR = new A0.b(8);

    /* renamed from: c, reason: collision with root package name */
    public final int f4089c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4090e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4091f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4092g;

    public C0355a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4089c = parcel.readInt();
        this.d = parcel.readInt();
        this.f4090e = parcel.readInt() == 1;
        this.f4091f = parcel.readInt() == 1;
        this.f4092g = parcel.readInt() == 1;
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4089c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f4090e ? 1 : 0);
        parcel.writeInt(this.f4091f ? 1 : 0);
        parcel.writeInt(this.f4092g ? 1 : 0);
    }

    public C0355a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f4089c = bottomSheetBehavior.f1785L;
        this.d = bottomSheetBehavior.f1807e;
        this.f4090e = bottomSheetBehavior.f1802b;
        this.f4091f = bottomSheetBehavior.f1782I;
        this.f4092g = bottomSheetBehavior.f1783J;
    }
}
