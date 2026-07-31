package io.bidmachine.analytics.internal.y;

import android.content.Context;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.I.g;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class a extends io.bidmachine.analytics.internal.w.a {
    public static final C1769a i = new C1769a(null);
    private final Function0 g;
    private final String h = "aints";

    /* renamed from: io.bidmachine.analytics.internal.y.a$a, reason: collision with other inner class name */
    public static final class C1769a {
        public /* synthetic */ C1769a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1769a() {
        }
    }

    public a(Function0 function0) {
        this.g = function0;
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public String a() {
        return this.h;
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public void d(Context context) {
    }

    @Override // io.bidmachine.analytics.internal.w.a
    public File a(ReaderConfig.Rule rule) {
        if (rule instanceof ReaderConfig.Rule.GeneralRule) {
            return new File((File) this.g.mo4828invoke(), g.b(((ReaderConfig.Rule.GeneralRule) rule).getPath()));
        }
        throw new IllegalStateException("Check failed.");
    }
}
