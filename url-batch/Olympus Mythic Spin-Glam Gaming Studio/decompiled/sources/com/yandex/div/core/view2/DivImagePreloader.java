package com.yandex.div.core.view2;

import android.net.Uri;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivImagePreloader.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0004\u001d\u001e\u001f B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J0\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000f2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0014j\b\u0012\u0004\u0012\u00020\u0007`\u0015H\u0012J0\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000f2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0014j\b\u0012\u0004\u0012\u00020\u0007`\u0015H\u0012J\u0017\u0010\u0017\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0010¢\u0006\u0002\b\u0019J\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/yandex/div/core/view2/DivImagePreloader;", "", "imageLoader", "Lcom/yandex/div/core/images/DivImageLoader;", "(Lcom/yandex/div/core/images/DivImageLoader;)V", "preloadImage", "", "Lcom/yandex/div/core/images/LoadReference;", "div", "Lcom/yandex/div2/Div;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "preloadFilter", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "callback", "Lcom/yandex/div/core/DivPreloader$DownloadCallback;", "", "url", "", "references", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "preloadImageBytes", "asTicket", "Lcom/yandex/div/core/view2/DivImagePreloader$Ticket;", "asTicket$div_release", "toPreloadCallback", "Lcom/yandex/div/core/DivPreloader$Callback;", "Lcom/yandex/div/core/view2/DivImagePreloader$Callback;", "Callback", "PreloadVisitor", "Ticket", "TicketImpl", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes9.dex */
public class DivImagePreloader {

    @NotNull
    private final DivImageLoader imageLoader;

