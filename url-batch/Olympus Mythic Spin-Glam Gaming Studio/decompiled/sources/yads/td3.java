package yads;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class td3 extends RuntimeException {
    public final rd3 b;
    public final sd3 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public td3(rd3 rd3Var, sd3 sd3Var) {
        super("Verification not executed with reason = " + r0);
        String lowerCase = sd3Var.name().toLowerCase(Locale.US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.b = rd3Var;
        this.c = sd3Var;
    }
}
