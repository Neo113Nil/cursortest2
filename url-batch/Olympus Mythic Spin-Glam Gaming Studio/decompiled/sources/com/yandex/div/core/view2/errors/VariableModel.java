package com.yandex.div.core.view2.errors;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VariableMonitorView.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/core/view2/errors/VariableModel;", "", "name", "", "path", "type", "value", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getPath", "getType", "getValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class VariableModel {

    @NotNull
    private final String name;

    @NotNull
    private final String path;

    @NotNull
    private final String type;

    @NotNull
    private final String value;

    public static /* synthetic */ VariableModel copy$default(VariableModel variableModel, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = variableModel.name;
        }
        if ((i & 2) != 0) {
            str2 = variableModel.path;
        }
        if ((i & 4) != 0) {
            str3 = variableModel.type;
        }
        if ((i & 8) != 0) {
            str4 = variableModel.value;
        }
        return variableModel.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final VariableModel copy(@NotNull String name, @NotNull String path, @NotNull String type, @NotNull String value) {
        return new VariableModel(name, path, type, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VariableModel)) {
            return false;
        }
        VariableModel variableModel = (VariableModel) other;
        return Intrinsics.areEqual(this.name, variableModel.name) && Intrinsics.areEqual(this.path, variableModel.path) && Intrinsics.areEqual(this.type, variableModel.type) && Intrinsics.areEqual(this.value, variableModel.value);
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.path.hashCode()) * 31) + this.type.hashCode()) * 31) + this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return "VariableModel(name=" + this.name + ", path=" + this.path + ", type=" + this.type + ", value=" + this.value + ')';
    }

    public VariableModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.name = str;
        this.path = str2;
        this.type = str3;
        this.value = str4;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
