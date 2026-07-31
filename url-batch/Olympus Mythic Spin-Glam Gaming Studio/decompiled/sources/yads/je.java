package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final class je extends Lambda implements Function0 {
    public static final je b = new je();

    public je() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new Regex("^\"(.*)\"\\s+(.+?)?\\s*prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)$");
    }
}
