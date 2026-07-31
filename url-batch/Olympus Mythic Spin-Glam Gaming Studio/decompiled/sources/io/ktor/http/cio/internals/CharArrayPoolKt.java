package io.ktor.http.cio.internals;

import io.ktor.utils.io.pool.DefaultPool;
import io.ktor.utils.io.pool.NoPoolImpl;
import io.ktor.utils.io.pool.ObjectPool;

/* compiled from: CharArrayPool.kt */
/* loaded from: classes14.dex */
public abstract class CharArrayPoolKt {
    private static final ObjectPool CharArrayPool;

    static {
        ObjectPool objectPool;
        if (CharArrayPoolJvmKt.isPoolingDisabled()) {
            objectPool = new NoPoolImpl() { // from class: io.ktor.http.cio.internals.CharArrayPoolKt$CharArrayPool$1
                @Override // io.ktor.utils.io.pool.ObjectPool
                public char[] borrow() {
                    return new char[2048];
                }
            };
        } else {
            objectPool = new DefaultPool() { // from class: io.ktor.http.cio.internals.CharArrayPoolKt$CharArrayPool$2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // io.ktor.utils.io.pool.DefaultPool
                public char[] produceInstance() {
                    return new char[2048];
                }
            };
        }
        CharArrayPool = objectPool;
    }

    public static final ObjectPool getCharArrayPool() {
        return CharArrayPool;
    }
}
