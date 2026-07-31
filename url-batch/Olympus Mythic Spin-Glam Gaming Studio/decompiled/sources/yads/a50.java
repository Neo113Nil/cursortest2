package yads;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class a50 {
    public final ArrayList a;

    public a50(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a50) && Intrinsics.areEqual(this.a, ((a50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdUnitsData(adUnits=" + this.a + ")";
    }
}
