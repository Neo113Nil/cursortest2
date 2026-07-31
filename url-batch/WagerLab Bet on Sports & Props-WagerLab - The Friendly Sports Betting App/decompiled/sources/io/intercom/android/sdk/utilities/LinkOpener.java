package io.intercom.android.sdk.utilities;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.activities.IntercomCarouselActivity;
import io.intercom.android.sdk.activities.IntercomNoteActivity;
import io.intercom.android.sdk.activities.IntercomPostActivity;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.helpcenter.utils.HelpCenterUrlUtilsKt;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.IntercomRootActivity;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.survey.ui.IntercomSurveyActivity;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes8.dex */
public class LinkOpener {
    private static final Twig twig = LumberMill.getLogger();

    public static void handleUrl(String str, Context context, Api api) {
        handleUrl(str, context, api, false);
    }

    public static void handleUrl(String str, Context context, Api api, boolean z) {
        Uri parseUrl;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (isTrackingUrl(str)) {
            api.hitTrackingUrl(str);
            parseUrl = getTargetUriFromTrackingUrl(str);
        } else {
            parseUrl = parseUrl(str);
        }
        Set<String> helpCenterUrls = Injector.get().getAppConfigProvider().get().getHelpCenterUrls();
        String uri = parseUrl.toString();
        String placeFromContext = getPlaceFromContext(context);
        if (HelpCenterUrlUtilsKt.isHelpCenterArticleUrl(uri, helpCenterUrls)) {
            HelpCenterUrlUtilsKt.openArticle(context, HelpCenterUrlUtilsKt.extractIdFromLastSegment(parseUrl.getLastPathSegment()), placeFromContext, z);
        } else if (HelpCenterUrlUtilsKt.isHelpCenterCollectionUrl(uri, helpCenterUrls)) {
            HelpCenterUrlUtilsKt.openCollection(context, HelpCenterUrlUtilsKt.extractIdFromLastSegment(parseUrl.getLastPathSegment()), placeFromContext);
        } else {
            openUrl(parseUrl, context);
        }
    }

    private static String getPlaceFromContext(Context context) {
        if (context instanceof IntercomCarouselActivity) {
            return "carousel_message";
        }
        if ((context instanceof IntercomPostActivity) || (context instanceof IntercomNoteActivity)) {
            return MetricTracker.Place.IN_APP;
        }
        if (context instanceof IntercomRootActivity) {
            return "conversation";
        }
        if (context instanceof IntercomSurveyActivity) {
            return "survey";
        }
        return MetricTracker.Place.PUSH;
    }

    static Uri getTargetUriFromTrackingUrl(String str) {
        Uri parse = Uri.parse(str);
        String queryParameter = parse.isHierarchical() ? parse.getQueryParameter("url") : str;
        if (queryParameter != null) {
            str = queryParameter;
        }
        return parseUrl(str);
    }

    private static Uri parseUrl(String str) {
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            parse = Uri.parse("http://" + str);
        }
        return (parse.getScheme().equalsIgnoreCase("http") || parse.getScheme().equalsIgnoreCase("https")) ? normalizeScheme(parse) : parse;
    }

    private static Uri normalizeScheme(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            String lowerCase = scheme.toLowerCase(Locale.ROOT);
            if (!scheme.equals(lowerCase)) {
                return uri.buildUpon().scheme(lowerCase).build();
            }
        }
        return uri;
    }

    private static boolean isTrackingUrl(String str) {
        return str.contains("via.intercom.io") || str.contains("via.eu.intercom.io") || str.contains("via.au.intercom.io");
    }

    private static void openUrl(Uri uri, Context context) {
        Intent intent = new Intent("mailto".equals(uri.getScheme()) ? "android.intent.action.SENDTO" : "android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        try {
            IntentUtils.safelyOpenIntent(context, intent);
        } catch (ActivityNotFoundException unused) {
            twig.e("No Activity found to handle the URL '" + uri.toString() + "'", new Object[0]);
        } catch (SecurityException e) {
            twig.e("Couldn't open link because of error: " + e.getMessage(), new Object[0]);
        }
    }
}
