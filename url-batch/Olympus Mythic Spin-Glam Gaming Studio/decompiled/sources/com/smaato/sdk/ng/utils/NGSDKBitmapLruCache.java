package com.smaato.sdk.ng.utils;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.LruCache;

/* loaded from: classes13.dex */
public class NGSDKBitmapLruCache {
    private static final LruCache<String, Bitmap> a = new a(Math.min((int) (Runtime.getRuntime().maxMemory() / 1024), 31457280));

    class a extends LruCache<String, Bitmap> {
        a(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        public int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getByteCount() / 1024;
        }
    }

    public static void addBitmapToMemoryCache(String str, Bitmap bitmap) {
        if (TextUtils.isEmpty(str) || bitmap == null) {
            return;
        }
        String valueOf = String.valueOf(str.hashCode());
        if (getBitmapFromMemCache(valueOf) == null) {
            a.put(valueOf, bitmap);
        }
    }

    public static Bitmap getBitmapFromMemCache(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a.get(String.valueOf(str.hashCode()));
    }
}
