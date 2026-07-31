package com.yandex.div.core.player;

import android.content.Context;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivPlayerFactory.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/player/DivPlayerFactory;", "", "makePlayer", "Lcom/yandex/div/core/player/DivPlayer;", "src", "", "Lcom/yandex/div/core/player/DivVideoSource;", "config", "Lcom/yandex/div/core/player/DivPlayerPlaybackConfig;", "makePlayerView", "Lcom/yandex/div/core/player/DivPlayerView;", "context", "Landroid/content/Context;", "makePreloader", "Lcom/yandex/div/core/player/DivPlayerPreloader;", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface DivPlayerFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final DivPlayerFactory STUB = new DivPlayerFactory() { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1
        @Override // com.yandex.div.core.player.DivPlayerFactory
        public /* bridge */ /* synthetic */ DivPlayer makePlayer(List list, DivPlayerPlaybackConfig divPlayerPlaybackConfig) {
            return makePlayer((List<DivVideoSource>) list, divPlayerPlaybackConfig);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayer$1] */
        @Override // com.yandex.div.core.player.DivPlayerFactory
        @NotNull
        public DivPlayerFactory$Companion$STUB$1$makePlayer$1 makePlayer(@NotNull List<DivVideoSource> src, @NotNull DivPlayerPlaybackConfig config) {
            return new DivPlayer() { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayer$1
            };
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayerView$1] */
        @Override // com.yandex.div.core.player.DivPlayerFactory
        @NotNull
        public DivPlayerFactory$Companion$STUB$1$makePlayerView$1 makePlayerView(@NotNull final Context context) {
            return new DivPlayerView(context) { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayerView$1
                @Override // com.yandex.div.core.player.DivPlayerView, android.view.ViewGroup, android.view.View
                public boolean dispatchTouchEvent(MotionEvent me) {
                    DetectTouchUtils.viewOnTouch(h.y, this, me);
                    return super.dispatchTouchEvent(me);
                }

                @Override // com.yandex.div.core.player.DivPlayerView, android.widget.FrameLayout, android.view.View
                protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                    if (1 == 0) {
                        setMeasuredDimension(0, 0);
                    } else {
                        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                    }
                }
            };
        }
    };

    @NotNull
    DivPlayer makePlayer(@NotNull List<DivVideoSource> src, @NotNull DivPlayerPlaybackConfig config);

    @NotNull
    DivPlayerView makePlayerView(@NotNull Context context);

    @NotNull
    default DivPlayerPreloader makePreloader() {
        return DivPlayerPreloader.STUB;
    }

    /* compiled from: DivPlayerFactory.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/player/DivPlayerFactory$Companion;", "", "()V", "STUB", "Lcom/yandex/div/core/player/DivPlayerFactory;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
