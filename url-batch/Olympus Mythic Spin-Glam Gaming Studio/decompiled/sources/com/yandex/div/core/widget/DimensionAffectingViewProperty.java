package com.yandex.div.core.widget;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Views.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\"\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0096\u0002¢\u0006\u0002\u0010\rJ*\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0011R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00028\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/core/widget/DimensionAffectingViewProperty;", "T", "Lkotlin/properties/ReadWriteProperty;", "Landroid/view/View;", "propertyValue", "modifier", "Lkotlin/Function1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Ljava/lang/Object;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Landroid/view/View;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "value", "(Landroid/view/View;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
final class DimensionAffectingViewProperty<T> implements ReadWriteProperty {

    @Nullable
    private final Function1 modifier;
    private T propertyValue;

    public DimensionAffectingViewProperty(T t, @Nullable Function1 function1) {
        this.propertyValue = t;
        this.modifier = function1;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue((View) obj, (KProperty<?>) kProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.properties.ReadWriteProperty
    public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
        setValue((View) obj, (KProperty<?>) kProperty, (KProperty) obj2);
    }

    public T getValue(@NotNull View thisRef, @NotNull KProperty<?> property) {
        return this.propertyValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setValue(@NotNull View thisRef, @NotNull KProperty<?> property, T value) {
        Object invoke;
        Function1 function1 = this.modifier;
        if (function1 != null && (invoke = function1.invoke(value)) != 0) {
            value = invoke;
        }
        if (Intrinsics.areEqual(this.propertyValue, value)) {
            return;
        }
        this.propertyValue = value;
        thisRef.requestLayout();
    }
}
