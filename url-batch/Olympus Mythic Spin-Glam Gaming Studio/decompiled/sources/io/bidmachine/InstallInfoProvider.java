package io.bidmachine;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.explorestack.protobuf.Timestamp;
import io.bidmachine.InstallInfoProvider;
import io.bidmachine.core.Logger;
import io.bidmachine.internal.C6019n;
import io.bidmachine.internal.InterfaceC6021p;
import io.bidmachine.protobuf.sdk.App;
import io.bidmachine.utils.ProtoUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u0011\u0010\r\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0013*\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lio/bidmachine/InstallInfoProvider;", "", "<init>", "()V", "", "getInstallReferrerUrl", "()Ljava/lang/String;", "getInstallVersion", "Lcom/explorestack/protobuf/Timestamp;", "getInstallReferrerClickTimestamp", "()Lcom/explorestack/protobuf/Timestamp;", "getInstallBeginTimestamp", "getInstallReferrerClickServerTimestamp", "getInstallBeginServerTimestamp", "", "isGooglePlayInstant", "()Ljava/lang/Boolean;", "Landroid/content/Context;", "context", "Lio/bidmachine/internal/n;", "createBySharedPreferences", "(Landroid/content/Context;)Lio/bidmachine/internal/n;", "Lcom/android/installreferrer/api/ReferrerDetails;", "toInstallInfo", "(Lcom/android/installreferrer/api/ReferrerDetails;)Lio/bidmachine/internal/n;", "", "initialize", "(Landroid/content/Context;)V", "Lio/bidmachine/protobuf/sdk/App$Builder;", "appBuilder", "fill", "(Lio/bidmachine/protobuf/sdk/App$Builder;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitializeExecuted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "installInfo", "Lio/bidmachine/internal/n;", "a", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class InstallInfoProvider {

    @Nullable
    private C6019n installInfo;

    @NotNull
    private final AtomicBoolean isInitializeExecuted = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    final class a {
        private final Context a;
        private final InstallReferrerClient b;
        final /* synthetic */ InstallInfoProvider c;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: io.bidmachine.InstallInfoProvider$a$a, reason: collision with other inner class name */
        final class C1710a implements InstallReferrerStateListener {
            public C1710a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void a(C1710a this$0, int i) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.a(i);
            }

            @Override // com.android.installreferrer.api.InstallReferrerStateListener
            public void onInstallReferrerServiceDisconnected() {
            }

            @Override // com.android.installreferrer.api.InstallReferrerStateListener
            public void onInstallReferrerSetupFinished(final int i) {
                new Thread(new InterfaceC6021p() { // from class: io.bidmachine.InstallInfoProvider$a$a$$ExternalSyntheticLambda0
                    @Override // io.bidmachine.utils.SafeRunnable
                    public final void onRun() {
                        InstallInfoProvider.a.C1710a.a(InstallInfoProvider.a.C1710a.this, i);
                    }
                }).start();
            }

            public final void a(int i) {
                if (i == 0) {
                    try {
                        a aVar = a.this;
                        InstallInfoProvider installInfoProvider = aVar.c;
                        ReferrerDetails installReferrer = aVar.b.getInstallReferrer();
                        Intrinsics.checkNotNullExpressionValue(installReferrer, "installReferrerClient.installReferrer");
                        C6019n installInfo = installInfoProvider.toInstallInfo(installReferrer);
                        if (!installInfo.g()) {
                            a.this.c.installInfo = installInfo;
                            n.a(a.this.a, installInfo);
                        }
                    } catch (Throwable th) {
                        Logger.w(th);
                    }
                }
                a.this.b.endConnection();
            }
        }

        public a(InstallInfoProvider installInfoProvider, Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.c = installInfoProvider;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.a = applicationContext;
            InstallReferrerClient build = InstallReferrerClient.newBuilder(applicationContext).build();
            Intrinsics.checkNotNullExpressionValue(build, "newBuilder(applicationCo…\n                .build()");
            this.b = build;
        }

        public final void a() {
            try {
                this.b.startConnection(new C1710a());
            } catch (Throwable th) {
                Logger.w(th);
            }
        }
    }

    private final C6019n createBySharedPreferences(Context context) {
        return new C6019n(n.o(context), n.p(context), n.m(context), n.k(context), n.n(context), n.l(context), n.B(context));
    }

    private final Timestamp getInstallBeginServerTimestamp() {
        Long b;
        C6019n c6019n = this.installInfo;
        if (c6019n == null || (b = c6019n.b()) == null) {
            return null;
        }
        long longValue = b.longValue();
        if (longValue > 0) {
            return ProtoUtils.secToTimestamp(longValue);
        }
        return null;
    }

    private final Timestamp getInstallBeginTimestamp() {
        Long a2;
        C6019n c6019n = this.installInfo;
        if (c6019n == null || (a2 = c6019n.a()) == null) {
            return null;
        }
        long longValue = a2.longValue();
        if (longValue > 0) {
            return ProtoUtils.secToTimestamp(longValue);
        }
        return null;
    }

    private final Timestamp getInstallReferrerClickServerTimestamp() {
        Long d;
        C6019n c6019n = this.installInfo;
        if (c6019n == null || (d = c6019n.d()) == null) {
            return null;
        }
        long longValue = d.longValue();
        if (longValue > 0) {
            return ProtoUtils.secToTimestamp(longValue);
        }
        return null;
    }

    private final Timestamp getInstallReferrerClickTimestamp() {
        Long c;
        C6019n c6019n = this.installInfo;
        if (c6019n == null || (c = c6019n.c()) == null) {
            return null;
        }
        long longValue = c.longValue();
        if (longValue > 0) {
            return ProtoUtils.secToTimestamp(longValue);
        }
        return null;
    }

    private final String getInstallReferrerUrl() {
        String e;
        C6019n c6019n = this.installInfo;
        if (c6019n == null || (e = c6019n.e()) == null || e.length() <= 0) {
            return null;
        }
        return e;
    }

    private final String getInstallVersion() {
        String f;
        C6019n c6019n = this.installInfo;
        if (c6019n == null || (f = c6019n.f()) == null || f.length() <= 0) {
            return null;
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$0(InstallInfoProvider this$0, Context context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        new a(this$0, context).a();
    }

    private final Boolean isGooglePlayInstant() {
        C6019n c6019n = this.installInfo;
        if (c6019n != null) {
            return c6019n.i();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6019n toInstallInfo(ReferrerDetails referrerDetails) {
        return new C6019n(referrerDetails.getInstallReferrer(), referrerDetails.getInstallVersion(), Long.valueOf(referrerDetails.getReferrerClickTimestampSeconds()), Long.valueOf(referrerDetails.getInstallBeginTimestampSeconds()), Long.valueOf(referrerDetails.getReferrerClickTimestampServerSeconds()), Long.valueOf(referrerDetails.getInstallBeginTimestampServerSeconds()), Boolean.valueOf(referrerDetails.getGooglePlayInstantParam()));
    }

    public final /* synthetic */ void fill(App.Builder appBuilder) {
        Intrinsics.checkNotNullParameter(appBuilder, "appBuilder");
        String installReferrerUrl = getInstallReferrerUrl();
        if (installReferrerUrl != null) {
            appBuilder.setInstallReferrerUrl(installReferrerUrl);
        }
        String installVersion = getInstallVersion();
        if (installVersion != null) {
            appBuilder.setInstallVersion(installVersion);
        }
        Timestamp installReferrerClickTimestamp = getInstallReferrerClickTimestamp();
        if (installReferrerClickTimestamp != null) {
            appBuilder.setInstallReferrerClickTimestamp(installReferrerClickTimestamp);
        }
        Timestamp installBeginTimestamp = getInstallBeginTimestamp();
        if (installBeginTimestamp != null) {
            appBuilder.setInstallTime(installBeginTimestamp);
        }
        Timestamp installReferrerClickServerTimestamp = getInstallReferrerClickServerTimestamp();
        if (installReferrerClickServerTimestamp != null) {
            appBuilder.setInstallReferrerClickServerTimestamp(installReferrerClickServerTimestamp);
        }
        Timestamp installBeginServerTimestamp = getInstallBeginServerTimestamp();
        if (installBeginServerTimestamp != null) {
            appBuilder.setInstallBeginServerTimestamp(installBeginServerTimestamp);
        }
        Boolean isGooglePlayInstant = isGooglePlayInstant();
        if (isGooglePlayInstant != null) {
            appBuilder.setIsGooglePlayInstant(isGooglePlayInstant.booleanValue());
        }
    }

    @WorkerThread
    public final void initialize(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.isInitializeExecuted.compareAndSet(false, true)) {
            C6019n createBySharedPreferences = createBySharedPreferences(context);
            this.installInfo = createBySharedPreferences;
            if (createBySharedPreferences == null || !createBySharedPreferences.h()) {
                new Thread(new InterfaceC6021p() { // from class: io.bidmachine.InstallInfoProvider$$ExternalSyntheticLambda0
                    @Override // io.bidmachine.utils.SafeRunnable
                    public final void onRun() {
                        InstallInfoProvider.initialize$lambda$0(InstallInfoProvider.this, context);
                    }
                }).start();
            }
        }
    }
}
