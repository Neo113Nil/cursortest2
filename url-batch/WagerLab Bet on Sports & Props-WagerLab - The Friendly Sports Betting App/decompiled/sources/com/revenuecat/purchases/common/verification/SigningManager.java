package com.revenuecat.purchases.common.verification;

import android.util.Base64;
import com.amazon.a.a.o.b.f;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.Result;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* compiled from: SigningManager.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\u0007J,\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000e2\u001a\u0010\u000f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0011\u0018\u00010\u0010J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eJJ\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SigningManager;", "", "signatureVerificationMode", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "appConfig", "Lcom/revenuecat/purchases/common/AppConfig;", "apiKey", "", "(Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;Lcom/revenuecat/purchases/common/AppConfig;Ljava/lang/String;)V", "getSignatureVerificationMode", "()Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "createRandomNonce", "getPostParamsForSigningHeaderIfNeeded", "endpoint", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "postFieldsToSign", "", "Lkotlin/Pair;", "shouldVerifyEndpoint", "", "verifyResponse", "Lcom/revenuecat/purchases/VerificationResult;", "urlPath", "signatureString", "nonce", "body", "requestTime", "eTag", "postFieldsToSignHeader", "Companion", "Parameters", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SigningManager {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int NONCE_BYTES_SIZE = 12;

    @Deprecated
    public static final String POST_PARAMS_ALGORITHM = "sha256";

    @Deprecated
    public static final byte POST_PARAMS_SEPARATOR = 0;
    private final String apiKey;
    private final AppConfig appConfig;
    private final SignatureVerificationMode signatureVerificationMode;

    public SigningManager(SignatureVerificationMode signatureVerificationMode, AppConfig appConfig, String apiKey) {
        Intrinsics.checkNotNullParameter(signatureVerificationMode, "signatureVerificationMode");
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.signatureVerificationMode = signatureVerificationMode;
        this.appConfig = appConfig;
        this.apiKey = apiKey;
    }

    public final SignatureVerificationMode getSignatureVerificationMode() {
        return this.signatureVerificationMode;
    }

    /* compiled from: SigningManager.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SigningManager$Companion;", "", "()V", "NONCE_BYTES_SIZE", "", "POST_PARAMS_ALGORITHM", "", "POST_PARAMS_SEPARATOR", "", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: SigningManager.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003Ja\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\u0006\u0010%\u001a\u00020\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SigningManager$Parameters;", "", "salt", "", "apiKey", "", "nonce", "urlPath", "postParamsHashHeader", "requestTime", "eTag", "body", "([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiKey", "()Ljava/lang/String;", "getBody", "getETag", "getNonce", "getPostParamsHashHeader", "getRequestTime", "getSalt", "()[B", "getUrlPath", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toSignatureToVerify", InAppPurchaseConstants.METHOD_TO_STRING, "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class Parameters {
        private final String apiKey;
        private final String body;
        private final String eTag;
        private final String nonce;
        private final String postParamsHashHeader;
        private final String requestTime;
        private final byte[] salt;
        private final String urlPath;

        public static /* synthetic */ Parameters copy$default(Parameters parameters, byte[] bArr, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                bArr = parameters.salt;
            }
            if ((i & 2) != 0) {
                str = parameters.apiKey;
            }
            if ((i & 4) != 0) {
                str2 = parameters.nonce;
            }
            if ((i & 8) != 0) {
                str3 = parameters.urlPath;
            }
            if ((i & 16) != 0) {
                str4 = parameters.postParamsHashHeader;
            }
            if ((i & 32) != 0) {
                str5 = parameters.requestTime;
            }
            if ((i & 64) != 0) {
                str6 = parameters.eTag;
            }
            if ((i & 128) != 0) {
                str7 = parameters.body;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str4;
            String str11 = str5;
            return parameters.copy(bArr, str, str2, str3, str10, str11, str8, str9);
        }

        /* renamed from: component1, reason: from getter */
        public final byte[] getSalt() {
            return this.salt;
        }

        /* renamed from: component2, reason: from getter */
        public final String getApiKey() {
            return this.apiKey;
        }

        /* renamed from: component3, reason: from getter */
        public final String getNonce() {
            return this.nonce;
        }

        /* renamed from: component4, reason: from getter */
        public final String getUrlPath() {
            return this.urlPath;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPostParamsHashHeader() {
            return this.postParamsHashHeader;
        }

        /* renamed from: component6, reason: from getter */
        public final String getRequestTime() {
            return this.requestTime;
        }

        /* renamed from: component7, reason: from getter */
        public final String getETag() {
            return this.eTag;
        }

        /* renamed from: component8, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        public final Parameters copy(byte[] salt, String apiKey, String nonce, String urlPath, String postParamsHashHeader, String requestTime, String eTag, String body) {
            Intrinsics.checkNotNullParameter(salt, "salt");
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            Intrinsics.checkNotNullParameter(urlPath, "urlPath");
            Intrinsics.checkNotNullParameter(requestTime, "requestTime");
            return new Parameters(salt, apiKey, nonce, urlPath, postParamsHashHeader, requestTime, eTag, body);
        }

        public String toString() {
            return "Parameters(salt=" + Arrays.toString(this.salt) + ", apiKey=" + this.apiKey + ", nonce=" + this.nonce + ", urlPath=" + this.urlPath + ", postParamsHashHeader=" + this.postParamsHashHeader + ", requestTime=" + this.requestTime + ", eTag=" + this.eTag + ", body=" + this.body + ')';
        }

        public Parameters(byte[] salt, String apiKey, String str, String urlPath, String str2, String requestTime, String str3, String str4) {
            Intrinsics.checkNotNullParameter(salt, "salt");
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            Intrinsics.checkNotNullParameter(urlPath, "urlPath");
            Intrinsics.checkNotNullParameter(requestTime, "requestTime");
            this.salt = salt;
            this.apiKey = apiKey;
            this.nonce = str;
            this.urlPath = urlPath;
            this.postParamsHashHeader = str2;
            this.requestTime = requestTime;
            this.eTag = str3;
            this.body = str4;
        }

        public final byte[] getSalt() {
            return this.salt;
        }

        public final String getApiKey() {
            return this.apiKey;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public final String getUrlPath() {
            return this.urlPath;
        }

        public final String getPostParamsHashHeader() {
            return this.postParamsHashHeader;
        }

        public final String getRequestTime() {
            return this.requestTime;
        }

        public final String getETag() {
            return this.eTag;
        }

        public final String getBody() {
            return this.body;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.revenuecat.purchases.common.verification.SigningManager.Parameters");
            Parameters parameters = (Parameters) other;
            return Arrays.equals(this.salt, parameters.salt) && Intrinsics.areEqual(this.apiKey, parameters.apiKey) && Intrinsics.areEqual(this.nonce, parameters.nonce) && Intrinsics.areEqual(this.urlPath, parameters.urlPath) && Intrinsics.areEqual(this.postParamsHashHeader, parameters.postParamsHashHeader) && Intrinsics.areEqual(this.requestTime, parameters.requestTime) && Intrinsics.areEqual(this.eTag, parameters.eTag) && Intrinsics.areEqual(this.body, parameters.body);
        }

        public int hashCode() {
            int hashCode = ((Arrays.hashCode(this.salt) * 31) + this.apiKey.hashCode()) * 31;
            String str = this.nonce;
            int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.urlPath.hashCode()) * 31;
            String str2 = this.postParamsHashHeader;
            int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.requestTime.hashCode()) * 31;
            String str3 = this.eTag;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.body;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
        
            if (r1 == null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
        
            if (r1 == null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
        
            if (r1 == null) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final byte[] toSignatureToVerify() {
            byte[] bArr;
            byte[] bArr2;
            byte[] bArr3;
            byte[] bArr4 = this.salt;
            byte[] bytes = this.apiKey.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] plus = ArraysKt.plus(bArr4, bytes);
            String str = this.nonce;
            byte[] decode = str != null ? Base64.decode(str, 0) : null;
            if (decode == null) {
                decode = new byte[0];
            }
            byte[] plus2 = ArraysKt.plus(plus, decode);
            byte[] bytes2 = this.urlPath.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            byte[] plus3 = ArraysKt.plus(plus2, bytes2);
            String str2 = this.postParamsHashHeader;
            if (str2 != null) {
                bArr = str2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bArr, "getBytes(...)");
            }
            bArr = new byte[0];
            byte[] plus4 = ArraysKt.plus(plus3, bArr);
            byte[] bytes3 = this.requestTime.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes3, "getBytes(...)");
            byte[] plus5 = ArraysKt.plus(plus4, bytes3);
            String str3 = this.eTag;
            if (str3 != null) {
                bArr2 = str3.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bArr2, "getBytes(...)");
            }
            bArr2 = new byte[0];
            byte[] plus6 = ArraysKt.plus(plus5, bArr2);
            String str4 = this.body;
            if (str4 != null) {
                bArr3 = str4.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bArr3, "getBytes(...)");
            }
            bArr3 = new byte[0];
            return ArraysKt.plus(plus6, bArr3);
        }
    }

    public final boolean shouldVerifyEndpoint(Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        return endpoint.getSupportsSignatureVerification() && this.signatureVerificationMode.getShouldVerify();
    }

    public final String createRandomNonce() {
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        byte[] encode = Base64.encode(bArr, 0);
        Intrinsics.checkNotNullExpressionValue(encode, "encode(bytes, Base64.DEFAULT)");
        return StringsKt.trim((CharSequence) new String(encode, Charsets.UTF_8)).toString();
    }

    public final String getPostParamsForSigningHeaderIfNeeded(Endpoint endpoint, List<Pair<String, String>> postFieldsToSign) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        List<Pair<String, String>> list = postFieldsToSign;
        if (list == null || list.isEmpty() || !shouldVerifyEndpoint(endpoint)) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
        List<Pair<String, String>> list2 = postFieldsToSign;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Pair pair = (Pair) obj;
            if (i > 0) {
                messageDigest.update((byte) 0);
            }
            byte[] bytes = ((String) pair.getSecond()).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            messageDigest.update(bytes);
            arrayList.add(Unit.INSTANCE);
            i = i2;
        }
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digest, "sha256Digest.digest()");
        String str = "";
        for (byte b : digest) {
            StringBuilder append = new StringBuilder().append(str);
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            str = append.append(format).toString();
        }
        return CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{CollectionsKt.joinToString$default(list2, f.f598a, null, null, 0, null, new Function1<Pair<? extends String, ? extends String>, CharSequence>() { // from class: com.revenuecat.purchases.common.verification.SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final CharSequence invoke2(Pair<String, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getFirst();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Pair<? extends String, ? extends String> pair2) {
                return invoke2((Pair<String, String>) pair2);
            }
        }, 30, null), POST_PARAMS_ALGORITHM, str}), Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, null, null, 0, null, null, 62, null);
    }

    public final VerificationResult verifyResponse(String urlPath, String signatureString, String nonce, String body, String requestTime, String eTag, String postFieldsToSignHeader) {
        Intrinsics.checkNotNullParameter(urlPath, "urlPath");
        if (!this.appConfig.getForceSigningErrors()) {
            IntermediateSignatureHelper intermediateSignatureHelper = this.signatureVerificationMode.getIntermediateSignatureHelper();
            if (intermediateSignatureHelper == null) {
                return VerificationResult.NOT_REQUESTED;
            }
            if (signatureString == null) {
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                String format = String.format(NetworkStrings.VERIFICATION_MISSING_SIGNATURE, Arrays.copyOf(new Object[]{urlPath}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                currentLogHandler.e("[Purchases] - ERROR", format, null);
                return VerificationResult.FAILED;
            }
            if (requestTime == null) {
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                String format2 = String.format(NetworkStrings.VERIFICATION_MISSING_REQUEST_TIME, Arrays.copyOf(new Object[]{urlPath}, 1));
                Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                currentLogHandler2.e("[Purchases] - ERROR", format2, null);
                return VerificationResult.FAILED;
            }
            if (body != null || eTag != null) {
                try {
                    Signature fromString$purchases_defaultsBc8Release = Signature.INSTANCE.fromString$purchases_defaultsBc8Release(signatureString);
                    Result<SignatureVerifier, PurchasesError> createIntermediateKeyVerifierIfVerified = intermediateSignatureHelper.createIntermediateKeyVerifierIfVerified(fromString$purchases_defaultsBc8Release);
                    if (!(createIntermediateKeyVerifierIfVerified instanceof Result.Error)) {
                        if (createIntermediateKeyVerifierIfVerified instanceof Result.Success) {
                            if (((SignatureVerifier) ((Result.Success) createIntermediateKeyVerifierIfVerified).getValue()).verify(fromString$purchases_defaultsBc8Release.getPayload(), new Parameters(fromString$purchases_defaultsBc8Release.getSalt(), this.apiKey, nonce, urlPath, postFieldsToSignHeader, requestTime, eTag, body).toSignatureToVerify())) {
                                LogLevel logLevel = LogLevel.VERBOSE;
                                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                    String str = "[Purchases] - " + logLevel.name();
                                    String format3 = String.format(NetworkStrings.VERIFICATION_SUCCESS, Arrays.copyOf(new Object[]{urlPath}, 1));
                                    Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
                                    currentLogHandler3.v(str, format3);
                                }
                                return VerificationResult.VERIFIED;
                            }
                            LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                            String format4 = String.format(NetworkStrings.VERIFICATION_ERROR, Arrays.copyOf(new Object[]{urlPath}, 1));
                            Intrinsics.checkNotNullExpressionValue(format4, "format(...)");
                            currentLogHandler4.e("[Purchases] - ERROR", format4, null);
                            return VerificationResult.FAILED;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    String format5 = String.format(NetworkStrings.VERIFICATION_INTERMEDIATE_KEY_FAILED, Arrays.copyOf(new Object[]{urlPath, ((PurchasesError) ((Result.Error) createIntermediateKeyVerifierIfVerified).getValue()).getUnderlyingErrorMessage()}, 2));
                    Intrinsics.checkNotNullExpressionValue(format5, "format(...)");
                    currentLogHandler5.e("[Purchases] - ERROR", format5, null);
                    return VerificationResult.FAILED;
                } catch (InvalidSignatureSizeException e) {
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    String format6 = String.format(NetworkStrings.VERIFICATION_INVALID_SIZE, Arrays.copyOf(new Object[]{urlPath, e.getMessage()}, 2));
                    Intrinsics.checkNotNullExpressionValue(format6, "format(...)");
                    currentLogHandler6.e("[Purchases] - ERROR", format6, null);
                    return VerificationResult.FAILED;
                }
            }
            LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
            String format7 = String.format(NetworkStrings.VERIFICATION_MISSING_BODY_OR_ETAG, Arrays.copyOf(new Object[]{urlPath}, 1));
            Intrinsics.checkNotNullExpressionValue(format7, "format(...)");
            currentLogHandler7.e("[Purchases] - ERROR", format7, null);
            return VerificationResult.FAILED;
        }
        LogLevel logLevel2 = LogLevel.WARN;
        LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
            currentLogHandler8.w("[Purchases] - " + logLevel2.name(), "Forcing signing error for request with path: " + urlPath);
        }
        return VerificationResult.FAILED;
    }
}
