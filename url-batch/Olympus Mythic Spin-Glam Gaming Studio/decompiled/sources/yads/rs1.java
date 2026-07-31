package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes11.dex */
public final class rs1 implements Parcelable {

    @NotNull
    public static final qs1 CREATOR = new qs1();
    public static final Lazy[] d = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, ps1.b)};
    public final String b;
    public final Map c;

    public rs1(int i, String str, Map map) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, os1.b);
        }
        this.b = str;
        this.c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs1)) {
            return false;
        }
        rs1 rs1Var = (rs1) obj;
        return Intrinsics.areEqual(this.b, rs1Var.b) && Intrinsics.areEqual(this.c, rs1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "MediationPrefetchNetwork(adapter=" + this.b + ", networkData=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c.size());
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public rs1(String str, LinkedHashMap linkedHashMap) {
        this.b = str;
        this.c = linkedHashMap;
    }
}
