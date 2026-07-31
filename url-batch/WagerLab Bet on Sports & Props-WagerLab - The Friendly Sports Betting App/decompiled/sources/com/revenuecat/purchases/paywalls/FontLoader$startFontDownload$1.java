package com.revenuecat.purchases.paywalls;

import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo;
import java.io.File;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FontLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.revenuecat.purchases.paywalls.FontLoader$startFontDownload$1", f = "FontLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class FontLoader$startFontDownload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $expectedMd5;
    final /* synthetic */ DownloadableFontInfo $fontInfo;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ FontLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FontLoader$startFontDownload$1(FontLoader fontLoader, String str, String str2, DownloadableFontInfo downloadableFontInfo, Continuation<? super FontLoader$startFontDownload$1> continuation) {
        super(2, continuation);
        this.this$0 = fontLoader;
        this.$url = str;
        this.$expectedMd5 = str2;
        this.$fontInfo = downloadableFontInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FontLoader$startFontDownload$1(this.this$0, this.$url, this.$expectedMd5, this.$fontInfo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FontLoader$startFontDownload$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        File cacheDirectory;
        boolean ensureFoldersExist;
        String md5Hex;
        Object obj2;
        Map map;
        Map map2;
        Object obj3;
        Map map3;
        Object obj4;
        Map map4;
        Object m10618performDownloadAndCacheyxL6bBk;
        FontLoader fontLoader;
        Map map5;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        cacheDirectory = this.this$0.getCacheDirectory();
        if (cacheDirectory == null) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Cannot download font: cache directory is not available", null);
            return Unit.INSTANCE;
        }
        ensureFoldersExist = this.this$0.ensureFoldersExist(cacheDirectory);
        if (!ensureFoldersExist) {
            return Unit.INSTANCE;
        }
        FontLoader fontLoader2 = this.this$0;
        byte[] bytes = this.$url.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        md5Hex = fontLoader2.md5Hex(bytes);
        String substringAfterLast = StringsKt.substringAfterLast(this.$url, '.', "");
        File file = new File(cacheDirectory, md5Hex + '.' + substringAfterLast);
        obj2 = this.this$0.lock;
        FontLoader fontLoader3 = this.this$0;
        DownloadableFontInfo downloadableFontInfo = this.$fontInfo;
        String str = this.$url;
        synchronized (obj2) {
            map = fontLoader3.fontInfosForHash;
            Set set = (Set) map.get(md5Hex);
            if (set != null) {
                LogLevel logLevel = LogLevel.VERBOSE;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v("[Purchases] - " + logLevel.name(), "Font download already in progress for " + str);
                }
                set.add(downloadableFontInfo);
                return Unit.INSTANCE;
            }
            map2 = fontLoader3.fontInfosForHash;
            map2.put(md5Hex, SetsKt.mutableSetOf(downloadableFontInfo));
            Unit unit = Unit.INSTANCE;
            if (file.exists()) {
                this.this$0.addFileToCache(md5Hex, file);
                return Unit.INSTANCE;
            }
            try {
                m10618performDownloadAndCacheyxL6bBk = this.this$0.m10618performDownloadAndCacheyxL6bBk(this.$url, this.$expectedMd5, md5Hex, substringAfterLast, cacheDirectory);
                FontLoader fontLoader4 = this.this$0;
                if (Result.m12370isSuccessimpl(m10618performDownloadAndCacheyxL6bBk)) {
                    fontLoader4.addFileToCache(md5Hex, (File) m10618performDownloadAndCacheyxL6bBk);
                }
                DownloadableFontInfo downloadableFontInfo2 = this.$fontInfo;
                if (Result.m12366exceptionOrNullimpl(m10618performDownloadAndCacheyxL6bBk) != null) {
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to download font for " + downloadableFontInfo2.getFamily(), null);
                }
                obj4 = this.this$0.lock;
                fontLoader = this.this$0;
            } catch (Throwable th) {
                try {
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error downloading remote font from " + this.$url, th);
                    obj4 = this.this$0.lock;
                    FontLoader fontLoader5 = this.this$0;
                    synchronized (obj4) {
                        map4 = fontLoader5.fontInfosForHash;
                    }
                } catch (Throwable th2) {
                    obj3 = this.this$0.lock;
                    FontLoader fontLoader6 = this.this$0;
                    synchronized (obj3) {
                        map3 = fontLoader6.fontInfosForHash;
                        throw th2;
                    }
                }
            }
            synchronized (obj4) {
                map5 = fontLoader.fontInfosForHash;
                return Unit.INSTANCE;
            }
        }
    }
}
