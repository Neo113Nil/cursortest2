package yads;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes5.dex */
public final class qy1 implements ThreadFactory {
    public static final String b = "YandexAds.UrlTracker";
    public static final String c = "YandexAds.BaseController";
    public final String a;

    public qy1(String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.a);
    }
}
