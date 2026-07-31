package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class n50 {
    public final String a;
    public final String b;
    public final m50 c;

    public n50(String str, String str2, m50 m50Var) {
        this.a = str;
        this.b = str2;
        this.c = m50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n50)) {
            return false;
        }
        n50 n50Var = (n50) obj;
        return Intrinsics.areEqual(this.a, n50Var.a) && Intrinsics.areEqual(this.b, n50Var.b) && this.c == n50Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelAlertData(title=" + this.a + ", message=" + this.b + ", type=" + this.c + ")";
    }
}
