package com.ironsource;

import android.content.Context;
import com.ironsource.De;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class De implements Ec {

    @NotNull
    public static final De a = new De();

    @NotNull
    private static final Ge b = new Ge();

    public static final class a implements InterfaceC4921ue {
        final /* synthetic */ InterfaceC4921ue a;

        a(InterfaceC4921ue interfaceC4921ue) {
            this.a = interfaceC4921ue;
        }

        @Override // com.ironsource.InterfaceC4921ue
        public void a(@NotNull final C4810oe sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            Ge ge = De.b;
            final InterfaceC4921ue interfaceC4921ue = this.a;
            ge.c(new Runnable() { // from class: com.ironsource.De$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    De.a.a(C4810oe.this, interfaceC4921ue);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4810oe sdkConfig, InterfaceC4921ue listener) {
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            Intrinsics.checkNotNullParameter(listener, "$listener");
            De.a.a(sdkConfig, listener);
        }

        @Override // com.ironsource.InterfaceC4921ue
        public void a(@NotNull final C4846qe error, @Nullable final C4608d9 c4608d9) {
            Intrinsics.checkNotNullParameter(error, "error");
            Ge ge = De.b;
            final InterfaceC4921ue interfaceC4921ue = this.a;
            ge.b(new Runnable() { // from class: com.ironsource.De$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    De.a.a(InterfaceC4921ue.this, error, c4608d9);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(InterfaceC4921ue listener, C4846qe error, C4608d9 c4608d9) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(error, "$error");
            listener.a(error, c4608d9);
        }
    }

    private De() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, C4957we initRequest, InterfaceC4921ue listener) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        new U9().a(EnumC4939ve.LEVEL_PLAY_INIT);
        a.a(context, initRequest, listener, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Context context, C4957we initRequest, InterfaceC4921ue listener) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        com.ironsource.mediationsdk.p h = com.ironsource.mediationsdk.p.h();
        String d = initRequest.d();
        IronSource.a[] aVarArr = (IronSource.a[]) initRequest.e().toArray(new IronSource.a[0]);
        List<IronSource.a> validAdUnitsList = h.a(context, d, false, (IronSource.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        Intrinsics.checkNotNullExpressionValue(validAdUnitsList, "validAdUnitsList");
        initRequest.a(validAdUnitsList);
        new U9().a(EnumC4939ve.EXTERNAL_MEDIATION_INIT);
        a.a(context, initRequest, listener, true);
    }

    public final void c(@NotNull final Context context, @NotNull final C4957we initRequest, @NotNull final InterfaceC4921ue listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b.c(new Runnable() { // from class: com.ironsource.De$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                De.d(context, initRequest, listener);
            }
        });
    }

    @Override // com.ironsource.Ec
    public void onInitFailed(@NotNull final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        b.c(new Runnable() { // from class: com.ironsource.De$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                De.a(IronSourceError.this);
            }
        });
    }

    public final void a(@NotNull final Context context, @NotNull final C4957we initRequest, @NotNull final InterfaceC4921ue listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b.c(new Runnable() { // from class: com.ironsource.De$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                De.b(context, initRequest, listener);
            }
        });
    }

    private final void a(Context context, C4957we c4957we, final InterfaceC4921ue interfaceC4921ue, boolean z) {
        String f = c4957we.f();
        if (f != null && f.length() > 0) {
            com.ironsource.mediationsdk.p.h().j(c4957we.f());
        } else {
            c4957we = new C4957we(c4957we.d(), com.ironsource.mediationsdk.p.h().j(), CollectionsKt.toMutableList((Collection) c4957we.e()));
        }
        com.ironsource.mediationsdk.p h = com.ironsource.mediationsdk.p.h();
        String d = c4957we.d();
        IronSource.a[] aVarArr = (IronSource.a[]) c4957we.e().toArray(new IronSource.a[0]);
        final IronSourceError a2 = h.a(context, d, z, this, (IronSource.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        if (a2 == null || a2.getErrorCode() == 2020) {
            Ce.l.a().a(context, c4957we, new a(interfaceC4921ue));
            return;
        }
        if (a2.getErrorCode() == 2040) {
            We e = com.ironsource.mediationsdk.p.h().e();
            if (e != null) {
                a(new C4810oe(new C4975xe(e), null, null, 6, null), interfaceC4921ue);
                return;
            }
        } else if (a2.getErrorCode() == 2030) {
            Ce.l.a().d();
            return;
        }
        b.b(new Runnable() { // from class: com.ironsource.De$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                De.a(InterfaceC4921ue.this, a2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(We serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "$serverResponse");
        Ce.l.a().a(new C4975xe(serverResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4921ue listener, IronSourceError error) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullExpressionValue(error, "error");
        InterfaceC4921ue.a(listener, new C4846qe(error), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final C4810oe c4810oe, final InterfaceC4921ue interfaceC4921ue) {
        if (!com.ironsource.mediationsdk.p.h().a(false, c4810oe.d())) {
            b.b(new Runnable() { // from class: com.ironsource.De$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    De.a(InterfaceC4921ue.this);
                }
            });
        } else {
            b.b(new Runnable() { // from class: com.ironsource.De$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    De.a(InterfaceC4921ue.this, c4810oe);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4921ue listener) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        InterfaceC4921ue.a(listener, new C4846qe(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "An unknown error has occurred"), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4921ue listener, C4810oe sdkInitResponse) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(sdkInitResponse, "$sdkInitResponse");
        listener.a(sdkInitResponse);
    }

    @Override // com.ironsource.Ec
    public void a(@NotNull final We serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        b.c(new Runnable() { // from class: com.ironsource.De$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                De.b(We.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Ce.l.a().a(new C4846qe(error));
    }
}
