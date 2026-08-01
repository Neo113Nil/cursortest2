package x0;

import Q.k;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: x0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0341b extends View.BaseSavedState {
    public static final Parcelable.Creator<C0341b> CREATOR = new k(15);

    /* renamed from: a, reason: collision with root package name */
    public int f4118a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f4118a;
        sb.append(i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked");
        sb.append("}");
        return sb.toString();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f4118a));
    }
}
