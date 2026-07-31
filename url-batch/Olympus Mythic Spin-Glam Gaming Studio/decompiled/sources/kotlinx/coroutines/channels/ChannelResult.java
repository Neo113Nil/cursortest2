package kotlinx.coroutines.channels;

import com.facebook.internal.AnalyticsEvents;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Channel.kt */
/* loaded from: classes11.dex */
public final class ChannelResult {
    public static final Companion Companion = new Companion(null);
    private static final Failed failed = new Failed();
    private final Object holder;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ChannelResult m8219boximpl(Object obj) {
        return new ChannelResult(obj);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Object m8220constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8221equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof ChannelResult) && Intrinsics.areEqual(obj, ((ChannelResult) obj2).m8228unboximpl());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8224hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean equals(Object obj) {
        return m8221equalsimpl(this.holder, obj);
    }

    public int hashCode() {
        return m8224hashCodeimpl(this.holder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m8228unboximpl() {
        return this.holder;
    }

    private /* synthetic */ ChannelResult(Object obj) {
        this.holder = obj;
    }

    /* renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m8226isSuccessimpl(Object obj) {
        return !(obj instanceof Failed);
    }

    /* renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m8225isClosedimpl(Object obj) {
        return obj instanceof Closed;
    }

    /* renamed from: getOrNull-impl, reason: not valid java name */
    public static final Object m8223getOrNullimpl(Object obj) {
        if (obj instanceof Failed) {
            return null;
        }
        return obj;
    }

    /* renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m8222exceptionOrNullimpl(Object obj) {
        Closed closed = obj instanceof Closed ? (Closed) obj : null;
        if (closed != null) {
            return closed.cause;
        }
        return null;
    }

    /* compiled from: Channel.kt */
    public static class Failed {
        public String toString() {
            return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED;
        }
    }

    /* compiled from: Channel.kt */
    public static final class Closed extends Failed {
        public final Throwable cause;

        public Closed(Throwable th) {
            this.cause = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Closed) && Intrinsics.areEqual(this.cause, ((Closed) obj).cause);
        }

        public int hashCode() {
            Throwable th = this.cause;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.ChannelResult.Failed
        public String toString() {
            return "Closed(" + this.cause + ')';
        }
    }

    /* compiled from: Channel.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: success-JP2dKIU, reason: not valid java name */
        public final Object m8231successJP2dKIU(Object obj) {
            return ChannelResult.m8220constructorimpl(obj);
        }

        /* renamed from: failure-PtdJZtk, reason: not valid java name */
        public final Object m8230failurePtdJZtk() {
            return ChannelResult.m8220constructorimpl(ChannelResult.failed);
        }

        /* renamed from: closed-JP2dKIU, reason: not valid java name */
        public final Object m8229closedJP2dKIU(Throwable th) {
            return ChannelResult.m8220constructorimpl(new Closed(th));
        }
    }

    public String toString() {
        return m8227toStringimpl(this.holder);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8227toStringimpl(Object obj) {
        if (obj instanceof Closed) {
            return ((Closed) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
