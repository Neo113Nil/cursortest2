package com.ironsource;

import androidx.annotation.NonNull;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.HashMap;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.rg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C4865rg {
    private final F0 a;

    public C4865rg(F0 f0) {
        this.a = f0;
    }

    public void a(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("reason", str);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        this.a.a(C0.TROUBLESHOOT_NOTIFICATION_ERROR, hashMap);
    }

    public void b(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_LOAD_FAILED, hashMap);
    }

    public void c() {
        this.a.a(C0.TROUBLESHOOT_LOAD_SUCCESS, null);
    }

    public void d() {
        this.a.a(C0.TROUBLESHOOT_SHOW, null);
    }

    public void e() {
        this.a.a(C0.TROUBLESHOOT_SHOW_SUCCESS, null);
    }

    public void f(@NotNull String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_ILLEGAL_STATE, hashMap);
    }

    public void g(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_INTERNAL_ERROR, hashMap);
    }

    public void h(@NotNull String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_LOAD_SKIPPED, hashMap);
    }

    public void i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, hashMap);
    }

    public void j(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, hashMap);
    }

    public void k(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, hashMap);
    }

    public void l(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_CLOSED, hashMap);
    }

    public void m(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, hashMap);
    }

    public void n(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, hashMap);
    }

    public void o(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, hashMap);
    }

    public void p(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, hashMap);
    }

    public void q(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_OPENED, hashMap);
    }

    public void r(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED, hashMap);
    }

    public void s(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS, hashMap);
    }

    public void t(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, hashMap);
    }

    public void u(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_TIMEOUT, hashMap);
    }

    public void v(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_WATERFALL_OVERHEAD, hashMap);
    }

    public void c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_BN_RELOAD_EXCEPTION, hashMap);
    }

    public void d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, hashMap);
    }

    public void e(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, hashMap);
    }

    public void b() {
        this.a.a(C0.TROUBLESHOOT_LOAD, null);
    }

    public void a(Long l) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, l);
        this.a.a(C0.TROUBLESHOOT_LOAD_WHILE_LOADED, hashMap);
    }

    public void b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_IMPRESSION_TIMEOUT, hashMap);
    }

    public void a(LevelPlayAdError levelPlayAdError) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(levelPlayAdError.getErrorCode()));
        hashMap.put("reason", levelPlayAdError.getErrorMessage());
        this.a.a(C0.TROUBLESHOOT_SHOW_FAILED, hashMap);
    }

    public void a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, hashMap);
    }

    public void a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_AD_EXPIRED, hashMap);
    }

    public void a(@NotNull String str, long j) {
        String str2;
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        if (str.isEmpty()) {
            str2 = "";
        } else {
            str2 = "provider=" + str + ";";
        }
        sb.append(str2);
        sb.append("expirationDuration=");
        sb.append(j);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, sb.toString());
        this.a.a(C0.TROUBLESHOOT_AD_EXPIRED, hashMap);
    }

    public void a(boolean z, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, "isAnimated:" + (z ? 1 : 0));
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.a.a(C0.TROUBLESHOOT_BANNER_REFRESH_TRANSITION, hashMap);
    }

    public void a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.a.a(C0.TROUBLESHOOT_BANNER_REFRESH_ANIMATED, hashMap);
    }

    public void a(@NonNull LevelPlayAdInfo levelPlayAdInfo, @NonNull LevelPlayAdInfo levelPlayAdInfo2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "oldAdNetwork=%s;oldInstanceId=%s;oldRevenue=%.3f;oldPrecision=%s;newAdNetwork=%s;newInstanceId=%s;newRevenue=%.3f;newPrecision=%s;delta=%.3f", levelPlayAdInfo.getAdNetwork(), levelPlayAdInfo.getInstanceId(), Double.valueOf(levelPlayAdInfo.getRevenue()), levelPlayAdInfo.getPrecision(), levelPlayAdInfo2.getAdNetwork(), levelPlayAdInfo2.getInstanceId(), Double.valueOf(levelPlayAdInfo2.getRevenue()), levelPlayAdInfo2.getPrecision(), Double.valueOf(levelPlayAdInfo2.getRevenue() - levelPlayAdInfo.getRevenue())));
        this.a.a(C0.TROUBLESHOOT_AD_INFO_CHANGED, hashMap);
    }

    public void a() {
        this.a.a(C0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, null);
    }

    public void a(W8 w8) {
        HashMap hashMap = new HashMap();
        double o = w8.o();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "revenue=%.3f,auctionId=%s", Double.valueOf(o), w8.e()));
        this.a.a(C0.TROUBLESHOOT_ILR_REVENUE, hashMap);
    }

    public void a(Od od) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, od.b());
        this.a.a(C0.TROUBLESHOOT_SHOW_RECOVERY_INITIATED, hashMap);
    }

    public void a(long j, long j2, @NotNull String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "refreshDuration=%d;notVisibleDuration=%d;reason=%s", Long.valueOf(j), Long.valueOf(j2), str));
        this.a.a(C0.TROUBLESHOOT_RELOAD, hashMap);
    }
}
