package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k.InterfaceC0141A;
import k.MenuC0158m;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0141A {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // k.InterfaceC0141A
    public final void c(MenuC0158m menuC0158m) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
