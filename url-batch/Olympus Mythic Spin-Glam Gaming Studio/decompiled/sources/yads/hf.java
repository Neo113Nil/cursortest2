package yads;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class hf extends Lambda implements Function0 {
    public final /* synthetic */ qf b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf(qf qfVar, Context context) {
        super(0);
        this.b = qfVar;
        this.c = context;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rf0 mo4828invoke() {
        if (!this.b.c()) {
            return null;
        }
        try {
            return sf0.a(this.c);
        } catch (Throwable th) {
            th.toString();
            boolean z = ob1.a;
            return null;
        }
    }
}
