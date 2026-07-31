package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes15.dex */
public final class l50 {

    @NotNull
    public static final k50 Companion = new k50();
    public final String a;
    public final String b;
    public final String c;

    public l50(int i, String str, String str2, String str3) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l50)) {
            return false;
        }
        l50 l50Var = (l50) obj;
        return Intrinsics.areEqual(this.a, l50Var.a) && Intrinsics.areEqual(this.b, l50Var.b) && Intrinsics.areEqual(this.c, l50Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelAlert(title=" + this.a + ", message=" + this.b + ", type=" + this.c + ")";
    }
}
