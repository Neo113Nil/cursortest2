package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes5.dex */
public final class d23 implements gt1 {
    public static final Parcelable.Creator<d23> CREATOR = new c23();
    public final float b;
    public final int c;

    public d23(int i, float f) {
        this.b = f;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d23.class != obj.getClass()) {
            return false;
        }
        d23 d23Var = (d23) obj;
        return this.b == d23Var.b && this.c == d23Var.c;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.b).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.c;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.b + ", svcTemporalLayerCount=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.b);
        parcel.writeInt(this.c);
    }

    public d23(Parcel parcel) {
        this.b = parcel.readFloat();
        this.c = parcel.readInt();
    }
}
