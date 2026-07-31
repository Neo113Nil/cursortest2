package com.unity3d.ads.injection;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Factory.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/injection/Factory;", "T", "Lkotlin/Lazy;", "initializer", "Lkotlin/Function0;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Factory<T> implements Lazy {

    @NotNull
    private final Function0 initializer;

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return false;
    }

    public Factory(@NotNull Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        return (T) this.initializer.mo4828invoke();
    }
}
