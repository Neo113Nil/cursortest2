package com.ironsource;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class eh implements InterfaceC4567b4 {
    static final /* synthetic */ KProperty<Object>[] c = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(eh.class, "activity", "getActivity()Landroid/app/Activity;", 0))};

    @Nullable
    private Context a;

    @NotNull
    private final ReadWriteProperty b;

    public eh(@Nullable Activity activity, @Nullable Context context) {
        this.a = context;
        this.b = C4606d7.a(activity);
    }

    @Override // com.ironsource.InterfaceC4567b4
    public void a(@Nullable Context context) {
        this.a = context;
    }

    @Override // com.ironsource.InterfaceC4567b4
    @Nullable
    public Context b() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC4567b4
    @Nullable
    public Activity a() {
        return (Activity) this.b.getValue(this, c[0]);
    }

    @Override // com.ironsource.InterfaceC4567b4
    public void a(@Nullable Activity activity) {
        this.b.setValue(this, c[0], activity);
    }
}
