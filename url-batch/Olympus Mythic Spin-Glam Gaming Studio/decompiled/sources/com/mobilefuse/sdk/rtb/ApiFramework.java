package com.mobilefuse.sdk.rtb;

import kotlin.Metadata;

/* compiled from: ApiFramework.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/mobilefuse/sdk/rtb/ApiFramework;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "VPAID1", "VPAID2", "MRAID1", "ORMMA", "MRAID2", "MRAID3", "OMID1", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes3.dex */
public enum ApiFramework {
    VPAID1(1),
    VPAID2(2),
    MRAID1(3),
    ORMMA(4),
    MRAID2(5),
    MRAID3(6),
    OMID1(7);

    private final int value;

    ApiFramework(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
