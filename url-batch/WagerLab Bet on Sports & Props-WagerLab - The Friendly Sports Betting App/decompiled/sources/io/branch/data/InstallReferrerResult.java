package io.branch.data;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstallReferrerResult.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\\\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018¨\u00061"}, d2 = {"Lio/branch/data/InstallReferrerResult;", "", "appStore", "", "installBeginTimestampSeconds", "", "installReferrer", "referrerClickTimestampSeconds", "installBeginTimestampServerSeconds", "referrerClickTimestampServerSeconds", "isClickThrough", "", "(Ljava/lang/String;JLjava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Z)V", "getAppStore", "()Ljava/lang/String;", "setAppStore", "(Ljava/lang/String;)V", "getInstallBeginTimestampSeconds", "()J", "setInstallBeginTimestampSeconds", "(J)V", "getInstallBeginTimestampServerSeconds", "()Ljava/lang/Long;", "setInstallBeginTimestampServerSeconds", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getInstallReferrer", "setInstallReferrer", "()Z", "setClickThrough", "(Z)V", "getReferrerClickTimestampSeconds", "setReferrerClickTimestampSeconds", "getReferrerClickTimestampServerSeconds", "setReferrerClickTimestampServerSeconds", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;JLjava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Z)Lio/branch/data/InstallReferrerResult;", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Branch-SDK_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class InstallReferrerResult {
    private String appStore;
    private long installBeginTimestampSeconds;
    private Long installBeginTimestampServerSeconds;
    private String installReferrer;
    private boolean isClickThrough;
    private long referrerClickTimestampSeconds;
    private Long referrerClickTimestampServerSeconds;

    public static /* synthetic */ InstallReferrerResult copy$default(InstallReferrerResult installReferrerResult, String str, long j, String str2, long j2, Long l, Long l2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = installReferrerResult.appStore;
        }
        if ((i & 2) != 0) {
            j = installReferrerResult.installBeginTimestampSeconds;
        }
        if ((i & 4) != 0) {
            str2 = installReferrerResult.installReferrer;
        }
        if ((i & 8) != 0) {
            j2 = installReferrerResult.referrerClickTimestampSeconds;
        }
        if ((i & 16) != 0) {
            l = installReferrerResult.installBeginTimestampServerSeconds;
        }
        if ((i & 32) != 0) {
            l2 = installReferrerResult.referrerClickTimestampServerSeconds;
        }
        if ((i & 64) != 0) {
            z = installReferrerResult.isClickThrough;
        }
        boolean z2 = z;
        Long l3 = l;
        String str3 = str2;
        return installReferrerResult.copy(str, j, str3, j2, l3, l2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppStore() {
        return this.appStore;
    }

    /* renamed from: component2, reason: from getter */
    public final long getInstallBeginTimestampSeconds() {
        return this.installBeginTimestampSeconds;
    }

    /* renamed from: component3, reason: from getter */
    public final String getInstallReferrer() {
        return this.installReferrer;
    }

    /* renamed from: component4, reason: from getter */
    public final long getReferrerClickTimestampSeconds() {
        return this.referrerClickTimestampSeconds;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getInstallBeginTimestampServerSeconds() {
        return this.installBeginTimestampServerSeconds;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getReferrerClickTimestampServerSeconds() {
        return this.referrerClickTimestampServerSeconds;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsClickThrough() {
        return this.isClickThrough;
    }

    public final InstallReferrerResult copy(String appStore, long installBeginTimestampSeconds, String installReferrer, long referrerClickTimestampSeconds, Long installBeginTimestampServerSeconds, Long referrerClickTimestampServerSeconds, boolean isClickThrough) {
        return new InstallReferrerResult(appStore, installBeginTimestampSeconds, installReferrer, referrerClickTimestampSeconds, installBeginTimestampServerSeconds, referrerClickTimestampServerSeconds, isClickThrough);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallReferrerResult)) {
            return false;
        }
        InstallReferrerResult installReferrerResult = (InstallReferrerResult) other;
        return Intrinsics.areEqual(this.appStore, installReferrerResult.appStore) && this.installBeginTimestampSeconds == installReferrerResult.installBeginTimestampSeconds && Intrinsics.areEqual(this.installReferrer, installReferrerResult.installReferrer) && this.referrerClickTimestampSeconds == installReferrerResult.referrerClickTimestampSeconds && Intrinsics.areEqual(this.installBeginTimestampServerSeconds, installReferrerResult.installBeginTimestampServerSeconds) && Intrinsics.areEqual(this.referrerClickTimestampServerSeconds, installReferrerResult.referrerClickTimestampServerSeconds) && this.isClickThrough == installReferrerResult.isClickThrough;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.appStore;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.installBeginTimestampSeconds)) * 31;
        String str2 = this.installReferrer;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Long.hashCode(this.referrerClickTimestampSeconds)) * 31;
        Long l = this.installBeginTimestampServerSeconds;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.referrerClickTimestampServerSeconds;
        int hashCode4 = (hashCode3 + (l2 != null ? l2.hashCode() : 0)) * 31;
        boolean z = this.isClickThrough;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "InstallReferrerResult(appStore=" + this.appStore + ", installBeginTimestampSeconds=" + this.installBeginTimestampSeconds + ", installReferrer=" + this.installReferrer + ", referrerClickTimestampSeconds=" + this.referrerClickTimestampSeconds + ", installBeginTimestampServerSeconds=" + this.installBeginTimestampServerSeconds + ", referrerClickTimestampServerSeconds=" + this.referrerClickTimestampServerSeconds + ", isClickThrough=" + this.isClickThrough + ')';
    }

    public InstallReferrerResult(String str, long j, String str2, long j2, Long l, Long l2, boolean z) {
        this.appStore = str;
        this.installBeginTimestampSeconds = j;
        this.installReferrer = str2;
        this.referrerClickTimestampSeconds = j2;
        this.installBeginTimestampServerSeconds = l;
        this.referrerClickTimestampServerSeconds = l2;
        this.isClickThrough = z;
    }

    public /* synthetic */ InstallReferrerResult(String str, long j, String str2, long j2, Long l, Long l2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, j2, l, l2, (i & 64) != 0 ? true : z);
    }

    public final String getAppStore() {
        return this.appStore;
    }

    public final void setAppStore(String str) {
        this.appStore = str;
    }

    public final long getInstallBeginTimestampSeconds() {
        return this.installBeginTimestampSeconds;
    }

    public final void setInstallBeginTimestampSeconds(long j) {
        this.installBeginTimestampSeconds = j;
    }

    public final String getInstallReferrer() {
        return this.installReferrer;
    }

    public final void setInstallReferrer(String str) {
        this.installReferrer = str;
    }

    public final long getReferrerClickTimestampSeconds() {
        return this.referrerClickTimestampSeconds;
    }

    public final void setReferrerClickTimestampSeconds(long j) {
        this.referrerClickTimestampSeconds = j;
    }

    public final Long getInstallBeginTimestampServerSeconds() {
        return this.installBeginTimestampServerSeconds;
    }

    public final void setInstallBeginTimestampServerSeconds(Long l) {
        this.installBeginTimestampServerSeconds = l;
    }

    public final Long getReferrerClickTimestampServerSeconds() {
        return this.referrerClickTimestampServerSeconds;
    }

    public final void setReferrerClickTimestampServerSeconds(Long l) {
        this.referrerClickTimestampServerSeconds = l;
    }

    public final boolean isClickThrough() {
        return this.isClickThrough;
    }

    public final void setClickThrough(boolean z) {
        this.isClickThrough = z;
    }
}
