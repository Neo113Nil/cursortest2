package io.bidmachine.analytics.internal.t;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class e {
    private static final a d = new a(null);
    private final int a;
    private final Map b;
    private final Object c;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e(int i) {
        this.a = i;
        this.b = new LinkedHashMap();
        this.c = new Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputStream a(String str) {
        Object m8023constructorimpl;
        synchronized (this.c) {
            try {
                Result.Companion companion = Result.INSTANCE;
                g gVar = (g) this.b.remove(str);
                m8023constructorimpl = Result.m8023constructorimpl(new ByteArrayInputStream(gVar != null ? h.a(gVar) : null));
            } finally {
                return (InputStream) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
            }
        }
        return (InputStream) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String b(String str) {
        Object m8023constructorimpl;
        Long a2;
        synchronized (this.c) {
            try {
                Result.Companion companion = Result.INSTANCE;
                g gVar = (g) this.b.get(str);
                m8023constructorimpl = Result.m8023constructorimpl((gVar == null || (a2 = gVar.a()) == null) ? null : a2.toString());
            } finally {
                return (String) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
            }
        }
        return (String) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
    }

    public /* synthetic */ e(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2097152 : i);
    }

    public final void a(String str, String str2) {
        synchronized (this.c) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Map map = this.b;
                Object obj = map.get(str);
                if (obj == null) {
                    obj = a();
                    map.put(str, obj);
                }
                ((g) obj).a(str2);
                Result.m8023constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    private final g a() {
        int i = this.a;
        return new g(i / 2, i);
    }
}
