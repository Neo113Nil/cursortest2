package io.ably.lib.types;

/* loaded from: classes7.dex */
public interface Callback<T> {
    void onError(ErrorInfo errorInfo);

    void onSuccess(T t);

    public static abstract class Map<T, U> implements Callback<T> {
        private final Callback<U> callback;

        public abstract U map(T t);

        public Map(Callback<U> callback) {
            this.callback = callback;
        }

        @Override // io.ably.lib.types.Callback
        public void onSuccess(T t) {
            this.callback.onSuccess(map(t));
        }

        @Override // io.ably.lib.types.Callback
        public void onError(ErrorInfo errorInfo) {
            this.callback.onError(errorInfo);
        }
    }
}
