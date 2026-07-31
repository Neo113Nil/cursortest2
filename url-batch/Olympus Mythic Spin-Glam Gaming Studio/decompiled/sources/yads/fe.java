package yads;

import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class fe extends Lambda implements Function0 {
    public static final fe b = new fe();

    public fe() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    }
}
