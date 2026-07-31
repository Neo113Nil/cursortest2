package io.intercom.android.sdk.utilities.commons;

/* loaded from: classes8.dex */
public interface TimeProvider {
    public static final TimeProvider SYSTEM = new TimeProvider() { // from class: io.intercom.android.sdk.utilities.commons.TimeProvider$$ExternalSyntheticLambda0
        @Override // io.intercom.android.sdk.utilities.commons.TimeProvider
        public final long currentTimeMillis() {
            long currentTimeMillis;
            currentTimeMillis = System.currentTimeMillis();
            return currentTimeMillis;
        }
    };

    long currentTimeMillis();
}
