package yads;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class id3 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<id3> CREATOR = new gd3();
    public final hd3 b;
    public final float c;

    public id3(hd3 hd3Var, float f) {
        this.b = hd3Var;
        this.c = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        hd3 hd3Var = this.b;
        parcel.writeInt(hd3Var != null ? hd3Var.ordinal() : -1);
        parcel.writeFloat(this.c);
    }

    public id3(Parcel parcel) {
        hd3 hd3Var = parcel.readInt() == -1 ? null : hd3.values()[parcel.readInt()];
        float readFloat = parcel.readFloat();
        this.b = hd3Var;
        this.c = readFloat;
    }
}
