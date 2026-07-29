package com.onevcat.uniwebview.internal.obfuscated;

import java.io.ByteArrayOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class x2 extends Lambda implements Function1 {
    public static final x2 a = new x2();

    public x2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        ByteArrayOutputStream byteArrayOutputStream = it.n;
        if (byteArrayOutputStream != null) {
            byteArrayOutputStream.close();
        }
        it.n = null;
        it.o = null;
        return Unit.INSTANCE;
    }
}
