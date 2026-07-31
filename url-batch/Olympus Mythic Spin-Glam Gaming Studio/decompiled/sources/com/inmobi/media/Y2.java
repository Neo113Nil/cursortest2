package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.inmobi.ads.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class Y2 implements Application.ActivityLifecycleCallbacks {
    public final String a;
    public final U2 b;
    public final C4152lb c;
    public final String d;
    public final C4172m5 e;
    public final Context f;
    public final C4199n5 g;
    public boolean h;
    public final WeakReference i;
    public final WeakReference j;

    public Y2(String urlToLoad, U2 u2, Context context, C4081ii c4081ii, Eh redirectionValidator, C4152lb c4152lb, String api) {
        Intrinsics.checkNotNullParameter(urlToLoad, "urlToLoad");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        this.a = urlToLoad;
        this.b = u2;
        this.c = c4152lb;
        this.d = api;
        C4172m5 c4172m5 = new C4172m5();
        this.e = c4172m5;
        this.g = new C4199n5(c4081ii, c4152lb);
        this.i = new WeakReference(c4081ii);
        this.j = new WeakReference(redirectionValidator);
        Intrinsics.checkNotNullParameter(this, "connectionCallback");
        c4172m5.c = this;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f = applicationContext;
        AbstractC4002fj.a(context, this);
    }

    public final C3896bj a() {
        return new C3896bj(new V2(this), new W2(), new X2(this));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C4172m5 c4172m5 = this.e;
        Context context = this.f;
        c4172m5.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        C4120k5 c4120k5 = c4172m5.b;
        if (c4120k5 != null) {
            context.unbindService(c4120k5);
            c4172m5.a = null;
        }
        c4172m5.b = null;
        c4172m5.c = null;
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final void a(Uri uri) {
        CustomTabsIntent.Builder builder;
        CustomTabsSession newSession;
        U2 u2 = this.b;
        if (u2 != null) {
            try {
                builder = a(u2);
            } catch (Error e) {
                e.getMessage();
                C4172m5 c4172m5 = this.e;
                CustomTabsSession customTabsSession = c4172m5.d;
                if (customTabsSession == null) {
                    CustomTabsClient customTabsClient = c4172m5.a;
                    newSession = customTabsClient != null ? customTabsClient.newSession(new C4146l5(c4172m5)) : null;
                    c4172m5.d = newSession;
                    customTabsSession = newSession;
                }
                builder = new CustomTabsIntent.Builder(customTabsSession);
                builder.setUrlBarHidingEnabled(true);
            }
        } else {
            C4172m5 c4172m52 = this.e;
            CustomTabsSession customTabsSession2 = c4172m52.d;
            if (customTabsSession2 == null) {
                CustomTabsClient customTabsClient2 = c4172m52.a;
                newSession = customTabsClient2 != null ? customTabsClient2.newSession(new C4146l5(c4172m52)) : null;
                c4172m52.d = newSession;
                customTabsSession2 = newSession;
            }
            builder = new CustomTabsIntent.Builder(customTabsSession2);
            builder.setUrlBarHidingEnabled(true);
        }
        Context context = this.f;
        CustomTabsIntent build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        C4081ii c4081ii = (C4081ii) this.i.get();
        C4152lb c4152lb = this.c;
        Object obj = this.j.get();
        Intrinsics.checkNotNull(obj);
        AbstractC4094j5.a(context, build, uri, c4081ii, c4152lb, (Eh) obj, this.d);
    }

    public final CustomTabsIntent.Builder a(U2 u2) {
        Bitmap bitmap;
        C4172m5 c4172m5 = this.e;
        CustomTabsSession customTabsSession = c4172m5.d;
        if (customTabsSession == null) {
            CustomTabsClient customTabsClient = c4172m5.a;
            customTabsSession = customTabsClient != null ? customTabsClient.newSession(new C4146l5(c4172m5)) : null;
            c4172m5.d = customTabsSession;
        }
        CustomTabsIntent.Builder closeButtonPosition = new CustomTabsIntent.Builder(customTabsSession).setCloseButtonPosition(2);
        Intrinsics.checkNotNullExpressionValue(closeButtonPosition, "setCloseButtonPosition(...)");
        try {
            closeButtonPosition.setShareState(2);
            closeButtonPosition.setShowTitle(false);
            closeButtonPosition.setDownloadButtonEnabled(false);
            Intrinsics.checkNotNull(closeButtonPosition.setBookmarksButtonEnabled(false));
        } catch (Error e) {
            e.getMessage();
        }
        if (u2.b) {
            Context context = this.f;
            int i = R.drawable.im_close_transparent;
            Intrinsics.checkNotNullParameter(context, "<this>");
            Drawable drawable = ContextCompat.getDrawable(context, i);
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                Intrinsics.checkNotNullExpressionValue(bitmap, "getBitmap(...)");
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(drawable != null ? drawable.getIntrinsicWidth() : 24, drawable != null ? drawable.getIntrinsicHeight() : 24, Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(createBitmap, "Bitmap.createBitmap(width, height, config)");
                Canvas canvas = new Canvas(createBitmap);
                if (drawable != null) {
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                }
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                bitmap = createBitmap;
            }
            closeButtonPosition.setCloseButtonIcon(bitmap);
        }
        T5 h = R5.h();
        Tf a = Uf.a(R5.g());
        if (a != Tf.b && a != Tf.d) {
            closeButtonPosition.setInitialActivityHeightPx((int) (((int) (h.b * u2.a)) * h.c), 2);
        } else {
            int i2 = (int) (h.a * u2.a);
            closeButtonPosition.setInitialActivityWidthPx((int) (i2 * h.c));
            closeButtonPosition.setActivitySideSheetBreakpointDp(i2);
        }
        closeButtonPosition.setUrlBarHidingEnabled(true);
        return closeButtonPosition;
    }

    public final void a(int i, int i2, int i3, int i4, int i5) {
        C4081ii c4081ii = (C4081ii) this.i.get();
        if (c4081ii != null) {
            InterfaceC4466x9 interfaceC4466x9 = c4081ii.a.i;
            if (interfaceC4466x9 != null) {
                String str = GestureDetectorOnGestureListenerC4476xi.i1;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                ((C4493y9) interfaceC4466x9).a(str, "onCCTLayout");
            }
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = c4081ii.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", "customTabLayout");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("left", N3.a(i));
            jSONObject2.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, N3.a(i2));
            jSONObject2.put("right", N3.a(i3));
            jSONObject2.put("bottom", N3.a(i4));
            jSONObject2.put("state", i5);
            Unit unit = Unit.INSTANCE;
            jSONObject.put("layout", jSONObject2);
            gestureDetectorOnGestureListenerC4476xi.b(jSONObject);
        }
    }
}
