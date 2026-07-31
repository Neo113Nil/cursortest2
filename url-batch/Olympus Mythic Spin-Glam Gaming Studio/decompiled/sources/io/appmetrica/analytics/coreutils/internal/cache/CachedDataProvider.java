package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes14.dex */
public interface CachedDataProvider {

    public static class CachedData<T> {
        private final String b;
        private volatile long c;
        private volatile long d;
        private long e = 0;
        private Object f = null;
        private final SystemTimeProvider a = new SystemTimeProvider();

        public CachedData(long j, long j2, @NonNull String str) {
            this.b = String.format("[CachedData-%s]", str);
            this.c = j;
            this.d = j2;
        }

        @Nullable
        public T getData() {
            return (T) this.f;
        }

        @VisibleForTesting
        public long getExpiryTime() {
            return this.d;
        }

        @VisibleForTesting
        public long getRefreshTime() {
            return this.c;
        }

        public final boolean isEmpty() {
            return this.f == null;
        }

        public void setData(@Nullable T t) {
            this.f = t;
            this.e = this.a.currentTimeMillis();
        }

        public void setExpirationPolicy(long j, long j2) {
            this.c = j;
            this.d = j2;
        }

        public final boolean shouldClearData() {
            if (this.e == 0) {
                return false;
            }
            long currentTimeMillis = this.a.currentTimeMillis() - this.e;
            return currentTimeMillis > this.d || currentTimeMillis < 0;
        }

        public final boolean shouldUpdateData() {
            long currentTimeMillis = this.a.currentTimeMillis() - this.e;
            return currentTimeMillis > this.c || currentTimeMillis < 0;
        }

        @NonNull
        public String toString() {
            return "CachedData{tag='" + this.b + "', refreshTime=" + this.c + ", expiryTime=" + this.d + ", mCachedTime=" + this.e + ", mCachedData=" + this.f + '}';
        }
    }
}
