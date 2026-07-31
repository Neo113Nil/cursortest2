package io.bidmachine.internal;

import android.content.Context;
import io.bidmachine.BidMachineSharedPreferenceKt;
import io.bidmachine.SessionManagerKtWrapper;
import io.bidmachine.core.Logger;
import io.bidmachine.util.version.Version;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class Q {
    public static final b b = new b(null);
    private final Function0 a;

    static final class a extends Lambda implements Function0 {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Version mo4828invoke() {
            Version parseVersion = Version.INSTANCE.parseVersion("3.7.1");
            if (parseVersion != null) {
                return parseVersion;
            }
            Logger.e("Unexpected version parsing error: 3.7.1");
            return new Version(0, 0, 0);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Q() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    private final S a(Context context, SessionManagerKtWrapper sessionManagerKtWrapper) {
        Version version;
        S a2;
        Version version2 = (Version) this.a.mo4828invoke();
        BidMachineSharedPreferenceKt bidMachineSharedPreferenceKt = BidMachineSharedPreferenceKt.INSTANCE;
        List historyVersionMilestoneList = bidMachineSharedPreferenceKt.getHistoryVersionMilestoneList(context);
        S currentVersionMilestone = bidMachineSharedPreferenceKt.getCurrentVersionMilestone(context);
        S s = null;
        Version f = currentVersionMilestone != null ? currentVersionMilestone.f() : null;
        if (Intrinsics.areEqual(version2, f)) {
            return currentVersionMilestone;
        }
        long sessionStartTime = sessionManagerKtWrapper.getSessionStartTime();
        Version version3 = f;
        S s2 = new S(version2, 0, sessionStartTime, sessionStartTime, 0L, 0L);
        List mutableList = CollectionsKt.toMutableList((Collection) historyVersionMilestoneList);
        if (currentVersionMilestone != null) {
            a2 = currentVersionMilestone.a((r22 & 1) != 0 ? currentVersionMilestone.a : null, (r22 & 2) != 0 ? currentVersionMilestone.b : 0, (r22 & 4) != 0 ? currentVersionMilestone.c : 0L, (r22 & 8) != 0 ? currentVersionMilestone.d : 0L, (r22 & 16) != 0 ? currentVersionMilestone.e : 0L, (r22 & 32) != 0 ? currentVersionMilestone.f : currentVersionMilestone.a());
            mutableList.add(a2);
        }
        bidMachineSharedPreferenceKt.setHistoryVersionMilestoneList(context, mutableList);
        if (version3 == null) {
            a(context, sessionStartTime);
        } else if (version2.compareTo(version3) < 0) {
            a(version3, version2);
        } else {
            Iterator it = historyVersionMilestoneList.iterator();
            if (it.hasNext()) {
                ?? next = it.next();
                if (it.hasNext()) {
                    Version f2 = ((S) next).f();
                    do {
                        Object next2 = it.next();
                        Version f3 = ((S) next2).f();
                        next = next;
                        if (f2.compareTo(f3) < 0) {
                            next = next2;
                            f2 = f3;
                        }
                    } while (it.hasNext());
                }
                s = next;
            }
            S s3 = s;
            if (s3 == null || (version = s3.f()) == null) {
                version = version3;
            }
            a(version3, version2, version);
        }
        return s2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(S s) {
        return "New session, milestone updated:\n" + s;
    }

    public final void c(Context context, SessionManagerKtWrapper sessionManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        S a2 = a(context, sessionManager);
        final S a3 = a2 != null ? a2.a((r22 & 1) != 0 ? a2.a : null, (r22 & 2) != 0 ? a2.b : a2.e() + 1, (r22 & 4) != 0 ? a2.c : 0L, (r22 & 8) != 0 ? a2.d : sessionManager.getSessionStartTime(), (r22 & 16) != 0 ? a2.e : sessionManager.getSessionDurationMs(), (r22 & 32) != 0 ? a2.f : a2.a()) : null;
        BidMachineSharedPreferenceKt.INSTANCE.setCurrentVersionMilestone(context, a3);
        Logger.d("VersionManager", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.internal.Q$$ExternalSyntheticLambda0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String b2;
                b2 = Q.b(S.this);
                return b2;
            }
        });
    }

    public Q(Function0 currentVersionProvider) {
        Intrinsics.checkNotNullParameter(currentVersionProvider, "currentVersionProvider");
        this.a = currentVersionProvider;
    }

    public final void b(Context context, SessionManagerKtWrapper sessionManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        BidMachineSharedPreferenceKt bidMachineSharedPreferenceKt = BidMachineSharedPreferenceKt.INSTANCE;
        S currentVersionMilestone = bidMachineSharedPreferenceKt.getCurrentVersionMilestone(context);
        final S a2 = currentVersionMilestone != null ? currentVersionMilestone.a((r22 & 1) != 0 ? currentVersionMilestone.a : null, (r22 & 2) != 0 ? currentVersionMilestone.b : 0, (r22 & 4) != 0 ? currentVersionMilestone.c : 0L, (r22 & 8) != 0 ? currentVersionMilestone.d : 0L, (r22 & 16) != 0 ? currentVersionMilestone.e : sessionManager.getSessionDurationMs(), (r22 & 32) != 0 ? currentVersionMilestone.f : 0L) : null;
        bidMachineSharedPreferenceKt.setCurrentVersionMilestone(context, a2);
        Logger.d("VersionManager", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.internal.Q$$ExternalSyntheticLambda2
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String a3;
                a3 = Q.a(S.this);
                return a3;
            }
        });
    }

    public /* synthetic */ Q(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.a : function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(Version from, Version to, Version version) {
        Intrinsics.checkNotNullParameter(from, "$from");
        Intrinsics.checkNotNullParameter(to, "$to");
        return "Upgrade detected: " + from + " -> " + to + ", last max version: " + version;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(Version from, Version to) {
        Intrinsics.checkNotNullParameter(from, "$from");
        Intrinsics.checkNotNullParameter(to, "$to");
        return "Downgrade detected: " + from + " -> " + to;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(S s) {
        return "Pause session, milestone updated:\n" + s;
    }

    private final void a(Context context, long j) {
        BidMachineSharedPreferenceKt bidMachineSharedPreferenceKt = BidMachineSharedPreferenceKt.INSTANCE;
        if (bidMachineSharedPreferenceKt.hasBMIFV(context)) {
            Logger.d("VersionManager", "Migration from old version detected");
        } else {
            Logger.d("VersionManager", "Install detected");
            bidMachineSharedPreferenceKt.setSdkInstallTime(context, j);
        }
    }

    private final void a(final Version version, final Version version2, final Version version3) {
        Logger.d("VersionManager", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.internal.Q$$ExternalSyntheticLambda1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String b2;
                b2 = Q.b(Version.this, version2, version3);
                return b2;
            }
        });
    }

    private final void a(final Version version, final Version version2) {
        Logger.w("VersionManager", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.internal.Q$$ExternalSyntheticLambda3
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String b2;
                b2 = Q.b(Version.this, version2);
                return b2;
            }
        });
    }
}
