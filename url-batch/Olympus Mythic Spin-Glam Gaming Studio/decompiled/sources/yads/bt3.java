package yads;

import com.yandex.mobile.ads.rewarded.Reward;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bt3 implements Reward {
    public final rq2 a;

    public bt3(rq2 rq2Var) {
        this.a = rq2Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bt3) && Intrinsics.areEqual(((bt3) obj).a, this.a);
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public final int getAmount() {
        return ((tw2) this.a).a;
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public final String getType() {
        return ((tw2) this.a).b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
