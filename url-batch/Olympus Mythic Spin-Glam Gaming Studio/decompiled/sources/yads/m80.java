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
/* loaded from: classes4.dex */
public final class m80 {

    @NotNull
    public static final l80 Companion = new l80();
    public static final Lazy[] g = {null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, k80.b), null};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final String f;

    public m80(int i, String str, String str2, String str3, String str4, List list, String str5) {
        if (18 != (i & 18)) {
            PluginExceptionsKt.throwMissingFieldException(i, 18, j80.b);
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
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
        this.e = list;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m80)) {
            return false;
        }
        m80 m80Var = (m80) obj;
        return Intrinsics.areEqual(this.a, m80Var.a) && Intrinsics.areEqual(this.b, m80Var.b) && Intrinsics.areEqual(this.c, m80Var.c) && Intrinsics.areEqual(this.d, m80Var.d) && Intrinsics.areEqual(this.e, m80Var.e) && Intrinsics.areEqual(this.f, m80Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int a = c4.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int hashCode = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode2 = (this.e.hashCode() + ((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f;
        return hashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelMediationNetwork(id=" + this.a + ", name=" + this.b + ", logoUrl=" + this.c + ", adapterStatus=" + this.d + ", adapters=" + this.e + ", latestAdapterVersion=" + this.f + ")";
    }
}
