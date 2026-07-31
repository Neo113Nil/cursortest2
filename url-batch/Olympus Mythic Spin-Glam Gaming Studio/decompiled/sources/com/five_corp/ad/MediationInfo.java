package com.five_corp.ad;

import com.ironsource.C4901tg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/five_corp/ad/MediationInfo;", "", "", "name", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/five_corp/ad/MediationInfo;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", C4901tg.b, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MediationInfo {

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final String name;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final String version;

    public MediationInfo(@NotNull String name, @NotNull String version) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        this.name = name;
        this.version = version;
    }

    public static /* synthetic */ MediationInfo copy$default(MediationInfo mediationInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediationInfo.name;
        }
        if ((i & 2) != 0) {
            str2 = mediationInfo.version;
        }
        return mediationInfo.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final MediationInfo copy(@NotNull String name, @NotNull String version) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        return new MediationInfo(name, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediationInfo)) {
            return false;
        }
        MediationInfo mediationInfo = (MediationInfo) other;
        return Intrinsics.areEqual(this.name, mediationInfo.name) && Intrinsics.areEqual(this.version, mediationInfo.version);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version.hashCode() + (this.name.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "MediationInfo(name=" + this.name + ", version=" + this.version + ")";
    }
}
