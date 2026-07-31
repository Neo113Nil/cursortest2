package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class Bo {
    public P5 a;
    public final Ao b;

    public Bo(final Context context, final AdConfig.WebAssetCacheConfig webAssetCacheConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webAssetCacheConfig, "webAssetCacheConfig");
        this.b = new Ao();
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Bo$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Bo.a(AdConfig.WebAssetCacheConfig.this, this, context);
            }
        };
        Context context2 = AbstractC4002fj.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC4002fj.g.submit(runnable);
    }

    public final InputStream a(String url, InterfaceC4466x9 interfaceC4466x9) {
        O5 b;
        Intrinsics.checkNotNullParameter(url, "url");
        P5 p5 = this.a;
        if (p5 == null) {
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).a("WebAssetLRUCacheHelper", "Disk Cache Failed to Initialize. Failed readFromCache: " + url);
            }
            return null;
        }
        try {
            b = p5.b(String.valueOf(url.hashCode()));
        } catch (Exception e) {
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).a("WebAssetLRUCacheHelper", "Failed to read from cache with: " + e.getMessage() + " for " + url);
            }
        }
        if (b != null && Intrinsics.areEqual(url, Al.a(new InputStreamReader(b.a[0], Al.b)))) {
            return b.a[1];
        }
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("WebAssetLRUCacheHelper", "did not find any valid cache entry for " + url);
        }
        return null;
    }

    public final boolean a(String url, String data, InterfaceC4466x9 interfaceC4466x9) {
        OutputStreamWriter outputStreamWriter;
        L5 a;
        OutputStreamWriter outputStreamWriter2;
        Charset charset;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.a == null) {
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).a("WebAssetLRUCacheHelper", "Disk Cache Failed to Initialize. Failed writeToCache: " + url);
            }
            return false;
        }
        try {
            String valueOf = String.valueOf(url.hashCode());
            P5 p5 = this.a;
            outputStreamWriter = null;
            if (p5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                p5 = null;
            }
            a = p5.a(valueOf);
        } catch (Exception e) {
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: " + e.getMessage() + " for " + url);
            }
        }
        if (a == null) {
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: diskLruCache.editor is null for " + url);
            }
            return false;
        }
        try {
            OutputStream a2 = a.a(0);
            charset = Al.b;
            outputStreamWriter2 = new OutputStreamWriter(a2, charset);
        } catch (Throwable th) {
            th = th;
        }
        try {
            outputStreamWriter2.write(url);
            Al.a(outputStreamWriter2);
            try {
                OutputStreamWriter outputStreamWriter3 = new OutputStreamWriter(a.a(1), charset);
                try {
                    outputStreamWriter3.write(data);
                    Al.a(outputStreamWriter3);
                    if (a.c) {
                        a.d.a(a, false);
                        a.d.d(a.a.a);
                    } else {
                        a.d.a(a, true);
                    }
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                    outputStreamWriter = outputStreamWriter3;
                    Al.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStreamWriter = outputStreamWriter2;
            Al.a(outputStreamWriter);
            throw th;
        }
    }

    public static final void a(AdConfig.WebAssetCacheConfig webAssetCacheConfig, Bo bo, Context context) {
        try {
            F5.a.getClass();
            long j = F5.c;
            if (j < webAssetCacheConfig.getMinAvailableDiskSpace()) {
                bo.getClass();
                a(context, j);
                ConcurrentHashMap concurrentHashMap = Qa.b;
                Qa.a(Pa.a(context, "web_asset_file_key"), "cache_enabled", false);
                return;
            }
            bo.a(context, webAssetCacheConfig, j);
            ConcurrentHashMap concurrentHashMap2 = Qa.b;
            Qa.a(Pa.a(context, "web_asset_file_key"), "cache_enabled", true);
        } catch (Exception e) {
            Lazy lazy = AbstractC3861aa.a;
            AbstractC3861aa.a(new Q2(e));
            e.getMessage();
        }
    }

    public final void a(Context context, AdConfig.WebAssetCacheConfig webAssetCacheConfig, long j) {
        File file = new File(context.getFilesDir(), "inmobiwebassetcache");
        Intrinsics.checkNotNullParameter(webAssetCacheConfig, "webAssetCacheConfig");
        long min = (j == -1 ? 0 : Math.min(webAssetCacheConfig.getCacheSize(), (int) ((j * webAssetCacheConfig.getCacheSizeToDiskSpaceMaxPercent()) / 100))) * 1024 * 1024;
        Ao ao = this.b;
        Pattern pattern = P5.p;
        if (min > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else if (!file2.renameTo(file3)) {
                    throw new IOException();
                }
            }
            P5 p5 = new P5(file, min, ao);
            if (p5.c.exists()) {
                try {
                    p5.b();
                    p5.a();
                    p5.l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(p5.c, true), Al.a));
                } catch (IOException e) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    p5.close();
                    Al.a(p5.b);
                }
                this.a = p5;
                return;
            }
            file.mkdirs();
            p5 = new P5(file, min, ao);
            p5.c();
            this.a = p5;
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void a(Context context, long j) {
        Pair pair = TuplesKt.to("size", Long.valueOf(j));
        ConcurrentHashMap concurrentHashMap = Qa.b;
        Qa a = Pa.a(context, "web_asset_file_key");
        Intrinsics.checkNotNullParameter("cache_enabled", "key");
        Map mutableMapOf = MapsKt.mutableMapOf(pair, TuplesKt.to("state", Boolean.valueOf(a.a.getBoolean("cache_enabled", false))));
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b("LowAvailableSpaceForCache", mutableMapOf, EnumC4530zk.a);
    }
}
