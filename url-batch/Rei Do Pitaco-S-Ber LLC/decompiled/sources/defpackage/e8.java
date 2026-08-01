package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class e8 extends f {
    public static final Parcelable.Creator<e8> CREATOR = new e(1);
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public e8(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readInt() == 1;
        this.k = parcel.readInt() == 1;
        this.l = parcel.readInt() == 1;
    }

    @Override // defpackage.f, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
    }

    public e8(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.h = bottomSheetBehavior.P;
        this.i = bottomSheetBehavior.f;
        this.j = bottomSheetBehavior.b;
        this.k = bottomSheetBehavior.J;
        this.l = bottomSheetBehavior.K;
    }
}
