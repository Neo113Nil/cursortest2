package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/* loaded from: classes12.dex */
public final class o13 implements Parcelable {
    public static final Parcelable.Creator<o13> CREATOR;
    public final long b;
    public final long c;
    public final int d;

    static {
        new Comparator() { // from class: yads.o13$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a;
                a = zx.a.a(r1.b, r2.b).a(r1.c, r2.c).a(((o13) obj).d, ((o13) obj2).d).a();
                return a;
            }
        };
        CREATOR = new n13();
    }

    public o13(int i, long j, long j2) {
        if (j >= j2) {
            throw new IllegalArgumentException();
        }
        this.b = j;
        this.c = j2;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o13.class != obj.getClass()) {
            return false;
        }
        o13 o13Var = (o13) obj;
        return this.b == o13Var.b && this.c == o13Var.c && this.d == o13Var.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.c;
        int i = this.d;
        int i2 = sb3.a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + j + ", endTimeMs=" + j2 + ", speedDivisor=" + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d);
    }
}
