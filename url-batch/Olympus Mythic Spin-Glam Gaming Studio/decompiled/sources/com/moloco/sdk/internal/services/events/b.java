package com.moloco.sdk.internal.services.events;

import com.moloco.sdk.UserIntent;
import com.moloco.sdk.internal.services.E;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public final class b {

    @NotNull
    public static final String a = "CustomUserEventBuilderServiceImpl";

    @NotNull
    public static final String b = "user_ad_interaction_ext";

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.AbstractC1677a.c.EnumC1679a.values().length];
            try {
                iArr[a.AbstractC1677a.c.EnumC1679a.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.AbstractC1677a.c.EnumC1679a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.AbstractC1677a.c.EnumC1679a.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.AbstractC1677a.c.EnumC1679a.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.AbstractC1677a.c.EnumC1679a.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.AbstractC1677a.c.EnumC1679a.f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.AbstractC1677a.c.EnumC1679a.g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.AbstractC1677a.c.EnumC1679a.h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a.AbstractC1677a.c.EnumC1679a.i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            a = iArr;
        }
    }

    @NotNull
    public static final UserIntent.UserAdInteractionExt.Button.Type a(@NotNull a.AbstractC1677a.c.EnumC1679a enumC1679a) {
        Intrinsics.checkNotNullParameter(enumC1679a, "<this>");
        switch (a.a[enumC1679a.ordinal()]) {
            case 1:
                return UserIntent.UserAdInteractionExt.Button.Type.NONE;
            case 2:
                return UserIntent.UserAdInteractionExt.Button.Type.CLOSE;
            case 3:
                return UserIntent.UserAdInteractionExt.Button.Type.SKIP;
            case 4:
                return UserIntent.UserAdInteractionExt.Button.Type.DEC_SKIP;
            case 5:
                return UserIntent.UserAdInteractionExt.Button.Type.MUTE;
            case 6:
                return UserIntent.UserAdInteractionExt.Button.Type.UNMUTE;
            case 7:
                return UserIntent.UserAdInteractionExt.Button.Type.CTA;
            case 8:
                return UserIntent.UserAdInteractionExt.Button.Type.REPLAY;
            case 9:
                return UserIntent.UserAdInteractionExt.Button.Type.AD_BADGE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final UserIntent.UserAdInteractionExt.Position a(@NotNull a.AbstractC1677a.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        UserIntent.UserAdInteractionExt.Position.Builder newBuilder = UserIntent.UserAdInteractionExt.Position.newBuilder();
        newBuilder.setX(fVar.c());
        newBuilder.setY(fVar.d());
        UserIntent.UserAdInteractionExt.Position build = newBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public static final UserIntent.UserAdInteractionExt.Size a(@NotNull a.AbstractC1677a.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        UserIntent.UserAdInteractionExt.Size.Builder newBuilder = UserIntent.UserAdInteractionExt.Size.newBuilder();
        newBuilder.setW(gVar.d());
        newBuilder.setH(gVar.c());
        UserIntent.UserAdInteractionExt.Size build = newBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public static final UserIntent.UserAdInteractionExt.Size a(@NotNull E e) {
        Intrinsics.checkNotNullParameter(e, "<this>");
        UserIntent.UserAdInteractionExt.Size.Builder newBuilder = UserIntent.UserAdInteractionExt.Size.newBuilder();
        newBuilder.setW(e.m());
        newBuilder.setH(e.k());
        UserIntent.UserAdInteractionExt.Size build = newBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
