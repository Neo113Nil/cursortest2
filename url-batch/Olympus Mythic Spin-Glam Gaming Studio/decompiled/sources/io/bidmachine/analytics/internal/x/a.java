package io.bidmachine.analytics.internal.x;

import android.content.Context;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.I.g;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class a extends io.bidmachine.analytics.internal.w.a {
    public static final C1768a h = new C1768a(null);
    private final String g = "aexs";

    /* renamed from: io.bidmachine.analytics.internal.x.a$a, reason: collision with other inner class name */
    public static final class C1768a {
        public /* synthetic */ C1768a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1768a() {
        }
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public String a() {
        return this.g;
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public void d(Context context) {
    }

    @Override // io.bidmachine.analytics.internal.w.a
    public File a(ReaderConfig.Rule rule) {
        if (rule instanceof ReaderConfig.Rule.GeneralRule) {
            return new File(g.b(((ReaderConfig.Rule.GeneralRule) rule).getPath()));
        }
        throw new IllegalStateException("Check failed.");
    }
}
