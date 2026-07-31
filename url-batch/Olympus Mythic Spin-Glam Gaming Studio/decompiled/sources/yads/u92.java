package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class u92 extends vh {
    public final nq2 a = new nq2();

    @Override // yads.vh
    public final ph a(Object obj, String str) {
        String str2 = (String) obj;
        if (Intrinsics.areEqual("review_count", str)) {
            try {
                str2 = this.a.a(str2);
            } catch (o12 unused) {
            }
        }
        return vh.a(str, "string", str2);
    }
}
