package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class er1 implements Parcelable {

    @NotNull
    public static final ar1 CREATOR = new ar1();
    public final String b;
    public final Map c;
    public final List d;
    public final List e;
    public final List f;
    public final y4 g;
    public final Map h;
    public final ds2 i;

    public er1(String str, Map map, List list, List list2, List list3, y4 y4Var, Map map2, ds2 ds2Var) {
        this.b = str;
        this.c = map;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = y4Var;
        this.h = map2;
        this.i = ds2Var;
    }

    public final String c() {
        return this.b;
    }

    public final Map d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er1)) {
            return false;
        }
        er1 er1Var = (er1) obj;
        return Intrinsics.areEqual(this.b, er1Var.b) && Intrinsics.areEqual(this.c, er1Var.c) && Intrinsics.areEqual(this.d, er1Var.d) && Intrinsics.areEqual(this.e, er1Var.e) && Intrinsics.areEqual(this.f, er1Var.f) && Intrinsics.areEqual(this.g, er1Var.g) && Intrinsics.areEqual(this.h, er1Var.h) && Intrinsics.areEqual(this.i, er1Var.i);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        List list = this.d;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        y4 y4Var = this.g;
        int hashCode5 = (hashCode4 + (y4Var == null ? 0 : y4Var.b.hashCode())) * 31;
        Map map = this.h;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        ds2 ds2Var = this.i;
        return hashCode6 + (ds2Var != null ? ds2Var.hashCode() : 0);
    }

    public final String toString() {
        return "MediationNetwork(adapter=" + this.b + ", networkData=" + this.c + ", impressionTrackingUrls=" + this.d + ", clickTrackingUrls=" + this.e + ", adResponseTrackingUrls=" + this.f + ", adImpressionData=" + this.g + ", biddingInfo=" + this.h + ", formatParameters=" + this.i + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        ar1 ar1Var = CREATOR;
        Map map = this.c;
        ar1Var.getClass();
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
        parcel.writeStringList(this.d);
        parcel.writeStringList(this.e);
        parcel.writeStringList(this.f);
        parcel.writeParcelable(this.g, i);
        ar1 ar1Var2 = CREATOR;
        Map map2 = this.h;
        ar1Var2.getClass();
        if (map2 == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(map2.size());
            for (Map.Entry entry2 : map2.entrySet()) {
                String str3 = (String) entry2.getKey();
                String str4 = (String) entry2.getValue();
                parcel.writeString(str3);
                parcel.writeString(str4);
            }
        }
        parcel.writeParcelable(this.i, i);
    }
}
