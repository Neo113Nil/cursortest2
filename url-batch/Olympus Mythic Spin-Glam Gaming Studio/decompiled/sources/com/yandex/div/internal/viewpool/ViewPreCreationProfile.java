package com.yandex.div.internal.viewpool;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewPreCreationProfile.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002RSB×\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010\u001bBÅ\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007¢\u0006\u0002\u0010\u001cJ\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\t\u0010=\u001a\u00020\u0007HÆ\u0003J\t\u0010>\u001a\u00020\u0007HÆ\u0003J\t\u0010?\u001a\u00020\u0007HÆ\u0003J\t\u0010@\u001a\u00020\u0007HÆ\u0003J\t\u0010A\u001a\u00020\u0007HÆ\u0003J\t\u0010B\u001a\u00020\u0007HÆ\u0003J\t\u0010C\u001a\u00020\u0007HÆ\u0003J\t\u0010D\u001a\u00020\u0007HÆ\u0003JÉ\u0001\u0010E\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0007HÆ\u0001J\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\u0003HÖ\u0001J\t\u0010J\u001a\u00020\u0005HÖ\u0001J!\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QHÇ\u0001R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0011\u0010\u0015\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0011\u0010\u0016\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0011\u0010\u0018\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0011\u0010\u0017\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001e¨\u0006T"}, d2 = {"Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "", "seen1", "", "id", "", "text", "Lcom/yandex/div/internal/viewpool/PreCreationModel;", "image", "gifImage", "overlapContainer", "linearContainer", "wrapContainer", "grid", "gallery", "pager", "tab", "state", "custom", "indicator", "slider", "input", "select", "video", "switch", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;)V", "getCustom", "()Lcom/yandex/div/internal/viewpool/PreCreationModel;", "getGallery", "getGifImage", "getGrid", "getId", "()Ljava/lang/String;", "getImage", "getIndicator", "getInput", "getLinearContainer", "getOverlapContainer", "getPager", "getSelect", "getSlider", "getState", "getSwitch", "getTab", "getText", "getVideo", "getWrapContainer", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
/* loaded from: classes10.dex */
public final /* data */ class ViewPreCreationProfile {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final PreCreationModel custom;

    @NotNull
    private final PreCreationModel gallery;

    @NotNull
    private final PreCreationModel gifImage;

    @NotNull
    private final PreCreationModel grid;

    @Nullable
    private final String id;

    @NotNull
    private final PreCreationModel image;

    @NotNull
    private final PreCreationModel indicator;

    @NotNull
    private final PreCreationModel input;

    @NotNull
    private final PreCreationModel linearContainer;

    @NotNull
    private final PreCreationModel overlapContainer;

    @NotNull
    private final PreCreationModel pager;

    @NotNull
    private final PreCreationModel select;

    @NotNull
    private final PreCreationModel slider;

    @NotNull
    private final PreCreationModel state;

    @NotNull
    private final PreCreationModel switch;

    @NotNull
    private final PreCreationModel tab;

    @NotNull
    private final PreCreationModel text;

    @NotNull
    private final PreCreationModel video;

    @NotNull
    private final PreCreationModel wrapContainer;

    public ViewPreCreationProfile() {
        this((String) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, 524287, (DefaultConstructorMarker) null);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final PreCreationModel getPager() {
        return this.pager;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final PreCreationModel getTab() {
        return this.tab;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final PreCreationModel getState() {
        return this.state;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final PreCreationModel getCustom() {
        return this.custom;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final PreCreationModel getIndicator() {
        return this.indicator;
    }

    @NotNull
    /* renamed from: component15, reason: from getter */
    public final PreCreationModel getSlider() {
        return this.slider;
    }

    @NotNull
    /* renamed from: component16, reason: from getter */
    public final PreCreationModel getInput() {
        return this.input;
    }

    @NotNull
    /* renamed from: component17, reason: from getter */
    public final PreCreationModel getSelect() {
        return this.select;
    }

    @NotNull
    /* renamed from: component18, reason: from getter */
    public final PreCreationModel getVideo() {
        return this.video;
    }

    @NotNull
    /* renamed from: component19, reason: from getter */
    public final PreCreationModel getSwitch() {
        return this.switch;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PreCreationModel getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PreCreationModel getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final PreCreationModel getGifImage() {
        return this.gifImage;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final PreCreationModel getOverlapContainer() {
        return this.overlapContainer;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final PreCreationModel getLinearContainer() {
        return this.linearContainer;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final PreCreationModel getWrapContainer() {
        return this.wrapContainer;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final PreCreationModel getGrid() {
        return this.grid;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final PreCreationModel getGallery() {
        return this.gallery;
    }

    @NotNull
    public final ViewPreCreationProfile copy(@Nullable String id, @NotNull PreCreationModel text, @NotNull PreCreationModel image, @NotNull PreCreationModel gifImage, @NotNull PreCreationModel overlapContainer, @NotNull PreCreationModel linearContainer, @NotNull PreCreationModel wrapContainer, @NotNull PreCreationModel grid, @NotNull PreCreationModel gallery, @NotNull PreCreationModel pager, @NotNull PreCreationModel tab, @NotNull PreCreationModel state, @NotNull PreCreationModel custom, @NotNull PreCreationModel indicator, @NotNull PreCreationModel slider, @NotNull PreCreationModel input, @NotNull PreCreationModel select, @NotNull PreCreationModel video, @NotNull PreCreationModel r40) {
        return new ViewPreCreationProfile(id, text, image, gifImage, overlapContainer, linearContainer, wrapContainer, grid, gallery, pager, tab, state, custom, indicator, slider, input, select, video, r40);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewPreCreationProfile)) {
            return false;
        }
        ViewPreCreationProfile viewPreCreationProfile = (ViewPreCreationProfile) other;
        return Intrinsics.areEqual(this.id, viewPreCreationProfile.id) && Intrinsics.areEqual(this.text, viewPreCreationProfile.text) && Intrinsics.areEqual(this.image, viewPreCreationProfile.image) && Intrinsics.areEqual(this.gifImage, viewPreCreationProfile.gifImage) && Intrinsics.areEqual(this.overlapContainer, viewPreCreationProfile.overlapContainer) && Intrinsics.areEqual(this.linearContainer, viewPreCreationProfile.linearContainer) && Intrinsics.areEqual(this.wrapContainer, viewPreCreationProfile.wrapContainer) && Intrinsics.areEqual(this.grid, viewPreCreationProfile.grid) && Intrinsics.areEqual(this.gallery, viewPreCreationProfile.gallery) && Intrinsics.areEqual(this.pager, viewPreCreationProfile.pager) && Intrinsics.areEqual(this.tab, viewPreCreationProfile.tab) && Intrinsics.areEqual(this.state, viewPreCreationProfile.state) && Intrinsics.areEqual(this.custom, viewPreCreationProfile.custom) && Intrinsics.areEqual(this.indicator, viewPreCreationProfile.indicator) && Intrinsics.areEqual(this.slider, viewPreCreationProfile.slider) && Intrinsics.areEqual(this.input, viewPreCreationProfile.input) && Intrinsics.areEqual(this.select, viewPreCreationProfile.select) && Intrinsics.areEqual(this.video, viewPreCreationProfile.video) && Intrinsics.areEqual(this.switch, viewPreCreationProfile.switch);
    }

    public int hashCode() {
        String str = this.id;
        return ((((((((((((((((((((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.text.hashCode()) * 31) + this.image.hashCode()) * 31) + this.gifImage.hashCode()) * 31) + this.overlapContainer.hashCode()) * 31) + this.linearContainer.hashCode()) * 31) + this.wrapContainer.hashCode()) * 31) + this.grid.hashCode()) * 31) + this.gallery.hashCode()) * 31) + this.pager.hashCode()) * 31) + this.tab.hashCode()) * 31) + this.state.hashCode()) * 31) + this.custom.hashCode()) * 31) + this.indicator.hashCode()) * 31) + this.slider.hashCode()) * 31) + this.input.hashCode()) * 31) + this.select.hashCode()) * 31) + this.video.hashCode()) * 31) + this.switch.hashCode();
    }

    @NotNull
    public String toString() {
        return "ViewPreCreationProfile(id=" + this.id + ", text=" + this.text + ", image=" + this.image + ", gifImage=" + this.gifImage + ", overlapContainer=" + this.overlapContainer + ", linearContainer=" + this.linearContainer + ", wrapContainer=" + this.wrapContainer + ", grid=" + this.grid + ", gallery=" + this.gallery + ", pager=" + this.pager + ", tab=" + this.tab + ", state=" + this.state + ", custom=" + this.custom + ", indicator=" + this.indicator + ", slider=" + this.slider + ", input=" + this.input + ", select=" + this.select + ", video=" + this.video + ", switch=" + this.switch + ')';
    }

    @Deprecated
    public /* synthetic */ ViewPreCreationProfile(int i, String str, PreCreationModel preCreationModel, PreCreationModel preCreationModel2, PreCreationModel preCreationModel3, PreCreationModel preCreationModel4, PreCreationModel preCreationModel5, PreCreationModel preCreationModel6, PreCreationModel preCreationModel7, PreCreationModel preCreationModel8, PreCreationModel preCreationModel9, PreCreationModel preCreationModel10, PreCreationModel preCreationModel11, PreCreationModel preCreationModel12, PreCreationModel preCreationModel13, PreCreationModel preCreationModel14, PreCreationModel preCreationModel15, PreCreationModel preCreationModel16, PreCreationModel preCreationModel17, PreCreationModel preCreationModel18, SerializationConstructorMarker serializationConstructorMarker) {
        this.id = (i & 1) == 0 ? null : str;
        this.text = (i & 2) == 0 ? new PreCreationModel(20, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel;
        this.image = (i & 4) == 0 ? new PreCreationModel(20, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel2;
        this.gifImage = (i & 8) == 0 ? new PreCreationModel(3, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel3;
        this.overlapContainer = (i & 16) == 0 ? new PreCreationModel(8, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel4;
        this.linearContainer = (i & 32) == 0 ? new PreCreationModel(12, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel5;
        this.wrapContainer = (i & 64) == 0 ? new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel6;
        this.grid = (i & 128) == 0 ? new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel7;
        this.gallery = (i & 256) == 0 ? new PreCreationModel(6, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel8;
        this.pager = (i & 512) == 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel9;
        this.tab = (i & 1024) == 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel10;
        this.state = (i & 2048) == 0 ? new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel11;
        this.custom = (i & 4096) == 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel12;
        this.indicator = (i & 8192) == 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel13;
        this.slider = (i & 16384) == 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel14;
        this.input = (32768 & i) == 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel15;
        this.select = (65536 & i) == 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel16;
        this.video = (131072 & i) == 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel17;
        this.switch = (i & 262144) == 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel18;
    }

    public ViewPreCreationProfile(@Nullable String str, @NotNull PreCreationModel preCreationModel, @NotNull PreCreationModel preCreationModel2, @NotNull PreCreationModel preCreationModel3, @NotNull PreCreationModel preCreationModel4, @NotNull PreCreationModel preCreationModel5, @NotNull PreCreationModel preCreationModel6, @NotNull PreCreationModel preCreationModel7, @NotNull PreCreationModel preCreationModel8, @NotNull PreCreationModel preCreationModel9, @NotNull PreCreationModel preCreationModel10, @NotNull PreCreationModel preCreationModel11, @NotNull PreCreationModel preCreationModel12, @NotNull PreCreationModel preCreationModel13, @NotNull PreCreationModel preCreationModel14, @NotNull PreCreationModel preCreationModel15, @NotNull PreCreationModel preCreationModel16, @NotNull PreCreationModel preCreationModel17, @NotNull PreCreationModel preCreationModel18) {
        this.id = str;
        this.text = preCreationModel;
        this.image = preCreationModel2;
        this.gifImage = preCreationModel3;
        this.overlapContainer = preCreationModel4;
        this.linearContainer = preCreationModel5;
        this.wrapContainer = preCreationModel6;
        this.grid = preCreationModel7;
        this.gallery = preCreationModel8;
        this.pager = preCreationModel9;
        this.tab = preCreationModel10;
        this.state = preCreationModel11;
        this.custom = preCreationModel12;
        this.indicator = preCreationModel13;
        this.slider = preCreationModel14;
        this.input = preCreationModel15;
        this.select = preCreationModel16;
        this.video = preCreationModel17;
        this.switch = preCreationModel18;
    }

    public static final /* synthetic */ void write$Self(ViewPreCreationProfile self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.text, new PreCreationModel(20, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 1, PreCreationModel$$serializer.INSTANCE, self.text);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.image, new PreCreationModel(20, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 2, PreCreationModel$$serializer.INSTANCE, self.image);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.gifImage, new PreCreationModel(3, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 3, PreCreationModel$$serializer.INSTANCE, self.gifImage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.areEqual(self.overlapContainer, new PreCreationModel(8, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 4, PreCreationModel$$serializer.INSTANCE, self.overlapContainer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !Intrinsics.areEqual(self.linearContainer, new PreCreationModel(12, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 5, PreCreationModel$$serializer.INSTANCE, self.linearContainer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !Intrinsics.areEqual(self.wrapContainer, new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 6, PreCreationModel$$serializer.INSTANCE, self.wrapContainer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !Intrinsics.areEqual(self.grid, new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 7, PreCreationModel$$serializer.INSTANCE, self.grid);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !Intrinsics.areEqual(self.gallery, new PreCreationModel(6, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 8, PreCreationModel$$serializer.INSTANCE, self.gallery);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !Intrinsics.areEqual(self.pager, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 9, PreCreationModel$$serializer.INSTANCE, self.pager);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || !Intrinsics.areEqual(self.tab, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 10, PreCreationModel$$serializer.INSTANCE, self.tab);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || !Intrinsics.areEqual(self.state, new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 11, PreCreationModel$$serializer.INSTANCE, self.state);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || !Intrinsics.areEqual(self.custom, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 12, PreCreationModel$$serializer.INSTANCE, self.custom);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || !Intrinsics.areEqual(self.indicator, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 13, PreCreationModel$$serializer.INSTANCE, self.indicator);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || !Intrinsics.areEqual(self.slider, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 14, PreCreationModel$$serializer.INSTANCE, self.slider);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || !Intrinsics.areEqual(self.input, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 15, PreCreationModel$$serializer.INSTANCE, self.input);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || !Intrinsics.areEqual(self.select, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 16, PreCreationModel$$serializer.INSTANCE, self.select);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || !Intrinsics.areEqual(self.video, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 17, PreCreationModel$$serializer.INSTANCE, self.video);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 18) && Intrinsics.areEqual(self.switch, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 18, PreCreationModel$$serializer.INSTANCE, self.switch);
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    public /* synthetic */ ViewPreCreationProfile(String str, PreCreationModel preCreationModel, PreCreationModel preCreationModel2, PreCreationModel preCreationModel3, PreCreationModel preCreationModel4, PreCreationModel preCreationModel5, PreCreationModel preCreationModel6, PreCreationModel preCreationModel7, PreCreationModel preCreationModel8, PreCreationModel preCreationModel9, PreCreationModel preCreationModel10, PreCreationModel preCreationModel11, PreCreationModel preCreationModel12, PreCreationModel preCreationModel13, PreCreationModel preCreationModel14, PreCreationModel preCreationModel15, PreCreationModel preCreationModel16, PreCreationModel preCreationModel17, PreCreationModel preCreationModel18, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new PreCreationModel(20, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel, (i & 4) != 0 ? new PreCreationModel(20, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel2, (i & 8) != 0 ? new PreCreationModel(3, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel3, (i & 16) != 0 ? new PreCreationModel(8, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel4, (i & 32) != 0 ? new PreCreationModel(12, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel5, (i & 64) != 0 ? new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel6, (i & 128) != 0 ? new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel7, (i & 256) != 0 ? new PreCreationModel(6, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel8, (i & 512) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel9, (i & 1024) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel10, (i & 2048) != 0 ? new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel11, (i & 4096) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel12, (i & 8192) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel13, (i & 16384) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel14, (i & 32768) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel15, (i & 65536) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel16, (i & 131072) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel17, (i & 262144) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel18);
    }

    @NotNull
    public final PreCreationModel getText() {
        return this.text;
    }

    @NotNull
    public final PreCreationModel getImage() {
        return this.image;
    }

    @NotNull
    public final PreCreationModel getGifImage() {
        return this.gifImage;
    }

    @NotNull
    public final PreCreationModel getOverlapContainer() {
        return this.overlapContainer;
    }

    @NotNull
    public final PreCreationModel getLinearContainer() {
        return this.linearContainer;
    }

    @NotNull
    public final PreCreationModel getWrapContainer() {
        return this.wrapContainer;
    }

    @NotNull
    public final PreCreationModel getGrid() {
        return this.grid;
    }

    @NotNull
    public final PreCreationModel getGallery() {
        return this.gallery;
    }

    @NotNull
    public final PreCreationModel getPager() {
        return this.pager;
    }

    @NotNull
    public final PreCreationModel getTab() {
        return this.tab;
    }

    @NotNull
    public final PreCreationModel getState() {
        return this.state;
    }

    @NotNull
    public final PreCreationModel getCustom() {
        return this.custom;
    }

    @NotNull
    public final PreCreationModel getIndicator() {
        return this.indicator;
    }

    @NotNull
    public final PreCreationModel getSlider() {
        return this.slider;
    }

    @NotNull
    public final PreCreationModel getInput() {
        return this.input;
    }

    @NotNull
    public final PreCreationModel getSelect() {
        return this.select;
    }

    @NotNull
    public final PreCreationModel getVideo() {
        return this.video;
    }

    @NotNull
    public final PreCreationModel getSwitch() {
        return this.switch;
    }

    /* compiled from: ViewPreCreationProfile.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001JÆ\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\n¨\u0006\u001c"}, d2 = {"Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "unconstrained", "id", "", "textCapacity", "", "imageCapacity", "gifImageCapacity", "overlapContainerCapacity", "linearContainerCapacity", "wrapContainerCapacity", "gridCapacity", "galleryCapacity", "pagerCapacity", "tabCapacity", "stateCapacity", "customCapacity", "indicatorCapacity", "sliderCapacity", "inputCapacity", "selectCapacity", "videoCapacity", "switchCapacity", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ViewPreCreationProfile$$serializer.INSTANCE;
        }

        @NotNull
        public final ViewPreCreationProfile unconstrained(@Nullable String id, int textCapacity, int imageCapacity, int gifImageCapacity, int overlapContainerCapacity, int linearContainerCapacity, int wrapContainerCapacity, int gridCapacity, int galleryCapacity, int pagerCapacity, int tabCapacity, int stateCapacity, int customCapacity, int indicatorCapacity, int sliderCapacity, int inputCapacity, int selectCapacity, int videoCapacity, int switchCapacity) {
            return new ViewPreCreationProfile(id, new PreCreationModel(textCapacity, 0, 0, 6, (DefaultConstructorMarker) null), new PreCreationModel(imageCapacity, 0, 0, 6, (DefaultConstructorMarker) null), new PreCreationModel(gifImageCapacity, 0, 0, 6, (DefaultConstructorMarker) null), new PreCreationModel(overlapContainerCapacity, 0, 0, 6, (DefaultConstructorMarker) null), new PreCreationModel(linearContainerCapacity, 0, 0, 6, (DefaultConstructorMarker) null), new PreCreationModel(wrapContainerCapacity, 0, 0, 6, (DefaultConstructorMarker) null), new PreCreationModel(gridCapacity, 0, 0, 6, (DefaultConstructorMarker) null), new PreCreationModel(galleryCapacity, 0, 0, 6, (DefaultConstructorMarker) null), new PreCreationModel(pagerCapacity, 0, 0, 6, (DefaultConstructorMarker) null), new PreCreationModel(tabCapacity, 0, 0, 6, (DefaultConstructorMarker) null), new PreCreationModel(stateCapacity, 0, 0, 6, (DefaultConstructorMarker) null), new PreCreationModel(customCapacity, 0, 0, 6, (DefaultConstructorMarker) null), new PreCreationModel(indicatorCapacity, 0, 0, 6, (DefaultConstructorMarker) null), new PreCreationModel(sliderCapacity, 0, 0, 6, (DefaultConstructorMarker) null), new PreCreationModel(inputCapacity, 0, 0, 6, (DefaultConstructorMarker) null), new PreCreationModel(selectCapacity, 0, 0, 6, (DefaultConstructorMarker) null), new PreCreationModel(videoCapacity, 0, 0, 6, (DefaultConstructorMarker) null), new PreCreationModel(switchCapacity, 0, 0, 6, (DefaultConstructorMarker) null));
        }
    }
}
