package yads;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes3.dex */
public final class yh2 {

    @NotNull
    public static final xh2 Companion;
    public static final Lazy b;
    public static final yh2 c;
    public static final yh2 d;
    public static final /* synthetic */ yh2[] e;

    static {
        yh2 yh2Var = new yh2(0, "SUCCESS");
        c = yh2Var;
        yh2 yh2Var2 = new yh2(1, "ERROR");
        d = yh2Var2;
        yh2[] yh2VarArr = {yh2Var, yh2Var2};
        e = yh2VarArr;
        EnumEntriesKt.enumEntries(yh2VarArr);
        Companion = new xh2();
        b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: yads.wh2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return EnumsKt.createAnnotatedEnumSerializer("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResultStatus", yh2.values(), new String[]{"success", "error"}, new Annotation[][]{null, null}, null);
            }
        });
    }

    public yh2(int i, String str) {
    }

    public static yh2 valueOf(String str) {
        return (yh2) Enum.valueOf(yh2.class, str);
    }

    public static yh2[] values() {
        return (yh2[]) e.clone();
    }
}
