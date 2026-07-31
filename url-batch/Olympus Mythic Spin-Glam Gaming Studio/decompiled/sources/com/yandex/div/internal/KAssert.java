package com.yandex.div.internal;

import com.ironsource.X3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KAssert.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0003\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\bJ'\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\bJ!\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\bJ\t\u0010\r\u001a\u00020\u0004H\u0086\bJ\t\u0010\u000e\u001a\u00020\u0004H\u0086\bJ#\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\bJ-\u0010\u0011\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\bJ#\u0010\u0012\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\bJ-\u0010\u0013\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\bJ'\u0010\u0014\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\bJ!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\bJ\u0017\u0010\u0015\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\bJ#\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\b¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/internal/KAssert;", "", "()V", "assertEquals", "", "expected", "actual", "message", "Lkotlin/Function0;", "", "assertFalse", "condition", "", "assertMainThread", "assertNotMainThread", "assertNotNull", "nullable", "assertNotSame", "assertNull", "assertSame", "assertTrue", X3.g.e, "cause", "", "assertion_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KAssert {

    @NotNull
    public static final KAssert INSTANCE = new KAssert();

    private KAssert() {
    }

    public final void fail(@NotNull Function0 message) {
        if (Assert.isEnabled()) {
            Assert.fail((String) message.mo4828invoke());
        }
    }

    public static /* synthetic */ void fail$default(KAssert kAssert, Throwable th, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.yandex.div.internal.KAssert$fail$1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "";
                }
            };
        }
        if (Assert.isEnabled()) {
            Assert.fail((String) function0.mo4828invoke(), th);
        }
    }

    public final void fail(@Nullable Throwable cause, @NotNull Function0 message) {
        if (Assert.isEnabled()) {
            Assert.fail((String) message.mo4828invoke(), cause);
        }
    }

    public static /* synthetic */ void assertTrue$default(KAssert kAssert, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.yandex.div.internal.KAssert$assertTrue$1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "";
                }
            };
        }
        if (!Assert.isEnabled() || z) {
            return;
        }
        Assert.fail((String) function0.mo4828invoke());
    }

    public final void assertTrue(boolean condition, @NotNull Function0 message) {
        if (!Assert.isEnabled() || condition) {
            return;
        }
        Assert.fail((String) message.mo4828invoke());
    }

    public static /* synthetic */ void assertFalse$default(KAssert kAssert, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.yandex.div.internal.KAssert$assertFalse$1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "";
                }
            };
        }
        if (Assert.isEnabled() && z) {
            Assert.fail((String) function0.mo4828invoke());
        }
    }

    public final void assertFalse(boolean condition, @NotNull Function0 message) {
        if (Assert.isEnabled() && condition) {
            Assert.fail((String) message.mo4828invoke());
        }
    }

    public static /* synthetic */ void assertTrue$default(KAssert kAssert, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 2) != 0) {
            function02 = new Function0() { // from class: com.yandex.div.internal.KAssert$assertTrue$2
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "";
                }
            };
        }
        if (!Assert.isEnabled() || ((Boolean) function0.mo4828invoke()).booleanValue()) {
            return;
        }
        Assert.fail((String) function02.mo4828invoke());
    }

    public final void assertTrue(@NotNull Function0 condition, @NotNull Function0 message) {
        if (!Assert.isEnabled() || ((Boolean) condition.mo4828invoke()).booleanValue()) {
            return;
        }
        Assert.fail((String) message.mo4828invoke());
    }

    public static /* synthetic */ void assertFalse$default(KAssert kAssert, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 2) != 0) {
            function02 = new Function0() { // from class: com.yandex.div.internal.KAssert$assertFalse$2
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "";
                }
            };
        }
        if (Assert.isEnabled() && ((Boolean) function0.mo4828invoke()).booleanValue()) {
            Assert.fail((String) function02.mo4828invoke());
        }
    }

    public final void assertFalse(@NotNull Function0 condition, @NotNull Function0 message) {
        if (Assert.isEnabled() && ((Boolean) condition.mo4828invoke()).booleanValue()) {
            Assert.fail((String) message.mo4828invoke());
        }
    }

    public static /* synthetic */ void assertEquals$default(KAssert kAssert, Object obj, Object obj2, Function0 function0, int i, Object obj3) {
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: com.yandex.div.internal.KAssert$assertEquals$1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "";
                }
            };
        }
        if (Assert.isEnabled()) {
            Assert.assertEquals((String) function0.mo4828invoke(), obj, obj2);
        }
    }

    public final void assertEquals(@Nullable Object expected, @Nullable Object actual, @NotNull Function0 message) {
        if (Assert.isEnabled()) {
            Assert.assertEquals((String) message.mo4828invoke(), expected, actual);
        }
    }

    public static /* synthetic */ void assertNotNull$default(KAssert kAssert, Object obj, Function0 function0, int i, Object obj2) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.yandex.div.internal.KAssert$assertNotNull$1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "";
                }
            };
        }
        if (Assert.isEnabled() && obj == null) {
            Assert.fail((String) function0.mo4828invoke());
        }
    }

    public final void assertNotNull(@Nullable Object nullable, @NotNull Function0 message) {
        if (Assert.isEnabled() && nullable == null) {
            Assert.fail((String) message.mo4828invoke());
        }
    }

    public static /* synthetic */ void assertNull$default(KAssert kAssert, Object obj, Function0 function0, int i, Object obj2) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.yandex.div.internal.KAssert$assertNull$1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "";
                }
            };
        }
        if (!Assert.isEnabled() || obj == null) {
            return;
        }
        Assert.fail((String) function0.mo4828invoke());
    }

    public final void assertNull(@Nullable Object nullable, @NotNull Function0 message) {
        if (!Assert.isEnabled() || nullable == null) {
            return;
        }
        Assert.fail((String) message.mo4828invoke());
    }

    public static /* synthetic */ void assertSame$default(KAssert kAssert, Object obj, Object obj2, Function0 function0, int i, Object obj3) {
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: com.yandex.div.internal.KAssert$assertSame$1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "";
                }
            };
        }
        if (Assert.isEnabled()) {
            Assert.assertSame((String) function0.mo4828invoke(), obj, obj2);
        }
    }

    public final void assertSame(@Nullable Object expected, @Nullable Object actual, @NotNull Function0 message) {
        if (Assert.isEnabled()) {
            Assert.assertSame((String) message.mo4828invoke(), expected, actual);
        }
    }

    public static /* synthetic */ void assertNotSame$default(KAssert kAssert, Object obj, Object obj2, Function0 function0, int i, Object obj3) {
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: com.yandex.div.internal.KAssert$assertNotSame$1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "";
                }
            };
        }
        if (Assert.isEnabled()) {
            Assert.assertNotSame((String) function0.mo4828invoke(), obj, obj2);
        }
    }

    public final void assertNotSame(@Nullable Object expected, @Nullable Object actual, @NotNull Function0 message) {
        if (Assert.isEnabled()) {
            Assert.assertNotSame((String) message.mo4828invoke(), expected, actual);
        }
    }

    public final void assertMainThread() {
        if (Assert.isEnabled()) {
            Assert.assertMainThread();
        }
    }

    public final void assertNotMainThread() {
        if (Assert.isEnabled()) {
            Assert.assertNotMainThread();
        }
    }
}
