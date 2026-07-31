package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* renamed from: com.inmobi.media.o3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class HandlerC4224o3 extends Handler {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC4224o3(Looper looper) {
        super(looper);
        Intrinsics.checkNotNullParameter(looper, "looper");
    }

    public final void a(Z2 z2) {
        E3 e3 = E3.a;
        Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
        String str = z2.b;
        b(z2);
        E3.a(z2, "RETRY_EXHAUSTED");
        BuildersKt__BuildersKt.runBlocking$default(null, new C4170m3(z2, null), 1, null);
        E3.f.remove(z2);
        if (E3.f.isEmpty()) {
            BuildersKt__BuildersKt.runBlocking$default(null, new C4197n3(this, null), 1, null);
        }
    }

    public final void b(Z2 z2) {
        int indexOf = CollectionsKt.indexOf(E3.f, (Object) z2);
        if (-1 != indexOf) {
            Z2 z22 = (Z2) E3.f.get(indexOf == E3.f.size() + (-1) ? 0 : indexOf + 1);
            Message obtain = Message.obtain();
            obtain.what = z22.e ? 3 : 2;
            obtain.obj = z22;
            long pingInterval = E3.c().getPingInterval() * 1000;
            if (System.currentTimeMillis() - z22.g < pingInterval) {
                sendMessageDelayed(obtain, pingInterval);
            } else {
                sendMessage(obtain);
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (E3.h.get()) {
            try {
                int i = msg.what;
                int i2 = 3;
                if (i == 1) {
                    if (E3.e()) {
                        AdConfig.ImaiConfig c = E3.c();
                        C3932d3 c3932d3 = (C3932d3) E3.b.getValue();
                        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new C4040h3(c3932d3, c, null), 1, null);
                        List list = (List) runBlocking$default;
                        E3.f = list;
                        if (list.isEmpty()) {
                            BuildersKt__BuildersKt.runBlocking$default(null, new C4066i3(c3932d3, this, c, null), 1, null);
                            return;
                        }
                        Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
                        for (Z2 z2 : E3.f) {
                            E3 e3 = E3.a;
                            Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
                            String str = z2.b;
                        }
                        Z2 z22 = (Z2) E3.f.get(0);
                        Message obtain = Message.obtain();
                        if (!z22.e) {
                            i2 = 2;
                        }
                        obtain.what = i2;
                        obtain.obj = z22;
                        long currentTimeMillis = System.currentTimeMillis() - z22.g;
                        if (currentTimeMillis < c.getPingInterval() * 1000) {
                            sendMessageDelayed(obtain, (c.getPingInterval() * 1000) - currentTimeMillis);
                            return;
                        } else {
                            sendMessage(obtain);
                            return;
                        }
                    }
                    return;
                }
                if (i == 2) {
                    if (AbstractC3998ff.a() != null) {
                        E3.g.set(false);
                        E3.g();
                        return;
                    }
                    Object obj = msg.obj;
                    AdConfig.ImaiConfig c2 = E3.c();
                    if (!(obj instanceof Z2)) {
                        Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
                        return;
                    }
                    if (((Z2) obj).f != 0) {
                        Z2 z23 = (Z2) obj;
                        long pingCacheExpiry = c2.getPingCacheExpiry();
                        z23.getClass();
                        if (System.currentTimeMillis() - z23.h <= pingCacheExpiry * 1000) {
                            if ((c2.getMaxRetries() - ((Z2) obj).f) + 1 == 0) {
                                Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
                                String str2 = ((Z2) obj).b;
                            } else {
                                Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
                                String str3 = ((Z2) obj).b;
                            }
                            BuildersKt__BuildersKt.runBlocking$default(null, new C4092j3((Z2) obj, this, null), 1, null);
                            return;
                        }
                    }
                    a((Z2) obj);
                    return;
                }
                if (i != 3) {
                    if (i != 4) {
                        Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
                        Unit unit = Unit.INSTANCE;
                        return;
                    }
                    Object obj2 = msg.obj;
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.inmobi.ads.core.Click");
                    Z2 click = (Z2) obj2;
                    Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
                    String str4 = click.b;
                    LinkedHashMap linkedHashMap = E3.j;
                    C3851a0 c3851a0 = (C3851a0) linkedHashMap.get(Integer.valueOf(click.a));
                    if (c3851a0 != null) {
                        Intrinsics.checkNotNullParameter(click, "click");
                        c3851a0.a.a(c3851a0.b);
                    }
                    linkedHashMap.remove(Integer.valueOf(click.a));
                    BuildersKt__BuildersKt.runBlocking$default(null, new C4144l3(click, this, null), 1, null);
                    return;
                }
                if (AbstractC3998ff.a() != null) {
                    E3.g.set(false);
                    E3.g();
                    return;
                }
                Object obj3 = msg.obj;
                AdConfig.ImaiConfig c3 = E3.c();
                if (!(obj3 instanceof Z2)) {
                    Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
                    return;
                }
                if (((Z2) obj3).f != 0) {
                    Z2 z24 = (Z2) obj3;
                    long pingCacheExpiry2 = c3.getPingCacheExpiry();
                    z24.getClass();
                    if (System.currentTimeMillis() - z24.h <= pingCacheExpiry2 * 1000) {
                        if ((c3.getMaxRetries() - ((Z2) obj3).f) + 1 == 0) {
                            Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
                            String str5 = ((Z2) obj3).b;
                        } else {
                            Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
                            String str6 = ((Z2) obj3).b;
                        }
                        new C4276q3(new C4118k3(this)).a((Z2) obj3);
                        Unit unit2 = Unit.INSTANCE;
                        return;
                    }
                }
                a((Z2) obj3);
            } catch (Exception e) {
                E3 e32 = E3.a;
                Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
                e.getMessage();
            }
        }
    }
}
