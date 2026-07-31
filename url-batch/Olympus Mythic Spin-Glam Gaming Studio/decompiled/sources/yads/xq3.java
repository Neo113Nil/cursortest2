package yads;

import com.yandex.mobile.ads.common.ImpressionData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xq3 implements ImpressionData {
    public final y4 a;

    public xq3(y4 y4Var) {
        this.a = y4Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xq3) && Intrinsics.areEqual(((xq3) obj).a, this.a);
    }

    @Override // com.yandex.mobile.ads.common.ImpressionData
    public final String getRawData() {
        return this.a.b;
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }
}
