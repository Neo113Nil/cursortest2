package io.bidmachine.rendering.model;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import io.bidmachine.util.RelativePercent;
import io.bidmachine.util.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b/\u0018\u00002\u00020\u0001:\u0001FB³\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001aJ\u0015\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\u0015\u0010 \u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b \u0010\u001aJ\u0015\u0010!\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b!\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b7\u0010/R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b8\u0010-\u001a\u0004\b9\u0010/R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010#\u001a\u0004\b;\u0010%R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010#\u001a\u0004\b=\u0010%R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010#\u001a\u0004\b?\u0010%R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010#\u001a\u0004\bA\u0010%R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010#\u001a\u0004\bC\u0010%R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010#\u001a\u0004\bE\u0010%¨\u0006G"}, d2 = {"Lio/bidmachine/rendering/model/ElementLayoutParams;", "", "", "width", "height", "widthPercent", "heightPercent", "Lio/bidmachine/rendering/model/SideBindParams;", "leftSideBindParams", "topSideBindParams", "rightSideBindParams", "bottomSideBindParams", "centerXSideBindParams", "centerYSideBindParams", "marginLeft", "marginTop", "marginRight", "marginBottom", "translationX", "translationY", "<init>", "(FFFFLio/bidmachine/rendering/model/SideBindParams;Lio/bidmachine/rendering/model/SideBindParams;Lio/bidmachine/rendering/model/SideBindParams;Lio/bidmachine/rendering/model/SideBindParams;Lio/bidmachine/rendering/model/SideBindParams;Lio/bidmachine/rendering/model/SideBindParams;FFFFFF)V", "Landroid/content/Context;", "context", "", "getWidthPx", "(Landroid/content/Context;)I", "getHeightPx", "getMarginLeftPx", "getMarginTopPx", "getMarginRightPx", "getMarginBottomPx", "getTranslationXPx", "getTranslationYPx", "a", "F", "getWidth", "()F", "b", "getHeight", "c", "getWidthPercent", "d", "getHeightPercent", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lio/bidmachine/rendering/model/SideBindParams;", "getLeftSideBindParams", "()Lio/bidmachine/rendering/model/SideBindParams;", InneractiveMediationDefs.GENDER_FEMALE, "getTopSideBindParams", "g", "getRightSideBindParams", "h", "getBottomSideBindParams", "i", "getCenterXSideBindParams", j.b, "getCenterYSideBindParams", CampaignEx.JSON_KEY_AD_K, "getMarginLeft", "l", "getMarginTop", "m", "getMarginRight", "n", "getMarginBottom", "o", "getTranslationX", "p", "getTranslationY", "Builder", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ElementLayoutParams {

    /* renamed from: a, reason: from kotlin metadata */
    private final float width;

    /* renamed from: b, reason: from kotlin metadata */
    private final float height;

    /* renamed from: c, reason: from kotlin metadata */
    private final float widthPercent;

    /* renamed from: d, reason: from kotlin metadata */
    private final float heightPercent;

    /* renamed from: e, reason: from kotlin metadata */
    private final SideBindParams leftSideBindParams;

    /* renamed from: f, reason: from kotlin metadata */
    private final SideBindParams topSideBindParams;

    /* renamed from: g, reason: from kotlin metadata */
    private final SideBindParams rightSideBindParams;

    /* renamed from: h, reason: from kotlin metadata */
    private final SideBindParams bottomSideBindParams;

    /* renamed from: i, reason: from kotlin metadata */
    private final SideBindParams centerXSideBindParams;

    /* renamed from: j, reason: from kotlin metadata */
    private final SideBindParams centerYSideBindParams;

    /* renamed from: k, reason: from kotlin metadata */
    private final float marginLeft;

    /* renamed from: l, reason: from kotlin metadata */
    private final float marginTop;

    /* renamed from: m, reason: from kotlin metadata */
    private final float marginRight;

    /* renamed from: n, reason: from kotlin metadata */
    private final float marginBottom;

    /* renamed from: o, reason: from kotlin metadata */
    private final float translationX;

    /* renamed from: p, reason: from kotlin metadata */
    private final float translationY;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\u0017\u0010\r\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0007J\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001d\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u0007J\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u0007J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\u0007J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0004¢\u0006\u0004\b%\u0010\u0007J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\u0007J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0004¢\u0006\u0004\b)\u0010\u0007J\r\u0010+\u001a\u00020*¢\u0006\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u001c\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b2\u0010.\u0012\u0004\b3\u0010\u0003R\u001c\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b4\u0010.\u0012\u0004\b5\u0010\u0003R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00107R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00107R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00107R\u0016\u0010>\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010.R\u0016\u0010@\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010.R\u0016\u0010B\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010.R\u0016\u0010D\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010.R\u0016\u0010F\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010.R\u0016\u0010H\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010.¨\u0006I"}, d2 = {"Lio/bidmachine/rendering/model/ElementLayoutParams$Builder;", "", "<init>", "()V", "", "widthDp", "setWidth", "(F)Lio/bidmachine/rendering/model/ElementLayoutParams$Builder;", "heightDp", "setHeight", "widthPercent", "setWidthPercent", "heightPercent", "setHeightPercent", "Lio/bidmachine/rendering/model/SideBindParams;", "leftSideBindParams", "setLeftSideBindParams", "(Lio/bidmachine/rendering/model/SideBindParams;)Lio/bidmachine/rendering/model/ElementLayoutParams$Builder;", "topSideBindParams", "setTopSideBindParams", "rightSideBindParams", "setRightSideBindParams", "bottomSideBindParams", "setBottomSideBindParams", "centerXSideBindParams", "", "setCenterXSideBindParams", "(Lio/bidmachine/rendering/model/SideBindParams;)V", "centerYSideBindParams", "setCenterYSideBindParams", "marginLeftDp", "setMarginLeft", "marginTopDp", "setMarginTop", "marginRightDp", "setMarginRight", "marginBottomDp", "setMarginBottom", "translationXDp", "setTranslationX", "translationYDp", "setTranslationY", "Lio/bidmachine/rendering/model/ElementLayoutParams;", "build", "()Lio/bidmachine/rendering/model/ElementLayoutParams;", "a", "F", "width", "b", "height", "c", "getWidthPercent$annotations", "d", "getHeightPercent$annotations", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lio/bidmachine/rendering/model/SideBindParams;", InneractiveMediationDefs.GENDER_FEMALE, "g", "h", "i", j.b, CampaignEx.JSON_KEY_AD_K, "marginLeft", "l", "marginTop", "m", "marginRight", "n", "marginBottom", "o", "translationX", "p", "translationY", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: from kotlin metadata */
        private float width;

        /* renamed from: b, reason: from kotlin metadata */
        private float height;

        /* renamed from: c, reason: from kotlin metadata */
        private float widthPercent;

        /* renamed from: d, reason: from kotlin metadata */
        private float heightPercent;

        /* renamed from: e, reason: from kotlin metadata */
        private SideBindParams leftSideBindParams;

        /* renamed from: f, reason: from kotlin metadata */
        private SideBindParams topSideBindParams;

        /* renamed from: g, reason: from kotlin metadata */
        private SideBindParams rightSideBindParams;

        /* renamed from: h, reason: from kotlin metadata */
        private SideBindParams bottomSideBindParams;

        /* renamed from: i, reason: from kotlin metadata */
        private SideBindParams centerXSideBindParams;

        /* renamed from: j, reason: from kotlin metadata */
        private SideBindParams centerYSideBindParams;

        /* renamed from: k, reason: from kotlin metadata */
        private float marginLeft;

        /* renamed from: l, reason: from kotlin metadata */
        private float marginTop;

        /* renamed from: m, reason: from kotlin metadata */
        private float marginRight;

        /* renamed from: n, reason: from kotlin metadata */
        private float marginBottom;

        /* renamed from: o, reason: from kotlin metadata */
        private float translationX;

        /* renamed from: p, reason: from kotlin metadata */
        private float translationY;

        @NotNull
        public final ElementLayoutParams build() {
            return new ElementLayoutParams(this.width, this.height, this.widthPercent, this.heightPercent, this.leftSideBindParams, this.topSideBindParams, this.rightSideBindParams, this.bottomSideBindParams, this.centerXSideBindParams, this.centerYSideBindParams, this.marginLeft, this.marginTop, this.marginRight, this.marginBottom, this.translationX, this.translationY);
        }

        @NotNull
        public final Builder setBottomSideBindParams(@Nullable SideBindParams bottomSideBindParams) {
            this.bottomSideBindParams = bottomSideBindParams;
            return this;
        }

        public final void setCenterXSideBindParams(@Nullable SideBindParams centerXSideBindParams) {
            this.centerXSideBindParams = centerXSideBindParams;
        }

        public final void setCenterYSideBindParams(@Nullable SideBindParams centerYSideBindParams) {
            this.centerYSideBindParams = centerYSideBindParams;
        }

        @NotNull
        public final Builder setHeight(float heightDp) {
            this.height = heightDp;
            return this;
        }

        @NotNull
        public final Builder setHeightPercent(@RelativePercent float heightPercent) {
            this.heightPercent = heightPercent;
            return this;
        }

        @NotNull
        public final Builder setLeftSideBindParams(@Nullable SideBindParams leftSideBindParams) {
            this.leftSideBindParams = leftSideBindParams;
            return this;
        }

        @NotNull
        public final Builder setMarginBottom(float marginBottomDp) {
            this.marginBottom = marginBottomDp;
            return this;
        }

        @NotNull
        public final Builder setMarginLeft(float marginLeftDp) {
            this.marginLeft = marginLeftDp;
            return this;
        }

        @NotNull
        public final Builder setMarginRight(float marginRightDp) {
            this.marginRight = marginRightDp;
            return this;
        }

        @NotNull
        public final Builder setMarginTop(float marginTopDp) {
            this.marginTop = marginTopDp;
            return this;
        }

        @NotNull
        public final Builder setRightSideBindParams(@Nullable SideBindParams rightSideBindParams) {
            this.rightSideBindParams = rightSideBindParams;
            return this;
        }

        @NotNull
        public final Builder setTopSideBindParams(@Nullable SideBindParams topSideBindParams) {
            this.topSideBindParams = topSideBindParams;
            return this;
        }

        @NotNull
        public final Builder setTranslationX(float translationXDp) {
            this.translationX = translationXDp;
            return this;
        }

        @NotNull
        public final Builder setTranslationY(float translationYDp) {
            this.translationY = translationYDp;
            return this;
        }

        @NotNull
        public final Builder setWidth(float widthDp) {
            this.width = widthDp;
            return this;
        }

        @NotNull
        public final Builder setWidthPercent(@RelativePercent float widthPercent) {
            this.widthPercent = widthPercent;
            return this;
        }
    }

    public ElementLayoutParams() {
        this(0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 65535, null);
    }

    @Nullable
    public final SideBindParams getBottomSideBindParams() {
        return this.bottomSideBindParams;
    }

    @Nullable
    public final SideBindParams getCenterXSideBindParams() {
        return this.centerXSideBindParams;
    }

    @Nullable
    public final SideBindParams getCenterYSideBindParams() {
        return this.centerYSideBindParams;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getHeightPercent() {
        return this.heightPercent;
    }

    public final int getHeightPx(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.dpToPx(context, this.height);
    }

    @Nullable
    public final SideBindParams getLeftSideBindParams() {
        return this.leftSideBindParams;
    }

    public final float getMarginBottom() {
        return this.marginBottom;
    }

    public final int getMarginBottomPx(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.dpToPx(context, this.marginBottom);
    }

    public final float getMarginLeft() {
        return this.marginLeft;
    }

    public final int getMarginLeftPx(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.dpToPx(context, this.marginLeft);
    }

    public final float getMarginRight() {
        return this.marginRight;
    }

    public final int getMarginRightPx(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.dpToPx(context, this.marginRight);
    }

    public final float getMarginTop() {
        return this.marginTop;
    }

    public final int getMarginTopPx(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.dpToPx(context, this.marginTop);
    }

    @Nullable
    public final SideBindParams getRightSideBindParams() {
        return this.rightSideBindParams;
    }

    @Nullable
    public final SideBindParams getTopSideBindParams() {
        return this.topSideBindParams;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final int getTranslationXPx(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.dpToPx(context, this.translationX);
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final int getTranslationYPx(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.dpToPx(context, this.translationY);
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getWidthPercent() {
        return this.widthPercent;
    }

    public final int getWidthPx(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.dpToPx(context, this.width);
    }

    public ElementLayoutParams(float f, float f2, @RelativePercent float f3, @RelativePercent float f4, @Nullable SideBindParams sideBindParams, @Nullable SideBindParams sideBindParams2, @Nullable SideBindParams sideBindParams3, @Nullable SideBindParams sideBindParams4, @Nullable SideBindParams sideBindParams5, @Nullable SideBindParams sideBindParams6, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.width = f;
        this.height = f2;
        this.widthPercent = f3;
        this.heightPercent = f4;
        this.leftSideBindParams = sideBindParams;
        this.topSideBindParams = sideBindParams2;
        this.rightSideBindParams = sideBindParams3;
        this.bottomSideBindParams = sideBindParams4;
        this.centerXSideBindParams = sideBindParams5;
        this.centerYSideBindParams = sideBindParams6;
        this.marginLeft = f5;
        this.marginTop = f6;
        this.marginRight = f7;
        this.marginBottom = f8;
        this.translationX = f9;
        this.translationY = f10;
    }

    public /* synthetic */ ElementLayoutParams(float f, float f2, float f3, float f4, SideBindParams sideBindParams, SideBindParams sideBindParams2, SideBindParams sideBindParams3, SideBindParams sideBindParams4, SideBindParams sideBindParams5, SideBindParams sideBindParams6, float f5, float f6, float f7, float f8, float f9, float f10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4, (i & 16) != 0 ? null : sideBindParams, (i & 32) != 0 ? null : sideBindParams2, (i & 64) != 0 ? null : sideBindParams3, (i & 128) != 0 ? null : sideBindParams4, (i & 256) != 0 ? null : sideBindParams5, (i & 512) == 0 ? sideBindParams6 : null, (i & 1024) != 0 ? 0.0f : f5, (i & 2048) != 0 ? 0.0f : f6, (i & 4096) != 0 ? 0.0f : f7, (i & 8192) != 0 ? 0.0f : f8, (i & 16384) != 0 ? 0.0f : f9, (i & 32768) != 0 ? 0.0f : f10);
    }
}
