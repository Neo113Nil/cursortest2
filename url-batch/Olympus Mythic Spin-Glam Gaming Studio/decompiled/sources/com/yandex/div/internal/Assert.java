package com.yandex.div.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBCommonConstants;

/* loaded from: classes6.dex */
public class Assert {

    @NonNull
    private static AssertionErrorHandler sAssertionErrorHandler = new AssertionErrorHandler() { // from class: com.yandex.div.internal.Assert$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.AssertionErrorHandler
        public final void handleError(AssertionError assertionError) {
            Assert.lambda$static$0(assertionError);
        }
    };
    private static volatile boolean sEnabled = false;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(AssertionError assertionError) {
        throw assertionError;
    }

    private Assert() {
    }

    public static boolean isEnabled() {
        return sEnabled;
    }

    public static void setEnabled(boolean z) {
        sEnabled = z;
    }

    public static void assertTrue(@Nullable String str, boolean z) {
        if (z) {
            return;
        }
        fail(str);
    }

    public static void assertTrue(boolean z) {
        assertTrue(null, z);
    }

    public static void assertFalse(@Nullable String str, boolean z) {
        assertTrue(str, !z);
    }

    public static void assertFalse(boolean z) {
        assertFalse(null, z);
    }

    public static void fail() {
        fail(null);
    }

    public static void fail(@Nullable String str) {
        if (sEnabled) {
            if (str == null) {
                str = "";
            }
            performFail(new AssertionError(str));
        }
    }

    public static void fail(@Nullable String str, @Nullable Throwable th) {
        if (sEnabled) {
            AssertionError assertionError = new AssertionError(str);
            assertionError.initCause(th);
            performFail(assertionError);
        }
    }

    public static void setAssertPerformer(@NonNull AssertionErrorHandler assertionErrorHandler) {
        sAssertionErrorHandler = assertionErrorHandler;
    }

    public static void assertEquals(@Nullable Object obj, @Nullable Object obj2) {
        assertEquals((String) null, obj, obj2);
    }

    public static void assertEquals(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        if (obj == null && obj2 == null) {
            return;
        }
        if (obj == null || !obj.equals(obj2)) {
            if ((obj instanceof String) && (obj2 instanceof String)) {
                if (str == null) {
                    str = "";
                }
                performFail(new ComparisonFailure(str, (String) obj, (String) obj2));
                return;
            }
            failNotEquals(str, obj, obj2);
        }
    }

    public static void assertEquals(long j, long j2) {
        assertEquals((String) null, j, j2);
    }

    public static void assertEquals(int i, int i2) {
        assertEquals((String) null, i, i2);
    }

    public static void assertEquals(@Nullable String str, long j, long j2) {
        assertEquals(str, Long.valueOf(j), Long.valueOf(j2));
    }

    public static void assertNotNull(@Nullable String str, @Nullable Object obj) {
        assertTrue(str, obj != null);
    }

    public static void assertNotNull(@Nullable Object obj) {
        assertNotNull(null, obj);
    }

    public static void assertNull(@Nullable String str, @Nullable Object obj) {
        assertTrue(str, obj == null);
    }

    public static void assertNull(@Nullable Object obj) {
        assertNull(null, obj);
    }

    public static void assertSame(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        if (obj == obj2) {
            return;
        }
        failNotSame(str, obj, obj2);
    }

    public static void assertSame(@Nullable Object obj, @Nullable Object obj2) {
        assertSame(null, obj, obj2);
    }

    public static void assertNotSame(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        if (obj == obj2) {
            failSame(str);
        }
    }

    public static void assertNotSame(@Nullable Object obj, @Nullable Object obj2) {
        assertNotSame(null, obj, obj2);
    }

    public static void assertMainThread() {
        if (isEnabled()) {
            assertSame("Code run not in main thread!", Looper.getMainLooper(), Looper.myLooper());
        }
    }

    public static void assertNotMainThread() {
        if (isEnabled()) {
            assertNotSame("Code run in main thread!", Looper.getMainLooper(), Looper.myLooper());
        }
    }

    private static void failSame(@Nullable String str) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str + " ";
        }
        fail(str2 + "expected not same");
    }

    private static void failNotSame(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str + " ";
        }
        fail(str2 + "expected same:<" + obj + "> was not:<" + obj2 + ">");
    }

    private static void failNotEquals(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        fail(format(str, obj, obj2));
    }

    static String format(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        String str2 = "";
        if (str != null && !str.equals("")) {
            str2 = str + " ";
        }
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        if (valueOf.equals(valueOf2)) {
            return str2 + "expected: " + formatClassAndValue(obj, valueOf) + " but was: " + formatClassAndValue(obj2, valueOf2);
        }
        return str2 + "expected:<" + valueOf + "> but was:<" + valueOf2 + ">";
    }

    private static String formatClassAndValue(@Nullable Object obj, @Nullable String str) {
        return (obj == null ? POBCommonConstants.NULL_VALUE : obj.getClass().getName()) + "<" + str + ">";
    }

    private static void performFail(@NonNull AssertionError assertionError) {
        if (isEnabled()) {
            sAssertionErrorHandler.handleError(assertionError);
        }
    }
}
