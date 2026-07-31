package com.mobilefuse.sdk.privacy;

import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.internal.bidding.Partner;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrivacyCenter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ\u001d\u0010\u000e\u001a\u00020\u00042\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0000¢\u0006\u0002\b\u0011J\u0018\u0010\u0012\u001a\u00020\u00042\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0007J\b\u0010\u0014\u001a\u00020\u0004H\u0007J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\nJ\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0004H\u0007J\u0016\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/mobilefuse/sdk/privacy/PrivacyCenter;", "", "()V", "VENDOR_DEFAULT_ENABLEMENT_VALUE", "", "isIfaLmtLimitsUserData", "isIfaLmtLimitsUserData$mobilefuse_sdk_core_release", "()Z", "vendorsEnableMap", "", "", "clearVendorsEnableMap", "", "clearVendorsEnableMap$mobilefuse_sdk_core_release", "isDntLimitsUserData", "factory", "Lkotlin/Function0;", "isDntLimitsUserData$mobilefuse_sdk_core_release", "isSdkLimitedToSendUserData", "dntFactory", "isSdkLimitedToSendUserDataJavaLegacy", "isVendorEnabled", "partner", "Lcom/mobilefuse/sdk/internal/bidding/Partner;", VastAttributes.VENDOR, "setVendorEnabled", "enabled", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes.dex */
public final class PrivacyCenter {
    public static final boolean VENDOR_DEFAULT_ENABLEMENT_VALUE = true;

    @NotNull
    public static final PrivacyCenter INSTANCE = new PrivacyCenter();
    private static final Map<String, Boolean> vendorsEnableMap = new LinkedHashMap();

    private PrivacyCenter() {
    }

    public final void clearVendorsEnableMap$mobilefuse_sdk_core_release() {
        vendorsEnableMap.clear();
    }

    @Deprecated
    public final void setVendorEnabled(@NotNull Partner partner, boolean enabled) {
        Intrinsics.checkNotNullParameter(partner, "partner");
        setVendorEnabled(partner.getVendorName(), enabled);
    }

    public final void setVendorEnabled(@NotNull String vendor, boolean enabled) {
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        vendorsEnableMap.put(vendor, Boolean.valueOf(enabled));
    }

    @Deprecated
    public final boolean isVendorEnabled(@NotNull Partner partner) {
        Intrinsics.checkNotNullParameter(partner, "partner");
        return isVendorEnabled(partner.getVendorName());
    }

    public final boolean isVendorEnabled(@NotNull String vendor) {
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Boolean bool = vendorsEnableMap.get(vendor);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final boolean isSdkLimitedToSendUserDataJavaLegacy() {
        return isSdkLimitedToSendUserData$default(null, 1, null);
    }

    public static /* synthetic */ boolean isSdkLimitedToSendUserData$default(Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = new PrivacyCenter$isSdkLimitedToSendUserData$1(INSTANCE);
        }
        return isSdkLimitedToSendUserData(function0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean isSdkLimitedToSendUserData(@NotNull Function0 dntFactory) {
        Either errorResult;
        Object value;
        PrivacyCenter privacyCenter;
        boolean z;
        Intrinsics.checkNotNullParameter(dntFactory, "dntFactory");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            privacyCenter = INSTANCE;
        } catch (Throwable th) {
            if (PrivacyCenter$isSdkLimitedToSendUserData$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (!privacyCenter.isIfaLmtLimitsUserData$mobilefuse_sdk_core_release() && !privacyCenter.isDntLimitsUserData$mobilefuse_sdk_core_release(dntFactory)) {
            z = false;
            errorResult = new SuccessResult(Boolean.valueOf(z));
            if (!(errorResult instanceof ErrorResult)) {
                value = Boolean.TRUE;
            } else {
                if (!(errorResult instanceof SuccessResult)) {
                    throw new NoWhenBranchMatchedException();
                }
                value = ((SuccessResult) errorResult).getValue();
            }
            return ((Boolean) value).booleanValue();
        }
        z = true;
        errorResult = new SuccessResult(Boolean.valueOf(z));
        if (!(errorResult instanceof ErrorResult)) {
        }
        return ((Boolean) value).booleanValue();
    }

    public final boolean isDntLimitsUserData$mobilefuse_sdk_core_release(@NotNull Function0 factory) {
        Either errorResult;
        Object value;
        Intrinsics.checkNotNullParameter(factory, "factory");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Boolean bool = (Boolean) factory.mo4828invoke();
            bool.booleanValue();
            errorResult = new SuccessResult(bool);
        } catch (Throwable th) {
            if (PrivacyCenter$isDntLimitsUserData$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            value = Boolean.TRUE;
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    public final boolean isIfaLmtLimitsUserData$mobilefuse_sdk_core_release() {
        Either errorResult;
        Object value;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            errorResult = new SuccessResult(Boolean.valueOf(PrivacyCenterKt.ifaLmtFactory(INSTANCE)));
        } catch (Throwable th) {
            if (PrivacyCenter$isIfaLmtLimitsUserData$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            value = Boolean.TRUE;
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    public static /* synthetic */ boolean isDntLimitsUserData$mobilefuse_sdk_core_release$default(PrivacyCenter privacyCenter, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = new PrivacyCenter$isDntLimitsUserData$1(privacyCenter);
        }
        return privacyCenter.isDntLimitsUserData$mobilefuse_sdk_core_release(function0);
    }
}
