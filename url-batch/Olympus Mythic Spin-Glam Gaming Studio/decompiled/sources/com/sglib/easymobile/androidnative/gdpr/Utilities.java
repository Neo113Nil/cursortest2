package com.sglib.easymobile.androidnative.gdpr;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import com.safedk.android.utils.Logger;
import com.sglib.easymobile.androidnative.Helper;

/* loaded from: classes3.dex */
public final class Utilities {
    public static double tabletMinimumSize = 7.0d;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public static void setTextViewWithHTML(Context context, TextView textView, String str) {
        CharSequence fromHtml = fromHtml(replaceHtmlLineBreaks(str));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, fromHtml.length(), URLSpan.class)) {
            makeLinkClickable(context, spannableStringBuilder, uRLSpan);
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private static void makeLinkClickable(final Context context, SpannableStringBuilder spannableStringBuilder, final URLSpan uRLSpan) {
        spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.sglib.easymobile.androidnative.gdpr.Utilities.1
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                Utilities.openUrlInBrowser(context, uRLSpan.getURL());
            }
        }, spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
        spannableStringBuilder.removeSpan(uRLSpan);
    }

    public static String replaceHtmlLineBreaks(String str) {
        if (Helper.IsNullOrEmptyString(str)) {
            return "";
        }
        return str.replace("\\n", "<br />").replace("\n", "<br />");
    }

    public static void openUrlInBrowser(Context context, String str) {
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public static boolean isOnTablet(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f = displayMetrics.widthPixels / displayMetrics.xdpi;
        float f2 = displayMetrics.heightPixels / displayMetrics.ydpi;
        return Math.sqrt((double) ((f * f) + (f2 * f2))) >= tabletMinimumSize;
    }

    private static CharSequence fromHtml(String str) {
        return Html.fromHtml(str, 0);
    }
}
