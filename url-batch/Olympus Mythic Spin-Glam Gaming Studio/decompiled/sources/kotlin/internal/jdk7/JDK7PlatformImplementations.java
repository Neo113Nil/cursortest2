package kotlin.internal.jdk7;

import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.internal.PlatformImplementations;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JDK7PlatformImplementations.kt */
/* loaded from: classes8.dex */
public abstract class JDK7PlatformImplementations extends PlatformImplementations {

    /* compiled from: JDK7PlatformImplementations.kt */
    private static final class ReflectSdkVersion {
        public static final ReflectSdkVersion INSTANCE = new ReflectSdkVersion();
        public static final Integer sdkVersion;

        private ReflectSdkVersion() {
        }

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                sdkVersion = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            sdkVersion = num2;
        }
    }

    private final boolean sdkIsNullOrAtLeast(int i) {
        Integer num = ReflectSdkVersion.sdkVersion;
        return num == null || num.intValue() >= i;
    }

    @Override // kotlin.internal.PlatformImplementations
    public void addSuppressed(Throwable cause, Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (sdkIsNullOrAtLeast(19)) {
            cause.addSuppressed(exception);
        } else {
            super.addSuppressed(cause, exception);
        }
    }

    @Override // kotlin.internal.PlatformImplementations
    public List getSuppressed(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (sdkIsNullOrAtLeast(19)) {
            Throwable[] suppressed = exception.getSuppressed();
            Intrinsics.checkNotNullExpressionValue(suppressed, "getSuppressed(...)");
            return ArraysKt.asList(suppressed);
        }
        return super.getSuppressed(exception);
    }
}
