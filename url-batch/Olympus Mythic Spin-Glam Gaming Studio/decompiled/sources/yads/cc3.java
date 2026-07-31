package yads;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class cc3 implements ec3 {
    public final List a;

    public cc3(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cc3) && Intrinsics.areEqual(this.a, ((cc3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(warnings=" + this.a + ")";
    }

    public cc3() {
        this.a = CollectionsKt.emptyList();
    }
}
