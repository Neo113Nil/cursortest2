package yads;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class x90 implements z90 {
    public final Uri a;

    public x90(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x90) && Intrinsics.areEqual(this.a, ((x90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShareReport(reportUri=" + this.a + ")";
    }
}
