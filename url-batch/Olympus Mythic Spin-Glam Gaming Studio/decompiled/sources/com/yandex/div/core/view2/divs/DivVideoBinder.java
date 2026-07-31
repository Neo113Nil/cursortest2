package com.yandex.div.core.view2.divs;

import android.view.View;
import com.yandex.div.core.DecodeBase64ImageTask;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.expression.variables.TwoWayIntegerVariableBinder;
import com.yandex.div.core.player.DivPlayer;
import com.yandex.div.core.player.DivPlayerFactory;
import com.yandex.div.core.player.DivPlayerPlaybackConfig;
import com.yandex.div.core.player.DivPlayerView;
import com.yandex.div.core.player.DivVideoSource;
import com.yandex.div.core.player.DivVideoViewMapper;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivVideo;
import com.yandex.div2.DivVideoScale;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivVideoBinder.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B7\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J*\u0010\u0019\u001a\u00020\u001a*\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0014\u0010\u001d\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\u001a0\u001eH\u0002J.\u0010 \u001a\u00020\u001a*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u00032\u0006\u0010\"\u001a\u00020#H\u0014J,\u0010$\u001a\u00020\u001a*\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&2\u0006\u0010\"\u001a\u00020#H\u0002J$\u0010'\u001a\u00020\u001a*\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0002J,\u0010(\u001a\u00020\u001a*\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivVideoBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/Div$Video;", "Lcom/yandex/div2/DivVideo;", "Lcom/yandex/div/core/view2/divs/widgets/DivVideoView;", "baseBinder", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "variableBinder", "Lcom/yandex/div/core/expression/variables/TwoWayIntegerVariableBinder;", "divActionBinder", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "videoViewMapper", "Lcom/yandex/div/core/player/DivVideoViewMapper;", "executorService", "Ljava/util/concurrent/ExecutorService;", "playerFactory", "Lcom/yandex/div/core/player/DivPlayerFactory;", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/expression/variables/TwoWayIntegerVariableBinder;Lcom/yandex/div/core/view2/divs/DivActionBinder;Lcom/yandex/div/core/player/DivVideoViewMapper;Ljava/util/concurrent/ExecutorService;Lcom/yandex/div/core/player/DivPlayerFactory;)V", "createObserver", "Lcom/yandex/div/core/player/DivPlayer$Observer;", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "div", "previewImageView", "Landroid/view/View;", "applyPreview", "", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "onPreviewDecoded", "Lkotlin/Function1;", "Lcom/yandex/div/core/util/ImageRepresentation;", "bind", "oldDiv", "path", "Lcom/yandex/div/core/state/DivStatePath;", "observeElapsedTime", "player", "Lcom/yandex/div/core/player/DivPlayer;", "observeMuted", "observeScale", "playerView", "Lcom/yandex/div/core/player/DivPlayerView;", "previewView", "Lcom/yandex/div/core/view2/divs/PreviewImageView;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes13.dex */
public final class DivVideoBinder extends DivViewBinder<Div.Video, DivVideo, DivVideoView> {

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final ExecutorService executorService;

    @NotNull
    private final DivPlayerFactory playerFactory;

    @NotNull
    private final TwoWayIntegerVariableBinder variableBinder;

    @NotNull
    private final DivVideoViewMapper videoViewMapper;

