package com.mobilefuse.sdk.identity;

import androidx.annotation.VisibleForTesting;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.crypto.Aes_encryptionKt;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.ProcessingError;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.network.client.HttpBinaryPostBody;
import com.mobilefuse.sdk.network.client.HttpJsonPostBody;
import com.mobilefuse.sdk.network.client.HttpPostBody;
import com.ogury.core.internal.datastore.preferences.core.PreferencesSerializer;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: EidRequestBuilder.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ,2\u00020\u0001:\u0001,B\u008d\u0001\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u000eJ\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0017\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0002\b#J!\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020%0\u001b2\u0006\u0010&\u001a\u00020!H\u0001¢\u0006\u0002\b'J!\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020%0\u001b2\u0006\u0010&\u001a\u00020!H\u0001¢\u0006\u0002\b)J)\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020%0\u001b2\u0006\u0010&\u001a\u00020!2\u0006\u0010\r\u001a\u00020\bH\u0001¢\u0006\u0002\b+R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006-"}, d2 = {"Lcom/mobilefuse/sdk/identity/EidRequestBuilder;", "", "userEmailFactory", "Lkotlin/Function0;", "", "userPhoneFactory", "ifaFactory", "lmtFactory", "", "gppFactory", "usPrivacyFactory", "appBundleFactory", "appVersionFactory", "encryptRequest", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "getAppBundleFactory", "()Lkotlin/jvm/functions/Function0;", "getAppVersionFactory", "getEncryptRequest", "()Z", "getGppFactory", "getIfaFactory", "getLmtFactory", "getUsPrivacyFactory", "getUserEmailFactory", "getUserPhoneFactory", "buildRequest", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/exception/BaseError;", "Lcom/mobilefuse/sdk/identity/EidUpdateRequest;", "eidData", "Lcom/mobilefuse/sdk/identity/EidSdkData;", "buildRequestJson", "Lorg/json/JSONObject;", "mfxPayload", "buildRequestJson$mobilefuse_sdk_core_release", "createEncryptedRequestBody", "Lcom/mobilefuse/sdk/network/client/HttpPostBody;", PreferencesSerializer.fileExtension, "createEncryptedRequestBody$mobilefuse_sdk_core_release", "createJsonRequestBody", "createJsonRequestBody$mobilefuse_sdk_core_release", "createRequestBody", "createRequestBody$mobilefuse_sdk_core_release", "Companion", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes3.dex */
public final class EidRequestBuilder {

    @NotNull
    public static final String ENCRYPTION_IV = "S_K6v=qF7/e1-.D8";

    @NotNull
    public static final String ENCRYPTION_KEY = "M^oW_6IL-5o}tA2Q";

    @NotNull
    public static final String REQUEST_FIELD_APP_BUNDLE = "b";

    @NotNull
    public static final String REQUEST_FIELD_APP_VERSION = "av";

    @NotNull
    public static final String REQUEST_FIELD_EMAIL = "e";

    @NotNull
    public static final String REQUEST_FIELD_GPP = "gpp";

    @NotNull
    public static final String REQUEST_FIELD_IFA = "ifa";

    @NotNull
    public static final String REQUEST_FIELD_LMT = "lmt";

    @NotNull
    public static final String REQUEST_FIELD_OS = "os";

    @NotNull
    public static final String REQUEST_FIELD_PHONE_NUMBER = "p";

    @NotNull
    public static final String REQUEST_FIELD_US_PRIVACY = "usp";

    @NotNull
    private final Function0 appBundleFactory;

    @NotNull
    private final Function0 appVersionFactory;
    private final boolean encryptRequest;

    @NotNull
    private final Function0 gppFactory;

    @NotNull
    private final Function0 ifaFactory;

    @NotNull
    private final Function0 lmtFactory;

    @NotNull
    private final Function0 usPrivacyFactory;

    @NotNull
    private final Function0 userEmailFactory;

    @NotNull
    private final Function0 userPhoneFactory;

    public EidRequestBuilder(@NotNull Function0 userEmailFactory, @NotNull Function0 userPhoneFactory, @NotNull Function0 ifaFactory, @NotNull Function0 lmtFactory, @NotNull Function0 gppFactory, @NotNull Function0 usPrivacyFactory, @NotNull Function0 appBundleFactory, @NotNull Function0 appVersionFactory, boolean z) {
        Intrinsics.checkNotNullParameter(userEmailFactory, "userEmailFactory");
        Intrinsics.checkNotNullParameter(userPhoneFactory, "userPhoneFactory");
        Intrinsics.checkNotNullParameter(ifaFactory, "ifaFactory");
        Intrinsics.checkNotNullParameter(lmtFactory, "lmtFactory");
        Intrinsics.checkNotNullParameter(gppFactory, "gppFactory");
        Intrinsics.checkNotNullParameter(usPrivacyFactory, "usPrivacyFactory");
        Intrinsics.checkNotNullParameter(appBundleFactory, "appBundleFactory");
        Intrinsics.checkNotNullParameter(appVersionFactory, "appVersionFactory");
        this.userEmailFactory = userEmailFactory;
        this.userPhoneFactory = userPhoneFactory;
        this.ifaFactory = ifaFactory;
        this.lmtFactory = lmtFactory;
        this.gppFactory = gppFactory;
        this.usPrivacyFactory = usPrivacyFactory;
        this.appBundleFactory = appBundleFactory;
        this.appVersionFactory = appVersionFactory;
        this.encryptRequest = z;
    }

