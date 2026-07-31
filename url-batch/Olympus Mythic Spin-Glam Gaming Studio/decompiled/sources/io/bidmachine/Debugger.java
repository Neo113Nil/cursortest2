package io.bidmachine;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.ogury.core.internal.datastore.preferences.core.PreferencesSerializer;
import io.bidmachine.util.Utils;
import io.bidmachine.util.file.FileUtilsKt;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ8\u0010\u0015\u001a\u00020\u0006*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0012H\u0082\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0014\u0010 \u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0014\u0010!\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u0014\u0010\"\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0014\u0010#\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001cR\u0014\u0010$\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0014\u0010%\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u0014\u0010&\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u001cR\u0014\u0010'\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00100\u001a\u00020\u00138@X\u0081\u0004¢\u0006\f\u0012\u0004\b2\u0010\u0003\u001a\u0004\b0\u00101R\u001a\u00103\u001a\u00020\u00138@X\u0081\u0004¢\u0006\f\u0012\u0004\b4\u0010\u0003\u001a\u0004\b3\u00101¨\u00065"}, d2 = {"Lio/bidmachine/Debugger;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "setup", "(Landroid/content/Context;)V", "Ljava/io/File;", "targetFile", "checkGlobalSettings", "(Landroid/content/Context;Ljava/io/File;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lorg/json/JSONObject;", "jsonObject", "", "key", "Lkotlin/Function1;", "", "action", "applyAndLockIfExists", "(Ljava/util/concurrent/atomic/AtomicBoolean;Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", PreferencesSerializer.fileExtension, "setupFromJson$bidmachine_android_sdk_ba_3_7_1", "(Ljava/lang/String;)V", "setupFromJson", "TAG", "Ljava/lang/String;", "DIR_NAME", "FILE_NAME", "PARAMETER_LOGGING_ENABLED", "PARAMETER_TEST_MODE", "PARAMETER_ENDPOINT", "PARAMETER_COPPA", "PARAMETER_US_PRIVACY_STRING", "PARAMETER_SUBJECT_TO_GDPR", "PARAMETER_CONSENT", "PARAMETER_GDPR_STRING", "LOGGING_LOCK", "Ljava/util/concurrent/atomic/AtomicBoolean;", "TEST_MODE_LOCK", "Lkotlinx/coroutines/CoroutineScope;", "scope$delegate", "Lkotlin/Lazy;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope", "isLoggingLock", "()Z", "isLoggingLock$annotations", "isTestModeLock", "isTestModeLock$annotations", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class Debugger {

    @NotNull
    private static final String DIR_NAME = "features";

    @NotNull
    private static final String FILE_NAME = "DebugParameters.json";

    @NotNull
    private static final String PARAMETER_CONSENT = "consent";

    @NotNull
    private static final String PARAMETER_COPPA = "coppa";

    @NotNull
    private static final String PARAMETER_ENDPOINT = "endpoint";

    @NotNull
    private static final String PARAMETER_GDPR_STRING = "GDPRString";

    @NotNull
    private static final String PARAMETER_LOGGING_ENABLED = "loggingEnabled";

    @NotNull
    private static final String PARAMETER_SUBJECT_TO_GDPR = "subjectToGDPR";

    @NotNull
    private static final String PARAMETER_TEST_MODE = "testMode";

    @NotNull
    private static final String PARAMETER_US_PRIVACY_STRING = "usPrivacyString";

    @NotNull
    private static final String TAG = "Debugger";

    @NotNull
    public static final Debugger INSTANCE = new Debugger();

    @NotNull
    private static final AtomicBoolean LOGGING_LOCK = new AtomicBoolean(false);

    @NotNull
    private static final AtomicBoolean TEST_MODE_LOCK = new AtomicBoolean(false);

    /* renamed from: scope$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy scope = LazyKt.lazy(b.a);

    static final class a extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ Context b;
        final /* synthetic */ File c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, File file, Continuation continuation) {
            super(2, continuation);
            this.b = context;
            this.c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String string;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                string = Settings.Global.getString(this.b.getContentResolver(), "bmsdk_dfp");
            } catch (Throwable th) {
                Log.w(Debugger.TAG, th);
            }
            if (string == null) {
                return Unit.INSTANCE;
            }
            Log.d(Debugger.TAG, "Debug config found, restart the app to apply");
            File parentFile = this.c.getParentFile();
            if (parentFile != null) {
                Boxing.boxBoolean(parentFile.mkdirs());
            }
            FilesKt.writeText$default(this.c, string, null, 2, null);
            return Unit.INSTANCE;
        }
    }

    static final class b extends Lambda implements Function0 {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineScope mo4828invoke() {
            return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()));
        }
    }

    private Debugger() {
    }

    private final void checkGlobalSettings(Context context, File targetFile) {
        BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new a(context, targetFile, null), 3, null);
    }

    private final CoroutineScope getScope() {
        return (CoroutineScope) scope.getValue();
    }

    public static final boolean isLoggingLock() {
        return LOGGING_LOCK.get();
    }

    public static /* synthetic */ void isLoggingLock$annotations() {
    }

    public static final boolean isTestModeLock() {
        return TEST_MODE_LOCK.get();
    }

    public static /* synthetic */ void isTestModeLock$annotations() {
    }

    public static final void setup(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            File externalDir = FileUtilsKt.getExternalDir(context);
            if (externalDir == null) {
                return;
            }
            File file = new File(externalDir, "features/DebugParameters.json");
            if (!file.exists()) {
                INSTANCE.checkGlobalSettings(context, file);
            } else {
                Log.d(TAG, "Debug file found");
                INSTANCE.setupFromJson$bidmachine_android_sdk_ba_3_7_1(FileUtilsKt.readSafely(file));
            }
        } catch (Throwable th) {
            Log.w(TAG, th);
        }
    }

    @VisibleForTesting
    public final void setupFromJson$bidmachine_android_sdk_ba_3_7_1(@Nullable String json) {
        if (json == null || StringsKt.isBlank(json)) {
            return;
        }
        JSONObject jSONObject = new JSONObject(json);
        AtomicBoolean atomicBoolean = LOGGING_LOCK;
        if (jSONObject.has(PARAMETER_LOGGING_ENABLED)) {
            BidMachine.setLoggingEnabled(jSONObject.optBoolean(PARAMETER_LOGGING_ENABLED));
            atomicBoolean.set(true);
        }
        AtomicBoolean atomicBoolean2 = TEST_MODE_LOCK;
        if (jSONObject.has(PARAMETER_TEST_MODE)) {
            BidMachine.setTestMode(jSONObject.optBoolean(PARAMETER_TEST_MODE));
            atomicBoolean2.set(true);
        }
        if (jSONObject.has("endpoint")) {
            String optString = jSONObject.optString("endpoint");
            Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(PARAMETER_ENDPOINT)");
            String obj = StringsKt.trim(optString).toString();
            if (obj.length() > 0 && Utils.isHttpUrl(obj)) {
                BidMachine.setEndpoint(obj);
            }
        }
        if (jSONObject.has("coppa")) {
            BidMachine.setCoppa(Boolean.valueOf(jSONObject.optBoolean("coppa")));
        }
        if (jSONObject.has(PARAMETER_US_PRIVACY_STRING)) {
            BidMachine.setUSPrivacyString(jSONObject.optString(PARAMETER_US_PRIVACY_STRING));
        }
        if (jSONObject.has(PARAMETER_SUBJECT_TO_GDPR)) {
            BidMachine.setSubjectToGDPR(Boolean.valueOf(jSONObject.optBoolean(PARAMETER_SUBJECT_TO_GDPR)));
        }
        if (jSONObject.has("consent")) {
            BidMachine.setConsentConfig(jSONObject.optBoolean("consent"), jSONObject.has(PARAMETER_GDPR_STRING) ? jSONObject.optString(PARAMETER_GDPR_STRING) : null);
        }
    }

    private final void applyAndLockIfExists(AtomicBoolean atomicBoolean, JSONObject jSONObject, String str, Function1 function1) {
        if (jSONObject.has(str)) {
            function1.invoke(Boolean.valueOf(jSONObject.optBoolean(str)));
            atomicBoolean.set(true);
        }
    }
}
