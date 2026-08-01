package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k.InterfaceC0185A;
import k.MenuC0202m;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0185A {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // k.InterfaceC0185A
    public final void c(MenuC0202m menuC0202m) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
