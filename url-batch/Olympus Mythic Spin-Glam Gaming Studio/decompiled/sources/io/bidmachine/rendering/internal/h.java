package io.bidmachine.rendering.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract;
import com.facebook.internal.AnalyticsEvents;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.iab.mraid.MraidCalendarEvent;
import io.bidmachine.util.Executable;
import io.bidmachine.util.IntentUtilsKt;
import io.bidmachine.util.ProcessUrlResult;
import io.bidmachine.util.UiUtils;
import io.bidmachine.util.UrlUtilsKt;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h {
    public static final a b = new a(null);
    private final ExecutorService a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor()");
        this.a = newSingleThreadExecutor;
    }

    private final void b(Context context, final Uri uri, final Executable executable) {
        final Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        this.a.execute(new Runnable() { // from class: io.bidmachine.rendering.internal.h$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                h.a(h.this, applicationContext, uri, executable);
            }
        });
    }

    private final void c(Context context, Uri uri, Executable executable) {
        IntentUtilsKt.findEndpointAndOpenUrl(context, uri.toString(), executable);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "io.bidmachine");
        p0.startActivity(p1);
    }

    public final void a(Context context, Uri uri, Executable executable) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (uri == null) {
            k.a("IntentLauncher", "launch - Uri is null", new Object[0]);
            UiUtils.INSTANCE.onUiThreadWithArgSafely(ProcessUrlResult.INSTANCE.getFAIL(), executable);
        } else if (UrlUtilsKt.isHttp(uri)) {
            b(context, uri, executable);
        } else if (uri.getScheme() != null) {
            UiUtils.INSTANCE.onUiThreadWithArgSafely(IntentUtilsKt.openUri(context, uri), executable);
        } else {
            k.a("IntentLauncher", "launch - Invalid uri: %s", uri);
            UiUtils.INSTANCE.onUiThreadWithArgSafely(ProcessUrlResult.INSTANCE.getFAIL(), executable);
        }
    }

    private final void b(Context context, MraidCalendarEvent mraidCalendarEvent, Executable executable) {
        a(IntentUtilsKt.toChooserIntent(a(mraidCalendarEvent)), context, executable);
    }

    public final void a(Context context, MraidCalendarEvent mraidCalendarEvent, Executable executable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mraidCalendarEvent, "mraidCalendarEvent");
        b(context, mraidCalendarEvent, executable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(h this$0, Context applicationContext, Uri uri, Executable executable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(applicationContext, "$applicationContext");
        Intrinsics.checkNotNullParameter(uri, "$uri");
        this$0.c(applicationContext, uri, executable);
    }

    private final void a(Intent intent, Context context, Executable executable) {
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context.getApplicationContext(), intent);
            UiUtils.INSTANCE.onUiThreadWithArgSafely(ProcessUrlResult.INSTANCE.getSUCCESS(), executable);
        } catch (Exception e) {
            k.b(e);
            UiUtils.INSTANCE.onUiThreadWithArgSafely(ProcessUrlResult.INSTANCE.getFAIL(), executable);
        }
    }

    private final Intent a(MraidCalendarEvent mraidCalendarEvent) {
        int i;
        Intent putExtra = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("title", mraidCalendarEvent.getDescription()).putExtra("beginTime", mraidCalendarEvent.getStart().getTime());
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(Intent.ACTION_INS…IN_TIME, this.start.time)");
        Date end = mraidCalendarEvent.getEnd();
        if (end != null) {
            putExtra.putExtra("endTime", end.getTime());
        }
        String summary = mraidCalendarEvent.getSummary();
        if (summary != null) {
            putExtra.putExtra("description", summary);
        }
        String location = mraidCalendarEvent.getLocation();
        if (location != null) {
            putExtra.putExtra("eventLocation", location);
        }
        String status = mraidCalendarEvent.getStatus();
        int i2 = 0;
        if (status != null) {
            if (Intrinsics.areEqual(status, "confirmed")) {
                i = 1;
            } else {
                i = Intrinsics.areEqual(status, AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED) ? 2 : 0;
            }
            putExtra.putExtra("eventStatus", i);
        }
        String transparency = mraidCalendarEvent.getTransparency();
        if (transparency != null) {
            if (Intrinsics.areEqual(transparency, X3.i.T)) {
                i2 = 1;
            } else if (!Intrinsics.areEqual(transparency, "opaque")) {
                i2 = 2;
            }
            putExtra.putExtra("availability", i2);
        }
        String recurrence = mraidCalendarEvent.getRecurrence();
        if (recurrence != null) {
            putExtra.putExtra("rrule", recurrence);
        }
        return putExtra;
    }
}
