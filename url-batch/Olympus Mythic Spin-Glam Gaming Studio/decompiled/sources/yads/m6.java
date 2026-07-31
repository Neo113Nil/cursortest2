package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m6 extends Throwable {
    public final String b;

    public m6(String str) {
        super(str);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6) && Intrinsics.areEqual(this.b, ((m6) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "AdPresentationError(description=" + this.b + ")";
    }
}
