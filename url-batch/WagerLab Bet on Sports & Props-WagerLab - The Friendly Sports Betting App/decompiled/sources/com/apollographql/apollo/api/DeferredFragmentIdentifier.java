package com.apollographql.apollo.api;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeferredFragmentIdentifier.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/apollographql/apollo/api/DeferredFragmentIdentifier;", "", "path", "", "label", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getPath", "()Ljava/util/List;", "getLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeferredFragmentIdentifier {
    private final String label;
    private final List<Object> path;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeferredFragmentIdentifier copy$default(DeferredFragmentIdentifier deferredFragmentIdentifier, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deferredFragmentIdentifier.path;
        }
        if ((i & 2) != 0) {
            str = deferredFragmentIdentifier.label;
        }
        return deferredFragmentIdentifier.copy(list, str);
    }

    public final List<Object> component1() {
        return this.path;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final DeferredFragmentIdentifier copy(List<? extends Object> path, String label) {
        Intrinsics.checkNotNullParameter(path, "path");
        return new DeferredFragmentIdentifier(path, label);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeferredFragmentIdentifier)) {
            return false;
        }
        DeferredFragmentIdentifier deferredFragmentIdentifier = (DeferredFragmentIdentifier) other;
        return Intrinsics.areEqual(this.path, deferredFragmentIdentifier.path) && Intrinsics.areEqual(this.label, deferredFragmentIdentifier.label);
    }

    public int hashCode() {
        int hashCode = this.path.hashCode() * 31;
        String str = this.label;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DeferredFragmentIdentifier(path=" + this.path + ", label=" + this.label + ')';
    }

    public DeferredFragmentIdentifier(List<? extends Object> path, String str) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.path = path;
        this.label = str;
    }

    public final List<Object> getPath() {
        return this.path;
    }

    public final String getLabel() {
        return this.label;
    }
}
