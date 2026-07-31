package com.ogury.ad.internal;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class pg extends FunctionReferenceImpl implements Function2 {
    public static final pg a = new pg();

    public pg() {
        super(2, qg.class, "<init>", "<init>(Ljava/lang/Integer;Ljava/lang/Integer;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new qg((Integer) obj, (Integer) obj2);
    }
}