    @NotNull
    public final Function0 getUserEmailFactory() {
        return this.userEmailFactory;
    }

    @NotNull
    public final Function0 getUserPhoneFactory() {
        return this.userPhoneFactory;
    }

    @NotNull
    public final Function0 getIfaFactory() {
        return this.ifaFactory;
    }

    @NotNull
    public final Function0 getLmtFactory() {
        return this.lmtFactory;
    }

    @NotNull
    public final Function0 getGppFactory() {
        return this.gppFactory;
    }

    @NotNull
    public final Function0 getUsPrivacyFactory() {
        return this.usPrivacyFactory;
    }

    @NotNull
    public final Function0 getAppBundleFactory() {
        return this.appBundleFactory;
    }

    @NotNull
    public final Function0 getAppVersionFactory() {
        return this.appVersionFactory;
    }

    public /* synthetic */ EidRequestBuilder(Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Function0 function08, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function02, function03, function04, function05, function06, function07, function08, (i & 256) != 0 ? true : z);
    }

    public final boolean getEncryptRequest() {
        return this.encryptRequest;
    }

    @NotNull
    public final Either<BaseError, EidUpdateRequest> buildRequest(@NotNull EidSdkData eidData) {
        Either errorResult;
        Object value;
        Intrinsics.checkNotNullParameter(eidData, "eidData");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            JSONObject buildRequestJson$mobilefuse_sdk_core_release = buildRequestJson$mobilefuse_sdk_core_release(eidData.getMfxPayload());
            Either<BaseError, HttpPostBody> createRequestBody$mobilefuse_sdk_core_release = createRequestBody$mobilefuse_sdk_core_release(buildRequestJson$mobilefuse_sdk_core_release, this.encryptRequest);
            if (createRequestBody$mobilefuse_sdk_core_release instanceof SuccessResult) {
                HttpPostBody httpPostBody = (HttpPostBody) ((SuccessResult) createRequestBody$mobilefuse_sdk_core_release).getValue();
                String jSONObject = buildRequestJson$mobilefuse_sdk_core_release.getJSONObject(POBConstants.KEY_USER).toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject, "json.getJSONObject(\"user\").toString()");
                createRequestBody$mobilefuse_sdk_core_release = new SuccessResult(new EidUpdateRequest(eidData, httpPostBody, jSONObject));
            } else if (!(createRequestBody$mobilefuse_sdk_core_release instanceof ErrorResult)) {
                throw new NoWhenBranchMatchedException();
            }
            errorResult = new SuccessResult(createRequestBody$mobilefuse_sdk_core_release);
        } catch (Throwable th) {
            if (EidRequestBuilder$buildRequest$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            value = new ErrorResult(new ProcessingError(((Throwable) ((ErrorResult) errorResult).getValue()).getMessage()));
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return (Either) value;
    }

    @VisibleForTesting
    @NotNull
    public final Either<BaseError, HttpPostBody> createEncryptedRequestBody$mobilefuse_sdk_core_release(@NotNull JSONObject json) {
        Either errorResult;
        Object value;
        Intrinsics.checkNotNullParameter(json, "json");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            String jSONObject = json.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "json.toString()");
            Either<BaseError, byte[]> encryptAes = Aes_encryptionKt.encryptAes(jSONObject, ENCRYPTION_KEY, ENCRYPTION_IV);
            if (encryptAes instanceof SuccessResult) {
                encryptAes = new SuccessResult(new HttpBinaryPostBody((byte[]) ((SuccessResult) encryptAes).getValue(), MapsKt.mapOf(TuplesKt.to("Content-Encoding", "enc"))));
            } else if (!(encryptAes instanceof ErrorResult)) {
                throw new NoWhenBranchMatchedException();
            }
            errorResult = new SuccessResult(encryptAes);
        } catch (Throwable th) {
            if (EidRequestBuilder$createEncryptedRequestBody$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (!(errorResult instanceof ErrorResult)) {
            if (!(errorResult instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            value = ((SuccessResult) errorResult).getValue();
        } else {
            value = new ErrorResult(new ProcessingError(((Throwable) ((ErrorResult) errorResult).getValue()).getMessage()));
        }
        return (Either) value;
    }

    @VisibleForTesting
    @NotNull
    public final Either<BaseError, HttpPostBody> createJsonRequestBody$mobilefuse_sdk_core_release(@NotNull JSONObject json) {
        Either errorResult;
        Object value;
        Intrinsics.checkNotNullParameter(json, "json");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            String jSONObject = json.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "json.toString()");
            errorResult = new SuccessResult(new SuccessResult(new HttpJsonPostBody(jSONObject)));
        } catch (Throwable th) {
            if (EidRequestBuilder$createJsonRequestBody$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (!(errorResult instanceof ErrorResult)) {
            if (!(errorResult instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            value = ((SuccessResult) errorResult).getValue();
        } else {
            value = new ErrorResult(new ProcessingError(((Throwable) ((ErrorResult) errorResult).getValue()).getMessage()));
        }
        return (Either) value;
    }

    @VisibleForTesting
    @NotNull
    public final Either<BaseError, HttpPostBody> createRequestBody$mobilefuse_sdk_core_release(@NotNull JSONObject json, boolean encryptRequest) {
        Either errorResult;
        Object value;
        Either<BaseError, HttpPostBody> createJsonRequestBody$mobilefuse_sdk_core_release;
        Intrinsics.checkNotNullParameter(json, "json");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (encryptRequest) {
                createJsonRequestBody$mobilefuse_sdk_core_release = createEncryptedRequestBody$mobilefuse_sdk_core_release(json);
            } else {
                createJsonRequestBody$mobilefuse_sdk_core_release = createJsonRequestBody$mobilefuse_sdk_core_release(json);
            }
            errorResult = new SuccessResult(createJsonRequestBody$mobilefuse_sdk_core_release);
        } catch (Throwable th) {
            if (EidRequestBuilder$createRequestBody$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (!(errorResult instanceof ErrorResult)) {
            if (!(errorResult instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            value = ((SuccessResult) errorResult).getValue();
        } else {
            value = new ErrorResult(new ProcessingError(((Throwable) ((ErrorResult) errorResult).getValue()).getMessage()));
        }
        return (Either) value;
    }

    @VisibleForTesting
    @NotNull
    public final JSONObject buildRequestJson$mobilefuse_sdk_core_release(@Nullable String mfxPayload) {
        JSONObject jSONObject = new JSONObject();
        if (mfxPayload != null) {
            jSONObject.put("mfx", new JSONObject(mfxPayload));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = (String) this.userEmailFactory.mo4828invoke();
        if (str != null) {
            Pair pair = TuplesKt.to(REQUEST_FIELD_EMAIL, str);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        String str2 = (String) this.userPhoneFactory.mo4828invoke();
        if (str2 != null) {
            Pair pair2 = TuplesKt.to("p", str2);
            linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
        }
        String str3 = (String) this.ifaFactory.mo4828invoke();
        if (str3 != null) {
            Pair pair3 = TuplesKt.to("ifa", str3);
            linkedHashMap.put(pair3.getFirst(), pair3.getSecond());
        }
        String str4 = (String) this.gppFactory.mo4828invoke();
        if (str4 != null) {
            Pair pair4 = TuplesKt.to("gpp", str4);
            linkedHashMap.put(pair4.getFirst(), pair4.getSecond());
        }
        String str5 = (String) this.usPrivacyFactory.mo4828invoke();
        if (str5 != null) {
            Pair pair5 = TuplesKt.to(REQUEST_FIELD_US_PRIVACY, str5);
            linkedHashMap.put(pair5.getFirst(), pair5.getSecond());
        }
        String str6 = (String) this.appBundleFactory.mo4828invoke();
        if (str6 != null) {
            Pair pair6 = TuplesKt.to("b", str6);
            linkedHashMap.put(pair6.getFirst(), pair6.getSecond());
        }
        String str7 = (String) this.appVersionFactory.mo4828invoke();
        if (str7 != null) {
            Pair pair7 = TuplesKt.to("av", str7);
            linkedHashMap.put(pair7.getFirst(), pair7.getSecond());
        }
        Pair pair8 = TuplesKt.to("lmt", Integer.valueOf(((Boolean) this.lmtFactory.mo4828invoke()).booleanValue() ? 1 : 0));
        linkedHashMap.put(pair8.getFirst(), pair8.getSecond());
        Pair pair9 = TuplesKt.to("os", "android");
        linkedHashMap.put(pair9.getFirst(), pair9.getSecond());
        jSONObject.put(POBConstants.KEY_USER, new JSONObject(linkedHashMap));
        return jSONObject;
    }
}