    /* compiled from: DivImagePreloader.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/view2/DivImagePreloader$Callback;", "", "finish", "", "hasErrors", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Callback {
        void finish(boolean hasErrors);
    }

    /* compiled from: DivImagePreloader.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/view2/DivImagePreloader$Ticket;", "", "cancel", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Ticket {
        void cancel();
    }

    public DivImagePreloader(@NotNull DivImageLoader divImageLoader) {
        this.imageLoader = divImageLoader;
    }

    public static /* synthetic */ List preloadImage$default(DivImagePreloader divImagePreloader, Div div, ExpressionResolver expressionResolver, DivPreloader.PreloadFilter preloadFilter, DivPreloader.DownloadCallback downloadCallback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preloadImage");
        }
        if ((i & 4) != 0) {
            preloadFilter = DivPreloader.PreloadFilter.ONLY_PRELOAD_REQUIRED_FILTER;
        }
        return divImagePreloader.preloadImage(div, expressionResolver, preloadFilter, downloadCallback);
    }

    @NotNull
    public List<LoadReference> preloadImage(@NotNull Div div, @NotNull ExpressionResolver resolver, @NotNull DivPreloader.PreloadFilter preloadFilter, @NotNull DivPreloader.DownloadCallback callback) {
        return new PreloadVisitor(callback, resolver, preloadFilter, false).preload(div);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void preloadImage(String url, DivPreloader.DownloadCallback callback, ArrayList<LoadReference> references) {
        references.add(this.imageLoader.loadImage(url, callback, -1));
        callback.onSingleLoadingStarted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void preloadImageBytes(String url, DivPreloader.DownloadCallback callback, ArrayList<LoadReference> references) {
        references.add(this.imageLoader.loadImageBytes(url, callback, -1));
        callback.onSingleLoadingStarted();
    }

    /* compiled from: DivImagePreloader.kt */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\u0006\u0010\u0015\u001a\u00020\u0012J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/yandex/div/core/view2/DivImagePreloader$PreloadVisitor;", "Lcom/yandex/div/internal/core/DivVisitor;", "", "callback", "Lcom/yandex/div/core/DivPreloader$DownloadCallback;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "preloadFilter", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "visitContainers", "", "(Lcom/yandex/div/core/view2/DivImagePreloader;Lcom/yandex/div/core/DivPreloader$DownloadCallback;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/DivPreloader$PreloadFilter;Z)V", "references", "Ljava/util/ArrayList;", "Lcom/yandex/div/core/images/LoadReference;", "Lkotlin/collections/ArrayList;", "defaultVisit", "data", "Lcom/yandex/div2/Div;", "preload", "", "div", "visit", "Lcom/yandex/div2/Div$Container;", "Lcom/yandex/div2/Div$Gallery;", "Lcom/yandex/div2/Div$GifImage;", "Lcom/yandex/div2/Div$Grid;", "Lcom/yandex/div2/Div$Image;", "Lcom/yandex/div2/Div$Pager;", "Lcom/yandex/div2/Div$State;", "Lcom/yandex/div2/Div$Tabs;", "Lcom/yandex/div2/Div$Text;", "visitBackground", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class PreloadVisitor extends DivVisitor<Unit> {

        @NotNull
        private final DivPreloader.DownloadCallback callback;

        @NotNull
        private final DivPreloader.PreloadFilter preloadFilter;

        @NotNull
        private final ArrayList<LoadReference> references;

        @NotNull
        private final ExpressionResolver resolver;
        private final boolean visitContainers;

        public PreloadVisitor(@NotNull DivPreloader.DownloadCallback downloadCallback, @NotNull ExpressionResolver expressionResolver, @NotNull DivPreloader.PreloadFilter preloadFilter, boolean z) {
            this.callback = downloadCallback;
            this.resolver = expressionResolver;
            this.preloadFilter = preloadFilter;
            this.visitContainers = z;
            this.references = new ArrayList<>();
        }

        public /* synthetic */ PreloadVisitor(DivImagePreloader divImagePreloader, DivPreloader.DownloadCallback downloadCallback, ExpressionResolver expressionResolver, DivPreloader.PreloadFilter preloadFilter, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(downloadCallback, expressionResolver, preloadFilter, (i & 8) != 0 ? true : z);
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
        public /* bridge */ /* synthetic */ Unit visit(Div.Gallery gallery, ExpressionResolver expressionResolver) {
            visit2(gallery, expressionResolver);
            return Unit.INSTANCE;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Div.GifImage gifImage, ExpressionResolver expressionResolver) {
            visit2(gifImage, expressionResolver);
            return Unit.INSTANCE;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Div.Grid grid, ExpressionResolver expressionResolver) {
            visit2(grid, expressionResolver);
            return Unit.INSTANCE;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(Div.Image image, ExpressionResolver expressionResolver) {
            visit2(image, expressionResolver);
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
        public /* bridge */ /* synthetic */ Unit visit(Div.Text text, ExpressionResolver expressionResolver) {
            visit2(text, expressionResolver);
            return Unit.INSTANCE;
        }

        @NotNull
        public final List<LoadReference> preload(@NotNull Div div) {
            visit(div, this.resolver);
            return this.references;
        }

        /* renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        protected void defaultVisit2(@NotNull Div data, @NotNull ExpressionResolver resolver) {
            visitBackground(data, resolver);
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Div.Text data, @NotNull ExpressionResolver resolver) {
            List list;
            defaultVisit2((Div) data, resolver);
            if (!this.preloadFilter.shouldPreloadContent(data, resolver) || (list = data.getValue().images) == null) {
                return;
            }
            DivImagePreloader divImagePreloader = DivImagePreloader.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                divImagePreloader.preloadImage(((Uri) ((DivText.Image) it.next()).url.evaluate(resolver)).toString(), this.callback, this.references);
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Div.Image data, @NotNull ExpressionResolver resolver) {
            defaultVisit2((Div) data, resolver);
            if (this.preloadFilter.shouldPreloadContent(data, resolver)) {
                DivImagePreloader.this.preloadImage(((Uri) data.getValue().imageUrl.evaluate(resolver)).toString(), this.callback, this.references);
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Div.GifImage data, @NotNull ExpressionResolver resolver) {
            defaultVisit2((Div) data, resolver);
            if (this.preloadFilter.shouldPreloadContent(data, resolver)) {
                DivImagePreloader.this.preloadImageBytes(((Uri) data.getValue().gifUrl.evaluate(resolver)).toString(), this.callback, this.references);
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Div.Container data, @NotNull ExpressionResolver resolver) {
            defaultVisit2((Div) data, resolver);
            if (this.visitContainers) {
                for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(data.getValue(), resolver)) {
                    visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                }
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Div.Grid data, @NotNull ExpressionResolver resolver) {
            defaultVisit2((Div) data, resolver);
            if (this.visitContainers) {
                Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems(data.getValue()).iterator();
                while (it.hasNext()) {
                    visit((Div) it.next(), resolver);
                }
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Div.Gallery data, @NotNull ExpressionResolver resolver) {
            defaultVisit2((Div) data, resolver);
            if (this.visitContainers) {
                for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(data.getValue(), resolver)) {
                    visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                }
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Div.Pager data, @NotNull ExpressionResolver resolver) {
            defaultVisit2((Div) data, resolver);
            if (this.visitContainers) {
                for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(data.getValue(), resolver)) {
                    visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                }
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Div.Tabs data, @NotNull ExpressionResolver resolver) {
            defaultVisit2((Div) data, resolver);
            if (this.visitContainers) {
                Iterator it = data.getValue().items.iterator();
                while (it.hasNext()) {
                    visit(((DivTabs.Item) it.next()).div, resolver);
                }
            }
        }

        /* renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull Div.State data, @NotNull ExpressionResolver resolver) {
            defaultVisit2((Div) data, resolver);
            if (this.visitContainers) {
                Iterator it = data.getValue().states.iterator();
                while (it.hasNext()) {
                    Div div = ((DivState.State) it.next()).div;
                    if (div != null) {
                        visit(div, resolver);
                    }
                }
            }
        }

        private final void visitBackground(Div data, ExpressionResolver resolver) {
            List<DivBackground> background = data.value().getBackground();
            if (background != null) {
                DivImagePreloader divImagePreloader = DivImagePreloader.this;
                for (DivBackground divBackground : background) {
                    if ((divBackground instanceof DivBackground.Image) && this.preloadFilter.shouldPreloadBackground(divBackground, resolver)) {
                        divImagePreloader.preloadImage(((Uri) ((DivBackground.Image) divBackground).getValue().imageUrl.evaluate(resolver)).toString(), this.callback, this.references);
                    }
                }
            }
        }
    }

    /* compiled from: DivImagePreloader.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\b\u0010\u000b\u001a\u00020\tH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/yandex/div/core/view2/DivImagePreloader$TicketImpl;", "Lcom/yandex/div/core/view2/DivImagePreloader$Ticket;", "()V", "refs", "", "Lcom/yandex/div/core/images/LoadReference;", "getRefs", "()Ljava/util/List;", "addReference", "", "reference", "cancel", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class TicketImpl implements Ticket {

        @NotNull
        private final List<LoadReference> refs = new ArrayList();

        @NotNull
        public final List<LoadReference> getRefs() {
            return this.refs;
        }

        public final void addReference(@NotNull LoadReference reference) {
            this.refs.add(reference);
        }

        @Override // com.yandex.div.core.view2.DivImagePreloader.Ticket
        public void cancel() {
            Iterator<T> it = this.refs.iterator();
            while (it.hasNext()) {
                ((LoadReference) it.next()).cancel();
            }
        }
    }

    @NotNull
    public Ticket asTicket$div_release(@NotNull List<? extends LoadReference> list) {
        TicketImpl ticketImpl = new TicketImpl();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ticketImpl.addReference((LoadReference) it.next());
        }
        return ticketImpl;
    }

    @NotNull
    public DivPreloader.Callback toPreloadCallback(@NotNull final Callback callback) {
        return new DivPreloader.Callback() { // from class: com.yandex.div.core.view2.DivImagePreloader$$ExternalSyntheticLambda0
            @Override // com.yandex.div.core.DivPreloader.Callback
            public final void finish(boolean z) {
                DivImagePreloader.Callback.this.finish(z);
            }
        };
    }
}
