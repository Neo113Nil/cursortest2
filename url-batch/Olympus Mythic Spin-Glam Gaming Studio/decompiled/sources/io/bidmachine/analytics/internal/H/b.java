package io.bidmachine.analytics.internal.H;

import android.database.sqlite.SQLiteDatabase;
import io.bidmachine.analytics.internal.I.g;
import io.bidmachine.analytics.internal.g.C5901c;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;

/* loaded from: classes4.dex */
public final class b implements io.bidmachine.analytics.internal.H.a {
    private final SQLiteDatabase a;
    private final Lazy b = LazyKt.lazy(new a());

    static final class a extends Lambda implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.F.a mo4828invoke() {
            return new io.bidmachine.analytics.internal.F.a(b.this.a);
        }
    }

    public b(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    private final io.bidmachine.analytics.internal.F.a a() {
        return (io.bidmachine.analytics.internal.F.a) this.b.getValue();
    }

    @Override // io.bidmachine.analytics.internal.H.a
    public Object a(C5901c c5901c) {
        return a().a(io.bidmachine.analytics.internal.G.b.b(c5901c));
    }

    @Override // io.bidmachine.analytics.internal.H.a
    public Object a(String str) {
        return a().b(str);
    }

    @Override // io.bidmachine.analytics.internal.H.a
    public Object a(long j) {
        return a().a(g.a(new Date(System.currentTimeMillis() - Duration.m8147getInWholeMillisecondsimpl(j))));
    }
}
