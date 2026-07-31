package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s90 implements t90 {
    public final String a;

    public s90(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s90) && Intrinsics.areEqual(this.a, ((s90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnWarningButtonClick(waring=" + this.a + ")";
    }
}
