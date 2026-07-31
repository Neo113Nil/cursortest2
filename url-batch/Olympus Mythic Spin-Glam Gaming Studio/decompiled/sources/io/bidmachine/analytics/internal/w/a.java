package io.bidmachine.analytics.internal.w;

import io.bidmachine.analytics.ReaderConfig;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public abstract class a extends io.bidmachine.analytics.internal.r.a {
    public abstract File a(ReaderConfig.Rule rule);

    @Override // io.bidmachine.analytics.internal.r.a
    public Object a(ReaderConfig.Rule rule, Continuation continuation) {
        return a(this, rule, continuation);
    }

    static /* synthetic */ Object a(a aVar, ReaderConfig.Rule rule, Continuation continuation) {
        File a = aVar.a(rule);
        if (!a.exists()) {
            throw new FileNotFoundException();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a.lastModified());
        sb.append('_');
        sb.append(a.length());
        return sb.toString();
    }
}
