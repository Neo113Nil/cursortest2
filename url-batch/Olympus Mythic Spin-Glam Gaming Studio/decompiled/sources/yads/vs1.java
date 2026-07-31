package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes11.dex */
public final class vs1 implements Parcelable {

    @NotNull
    public static final us1 CREATOR = new us1();
    public static final Lazy[] d = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, ts1.b)};
    public final long b;
    public final List c;

    public vs1(int i, long j, List list) {
        this.b = (i & 1) == 0 ? 30000L : j;
        if ((i & 2) == 0) {
            this.c = CollectionsKt.emptyList();
        } else {
            this.c = list;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs1)) {
            return false;
        }
        vs1 vs1Var = (vs1) obj;
        return this.b == vs1Var.b && Intrinsics.areEqual(this.c, vs1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "MediationPrefetchSettings(loadTimeoutMillis=" + this.b + ", mediationPrefetchAdUnits=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeTypedList(this.c);
    }

    public vs1(long j, ArrayList arrayList) {
        this.b = j;
        this.c = arrayList;
    }

    public vs1(Parcel parcel) {
        long readLong = parcel.readLong();
        ArrayList createTypedArrayList = parcel.createTypedArrayList(ms1.CREATOR);
        Intrinsics.checkNotNull(createTypedArrayList);
        this.b = readLong;
        this.c = createTypedArrayList;
    }
}
