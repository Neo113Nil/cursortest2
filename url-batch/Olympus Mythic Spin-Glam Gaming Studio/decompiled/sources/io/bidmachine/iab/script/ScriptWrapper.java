package io.bidmachine.iab.script;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/bidmachine/iab/script/ScriptWrapper;", "", "<init>", "()V", "", "script", "wrap", "(Ljava/lang/String;)Ljava/lang/String;", "", "containsTags", "(Ljava/lang/String;)Z", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class ScriptWrapper {

    @NotNull
    public static final ScriptWrapper INSTANCE = new ScriptWrapper();

    private ScriptWrapper() {
    }

    public static final boolean containsTags(@NotNull String script) {
        Intrinsics.checkNotNullParameter(script, "script");
        return StringsKt.startsWith$default(script, "<script type='application/javascript'>", false, 2, (Object) null) && StringsKt.endsWith$default(script, "</script>", false, 2, (Object) null);
    }

    @NotNull
    public static final String wrap(@NotNull String script) {
        Intrinsics.checkNotNullParameter(script, "script");
        return "<script type='application/javascript'>" + script + "</script>";
    }
}
