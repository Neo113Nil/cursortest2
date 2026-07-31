package io.bidmachine.rendering.utils;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.facebook.share.internal.ShareConstants;
import io.bidmachine.iab.mraid.MraidNativeFeatureUrlParser;
import io.bidmachine.rendering.Rendering;
import io.bidmachine.rendering.internal.deeplinkprocessor.a;
import io.bidmachine.rendering.internal.deeplinkprocessor.b;
import io.bidmachine.rendering.internal.deeplinkprocessor.e;
import io.bidmachine.rendering.internal.deeplinkprocessor.f;
import io.bidmachine.rendering.internal.h;
import io.bidmachine.rendering.internal.n;
import io.bidmachine.rendering.utils.NetworkRequest;
import io.bidmachine.util.Executable;
import io.bidmachine.util.ProcessUrlResult;
import io.bidmachine.util.UrlUtilsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007¢\u0006\u0004\b\f\u0010\rJ/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007¢\u0006\u0004\b\f\u0010\u0010J/\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0001¢\u0006\u0004\b\u0011\u0010\u0010J/\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0013\u0010\rJ/\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0014\u0010\rJ\u0019\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR&\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001c0\"8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u0003\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lio/bidmachine/rendering/utils/UrlHandler;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "url", "Lio/bidmachine/util/Executable;", "Lio/bidmachine/util/ProcessUrlResult;", "postMethod", "", "openUrl", "(Landroid/content/Context;Ljava/lang/String;Lio/bidmachine/util/Executable;)V", "Landroid/net/Uri;", ShareConstants.MEDIA_URI, "(Landroid/content/Context;Landroid/net/Uri;Lio/bidmachine/util/Executable;)V", "openBrowser$bidmachine_android_sdk_bb_3_7_1", "openBrowser", "openCalendar", "storePicture", "track$bidmachine_android_sdk_bb_3_7_1", "(Ljava/lang/String;)V", "track", "Lio/bidmachine/rendering/internal/h;", "a", "Lio/bidmachine/rendering/internal/h;", "INTENT_LAUNCHER", "Lio/bidmachine/rendering/internal/deeplinkprocessor/b;", "b", "Lio/bidmachine/rendering/internal/deeplinkprocessor/b;", "MRAID_CALENDAR_DEEPLINK_PROCESSOR", "c", "MRAID_STORE_PICTURE_DEEPLINK_PROCESSOR", "", "d", "Ljava/util/List;", "getSUPPORTED_DEEPLINK_PROCESSORS", "()Ljava/util/List;", "getSUPPORTED_DEEPLINK_PROCESSORS$annotations", "SUPPORTED_DEEPLINK_PROCESSORS", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class UrlHandler {

    @NotNull
    public static final UrlHandler INSTANCE = new UrlHandler();

    /* renamed from: a, reason: from kotlin metadata */
    private static final h INTENT_LAUNCHER;

    /* renamed from: b, reason: from kotlin metadata */
    private static final b MRAID_CALENDAR_DEEPLINK_PROCESSOR;

    /* renamed from: c, reason: from kotlin metadata */
    private static final b MRAID_STORE_PICTURE_DEEPLINK_PROCESSOR;

    /* renamed from: d, reason: from kotlin metadata */
    private static final List SUPPORTED_DEEPLINK_PROCESSORS;

    static {
        h hVar = new h();
        INTENT_LAUNCHER = hVar;
        MraidNativeFeatureUrlParser mraidNativeFeatureUrlParser = new MraidNativeFeatureUrlParser();
        e eVar = new e(mraidNativeFeatureUrlParser, hVar);
        MRAID_CALENDAR_DEEPLINK_PROCESSOR = eVar;
        f fVar = new f(mraidNativeFeatureUrlParser, new n());
        MRAID_STORE_PICTURE_DEEPLINK_PROCESSOR = fVar;
        SUPPORTED_DEEPLINK_PROCESSORS = CollectionsKt.listOf((Object[]) new b[]{eVar, fVar, new a()});
    }

    private UrlHandler() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getSUPPORTED_DEEPLINK_PROCESSORS$annotations() {
    }

    public static final void openBrowser$bidmachine_android_sdk_bb_3_7_1(@NotNull Context context, @NotNull Uri uri, @Nullable Executable<ProcessUrlResult> postMethod) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        INTENT_LAUNCHER.a(context, uri, postMethod);
    }

    public static final void openCalendar(@NotNull Context context, @NotNull String url, @Nullable Executable<ProcessUrlResult> postMethod) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        MRAID_CALENDAR_DEEPLINK_PROCESSOR.a(context, url, postMethod);
    }

    public static final void openUrl(@NotNull Context context, @NotNull String url, @Nullable Executable<ProcessUrlResult> postMethod) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        openUrl(context, UrlUtilsKt.parseUri(url), postMethod);
    }

    public static final void storePicture(@NotNull Context context, @NotNull String url, @Nullable Executable<ProcessUrlResult> postMethod) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        MRAID_STORE_PICTURE_DEEPLINK_PROCESSOR.a(context, url, postMethod);
    }

    public static final void track$bidmachine_android_sdk_bb_3_7_1(@Nullable String url) {
        String validUrl = io.bidmachine.util.Utils.getValidUrl(url);
        if (validUrl == null || validUrl.length() == 0) {
            return;
        }
        new NetworkRequest.Builder(validUrl, NetworkRequest.Method.Get).setUserAgent(Rendering.getUserAgent()).send();
    }

    @NotNull
    public final List<b> getSUPPORTED_DEEPLINK_PROCESSORS() {
        return SUPPORTED_DEEPLINK_PROCESSORS;
    }

    public static final void openUrl(@NotNull Context context, @NotNull Uri uri, @Nullable Executable<ProcessUrlResult> postMethod) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        for (b bVar : SUPPORTED_DEEPLINK_PROCESSORS) {
            if (bVar.a(uri)) {
                bVar.a(context, uri, postMethod);
                return;
            }
        }
        openBrowser$bidmachine_android_sdk_bb_3_7_1(context, uri, postMethod);
    }
}
