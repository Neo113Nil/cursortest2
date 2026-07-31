package io.bidmachine.rendering.internal.adform;

import android.content.Context;
import io.bidmachine.rendering.Repository;
import io.bidmachine.rendering.measurer.CompositeHtmlMeasurer;
import io.bidmachine.rendering.measurer.CompositeVideoMeasurer;
import io.bidmachine.rendering.measurer.HtmlMeasurer;
import io.bidmachine.rendering.measurer.MeasurerFactory;
import io.bidmachine.rendering.measurer.VideoMeasurer;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.AdElementType;
import io.bidmachine.rendering.model.MeasurerParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class b {
    private final Repository a;
    private final Context b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdElementType.values().length];
            try {
                iArr[AdElementType.Mraid.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdElementType.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdElementType.Image.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdElementType.Label.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdElementType.Progress.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdElementType.Countdown.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(Context context, Repository repository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.a = repository;
        this.b = context.getApplicationContext();
    }

    public final io.bidmachine.rendering.internal.adform.a a(Object assetsHolder, AdElementParams adElementParams, c adFormListener, io.bidmachine.rendering.internal.event.b eventCallback, io.bidmachine.rendering.internal.detector.brokencreative.a aVar) {
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(adElementParams, "adElementParams");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        switch (a.$EnumSwitchMapping$0[adElementParams.getAdElementType().ordinal()]) {
            case 1:
                Context applicationContext = this.b;
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                return new io.bidmachine.rendering.internal.adform.html.a(applicationContext, assetsHolder, this.a, adElementParams, adFormListener, eventCallback, aVar, a(adElementParams.getMeasurerFactory(), adElementParams.getMeasurerParamsList()), adElementParams.getScriptsConfig());
            case 2:
                Context applicationContext2 = this.b;
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext");
                return new io.bidmachine.rendering.internal.adform.video.a(applicationContext2, assetsHolder, this.a, adElementParams, adFormListener, eventCallback, aVar, b(adElementParams.getMeasurerFactory(), adElementParams.getMeasurerParamsList()));
            case 3:
                Context applicationContext3 = this.b;
                Intrinsics.checkNotNullExpressionValue(applicationContext3, "applicationContext");
                return new io.bidmachine.rendering.internal.adform.image.a(applicationContext3, assetsHolder, this.a, adElementParams, adFormListener, eventCallback, aVar);
            case 4:
                Context applicationContext4 = this.b;
                Intrinsics.checkNotNullExpressionValue(applicationContext4, "applicationContext");
                return new io.bidmachine.rendering.internal.adform.label.a(applicationContext4, assetsHolder, this.a, adElementParams, adFormListener, eventCallback, aVar);
            case 5:
                Context applicationContext5 = this.b;
                Intrinsics.checkNotNullExpressionValue(applicationContext5, "applicationContext");
                return new io.bidmachine.rendering.internal.adform.progress.a(applicationContext5, assetsHolder, this.a, adElementParams, adFormListener, eventCallback, aVar);
            case 6:
                Context applicationContext6 = this.b;
                Intrinsics.checkNotNullExpressionValue(applicationContext6, "applicationContext");
                return new io.bidmachine.rendering.internal.adform.countdown.a(applicationContext6, assetsHolder, this.a, adElementParams, adFormListener, eventCallback, aVar);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final VideoMeasurer b(MeasurerFactory measurerFactory, List list) {
        VideoMeasurer videoMeasurer;
        if (measurerFactory == null || list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MeasurerParams measurerParams = (MeasurerParams) it.next();
            try {
                videoMeasurer = measurerFactory.createVideoMeasurer(this.b, measurerParams.getName(), measurerParams.getParameters());
            } catch (Throwable unused) {
                videoMeasurer = null;
            }
            if (videoMeasurer != null) {
                arrayList.add(videoMeasurer);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new CompositeVideoMeasurer(arrayList);
    }

    public final HtmlMeasurer a(MeasurerFactory measurerFactory, List list) {
        HtmlMeasurer htmlMeasurer;
        if (measurerFactory == null || list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MeasurerParams measurerParams = (MeasurerParams) it.next();
            try {
                htmlMeasurer = measurerFactory.createHtmlMeasurer(this.b, measurerParams.getName(), measurerParams.getParameters());
            } catch (Throwable unused) {
                htmlMeasurer = null;
            }
            if (htmlMeasurer != null) {
                arrayList.add(htmlMeasurer);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new CompositeHtmlMeasurer(arrayList);
    }
}
