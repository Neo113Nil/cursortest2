package yads;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class t51 implements u51 {
    public final Uri a;

    public t51(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t51) && Intrinsics.areEqual(this.a, ((t51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(reportUri=" + this.a + ")";
    }
}
