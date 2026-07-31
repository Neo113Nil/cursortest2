package com.ogury.ad.internal;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
public final /* synthetic */ class s extends FunctionReferenceImpl implements Function2 {
    public static final s a = new s();

    public s() {
        super(2, t.class, "<init>", "<init>(Ljava/lang/Integer;Ljava/lang/Integer;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new t((Integer) obj, (Integer) obj2);
    }
}
