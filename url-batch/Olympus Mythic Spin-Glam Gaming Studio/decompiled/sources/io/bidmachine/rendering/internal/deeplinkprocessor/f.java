package io.bidmachine.rendering.internal.deeplinkprocessor;

import android.content.Context;
import android.net.Uri;
import io.bidmachine.iab.mraid.MraidNativeFeatureUrlParser;
import io.bidmachine.iab.utils.CommonLog;
import io.bidmachine.rendering.internal.n;
import io.bidmachine.util.Executable;
import io.bidmachine.util.ProcessUrlResult;
import io.bidmachine.util.UiUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class f implements b {
    public static final a c = new a(null);
    private final MraidNativeFeatureUrlParser a;
    private final n b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public f(MraidNativeFeatureUrlParser mraidNativeFeatureUrlParser, n pictureDownloader) {
        Intrinsics.checkNotNullParameter(mraidNativeFeatureUrlParser, "mraidNativeFeatureUrlParser");
        Intrinsics.checkNotNullParameter(pictureDownloader, "pictureDownloader");
        this.a = mraidNativeFeatureUrlParser;
        this.b = pictureDownloader;
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public boolean a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.areEqual("storePicture", uri.getScheme());
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public void a(Context context, Uri uri, Executable executable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Uri parseStorePictureUri = this.a.parseStorePictureUri(uri);
        if (parseStorePictureUri == null) {
            CommonLog.e("MraidStorePictureDeeplinkProcessor", "processUrl (storePictureUri is null)", new Object[0]);
            UiUtils.INSTANCE.onUiThreadWithArgSafely(ProcessUrlResult.INSTANCE.getFAIL(), executable);
        } else {
            n nVar = this.b;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            nVar.a(applicationContext, parseStorePictureUri, executable);
        }
    }
}
