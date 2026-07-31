package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;

/* loaded from: classes5.dex */
public final class ie extends Lambda implements Function0 {
    public static final ie b = new ie();

    public ie() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new Regex("at\\s+([^\\(]+)\\(([^:]+):(\\d+)\\)");
    }
}
