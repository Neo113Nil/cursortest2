package yads;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes15.dex */
public final class bb1 extends Lambda implements Function1 {
    public static final bb1 b = new bb1();

    public bb1() {
        super(1);
    }

    public static String a(ja1 ja1Var) {
        return "\t·\t" + ja1Var.getMessage();
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a((ja1) obj);
    }
}
