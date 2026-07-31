package yads;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes13.dex */
public final class ii2 {

    @NotNull
    public static final hi2 Companion;
    public static final Lazy c;
    public static final /* synthetic */ ii2[] d;
    public static final /* synthetic */ EnumEntries e;
    public final String b;

    static {
        ii2[] ii2VarArr = {new ii2(0, "INTERSTITIAL", "interstitial"), new ii2(1, BrandSafetyUtils.k, "rewarded"), new ii2(2, "APP_OPEN", "appopen")};
        d = ii2VarArr;
        e = EnumEntriesKt.enumEntries(ii2VarArr);
        Companion = new hi2();
        c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: yads.gi2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return EnumsKt.createAnnotatedEnumSerializer("com.monetization.ads.core.configuration.model.PreloadFormat", ii2.values(), new String[]{"interstitial", "rewarded", "appopen"}, new Annotation[][]{null, null, null}, null);
            }
        });
    }

    public ii2(int i, String str, String str2) {
        this.b = str2;
    }

    public static ii2 valueOf(String str) {
        return (ii2) Enum.valueOf(ii2.class, str);
    }

    public static ii2[] values() {
        return (ii2[]) d.clone();
    }
}