    public DivVideoBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull TwoWayIntegerVariableBinder twoWayIntegerVariableBinder, @NotNull DivActionBinder divActionBinder, @NotNull DivVideoViewMapper divVideoViewMapper, @NotNull ExecutorService executorService, @NotNull DivPlayerFactory divPlayerFactory) {
        super(divBaseBinder);
        this.variableBinder = twoWayIntegerVariableBinder;
        this.divActionBinder = divActionBinder;
        this.videoViewMapper = divVideoViewMapper;
        this.executorService = executorService;
        this.playerFactory = divPlayerFactory;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivVideoView divVideoView, @NotNull BindingContext bindingContext, @NotNull DivVideo divVideo, @Nullable DivVideo divVideo2, @NotNull DivStatePath divStatePath) {
        PreviewImageView previewImageView;
        final DivPlayerView divPlayerView;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        List<DivVideoSource> createSource = DivVideoBinderKt.createSource(divVideo, expressionResolver);
        DivPlayerPlaybackConfig divPlayerPlaybackConfig = new DivPlayerPlaybackConfig(((Boolean) divVideo.autostart.evaluate(expressionResolver)).booleanValue(), ((Boolean) divVideo.muted.evaluate(expressionResolver)).booleanValue(), ((Boolean) divVideo.repeatable.evaluate(expressionResolver)).booleanValue(), divVideo.playerSettingsPayload);
        DivPlayerView playerView = divVideoView.getPlayerView();
        int childCount = divVideoView.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                previewImageView = null;
                break;
            }
            View childAt = divVideoView.getChildAt(i);
            if (childAt instanceof PreviewImageView) {
                previewImageView = (PreviewImageView) childAt;
                break;
            }
            i++;
        }
        if (playerView == null) {
            DivPlayerView makePlayerView = this.playerFactory.makePlayerView(divVideoView.getContext());
            makePlayerView.setVisibility(4);
            divPlayerView = makePlayerView;
        } else {
            divPlayerView = playerView;
        }
        final PreviewImageView previewImageView2 = previewImageView == null ? new PreviewImageView(divVideoView.getContext()) : previewImageView;
        applyPreview(divVideo, expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$bind$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ImageRepresentation) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable ImageRepresentation imageRepresentation) {
                if (imageRepresentation != null) {
                    PreviewImageView previewImageView3 = previewImageView2;
                    previewImageView3.setVisibility(0);
                    if (imageRepresentation instanceof ImageRepresentation.PictureDrawable) {
                        previewImageView3.setImageDrawable(((ImageRepresentation.PictureDrawable) imageRepresentation).m7150unboximpl());
                    } else if (imageRepresentation instanceof ImageRepresentation.Bitmap) {
                        previewImageView3.setImageBitmap(((ImageRepresentation.Bitmap) imageRepresentation).m7143unboximpl());
                    }
                }
                DivPlayerView.this.setVisibility(0);
            }
        });
        DivPlayer makePlayer = this.playerFactory.makePlayer(createSource, divPlayerPlaybackConfig);
        makePlayer.addObserver(createObserver(bindingContext, divVideo, previewImageView2));
        divPlayerView.attach(makePlayer);
        observeElapsedTime(divVideoView, divVideo, bindingContext, makePlayer, divStatePath);
        observeMuted(divVideoView, divVideo, expressionResolver, makePlayer);
        observeScale(divVideoView, divVideo, expressionResolver, divPlayerView, previewImageView2);
        if (previewImageView == null && playerView == null) {
            divVideoView.removeAllViews();
            divVideoView.addView(divPlayerView);
            divVideoView.addView(previewImageView2);
        }
        this.videoViewMapper.addView(divVideoView, divVideo);
        BaseDivViewExtensionsKt.bindAspectRatio(divVideoView, divVideo.aspect, divVideo2 != null ? divVideo2.aspect : null, expressionResolver);
    }

    private final DivPlayer.Observer createObserver(BindingContext bindingContext, final DivVideo div, final View previewImageView) {
        final Div2View divView = bindingContext.getDivView();
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        return new DivPlayer.Observer() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$createObserver$1
            @Override // com.yandex.div.core.player.DivPlayer.Observer
            public void onPlay() {
                DivActionBinder divActionBinder;
                divActionBinder = DivVideoBinder.this.divActionBinder;
                DivActionBinder.handleActions$div_release$default(divActionBinder, divView, expressionResolver, div.resumeActions, "video", null, 16, null);
            }

            @Override // com.yandex.div.core.player.DivPlayer.Observer
            public void onPause() {
                DivActionBinder divActionBinder;
                divActionBinder = DivVideoBinder.this.divActionBinder;
                DivActionBinder.handleActions$div_release$default(divActionBinder, divView, expressionResolver, div.pauseActions, "video", null, 16, null);
            }

            @Override // com.yandex.div.core.player.DivPlayer.Observer
            public void onBuffering() {
                DivActionBinder divActionBinder;
                divActionBinder = DivVideoBinder.this.divActionBinder;
                DivActionBinder.handleActions$div_release$default(divActionBinder, divView, expressionResolver, div.bufferingActions, "video", null, 16, null);
            }

            @Override // com.yandex.div.core.player.DivPlayer.Observer
            public void onEnd() {
                DivActionBinder divActionBinder;
                divActionBinder = DivVideoBinder.this.divActionBinder;
                DivActionBinder.handleActions$div_release$default(divActionBinder, divView, expressionResolver, div.endActions, "video", null, 16, null);
            }

            @Override // com.yandex.div.core.player.DivPlayer.Observer
            public void onFatal() {
                DivActionBinder divActionBinder;
                divActionBinder = DivVideoBinder.this.divActionBinder;
                DivActionBinder.handleActions$div_release$default(divActionBinder, divView, expressionResolver, div.fatalActions, "video", null, 16, null);
            }

            @Override // com.yandex.div.core.player.DivPlayer.Observer
            public void onReady() {
                previewImageView.setVisibility(4);
            }
        };
    }

    private final void observeElapsedTime(DivVideoView divVideoView, DivVideo divVideo, BindingContext bindingContext, final DivPlayer divPlayer, DivStatePath divStatePath) {
        String str = divVideo.elapsedTimeVariable;
        if (str == null) {
            return;
        }
        divVideoView.addSubscription(this.variableBinder.bindVariable(bindingContext, str, new TwoWayIntegerVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$observeElapsedTime$callbacks$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(@Nullable Long value) {
                if (value != null) {
                    DivPlayer.this.seek(value.longValue());
                }
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(@NotNull final Function1 valueUpdater) {
                DivPlayer.this.addObserver(new DivPlayer.Observer() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$observeElapsedTime$callbacks$1$setViewStateChangeListener$1
                    @Override // com.yandex.div.core.player.DivPlayer.Observer
                    public void onCurrentTimeChange(long timeMs) {
                        Function1.this.invoke(Long.valueOf(timeMs));
                    }
                });
            }
        }, divStatePath));
    }

    private final void observeMuted(DivVideoView divVideoView, DivVideo divVideo, ExpressionResolver expressionResolver, final DivPlayer divPlayer) {
        divVideoView.addSubscription(divVideo.muted.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$observeMuted$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                DivPlayer.this.setMuted(z);
            }
        }));
    }

    private final void observeScale(DivVideoView divVideoView, DivVideo divVideo, ExpressionResolver expressionResolver, final DivPlayerView divPlayerView, final PreviewImageView previewImageView) {
        divVideoView.addSubscription(divVideo.scale.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$observeScale$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DivVideoScale) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull DivVideoScale divVideoScale) {
                DivPlayerView.this.setScale(divVideoScale);
                previewImageView.setScale(divVideoScale);
            }
        }));
    }

    private final void applyPreview(DivVideo divVideo, ExpressionResolver expressionResolver, Function1 function1) {
        Expression expression = divVideo.preview;
        String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
        if (str == null) {
            function1.invoke(null);
        } else {
            this.executorService.submit(new DecodeBase64ImageTask(str, false, function1));
        }
    }
}
