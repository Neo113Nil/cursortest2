package com.ironsource;

import android.app.Activity;
import android.content.Context;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class Df implements InterfaceC4567b4 {

    @Nullable
    private Activity a;

    @Nullable
    private Context b;

    @Override // com.ironsource.InterfaceC4567b4
    @Nullable
    public Activity a() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC4567b4
    @Nullable
    public Context b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4567b4
    public void a(@Nullable Activity activity) {
        this.a = activity;
    }

    @Override // com.ironsource.InterfaceC4567b4
    public void a(@Nullable Context context) {
        this.b = context;
    }
}
