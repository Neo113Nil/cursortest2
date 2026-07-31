package yads;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes11.dex */
public final /* synthetic */ class im2 extends FunctionReferenceImpl implements Function1 {
    public im2() {
        super(1, em.a, em.class, "decompressBase64GzipAsString", "decompressBase64GzipAsString(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return em.b((String) obj);
    }
}
