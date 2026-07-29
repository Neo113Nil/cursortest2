package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowMetrics;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.onevcat.uniwebview.R;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031h0 implements z2, InterfaceC0043k0 {
    public static boolean A;
    public static FrameLayout z;
    public final Activity a;
    public final String b;
    public final C0034i c;
    public boolean d;
    public final C0063p0 e;
    public A2 f;
    public String g;
    public boolean h;
    public boolean i;
    public AnimationSet j;
    public boolean k;
    public boolean l;
    public boolean m;
    public ByteArrayOutputStream n;
    public Bitmap o;
    public C0006b p;
    public Point q;
    public Point r;
    public C0015d0 s;
    public N2 t;
    public C0011c0 u;
    public final C0092z v;
    public final C0039j0 w;
    public final M2 x;
    public final E2 y;

    public C0031h0(Activity activity, String name, C0034i messageSender) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(messageSender, "messageSender");
        this.a = activity;
        this.b = name;
        this.c = messageSender;
        this.d = true;
        C0063p0 c0063p0 = new C0063p0(activity, this);
        this.e = c0063p0;
        this.k = true;
        this.u = new C0011c0(0.0f, 0.0f, 0.0f, 0.0f);
        if (z == null) {
            FrameLayout frameLayout = new FrameLayout(activity);
            frameLayout.setVisibility(4);
            frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            activity.addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
            z = frameLayout;
        }
        c0063p0.setX(0.0f);
        c0063p0.setY(0.0f);
        c0063p0.setVisibility(4);
        c0063p0.setId(View.generateViewId());
        FrameLayout frameLayout2 = z;
        Intrinsics.checkNotNull(frameLayout2);
        C0092z c0092z = new C0092z(activity, c0063p0, frameLayout2, name, messageSender, this);
        c0092z.setOnTouchListener(new View.OnTouchListener() { // from class: com.onevcat.uniwebview.internal.obfuscated.h0$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C0031h0.a(C0031h0.this, view, motionEvent);
            }
        });
        this.v = c0092z;
        C0039j0 c0039j0 = new C0039j0(activity);
        c0039j0.setDelegate(this);
        c0039j0.setLayoutParams(new Toolbar.LayoutParams(-1, -2));
        c0039j0.setVisibility(8);
        this.w = c0039j0;
        M2 m2 = new M2(activity);
        m2.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        this.x = m2;
        E2 e2 = new E2(activity);
        e2.setOrientation(1);
        e2.setBackgroundColor(0);
        this.y = e2;
    }

    public static final void c(C0031h0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.e.getWidth() >= ((int) (A ? 0.0f : 10000.0f)) * 2) {
            if (this$0.e.getHeight() >= ((int) (A ? 0.0f : 10000.0f)) * 2) {
                return;
            }
        }
        C0058o c0058o = C0058o.b;
        String message = "View height limited to " + this$0.e.getHeight() + ", using fallback. View rotation/resizing might not work properly.";
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        A = true;
        Point point = this$0.q;
        this$0.a(point != null ? point.x : 0, point != null ? point.y : 0);
        Point point2 = this$0.r;
        this$0.b(point2 != null ? point2.x : 0, point2 != null ? point2.y : 0);
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.z2
    public final void a(String str, int i) {
        C0058o c0058o = C0058o.b;
        String message = "onPageFinished. URL: " + str + ", status code: " + i;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        C0039j0 c0039j0 = this.w;
        C0092z c0092z = this.v;
        boolean z2 = true;
        boolean z3 = c0092z.d.i != null || c0092z.canGoBack();
        C0092z c0092z2 = this.v;
        C0092z c0092z3 = c0092z2.d.i;
        if (!(c0092z3 != null ? c0092z3.canGoForward() : false) && !c0092z2.canGoForward()) {
            z2 = false;
        }
        c0039j0.a(z3, z2);
        this.i = false;
        a(false);
        String valueOf = String.valueOf(i);
        if (str == null) {
            str = "";
        }
        this.c.a(this.v.getName(), P2.PageFinished, new D2("", valueOf, str, null));
        if (this.l) {
            d();
            e();
        }
    }

    public final void b(final String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.onevcat.uniwebview.internal.obfuscated.h0$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                C0031h0.a(str, this);
            }
        };
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            this.a.runOnUiThread(runnable);
        }
    }

    public final void d() {
        if (this.m) {
            C0058o c0058o = C0058o.b;
            String message = "Transparency script already injected for " + this.b + ", skipping";
            c0058o.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c0058o.a(EnumC0054n.VERBOSE, message);
            return;
        }
        C0058o c0058o2 = C0058o.b;
        String message2 = "Injecting transparency script for " + this.b;
        c0058o2.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c0058o2.a(EnumC0054n.INFO, message2);
        if (this.t == null) {
            N2 n2 = new N2(this);
            this.t = n2;
            this.v.addJavascriptInterface(n2, "UniWebViewTransparencyBridge");
        }
        this.v.post(new Runnable() { // from class: com.onevcat.uniwebview.internal.obfuscated.h0$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                C0031h0.a(C0031h0.this);
            }
        });
        this.m = true;
    }

    public final void e() {
        C0058o c0058o = C0058o.b;
        String message = "Requesting transparency mask refresh for " + this.b;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.DEBUG, message);
        this.v.post(new Runnable() { // from class: com.onevcat.uniwebview.internal.obfuscated.h0$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                C0031h0.b(C0031h0.this);
            }
        });
    }

    public final void f() {
        Point point = this.r;
        C0058o c0058o = C0058o.b;
        String message = "Container.syncShadow called for " + this.b + ", lastSize=" + point;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        if (point != null) {
            this.x.a(this.y, point.x, point.y);
            return;
        }
        M2 m2 = this.x;
        E2 e2 = this.y;
        int i = M2.m;
        m2.a(e2, 0, 0);
    }

    public static final void b(C0031h0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.v.evaluateJavascript("window.__uv_transparency_collect && window.__uv_transparency_collect();", null);
    }

    public final void b(int i, int i2) {
        int i3;
        this.r = new Point(i, i2);
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            boolean z2 = A;
            if (z2) {
                i3 = -1;
            } else {
                if (z2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = ((int) (z2 ? 0.0f : 10000.0f)) * 2;
            }
            layoutParams2.width = i3;
            layoutParams2.height = i3;
            layoutParams2.gravity = 51;
            this.e.setLayoutParams(layoutParams2);
            if (!A) {
                this.e.post(new Runnable() { // from class: com.onevcat.uniwebview.internal.obfuscated.h0$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0031h0.c(C0031h0.this);
                    }
                });
            }
            ViewGroup.LayoutParams layoutParams3 = this.y.getLayoutParams();
            if (layoutParams3 != null) {
                int max = Math.max(0, i);
                int max2 = Math.max(0, i2);
                layoutParams3.width = max;
                layoutParams3.height = max2;
                this.y.setLayoutParams(layoutParams3);
                C0006b c0006b = this.p;
                if (c0006b != null) {
                    c0006b.f = max2;
                }
                f();
                this.y.post(new Runnable() { // from class: com.onevcat.uniwebview.internal.obfuscated.h0$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0031h0.d(C0031h0.this);
                    }
                });
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final float c() {
        return this.e.getAlpha();
    }

    public final void c(boolean z2) {
        if (this.f == null) {
            Activity activity = this.a;
            String str = this.g;
            if (str == null) {
                str = activity.getResources().getString(R.string.LOADING);
                Intrinsics.checkNotNullExpressionValue(str, "activity.resources.getString(R.string.LOADING)");
            }
            this.f = new A2(activity, str);
        }
        A2 a2 = this.f;
        if (a2 != null) {
            a2.setCanceledOnTouchOutside(this.d);
        }
        if ((z2 || this.h) && this.e.getVisibility() == 0) {
            C0058o c0058o = C0058o.b;
            c0058o.getClass();
            Intrinsics.checkNotNullParameter("Show progress dialog.", "message");
            c0058o.a(EnumC0054n.VERBOSE, "Show progress dialog.");
            A2 a22 = this.f;
            if (a22 != null) {
                String message = this.g;
                if (message == null) {
                    message = this.a.getResources().getString(R.string.LOADING);
                    Intrinsics.checkNotNullExpressionValue(message, "activity.resources.getString(R.string.LOADING)");
                }
                Intrinsics.checkNotNullParameter(message, "message");
                TextView textView = a22.a;
                if (textView != null) {
                    textView.setText(message);
                }
            }
            A2 a23 = this.f;
            if (a23 != null) {
                a23.show();
            }
        }
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.z2
    public final void a(String str) {
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("onPageStarted: ", str, c0058o, "message"));
        C0039j0 c0039j0 = this.w;
        C0092z c0092z = this.v;
        boolean z2 = c0092z.d.i != null || c0092z.canGoBack();
        C0092z c0092z2 = this.v;
        C0092z c0092z3 = c0092z2.d.i;
        c0039j0.a(z2, (c0092z3 != null ? c0092z3.canGoForward() : false) || c0092z2.canGoForward());
        this.i = true;
        c(false);
        this.m = false;
        if (str == null) {
            str = "";
        }
        this.c.a(this.v.getName(), P2.PageStarted, str);
        this.c.a(this.v.getName(), P2.PageCommitted, str);
    }

    public static final void d(C0031h0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.y.getWidth() <= 0 || this$0.y.getHeight() <= 0) {
            return;
        }
        C0058o c0058o = C0058o.b;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter("Container.setSize: layout completed, syncing shadow again", "message");
        c0058o.a(EnumC0054n.INFO, "Container.setSize: layout completed, syncing shadow again");
        this$0.f();
    }

    public final void a(int i, int i2, int i3, int i4) {
        C0058o c0058o = C0058o.b;
        String message = "Setting web container frame to {(" + i + ", " + i2 + "), (" + i3 + ", " + i4 + ")}";
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.VERBOSE, message);
        a(i, i2);
        b(i3, i4);
    }

    public final void b(boolean z2) {
        this.w.setVisibility(z2 ? 0 : 8);
    }

    public final void b() {
        Object systemService = this.a.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.v.getWindowToken(), 0);
        }
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.z2
    public final void a(D2 payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        JSONObject jSONObject = payload.d;
        String string = jSONObject != null ? jSONObject.getString("failingURL") : null;
        C0058o c0058o = C0058o.b;
        String message = "onReceivedError. URL: " + string + ", error code: " + payload.b + ", description: " + payload.c;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.CRITICAL, message);
        C0039j0 c0039j0 = this.w;
        C0092z c0092z = this.v;
        boolean z2 = true;
        boolean z3 = c0092z.d.i != null || c0092z.canGoBack();
        C0092z c0092z2 = this.v;
        C0092z c0092z3 = c0092z2.d.i;
        if (!(c0092z3 != null ? c0092z3.canGoForward() : false) && !c0092z2.canGoForward()) {
            z2 = false;
        }
        c0039j0.a(z3, z2);
        this.i = false;
        a(false);
        this.c.a(this.v.getName(), P2.PageErrorReceived, payload);
    }

    public static final void a(final C0031h0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C0092z c0092z = this$0.v;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "(function() {\n          if (window.__uvTransparencyBridgeInstalled) {\n            return;\n          }\n          window.__uvTransparencyBridgeInstalled = true;\n        \n          var MASK_ATTR = 'data-uv-transparency';\n          var MODE_OPAQUE = 'opaque';\n          var scheduled = false;\n        \n          function postPayload(payload) {\n            var bridge = window['%s'];\n            if (!bridge || typeof bridge.postMessage !== 'function') {\n              return;\n            }\n            try {\n              bridge.postMessage(JSON.stringify(payload));\n            } catch (error) {\n              console.error('UniWebView transparency payload failed:', error);\n            }\n          }\n        \n          function isElementVisible(element) {\n            var rect = element.getBoundingClientRect();\n            if (!rect || rect.width === 0 || rect.height === 0) {\n              return false;\n            }\n\n            // Check if element is within viewport bounds\n            var viewportWidth = window.innerWidth || document.documentElement.clientWidth;\n            var viewportHeight = window.innerHeight || document.documentElement.clientHeight;\n\n            // Element is completely outside viewport\n            if (rect.bottom < 0 || rect.top > viewportHeight ||\n                rect.right < 0 || rect.left > viewportWidth) {\n              return false;\n            }\n\n            // Check if element is visible in parent containers\n            var parent = element.parentElement;\n            while (parent && parent !== document.body) {\n              var parentRect = parent.getBoundingClientRect();\n              var parentStyle = window.getComputedStyle(parent);\n\n              // If parent has overflow hidden/auto/scroll, check if element is within parent's visible area\n              if (parentStyle.overflow !== 'visible' &&\n                  parentStyle.overflow !== '' &&\n                  parentStyle.overflow !== 'unset') {\n\n                // Check if element is outside parent's visible bounds\n                if (rect.bottom < parentRect.top || rect.top > parentRect.bottom ||\n                    rect.right < parentRect.left || rect.left > parentRect.right) {\n                  return false;\n                }\n              }\n              parent = parent.parentElement;\n            }\n\n            return true;\n          }\n\n          function collect() {\n            scheduled = false;\n            var nodes = document.querySelectorAll('[' + MASK_ATTR + ']');\n            var regions = [];\n            for (var i = 0; i < nodes.length; i += 1) {\n              var node = nodes[i];\n              if (node.getAttribute(MASK_ATTR) !== MODE_OPAQUE) {\n                continue;\n              }\n              if (!isElementVisible(node)) {\n                continue;\n              }\n              var rect = node.getBoundingClientRect();\n              regions.push({\n                mode: MODE_OPAQUE,\n                x: rect.left,\n                y: rect.top,\n                width: rect.width,\n                height: rect.height\n              });\n            }\n        \n            postPayload({\n              type: 'update',\n              timestamp: Date.now(),\n              regions: regions,\n              viewportWidth: window.innerWidth,\n              viewportHeight: window.innerHeight,\n              scale: window.devicePixelRatio || 1\n            });\n          }\n        \n          function schedule() {\n            if (scheduled) {\n              return;\n            }\n            scheduled = true;\n            requestAnimationFrame(collect);\n          }\n        \n          document.addEventListener('DOMContentLoaded', collect);\n          window.addEventListener('load', collect);\n          window.addEventListener('resize', schedule);\n          window.addEventListener('scroll', schedule, true);\n        \n          if (typeof MutationObserver !== 'undefined') {\n            var observer = new MutationObserver(schedule);\n            observer.observe(document.documentElement, { attributes: true, childList: true, subtree: true });\n          }\n        \n          window.__uv_transparency_collect = collect;\n          collect();\n        })();", Arrays.copyOf(new Object[]{"UniWebViewTransparencyBridge"}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        c0092z.evaluateJavascript(format, new ValueCallback() { // from class: com.onevcat.uniwebview.internal.obfuscated.h0$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                C0031h0.a(C0031h0.this, (String) obj);
            }
        });
    }

    public static final void a(C0031h0 this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str != null && !Intrinsics.areEqual(str, "null")) {
            C0058o c0058o = C0058o.b;
            String message = "Transparency script injected successfully for " + this$0.b;
            c0058o.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c0058o.a(EnumC0054n.VERBOSE, message);
            return;
        }
        C0058o c0058o2 = C0058o.b;
        String message2 = "Failed to inject transparency script for " + this$0.b;
        c0058o2.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c0058o2.a(EnumC0054n.CRITICAL, message2);
    }

    public static final void a(String str, C0031h0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray optJSONArray = jSONObject.optJSONArray("regions");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            float optDouble = (float) jSONObject.optDouble("scale", this$0.v.getScale());
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null && Intrinsics.areEqual(optJSONObject.optString("mode"), "opaque")) {
                    float optDouble2 = (float) optJSONObject.optDouble("x", 0.0d);
                    float optDouble3 = (float) optJSONObject.optDouble("y", 0.0d);
                    arrayList.add(new RectF(optDouble2, optDouble3, ((float) optJSONObject.optDouble("width", 0.0d)) + optDouble2, ((float) optJSONObject.optDouble("height", 0.0d)) + optDouble3));
                }
            }
            if (optDouble <= 0.0f) {
                float scale = this$0.v.getScale();
                Float valueOf = Float.valueOf(scale);
                if (scale <= 0.0f) {
                    valueOf = null;
                }
                optDouble = valueOf != null ? valueOf.floatValue() : this$0.v.getResources().getDisplayMetrics().density;
            }
            this$0.a(arrayList, optDouble);
        } catch (Exception e) {
            C0058o c0058o = C0058o.b;
            String message = "Failed to parse transparency mask payload: " + str + ", error: " + e;
            c0058o.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c0058o.a(EnumC0054n.CRITICAL, message);
        }
    }

    public final void a(List list, float f) {
        List list2;
        String joinToString$default;
        this.s = new C0015d0(list, f);
        if (list.isEmpty()) {
            joinToString$default = "[]";
            list2 = list;
        } else {
            list2 = list;
            joinToString$default = CollectionsKt.joinToString$default(list2, null, "[", "]", 0, null, C0027g0.a, 25, null);
        }
        C0058o c0058o = C0058o.b;
        StringBuilder append = new StringBuilder("Transparency mask updated for ").append(this.b).append(": count=").append(list2.size()).append(", scale=");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%.3f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        String message = append.append(format).append(", rects=").append(joinToString$default).toString();
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.DEBUG, message);
    }

    public static final boolean a(C0031h0 this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return !this$0.k;
    }

    public final boolean a(float f, float f2) {
        double radians = Math.toRadians(-this.y.getRotation());
        double width = f - ((this.y.getWidth() / 2.0f) + AbstractC0030h.a(this.y).x);
        double height = f2 - ((this.y.getHeight() / 2.0f) + AbstractC0030h.a(this.y).y);
        float cos = (float) ((Math.cos(radians) * width) - (Math.sin(radians) * height));
        float cos2 = (float) ((Math.cos(radians) * height) + (Math.sin(radians) * width));
        float scaleX = ((this.y.getScaleX() * this.y.getWidth()) / 2.0f) + cos;
        float scaleY = ((this.y.getScaleY() * this.y.getHeight()) / 2.0f) + cos2;
        if (scaleX < 0.0f) {
            return false;
        }
        if (scaleX > this.y.getScaleX() * this.y.getWidth() || scaleY < 0.0f) {
            return false;
        }
        return scaleY <= this.y.getScaleY() * ((float) this.y.getHeight());
    }

    public final void a(float f, float f2, float f3) {
        this.y.setRotation(f);
        this.y.setScaleX(f2);
        this.y.setScaleY(f3);
        f();
    }

    public final void a(int i, int i2) {
        this.q = new Point(i, i2);
        this.e.setX(-(A ? 0.0f : 10000.0f));
        this.e.setY(-(A ? 0.0f : 10000.0f));
        float f = i;
        float f2 = i2;
        E2 view = this.y;
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z2 = A;
        Point point = new Point((int) (f + (z2 ? 0.0f : 10000.0f)), (int) (f2 + (z2 ? 0.0f : 10000.0f)));
        view.setX(point.x);
        view.setY(point.y);
        f();
    }

    public final boolean a(final boolean z2, boolean z3, int i, float f, final String identifier) {
        int i2;
        AlphaAnimation alphaAnimation;
        Point point;
        int i3;
        TranslateAnimation translateAnimation;
        int i4;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        int i5 = 0;
        if (this.v.get_webChromeClient$uniwebview_release().f) {
            FrameLayout frameLayout = z;
            if (frameLayout != null) {
                frameLayout.setVisibility(z2 ? 0 : 4);
            }
            return true;
        }
        boolean z4 = this.e.getVisibility() == 0;
        if (z4 && z2) {
            C0058o c0058o = C0058o.b;
            c0058o.getClass();
            Intrinsics.checkNotNullParameter("Showing web view is ignored since it is already visible.", "message");
            c0058o.a(EnumC0054n.CRITICAL, "Showing web view is ignored since it is already visible.");
            return false;
        }
        if (!z4 && !z2) {
            C0058o c0058o2 = C0058o.b;
            c0058o2.getClass();
            Intrinsics.checkNotNullParameter("Hiding web view is ignored since it is already invisible.", "message");
            c0058o2.a(EnumC0054n.CRITICAL, "Hiding web view is ignored since it is already invisible.");
            return false;
        }
        if (this.j != null) {
            C0058o c0058o3 = C0058o.b;
            c0058o3.getClass();
            Intrinsics.checkNotNullParameter("Trying to show or hide web view but an other transition animation is not finished yet. Ignore this one.", "message");
            c0058o3.a(EnumC0054n.CRITICAL, "Trying to show or hide web view but an other transition animation is not finished yet. Ignore this one.");
            return false;
        }
        if (z2) {
            this.e.setVisibility(0);
            if (this.i) {
                c(false);
            }
        } else {
            b();
            a(false);
        }
        this.e.requestLayout();
        int[] iArr = new int[5];
        System.arraycopy(AbstractC0010c.a, 0, iArr, 0, 5);
        int i6 = 0;
        while (true) {
            if (i6 >= 5) {
                i2 = 0;
                break;
            }
            i2 = iArr[i6];
            if (AbstractC0010c.a(i2) == i) {
                break;
            }
            i6++;
        }
        if (i2 == 0) {
            i2 = 1;
        }
        if ((z3 || i2 != 1) && f > 0.0f) {
            AnimationSet animationSet = new AnimationSet(false);
            long j = (long) (f * 1000);
            if (z3) {
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(z2 ? 0.0f : this.e.getAlpha(), z2 ? this.e.getAlpha() : 0.0f);
                alphaAnimation2.setFillAfter(true);
                alphaAnimation2.setDuration(j);
                alphaAnimation = alphaAnimation2;
            } else {
                alphaAnimation = null;
            }
            if (alphaAnimation != null) {
                animationSet.addAnimation(alphaAnimation);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics currentWindowMetrics = this.a.getWindow().getWindowManager().getCurrentWindowMetrics();
                Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "activity.window.windowManager.currentWindowMetrics");
                Rect bounds = currentWindowMetrics.getBounds();
                Intrinsics.checkNotNullExpressionValue(bounds, "metrics.bounds");
                point = new Point(bounds.width(), bounds.height());
            } else {
                Display defaultDisplay = this.a.getWindow().getWindowManager().getDefaultDisplay();
                point = new Point();
                defaultDisplay.getRealSize(point);
            }
            int a = AbstractC0010c.a(i2);
            if (a != 0) {
                if (a == 1) {
                    i4 = -point.y;
                } else if (a == 2) {
                    i3 = -point.x;
                } else if (a == 3) {
                    i4 = point.y;
                } else {
                    if (a != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = point.x;
                }
                i5 = i4;
                i3 = 0;
            } else {
                i3 = 0;
            }
            if (z2) {
                translateAnimation = new TranslateAnimation(i3, 0.0f, i5, 0.0f);
            } else if (!z2) {
                translateAnimation = new TranslateAnimation(0.0f, i3, 0.0f, i5);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            translateAnimation.setFillAfter(true);
            translateAnimation.setDuration(j);
            animationSet.addAnimation(translateAnimation);
            this.j = animationSet;
            animationSet.setAnimationListener(new AnimationAnimationListenerC0023f0(this, z2, identifier));
            this.e.clearAnimation();
            this.e.startAnimation(animationSet);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.onevcat.uniwebview.internal.obfuscated.h0$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    C0031h0.a(C0031h0.this, z2, identifier);
                }
            }, 1L);
        }
        return true;
    }

    public static final void a(C0031h0 this$0, boolean z2, String identifier) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(identifier, "$identifier");
        if (z2) {
            this$0.c.a(this$0.v.getName(), P2.ShowTransitionFinished, identifier);
        } else {
            this$0.e.setVisibility(4);
            this$0.c.a(this$0.v.getName(), P2.HideTransitionFinished, identifier);
        }
    }

    public final boolean a(int i, int i2, int i3, int i4, float f, float f2, String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        if (this.j != null) {
            C0058o c0058o = C0058o.b;
            c0058o.getClass();
            Intrinsics.checkNotNullParameter("Trying to animate web view but an other transition animation is not finished yet. Ignore this one.", "message");
            c0058o.a(EnumC0054n.CRITICAL, "Trying to animate web view but an other transition animation is not finished yet. Ignore this one.");
            return false;
        }
        float f3 = 1000;
        long j = (long) (f * f3);
        long j2 = (long) (f3 * f2);
        AnimationSet animationSet = new AnimationSet(false);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, i - this.e.getX(), 0.0f, i2 - this.e.getY());
        translateAnimation.setFillAfter(true);
        translateAnimation.setDuration(j);
        translateAnimation.setStartOffset(j2);
        animationSet.addAnimation(translateAnimation);
        E2 e2 = this.y;
        C0066q c0066q = new C0066q(e2, e2.getWidth(), i3, this.y.getHeight(), i4);
        c0066q.setFillAfter(true);
        c0066q.setDuration(j);
        c0066q.setStartOffset(j2);
        animationSet.addAnimation(c0066q);
        animationSet.setAnimationListener(new AnimationAnimationListenerC0019e0(this, i, i2, i3, i4, identifier));
        this.e.startAnimation(animationSet);
        return true;
    }

    public final Bitmap a(Rect rect) {
        if (rect == null) {
            rect = new Rect(0, 0, (int) (this.y.getScaleX() * this.y.getWidth()), (int) (this.y.getScaleY() * this.y.getHeight()));
        }
        Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(r.width(), … Bitmap.Config.ARGB_8888)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-rect.left, -rect.top);
        this.y.draw(canvas);
        return createBitmap;
    }

    public final void a(float f) {
        this.e.setAlpha(RangesKt.coerceIn(f, 0.0f, 1.0f));
    }

    public final void a(boolean z2) {
        A2 a2;
        if ((z2 || this.h) && (a2 = this.f) != null && a2.isShowing()) {
            C0058o c0058o = C0058o.b;
            c0058o.getClass();
            Intrinsics.checkNotNullParameter("Hide progress dialog.", "message");
            c0058o.a(EnumC0054n.VERBOSE, "Hide progress dialog.");
            A2 a22 = this.f;
            if (a22 != null) {
                a22.dismiss();
            }
        }
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.z2
    public final void a() {
        this.i = false;
        a(false);
        this.c.a(this.v.getName(), P2.WebContentProcessDidTerminate, "");
    }
}
