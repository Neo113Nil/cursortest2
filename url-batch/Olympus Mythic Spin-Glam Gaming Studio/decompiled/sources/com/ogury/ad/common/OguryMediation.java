package com.ogury.ad.common;

import com.ironsource.Qf;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/ogury/ad/common/OguryMediation;", "Ljava/io/Serializable;", "", "name", "version", Qf.b, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "a", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OguryMediation implements Serializable {

    @Nullable
    private final String adapterVersion;

    @NotNull
    private final String name;

    @NotNull
    private final String version;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OguryMediation(@NotNull String name, @NotNull String version) {
        this(name, version, null, 4, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
    }

    /* renamed from: a, reason: from getter */
    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: c, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OguryMediation)) {
            return false;
        }
        OguryMediation oguryMediation = (OguryMediation) obj;
        return Intrinsics.areEqual(this.name, oguryMediation.name) && Intrinsics.areEqual(this.version, oguryMediation.version) && Intrinsics.areEqual(this.adapterVersion, oguryMediation.adapterVersion);
    }

    public final int hashCode() {
        int hashCode = (this.version.hashCode() + (this.name.hashCode() * 31)) * 31;
        String str = this.adapterVersion;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OguryMediation(name=" + this.name + ", version=" + this.version + ", adapterVersion=" + this.adapterVersion + ")";
    }

    public OguryMediation(@NotNull String name, @NotNull String version, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        this.name = name;
        this.version = version;
        this.adapterVersion = str;
    }

    public /* synthetic */ OguryMediation(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
