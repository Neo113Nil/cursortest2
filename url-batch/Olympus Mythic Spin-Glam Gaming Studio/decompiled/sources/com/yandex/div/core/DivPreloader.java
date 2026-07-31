package com.yandex.div.core;

import android.graphics.drawable.PictureDrawable;
import com.ironsource.X3;
import com.safedk.android.utils.j;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.internal.util.UiThreadHandler;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivText;
import com.yandex.div2.DivVideoSource;
import io.appmetrica.analytics.impl.M2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivPreloader.kt */
@PublicApi
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 \u001c2\u00020\u0001:\b\u001b\u001c\u001d\u001e\u001f !\"B\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0019\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tB1\b\u0000\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0012J\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0092\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/yandex/div/core/DivPreloader;", "", j.c, "Lcom/yandex/div/core/DivConfiguration;", "preloadFilter", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "(Lcom/yandex/div/core/DivConfiguration;Lcom/yandex/div/core/DivPreloader$PreloadFilter;)V", "context", "Lcom/yandex/div/core/Div2Context;", "(Lcom/yandex/div/core/Div2Context;Lcom/yandex/div/core/DivPreloader$PreloadFilter;)V", "imagePreloader", "Lcom/yandex/div/core/view2/DivImagePreloader;", "customContainerViewAdapter", "Lcom/yandex/div/core/DivCustomContainerViewAdapter;", "extensionController", "Lcom/yandex/div/core/extension/DivExtensionController;", "videoPreloader", "Lcom/yandex/div/core/player/DivPlayerPreloader;", "(Lcom/yandex/div/core/view2/DivImagePreloader;Lcom/yandex/div/core/DivCustomContainerViewAdapter;Lcom/yandex/div/core/extension/DivExtensionController;Lcom/yandex/div/core/player/DivPlayerPreloader;Lcom/yandex/div/core/DivPreloader$PreloadFilter;)V", "preload", "Lcom/yandex/div/core/DivPreloader$Ticket;", "div", "Lcom/yandex/div2/Div;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "callback", "Lcom/yandex/div/core/DivPreloader$Callback;", "Callback", "Companion", "DownloadCallback", "PreloadFilter", "PreloadReference", "PreloadVisitor", "Ticket", "TicketImpl", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public class DivPreloader {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Callback NO_CALLBACK = new Callback() { // from class: com.yandex.div.core.DivPreloader$$ExternalSyntheticLambda0
        @Override // com.yandex.div.core.DivPreloader.Callback
        public final void finish(boolean z) {
            DivPreloader.NO_CALLBACK$lambda$0(z);
        }
    };

    @NotNull
    private final DivCustomContainerViewAdapter customContainerViewAdapter;

    @NotNull
    private final DivExtensionController extensionController;

    @Nullable
    private final DivImagePreloader imagePreloader;

    @NotNull
    private final PreloadFilter preloadFilter;

    @NotNull
    private final DivPlayerPreloader videoPreloader;

    /* compiled from: DivPreloader.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/DivPreloader$Callback;", "", "finish", "", "hasErrors", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Callback {
        void finish(boolean hasErrors);
    }

    /* compiled from: DivPreloader.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/DivPreloader$Ticket;", "", "cancel", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Ticket {
        void cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivPreloader(@NotNull Div2Context div2Context) {
        this(div2Context, (PreloadFilter) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivPreloader(@NotNull DivConfiguration divConfiguration) {
        this(divConfiguration, (PreloadFilter) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NO_CALLBACK$lambda$0(boolean z) {
    }

    public DivPreloader(@Nullable DivImagePreloader divImagePreloader, @NotNull DivCustomContainerViewAdapter divCustomContainerViewAdapter, @NotNull DivExtensionController divExtensionController, @NotNull DivPlayerPreloader divPlayerPreloader, @NotNull PreloadFilter preloadFilter) {
        this.imagePreloader = divImagePreloader;
        this.customContainerViewAdapter = divCustomContainerViewAdapter;
        this.extensionController = divExtensionController;
        this.videoPreloader = divPlayerPreloader;
        this.preloadFilter = preloadFilter;
    }

    public /* synthetic */ DivPreloader(DivConfiguration divConfiguration, PreloadFilter preloadFilter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(divConfiguration, (i & 2) != 0 ? PreloadFilter.ONLY_PRELOAD_REQUIRED_FILTER : preloadFilter);
    }

    public DivPreloader(@NotNull DivConfiguration divConfiguration, @NotNull PreloadFilter preloadFilter) {
        this(new DivImagePreloader(divConfiguration.getImageLoader()), divConfiguration.getDivCustomContainerViewAdapter(), new DivExtensionController(divConfiguration.getExtensionHandlers()), divConfiguration.getDivPlayerPreloader(), preloadFilter);
    }

    public /* synthetic */ DivPreloader(Div2Context div2Context, PreloadFilter preloadFilter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(div2Context, (i & 2) != 0 ? PreloadFilter.ONLY_PRELOAD_REQUIRED_FILTER : preloadFilter);
    }

    public DivPreloader(@NotNull Div2Context div2Context, @NotNull PreloadFilter preloadFilter) {
        this(div2Context.getDiv2Component().getImagePreloader(), div2Context.getDiv2Component().getDivCustomContainerViewAdapter(), div2Context.getDiv2Component().getExtensionController(), div2Context.getDiv2Component().getDivVideoPreloader(), preloadFilter);
    }

    /* compiled from: DivPreloader.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0006\u0010\u000e\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u000bJ\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0019\u0010\u0015\u001a\u00020\u000b2\u000e\b\u0004\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017H\u0082\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/core/DivPreloader$DownloadCallback;", "Lcom/yandex/div/core/images/DivImageDownloadCallback;", "callback", "Lcom/yandex/div/core/DivPreloader$Callback;", "(Lcom/yandex/div/core/DivPreloader$Callback;)V", "downloadsLeftCount", "", "failures", X3.i.d0, "", "done", "", "onCancel", "onError", "onFullPreloadStarted", "onSingleLoadingStarted", "onSuccess", "pictureDrawable", "Landroid/graphics/drawable/PictureDrawable;", "cachedBitmap", "Lcom/yandex/div/core/images/CachedBitmap;", "runOnUiThread", "action", "Lkotlin/Function0;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DownloadCallback extends DivImageDownloadCallback {

        @NotNull
        private final Callback callback;
        private int downloadsLeftCount;
        private int failures;
        private boolean started;

        /* JADX INFO: Access modifiers changed from: private */
        public final void done() {
            if (!UiThreadHandler.isMainThread()) {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$done$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DivPreloader.DownloadCallback.this.downloadsLeftCount--;
                        if (DivPreloader.DownloadCallback.this.downloadsLeftCount == 0 && DivPreloader.DownloadCallback.this.started) {
                            DivPreloader.DownloadCallback.this.callback.finish(DivPreloader.DownloadCallback.this.failures != 0);
                        }
                    }
                });
                return;
            }
            this.downloadsLeftCount--;
            if (this.downloadsLeftCount == 0 && this.started) {
                this.callback.finish(this.failures != 0);
            }
        }

        private final void runOnUiThread(final Function0 action) {
            if (UiThreadHandler.isMainThread()) {
                action.mo4828invoke();
            } else {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$runOnUiThread$$inlined$executeOnMainThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Function0.this.mo4828invoke();
                    }
                });
            }
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onError() {
            if (!UiThreadHandler.isMainThread()) {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$onError$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DivPreloader.DownloadCallback.this.failures++;
                        DivPreloader.DownloadCallback.this.done();
                    }
                });
            } else {
                this.failures++;
                done();
            }
        }

        public final void onFullPreloadStarted() {
            if (!UiThreadHandler.isMainThread()) {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$onFullPreloadStarted$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DivPreloader.DownloadCallback.this.started = true;
                        if (DivPreloader.DownloadCallback.this.downloadsLeftCount == 0) {
                            DivPreloader.DownloadCallback.this.callback.finish(DivPreloader.DownloadCallback.this.failures != 0);
                        }
                    }
                });
                return;
            }
            this.started = true;
            if (this.downloadsLeftCount == 0) {
                this.callback.finish(this.failures != 0);
            }
        }

        public final void onSingleLoadingStarted() {
            if (!UiThreadHandler.isMainThread()) {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$onSingleLoadingStarted$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DivPreloader.DownloadCallback.this.downloadsLeftCount++;
                    }
                });
            } else {
                this.downloadsLeftCount++;
            }
        }

        public DownloadCallback(@NotNull Callback callback) {
            this.callback = callback;
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
            done();
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onSuccess(@NotNull PictureDrawable pictureDrawable) {
            done();
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onCancel() {
            done();
        }
    }

    public static /* synthetic */ Ticket preload$default(DivPreloader divPreloader, Div div, ExpressionResolver expressionResolver, Callback callback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preload");
        }
        if ((i & 4) != 0) {
            callback = NO_CALLBACK;
        }
        return divPreloader.preload(div, expressionResolver, callback);
    }

    @NotNull
    public Ticket preload(@NotNull Div div, @NotNull ExpressionResolver resolver, @NotNull Callback callback) {
        DownloadCallback downloadCallback = new DownloadCallback(callback);
        Ticket preload = new PreloadVisitor(downloadCallback, callback, resolver, this.preloadFilter).preload(div);
        downloadCallback.onFullPreloadStarted();
        return preload;
    }

    /* compiled from: DivPreloader.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/DivPreloader$Companion;", "", "()V", "NO_CALLBACK", "Lcom/yandex/div/core/DivPreloader$Callback;", "getNO_CALLBACK$div_release", "()Lcom/yandex/div/core/DivPreloader$Callback;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Callback getNO_CALLBACK$div_release() {
            return DivPreloader.NO_CALLBACK;
        }
    }

    /* compiled from: DivPreloader.kt */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\bH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/core/DivPreloader$PreloadVisitor;", "Lcom/yandex/div/internal/core/DivVisitor;", "", "downloadCallback", "Lcom/yandex/div/core/DivPreloader$DownloadCallback;", "callback", "Lcom/yandex/div/core/DivPreloader$Callback;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "preloadFilter", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "(Lcom/yandex/div/core/DivPreloader;Lcom/yandex/div/core/DivPreloader$DownloadCallback;Lcom/yandex/div/core/DivPreloader$Callback;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/DivPreloader$PreloadFilter;)V", "ticket", "Lcom/yandex/div/core/DivPreloader$TicketImpl;", "defaultVisit", "data", "Lcom/yandex/div2/Div;", "preload", "Lcom/yandex/div/core/DivPreloader$Ticket;", "div", "visit", "Lcom/yandex/div2/Div$Container;", "Lcom/yandex/div2/Div$Custom;", "Lcom/yandex/div2/Div$Gallery;", "Lcom/yandex/div2/Div$Grid;", "Lcom/yandex/div2/Div$Pager;", "Lcom/yandex/div2/Div$State;", "Lcom/yandex/div2/Div$Tabs;", "Lcom/yandex/div2/Div$Video;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class PreloadVisitor extends DivVisitor<Unit> {

        @NotNull
        private final Callback callback;

        @NotNull
        private final DownloadCallback downloadCallback;

        @NotNull
        private final PreloadFilter preloadFilter;

        @NotNull
        private final ExpressionResolver resolver;

        @NotNull
        private final TicketImpl ticket = new TicketImpl();

        public PreloadVisitor(@NotNull DownloadCallback downloadCallback, @NotNull Callback callback, @NotNull ExpressionResolver expressionResolver, @NotNull PreloadFilter preloadFilter) {
            this.downloadCallback = downloadCallback;
            this.callback = callback;
            this.resolver = expressionResolver;
            this.preloadFilter = preloadFilter;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit defaultVisit(Div div, ExpressionResolver expressionResolver) {
            defaultVisit2(div, expressionResolver);
            return Unit.INSTANCE;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Div.Container container, ExpressionResolver expressionResolver) {
            visit2(container, expressionResolver);
            return Unit.INSTANCE;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Div.Custom custom, ExpressionResolver expressionResolver) {
            visit2(custom, expressionResolver);
            return Unit.INSTANCE;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Div.Gallery gallery, ExpressionResolver expressionResolver) {
            visit2(gallery, expressionResolver);
            return Unit.INSTANCE;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Div.Grid grid, ExpressionResolver expressionResolver) {
            visit2(grid, expressionResolver);
            return Unit.INSTANCE;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Div.Pager pager, ExpressionResolver expressionResolver) {
            visit2(pager, expressionResolver);
            return Unit.INSTANCE;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Div.State state, ExpressionResolver expressionResolver) {
            visit2(state, expressionResolver);
            return Unit.INSTANCE;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Div.Tabs tabs, ExpressionResolver expressionResolver) {
            visit2(tabs, expressionResolver);
            return Unit.INSTANCE;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Div.Video video, ExpressionResolver expressionResolver) {
            visit2(video, expressionResolver);
            return Unit.INSTANCE;
        }

        @NotNull
        public final Ticket preload(@NotNull Div div) {
            visit(div, this.resolver);
            return this.ticket;
        }

        /* renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        protected void defaultVisit2(@NotNull Div data, @NotNull ExpressionResolver resolver) {
            List<LoadReference> preloadImage;
            DivImagePreloader divImagePreloader = DivPreloader.this.imagePreloader;
            if (divImagePreloader != null && (preloadImage = divImagePreloader.preloadImage(data, resolver, this.preloadFilter, this.downloadCallback)) != null) {
                Iterator<T> it = preloadImage.iterator();
                while (it.hasNext()) {
                    this.ticket.addImageReference((LoadReference) it.next());
                }
            }
            DivPreloader.this.extensionController.preprocessExtensions(data.value(), resolver);
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Div.Container data, @NotNull ExpressionResolver resolver) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(data.getValue(), resolver)) {
                visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
            }
            defaultVisit2((Div) data, resolver);
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Div.Grid data, @NotNull ExpressionResolver resolver) {
            Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems(data.getValue()).iterator();
            while (it.hasNext()) {
                visit((Div) it.next(), resolver);
            }
            defaultVisit2((Div) data, resolver);
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Div.Gallery data, @NotNull ExpressionResolver resolver) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(data.getValue(), resolver)) {
                visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
            }
            defaultVisit2((Div) data, resolver);
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Div.Pager data, @NotNull ExpressionResolver resolver) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(data.getValue(), resolver)) {
                visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
            }
            defaultVisit2((Div) data, resolver);
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Div.Tabs data, @NotNull ExpressionResolver resolver) {
            Iterator it = data.getValue().items.iterator();
            while (it.hasNext()) {
                visit(((DivTabs.Item) it.next()).div, resolver);
            }
            defaultVisit2((Div) data, resolver);
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Div.State data, @NotNull ExpressionResolver resolver) {
            Iterator it = data.getValue().states.iterator();
            while (it.hasNext()) {
                Div div = ((DivState.State) it.next()).div;
                if (div != null) {
                    visit(div, resolver);
                }
            }
            defaultVisit2((Div) data, resolver);
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Div.Custom data, @NotNull ExpressionResolver resolver) {
            List list = data.getValue().items;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    visit((Div) it.next(), resolver);
                }
            }
            this.ticket.addReference(DivPreloader.this.customContainerViewAdapter.preload(data.getValue(), this.callback));
            defaultVisit2((Div) data, resolver);
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Div.Video data, @NotNull ExpressionResolver resolver) {
            defaultVisit2((Div) data, resolver);
            if (this.preloadFilter.shouldPreloadContent(data, resolver)) {
                ArrayList arrayList = new ArrayList();
                Iterator it = data.getValue().videoSources.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DivVideoSource) it.next()).url.evaluate(resolver));
                }
                this.ticket.addReference(DivPreloader.this.videoPreloader.preloadVideo(arrayList));
            }
        }
    }

    /* compiled from: DivPreloader.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\f\u0010\f\u001a\u00020\u0005*\u00020\tH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/DivPreloader$TicketImpl;", "Lcom/yandex/div/core/DivPreloader$Ticket;", "()V", "refs", "", "Lcom/yandex/div/core/DivPreloader$PreloadReference;", "addImageReference", "", "reference", "Lcom/yandex/div/core/images/LoadReference;", "addReference", "cancel", "toPreloadReference", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TicketImpl implements Ticket {

        @NotNull
        private final List<PreloadReference> refs = new ArrayList();

        public final void addReference(@NotNull PreloadReference reference) {
            this.refs.add(reference);
        }

        public final void addImageReference(@NotNull LoadReference reference) {
            this.refs.add(toPreloadReference(reference));
        }

        @Override // com.yandex.div.core.DivPreloader.Ticket
        public void cancel() {
            Iterator<T> it = this.refs.iterator();
            while (it.hasNext()) {
                ((PreloadReference) it.next()).cancel();
            }
        }

        private final PreloadReference toPreloadReference(final LoadReference loadReference) {
            return new PreloadReference() { // from class: com.yandex.div.core.DivPreloader$TicketImpl$toPreloadReference$1
                @Override // com.yandex.div.core.DivPreloader.PreloadReference
                public void cancel() {
                    LoadReference.this.cancel();
                }
            };
        }
    }

    /* compiled from: DivPreloader.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "", "shouldPreloadBackground", "", M2.g, "Lcom/yandex/div2/DivBackground;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "shouldPreloadContent", "div", "Lcom/yandex/div2/Div;", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface PreloadFilter {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @NotNull
        public static final PreloadFilter ONLY_PRELOAD_REQUIRED_FILTER = new PreloadFilter() { // from class: com.yandex.div.core.DivPreloader$PreloadFilter$Companion$ONLY_PRELOAD_REQUIRED_FILTER$1
            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadContent(@NotNull Div div, @NotNull ExpressionResolver resolver) {
                if (!(div instanceof Div.Text)) {
                    if (div instanceof Div.Video) {
                        return ((Boolean) ((Div.Video) div).getValue().preloadRequired.evaluate(resolver)).booleanValue();
                    }
                    if (div instanceof Div.Image) {
                        return ((Boolean) ((Div.Image) div).getValue().preloadRequired.evaluate(resolver)).booleanValue();
                    }
                    if (div instanceof Div.GifImage) {
                        return ((Boolean) ((Div.GifImage) div).getValue().preloadRequired.evaluate(resolver)).booleanValue();
                    }
                    return false;
                }
                List list = ((Div.Text) div).getValue().images;
                if (list == null) {
                    return false;
                }
                List list2 = list;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    return false;
                }
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((Boolean) ((DivText.Image) it.next()).preloadRequired.evaluate(resolver)).booleanValue()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadBackground(@NotNull DivBackground background, @NotNull ExpressionResolver resolver) {
                if (background instanceof DivBackground.Image) {
                    return ((Boolean) ((DivBackground.Image) background).getValue().preloadRequired.evaluate(resolver)).booleanValue();
                }
                return false;
            }
        };

        @NotNull
        public static final PreloadFilter PRELOAD_ALL_FILTER = new PreloadFilter() { // from class: com.yandex.div.core.DivPreloader$PreloadFilter$Companion$PRELOAD_ALL_FILTER$1
            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadBackground(@NotNull DivBackground background, @NotNull ExpressionResolver resolver) {
                return true;
            }

            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadContent(@NotNull Div div, @NotNull ExpressionResolver resolver) {
                return true;
            }
        };

        boolean shouldPreloadBackground(@NotNull DivBackground background, @NotNull ExpressionResolver resolver);

        boolean shouldPreloadContent(@NotNull Div div, @NotNull ExpressionResolver resolver);

        /* compiled from: DivPreloader.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001R\u0013\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/core/DivPreloader$PreloadFilter$Companion;", "", "()V", "ONLY_PRELOAD_REQUIRED_FILTER", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "PRELOAD_ALL_FILTER", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }
    }

    /* compiled from: DivPreloader.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/DivPreloader$PreloadReference;", "", "cancel", "", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface PreloadReference {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        void cancel();

        /* compiled from: DivPreloader.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/DivPreloader$PreloadReference$Companion;", "", "()V", "EMPTY", "Lcom/yandex/div/core/DivPreloader$PreloadReference;", "getEMPTY", "()Lcom/yandex/div/core/DivPreloader$PreloadReference;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @NotNull
            private static final PreloadReference EMPTY = new PreloadReference() { // from class: com.yandex.div.core.DivPreloader$PreloadReference$Companion$$ExternalSyntheticLambda0
                @Override // com.yandex.div.core.DivPreloader.PreloadReference
                public final void cancel() {
                    DivPreloader.PreloadReference.Companion.EMPTY$lambda$0();
                }
            };

            /* JADX INFO: Access modifiers changed from: private */
            public static final void EMPTY$lambda$0() {
            }

            private Companion() {
            }

            @NotNull
            public final PreloadReference getEMPTY() {
                return EMPTY;
            }
        }
    }
}
