package io.bidmachine.iab.bridge;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.sdk.controller.f;
import io.bidmachine.iab.mraid.MraidLog;
import io.bidmachine.iab.mraid.MraidUtils;
import io.bidmachine.iab.mraid.MraidWebView;
import io.bidmachine.iab.script.ScriptWrapper;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public class JsBridgeHandler {

    @NonNull
    public static final String SCRIPT_ID = "jsbridge";
    private static final List a = new CopyOnWriteArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a() {
        return "handleJsCommand not found";
    }

    public static boolean addBridge(@NonNull JsBridge jsBridge) {
        List list = a;
        return !list.contains(jsBridge) && list.add(jsBridge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b(String str) {
        return "handleJsCommand - " + str;
    }

    public static void handleJsCommand(@Nullable MraidWebView mraidWebView, @NonNull final String str) {
        Map<String, String> parseCommandUrl;
        MraidLog.d("JsBridgeHandler", new Function0() { // from class: io.bidmachine.iab.bridge.JsBridgeHandler$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                String b;
                b = JsBridgeHandler.b(str);
                return b;
            }
        });
        try {
            JsBridge a2 = a(str);
            if (a2 == null || (parseCommandUrl = MraidUtils.parseCommandUrl(str, a2.getJsValidator())) == null) {
                return;
            }
            String str2 = parseCommandUrl.get(f.b.g);
            if (str2 == null) {
                MraidLog.w("JsBridgeHandler", new Function0() { // from class: io.bidmachine.iab.bridge.JsBridgeHandler$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public final Object mo4828invoke() {
                        String a3;
                        a3 = JsBridgeHandler.a();
                        return a3;
                    }
                });
            } else {
                a2.runJsCommand(mraidWebView, str2, parseCommandUrl);
            }
        } catch (Throwable th) {
            MraidLog.e("JsBridgeHandler", th);
        }
    }

    public static boolean isHandled(@Nullable String str) {
        return a(str) != null;
    }

    @NonNull
    public static String obtainJs() {
        StringBuilder sb = new StringBuilder();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            sb.append(ScriptWrapper.wrap(((JsBridge) it.next()).getJs(new Object[0])));
        }
        return sb.toString();
    }

    public static boolean removeBridge(@NonNull JsBridge jsBridge) {
        List list = a;
        return list.contains(jsBridge) && list.remove(jsBridge);
    }

    private static JsBridge a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (JsBridge jsBridge : a) {
            if (jsBridge.isHandled(str)) {
                return jsBridge;
            }
        }
        return null;
    }
}
