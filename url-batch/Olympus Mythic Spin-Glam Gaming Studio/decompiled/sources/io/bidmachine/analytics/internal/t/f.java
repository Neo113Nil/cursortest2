package io.bidmachine.analytics.internal.t;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;

/* loaded from: classes6.dex */
public final class f {
    private Object a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public f() {
        Result.Companion companion = Result.INSTANCE;
        this.a = Result.m8023constructorimpl(ResultKt.createFailure(new NullPointerException()));
        this.b = "amF2YS5sYW5nLlByb2Nlc3NCdWlsZGVy";
        this.c = "c3RhcnQ=";
        this.d = "Z2V0SW5wdXRTdHJlYW0=";
        this.e = "ZGVzdHJveQ==";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputStream a(List list) {
        Object m8023constructorimpl;
        Object m8023constructorimpl2;
        Method method;
        Object invoke;
        try {
            Result.Companion companion = Result.INSTANCE;
            Class<?> cls = Class.forName(io.bidmachine.analytics.internal.I.g.a(this.b));
            m8023constructorimpl = Result.m8023constructorimpl(cls.getMethod(io.bidmachine.analytics.internal.I.g.a(this.c), null).invoke(cls.getConstructor(List.class).newInstance(CollectionsKt.toList(list)), null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        this.a = m8023constructorimpl;
        if (Result.m8029isSuccessimpl(m8023constructorimpl)) {
            if (m8023constructorimpl != null) {
                try {
                    method = m8023constructorimpl.getClass().getMethod(io.bidmachine.analytics.internal.I.g.a(this.d), null);
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.INSTANCE;
                    m8023constructorimpl = ResultKt.createFailure(th2);
                }
                if (method != null) {
                    invoke = method.invoke(m8023constructorimpl, null);
                    m8023constructorimpl2 = Result.m8023constructorimpl((InputStream) invoke);
                    return (InputStream) (Result.m8028isFailureimpl(m8023constructorimpl2) ? null : m8023constructorimpl2);
                }
            }
            invoke = null;
            m8023constructorimpl2 = Result.m8023constructorimpl((InputStream) invoke);
            return (InputStream) (Result.m8028isFailureimpl(m8023constructorimpl2) ? null : m8023constructorimpl2);
        }
        m8023constructorimpl2 = Result.m8023constructorimpl(m8023constructorimpl);
        return (InputStream) (Result.m8028isFailureimpl(m8023constructorimpl2) ? null : m8023constructorimpl2);
    }

    public final void a() {
        Object obj = this.a;
        if (Result.m8029isSuccessimpl(obj)) {
            Object obj2 = null;
            if (obj != null) {
                try {
                    Method method = obj.getClass().getMethod(io.bidmachine.analytics.internal.I.g.a(this.e), null);
                    if (method != null) {
                        obj2 = method.invoke(obj, null);
                    }
                } catch (Throwable th) {
                    Result.Companion companion = Result.INSTANCE;
                    obj = ResultKt.createFailure(th);
                }
            }
            Result.m8023constructorimpl(obj2);
            return;
        }
        Result.m8023constructorimpl(obj);
    }
}
