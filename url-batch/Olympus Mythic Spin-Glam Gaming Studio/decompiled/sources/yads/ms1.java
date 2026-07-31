package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes13.dex */
public final class ms1 implements Parcelable {

    @NotNull
    public static final ls1 CREATOR = new ls1();
    public static final Lazy[] d = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, ks1.b)};
    public final String b;
    public final List c;

    public ms1(int i, String str, List list) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, js1.b);
        }
        this.b = str;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms1)) {
            return false;
        }
        ms1 ms1Var = (ms1) obj;
        return Intrinsics.areEqual(this.b, ms1Var.b) && Intrinsics.areEqual(this.c, ms1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "MediationPrefetchAdUnit(adUnitId=" + this.b + ", networks=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeTypedList(this.c);
    }

    public ms1(Parcel parcel) {
        String readString = parcel.readString();
        Intrinsics.checkNotNull(readString);
        ArrayList createTypedArrayList = parcel.createTypedArrayList(rs1.CREATOR);
        Intrinsics.checkNotNull(createTypedArrayList);
        this.b = readString;
        this.c = createTypedArrayList;
    }
}
