package yads;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class yf0 {
    public final Intent a;
    public final ag0 b;
    public final bg0 c;

    public yf0(Intent intent, ag0 ag0Var, bg0 bg0Var) {
        this.a = intent;
        this.b = ag0Var;
        this.c = bg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf0)) {
            return false;
        }
        yf0 yf0Var = (yf0) obj;
        return Intrinsics.areEqual(this.a, yf0Var.a) && Intrinsics.areEqual(this.b, yf0Var.b) && Intrinsics.areEqual(this.c, yf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DelegatedActivityLaunchInfo(pendingIntent=" + this.a + ", onLaunchSucceed=" + this.b + ", onLaunchFailed=" + this.c + ")";
    }
}
