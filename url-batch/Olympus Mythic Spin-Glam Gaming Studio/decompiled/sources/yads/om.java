package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes3.dex */
public final class om extends Lambda implements Function1 {
    public final /* synthetic */ wm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om(wm wmVar) {
        super(1);
        this.b = wmVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BuildersKt__Builders_commonKt.launch$default(this.b.e, Dispatchers.getMain().getImmediate(), null, new nm(this.b, null), 2, null);
        return Unit.INSTANCE;
    }
}
