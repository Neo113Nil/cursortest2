package com.ogury.ad.internal;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class tg implements Serializable {
    public String a;
    public String b;

    public tg() {
        Intrinsics.checkNotNullParameter("", "name");
        Intrinsics.checkNotNullParameter("", "value");
        this.a = "";
        this.b = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg)) {
            return false;
        }
        tg tgVar = (tg) obj;
        return Intrinsics.areEqual(this.a, tgVar.a) && Intrinsics.areEqual(this.b, tgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RewardItem(name=" + this.a + ", value=" + this.b + ")";
    }
}
