package yads;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes12.dex */
public final class vh2 {

    @NotNull
    public static final uh2 Companion = new uh2();
    public static final Lazy[] d = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, th2.b), null, null};
    public final yh2 a;
    public final String b;
    public final Integer c;

    public vh2(int i, yh2 yh2Var, String str, Integer num) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, sh2.b);
        }
        this.a = yh2Var;
        this.b = str;
        this.c = num;
    }

    public vh2(yh2 yh2Var, String str, Integer num) {
        this.a = yh2Var;
        this.b = str;
        this.c = num;
    }
}
