package io.bidmachine.utils;

import io.bidmachine.iab.CacheControl;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.CreativeLoadingMethod;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/bidmachine/utils/IabUtils;", "", "()V", "DEFAULT_CACHE_CONTROL", "Lio/bidmachine/iab/CacheControl;", "toCacheControl", "value", "toIabElementStyle", "Lio/bidmachine/iab/utils/IabElementStyle;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class IabUtils {

    @NotNull
    public static final IabUtils INSTANCE = new IabUtils();

    @NotNull
    private static final CacheControl DEFAULT_CACHE_CONTROL = CacheControl.FullLoad;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CreativeLoadingMethod.values().length];
            try {
                iArr[CreativeLoadingMethod.Stream.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreativeLoadingMethod.PartialLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private IabUtils() {
    }

    @NotNull
    public final CacheControl toCacheControl(@Nullable Object value) {
        CreativeLoadingMethod valueOf;
        if (value == null) {
            return DEFAULT_CACHE_CONTROL;
        }
        if (value instanceof CacheControl) {
            return (CacheControl) value;
        }
        if (value instanceof CreativeLoadingMethod) {
            valueOf = (CreativeLoadingMethod) value;
        } else {
            if (value instanceof String) {
                try {
                    valueOf = CreativeLoadingMethod.valueOf((String) value);
                } catch (Throwable unused) {
                }
            }
            valueOf = null;
        }
        int i = valueOf == null ? -1 : WhenMappings.$EnumSwitchMapping$0[valueOf.ordinal()];
        return i != -1 ? i != 1 ? i != 2 ? DEFAULT_CACHE_CONTROL : CacheControl.PartialLoad : CacheControl.Stream : DEFAULT_CACHE_CONTROL;
    }

    @Nullable
    public final IabElementStyle toIabElementStyle(@Nullable Object value) {
        if (value instanceof AdExtension.ControlAsset) {
            return ProtoUtilsKt.toIabElementStyle((AdExtension.ControlAsset) value);
        }
        return null;
    }
}
