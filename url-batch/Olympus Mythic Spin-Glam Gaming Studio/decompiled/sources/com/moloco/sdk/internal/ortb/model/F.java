package com.moloco.sdk.internal.ortb.model;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0081\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/F;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "b", "c", "d", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes15.dex */
public final class F {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final Lazy a;
    public static final F b = new F("Top", 0);
    public static final F c = new F("Center", 1);
    public static final F d = new F("Bottom", 2);
    public static final /* synthetic */ F[] e;
    public static final /* synthetic */ EnumEntries f;

    /* renamed from: com.moloco.sdk.internal.ortb.model.F$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final /* synthetic */ KSerializer a() {
            return (KSerializer) F.a.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        F[] a2 = a();
        e = a2;
        f = EnumEntriesKt.enumEntries(a2);
        INSTANCE = new Companion(null);
        a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.moloco.sdk.internal.ortb.model.F$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                KSerializer createAnnotatedEnumSerializer;
                createAnnotatedEnumSerializer = EnumsKt.createAnnotatedEnumSerializer("com.moloco.sdk.internal.ortb.model.VerticalAlignment", F.values(), new String[]{ViewHierarchyConstants.DIMENSION_TOP_KEY, "center", "bottom"}, new Annotation[][]{null, null, null}, null);
                return createAnnotatedEnumSerializer;
            }
        });
    }

    public F(String str, int i) {
    }

    public static final /* synthetic */ F[] a() {
        return new F[]{b, c, d};
    }

    @NotNull
    public static EnumEntries d() {
        return f;
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) e.clone();
    }
}
