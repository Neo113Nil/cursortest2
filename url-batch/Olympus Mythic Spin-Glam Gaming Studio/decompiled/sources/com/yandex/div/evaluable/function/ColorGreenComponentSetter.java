package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* compiled from: ColorFunctions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/evaluable/function/ColorGreenComponentSetter;", "Lcom/yandex/div/evaluable/function/ColorComponentSetter;", "()V", "name", "", "getName", "()Ljava/lang/String;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ColorGreenComponentSetter extends ColorComponentSetter {

    @NotNull
    public static final ColorGreenComponentSetter INSTANCE = new ColorGreenComponentSetter();

    @NotNull
    private static final String name = "setColorGreen";

    private ColorGreenComponentSetter() {
        super(new Function2() { // from class: com.yandex.div.evaluable.function.ColorGreenComponentSetter.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return Color.m7324boximpl(m7287invokeGnj5c28(((Color) obj).m7332unboximpl(), ((Number) obj2).doubleValue()));
            }

            /* renamed from: invoke-Gnj5c28, reason: not valid java name */
            public final int m7287invokeGnj5c28(int i, double d) {
                return Color.INSTANCE.m7333argbH0kstlE(Color.m7322alphaimpl(i), Color.m7330redimpl(i), ColorFunctionsKt.toColorIntComponentValue(d), Color.m7323blueimpl(i));
            }
        });
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
