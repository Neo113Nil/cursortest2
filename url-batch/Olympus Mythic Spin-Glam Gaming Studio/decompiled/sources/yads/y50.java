package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes15.dex */
public final class y50 {

    @NotNull
    public static final x50 Companion = new x50();
    public final boolean a;
    public final Boolean b;
    public final Boolean c;
    public final boolean d;

    public y50(int i, boolean z, Boolean bool, Boolean bool2, boolean z2) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, w50.b);
        }
        this.a = z;
        this.b = bool;
        this.c = bool2;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y50)) {
            return false;
        }
        y50 y50Var = (y50) obj;
        return this.a == y50Var.a && Intrinsics.areEqual(this.b, y50Var.b) && Intrinsics.areEqual(this.c, y50Var.c) && this.d == y50Var.d;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelConsentsData(hasLocationConsent=" + this.a + ", ageRestrictedUser=" + this.b + ", hasUserConsent=" + this.c + ", hasCmpValue=" + this.d + ")";
    }

    public y50(boolean z, Boolean bool, Boolean bool2, boolean z2) {
        this.a = z;
        this.b = bool;
        this.c = bool2;
        this.d = z2;
    }
}
