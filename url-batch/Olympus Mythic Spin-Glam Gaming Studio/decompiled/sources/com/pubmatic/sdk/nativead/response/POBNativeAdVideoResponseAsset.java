package com.pubmatic.sdk.nativead.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/pubmatic/sdk/nativead/response/POBNativeAdVideoResponseAsset;", "Lcom/pubmatic/sdk/nativead/response/POBNativeAdResponseAsset;", "", "assetId", "", "required", "", "vastAdTag", "Lcom/pubmatic/sdk/nativead/response/POBNativeAdLinkResponse;", "link", "<init>", "(IZLjava/lang/String;Lcom/pubmatic/sdk/nativead/response/POBNativeAdLinkResponse;)V", "getVastAdTag", "()Ljava/lang/String;", "toString", "d", "Ljava/lang/String;", "nativead_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class POBNativeAdVideoResponseAsset extends POBNativeAdResponseAsset {

    /* renamed from: d, reason: from kotlin metadata */
    private final String vastAdTag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public POBNativeAdVideoResponseAsset(int i, boolean z, @NotNull String vastAdTag, @Nullable POBNativeAdLinkResponse pOBNativeAdLinkResponse) {
        super(i, z, pOBNativeAdLinkResponse);
        Intrinsics.checkNotNullParameter(vastAdTag, "vastAdTag");
        this.vastAdTag = vastAdTag;
    }

    @NotNull
    public final String getVastAdTag() {
        return this.vastAdTag;
    }

    @Override // com.pubmatic.sdk.nativead.response.POBNativeAdResponseAsset
    @NotNull
    public String toString() {
        return StringsKt.trimIndent("\n     Asset-Id: " + getAssetId() + "\n     Required: " + isRequired() + "\n     Link: " + getLink() + "\n     vastAdTag: " + this.vastAdTag + "\n     ");
    }
}
