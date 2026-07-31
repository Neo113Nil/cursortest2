package com.five_corp.ad.internal.system;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class b implements DefaultLifecycleObserver {
    public boolean b = false;
    public final com.five_corp.ad.internal.util.d a = new com.five_corp.ad.internal.util.d();

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onCreate(@NotNull LifecycleOwner lifecycleOwner) {
        super.onCreate(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        super.onDestroy(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        this.b = false;
        com.five_corp.ad.internal.util.d dVar = this.a;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        dVar.a(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.five_corp.ad.internal.h hVar = (com.five_corp.ad.internal.h) it.next();
            boolean z = hVar.b && hVar.c;
            if (hVar.c) {
                hVar.c = false;
                if (z) {
                    hVar.a.l();
                }
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        this.b = true;
        com.five_corp.ad.internal.util.d dVar = this.a;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        dVar.a(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.five_corp.ad.internal.h hVar = (com.five_corp.ad.internal.h) it.next();
            if (!hVar.c) {
                hVar.c = true;
                if (hVar.b) {
                    hVar.a.k();
                }
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onStart(@NotNull LifecycleOwner lifecycleOwner) {
        super.onStart(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onStop(@NotNull LifecycleOwner lifecycleOwner) {
        super.onStop(lifecycleOwner);
    }
}
