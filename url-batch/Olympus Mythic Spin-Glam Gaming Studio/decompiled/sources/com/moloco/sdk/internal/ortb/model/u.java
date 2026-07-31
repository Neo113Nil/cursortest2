package com.moloco.sdk.internal.ortb.model;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0081\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/u;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "b", "c", "d", EidRequestBuilder.REQUEST_FIELD_EMAIL, InneractiveMediationDefs.GENDER_FEMALE, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final Lazy a;
    public static final u b = new u("Start", 0);
    public static final u c = new u("Center", 1);
    public static final u d = new u("End", 2);
    public static final u e = new u("Left", 3);
    public static final u f = new u("Right", 4);
    public static final /* synthetic */ u[] g;
    public static final /* synthetic */ EnumEntries h;

    /* renamed from: com.moloco.sdk.internal.ortb.model.u$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final /* synthetic */ KSerializer a() {
            return (KSerializer) u.a.getValue();
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
        u[] a2 = a();
        g = a2;
        h = EnumEntriesKt.enumEntries(a2);
        INSTANCE = new Companion(null);
        a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.moloco.sdk.internal.ortb.model.u$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                KSerializer createAnnotatedEnumSerializer;
                createAnnotatedEnumSerializer = EnumsKt.createAnnotatedEnumSerializer("com.moloco.sdk.internal.ortb.model.HorizontalAlignment", u.values(), new String[]{"start", "center", "end", "left", "right"}, new Annotation[][]{null, null, null, null, null}, null);
                return createAnnotatedEnumSerializer;
            }
        });
    }

    public u(String str, int i) {
    }

    public static final /* synthetic */ u[] a() {
        return new u[]{b, c, d, e, f};
    }

    @NotNull
    public static EnumEntries d() {
        return h;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) g.clone();
    }
}
