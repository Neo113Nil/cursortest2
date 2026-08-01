package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k.InterfaceC0151A;
import k.MenuC0168m;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0151A {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // k.InterfaceC0151A
    public final void c(MenuC0168m menuC0168m) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
