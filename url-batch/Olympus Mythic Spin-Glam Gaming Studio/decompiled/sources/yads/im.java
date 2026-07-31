package yads;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class im extends Lambda implements Function0 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ jm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(Context context, jm jmVar) {
        super(0);
        this.b = context;
        this.c = jmVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new sw2(this.b, this.c.B);
    }
}
