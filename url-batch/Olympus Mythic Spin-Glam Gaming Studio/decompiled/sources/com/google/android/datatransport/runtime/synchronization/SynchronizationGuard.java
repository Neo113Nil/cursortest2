package com.google.android.datatransport.runtime.synchronization;

/* loaded from: classes14.dex */
public interface SynchronizationGuard {

    public interface CriticalSection {
        Object execute();
    }

    Object runCriticalSection(CriticalSection criticalSection);
}
