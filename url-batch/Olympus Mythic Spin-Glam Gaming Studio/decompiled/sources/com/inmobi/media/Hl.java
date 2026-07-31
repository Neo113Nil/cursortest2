package com.inmobi.media;

import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.sdk.InMobiSdk;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.SupervisorKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class Hl {
    public static final CoroutineScope a;
    public static final Regex b;
    public static final Set c;

    static {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        a = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(newSingleThreadExecutor).plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
        b = new Regex("com\\.inmobi\\.(adquality|ads|commons|compliance|constants|logging|media|sdk|signals|unification|unifiedId)");
        Method[] declaredMethods = PublisherCallbacks.class.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            arrayList.add(method.getName());
        }
        c = CollectionsKt.toSet(arrayList);
    }

    public static final String a(Thread thread, Throwable error) {
        String str;
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        try {
            StackTraceElement[] stackTrace = error.getStackTrace();
            Intrinsics.checkNotNull(stackTrace);
            boolean b2 = b(stackTrace);
            if (!b2) {
                str = "";
            } else if (stackTrace.length >= AbstractC3861aa.a().getCrashConfig().getMaxLengthOfStackTrace()) {
                str = "Did not append stackTrace to avoid potential ANR because of the large size of the stack trace";
            } else {
                StackTraceElement[] stackTrace2 = error.getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace2, "getStackTrace(...)");
                Intrinsics.checkNotNullParameter(stackTrace2, "<this>");
                StringBuilder sb = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTrace2) {
                    sb.append(stackTraceElement.toString());
                    sb.append('\n');
                }
                str = sb.toString();
                Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
            }
            jSONObject.put("name", error.getClass().getSimpleName());
            jSONObject.put("message", error.getMessage());
            jSONObject.put("stack", str);
            if (thread != null) {
                jSONObject.put("thread", thread.getName());
            }
            long currentTimeMillis = System.currentTimeMillis();
            AbstractC3861aa.a(jSONObject, b2, currentTimeMillis);
            CrashConfig crashConfig = AbstractC4420vf.a;
            AbstractC4420vf.a(jSONObject, error instanceof OutOfMemoryError, b2, currentTimeMillis);
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            return jSONObject2;
        } catch (OutOfMemoryError unused) {
            return "Did not append stackTrace to avoid potential ANR because of the large size of the stack trace";
        } catch (JSONException e) {
            e.toString();
            return "";
        }
    }

    public static final boolean b(StackTraceElement[] stackTraceElementArr) {
        Intrinsics.checkNotNullParameter(stackTraceElementArr, "<this>");
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length && !a(stackTraceElementArr[i], InMobiInterstitial.a.class.getSuperclass()) && !a(stackTraceElementArr[i], InMobiInterstitial.a.class) && !a(stackTraceElementArr[i], Uc.class) && !a(stackTraceElementArr[i], InMobiBanner.a.class) && !a(stackTraceElementArr[i], InMobiBanner.a.class.getSuperclass()) && (!Intrinsics.areEqual(stackTraceElementArr[i].getClassName(), InMobiSdk.class.getName()) || !Intrinsics.areEqual(stackTraceElementArr[i].getMethodName(), "fireListener")); i++) {
            String className = stackTraceElementArr[i].getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            String name = C3856a5.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.contains$default((CharSequence) className, (CharSequence) name, false, 2, (Object) null)) {
                break;
            }
            String className2 = stackTraceElementArr[i].getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
            if (b.containsMatchIn(className2)) {
                return true;
            }
        }
        return false;
    }

    public static final String a(String message, String trace) {
        Intrinsics.checkNotNullParameter("AppExitEvent", "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(trace, "trace");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "AppExitEvent");
            jSONObject.put("message", message);
            jSONObject.put("stack", trace);
        } catch (JSONException e) {
            e.toString();
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public static final String a(StackTraceElement[] stackTrace) {
        Intrinsics.checkNotNullParameter("Blocked", "name");
        Intrinsics.checkNotNullParameter("MainThreadBlocked", "message");
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "Blocked");
            jSONObject.put("message", "MainThreadBlocked");
            Intrinsics.checkNotNullParameter(stackTrace, "<this>");
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString());
                sb.append('\n');
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            jSONObject.put("stack", sb2);
        } catch (JSONException e) {
            e.toString();
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public static final boolean a(C3887ba c3887ba) {
        Intrinsics.checkNotNullParameter(c3887ba, "<this>");
        if (c3887ba instanceof C3882b5) {
            StackTraceElement[] stackTraceElementArr = ((C3882b5) c3887ba).g;
            if (stackTraceElementArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stackTrace");
                stackTraceElementArr = null;
            }
            return b(stackTraceElementArr);
        }
        if (c3887ba instanceof D1) {
            D1 d1 = (D1) c3887ba;
            if (d1.g != 6) {
                return false;
            }
            return b.containsMatchIn(d1.h);
        }
        if (c3887ba instanceof C4455wo) {
            return b(((C4455wo) c3887ba).g);
        }
        return false;
    }

    public static final boolean a(StackTraceElement stackTraceElement, Class cls) {
        Intrinsics.checkNotNullParameter(stackTraceElement, "<this>");
        return cls != null && Intrinsics.areEqual(stackTraceElement.getClassName(), cls.getName()) && c.contains(stackTraceElement.getMethodName());
    }

    public static final void a(Function1 runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        BuildersKt__Builders_commonKt.launch$default(a, null, null, new Dl(runnable, null), 3, null);
    }
}
