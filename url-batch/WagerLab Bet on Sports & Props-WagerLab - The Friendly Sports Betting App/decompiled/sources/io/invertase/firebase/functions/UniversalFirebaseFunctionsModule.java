package io.invertase.firebase.functions;

import android.content.Context;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.functions.FirebaseFunctions;
import com.google.firebase.functions.HttpsCallableReference;
import com.google.firebase.functions.HttpsCallableResult;
import io.invertase.firebase.common.UniversalFirebaseModule;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class UniversalFirebaseFunctionsModule extends UniversalFirebaseModule {
    public static final String CODE_KEY = "code";
    public static final String DATA_KEY = "data";
    public static final String DETAILS_KEY = "details";
    public static final String MSG_KEY = "message";

    UniversalFirebaseFunctionsModule(Context context, String str) {
        super(context, str);
    }

    Task<Object> httpsCallable(final String str, final String str2, final String str3, final Integer num, final String str4, final Object obj, final ReadableMap readableMap) {
        return Tasks.call(getExecutor(), new Callable() { // from class: io.invertase.firebase.functions.UniversalFirebaseFunctionsModule$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UniversalFirebaseFunctionsModule.lambda$httpsCallable$0(str, str2, str4, readableMap, str3, num, obj);
            }
        });
    }

    static /* synthetic */ Object lambda$httpsCallable$0(String str, String str2, String str3, ReadableMap readableMap, String str4, Integer num, Object obj) throws Exception {
        FirebaseFunctions firebaseFunctions = FirebaseFunctions.getInstance(FirebaseApp.getInstance(str), str2);
        HttpsCallableReference httpsCallable = firebaseFunctions.getHttpsCallable(str3);
        if (readableMap.hasKey("timeout")) {
            httpsCallable.setTimeout(readableMap.getInt("timeout"), TimeUnit.SECONDS);
        }
        if (str4 != null) {
            firebaseFunctions.useEmulator(str4, num.intValue());
        }
        return ((HttpsCallableResult) Tasks.await(httpsCallable.call(obj))).getData();
    }

    Task<Object> httpsCallableFromUrl(final String str, final String str2, final String str3, final Integer num, final String str4, final Object obj, final ReadableMap readableMap) {
        return Tasks.call(getExecutor(), new Callable() { // from class: io.invertase.firebase.functions.UniversalFirebaseFunctionsModule$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UniversalFirebaseFunctionsModule.lambda$httpsCallableFromUrl$1(str, str2, str4, readableMap, str3, num, obj);
            }
        });
    }

    static /* synthetic */ Object lambda$httpsCallableFromUrl$1(String str, String str2, String str3, ReadableMap readableMap, String str4, Integer num, Object obj) throws Exception {
        FirebaseFunctions firebaseFunctions = FirebaseFunctions.getInstance(FirebaseApp.getInstance(str), str2);
        HttpsCallableReference httpsCallableFromUrl = firebaseFunctions.getHttpsCallableFromUrl(new URL(str3));
        if (readableMap.hasKey("timeout")) {
            httpsCallableFromUrl.setTimeout(readableMap.getInt("timeout"), TimeUnit.SECONDS);
        }
        if (str4 != null) {
            firebaseFunctions.useEmulator(str4, num.intValue());
        }
        return ((HttpsCallableResult) Tasks.await(httpsCallableFromUrl.call(obj))).getData();
    }
}
