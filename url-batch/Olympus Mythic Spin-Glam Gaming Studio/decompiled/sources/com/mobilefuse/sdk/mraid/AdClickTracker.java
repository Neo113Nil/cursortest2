package com.mobilefuse.sdk.mraid;

import com.facebook.login.widget.ToolTipPopup;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.logging.HttpRequestTracker;
import com.mobilefuse.sdk.network.client.HttpError;
import com.mobilefuse.sdk.network.client.HttpFlowKt;
import com.mobilefuse.sdk.network.client.HttpResponse;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdClickTracker.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0007H\u0002¨\u0006\n"}, d2 = {"Lcom/mobilefuse/sdk/mraid/AdClickTracker;", "", "()V", "sendEvents", "", "urls", "", "", "sendUrlRequest", "url", "mobilefuse-sdk-mraid_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes15.dex */
public final class AdClickTracker {

    @NotNull
    public static final AdClickTracker INSTANCE = new AdClickTracker();

    private AdClickTracker() {
    }

    public static final void sendEvents(@NotNull final List<String> urls) {
        Intrinsics.checkNotNullParameter(urls, "urls");
        SchedulersKt.safelyRunOnBgThread$default(null, new Function0() { // from class: com.mobilefuse.sdk.mraid.AdClickTracker$sendEvents$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                Iterator it = urls.iterator();
                while (it.hasNext()) {
                    AdClickTracker.INSTANCE.sendUrlRequest((String) it.next());
                }
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendUrlRequest(String url) {
        HttpRequestTracker.logHttpRequest(url);
        HttpFlowKt.requestHttpGet$default(FlowKt.flowSingle(url), ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME, null, false, null, 10, null).collect(new FlowCollector() { // from class: com.mobilefuse.sdk.mraid.AdClickTracker$sendUrlRequest$2
            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends Either<? extends HttpError, HttpResponse>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public void emitError(@NotNull Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                FlowCollector.DefaultImpls.emitError(this, error);
            }

            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public void emitSuccess(T t) {
                FlowCollector.DefaultImpls.emitSuccess(this, t);
            }
        });
    }
}
