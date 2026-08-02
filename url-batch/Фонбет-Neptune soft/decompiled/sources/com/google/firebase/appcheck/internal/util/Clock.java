package com.google.firebase.appcheck.internal.util;

/* loaded from: classes.dex */
public interface Clock {
    long currentTimeMillis();

    public static class DefaultClock implements Clock {
        @Override // com.google.firebase.appcheck.internal.util.Clock
        public long currentTimeMillis() {
            return System.currentTimeMillis();
        }
    }
}
