package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class yt1 extends z11 {
    public static final Parcelable.Creator<yt1> CREATOR = new xt1();
    public final int c;
    public final int d;
    public final int e;
    public final int[] f;
    public final int[] g;

    public yt1(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = iArr;
        this.g = iArr2;
    }

    @Override // yads.z11, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yt1.class != obj.getClass()) {
            return false;
        }
        yt1 yt1Var = (yt1) obj;
        return this.c == yt1Var.c && this.d == yt1Var.d && this.e == yt1Var.e && Arrays.equals(this.f, yt1Var.f) && Arrays.equals(this.g, yt1Var.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.g) + ((Arrays.hashCode(this.f) + ((((((this.c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.d) * 31) + this.e) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeIntArray(this.f);
        parcel.writeIntArray(this.g);
    }

    public yt1(Parcel parcel) {
        super("MLLT");
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i = sb3.a;
        this.f = createIntArray;
        this.g = parcel.createIntArray();
    }
}
