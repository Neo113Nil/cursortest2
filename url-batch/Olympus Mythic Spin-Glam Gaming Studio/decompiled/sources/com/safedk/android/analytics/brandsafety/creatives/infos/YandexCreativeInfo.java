package com.safedk.android.analytics.brandsafety.creatives.infos;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;
import java.util.HashSet;
import java.util.Set;

@AdNetworkIdentifier(packageName = h.y)
/* loaded from: classes10.dex */
public class YandexCreativeInfo extends CreativeInfo {
    private static final long serialVersionUID = 0;
    private final Set<String> E;
    private final Set<String> Y;
    private String Z;
    private final Set<String> a;

    public YandexCreativeInfo() {
        this.a = new HashSet();
        this.E = new HashSet();
        this.Y = new HashSet();
        this.Z = null;
    }

    public YandexCreativeInfo(BrandSafetyUtils.AdType adType, String id, String creativeId, String clickUrl, String placementId, String packageName, String sdkVersion, String downstreamStruct) {
        super(adType == null ? BrandSafetyUtils.AdType.INTERSTITIAL : adType, h.y, id, creativeId, clickUrl, null, downstreamStruct, sdkVersion);
        this.a = new HashSet();
        this.E = new HashSet();
        this.Y = new HashSet();
        this.Z = null;
        this.M = packageName;
        j(placementId);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean v(String str) {
        return super.v(str);
    }

    public Set<String> as() {
        return this.a;
    }

    public void a(String str) {
        this.a.add(str);
    }

    public Set<String> at() {
        return this.E;
    }

    public void J(String str) {
        this.E.add(str);
    }

    public void K(String str) {
        this.Y.add(str);
    }

    public Set<String> au() {
        return this.Y;
    }

    public String av() {
        return this.Z;
    }

    public void L(String str) {
        this.Z = str;
    }
}
