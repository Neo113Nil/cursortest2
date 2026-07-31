package yads;

import com.yandex.div.BuildConfig;
import com.yandex.div.core.DivKit;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class au1 extends ku1 {
    public final void a(ju1 ju1Var) {
        try {
            zd3 a = ae3.a(DivKit.INSTANCE.getVersionName());
            zd3 a2 = ae3.a(BuildConfig.VERSION_NAME);
            Integer valueOf = a2 != null ? Integer.valueOf(a2.b) : null;
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                if (a == null || a.b != intValue) {
                    String format = String.format("Unsupported DivKit major version. Expected: %s. Actual: %s", Arrays.copyOf(new Object[]{valueOf, a != null ? Integer.valueOf(a.b) : null}, 2));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    ja1 ja1Var = new ja1(format);
                    ju1Var.getClass();
                    throw ja1Var;
                }
            }
        } catch (NoClassDefFoundError unused) {
            String format2 = String.format("DivKit is unavailable. Please check your buildscripts for exclusion rules for 'com.yandex.div:div'", Arrays.copyOf(new Object[0], 0));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            ja1 ja1Var2 = new ja1(format2);
            ju1Var.getClass();
            throw ja1Var2;
        }
    }
}
