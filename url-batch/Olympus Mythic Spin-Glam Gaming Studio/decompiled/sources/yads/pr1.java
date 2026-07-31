package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes3.dex */
public final class pr1 {

    @NotNull
    public static final or1 Companion = new or1();
    public final String a;
    public final String b;
    public final boolean c;

    public pr1(int i, String str, String str2, boolean z) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, nr1.b);
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr1)) {
            return false;
        }
        pr1 pr1Var = (pr1) obj;
        return Intrinsics.areEqual(this.a, pr1Var.a) && Intrinsics.areEqual(this.b, pr1Var.b) && this.c == pr1Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "MediationAdapterData(format=" + this.a + ", version=" + this.b + ", isIntegrated=" + this.c + ")";
    }

    public pr1(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
