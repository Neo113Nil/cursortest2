package yads;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes5.dex */
public final class s80 {

    @NotNull
    public static final r80 Companion = new r80();
    public static final Lazy[] h;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final List g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new Lazy[]{null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, o80.b), LazyKt.lazy(lazyThreadSafetyMode, p80.b), LazyKt.lazy(lazyThreadSafetyMode, q80.b)};
    }

    public s80(int i, String str, String str2, String str3, String str4, List list, List list2, List list3) {
        if (64 != (i & 64)) {
            PluginExceptionsKt.throwMissingFieldException(i, 64, n80.b);
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
        this.g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s80)) {
            return false;
        }
        s80 s80Var = (s80) obj;
        return Intrinsics.areEqual(this.a, s80Var.a) && Intrinsics.areEqual(this.b, s80Var.b) && Intrinsics.areEqual(this.c, s80Var.c) && Intrinsics.areEqual(this.d, s80Var.d) && Intrinsics.areEqual(this.e, s80Var.e) && Intrinsics.areEqual(this.f, s80Var.f) && Intrinsics.areEqual(this.g, s80Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        return this.g.hashCode() + ((hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelRemoteData(pageId=" + this.a + ", latestSdkVersion=" + this.b + ", appAdsTxtUrl=" + this.c + ", appStatus=" + this.d + ", alerts=" + this.e + ", adUnits=" + this.f + ", mediationNetworks=" + this.g + ")";
    }
}
