package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class fp extends z11 {
    public static final Parcelable.Creator<fp> CREATOR = new ep();
    public final byte[] c;

    public fp(String str, byte[] bArr) {
        super(str);
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fp.class != obj.getClass()) {
            return false;
        }
        fp fpVar = (fp) obj;
        return this.b.equals(fpVar.b) && Arrays.equals(this.c, fpVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + c4.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fp(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i = sb3.a;
        this.c = parcel.createByteArray();
    }
}
