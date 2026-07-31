package yads;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i50 {
    public final ArrayList a;

    public i50(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i50) && Intrinsics.areEqual(this.a, ((i50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdaptersData(adapters=" + this.a + ")";
    }
}
