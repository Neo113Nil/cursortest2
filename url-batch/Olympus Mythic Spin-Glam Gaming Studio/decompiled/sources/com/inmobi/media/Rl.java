package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* loaded from: classes13.dex */
public final class Rl {
    public static final Rl a = new Rl();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(100, r2) == r4) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00bb -> B:11:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        Ql ql;
        int i;
        Xe xe;
        int i2;
        InterfaceC3892bf interfaceC3892bf;
        if (continuationImpl instanceof Ql) {
            ql = (Ql) continuationImpl;
            int i3 = ql.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ql.e = i3 - Integer.MIN_VALUE;
                Object obj = ql.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ql.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!Nl.a(str)) {
                        throw new Sl((short) 1114);
                    }
                    xe = new Xe(str, null, null, null, null, false, 62);
                    i2 = 0;
                } else {
                    if (i == 1) {
                        i2 = ql.a;
                        xe = ql.b;
                        ResultKt.throwOnFailure(obj);
                        interfaceC3892bf = (InterfaceC3892bf) obj;
                        if (!Fl.a(interfaceC3892bf)) {
                            IntRange intRange = AbstractC4026gf.a;
                            Intrinsics.checkNotNullParameter(interfaceC3892bf, "<this>");
                            return interfaceC3892bf.d().string(Charsets.UTF_8);
                        }
                        IntRange intRange2 = AbstractC4026gf.a;
                        Intrinsics.checkNotNullParameter(interfaceC3892bf, "<this>");
                        IntRange intRange3 = AbstractC4026gf.b;
                        int first = intRange3.getFirst();
                        int last = intRange3.getLast();
                        int c = interfaceC3892bf.c();
                        if (first > c || c > last) {
                            ql.b = xe;
                            ql.a = i2;
                            ql.e = 2;
                        }
                        throw new Sl((short) 1113);
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = ql.a;
                    xe = ql.b;
                    ResultKt.throwOnFailure(obj);
                }
                int i4 = i2 + 1;
                if (i2 < 3) {
                    F9 f9 = (F9) Ve.c.getValue();
                    ql.b = xe;
                    ql.a = i4;
                    ql.e = 1;
                    Object a2 = f9.a.a(xe, ql);
                    if (a2 != coroutine_suspended) {
                        i2 = i4;
                        obj = a2;
                        interfaceC3892bf = (InterfaceC3892bf) obj;
                        if (!Fl.a(interfaceC3892bf)) {
                        }
                    }
                    return coroutine_suspended;
                }
                throw new Sl((short) 1113);
            }
        }
        ql = new Ql(this, continuationImpl);
        Object obj2 = ql.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ql.e;
        if (i != 0) {
        }
        int i42 = i2 + 1;
        if (i2 < 3) {
        }
        throw new Sl((short) 1113);
    }
}
