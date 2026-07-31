package com.ogury.ad.internal;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class i2 extends FunctionReferenceImpl implements Function2 {
    public static final i2 a = new i2();

    public i2() {
        super(2, j2.class, "<init>", "<init>(Ljava/lang/Integer;Ljava/lang/Integer;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new j2((Integer) obj, (Integer) obj2);
    }
}
