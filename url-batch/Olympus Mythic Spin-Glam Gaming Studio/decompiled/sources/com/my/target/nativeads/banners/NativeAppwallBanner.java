package com.my.target.nativeads.banners;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.models.ImageData;
import com.my.target.md;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes12.dex */
public class NativeAppwallBanner {
    private final ImageData A;
    private final ImageData B;
    private final ImageData C;
    private boolean D;
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final float n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private final ImageData v;
    private final ImageData w;
    private final ImageData x;
    private final ImageData y;
    private final ImageData z;

    private NativeAppwallBanner(md mdVar) {
        this.a = mdVar.x();
        this.b = mdVar.n();
        this.c = mdVar.K();
        this.d = mdVar.Y();
        this.e = mdVar.h0();
        this.f = mdVar.j0();
        this.g = mdVar.F();
        this.i = mdVar.i0();
        this.j = mdVar.Z();
        this.k = mdVar.b0();
        this.l = mdVar.c0();
        this.m = mdVar.Q();
        this.n = mdVar.G();
        this.D = mdVar.n0();
        this.o = mdVar.p0();
        this.p = mdVar.q0();
        this.q = mdVar.o0();
        this.r = mdVar.m0();
        this.s = mdVar.r0();
        this.t = mdVar.s0();
        this.u = mdVar.l0();
        this.v = mdVar.w();
        this.w = mdVar.a0();
        this.x = mdVar.g0();
        this.y = mdVar.e0();
        this.z = mdVar.k0();
        this.A = mdVar.X();
        this.B = mdVar.f0();
        this.C = mdVar.d0();
        this.h = mdVar.g();
    }

    public static NativeAppwallBanner a(md mdVar) {
        return new NativeAppwallBanner(mdVar);
    }

    @Nullable
    public ImageData getBubbleIcon() {
        return this.A;
    }

    @Nullable
    public String getBubbleId() {
        return this.d;
    }

    @Nullable
    public String getBundleId() {
        return this.h;
    }

    public int getCoins() {
        return this.j;
    }

    @Nullable
    public ImageData getCoinsIcon() {
        return this.w;
    }

    public int getCoinsIconBgColor() {
        return this.k;
    }

    public int getCoinsIconTextColor() {
        return this.l;
    }

    @Nullable
    public ImageData getCrossNotifIcon() {
        return this.C;
    }

    @NonNull
    public String getDescription() {
        return this.b;
    }

    @Nullable
    public ImageData getGotoAppIcon() {
        return this.y;
    }

    @Nullable
    public ImageData getIcon() {
        return this.v;
    }

    @NonNull
    public String getId() {
        return this.a;
    }

    @Nullable
    public ImageData getItemHighlightIcon() {
        return this.B;
    }

    @Nullable
    public ImageData getLabelIcon() {
        return this.x;
    }

    @Nullable
    public String getLabelType() {
        return this.e;
    }

    public int getMrgsId() {
        return this.i;
    }

    @Nullable
    public String getPaidType() {
        return this.g;
    }

    public float getRating() {
        return this.n;
    }

    @Nullable
    public String getStatus() {
        return this.f;
    }

    @Nullable
    public ImageData getStatusIcon() {
        return this.z;
    }

    @NonNull
    public String getTitle() {
        return this.c;
    }

    public int getVotes() {
        return this.m;
    }

    public boolean isAppInstalled() {
        return this.u;
    }

    public boolean isBanner() {
        return this.r;
    }

    public boolean isHasNotification() {
        return this.D;
    }

    public boolean isItemHighlight() {
        return this.q;
    }

    public boolean isMain() {
        return this.o;
    }

    public boolean isRequireCategoryHighlight() {
        return this.p;
    }

    public boolean isRequireWifi() {
        return this.s;
    }

    public boolean isSubItem() {
        return this.t;
    }

    public void setHasNotification(boolean z) {
        this.D = z;
    }

    @NonNull
    public String toString() {
        return "NativeAppwallBanner{id='" + this.a + "', description='" + this.b + "', title='" + this.c + "', bubbleId='" + this.d + "', labelType='" + this.e + "', status='" + this.f + "', paidType='" + this.g + "', bundleId='" + this.h + "', mrgsId=" + this.i + ", coins=" + this.j + ", coinsIconBgColor=" + this.k + ", coinsIconTextColor=" + this.l + ", votes=" + this.m + ", rating=" + this.n + ", isMain=" + this.o + ", isRequireCategoryHighlight=" + this.p + ", isItemHighlight=" + this.q + ", isBanner=" + this.r + ", isRequireWifi=" + this.s + ", isSubItem=" + this.t + ", appInstalled=" + this.u + ", icon=" + this.v + ", coinsIcon=" + this.w + ", labelIcon=" + this.x + ", gotoAppIcon=" + this.y + ", statusIcon=" + this.z + ", bubbleIcon=" + this.A + ", itemHighlightIcon=" + this.B + ", crossNotifIcon=" + this.C + ", hasNotification=" + this.D + '}';
    }
}
