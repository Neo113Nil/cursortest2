package com.unity3d.ads.core.data.model;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdRevenueAdFormat.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", "", "<init>", "(Ljava/lang/String;I)V", "BANNER", BrandSafetyUtils.o, "INTERSTITIAL", BrandSafetyUtils.k, "NATIVE", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AdRevenueAdFormat {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdRevenueAdFormat[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final AdRevenueAdFormat BANNER = new AdRevenueAdFormat("BANNER", 0);
    public static final AdRevenueAdFormat MREC = new AdRevenueAdFormat(BrandSafetyUtils.o, 1);
    public static final AdRevenueAdFormat INTERSTITIAL = new AdRevenueAdFormat("INTERSTITIAL", 2);
    public static final AdRevenueAdFormat REWARDED = new AdRevenueAdFormat(BrandSafetyUtils.k, 3);
    public static final AdRevenueAdFormat NATIVE = new AdRevenueAdFormat("NATIVE", 4);

    private static final /* synthetic */ AdRevenueAdFormat[] $values() {
        return new AdRevenueAdFormat[]{BANNER, MREC, INTERSTITIAL, REWARDED, NATIVE};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    private AdRevenueAdFormat(String str, int i) {
    }

    static {
        AdRevenueAdFormat[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: AdRevenueAdFormat.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat$Companion;", "", "<init>", "()V", "fromString", "Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", "value", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Nullable
        public final AdRevenueAdFormat fromString(@Nullable String value) {
            Object m8023constructorimpl;
            if (value == null) {
                return null;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                String upperCase = value.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                m8023constructorimpl = Result.m8023constructorimpl(AdRevenueAdFormat.valueOf(upperCase));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            return (AdRevenueAdFormat) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
        }
    }

    public static AdRevenueAdFormat valueOf(String str) {
        return (AdRevenueAdFormat) Enum.valueOf(AdRevenueAdFormat.class, str);
    }

    public static AdRevenueAdFormat[] values() {
        return (AdRevenueAdFormat[]) $VALUES.clone();
    }
}
