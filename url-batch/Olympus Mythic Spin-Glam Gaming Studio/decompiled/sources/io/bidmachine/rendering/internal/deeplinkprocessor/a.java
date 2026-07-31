package io.bidmachine.rendering.internal.deeplinkprocessor;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import io.bidmachine.iab.utils.CommonLog;
import io.bidmachine.rendering.utils.UrlHandler;
import io.bidmachine.util.Executable;
import io.bidmachine.util.ProcessUrlResult;
import io.bidmachine.util.TopActivityHolder;
import io.bidmachine.util.UiUtils;
import io.bidmachine.util.UrlUtilsKt;
import io.bidmachine.util.Utils;
import io.bidmachine.util.network.Method;
import io.bidmachine.util.network.NetworkRequest;
import io.bidmachine.util.network.NetworkUtils;
import io.bidmachine.util.network.Redirect;
import io.bidmachine.util.network.ResponseMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class a implements io.bidmachine.rendering.internal.deeplinkprocessor.b {
    public static final b b = new b(null);
    private final io.bidmachine.rendering.internal.deeplinkprocessor.c a = new io.bidmachine.rendering.internal.deeplinkprocessor.c();

    /* renamed from: io.bidmachine.rendering.internal.deeplinkprocessor.a$a, reason: collision with other inner class name */
    private static final class C1793a implements NetworkRequest.MetadataListener {
        private final Uri a;
        private final Executable b;
        private final Context c;

        public C1793a(Context context, Uri baseUri, Executable executable) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(baseUri, "baseUri");
            this.a = baseUri;
            this.b = executable;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.c = applicationContext;
        }

        @Override // io.bidmachine.util.network.NetworkRequest.MetadataListener
        public void onReceived(ResponseMetadata responseMetadata) {
            if (responseMetadata == null) {
                UiUtils.INSTANCE.onUiThreadWithArgSafely(ProcessUrlResult.INSTANCE.getFAIL(), this.b);
                return;
            }
            if (responseMetadata.getCode() == 204) {
                UiUtils.INSTANCE.onUiThreadWithArgSafely(ProcessUrlResult.INSTANCE.getFAIL(), this.b);
                return;
            }
            e eVar = new e(this.c, this.a, this.b);
            int code = responseMetadata.getCode();
            if (400 <= code && code < 600) {
                UiUtils.INSTANCE.onUiThreadWithArgSafely(ProcessUrlResult.INSTANCE.getFAIL(), eVar);
                return;
            }
            String header = responseMetadata.getHeader(NetworkUtils.HEADER_LOCATION);
            Uri parseUriSafely = header != null ? UrlUtilsKt.parseUriSafely(header) : null;
            if (parseUriSafely == null) {
                UiUtils.INSTANCE.onUiThreadWithArgSafely(ProcessUrlResult.INSTANCE.getFAIL(), eVar);
            } else {
                UrlHandler.openUrl(this.c, parseUriSafely, eVar);
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    private static final class c implements Executable {
        private final Uri a;
        private final Executable b;

        public c(Uri baseUri, Executable executable) {
            Intrinsics.checkNotNullParameter(baseUri, "baseUri");
            this.a = baseUri;
            this.b = executable;
        }

        @Override // io.bidmachine.util.Executable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void execute(ProcessUrlResult input) {
            Intrinsics.checkNotNullParameter(input, "input");
            if (input.getIsSuccess()) {
                UrlHandler.track$bidmachine_android_sdk_bb_3_7_1(this.a.getQueryParameter("fallbackTrackingUrl"));
            }
            UiUtils.INSTANCE.onUiThreadWithArgSafely(input, this.b);
        }
    }

    private static final class d implements NetworkRequest.MetadataListener {
        private final io.bidmachine.rendering.internal.deeplinkprocessor.c a;
        private final Executable b;
        private final Context c;

        public d(Context context, io.bidmachine.rendering.internal.deeplinkprocessor.c inlineInstallsDeeplinkProcessor, Executable executable) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(inlineInstallsDeeplinkProcessor, "inlineInstallsDeeplinkProcessor");
            this.a = inlineInstallsDeeplinkProcessor;
            this.b = executable;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.c = applicationContext;
        }

        @Override // io.bidmachine.util.network.NetworkRequest.MetadataListener
        public void onReceived(ResponseMetadata responseMetadata) {
            if (responseMetadata == null) {
                UiUtils.INSTANCE.onUiThreadWithArgSafely(ProcessUrlResult.INSTANCE.getFAIL(), this.b);
                return;
            }
            int code = responseMetadata.getCode();
            if (code != 200 && code != 204) {
                UiUtils.INSTANCE.onUiThreadWithArgSafely(ProcessUrlResult.INSTANCE.getFAIL(), this.b);
                return;
            }
            String uri = responseMetadata.getUrl().toURI().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "responseMetadata.url.toURI().toString()");
            Uri parseUriSafely = UrlUtilsKt.parseUriSafely(uri);
            if (parseUriSafely == null) {
                UiUtils.INSTANCE.onUiThreadWithArgSafely(ProcessUrlResult.INSTANCE.getFAIL(), this.b);
                return;
            }
            if (!this.a.a(parseUriSafely)) {
                UrlHandler.openUrl(this.c, parseUriSafely, (Executable<ProcessUrlResult>) this.b);
                return;
            }
            io.bidmachine.rendering.internal.deeplinkprocessor.c cVar = this.a;
            Context topActivity = TopActivityHolder.INSTANCE.getTopActivity();
            if (topActivity == null) {
                topActivity = this.c;
            }
            cVar.a(topActivity, parseUriSafely, this.b);
        }
    }

    public static final class e implements Executable {
        private final Uri a;
        private final Executable b;
        private final Context c;

        public e(Context context, Uri baseUri, Executable executable) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(baseUri, "baseUri");
            this.a = baseUri;
            this.b = executable;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.c = applicationContext;
        }

        @Override // io.bidmachine.util.Executable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void execute(ProcessUrlResult input) {
            Intrinsics.checkNotNullParameter(input, "input");
            if (input.getIsSuccess()) {
                UrlHandler.track$bidmachine_android_sdk_bb_3_7_1(this.a.getQueryParameter("primaryTrackingUrl"));
                UiUtils.INSTANCE.onUiThreadWithArgSafely(input, this.b);
                return;
            }
            String queryParameter = this.a.getQueryParameter("fallbackUrl");
            if (queryParameter == null || queryParameter.length() == 0) {
                UiUtils.INSTANCE.onUiThreadWithArgSafely(ProcessUrlResult.INSTANCE.getFAIL(), this.b);
                return;
            }
            Uri validUri = Utils.getValidUri(queryParameter);
            if (validUri == null) {
                UiUtils.INSTANCE.onUiThreadWithArgSafely(ProcessUrlResult.INSTANCE.getFAIL(), this.b);
            } else {
                UrlHandler.openUrl(this.c, validUri, new c(this.a, this.b));
            }
        }
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public boolean a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.areEqual("bmlink", uri.getScheme());
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public void a(Context context, Uri uri, Executable executable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("primaryUrl");
        if (queryParameter == null || queryParameter.length() == 0) {
            CommonLog.e("BMDeeplinkProcessor", "processUrl (primaryUrl is null or empty)", new Object[0]);
            UiUtils.INSTANCE.onUiThreadWithArgSafely(ProcessUrlResult.INSTANCE.getFAIL(), executable);
            return;
        }
        Uri validUri = Utils.getValidUri(queryParameter);
        if (validUri == null) {
            CommonLog.e("BMDeeplinkProcessor", "processUrl (primaryUri is null)", new Object[0]);
            UiUtils.INSTANCE.onUiThreadWithArgSafely(ProcessUrlResult.INSTANCE.getFAIL(), executable);
            return;
        }
        String host = uri.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -761251354) {
                if (hashCode == 145262545 && host.equals("inlineinstalls")) {
                    e eVar = new e(context, uri, executable);
                    if (!this.a.a(validUri)) {
                        NetworkRequest.Builder.send$default(new NetworkRequest.Builder(validUri, Method.Get).setMetadataListener(new d(context, this.a, eVar)), null, 1, null);
                        return;
                    }
                    io.bidmachine.rendering.internal.deeplinkprocessor.c cVar = this.a;
                    Activity topActivity = TopActivityHolder.INSTANCE.getTopActivity();
                    if (topActivity != null) {
                        context = topActivity;
                    }
                    cVar.a(context, validUri, eVar);
                    return;
                }
            } else if (host.equals("clickproxy")) {
                NetworkRequest.Builder.send$default(new NetworkRequest.Builder(validUri, Method.Get).setRedirect(Redirect.None).setMetadataListener(new C1793a(context, uri, executable)), null, 1, null);
                return;
            }
        }
        UrlHandler.openUrl(context, validUri, new e(context, uri, executable));
    }
}
