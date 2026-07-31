package com.mobilefuse.sdk.service.impl.ifv;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppSetIdModel.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/mobilefuse/sdk/service/impl/ifv/AppSetIdModel;", "", "scope", "", "id", "", "(ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getScope", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes6.dex */
public final /* data */ class AppSetIdModel {

    @NotNull
    private final String id;
    private final int scope;

    public static /* synthetic */ AppSetIdModel copy$default(AppSetIdModel appSetIdModel, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = appSetIdModel.scope;
        }
        if ((i2 & 2) != 0) {
            str = appSetIdModel.id;
        }
        return appSetIdModel.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getScope() {
        return this.scope;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final AppSetIdModel copy(int scope, @NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new AppSetIdModel(scope, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppSetIdModel)) {
            return false;
        }
        AppSetIdModel appSetIdModel = (AppSetIdModel) other;
        return this.scope == appSetIdModel.scope && Intrinsics.areEqual(this.id, appSetIdModel.id);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.scope) * 31;
        String str = this.id;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AppSetIdModel(scope=" + this.scope + ", id=" + this.id + ")";
    }

    public AppSetIdModel(int i, @NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.scope = i;
        this.id = id;
    }

    public final int getScope() {
        return this.scope;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }
}
