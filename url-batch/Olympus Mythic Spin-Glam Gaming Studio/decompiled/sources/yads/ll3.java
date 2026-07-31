package yads;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ll3 {
    public final ArrayList a;

    public ll3(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ll3) && Intrinsics.areEqual(this.a, ((ll3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ViewableImpression(viewableUrls=" + this.a + ")";
    }
}
