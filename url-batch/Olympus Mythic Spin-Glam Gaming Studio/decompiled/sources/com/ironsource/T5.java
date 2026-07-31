package com.ironsource;

import androidx.lifecycle.ProcessLifecycleOwner;

/* loaded from: classes10.dex */
public final class T5 implements F7 {
    @Override // com.ironsource.F7
    public boolean a() {
        try {
            ProcessLifecycleOwner.INSTANCE.get();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
