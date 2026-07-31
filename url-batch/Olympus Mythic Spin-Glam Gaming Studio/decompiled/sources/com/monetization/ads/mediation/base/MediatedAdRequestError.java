package com.monetization.ads.mediation.base;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/monetization/ads/mediation/base/MediatedAdRequestError;", "", "", "code", "", "description", "<init>", "(ILjava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "I", "getCode", "b", "Ljava/lang/String;", "getDescription", "Code", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MediatedAdRequestError {

    /* renamed from: a, reason: from kotlin metadata */
    private final int code;

    /* renamed from: b, reason: from kotlin metadata */
    private final String description;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/monetization/ads/mediation/base/MediatedAdRequestError$Code;", "", "", "UNKNOWN_ERROR", "I", "INTERNAL_ERROR", "INVALID_REQUEST", "NETWORK_ERROR", "NO_FILL", "SYSTEM_ERROR", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Code {

        @NotNull
        public static final Code INSTANCE = new Code();
        public static final int INTERNAL_ERROR = 1;
        public static final int INVALID_REQUEST = 2;
        public static final int NETWORK_ERROR = 3;
        public static final int NO_FILL = 4;
        public static final int SYSTEM_ERROR = 5;
        public static final int UNKNOWN_ERROR = 0;

        private Code() {
        }
    }

    public MediatedAdRequestError(int i, @NotNull String str) {
        this.code = i;
        this.description = str;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(MediatedAdRequestError.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.monetization.ads.mediation.base.MediatedAdRequestError");
        MediatedAdRequestError mediatedAdRequestError = (MediatedAdRequestError) other;
        if (this.code != mediatedAdRequestError.code) {
            return false;
        }
        return Intrinsics.areEqual(this.description, mediatedAdRequestError.description);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        return this.description.hashCode() + (this.code * 31);
    }

    @NotNull
    public String toString() {
        return "AdRequestError (code: " + this.code + ", description: " + this.description + ")";
    }
}
