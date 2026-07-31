package com.yandex.div.core.view2.divs;

import android.net.Uri;
import com.yandex.div.core.player.DivVideoResolution;
import com.yandex.div.core.player.DivVideoSource;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivVideo;
import com.yandex.div2.DivVideoSource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivVideoBinder.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"createSource", "", "Lcom/yandex/div/core/player/DivVideoSource;", "Lcom/yandex/div2/DivVideo;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DivVideoBinderKt {
    @NotNull
    public static final List<DivVideoSource> createSource(@NotNull DivVideo divVideo, @NotNull ExpressionResolver expressionResolver) {
        List<com.yandex.div2.DivVideoSource> list = divVideo.videoSources;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (com.yandex.div2.DivVideoSource divVideoSource : list) {
            Uri uri = (Uri) divVideoSource.url.evaluate(expressionResolver);
            String str = (String) divVideoSource.mimeType.evaluate(expressionResolver);
            DivVideoSource.Resolution resolution = divVideoSource.resolution;
            Long l = null;
            DivVideoResolution divVideoResolution = resolution != null ? new DivVideoResolution((int) ((Number) resolution.width.evaluate(expressionResolver)).longValue(), (int) ((Number) resolution.height.evaluate(expressionResolver)).longValue()) : null;
            Expression expression = divVideoSource.bitrate;
            if (expression != null) {
                l = (Long) expression.evaluate(expressionResolver);
            }
            arrayList.add(new com.yandex.div.core.player.DivVideoSource(uri, str, divVideoResolution, l));
        }
        return arrayList;
    }
}
