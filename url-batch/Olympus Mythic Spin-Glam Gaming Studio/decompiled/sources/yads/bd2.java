package yads;

import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes15.dex */
public final class bd2 extends Lambda implements Function1 {
    public final /* synthetic */ Set b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd2(Set set) {
        super(1);
        this.b = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.b.contains(((g5) obj).a));
    }
}
