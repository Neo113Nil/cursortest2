package yads;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class rg1 extends Lambda implements Function1 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg1(Context context, String str) {
        super(1);
        this.b = context;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new qg1(this.b, this.c);
    }
}
