package com.yandex.div.core;

import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.internal.core.DivTreeVisitor;
import com.yandex.div2.Div;
import com.yandex.div2.DivVideoSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivViewDataPreloader.kt */
@PublicApi
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0017B1\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ*\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/core/DivViewDataPreloader;", "", "imagePreloader", "Lcom/yandex/div/core/view2/DivImagePreloader;", "customContainerViewAdapter", "Lcom/yandex/div/core/DivCustomContainerViewAdapter;", "extensionController", "Lcom/yandex/div/core/extension/DivExtensionController;", "videoPreloader", "Lcom/yandex/div/core/player/DivPlayerPreloader;", "preloadFilter", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "(Lcom/yandex/div/core/view2/DivImagePreloader;Lcom/yandex/div/core/DivCustomContainerViewAdapter;Lcom/yandex/div/core/extension/DivExtensionController;Lcom/yandex/div/core/player/DivPlayerPreloader;Lcom/yandex/div/core/DivPreloader$PreloadFilter;)V", "preload", "Lcom/yandex/div/core/DivPreloader$Ticket;", "div", "Lcom/yandex/div2/Div;", "context", "Lcom/yandex/div/core/view2/BindingContext;", "path", "Lcom/yandex/div/core/state/DivStatePath;", "callback", "Lcom/yandex/div/core/DivPreloader$Callback;", "PreloadVisitor", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public class DivViewDataPreloader {

    @NotNull
    private final DivCustomContainerViewAdapter customContainerViewAdapter;

    @NotNull
    private final DivExtensionController extensionController;

    @Nullable
    private final DivImagePreloader imagePreloader;

    @NotNull
    private final DivPreloader.PreloadFilter preloadFilter;

    @NotNull
    private final DivPlayerPreloader videoPreloader;

    public DivViewDataPreloader(@Nullable DivImagePreloader divImagePreloader, @NotNull DivCustomContainerViewAdapter divCustomContainerViewAdapter, @NotNull DivExtensionController divExtensionController, @NotNull DivPlayerPreloader divPlayerPreloader, @NotNull DivPreloader.PreloadFilter preloadFilter) {
        this.imagePreloader = divImagePreloader;
        this.customContainerViewAdapter = divCustomContainerViewAdapter;
        this.extensionController = divExtensionController;
        this.videoPreloader = divPlayerPreloader;
        this.preloadFilter = preloadFilter;
    }

    public static /* synthetic */ DivPreloader.Ticket preload$default(DivViewDataPreloader divViewDataPreloader, Div div, BindingContext bindingContext, DivStatePath divStatePath, DivPreloader.Callback callback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preload");
        }
        if ((i & 8) != 0) {
            callback = DivPreloader.INSTANCE.getNO_CALLBACK$div_release();
        }
        return divViewDataPreloader.preload(div, bindingContext, divStatePath, callback);
    }

    @NotNull
    public DivPreloader.Ticket preload(@NotNull Div div, @NotNull BindingContext context, @NotNull DivStatePath path, @NotNull DivPreloader.Callback callback) {
        DivPreloader.DownloadCallback downloadCallback = new DivPreloader.DownloadCallback(callback);
        DivPreloader.Ticket preload = new PreloadVisitor(downloadCallback, callback, this.preloadFilter).preload(div, context, path);
        downloadCallback.onFullPreloadStarted();
        return preload;
    }

    /* compiled from: DivViewDataPreloader.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ \u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J \u0010\u0016\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J \u0010\u0016\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/DivViewDataPreloader$PreloadVisitor;", "Lcom/yandex/div/internal/core/DivTreeVisitor;", "", "downloadCallback", "Lcom/yandex/div/core/DivPreloader$DownloadCallback;", "callback", "Lcom/yandex/div/core/DivPreloader$Callback;", "preloadFilter", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "(Lcom/yandex/div/core/DivViewDataPreloader;Lcom/yandex/div/core/DivPreloader$DownloadCallback;Lcom/yandex/div/core/DivPreloader$Callback;Lcom/yandex/div/core/DivPreloader$PreloadFilter;)V", "ticket", "Lcom/yandex/div/core/DivPreloader$TicketImpl;", "defaultVisit", "data", "Lcom/yandex/div2/Div;", "context", "Lcom/yandex/div/core/view2/BindingContext;", "path", "Lcom/yandex/div/core/state/DivStatePath;", "preload", "Lcom/yandex/div/core/DivPreloader$Ticket;", "div", "visit", "Lcom/yandex/div2/Div$Custom;", "Lcom/yandex/div2/Div$Video;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class PreloadVisitor extends DivTreeVisitor<Unit> {

        @NotNull
        private final DivPreloader.Callback callback;

        @NotNull
        private final DivPreloader.DownloadCallback downloadCallback;

        @NotNull
        private final DivPreloader.PreloadFilter preloadFilter;

        @NotNull
        private final DivPreloader.TicketImpl ticket;

        /* JADX WARN: Multi-variable type inference failed */
        public PreloadVisitor(@NotNull DivPreloader.DownloadCallback downloadCallback, @NotNull DivPreloader.Callback callback, @NotNull DivPreloader.PreloadFilter preloadFilter) {
            super(null, 1, 0 == true ? 1 : 0);
            this.downloadCallback = downloadCallback;
            this.callback = callback;
            this.preloadFilter = preloadFilter;
            this.ticket = new DivPreloader.TicketImpl();
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ Unit defaultVisit(Div div, BindingContext bindingContext, DivStatePath divStatePath) {
            defaultVisit2(div, bindingContext, divStatePath);
            return Unit.INSTANCE;
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ Unit visit(Div.Custom custom, BindingContext bindingContext, DivStatePath divStatePath) {
            visit2(custom, bindingContext, divStatePath);
            return Unit.INSTANCE;
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ Unit visit(Div.Video video, BindingContext bindingContext, DivStatePath divStatePath) {
            visit2(video, bindingContext, divStatePath);
            return Unit.INSTANCE;
        }

        @NotNull
        public final DivPreloader.Ticket preload(@NotNull Div div, @NotNull BindingContext context, @NotNull DivStatePath path) {
            visit(div, context, path);
            return this.ticket;
        }

        /* renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        protected void defaultVisit2(@NotNull Div data, @NotNull BindingContext context, @NotNull DivStatePath path) {
            List<LoadReference> preloadImage;
            DivImagePreloader divImagePreloader = DivViewDataPreloader.this.imagePreloader;
            if (divImagePreloader != null && (preloadImage = divImagePreloader.preloadImage(data, context.getExpressionResolver(), this.preloadFilter, this.downloadCallback)) != null) {
                Iterator<T> it = preloadImage.iterator();
                while (it.hasNext()) {
                    this.ticket.addImageReference((LoadReference) it.next());
                }
            }
            DivViewDataPreloader.this.extensionController.preprocessExtensions(data.value(), context.getExpressionResolver());
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Div.Custom data, @NotNull BindingContext context, @NotNull DivStatePath path) {
            super.visit(data, context, path);
            this.ticket.addReference(DivViewDataPreloader.this.customContainerViewAdapter.preload(data.getValue(), this.callback));
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Div.Video data, @NotNull BindingContext context, @NotNull DivStatePath path) {
            defaultVisit2((Div) data, context, path);
            if (this.preloadFilter.shouldPreloadContent(data, context.getExpressionResolver())) {
                ArrayList arrayList = new ArrayList();
                Iterator it = data.getValue().videoSources.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DivVideoSource) it.next()).url.evaluate(context.getExpressionResolver()));
                }
                this.ticket.addReference(DivViewDataPreloader.this.videoPreloader.preloadVideo(arrayList));
            }
        }
    }
}
