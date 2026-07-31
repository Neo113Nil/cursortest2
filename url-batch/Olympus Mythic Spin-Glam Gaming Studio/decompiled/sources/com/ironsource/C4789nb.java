package com.ironsource;

import androidx.annotation.VisibleForTesting;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.nb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C4789nb {

    @NotNull
    public static final a d = new a(null);

    @NotNull
    private static C4789nb e;

    @NotNull
    private final C4936vb a;

    @NotNull
    private final com.ironsource.mediationsdk.c b;

    @NotNull
    private final Ob c;

    /* renamed from: com.ironsource.nb$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final C4789nb a() {
            return C4789nb.e;
        }

        private a() {
        }

        @VisibleForTesting
        public final void a(@NotNull C4789nb testInstance) {
            Intrinsics.checkNotNullParameter(testInstance, "testInstance");
            C4789nb.e = testInstance;
        }
    }

    static {
        C4936vb c4936vb = new C4936vb();
        com.ironsource.mediationsdk.c b = com.ironsource.mediationsdk.c.b();
        Intrinsics.checkNotNullExpressionValue(b, "getInstance()");
        e = new C4789nb(c4936vb, b, new Ob(null, null, null, null, null, 31, null));
    }

    public C4789nb(@NotNull C4936vb tools, @NotNull com.ironsource.mediationsdk.c adapterRepository, @NotNull Ob metaDataManager) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adapterRepository, "adapterRepository");
        Intrinsics.checkNotNullParameter(metaDataManager, "metaDataManager");
        this.a = tools;
        this.b = adapterRepository;
        this.c = metaDataManager;
    }

    public final void b(final boolean z) {
        this.a.c(new Runnable() { // from class: com.ironsource.nb$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4789nb.b(C4789nb.this, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4789nb this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a.b(z);
        if (!this$0.a.a()) {
            this$0.c.b(z);
        } else {
            this$0.a.b();
            IronLog.API.error("LevelPlayPrivacySettings.setCOPPA() must be called before LevelPlay.init()");
        }
    }

    public final void a(@NotNull final Map<String, Boolean> networkConsents) {
        Intrinsics.checkNotNullParameter(networkConsents, "networkConsents");
        this.a.c(new Runnable() { // from class: com.ironsource.nb$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C4789nb.a(C4789nb.this, networkConsents);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4789nb this$0, Map networkConsents) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(networkConsents, "$networkConsents");
        this$0.a.a((Map<String, Boolean>) networkConsents);
        this$0.b.a((Map<String, Boolean>) networkConsents);
    }

    public final void a(final boolean z) {
        this.a.c(new Runnable() { // from class: com.ironsource.nb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4789nb.a(C4789nb.this, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4789nb this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a.a(z);
        this$0.c.a(z);
    }
}
