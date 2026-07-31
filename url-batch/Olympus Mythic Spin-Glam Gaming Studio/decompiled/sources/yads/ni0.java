package yads;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ni0 {
    public final Uri a;

    public ni0(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ni0) && Intrinsics.areEqual(this.a, ((ni0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DivKitClickExtensionData(url=" + this.a + ")";
    }
}
