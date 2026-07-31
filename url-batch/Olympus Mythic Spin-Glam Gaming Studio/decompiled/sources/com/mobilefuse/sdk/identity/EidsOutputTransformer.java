package com.mobilefuse.sdk.identity;

import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.encoding.UriEncodeKt;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.ProcessingError;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.privacy.PrivacyCenter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: EidsOutputTransformer.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b0\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bH\u0002¢\u0006\u0004\b\f\u0010\rJC\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/mobilefuse/sdk/identity/EidsOutputTransformer;", "", "Lkotlin/Function1;", "", "", "isVendorEnabledFn", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "map", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/exception/BaseError;", "uriEncodeMap", "(Ljava/util/Map;)Lcom/mobilefuse/sdk/exception/Either;", "eidDataIdentifiers", "eidOverrides", "uriEncodeForBidRequest$mobilefuse_sdk_core_release", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "uriEncodeForBidRequest", "Lkotlin/jvm/functions/Function1;", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes4.dex */
public final class EidsOutputTransformer {
    private final Function1 isVendorEnabledFn;

    /* JADX WARN: Multi-variable type inference failed */
    public EidsOutputTransformer() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* compiled from: EidsOutputTransformer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p1", "", "invoke", "(Ljava/lang/String;)Z", "<anonymous>"}, k = 3, mv = {1, 4, 3})
    /* renamed from: com.mobilefuse.sdk.identity.EidsOutputTransformer$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1 {
        AnonymousClass1(PrivacyCenter privacyCenter) {
            super(1, privacyCenter, PrivacyCenter.class, "isVendorEnabled", "isVendorEnabled(Ljava/lang/String;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((String) obj));
        }

        public final boolean invoke(@NotNull String p1) {
            Intrinsics.checkNotNullParameter(p1, "p1");
            return ((PrivacyCenter) this.receiver).isVendorEnabled(p1);
        }
    }

    public EidsOutputTransformer(@NotNull Function1 isVendorEnabledFn) {
        Intrinsics.checkNotNullParameter(isVendorEnabledFn, "isVendorEnabledFn");
        this.isVendorEnabledFn = isVendorEnabledFn;
    }

    public /* synthetic */ EidsOutputTransformer(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AnonymousClass1(PrivacyCenter.INSTANCE) : function1);
    }

    private final Either<BaseError, Map<String, String>> uriEncodeMap(Map<String, String> map) {
        Either errorResult;
        Object value;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String uriEncode = UriEncodeKt.uriEncode((String) entry.getKey());
                Intrinsics.checkNotNullExpressionValue(uriEncode, "entry.key.uriEncode()");
                String uriEncode2 = UriEncodeKt.uriEncode((String) entry.getValue());
                Intrinsics.checkNotNullExpressionValue(uriEncode2, "entry.value.uriEncode()");
                linkedHashMap.put(uriEncode, uriEncode2);
            }
            errorResult = new SuccessResult(new SuccessResult(linkedHashMap));
        } catch (Throwable th) {
            if (EidsOutputTransformer$uriEncodeMap$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
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

    @NotNull
    public final Map<String, String> uriEncodeForBidRequest$mobilefuse_sdk_core_release(@NotNull Map<String, String> eidDataIdentifiers, @NotNull Map<String, String> eidOverrides) {
        Intrinsics.checkNotNullParameter(eidDataIdentifiers, "eidDataIdentifiers");
        Intrinsics.checkNotNullParameter(eidOverrides, "eidOverrides");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Set<String> plus = SetsKt.plus((Set) eidOverrides.keySet(), (Iterable) eidDataIdentifiers.keySet());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : plus) {
                String str2 = eidOverrides.get(str);
                if (str2 != null) {
                    linkedHashMap.put(str, str2);
                } else {
                    String str3 = eidDataIdentifiers.get(str);
                    if (str3 != null && ((Boolean) this.isVendorEnabledFn.invoke(str)).booleanValue()) {
                        linkedHashMap.put(str, str3);
                    }
                }
            }
            Either<BaseError, Map<String, String>> uriEncodeMap = uriEncodeMap(linkedHashMap);
            if (uriEncodeMap instanceof SuccessResult) {
                return (Map) ((SuccessResult) uriEncodeMap).getValue();
            }
            if (uriEncodeMap instanceof ErrorResult) {
                return MapsKt.emptyMap();
            }
            throw new NoWhenBranchMatchedException();
        } catch (Throwable th) {
            if (EidsOutputTransformer$uriEncodeForBidRequest$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            return MapsKt.emptyMap();
        }
    }
}
