package io.bidmachine.rendering.internal.deeplinkprocessor;

import android.content.Context;
import android.net.Uri;
import io.bidmachine.iab.mraid.MraidCalendarEvent;
import io.bidmachine.iab.mraid.MraidNativeFeatureUrlParser;
import io.bidmachine.iab.utils.CommonLog;
import io.bidmachine.rendering.internal.h;
import io.bidmachine.util.Executable;
import io.bidmachine.util.ProcessUrlResult;
import io.bidmachine.util.UiUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class e implements b {
    public static final a c = new a(null);
    private final MraidNativeFeatureUrlParser a;
    private final h b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e(MraidNativeFeatureUrlParser mraidNativeFeatureUrlParser, h intentLauncher) {
        Intrinsics.checkNotNullParameter(mraidNativeFeatureUrlParser, "mraidNativeFeatureUrlParser");
        Intrinsics.checkNotNullParameter(intentLauncher, "intentLauncher");
        this.a = mraidNativeFeatureUrlParser;
        this.b = intentLauncher;
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public boolean a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.areEqual("calendar", uri.getScheme());
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public void a(Context context, Uri uri, Executable executable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        MraidCalendarEvent parseCalendarEvent = this.a.parseCalendarEvent(uri);
        if (parseCalendarEvent != null) {
            this.b.a(context, parseCalendarEvent, executable);
        } else {
            CommonLog.e("MraidCalendarDeeplinkProcessor", "processUrl (mraidCalendarEvent is null)", new Object[0]);
            UiUtils.INSTANCE.onUiThreadWithArgSafely(ProcessUrlResult.INSTANCE.getFAIL(), executable);
        }
    }
}
